package com.didi.hummer.core.engine.jsc.jni;

public class HummerRecycler {
    public long jsContext;
    public RecycleCallback mCallback;

    public interface RecycleCallback {
        void onRecycle(long j);
    }

    public HummerRecycler(long j, RecycleCallback recycleCallback) {
        this.jsContext = j;
        this.mCallback = recycleCallback;
        init(j);
    }

    private native void init(long j);

    private void recycle(long j) {
        RecycleCallback recycleCallback = this.mCallback;
        if (recycleCallback != null) {
            recycleCallback.onRecycle(j);
        }
    }

    private native void release(long j);

    public void onDestroy() {
        release(this.jsContext);
        this.mCallback = null;
    }
}
