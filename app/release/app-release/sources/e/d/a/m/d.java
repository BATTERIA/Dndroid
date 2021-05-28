package e.d.a.m;

import e.d.a.m.i.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class d<T> implements g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Collection<? extends g<T>> f3940a;
    public String b;

    @SafeVarargs
    public d(g<T>... gVarArr) {
        if (gVarArr.length >= 1) {
            this.f3940a = Arrays.asList(gVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // e.d.a.m.g
    public k<T> a(k<T> kVar, int i, int i2) {
        Iterator<? extends g<T>> it = this.f3940a.iterator();
        k<T> kVar2 = kVar;
        while (it.hasNext()) {
            k<T> a2 = ((g) it.next()).a(kVar2, i, i2);
            if (kVar2 != null && !kVar2.equals(kVar) && !kVar2.equals(a2)) {
                kVar2.a();
            }
            kVar2 = a2;
        }
        return kVar2;
    }

    @Override // e.d.a.m.g
    public String a() {
        if (this.b == null) {
            StringBuilder sb = new StringBuilder();
            Iterator<? extends g<T>> it = this.f3940a.iterator();
            while (it.hasNext()) {
                sb.append(((g) it.next()).a());
            }
            this.b = sb.toString();
        }
        return this.b;
    }
}
