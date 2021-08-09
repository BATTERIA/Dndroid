/*
 * Copyright (c) 2015-2019 BiliBili Inc.
 */

package com.bilibili.bililive.batteria.danmaku;

import android.content.Context;

/**
 * @Description 屏幕计算相关工具
 * @Author Andy.fang
 * @CreateDate 2019-09-11 15:48
 */
public final class ScreenUtils {
    private ScreenUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
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
