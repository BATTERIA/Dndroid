package a.a.a.a.v0.e;

import a.a.a.a.v0.h.d;
import a.a.a.a.v0.h.e;
import a.a.a.a.v0.h.f;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.j;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.h.s;
import a.a.a.a.v0.h.v;
import d.b.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class g0 extends i.d<g0> implements k0 {
    public static final g0 v;
    public static s<g0> w = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1032d;

    /* renamed from: e  reason: collision with root package name */
    public int f1033e;

    /* renamed from: f  reason: collision with root package name */
    public List<b> f1034f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1035g;

    /* renamed from: h  reason: collision with root package name */
    public int f1036h;
    public g0 i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public g0 o;
    public int p;
    public g0 q;
    public int r;
    public int s;
    public byte t;
    public int u;

    public static class a extends a.a.a.a.v0.h.b<g0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new g0(eVar, gVar, null);
        }
    }

    public static final class c extends i.c<g0, c> implements k0 {

        /* renamed from: f  reason: collision with root package name */
        public int f1053f;

        /* renamed from: g  reason: collision with root package name */
        public List<b> f1054g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        public boolean f1055h;
        public int i;
        public g0 j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int o;
        public g0 p;
        public int q;
        public g0 r;
        public int s;
        public int t;

        public c() {
            g0 g0Var = g0.v;
            this.j = g0Var;
            this.p = g0Var;
            this.r = g0Var;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            g0 i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m30clone() {
            c cVar = new c();
            cVar.a(i());
            return cVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return g0.v;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i2 = 0; i2 < this.f1054g.size(); i2++) {
                if (!this.f1054g.get(i2).g()) {
                    return false;
                }
            }
            if (((this.f1053f & 8) == 8) && !this.j.g()) {
                return false;
            }
            if (((this.f1053f & 512) == 512) && !this.p.g()) {
                return false;
            }
            if ((!((this.f1053f & 2048) == 2048) || this.r.g()) && h()) {
                return true;
            }
            return false;
        }

        public g0 i() {
            g0 g0Var = new g0(this, null);
            int i2 = this.f1053f;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.f1054g = Collections.unmodifiableList(this.f1054g);
                this.f1053f &= -2;
            }
            g0Var.f1034f = this.f1054g;
            if ((i2 & 2) != 2) {
                i3 = 0;
            }
            g0Var.f1035g = this.f1055h;
            if ((i2 & 4) == 4) {
                i3 |= 2;
            }
            g0Var.f1036h = this.i;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            g0Var.i = this.j;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            g0Var.j = this.k;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            g0Var.k = this.l;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            g0Var.l = this.m;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            g0Var.m = this.n;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            g0Var.n = this.o;
            if ((i2 & 512) == 512) {
                i3 |= 256;
            }
            g0Var.o = this.p;
            if ((i2 & 1024) == 1024) {
                i3 |= 512;
            }
            g0Var.p = this.q;
            if ((i2 & 2048) == 2048) {
                i3 |= 1024;
            }
            g0Var.q = this.r;
            if ((i2 & 4096) == 4096) {
                i3 |= 2048;
            }
            g0Var.r = this.s;
            if ((i2 & 8192) == 8192) {
                i3 |= 4096;
            }
            g0Var.s = this.t;
            g0Var.f1033e = i3;
            return g0Var;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m31d() {
            return g0.v;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            c cVar = new c();
            cVar.a(i());
            return cVar;
        }

        public c a(g0 g0Var) {
            g0 g0Var2;
            g0 g0Var3;
            g0 g0Var4;
            if (g0Var == g0.v) {
                return this;
            }
            boolean z = true;
            if (!g0Var.f1034f.isEmpty()) {
                if (this.f1054g.isEmpty()) {
                    this.f1054g = g0Var.f1034f;
                    this.f1053f &= -2;
                } else {
                    if ((this.f1053f & 1) != 1) {
                        this.f1054g = new ArrayList(this.f1054g);
                        this.f1053f |= 1;
                    }
                    this.f1054g.addAll(g0Var.f1034f);
                }
            }
            if ((g0Var.f1033e & 1) == 1) {
                boolean z2 = g0Var.f1035g;
                this.f1053f |= 2;
                this.f1055h = z2;
            }
            if ((g0Var.f1033e & 2) == 2) {
                int i2 = g0Var.f1036h;
                this.f1053f |= 4;
                this.i = i2;
            }
            if (g0Var.n()) {
                g0 g0Var5 = g0Var.i;
                if ((this.f1053f & 8) == 8 && (g0Var4 = this.j) != g0.v) {
                    g0Var5 = e.a.a.a.a.a(g0Var4, g0Var5);
                }
                this.j = g0Var5;
                this.f1053f |= 8;
            }
            if ((g0Var.f1033e & 8) == 8) {
                int i3 = g0Var.j;
                this.f1053f |= 16;
                this.k = i3;
            }
            if (g0Var.m()) {
                int i4 = g0Var.k;
                this.f1053f |= 32;
                this.l = i4;
            }
            if ((g0Var.f1033e & 32) == 32) {
                int i5 = g0Var.l;
                this.f1053f |= 64;
                this.m = i5;
            }
            if ((g0Var.f1033e & 64) == 64) {
                int i6 = g0Var.m;
                this.f1053f |= 128;
                this.n = i6;
            }
            if (g0Var.p()) {
                int i7 = g0Var.n;
                this.f1053f |= 256;
                this.o = i7;
            }
            if (g0Var.o()) {
                g0 g0Var6 = g0Var.o;
                if ((this.f1053f & 512) == 512 && (g0Var3 = this.p) != g0.v) {
                    g0Var6 = e.a.a.a.a.a(g0Var3, g0Var6);
                }
                this.p = g0Var6;
                this.f1053f |= 512;
            }
            if ((g0Var.f1033e & 512) == 512) {
                int i8 = g0Var.p;
                this.f1053f |= 1024;
                this.q = i8;
            }
            if (g0Var.l()) {
                g0 g0Var7 = g0Var.q;
                if ((this.f1053f & 2048) == 2048 && (g0Var2 = this.r) != g0.v) {
                    g0Var7 = e.a.a.a.a.a(g0Var2, g0Var7);
                }
                this.r = g0Var7;
                this.f1053f |= 2048;
            }
            if ((g0Var.f1033e & 2048) == 2048) {
                int i9 = g0Var.r;
                this.f1053f |= 4096;
                this.s = i9;
            }
            if ((g0Var.f1033e & 4096) != 4096) {
                z = false;
            }
            if (z) {
                int i10 = g0Var.s;
                this.f1053f |= 8192;
                this.t = i10;
            }
            a((i.d) g0Var);
            this.f1390c = this.f1390c.b(g0Var.f1032d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public c a(e eVar, g gVar) {
            Throwable th;
            g0 g0Var;
            g0 g0Var2 = null;
            try {
                g0 a2 = g0.w.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                g0Var = (g0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                g0Var2 = g0Var;
            }
            if (g0Var2 != null) {
                a(g0Var2);
            }
            throw th;
        }
    }

    static {
        g0 g0Var = new g0();
        v = g0Var;
        g0Var.q();
    }

    public g0() {
        this.t = -1;
        this.u = -1;
        this.f1032d = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: java.util.List<a.a.a.a.v0.e.g0$b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ g0(e eVar, g gVar, a aVar) {
        int i2;
        this.t = -1;
        this.u = -1;
        q();
        d.b i3 = d.i();
        f a2 = f.a(i3, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                c cVar = null;
                switch (j2) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f1033e |= 4096;
                        this.s = eVar.g();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.f1034f = new ArrayList();
                            z2 |= true;
                        }
                        this.f1034f.add(eVar.a(b.k, gVar));
                        break;
                    case 24:
                        this.f1033e |= 1;
                        this.f1035g = eVar.b();
                        break;
                    case 32:
                        this.f1033e |= 2;
                        this.f1036h = eVar.g();
                        break;
                    case 42:
                        i2 = 4;
                        cVar = (this.f1033e & 4) == 4 ? this.i.e() : cVar;
                        g0 g0Var = (g0) eVar.a(w, gVar);
                        this.i = g0Var;
                        if (cVar != null) {
                            cVar.a(g0Var);
                            this.i = cVar.i();
                        }
                        this.f1033e |= i2;
                        break;
                    case 48:
                        this.f1033e |= 16;
                        this.k = eVar.g();
                        break;
                    case 56:
                        this.f1033e |= 32;
                        this.l = eVar.g();
                        break;
                    case 64:
                        this.f1033e |= 8;
                        this.j = eVar.g();
                        break;
                    case 72:
                        this.f1033e |= 64;
                        this.m = eVar.g();
                        break;
                    case j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
                        i2 = 256;
                        cVar = (this.f1033e & 256) == 256 ? this.o.e() : cVar;
                        g0 g0Var2 = (g0) eVar.a(w, gVar);
                        this.o = g0Var2;
                        if (cVar != null) {
                            cVar.a(g0Var2);
                            this.o = cVar.i();
                        }
                        this.f1033e |= i2;
                        break;
                    case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                        this.f1033e |= 512;
                        this.p = eVar.g();
                        break;
                    case j.AppCompatTheme_textAppearanceLargePopupMenu /*{ENCODED_INT: 96}*/:
                        this.f1033e |= 128;
                        this.n = eVar.g();
                        break;
                    case j.AppCompatTheme_toolbarNavigationButtonStyle /*{ENCODED_INT: 106}*/:
                        i2 = 1024;
                        cVar = (this.f1033e & 1024) == 1024 ? this.q.e() : cVar;
                        g0 g0Var3 = (g0) eVar.a(w, gVar);
                        this.q = g0Var3;
                        if (cVar != null) {
                            cVar.a(g0Var3);
                            this.q = cVar.i();
                        }
                        this.f1033e |= i2;
                        break;
                    case j.AppCompatTheme_windowActionBarOverlay /*{ENCODED_INT: 112}*/:
                        this.f1033e |= 2048;
                        this.r = eVar.g();
                        break;
                    default:
                        if (a(eVar, a2, gVar, j2)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (k e2) {
                e2.f1407c = this;
                throw e2;
            } catch (IOException e3) {
                k kVar = new k(e3.getMessage());
                kVar.f1407c = this;
                throw kVar;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.f1034f = Collections.unmodifiableList(this.f1034f);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1032d = i3.l();
                    throw th2;
                }
                this.f1032d = i3.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 && true) {
            this.f1034f = Collections.unmodifiableList(this.f1034f);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1032d = i3.l();
            throw th3;
        }
        this.f1032d = i3.l();
        this.f1393c.b();
    }

    public static c a(g0 g0Var) {
        c cVar = new c();
        cVar.a(g0Var);
        return cVar;
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.u;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1033e & 4096) == 4096 ? f.e(1, this.s) + 0 : 0;
        for (int i3 = 0; i3 < this.f1034f.size(); i3++) {
            e2 += f.b(2, this.f1034f.get(i3));
        }
        if ((this.f1033e & 1) == 1) {
            e2 += f.h(3) + 1;
        }
        if ((this.f1033e & 2) == 2) {
            e2 += f.e(4, this.f1036h);
        }
        if ((this.f1033e & 4) == 4) {
            e2 += f.b(5, this.i);
        }
        if ((this.f1033e & 16) == 16) {
            e2 += f.e(6, this.k);
        }
        if ((this.f1033e & 32) == 32) {
            e2 += f.e(7, this.l);
        }
        if ((this.f1033e & 8) == 8) {
            e2 += f.e(8, this.j);
        }
        if ((this.f1033e & 64) == 64) {
            e2 += f.e(9, this.m);
        }
        if ((this.f1033e & 256) == 256) {
            e2 += f.b(10, this.o);
        }
        if ((this.f1033e & 512) == 512) {
            e2 += f.e(11, this.p);
        }
        if ((this.f1033e & 128) == 128) {
            e2 += f.e(12, this.n);
        }
        if ((this.f1033e & 1024) == 1024) {
            e2 += f.b(13, this.q);
        }
        if ((this.f1033e & 2048) == 2048) {
            e2 += f.e(14, this.r);
        }
        int size = this.f1032d.size() + i() + e2;
        this.u = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new c();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return v;
    }

    @Override // a.a.a.a.v0.h.q
    public c e() {
        return a(this);
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<g0> f() {
        return w;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.t;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1034f.size(); i2++) {
            if (!this.f1034f.get(i2).g()) {
                this.t = 0;
                return false;
            }
        }
        if (n() && !this.i.g()) {
            this.t = 0;
            return false;
        } else if (o() && !this.o.g()) {
            this.t = 0;
            return false;
        } else if (l() && !this.q.g()) {
            this.t = 0;
            return false;
        } else if (!h()) {
            this.t = 0;
            return false;
        } else {
            this.t = 1;
            return true;
        }
    }

    public boolean l() {
        return (this.f1033e & 1024) == 1024;
    }

    public boolean m() {
        return (this.f1033e & 16) == 16;
    }

    public boolean n() {
        return (this.f1033e & 4) == 4;
    }

    public boolean o() {
        return (this.f1033e & 256) == 256;
    }

    public boolean p() {
        return (this.f1033e & 128) == 128;
    }

    public final void q() {
        this.f1034f = Collections.emptyList();
        this.f1035g = false;
        this.f1036h = 0;
        g0 g0Var = v;
        this.i = g0Var;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = g0Var;
        this.p = 0;
        this.q = g0Var;
        this.r = 0;
        this.s = 0;
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1033e & 4096) == 4096) {
            fVar.b(1, this.s);
        }
        for (int i2 = 0; i2 < this.f1034f.size(); i2++) {
            fVar.a(2, this.f1034f.get(i2));
        }
        if ((this.f1033e & 1) == 1) {
            boolean z = this.f1035g;
            fVar.e(24);
            fVar.c(z ? 1 : 0);
        }
        if ((this.f1033e & 2) == 2) {
            fVar.b(4, this.f1036h);
        }
        if ((this.f1033e & 4) == 4) {
            fVar.a(5, this.i);
        }
        if ((this.f1033e & 16) == 16) {
            fVar.b(6, this.k);
        }
        if ((this.f1033e & 32) == 32) {
            fVar.b(7, this.l);
        }
        if ((this.f1033e & 8) == 8) {
            fVar.b(8, this.j);
        }
        if ((this.f1033e & 64) == 64) {
            fVar.b(9, this.m);
        }
        if ((this.f1033e & 256) == 256) {
            fVar.a(10, this.o);
        }
        if ((this.f1033e & 512) == 512) {
            fVar.b(11, this.p);
        }
        if ((this.f1033e & 128) == 128) {
            fVar.b(12, this.n);
        }
        if ((this.f1033e & 1024) == 1024) {
            fVar.a(13, this.q);
        }
        if ((this.f1033e & 2048) == 2048) {
            fVar.b(14, this.r);
        }
        k2.a(200, fVar);
        fVar.b(this.f1032d);
    }

    public static final class b extends i implements h0 {
        public static final b j;
        public static s<b> k = new a();

        /* renamed from: c  reason: collision with root package name */
        public final d f1037c;

        /* renamed from: d  reason: collision with root package name */
        public int f1038d;

        /* renamed from: e  reason: collision with root package name */
        public c f1039e;

        /* renamed from: f  reason: collision with root package name */
        public g0 f1040f;

        /* renamed from: g  reason: collision with root package name */
        public int f1041g;

        /* renamed from: h  reason: collision with root package name */
        public byte f1042h;
        public int i;

        public static class a extends a.a.a.a.v0.h.b<b> {
            @Override // a.a.a.a.v0.h.s
            public Object a(e eVar, g gVar) {
                return new b(eVar, gVar, null);
            }
        }

        /* renamed from: a.a.a.a.v0.e.g0$b$b  reason: collision with other inner class name */
        public static final class C0044b extends i.b<b, C0044b> implements h0 {

            /* renamed from: d  reason: collision with root package name */
            public int f1043d;

            /* renamed from: e  reason: collision with root package name */
            public c f1044e = c.INV;

            /* renamed from: f  reason: collision with root package name */
            public g0 f1045f = g0.v;

            /* renamed from: g  reason: collision with root package name */
            public int f1046g;

            /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
            @Override // a.a.a.a.v0.h.i.b
            public /* bridge */ /* synthetic */ C0044b a(b bVar) {
                a(bVar);
                return this;
            }

            @Override // a.a.a.a.v0.h.q.a
            public q a() {
                b h2 = h();
                if (h2.g()) {
                    return h2;
                }
                throw new v();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
            /* renamed from: clone  reason: collision with other method in class */
            public C0044b m28clone() {
                C0044b bVar = new C0044b();
                bVar.a(h());
                return bVar;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
            public b d() {
                return b.j;
            }

            @Override // a.a.a.a.v0.h.r
            public final boolean g() {
                return !((this.f1043d & 2) == 2) || this.f1045f.g();
            }

            public b h() {
                b bVar = new b(this, null);
                int i = this.f1043d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f1039e = this.f1044e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f1040f = this.f1045f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.f1041g = this.f1046g;
                bVar.f1038d = i2;
                return bVar;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
            /* renamed from: d  reason: collision with other method in class */
            public b m29d() {
                return b.j;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
            public C0044b clone() {
                C0044b bVar = new C0044b();
                bVar.a(h());
                return bVar;
            }

            public C0044b a(b bVar) {
                g0 g0Var;
                if (bVar == b.j) {
                    return this;
                }
                boolean z = true;
                if ((bVar.f1038d & 1) == 1) {
                    c cVar = bVar.f1039e;
                    if (cVar != null) {
                        this.f1043d |= 1;
                        this.f1044e = cVar;
                    } else {
                        throw null;
                    }
                }
                if (bVar.h()) {
                    g0 g0Var2 = bVar.f1040f;
                    if ((this.f1043d & 2) == 2 && (g0Var = this.f1045f) != g0.v) {
                        g0Var2 = e.a.a.a.a.a(g0Var, g0Var2);
                    }
                    this.f1045f = g0Var2;
                    this.f1043d |= 2;
                }
                if ((bVar.f1038d & 4) != 4) {
                    z = false;
                }
                if (z) {
                    int i = bVar.f1041g;
                    this.f1043d |= 4;
                    this.f1046g = i;
                }
                this.f1390c = this.f1390c.b(bVar.f1037c);
                return this;
            }

            @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
            public C0044b a(e eVar, g gVar) {
                Throwable th;
                b bVar;
                b bVar2 = null;
                try {
                    b a2 = b.k.a(eVar, gVar);
                    if (a2 != null) {
                        a(a2);
                    }
                    return this;
                } catch (k e2) {
                    bVar = (b) e2.f1407c;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    a(bVar2);
                }
                throw th;
            }
        }

        public enum c implements j.a {
            IN(0),
            OUT(1),
            INV(2),
            STAR(3);
            

            /* renamed from: c  reason: collision with root package name */
            public final int f1052c;

            /* access modifiers changed from: public */
            c(int i) {
                this.f1052c = i;
            }

            public static c a(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // a.a.a.a.v0.h.j.a
            public final int getNumber() {
                return this.f1052c;
            }
        }

        static {
            b bVar = new b();
            j = bVar;
            bVar.f1039e = c.INV;
            bVar.f1040f = g0.v;
            bVar.f1041g = 0;
        }

        public b() {
            this.f1042h = -1;
            this.i = -1;
            this.f1037c = d.f1366c;
        }

        public /* synthetic */ b(e eVar, g gVar, a aVar) {
            this.f1042h = -1;
            this.i = -1;
            this.f1039e = c.INV;
            this.f1040f = g0.v;
            boolean z = false;
            this.f1041g = 0;
            d.b i2 = d.i();
            f a2 = f.a(i2, 1);
            while (!z) {
                try {
                    int j2 = eVar.j();
                    if (j2 != 0) {
                        if (j2 == 8) {
                            int g2 = eVar.g();
                            c a3 = c.a(g2);
                            if (a3 == null) {
                                a2.e(j2);
                                a2.e(g2);
                            } else {
                                this.f1038d |= 1;
                                this.f1039e = a3;
                            }
                        } else if (j2 == 18) {
                            c cVar = (this.f1038d & 2) == 2 ? this.f1040f.e() : null;
                            g0 g0Var = (g0) eVar.a(g0.w, gVar);
                            this.f1040f = g0Var;
                            if (cVar != null) {
                                cVar.a(g0Var);
                                this.f1040f = cVar.i();
                            }
                            this.f1038d |= 2;
                        } else if (j2 == 24) {
                            this.f1038d |= 4;
                            this.f1041g = eVar.g();
                        } else if (!eVar.a(j2, a2)) {
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
                        this.f1037c = i2.l();
                        throw th2;
                    }
                    this.f1037c = i2.l();
                    throw th;
                }
            }
            try {
                a2.a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f1037c = i2.l();
                throw th3;
            }
            this.f1037c = i2.l();
        }

        @Override // a.a.a.a.v0.h.q
        public void a(f fVar) {
            b();
            if ((this.f1038d & 1) == 1) {
                fVar.a(1, this.f1039e.f1052c);
            }
            if ((this.f1038d & 2) == 2) {
                fVar.a(2, this.f1040f);
            }
            if ((this.f1038d & 4) == 4) {
                fVar.b(3, this.f1041g);
            }
            fVar.b(this.f1037c);
        }

        @Override // a.a.a.a.v0.h.q
        public int b() {
            int i2 = this.i;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f1038d & 1) == 1) {
                i3 = 0 + f.d(1, this.f1039e.f1052c);
            }
            if ((this.f1038d & 2) == 2) {
                i3 += f.b(2, this.f1040f);
            }
            if ((this.f1038d & 4) == 4) {
                i3 += f.e(3, this.f1041g);
            }
            int size = this.f1037c.size() + i3;
            this.i = size;
            return size;
        }

        @Override // a.a.a.a.v0.h.q
        public q.a c() {
            return new C0044b();
        }

        @Override // a.a.a.a.v0.h.r
        public q d() {
            return j;
        }

        @Override // a.a.a.a.v0.h.q
        public q.a e() {
            C0044b bVar = new C0044b();
            bVar.a(this);
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
        public s<b> f() {
            return k;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            byte b = this.f1042h;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!h() || this.f1040f.g()) {
                this.f1042h = 1;
                return true;
            }
            this.f1042h = 0;
            return false;
        }

        public boolean h() {
            return (this.f1038d & 2) == 2;
        }

        public /* synthetic */ b(i.b bVar, a aVar) {
            super(bVar);
            this.f1042h = -1;
            this.i = -1;
            this.f1037c = bVar.f1390c;
        }
    }

    public /* synthetic */ g0(i.c cVar, a aVar) {
        super(cVar);
        this.t = -1;
        this.u = -1;
        this.f1032d = cVar.f1390c;
    }
}
