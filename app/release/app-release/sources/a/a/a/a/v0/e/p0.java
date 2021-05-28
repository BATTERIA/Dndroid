package a.a.a.a.v0.e;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.h.d;
import a.a.a.a.v0.h.e;
import a.a.a.a.v0.h.f;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.h.s;
import a.a.a.a.v0.h.v;
import java.io.IOException;

public final class p0 extends i.d<p0> implements q0 {
    public static final p0 n;
    public static s<p0> o = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1146d;

    /* renamed from: e  reason: collision with root package name */
    public int f1147e;

    /* renamed from: f  reason: collision with root package name */
    public int f1148f;

    /* renamed from: g  reason: collision with root package name */
    public int f1149g;

    /* renamed from: h  reason: collision with root package name */
    public g0 f1150h;
    public int i;
    public g0 j;
    public int k;
    public byte l;
    public int m;

    public static class a extends a.a.a.a.v0.h.b<p0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new p0(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<p0, b> implements q0 {

        /* renamed from: f  reason: collision with root package name */
        public int f1151f;

        /* renamed from: g  reason: collision with root package name */
        public int f1152g;

        /* renamed from: h  reason: collision with root package name */
        public int f1153h;
        public g0 i;
        public int j;
        public g0 k;
        public int l;

        public b() {
            g0 g0Var = g0.v;
            this.i = g0Var;
            this.k = g0Var;
        }

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((p0) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            p0 i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m49clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return p0.n;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f1151f & 2) == 2)) {
                return false;
            }
            if (((this.f1151f & 4) == 4) && !this.i.g()) {
                return false;
            }
            return (!((this.f1151f & 16) == 16) || this.k.g()) && h();
        }

        public p0 i() {
            p0 p0Var = new p0(this, null);
            int i2 = this.f1151f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            p0Var.f1148f = this.f1152g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            p0Var.f1149g = this.f1153h;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            p0Var.f1150h = this.i;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            p0Var.i = this.j;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            p0Var.j = this.k;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            p0Var.k = this.l;
            p0Var.f1147e = i3;
            return p0Var;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m50d() {
            return p0.n;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(p0 p0Var) {
            g0 g0Var;
            g0 g0Var2;
            if (p0Var == p0.n) {
                return this;
            }
            boolean z = true;
            if ((p0Var.f1147e & 1) == 1) {
                int i2 = p0Var.f1148f;
                this.f1151f |= 1;
                this.f1152g = i2;
            }
            if ((p0Var.f1147e & 2) == 2) {
                int i3 = p0Var.f1149g;
                this.f1151f = 2 | this.f1151f;
                this.f1153h = i3;
            }
            if (p0Var.l()) {
                g0 g0Var3 = p0Var.f1150h;
                if ((this.f1151f & 4) == 4 && (g0Var2 = this.i) != g0.v) {
                    g0Var3 = e.a.a.a.a.a(g0Var2, g0Var3);
                }
                this.i = g0Var3;
                this.f1151f |= 4;
            }
            if ((p0Var.f1147e & 8) == 8) {
                int i4 = p0Var.i;
                this.f1151f = 8 | this.f1151f;
                this.j = i4;
            }
            if (p0Var.m()) {
                g0 g0Var4 = p0Var.j;
                if ((this.f1151f & 16) == 16 && (g0Var = this.k) != g0.v) {
                    g0Var4 = e.a.a.a.a.a(g0Var, g0Var4);
                }
                this.k = g0Var4;
                this.f1151f |= 16;
            }
            if ((p0Var.f1147e & 32) != 32) {
                z = false;
            }
            if (z) {
                int i5 = p0Var.k;
                this.f1151f |= 32;
                this.l = i5;
            }
            a((i.d) p0Var);
            this.f1390c = this.f1390c.b(p0Var.f1146d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            p0 p0Var;
            p0 p0Var2 = null;
            try {
                p0 a2 = p0.o.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                p0Var = (p0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                p0Var2 = p0Var;
            }
            if (p0Var2 != null) {
                a(p0Var2);
            }
            throw th;
        }
    }

    static {
        p0 p0Var = new p0();
        n = p0Var;
        p0Var.f1148f = 0;
        p0Var.f1149g = 0;
        g0 g0Var = g0.v;
        p0Var.f1150h = g0Var;
        p0Var.i = 0;
        p0Var.j = g0Var;
        p0Var.k = 0;
    }

    public p0() {
        this.l = -1;
        this.m = -1;
        this.f1146d = d.f1366c;
    }

    public /* synthetic */ p0(e eVar, g gVar, a aVar) {
        this.l = -1;
        this.m = -1;
        boolean z = false;
        this.f1148f = 0;
        this.f1149g = 0;
        g0 g0Var = g0.v;
        this.f1150h = g0Var;
        this.i = 0;
        this.j = g0Var;
        this.k = 0;
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        this.f1147e |= 1;
                        this.f1148f = eVar.g();
                    } else if (j2 != 16) {
                        g0.c cVar = null;
                        if (j2 == 26) {
                            cVar = (this.f1147e & 4) == 4 ? this.f1150h.e() : cVar;
                            g0 g0Var2 = (g0) eVar.a(g0.w, gVar);
                            this.f1150h = g0Var2;
                            if (cVar != null) {
                                cVar.a(g0Var2);
                                this.f1150h = cVar.i();
                            }
                            this.f1147e |= 4;
                        } else if (j2 == 34) {
                            cVar = (this.f1147e & 16) == 16 ? this.j.e() : cVar;
                            g0 g0Var3 = (g0) eVar.a(g0.w, gVar);
                            this.j = g0Var3;
                            if (cVar != null) {
                                cVar.a(g0Var3);
                                this.j = cVar.i();
                            }
                            this.f1147e |= 16;
                        } else if (j2 == 40) {
                            this.f1147e |= 8;
                            this.i = eVar.g();
                        } else if (j2 == 48) {
                            this.f1147e |= 32;
                            this.k = eVar.g();
                        } else if (!a(eVar, a2, gVar, j2)) {
                        }
                    } else {
                        this.f1147e |= 2;
                        this.f1149g = eVar.g();
                    }
                }
                z = true;
            } catch (k e2) {
                e2.f1407c = this;
                throw e2;
            } catch (IOException e3) {
                k kVar = new k(e3.getMessage());
                kVar.f1407c = this;
                throw kVar;
            } catch (Throwable th) {
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1146d = i2.l();
                    throw th2;
                }
                this.f1146d = i2.l();
                this.f1393c.b();
                throw th;
            }
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1146d = i2.l();
            throw th3;
        }
        this.f1146d = i2.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1147e & 1) == 1) {
            fVar.b(1, this.f1148f);
        }
        if ((this.f1147e & 2) == 2) {
            fVar.b(2, this.f1149g);
        }
        if ((this.f1147e & 4) == 4) {
            fVar.a(3, this.f1150h);
        }
        if ((this.f1147e & 16) == 16) {
            fVar.a(4, this.j);
        }
        if ((this.f1147e & 8) == 8) {
            fVar.b(5, this.i);
        }
        if ((this.f1147e & 32) == 32) {
            fVar.b(6, this.k);
        }
        k2.a(200, fVar);
        fVar.b(this.f1146d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f1147e & 1) == 1) {
            i3 = 0 + f.e(1, this.f1148f);
        }
        if ((this.f1147e & 2) == 2) {
            i3 += f.e(2, this.f1149g);
        }
        if ((this.f1147e & 4) == 4) {
            i3 += f.b(3, this.f1150h);
        }
        if ((this.f1147e & 16) == 16) {
            i3 += f.b(4, this.j);
        }
        if ((this.f1147e & 8) == 8) {
            i3 += f.e(5, this.i);
        }
        if ((this.f1147e & 32) == 32) {
            i3 += f.e(6, this.k);
        }
        int size = this.f1146d.size() + i() + i3;
        this.m = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return n;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<p0> f() {
        return o;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1147e & 2) == 2)) {
            this.l = 0;
            return false;
        } else if (l() && !this.f1150h.g()) {
            this.l = 0;
            return false;
        } else if (m() && !this.j.g()) {
            this.l = 0;
            return false;
        } else if (!h()) {
            this.l = 0;
            return false;
        } else {
            this.l = 1;
            return true;
        }
    }

    public boolean l() {
        return (this.f1147e & 4) == 4;
    }

    public boolean m() {
        return (this.f1147e & 16) == 16;
    }

    public /* synthetic */ p0(i.c cVar, a aVar) {
        super(cVar);
        this.l = -1;
        this.m = -1;
        this.f1146d = cVar.f1390c;
    }
}
