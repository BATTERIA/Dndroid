/*
 * Copyright (c) 2016. Bilibili Inc.
 */

package com.bilibili.bililive.batteria.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

import java.lang.reflect.Method;

/**
 * Helper class for WindowManager and Display
 */
public class WindowManagerHelper {

    public static Display getDefaultDisplay(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        if (wm == null)
            return null;

        return wm.getDefaultDisplay();
    }

    public static int getRotation(Context context) {
        Display display = getDefaultDisplay(context);
        if (display == null)
            return Surface.ROTATION_0;

        return display.getRotation();
    }

    public static int getDisplayHeight(Context context) {
        DisplayMetrics dm = getDisplayMetrics(context);
        if (dm != null) {
            return dm.heightPixels;
        }
        return 0;
    }

    public static int getDisplayWidth(Context context) {
        DisplayMetrics dm = getDisplayMetrics(context);
        if (dm != null) {
            return dm.widthPixels;
        }
        return 0;
    }

    /**
     * @param context
     * @return App display metrics
     */
    public static DisplayMetrics getDisplayMetrics(Context context) {
        Display display = getDefaultDisplay(context);
        if (display != null) {
            DisplayMetrics result = new DisplayMetrics();
            display.getMetrics(result);
            return result;
        }
        return null;
    }

    /**
     * @return real size
     */
    @SuppressLint("ObsoleteSdkInt")
    public static Point getDisplayRealSize(Context context) {
        final Point point = new Point();
        Display display = getDefaultDisplay(context);
        if (display == null) return point;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            display.getRealSize(point);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH) {
            try {
                Method mGetRawH = Display.class.getMethod("getRawHeight");
                Method mGetRawW = Display.class.getMethod("getRawWidth");
                point.x = (Integer) mGetRawW.invoke(display);
                point.y = (Integer) mGetRawH.invoke(display);
            } catch (Exception e) {
                display.getSize(point);
            }
        } else {
            display.getSize(point);
        }
        return point;
    }
}
