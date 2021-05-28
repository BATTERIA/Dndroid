package a.a.a.a.v0.j;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.j;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.b.s;
import java.util.Comparator;

public class i implements Comparator<k> {

    /* renamed from: c  reason: collision with root package name */
    public static final i f1554c = new i();

    public static int a(k kVar) {
        if (g.m(kVar)) {
            return 8;
        }
        if (kVar instanceof j) {
            return 7;
        }
        if (kVar instanceof f0) {
            return ((f0) kVar).g0() == null ? 6 : 5;
        }
        if (kVar instanceof s) {
            return ((s) kVar).g0() == null ? 4 : 3;
        }
        if (kVar instanceof e) {
            return 2;
        }
        return kVar instanceof q0 ? 1 : 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Comparator
    public int compare(k kVar, k kVar2) {
        Integer num;
        k kVar3 = kVar;
        k kVar4 = kVar2;
        int a2 = a(kVar4) - a(kVar3);
        if (a2 != 0) {
            num = Integer.valueOf(a2);
        } else if (!g.m(kVar3) || !g.m(kVar4)) {
            int compareTo = kVar3.d().f1351c.compareTo(kVar4.d().f1351c);
            num = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
