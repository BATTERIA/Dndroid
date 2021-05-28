package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.x0;
import a.t.c;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class p extends j implements a<List<k0>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f1585c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(r rVar) {
        super(0);
        this.f1585c = rVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public List<k0> a() {
        boolean z = true;
        e a2 = this.f1585c.m().a("Comparable");
        i.a((Object) a2, "builtIns.comparable");
        k0 v = a2.v();
        i.a((Object) v, "builtIns.comparable.defaultType");
        ArrayList arrayList = new ArrayList(new c(new k0[]{g.a(v, g.c(new x0(g1.IN_VARIANCE, this.f1585c.f1589d)), (h) null, 2)}, true));
        r rVar = this.f1585c;
        w wVar = rVar.b;
        if (wVar != null) {
            k0[] k0VarArr = new k0[4];
            k0VarArr[0] = wVar.m().e();
            a.a.a.a.v0.a.g m = wVar.m();
            if (m != null) {
                k0 b = m.b(a.a.a.a.v0.a.i.LONG);
                if (b != null) {
                    k0VarArr[1] = b;
                    a.a.a.a.v0.a.g m2 = wVar.m();
                    if (m2 != null) {
                        k0 b2 = m2.b(a.a.a.a.v0.a.i.BYTE);
                        if (b2 != null) {
                            k0VarArr[2] = b2;
                            a.a.a.a.v0.a.g m3 = wVar.m();
                            if (m3 != null) {
                                k0 b3 = m3.b(a.a.a.a.v0.a.i.SHORT);
                                if (b3 != null) {
                                    k0VarArr[3] = b3;
                                    List g2 = g.g(k0VarArr);
                                    if (!(g2 instanceof Collection) || !g2.isEmpty()) {
                                        Iterator it = g2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            if (!(!rVar.f1588c.contains((d0) it.next()))) {
                                                z = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        k0 v2 = this.f1585c.m().a("Number").v();
                                        if (v2 != null) {
                                            arrayList.add(v2);
                                        } else {
                                            a.a.a.a.v0.a.g.b(54);
                                            throw null;
                                        }
                                    }
                                    return arrayList;
                                }
                                a.a.a.a.v0.a.g.b(56);
                                throw null;
                            }
                            throw null;
                        }
                        a.a.a.a.v0.a.g.b(55);
                        throw null;
                    }
                    throw null;
                }
                a.a.a.a.v0.a.g.b(58);
                throw null;
            }
            throw null;
        }
        i.a("$this$allSignedLiteralTypes");
        throw null;
    }
}
