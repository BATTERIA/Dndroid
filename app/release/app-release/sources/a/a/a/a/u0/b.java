package a.a.a.a.u0;

import a.a.c;
import a.n;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b extends j implements l<Object, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f138c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ List f139d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Map f140e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Class cls, List list, Map map) {
        super(1);
        this.f138c = cls;
        this.f139d = list;
        this.f140e = map;
    }

    /* Return type fixed from 'boolean' to match base method */
    @Override // a.w.b.l
    public final Boolean a(Object obj) {
        boolean z;
        boolean z2;
        c a2;
        Class cls = null;
        Annotation annotation = (Annotation) (!(obj instanceof Annotation) ? null : obj);
        if (!(annotation == null || (a2 = g.a(annotation)) == null)) {
            cls = g.a(a2);
        }
        if (i.a(cls, this.f138c)) {
            List list = this.f139d;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Method method = (Method) it.next();
                    Object obj2 = this.f140e.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        boolean[] zArr = (boolean[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(zArr, (boolean[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.BooleanArray");
                        }
                    } else if (obj2 instanceof char[]) {
                        char[] cArr = (char[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(cArr, (char[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.CharArray");
                        }
                    } else if (obj2 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(bArr, (byte[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.ByteArray");
                        }
                    } else if (obj2 instanceof short[]) {
                        short[] sArr = (short[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(sArr, (short[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.ShortArray");
                        }
                    } else if (obj2 instanceof int[]) {
                        int[] iArr = (int[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(iArr, (int[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.IntArray");
                        }
                    } else if (obj2 instanceof float[]) {
                        float[] fArr = (float[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(fArr, (float[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.FloatArray");
                        }
                    } else if (obj2 instanceof long[]) {
                        long[] jArr = (long[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(jArr, (long[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.LongArray");
                        }
                    } else if (obj2 instanceof double[]) {
                        double[] dArr = (double[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(dArr, (double[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.DoubleArray");
                        }
                    } else if (obj2 instanceof Object[]) {
                        Object[] objArr = (Object[]) obj2;
                        if (invoke != null) {
                            z2 = Arrays.equals(objArr, (Object[]) invoke);
                            continue;
                        } else {
                            throw new n("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                    } else {
                        z2 = i.a(obj2, invoke);
                        continue;
                    }
                    if (!z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                return true;
            }
        }
        return false;
    }
}
