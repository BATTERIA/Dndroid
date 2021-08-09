/*
 * Copyright (c) 2015-2019 BiliBili Inc.
 */

package com.bilibili.bililive.batteria.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/**
 * @Description 屏幕计算相关工具
 * @Author Andy.fang
 * @CreateDate 2019-09-11 15:48
 */
public final class ScreenUtil {
    private ScreenUtil() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * @Description 获得屏幕宽度
     * @Author Andy.fang
     * @CreateDate 2019-09-11 16:03
     */
    public static int getScreenWidth(Context context) {
        return WindowManagerHelper.getDisplayWidth(context);
    }

    /**
     * @Description 获得屏幕高
     * @Author Andy.fang
     * @CreateDate 2019-09-11 16:03
     */
    public static int getScreenHeight(Context context) {
        return WindowManagerHelper.getDisplayHeight(context);
    }

    /**
     * @Description 获得状态栏的高度
     * @Author Andy.fang
     * @CreateDate 2019-09-11 16:04
     */
    public static int getStatusHeight(Context context) {
        int statusHeight = -1;
        try {
            @SuppressLint("PrivateApi") Class<?> clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            int height = Integer.parseInt(clazz.getField("status_bar_height").get(object).toString());
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }

    /**
     * @Description 获取当前屏幕截图，包含状态栏
     * @Author Andy.fang
     * @CreateDate 2019-09-11 16:04
     */
    public static Bitmap snapShotWithStatusBar(Activity activity) {
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap bmp = view.getDrawingCache();
        int width = getScreenWidth(activity);
        int height = getScreenHeight(activity);
        Bitmap bp = null;
        bp = Bitmap.createBitmap(bmp, 0, 0, width, height);
        view.destroyDrawingCache();
        return bp;

    }

    /**
     * @Description 获取当前屏幕截图，不包含状态栏
     * @Author Andy.fang
     * @CreateDate 2019-09-11 16:06
     */
    public static Bitmap snapShotWithoutStatusBar(Activity activity) {
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap bmp = view.getDrawingCache();
        Rect frame = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight = frame.top;

        int width = getScreenWidth(activity);
        int height = getScreenHeight(activity);
        Bitmap bp = null;
        bp = Bitmap.createBitmap(bmp, 0, statusBarHeight, width, height - statusBarHeight);
        view.destroyDrawingCache();
        return bp;
    }


    public static int dip2px(Context context, float dipValue) {
        final float scale = getDisplayDensity(context);
        return (int) (dipValue * scale + 0.5f);
    }

    public static int px2dip(Context context, float pxValue) {
        final float scale = getDisplayDensity(context);
        return (int) (pxValue / scale + 0.5f);
    }

    public static float getDisplayDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
