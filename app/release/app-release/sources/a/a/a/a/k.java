package a.a.a.a;

import a.a.a.a.w0.a;
import a.a.a.a.w0.b;
import a.w.c.i;
import java.lang.ref.WeakReference;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static b<String, Object> f94a;

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: a.a.a.a.w0.b<java.lang.Object, java.lang.Object>, java.lang.Object, a.a.a.a.w0.b<java.lang.String, java.lang.Object> */
    static {
        b bVar = b.f2033c;
        if (bVar != null) {
            i.a((Object) bVar, "HashPMap.empty<String, Any>()");
            f94a = bVar;
            return;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/pcollections/HashPMap", "empty"));
    }

    public static final <T> a<T> a(Class<T> cls) {
        V v;
        Class<T> cls2 = null;
        if (cls != null) {
            String name = cls.getName();
            b<String, Object> bVar = f94a;
            if (bVar != null) {
                V a2 = bVar.f2034a.f2040a.a((long) name.hashCode());
                if (a2 == null) {
                    a2 = a.f2028f;
                }
                while (true) {
                    if (a2 == null || a2.f2031e <= 0) {
                        v = null;
                    } else {
                        E e2 = a2.f2029c;
                        if (e2.f2041c.equals(name)) {
                            v = e2.f2042d;
                            break;
                        }
                        a2 = a2.f2030d;
                    }
                }
                if (v instanceof WeakReference) {
                    a<T> aVar = (a) v.get();
                    if (aVar != null) {
                        cls2 = aVar.f1e;
                    }
                    if (i.a(cls2, cls)) {
                        return aVar;
                    }
                } else if (v != null) {
                    for (WeakReference weakReference : (WeakReference[]) v) {
                        a<T> aVar2 = (a) weakReference.get();
                        if (i.a(aVar2 != null ? aVar2.f1e : null, cls)) {
                            return aVar2;
                        }
                    }
                    int length = ((Object[]) v).length;
                    WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
                    System.arraycopy(v, 0, weakReferenceArr, 0, length);
                    a<T> aVar3 = new a<>(cls);
                    weakReferenceArr[length] = new WeakReference(aVar3);
                    b<String, Object> a3 = f94a.a(name, weakReferenceArr);
                    i.a((Object) a3, "K_CLASS_CACHE.plus(name, newArray)");
                    f94a = a3;
                    return aVar3;
                }
                a<T> aVar4 = new a<>(cls);
                b<String, Object> a4 = f94a.a(name, new WeakReference(aVar4));
                i.a((Object) a4, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
                f94a = a4;
                return aVar4;
            }
            throw null;
        }
        i.a("jClass");
        throw null;
    }
}
