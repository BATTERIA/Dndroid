package a.a.a.a.v0.e;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.p0;
import a.a.a.a.v0.h.d;
import a.a.a.a.v0.h.e;
import a.a.a.a.v0.h.f;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.h.s;
import a.a.a.a.v0.h.v;
import d.b.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class z extends i.d<z> implements a0 {
    public static final z t;
    public static s<z> u = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1333d;

    /* renamed from: e  reason: collision with root package name */
    public int f1334e;

    /* renamed from: f  reason: collision with root package name */
    public int f1335f;

    /* renamed from: g  reason: collision with root package name */
    public int f1336g;

    /* renamed from: h  reason: collision with root package name */
    public int f1337h;
    public g0 i;
    public int j;
    public List<l0> k;
    public g0 l;
    public int m;
    public p0 n;
    public int o;
    public int p;
    public List<Integer> q;
    public byte r;
    public int s;

    public static class a extends a.a.a.a.v0.h.b<z> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new z(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<z, b> implements a0 {

        /* renamed from: f  reason: collision with root package name */
        public int f1338f;

        /* renamed from: g  reason: collision with root package name */
        public int f1339g = 518;

        /* renamed from: h  reason: collision with root package name */
        public int f1340h = 2054;
        public int i;
        public g0 j = g0.v;
        public int k;
        public List<l0> l = Collections.emptyList();
        public g0 m = g0.v;
        public int n;
        public p0 o = p0.n;
        public int p;
        public int q;
        public List<Integer> r = Collections.emptyList();

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((z) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            z i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m72clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return z.t;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f1338f & 4) == 4)) {
                return false;
            }
            if (((this.f1338f & 8) == 8) && !this.j.g()) {
                return false;
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (!this.l.get(i2).g()) {
                    return false;
                }
            }
            if (((this.f1338f & 64) == 64) && !this.m.g()) {
                return false;
            }
            return (!((this.f1338f & 256) == 256) || this.o.g()) && h();
        }

        public z i() {
            z zVar = new z(this, null);
            int i2 = this.f1338f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            zVar.f1335f = this.f1339g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            zVar.f1336g = this.f1340h;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            zVar.f1337h = this.i;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            zVar.i = this.j;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            zVar.j = this.k;
            if ((this.f1338f & 32) == 32) {
                this.l = Collections.unmodifiableList(this.l);
                this.f1338f &= -33;
            }
            zVar.k = this.l;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            zVar.l = this.m;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            zVar.m = this.n;
            if ((i2 & 256) == 256) {
                i3 |= 128;
            }
            zVar.n = this.o;
            if ((i2 & 512) == 512) {
                i3 |= 256;
            }
            zVar.o = this.p;
            if ((i2 & 1024) == 1024) {
                i3 |= 512;
            }
            zVar.p = this.q;
            if ((this.f1338f & 2048) == 2048) {
                this.r = Collections.unmodifiableList(this.r);
                this.f1338f &= -2049;
            }
            zVar.q = this.r;
            zVar.f1334e = i3;
            return zVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m73d() {
            return z.t;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(z zVar) {
            p0 p0Var;
            g0 g0Var;
            g0 g0Var2;
            if (zVar == z.t) {
                return this;
            }
            boolean z = true;
            if ((zVar.f1334e & 1) == 1) {
                int i2 = zVar.f1335f;
                this.f1338f |= 1;
                this.f1339g = i2;
            }
            if ((zVar.f1334e & 2) == 2) {
                int i3 = zVar.f1336g;
                this.f1338f = 2 | this.f1338f;
                this.f1340h = i3;
            }
            if ((zVar.f1334e & 4) == 4) {
                int i4 = zVar.f1337h;
                this.f1338f = 4 | this.f1338f;
                this.i = i4;
            }
            if (zVar.n()) {
                g0 g0Var3 = zVar.i;
                if ((this.f1338f & 8) == 8 && (g0Var2 = this.j) != g0.v) {
                    g0Var3 = e.a.a.a.a.a(g0Var2, g0Var3);
                }
                this.j = g0Var3;
                this.f1338f |= 8;
            }
            if ((zVar.f1334e & 16) == 16) {
                int i5 = zVar.j;
                this.f1338f = 16 | this.f1338f;
                this.k = i5;
            }
            if (!zVar.k.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = zVar.k;
                    this.f1338f &= -33;
                } else {
                    if ((this.f1338f & 32) != 32) {
                        this.l = new ArrayList(this.l);
                        this.f1338f |= 32;
                    }
                    this.l.addAll(zVar.k);
                }
            }
            if (zVar.l()) {
                g0 g0Var4 = zVar.l;
                if ((this.f1338f & 64) == 64 && (g0Var = this.m) != g0.v) {
                    g0Var4 = e.a.a.a.a.a(g0Var, g0Var4);
                }
                this.m = g0Var4;
                this.f1338f |= 64;
            }
            if (zVar.m()) {
                int i6 = zVar.m;
                this.f1338f |= 128;
                this.n = i6;
            }
            if ((zVar.f1334e & 128) == 128) {
                p0 p0Var2 = zVar.n;
                if ((this.f1338f & 256) == 256 && (p0Var = this.o) != p0.n) {
                    p0.b bVar = new p0.b();
                    bVar.a(p0Var);
                    bVar.a(p0Var2);
                    p0Var2 = bVar.i();
                }
                this.o = p0Var2;
                this.f1338f |= 256;
            }
            if ((zVar.f1334e & 256) == 256) {
                int i7 = zVar.o;
                this.f1338f |= 512;
                this.p = i7;
            }
            if ((zVar.f1334e & 512) != 512) {
                z = false;
            }
            if (z) {
                int i8 = zVar.p;
                this.f1338f |= 1024;
                this.q = i8;
            }
            if (!zVar.q.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = zVar.q;
                    this.f1338f &= -2049;
                } else {
                    if ((this.f1338f & 2048) != 2048) {
                        this.r = new ArrayList(this.r);
                        this.f1338f |= 2048;
                    }
                    this.r.addAll(zVar.q);
                }
            }
            a((i.d) zVar);
            this.f1390c = this.f1390c.b(zVar.f1333d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            z zVar;
            z zVar2 = null;
            try {
                z a2 = z.u.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                zVar = (z) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                zVar2 = zVar;
            }
            if (zVar2 != null) {
                a(zVar2);
            }
            throw th;
        }
    }

    static {
        z zVar = new z();
        t = zVar;
        zVar.o();
    }

    public z() {
        this.r = -1;
        this.s = -1;
        this.f1333d = d.f1366c;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ z(e eVar, g gVar, a aVar) {
        int i2;
        Object obj;
        List list;
        this.r = -1;
        this.s = -1;
        o();
        d.b i3 = d.i();
        f a2 = f.a(i3, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                g0.c cVar = null;
                p0.b bVar = null;
                g0.c e2 = null;
                switch (j2) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f1334e |= 2;
                        this.f1336g = eVar.g();
                        break;
                    case 16:
                        this.f1334e |= 4;
                        this.f1337h = eVar.g();
                        break;
                    case 26:
                        i2 = 8;
                        cVar = (this.f1334e & 8) == 8 ? this.i.e() : cVar;
                        g0 g0Var = (g0) eVar.a(g0.w, gVar);
                        this.i = g0Var;
                        if (cVar != null) {
                            cVar.a(g0Var);
                            this.i = cVar.i();
                        }
                        this.f1334e |= i2;
                        break;
                    case 34:
                        if (!(z2 & true)) {
                            this.k = new ArrayList();
                            z2 |= true;
                        }
                        list = this.k;
                        obj = eVar.a(l0.p, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 42:
                        e2 = (this.f1334e & 32) == 32 ? this.l.e() : e2;
                        g0 g0Var2 = (g0) eVar.a(g0.w, gVar);
                        this.l = g0Var2;
                        if (e2 != null) {
                            e2.a(g0Var2);
                            this.l = e2.i();
                        }
                        this.f1334e |= 32;
                        break;
                    case 50:
                        i2 = 128;
                        if ((this.f1334e & 128) == 128) {
                            p0 p0Var = this.n;
                            if (p0Var != null) {
                                bVar = new p0.b();
                                bVar.a(p0Var);
                            } else {
                                throw null;
                            }
                        }
                        p0 p0Var2 = (p0) eVar.a(p0.o, gVar);
                        this.n = p0Var2;
                        if (bVar != null) {
                            bVar.a(p0Var2);
                            this.n = bVar.i();
                        }
                        this.f1334e |= i2;
                        break;
                    case 56:
                        this.f1334e |= 256;
                        this.o = eVar.g();
                        break;
                    case 64:
                        this.f1334e |= 512;
                        this.p = eVar.g();
                        break;
                    case 72:
                        this.f1334e |= 16;
                        this.j = eVar.g();
                        break;
                    case j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
                        this.f1334e |= 64;
                        this.m = eVar.g();
                        break;
                    case j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                        this.f1334e |= 1;
                        this.f1335f = eVar.g();
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.q = new ArrayList();
                            z2 |= true;
                        }
                        list = this.q;
                        obj = Integer.valueOf(eVar.g());
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 250:
                        int c2 = eVar.c(eVar.g());
                        if (!(z2 & true) && eVar.a() > 0) {
                            this.q = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.q.add(Integer.valueOf(eVar.g()));
                        }
                        eVar.j = c2;
                        eVar.k();
                        break;
                    default:
                        if (a(eVar, a2, gVar, j2)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (k e3) {
                e3.f1407c = this;
                throw e3;
            } catch (IOException e4) {
                k kVar = new k(e4.getMessage());
                kVar.f1407c = this;
                throw kVar;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (z2 & true) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1333d = i3.l();
                    throw th2;
                }
                this.f1333d = i3.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z2 & true) {
            this.q = Collections.unmodifiableList(this.q);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1333d = i3.l();
            throw th3;
        }
        this.f1333d = i3.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1334e & 2) == 2) {
            fVar.b(1, this.f1336g);
        }
        if ((this.f1334e & 4) == 4) {
            fVar.b(2, this.f1337h);
        }
        if ((this.f1334e & 8) == 8) {
            fVar.a(3, this.i);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            fVar.a(4, this.k.get(i2));
        }
        if ((this.f1334e & 32) == 32) {
            fVar.a(5, this.l);
        }
        if ((this.f1334e & 128) == 128) {
            fVar.a(6, this.n);
        }
        if ((this.f1334e & 256) == 256) {
            fVar.b(7, this.o);
        }
        if ((this.f1334e & 512) == 512) {
            fVar.b(8, this.p);
        }
        if ((this.f1334e & 16) == 16) {
            fVar.b(9, this.j);
        }
        if ((this.f1334e & 64) == 64) {
            fVar.b(10, this.m);
        }
        if ((this.f1334e & 1) == 1) {
            fVar.b(11, this.f1335f);
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            fVar.b(31, this.q.get(i3).intValue());
        }
        k2.a(19000, fVar);
        fVar.b(this.f1333d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1334e & 2) == 2 ? f.e(1, this.f1336g) + 0 : 0;
        if ((this.f1334e & 4) == 4) {
            e2 += f.e(2, this.f1337h);
        }
        if ((this.f1334e & 8) == 8) {
            e2 += f.b(3, this.i);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            e2 += f.b(4, this.k.get(i3));
        }
        if ((this.f1334e & 32) == 32) {
            e2 += f.b(5, this.l);
        }
        if ((this.f1334e & 128) == 128) {
            e2 += f.b(6, this.n);
        }
        if ((this.f1334e & 256) == 256) {
            e2 += f.e(7, this.o);
        }
        if ((this.f1334e & 512) == 512) {
            e2 += f.e(8, this.p);
        }
        if ((this.f1334e & 16) == 16) {
            e2 += f.e(9, this.j);
        }
        if ((this.f1334e & 64) == 64) {
            e2 += f.e(10, this.m);
        }
        if ((this.f1334e & 1) == 1) {
            e2 += f.e(11, this.f1335f);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.q.size(); i5++) {
            i4 += f.f(this.q.get(i5).intValue());
        }
        int size = this.f1333d.size() + i() + (this.q.size() * 2) + e2 + i4;
        this.s = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return t;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<z> f() {
        return u;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.r;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1334e & 4) == 4)) {
            this.r = 0;
            return false;
        } else if (!n() || this.i.g()) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                if (!this.k.get(i2).g()) {
                    this.r = 0;
                    return false;
                }
            }
            if (l() && !this.l.g()) {
                this.r = 0;
                return false;
            } else if (((this.f1334e & 128) == 128) && !this.n.g()) {
                this.r = 0;
                return false;
            } else if (!h()) {
                this.r = 0;
                return false;
            } else {
                this.r = 1;
                return true;
            }
        } else {
            this.r = 0;
            return false;
        }
    }

    public boolean l() {
        return (this.f1334e & 32) == 32;
    }

    public boolean m() {
        return (this.f1334e & 64) == 64;
    }

    public boolean n() {
        return (this.f1334e & 8) == 8;
    }

    public final void o() {
        this.f1335f = 518;
        this.f1336g = 2054;
        this.f1337h = 0;
        this.i = g0.v;
        this.j = 0;
        this.k = Collections.emptyList();
        this.l = g0.v;
        this.m = 0;
        this.n = p0.n;
        this.o = 0;
        this.p = 0;
        this.q = Collections.emptyList();
    }

    public /* synthetic */ z(i.c cVar, a aVar) {
        super(cVar);
        this.r = -1;
        this.s = -1;
        this.f1333d = cVar.f1390c;
    }
}
