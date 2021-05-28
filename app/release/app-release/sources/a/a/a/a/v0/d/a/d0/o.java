package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.d.a.a;
import a.a.a.a.v0.d.a.a0.e;
import a.a.a.a.v0.d.a.a0.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.v0;
import a.q;
import a.w.b.p;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;

public final class o extends j implements p<d0, h, q> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f762c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(ArrayList arrayList) {
        super(2);
        this.f762c = arrayList;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // a.w.b.p
    public /* bridge */ /* synthetic */ q a(d0 d0Var, h hVar) {
        a(d0Var, hVar);
        return q.f2100a;
    }

    public final void a(d0 d0Var, h hVar) {
        if (d0Var == null) {
            i.a("type");
            throw null;
        } else if (hVar != null) {
            h b = g.b(hVar, d0Var.y());
            ArrayList arrayList = this.f762c;
            e a2 = b.a();
            arrayList.add(new u(d0Var, a2 != null ? a2.a(a.EnumC0022a.TYPE_USE) : null));
            for (v0 v0Var : d0Var.H0()) {
                if (v0Var.b()) {
                    ArrayList arrayList2 = this.f762c;
                    d0 c2 = v0Var.c();
                    i.a((Object) c2, "arg.type");
                    arrayList2.add(new u(c2, null));
                } else {
                    d0 c3 = v0Var.c();
                    i.a((Object) c3, "arg.type");
                    a(c3, b);
                }
            }
        } else {
            i.a("ownerContext");
            throw null;
        }
    }
}
