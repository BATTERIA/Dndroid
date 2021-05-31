package com.bilibili.bililive.batteria.util;

/*
 * Copyright (c) 2016. Bilibili Inc.
 */
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.concurrent.FutureTask;

/**
 * Created by zhangjun on 15/7/16.
 */
public class HandlerThreads {
    @IntDef({THREAD_UI, THREAD_REPORT, THREAD_BACKGROUND, THREAD_BACK_IO})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ThreadModel {
    }

    public static final int THREAD_UI = 0;
    /** 专用于各种上报 */
    public static final int THREAD_REPORT = 1;
    /** 后台各种任务分片 */
    public static final int THREAD_BACKGROUND = 2;
    /** 异步文件io */
    public static final int THREAD_BACK_IO = 3;

    public static final int THREAD_SIZE = 4;
    /** 线程信息数组 */
    private static final Handler[] INTERNAL_HANDLER_LIST = new Handler[THREAD_SIZE];
    private static final String[] INTERNAL_THREAD_NAME_LIST = {
            "thread_ui",
            "thread_report",
            "thread_background",
            "thread_back_io",
    };
    private static final Object LOCK = new Object();
    private static final HashMap<String, Handler> HANDLER_MAP = new HashMap<>(4); // guardby LOCK
    /**
     * 派发任务
     * @param index 线程索引
     * @param r Runnable
     */
    public static void post(@ThreadModel int index, Runnable r) {
        Handler handler = getHandler(index);
        handler.post(r);
    }

    public static void postDelayed(@ThreadModel int index, Runnable r, long delayMillis) {
        Handler handler = getHandler(index);
        handler.postDelayed(r, delayMillis);
    }

    public static void postAtFront(@ThreadModel int index, Runnable r) {
        Handler handler = getHandler(index);
        handler.postAtFrontOfQueue(r);
    }

    /**
     * 获取线程Handler
     * @param index 线程索引
     * @return 线程的Handler
     */
    public static Handler getHandler(@ThreadModel int index) {
        if (INTERNAL_HANDLER_LIST[index] == null) {
            synchronized (INTERNAL_HANDLER_LIST) {
                Handler handler;
                if (index == THREAD_UI) {
                    handler = new Handler(Looper.getMainLooper());
                } else {
                    HandlerThread thread = new HandlerThread(INTERNAL_THREAD_NAME_LIST[index],
                            Process.THREAD_PRIORITY_DEFAULT + Process.THREAD_PRIORITY_LESS_FAVORABLE);
                    thread.start();
                    handler = new Handler(thread.getLooper());
                }
                INTERNAL_HANDLER_LIST[index] = handler;
            }
        }
        return INTERNAL_HANDLER_LIST[index];
    }

    public static Looper getLooper(@ThreadModel int index) {
        return getHandler(index).getLooper();
    }

    /**
     * @return true if the current thread is the specified handler thread.
     */
    public static boolean runningOn(@ThreadModel int index) {
        return getHandler(index).getLooper() == Looper.myLooper();
    }

    /**
     * Run the supplied Runnable on the thread. The method will block until the Runnable
     * completes.
     *
     * @param r The Runnable to run.
     */
    public static void runOnBlocking(@ThreadModel int index, final Runnable r) {
        if (runningOn(index)) {
            r.run();
        } else {
            FutureTask<Void> task = new FutureTask<Void>(r, null);
            post(index, task);
            try {
                task.get();
            } catch (Exception e) {
                throw new RuntimeException("Exception occured while waiting for runnable", e);
            }
        }
    }

    public static void runOn(@ThreadModel int index, final Runnable r) {
        if (runningOn(index)) {
            r.run();
        } else {
            post(index, r);
        }
    }

    /**
     * Removes callback in the specified handler thread
     */
    public static void remove(@ThreadModel int index, final Runnable r) {
        getHandler(index).removeCallbacks(r);
    }
}
