package e.d.a.m.j;

import android.content.Context;
import e.d.a.m.h.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final k f4052d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, Map<Class, l>> f4053a = new HashMap();
    public final Map<Class, Map<Class, k>> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Context f4054c;

    public static class a implements k {
        @Override // e.d.a.m.j.k
        public c a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    }

    public b(Context context) {
        this.f4054c = context.getApplicationContext();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (e.d.a.m.j.b.f4052d.equals(r0) == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T, Y> e.d.a.m.j.k<T, Y> a(java.lang.Class<T> r3, java.lang.Class<Y> r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.Class, java.util.Map<java.lang.Class, e.d.a.m.j.k>> r0 = r2.b     // Catch:{ all -> 0x0038 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0038 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0038 }
            r1 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0038 }
            e.d.a.m.j.k r0 = (e.d.a.m.j.k) r0     // Catch:{ all -> 0x0038 }
            goto L_0x0014
        L_0x0013:
            r0 = r1
        L_0x0014:
            if (r0 == 0) goto L_0x0021
            e.d.a.m.j.k r3 = e.d.a.m.j.b.f4052d     // Catch:{ all -> 0x0038 }
            boolean r3 = r3.equals(r0)     // Catch:{ all -> 0x0038 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0020
            return r1
        L_0x0020:
            return r0
        L_0x0021:
            e.d.a.m.j.l r1 = r2.b(r3, r4)
            if (r1 == 0) goto L_0x0031
            android.content.Context r0 = r2.f4054c
            e.d.a.m.j.k r0 = r1.a(r0, r2)
            r2.a(r3, r4, r0)
            goto L_0x0036
        L_0x0031:
            e.d.a.m.j.k r1 = e.d.a.m.j.b.f4052d
            r2.a(r3, r4, r1)
        L_0x0036:
            monitor-exit(r2)
            return r0
        L_0x0038:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.j.b.a(java.lang.Class, java.lang.Class):e.d.a.m.j.k");
    }

    public synchronized <T, Y> l<T, Y> a(Class<T> cls, Class<Y> cls2, l<T, Y> lVar) {
        l<T, Y> put;
        this.b.clear();
        Map<Class, l> map = this.f4053a.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.f4053a.put(cls, map);
        }
        put = map.put(cls2, lVar);
        if (put != null) {
            Iterator<Map<Class, l>> it = this.f4053a.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().containsValue(put)) {
                        put = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return put;
    }

    public final <T, Y> void a(Class<T> cls, Class<Y> cls2, k<T, Y> kVar) {
        Map<Class, k> map = this.b.get(cls);
        if (map == null) {
            map = new HashMap<>();
            this.b.put(cls, map);
        }
        map.put(cls2, kVar);
    }

    public final <T, Y> l<T, Y> b(Class<T> cls, Class<Y> cls2) {
        Map<Class, l> map;
        Map<Class, l> map2 = this.f4053a.get(cls);
        l lVar = map2 != null ? map2.get(cls2) : null;
        if (lVar == null) {
            for (Class cls3 : this.f4053a.keySet()) {
                if (!(!cls3.isAssignableFrom(cls) || (map = this.f4053a.get(cls3)) == null || (lVar = map.get(cls2)) == null)) {
                    break;
                }
            }
        }
        return lVar;
    }
}
