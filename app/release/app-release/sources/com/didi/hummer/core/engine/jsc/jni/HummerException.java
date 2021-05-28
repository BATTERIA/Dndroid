package com.didi.hummer.core.engine.jsc.jni;

import android.util.LongSparseArray;
import e.e.a.q.b.b;
import e.e.a.q.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HummerException {
    public static LongSparseArray<List<a>> contextCallbacks = new LongSparseArray<>();

    public interface JSExceptionCallback {
        void onException(long j, String str);
    }

    public static void addJSContextExceptionCallback(b bVar, a aVar) {
        List<a> list = contextCallbacks.get(((e.e.a.q.b.e.b) bVar).f4488a);
        if (list == null) {
            list = new ArrayList<>();
            contextCallbacks.put(((e.e.a.q.b.e.b) bVar).f4488a, list);
        }
        list.add(aVar);
    }

    public static void dispatchExceptionCallback(long j, Exception exc) {
        for (a aVar : contextCallbacks.get(j)) {
            if (aVar != null) {
                aVar.a(exc);
            }
        }
    }

    public static void init() {
        initJSException(e.e.a.q.b.e.e.a.f4496a);
    }

    public static native void initJSException(JSExceptionCallback jSExceptionCallback);

    public static void nativeException(long j, Exception exc) {
        dispatchExceptionCallback(j, exc);
    }

    public static void nativeException(b bVar, Exception exc) {
        nativeException(((e.e.a.q.b.e.b) bVar).f4488a, exc);
    }

    public static void removeJSContextExceptionCallback(b bVar) {
        contextCallbacks.remove(((e.e.a.q.b.e.b) bVar).f4488a);
    }

    public static void removeJSContextExceptionCallback(b bVar, a aVar) {
        List<a> list = contextCallbacks.get(((e.e.a.q.b.e.b) bVar).f4488a);
        if (list != null) {
            Iterator<a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == aVar) {
                    it.remove();
                }
            }
        }
    }
}
