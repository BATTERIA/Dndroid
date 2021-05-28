package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.m.d0;
import a.a.e;
import a.w.b.p;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;

public final /* synthetic */ class u extends h implements p<d0, d0, Boolean> {
    public u(m mVar) {
        super(2, mVar);
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
        } else if (d0Var4 != null) {
            return Boolean.valueOf(((m) this.f2133d).a(d0Var3, d0Var4));
        } else {
            i.a("p2");
            throw null;
        }
    }

    @Override // a.w.c.b
    public final e c() {
        return s.a(m.class);
    }

    @Override // a.a.b, a.w.c.b
    public final String d() {
        return "equalTypes";
    }

    @Override // a.w.c.b
    public final String f() {
        return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
    }
}
