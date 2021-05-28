package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.y0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.d0;
import a.e;
import a.n;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class o0 extends p0 implements w0 {

    /* renamed from: h  reason: collision with root package name */
    public final w0 f402h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final d0 m;

    public static final class a extends o0 {
        public final e n;

        /* renamed from: a.a.a.a.v0.b.d1.o0$a$a  reason: collision with other inner class name */
        public static final class C0018a extends j implements a.w.b.a<List<? extends y0>> {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ a f403c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0018a(a aVar) {
                super(0);
                this.f403c = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // a.w.b.a
            public List<? extends y0> a() {
                return (List) this.f403c.n.getValue();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(a.a.a.a.v0.b.a aVar, w0 w0Var, int i, h hVar, d dVar, d0 d0Var, boolean z, boolean z2, boolean z3, d0 d0Var2, m0 m0Var, a.w.b.a<? extends List<? extends y0>> aVar2) {
            super(aVar, w0Var, i, hVar, dVar, d0Var, z, z2, z3, d0Var2, m0Var);
            if (aVar == null) {
                i.a("containingDeclaration");
                throw null;
            } else if (hVar == null) {
                i.a("annotations");
                throw null;
            } else if (dVar == null) {
                i.a("name");
                throw null;
            } else if (d0Var == null) {
                i.a("outType");
                throw null;
            } else if (m0Var == null) {
                i.a("source");
                throw null;
            } else if (aVar2 != null) {
                this.n = g.m92a((a.w.b.a) aVar2);
            } else {
                i.a("destructuringVariables");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.b.d1.o0, a.a.a.a.v0.b.w0
        public w0 a(a.a.a.a.v0.b.a aVar, d dVar, int i) {
            if (aVar == null) {
                i.a("newOwner");
                throw null;
            } else if (dVar != null) {
                h y = y();
                i.a((Object) y, "annotations");
                d0 c2 = c();
                i.a((Object) c2, "type");
                boolean B = B();
                boolean z = this.k;
                boolean z2 = this.l;
                d0 d0Var = this.m;
                m0 m0Var = m0.f491a;
                i.a((Object) m0Var, "SourceElement.NO_SOURCE");
                return new a(aVar, null, i, y, dVar, c2, B, z, z2, d0Var, m0Var, new C0018a(this));
            } else {
                i.a("newName");
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(a.a.a.a.v0.b.a aVar, w0 w0Var, int i2, h hVar, d dVar, d0 d0Var, boolean z, boolean z2, boolean z3, d0 d0Var2, m0 m0Var) {
        super(aVar, hVar, dVar, d0Var, m0Var);
        if (aVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (dVar == null) {
            i.a("name");
            throw null;
        } else if (d0Var == null) {
            i.a("outType");
            throw null;
        } else if (m0Var != null) {
            this.i = i2;
            this.j = z;
            this.k = z2;
            this.l = z3;
            this.m = d0Var2;
            this.f402h = w0Var != null ? w0Var : this;
        } else {
            i.a("source");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.w0
    public boolean B() {
        if (this.j) {
            a.a.a.a.v0.b.a b = b();
            if (b != null) {
                b.a t = ((b) b).t();
                i.a((Object) t, "(containingDeclaration a…bleMemberDescriptor).kind");
                if (t.a()) {
                    return true;
                }
            } else {
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            }
        }
        return false;
    }

    @Override // a.a.a.a.v0.b.w0
    public boolean C() {
        return this.k;
    }

    @Override // a.a.a.a.v0.b.y0
    public boolean C0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.y0
    public boolean V() {
        return false;
    }

    @Override // a.a.a.a.v0.b.w0
    public d0 W() {
        return this.m;
    }

    @Override // a.a.a.a.v0.b.w0, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public w0 a() {
        w0 w0Var = this.f402h;
        return w0Var == this ? this : w0Var.a();
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(m<R, D> mVar, D d2) {
        if (mVar != null) {
            return mVar.a(this, d2);
        }
        i.a("visitor");
        throw null;
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.v0, a.a.a.a.v0.b.w0, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.k
    public a.a.a.a.v0.b.a b() {
        k b = super.b();
        if (b != null) {
            return (a.a.a.a.v0.b.a) b;
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    @Override // a.a.a.a.v0.b.w0, a.a.a.a.v0.b.a
    public Collection<w0> f() {
        Collection<? extends a.a.a.a.v0.b.a> f2 = b().f();
        i.a((Object) f2, "containingDeclaration.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(g.a(f2, 10));
        for (T t : f2) {
            i.a((Object) t, "it");
            arrayList.add(t.j().get(this.i));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.o
    public a1 g() {
        a1 a1Var = z0.f516f;
        i.a((Object) a1Var, "Visibilities.LOCAL");
        return a1Var;
    }

    @Override // a.a.a.a.v0.b.y0
    public a.a.a.a.v0.j.s.g j0() {
        return null;
    }

    @Override // a.a.a.a.v0.b.w0
    public boolean k0() {
        return this.l;
    }

    @Override // a.a.a.a.v0.b.w0
    public int z() {
        return this.i;
    }

    @Override // a.a.a.a.v0.b.w0
    public w0 a(a.a.a.a.v0.b.a aVar, d dVar, int i2) {
        if (aVar == null) {
            i.a("newOwner");
            throw null;
        } else if (dVar != null) {
            h y = y();
            i.a((Object) y, "annotations");
            d0 c2 = c();
            i.a((Object) c2, "type");
            boolean B = B();
            boolean z = this.k;
            boolean z2 = this.l;
            d0 d0Var = this.m;
            m0 m0Var = m0.f491a;
            i.a((Object) m0Var, "SourceElement.NO_SOURCE");
            return new o0(aVar, null, i2, y, dVar, c2, B, z, z2, d0Var, m0Var);
        } else {
            i.a("newName");
            throw null;
        }
    }

    public static final o0 a(a.a.a.a.v0.b.a aVar, w0 w0Var, int i2, h hVar, d dVar, d0 d0Var, boolean z, boolean z2, boolean z3, d0 d0Var2, m0 m0Var, a.w.b.a<? extends List<? extends y0>> aVar2) {
        if (aVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (dVar == null) {
            i.a("name");
            throw null;
        } else if (d0Var == null) {
            i.a("outType");
            throw null;
        } else if (m0Var != null) {
            return aVar2 == null ? new o0(aVar, w0Var, i2, hVar, dVar, d0Var, z, z2, z3, d0Var2, m0Var) : new a(aVar, w0Var, i2, hVar, dVar, d0Var, z, z2, z3, d0Var2, m0Var, aVar2);
        } else {
            i.a("source");
            throw null;
        }
    }

    /* Return type fixed from 'a.a.a.a.v0.b.l' to match base method */
    @Override // a.a.a.a.v0.b.o0
    public a.a.a.a.v0.b.a a(a.a.a.a.v0.m.a1 a1Var) {
        if (a1Var == null) {
            i.a("substitutor");
            throw null;
        } else if (a1Var.b()) {
            return this;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
