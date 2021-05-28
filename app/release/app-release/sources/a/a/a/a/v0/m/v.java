package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.j.w.i;
import a.t.f;
import a.t.l;
import java.util.List;

public class v extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final s0 f1945d;

    /* renamed from: e  reason: collision with root package name */
    public final i f1946e;

    /* renamed from: f  reason: collision with root package name */
    public final List<v0> f1947f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1948g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1949h;

    public /* synthetic */ v(s0 s0Var, i iVar, List list, boolean z, String str, int i) {
        list = (i & 4) != 0 ? l.f2119c : list;
        z = (i & 8) != 0 ? false : z;
        str = (i & 16) != 0 ? "???" : str;
        if (s0Var == null) {
            a.w.c.i.a("constructor");
            throw null;
        } else if (iVar == null) {
            a.w.c.i.a("memberScope");
            throw null;
        } else if (list == null) {
            a.w.c.i.a("arguments");
            throw null;
        } else if (str != null) {
            this.f1945d = s0Var;
            this.f1946e = iVar;
            this.f1947f = list;
            this.f1948g = z;
            this.f1949h = str;
        } else {
            a.w.c.i.a("presentableName");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.d0
    public List<v0> H0() {
        return this.f1947f;
    }

    @Override // a.a.a.a.v0.m.d0
    public s0 I0() {
        return this.f1945d;
    }

    @Override // a.a.a.a.v0.m.d0
    public boolean J0() {
        return this.f1948g;
    }

    public String L0() {
        return this.f1949h;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(boolean z) {
        return new v(this.f1945d, this.f1946e, this.f1947f, z, null, 16);
    }

    @Override // a.a.a.a.v0.m.k0
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1945d.toString());
        if (this.f1947f.isEmpty()) {
            str = "";
        } else {
            str = f.a(this.f1947f, ", ", "<", ">", -1, "...", null);
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // a.a.a.a.v0.m.d0
    public i u() {
        return this.f1946e;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        if (h.b != null) {
            return h.a.f321a;
        }
        throw null;
    }

    @Override // a.a.a.a.v0.m.d0, a.a.a.a.v0.m.f1
    public v a(a.a.a.a.v0.m.i1.f fVar) {
        if (fVar != null) {
            return this;
        }
        a.w.c.i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.f1, a.a.a.a.v0.m.k0
    public k0 a(h hVar) {
        if (hVar != null) {
            return this;
        }
        a.w.c.i.a("newAnnotations");
        throw null;
    }
}
