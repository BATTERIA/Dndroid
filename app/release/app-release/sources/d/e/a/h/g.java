package d.e.a.h;

import d.e.a.b;
import d.e.a.e;
import d.e.a.h.c;
import d.e.a.h.d;
import java.util.ArrayList;

public class g extends d {
    public float k0 = -1.0f;
    public int l0 = -1;
    public int m0 = -1;
    public c n0 = this.t;
    public int o0;
    public boolean p0;

    public g() {
        this.o0 = 0;
        this.p0 = false;
        this.B.clear();
        this.B.add(this.n0);
        int length = this.A.length;
        for (int i = 0; i < length; i++) {
            this.A[i] = this.n0;
        }
    }

    @Override // d.e.a.h.d
    public c a(c.EnumC0096c cVar) {
        switch (cVar.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.o0 == 1) {
                    return this.n0;
                }
                break;
            case 2:
            case 4:
                if (this.o0 == 0) {
                    return this.n0;
                }
                break;
        }
        throw new AssertionError(cVar.name());
    }

    @Override // d.e.a.h.d
    public void a(e eVar) {
        e eVar2 = (e) this.D;
        if (eVar2 != null) {
            c a2 = eVar2.a(c.EnumC0096c.LEFT);
            c a3 = eVar2.a(c.EnumC0096c.RIGHT);
            d dVar = this.D;
            boolean z = true;
            boolean z2 = dVar != null && dVar.C[0] == d.a.WRAP_CONTENT;
            if (this.o0 == 0) {
                a2 = eVar2.a(c.EnumC0096c.TOP);
                a3 = eVar2.a(c.EnumC0096c.BOTTOM);
                d dVar2 = this.D;
                if (dVar2 == null || dVar2.C[1] != d.a.WRAP_CONTENT) {
                    z = false;
                }
                z2 = z;
            }
            if (this.l0 != -1) {
                d.e.a.g a4 = eVar.a(this.n0);
                eVar.a(a4, eVar.a(a2), this.l0, 6);
                if (z2) {
                    eVar.b(eVar.a(a3), a4, 0, 5);
                }
            } else if (this.m0 != -1) {
                d.e.a.g a5 = eVar.a(this.n0);
                d.e.a.g a6 = eVar.a(a3);
                eVar.a(a5, a6, -this.m0, 6);
                if (z2) {
                    eVar.b(a5, eVar.a(a2), 0, 5);
                    eVar.b(a6, a5, 0, 5);
                }
            } else if (this.k0 != -1.0f) {
                d.e.a.g a7 = eVar.a(this.n0);
                d.e.a.g a8 = eVar.a(a2);
                d.e.a.g a9 = eVar.a(a3);
                float f2 = this.k0;
                boolean z3 = this.p0;
                b b = eVar.b();
                if (z3) {
                    b.a(eVar, 0);
                }
                b.f3116d.a(a7, -1.0f);
                b.f3116d.a(a8, 1.0f - f2);
                b.f3116d.a(a9, f2);
                eVar.a(b);
            }
        }
    }

    @Override // d.e.a.h.d
    public boolean a() {
        return true;
    }

    @Override // d.e.a.h.d
    public ArrayList<c> b() {
        return this.B;
    }

    @Override // d.e.a.h.d
    public void c(e eVar) {
        if (this.D != null) {
            int b = eVar.b(this.n0);
            if (this.o0 == 1) {
                this.I = b;
                this.J = 0;
                e(this.D.d());
                f(0);
                return;
            }
            this.I = 0;
            this.J = b;
            f(this.D.j());
            e(0);
        }
    }

    public void g(int i) {
        if (this.o0 != i) {
            this.o0 = i;
            this.B.clear();
            this.n0 = this.o0 == 1 ? this.s : this.t;
            this.B.add(this.n0);
            int length = this.A.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.A[i2] = this.n0;
            }
        }
    }

    @Override // d.e.a.h.d
    public void a(int i) {
        c cVar;
        j jVar;
        int i2;
        c cVar2;
        j jVar2;
        j jVar3;
        int i3;
        c cVar3;
        d dVar = this.D;
        if (dVar != null) {
            if (this.o0 == 1) {
                this.t.f3148a.a(1, dVar.t.f3148a, 0);
                this.v.f3148a.a(1, dVar.t.f3148a, 0);
                int i4 = this.l0;
                if (i4 != -1) {
                    this.s.f3148a.a(1, dVar.s.f3148a, i4);
                    jVar2 = this.u.f3148a;
                    cVar3 = dVar.s;
                } else {
                    int i5 = this.m0;
                    if (i5 != -1) {
                        this.s.f3148a.a(1, dVar.u.f3148a, -i5);
                        jVar2 = this.u.f3148a;
                        cVar2 = dVar.u;
                        jVar3 = cVar2.f3148a;
                        i3 = -this.m0;
                        jVar2.a(1, jVar3, i3);
                    } else if (this.k0 != -1.0f && dVar.e() == d.a.FIXED) {
                        i2 = (int) (((float) dVar.E) * this.k0);
                        this.s.f3148a.a(1, dVar.s.f3148a, i2);
                        jVar = this.u.f3148a;
                        cVar = dVar.s;
                        jVar.a(1, cVar.f3148a, i2);
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                this.s.f3148a.a(1, dVar.s.f3148a, 0);
                this.u.f3148a.a(1, dVar.s.f3148a, 0);
                int i6 = this.l0;
                if (i6 != -1) {
                    this.t.f3148a.a(1, dVar.t.f3148a, i6);
                    jVar2 = this.v.f3148a;
                    cVar3 = dVar.t;
                } else {
                    int i7 = this.m0;
                    if (i7 != -1) {
                        this.t.f3148a.a(1, dVar.v.f3148a, -i7);
                        jVar2 = this.v.f3148a;
                        cVar2 = dVar.v;
                        jVar3 = cVar2.f3148a;
                        i3 = -this.m0;
                        jVar2.a(1, jVar3, i3);
                    } else if (this.k0 != -1.0f && dVar.i() == d.a.FIXED) {
                        i2 = (int) (((float) dVar.F) * this.k0);
                        this.t.f3148a.a(1, dVar.t.f3148a, i2);
                        jVar = this.v.f3148a;
                        cVar = dVar.t;
                        jVar.a(1, cVar.f3148a, i2);
                        return;
                    } else {
                        return;
                    }
                }
            }
            jVar3 = cVar3.f3148a;
            i3 = this.l0;
            jVar2.a(1, jVar3, i3);
        }
    }
}
