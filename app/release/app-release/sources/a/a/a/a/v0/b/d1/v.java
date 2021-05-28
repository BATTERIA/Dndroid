package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.j.u.a;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.j.w.m;
import a.a.a.a.v0.l.b;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.n;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.y0;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class v extends w {

    /* renamed from: c  reason: collision with root package name */
    public final w f433c;

    /* renamed from: d  reason: collision with root package name */
    public final a1 f434d;

    /* renamed from: e  reason: collision with root package name */
    public a1 f435e;

    /* renamed from: f  reason: collision with root package name */
    public List<r0> f436f;

    /* renamed from: g  reason: collision with root package name */
    public List<r0> f437g;

    /* renamed from: h  reason: collision with root package name */
    public s0 f438h;

    public v(w wVar, a1 a1Var) {
        this.f433c = wVar;
        this.f434d = a1Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00de A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r15) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.d1.v.a(int):void");
    }

    @Override // a.a.a.a.v0.b.e
    public Collection<e> A0() {
        Collection<e> A0 = this.f433c.A0();
        if (A0 != null) {
            return A0;
        }
        a(30);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return this.f433c.D();
    }

    @Override // a.a.a.a.v0.b.e
    public boolean D0() {
        return this.f433c.D0();
    }

    @Override // a.a.a.a.v0.b.i
    public boolean E() {
        return this.f433c.E();
    }

    @Override // a.a.a.a.v0.b.e
    public i0 G0() {
        throw new UnsupportedOperationException();
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return this.f433c.H();
    }

    @Override // a.a.a.a.v0.b.e
    public boolean P() {
        return this.f433c.P();
    }

    @Override // a.a.a.a.v0.b.e
    public i T() {
        i T = this.f433c.T();
        if (T != null) {
            return T;
        }
        a(27);
        throw null;
    }

    public final a1 U() {
        if (this.f435e == null) {
            if (this.f434d.b()) {
                this.f435e = this.f434d;
            } else {
                List<r0> d2 = this.f433c.n().d();
                this.f436f = new ArrayList(d2.size());
                this.f435e = g.a(d2, this.f434d.a(), this, this.f436f);
                List<r0> list = this.f436f;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (Boolean.valueOf(!t.o0()).booleanValue()) {
                            arrayList.add(t);
                        }
                    }
                    this.f437g = arrayList;
                } else {
                    a.w.c.i.a("$this$filter");
                    throw null;
                }
            }
        }
        return this.f435e;
    }

    @Override // a.a.a.a.v0.b.e
    public d Y() {
        return this.f433c.Y();
    }

    @Override // a.a.a.a.v0.b.e
    public i Z() {
        i Z = this.f433c.Z();
        if (Z != null) {
            return Z;
        }
        a(15);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.k, a.a.a.a.v0.b.h
    public e a() {
        e a2 = this.f433c.a();
        if (a2 != null) {
            return a2;
        }
        a(20);
        throw null;
    }

    /* Return type fixed from 'a.a.a.a.v0.b.l' to match base method */
    @Override // a.a.a.a.v0.b.o0
    public a.a.a.a.v0.b.i a(a1 a1Var) {
        if (a1Var != null) {
            return a1Var.b() ? this : new v(this, a1.a(a1Var.a(), U().a()));
        }
        a(22);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public i a(f fVar) {
        if (fVar != null) {
            i a2 = this.f433c.a(fVar);
            if (!this.f434d.b()) {
                return new m(a2, U());
            }
            if (a2 != null) {
                return a2;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public i a(y0 y0Var) {
        if (y0Var != null) {
            i a2 = a(y0Var, a.a(a.a.a.a.v0.j.g.a((k) this)));
            if (a2 != null) {
                return a2;
            }
            a(11);
            throw null;
        }
        a(10);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public i a(y0 y0Var, f fVar) {
        if (y0Var == null) {
            a(5);
            throw null;
        } else if (fVar != null) {
            i a2 = this.f433c.a(y0Var, fVar);
            if (!this.f434d.b()) {
                return new m(a2, U());
            }
            if (a2 != null) {
                return a2;
            }
            a(7);
            throw null;
        } else {
            a(6);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(a.a.a.a.v0.b.m<R, D> mVar, D d2) {
        return mVar.a(this, d2);
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.e, a.a.a.a.v0.b.k
    public k b() {
        k b = this.f433c.b();
        if (b != null) {
            return b;
        }
        a(21);
        throw null;
    }

    @Override // a.a.a.a.v0.b.k
    public a.a.a.a.v0.f.d d() {
        a.a.a.a.v0.f.d d2 = this.f433c.d();
        if (d2 != null) {
            return d2;
        }
        a(19);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public e d0() {
        return this.f433c.d0();
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.e, a.a.a.a.v0.b.u
    public a.a.a.a.v0.b.a1 g() {
        a.a.a.a.v0.b.a1 g2 = this.f433c.g();
        if (g2 != null) {
            return g2;
        }
        a(26);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public i i0() {
        i a2 = a(a.a(a.a.a.a.v0.j.g.a((k) this.f433c)));
        if (a2 != null) {
            return a2;
        }
        a(12);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return this.f433c.m0();
    }

    @Override // a.a.a.a.v0.b.h
    public s0 n() {
        s0 n = this.f433c.n();
        if (!this.f434d.b()) {
            if (this.f438h == null) {
                a1 U = U();
                Collection<d0> b = n.b();
                ArrayList arrayList = new ArrayList(b.size());
                for (d0 d0Var : b) {
                    arrayList.add(U.b(d0Var, g1.INVARIANT));
                }
                this.f438h = new n(this, this.f436f, arrayList, b.f1789e);
            }
            s0 s0Var = this.f438h;
            if (s0Var != null) {
                return s0Var;
            }
            a(1);
            throw null;
        } else if (n != null) {
            return n;
        } else {
            a(0);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.u
    public a.a.a.a.v0.b.v o() {
        a.a.a.a.v0.b.v o = this.f433c.o();
        if (o != null) {
            return o;
        }
        a(25);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean p() {
        return this.f433c.p();
    }

    @Override // a.a.a.a.v0.b.e
    public Collection<d> q() {
        Collection<d> q = this.f433c.q();
        ArrayList arrayList = new ArrayList(q.size());
        for (d dVar : q) {
            arrayList.add(((d) dVar.s().a((a.a.a.a.v0.b.b) dVar.a()).a(dVar.o()).a(dVar.g()).a(dVar.t()).a(false).a()).a(U()));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.n
    public m0 r() {
        return m0.f491a;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.b.f t() {
        a.a.a.a.v0.b.f t = this.f433c.t();
        if (t != null) {
            return t;
        }
        a(24);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.h
    public k0 v() {
        return e0.a(y(), n(), (List<? extends v0>) c1.a(n().d()), false, i0());
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.i
    public List<r0> x() {
        U();
        List<r0> list = this.f437g;
        if (list != null) {
            return list;
        }
        a(29);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        h y = this.f433c.y();
        if (y != null) {
            return y;
        }
        a(18);
        throw null;
    }
}
