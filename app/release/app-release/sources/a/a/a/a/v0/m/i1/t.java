package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.i1.l;
import a.a.e;
import a.w.b.p;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;

public final /* synthetic */ class t extends h implements p<d0, d0, Boolean> {
    public t(s sVar) {
        super(2, sVar);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // a.w.b.p
    public Boolean a(d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = d0Var;
        d0 d0Var4 = d0Var2;
        if (d0Var3 == null) {
            i.a("p1");
            throw null;
        } else if (d0Var4 == null) {
            i.a("p2");
            throw null;
        } else if (((s) this.f2133d) == null) {
            throw null;
        } else if (l.b != null) {
            m mVar = l.a.f1889a;
            return Boolean.valueOf(mVar.b(d0Var3, d0Var4) && !mVar.b(d0Var4, d0Var3));
        } else {
            throw null;
        }
    }

    @Override // a.w.c.b
    public final e c() {
        return s.a(s.class);
    }

    @Override // a.a.b, a.w.c.b
    public final String d() {
        return "isStrictSupertype";
    }

    @Override // a.w.c.b
    public final String f() {
        return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}
