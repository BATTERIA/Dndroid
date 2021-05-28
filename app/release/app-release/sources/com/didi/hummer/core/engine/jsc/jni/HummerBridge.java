package com.didi.hummer.core.engine.jsc.jni;

import e.c.a.b.l;
import e.e.a.q.a.h;
import e.e.a.q.a.j;
import e.e.a.q.d.b;

public class HummerBridge {
    public long jsContext;
    public InvokeCallback mCallback;

    public interface InvokeCallback {
        Object onInvoke(String str, long j, String str2, Object... objArr);
    }

    public HummerBridge(long j, InvokeCallback invokeCallback) {
        this.jsContext = j;
        this.mCallback = invokeCallback;
        initHummerBridge(j);
        h a2 = h.a();
        if (a2 == null) {
            throw null;
        } else if (b.f4498a && a2.f4461a.get(j) == null) {
            a2.f4461a.put(j, new j());
        }
    }

    private native void initHummerBridge(long j);

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e A[SYNTHETIC, Splitter:B:30:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009f A[Catch:{ Exception -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long invoke(java.lang.String r19, long r20, java.lang.String r22, long... r23) {
        /*
        // Method dump skipped, instructions count: 251
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.core.engine.jsc.jni.HummerBridge.invoke(java.lang.String, long, java.lang.String, long[]):long");
    }

    private native void releaseHummerBridge(long j);

    public void onDestroy() {
        l.f.a("HummerNative", "HummerBridge.onDestroy");
        releaseHummerBridge(this.jsContext);
        h a2 = h.a();
        long j = this.jsContext;
        if (a2 != null) {
            if (b.f4498a) {
                a2.f4461a.remove(j);
            }
            this.mCallback = null;
            return;
        }
        throw null;
    }
}
