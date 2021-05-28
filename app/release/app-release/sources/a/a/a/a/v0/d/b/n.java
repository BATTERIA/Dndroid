package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.n0;
import a.a.a.a.v0.e.y0.g.f;
import a.a.a.a.v0.k.b.f0.g;
import a.a.a.a.v0.k.b.r;
import a.w.c.i;
import e.a.a.a.a;

public final class n implements g {
    public final l b;

    public n(l lVar, r<f> rVar, boolean z) {
        if (lVar != null) {
            this.b = lVar;
        } else {
            i.a("binaryClass");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.m0
    public n0 a() {
        n0 n0Var = n0.f492a;
        i.a((Object) n0Var, "SourceFile.NO_SOURCE_FILE");
        return n0Var;
    }

    @Override // a.a.a.a.v0.k.b.f0.g
    public String c() {
        StringBuilder a2 = a.a("Class '");
        a2.append(this.b.a().a().a());
        a2.append('\'');
        return a2.toString();
    }

    public String toString() {
        return n.class.getSimpleName() + ": " + this.b;
    }
}
