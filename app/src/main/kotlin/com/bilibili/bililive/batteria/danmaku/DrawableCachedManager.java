package com.bilibili.bililive.batteria.danmaku;

import android.graphics.drawable.Drawable;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DrawableCachedManager {

    private static class OrderKey implements Comparable {
        int size;

        public OrderKey(int size) {
            this.size = size;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return Math.abs(((OrderKey) obj).size - this.size) <= 5;
        }

        @Override
        public int compareTo(Object o) {
            return Integer.compare(size, ((OrderKey) o).size);
        }
    }

    private static class DrawablePackage {
        WeakReference<Drawable> drawableRef;

        public DrawablePackage reset(Drawable drawable) {
            drawableRef = new WeakReference<>(drawable);
            return this;
        }

        public Drawable get() {
            return drawableRef == null ? null : drawableRef.get();
        }
    }

    public interface DrawableCreator {
        Drawable create();
    }

    private final TreeMap<OrderKey, DrawablePackage> orderTreeMap = new TreeMap<>();
    private DrawableCreator creator;
    private float scaleSize = 1.0f;
    private Drawable cachedOne = null;

    public DrawableCachedManager(DrawableCreator creator) {
        this.creator = creator;
    }

    public void setScale(float scale) {
        this.scaleSize = scale;
        synchronized (orderTreeMap) {
            if (!orderTreeMap.isEmpty()) {
                Iterator<Map.Entry<OrderKey, DrawablePackage>> iterator = orderTreeMap.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<OrderKey, DrawablePackage> entry = iterator.next();
                    if (entry != null) {
                        DrawablePackage pack = entry.getValue();
                        if (pack != null) {
                            Drawable drawable = pack.get();
                            if (drawable != null) {
                                int newSize = (int)(scaleSize * entry.getKey().size);
                                drawable.setBounds(0, 0, newSize, newSize);
                            }
                        }
                    }
                }
            }
        }
    }

    public Drawable obtainDrawable(int size) {
        DrawablePackage pack;
        OrderKey key = new OrderKey(size);
        synchronized (orderTreeMap) {
            pack = orderTreeMap.get(key);
            if (pack == null) {
                pack = new DrawablePackage();
                orderTreeMap.put(key, pack);
            }
        }
        Drawable drawable = pack.get();
        if (drawable == null) {
            drawable = creator.create();
            pack.reset(drawable);
            int nsize = (int) (size * scaleSize);
            drawable.setBounds(0, 0, nsize, nsize);
        }
        if (cachedOne == null) {
            cachedOne = drawable;
        }
        return drawable;
    }
}
