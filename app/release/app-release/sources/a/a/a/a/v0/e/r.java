package a.a.a.a.v0.e;

import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.j;
import a.a.a.a.v0.e.n0;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class r extends i.d<r> implements s {
    public static final r t;
    public static s<r> u = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1154d;

    /* renamed from: e  reason: collision with root package name */
    public int f1155e;

    /* renamed from: f  reason: collision with root package name */
    public int f1156f;

    /* renamed from: g  reason: collision with root package name */
    public int f1157g;

    /* renamed from: h  reason: collision with root package name */
    public int f1158h;
    public g0 i;
    public int j;
    public List<l0> k;
    public g0 l;
    public int m;
    public List<p0> n;
    public n0 o;
    public List<Integer> p;
    public j q;
    public byte r;
    public int s;

    public static class a extends a.a.a.a.v0.h.b<r> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new r(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<r, b> implements s {

        /* renamed from: f  reason: collision with root package name */
        public int f1159f;

        /* renamed from: g  reason: collision with root package name */
        public int f1160g = 6;

        /* renamed from: h  reason: collision with root package name */
        public int f1161h = 6;
        public int i;
        public g0 j = g0.v;
        public int k;
        public List<l0> l = Collections.emptyList();
        public g0 m = g0.v;
        public int n;
        public List<p0> o = Collections.emptyList();
        public n0 p = n0.i;
        public List<Integer> q = Collections.emptyList();
        public j r = j.f1072g;

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((r) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            r i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m51clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return r.t;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f1159f & 4) == 4)) {
                return false;
            }
            if (((this.f1159f & 8) == 8) && !this.j.g()) {
                return false;
            }
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (!this.l.get(i2).g()) {
                    return false;
                }
            }
            if (((this.f1159f & 64) == 64) && !this.m.g()) {
                return false;
            }
            for (int i3 = 0; i3 < this.o.size(); i3++) {
                if (!this.o.get(i3).g()) {
                    return false;
                }
            }
            if (((this.f1159f & 512) == 512) && !this.p.g()) {
                return false;
            }
            return (!((this.f1159f & 2048) == 2048) || this.r.g()) && h();
        }

        public r i() {
            r rVar = new r(this, null);
            int i2 = this.f1159f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            rVar.f1156f = this.f1160g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            rVar.f1157g = this.f1161h;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            rVar.f1158h = this.i;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            rVar.i = this.j;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            rVar.j = this.k;
            if ((this.f1159f & 32) == 32) {
                this.l = Collections.unmodifiableList(this.l);
                this.f1159f &= -33;
            }
            rVar.k = this.l;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            rVar.l = this.m;
            if ((i2 & 128) == 128) {
                i3 |= 64;
            }
            rVar.m = this.n;
            if ((this.f1159f & 256) == 256) {
                this.o = Collections.unmodifiableList(this.o);
                this.f1159f &= -257;
            }
            rVar.n = this.o;
            if ((i2 & 512) == 512) {
                i3 |= 128;
            }
            rVar.o = this.p;
            if ((this.f1159f & 1024) == 1024) {
                this.q = Collections.unmodifiableList(this.q);
                this.f1159f &= -1025;
            }
            rVar.p = this.q;
            if ((i2 & 2048) == 2048) {
                i3 |= 256;
            }
            rVar.q = this.r;
            rVar.f1155e = i3;
            return rVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m52d() {
            return r.t;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(r rVar) {
            j jVar;
            n0 n0Var;
            g0 g0Var;
            g0 g0Var2;
            if (rVar == r.t) {
                return this;
            }
            boolean z = true;
            if ((rVar.f1155e & 1) == 1) {
                int i2 = rVar.f1156f;
                this.f1159f |= 1;
                this.f1160g = i2;
            }
            if ((rVar.f1155e & 2) == 2) {
                int i3 = rVar.f1157g;
                this.f1159f = 2 | this.f1159f;
                this.f1161h = i3;
            }
            if ((rVar.f1155e & 4) == 4) {
                int i4 = rVar.f1158h;
                this.f1159f = 4 | this.f1159f;
                this.i = i4;
            }
            if (rVar.n()) {
                g0 g0Var3 = rVar.i;
                if ((this.f1159f & 8) == 8 && (g0Var2 = this.j) != g0.v) {
                    g0Var3 = e.a.a.a.a.a(g0Var2, g0Var3);
                }
                this.j = g0Var3;
                this.f1159f |= 8;
            }
            if ((rVar.f1155e & 16) == 16) {
                int i5 = rVar.j;
                this.f1159f = 16 | this.f1159f;
                this.k = i5;
            }
            if (!rVar.k.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = rVar.k;
                    this.f1159f &= -33;
                } else {
                    if ((this.f1159f & 32) != 32) {
                        this.l = new ArrayList(this.l);
                        this.f1159f |= 32;
                    }
                    this.l.addAll(rVar.k);
                }
            }
            if (rVar.l()) {
                g0 g0Var4 = rVar.l;
                if ((this.f1159f & 64) == 64 && (g0Var = this.m) != g0.v) {
                    g0Var4 = e.a.a.a.a.a(g0Var, g0Var4);
                }
                this.m = g0Var4;
                this.f1159f |= 64;
            }
            if (rVar.m()) {
                int i6 = rVar.m;
                this.f1159f |= 128;
                this.n = i6;
            }
            if (!rVar.n.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = rVar.n;
                    this.f1159f &= -257;
                } else {
                    if ((this.f1159f & 256) != 256) {
                        this.o = new ArrayList(this.o);
                        this.f1159f |= 256;
                    }
                    this.o.addAll(rVar.n);
                }
            }
            if ((rVar.f1155e & 128) == 128) {
                n0 n0Var2 = rVar.o;
                if ((this.f1159f & 512) == 512 && (n0Var = this.p) != n0.i) {
                    n0.b a2 = n0.a(n0Var);
                    a2.a(n0Var2);
                    n0Var2 = a2.h();
                }
                this.p = n0Var2;
                this.f1159f |= 512;
            }
            if (!rVar.p.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = rVar.p;
                    this.f1159f &= -1025;
                } else {
                    if ((this.f1159f & 1024) != 1024) {
                        this.q = new ArrayList(this.q);
                        this.f1159f |= 1024;
                    }
                    this.q.addAll(rVar.p);
                }
            }
            if ((rVar.f1155e & 256) != 256) {
                z = false;
            }
            if (z) {
                j jVar2 = rVar.q;
                if ((this.f1159f & 2048) == 2048 && (jVar = this.r) != j.f1072g) {
                    j.b bVar = new j.b();
                    bVar.a(jVar);
                    bVar.a(jVar2);
                    jVar2 = bVar.h();
                }
                this.r = jVar2;
                this.f1159f |= 2048;
            }
            a((i.d) rVar);
            this.f1390c = this.f1390c.b(rVar.f1154d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            r rVar;
            r rVar2 = null;
            try {
                r a2 = r.u.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                rVar = (r) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                a(rVar2);
            }
            throw th;
        }
    }

    static {
        r rVar = new r();
        t = rVar;
        rVar.o();
    }

    public r() {
        this.r = -1;
        this.s = -1;
        this.f1154d = d.f1366c;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ r(e eVar, g gVar, a aVar) {
        int i2;
        Object obj;
        List list;
        Object obj2;
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
                j.b bVar = null;
                n0.b bVar2 = null;
                g0.c e2 = null;
                switch (j2) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f1155e |= 2;
                        this.f1157g = eVar.g();
                        break;
                    case 16:
                        this.f1155e |= 4;
                        this.f1158h = eVar.g();
                        break;
                    case 26:
                        i2 = 8;
                        cVar = (this.f1155e & 8) == 8 ? this.i.e() : cVar;
                        g0 g0Var = (g0) eVar.a(g0.w, gVar);
                        this.i = g0Var;
                        if (cVar != null) {
                            cVar.a(g0Var);
                            this.i = cVar.i();
                        }
                        this.f1155e |= i2;
                        break;
                    case 34:
                        if (!(z2 & true)) {
                            this.k = new ArrayList();
                            z2 |= true;
                        }
                        list = this.k;
                        obj2 = l0.p;
                        obj = eVar.a(obj2 == 1 ? 1 : 0, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 42:
                        e2 = (this.f1155e & 32) == 32 ? this.l.e() : e2;
                        g0 g0Var2 = (g0) eVar.a(g0.w, gVar);
                        this.l = g0Var2;
                        if (e2 != null) {
                            e2.a(g0Var2);
                            this.l = e2.i();
                        }
                        this.f1155e |= 32;
                        break;
                    case 50:
                        if (!(z2 & true)) {
                            this.n = new ArrayList();
                            z2 |= true;
                        }
                        list = this.n;
                        obj2 = p0.o;
                        obj = eVar.a(obj2 == 1 ? 1 : 0, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 56:
                        this.f1155e |= 16;
                        this.j = eVar.g();
                        break;
                    case 64:
                        this.f1155e |= 64;
                        this.m = eVar.g();
                        break;
                    case 72:
                        this.f1155e |= 1;
                        this.f1156f = eVar.g();
                        break;
                    case 242:
                        i2 = 128;
                        if ((this.f1155e & 128) == 128) {
                            n0 n0Var = this.o;
                            if (n0Var != null) {
                                bVar2 = n0.a(n0Var);
                            } else {
                                throw null;
                            }
                        }
                        n0 n0Var2 = (n0) eVar.a(n0.j, gVar);
                        this.o = n0Var2;
                        if (bVar2 != null) {
                            bVar2.a(n0Var2);
                            this.o = bVar2.h();
                        }
                        this.f1155e |= i2;
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.p = new ArrayList();
                            z2 |= true;
                        }
                        list = this.p;
                        obj = Integer.valueOf(eVar.g());
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 250:
                        int c2 = eVar.c(eVar.g());
                        if (!(z2 & true) && eVar.a() > 0) {
                            this.p = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.p.add(Integer.valueOf(eVar.g()));
                        }
                        eVar.j = c2;
                        eVar.k();
                        break;
                    case 258:
                        if ((this.f1155e & 256) == 256) {
                            j jVar = this.q;
                            if (jVar != null) {
                                bVar = new j.b();
                                bVar.a(jVar);
                            } else {
                                throw null;
                            }
                        }
                        j jVar2 = (j) eVar.a(j.f1073h, gVar);
                        this.q = jVar2;
                        if (bVar != null) {
                            bVar.a(jVar2);
                            this.q = bVar.h();
                        }
                        this.f1155e |= 256;
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
                    this.n = Collections.unmodifiableList(this.n);
                }
                if (z2 & true) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1154d = i3.l();
                    throw th2;
                }
                this.f1154d = i3.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z2 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        if (z2 & true) {
            this.p = Collections.unmodifiableList(this.p);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1154d = i3.l();
            throw th3;
        }
        this.f1154d = i3.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1155e & 2) == 2) {
            fVar.b(1, this.f1157g);
        }
        if ((this.f1155e & 4) == 4) {
            fVar.b(2, this.f1158h);
        }
        if ((this.f1155e & 8) == 8) {
            fVar.a(3, this.i);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            fVar.a(4, this.k.get(i2));
        }
        if ((this.f1155e & 32) == 32) {
            fVar.a(5, this.l);
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            fVar.a(6, this.n.get(i3));
        }
        if ((this.f1155e & 16) == 16) {
            fVar.b(7, this.j);
        }
        if ((this.f1155e & 64) == 64) {
            fVar.b(8, this.m);
        }
        if ((this.f1155e & 1) == 1) {
            fVar.b(9, this.f1156f);
        }
        if ((this.f1155e & 128) == 128) {
            fVar.a(30, this.o);
        }
        for (int i4 = 0; i4 < this.p.size(); i4++) {
            fVar.b(31, this.p.get(i4).intValue());
        }
        if ((this.f1155e & 256) == 256) {
            fVar.a(32, this.q);
        }
        k2.a(19000, fVar);
        fVar.b(this.f1154d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.s;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1155e & 2) == 2 ? f.e(1, this.f1157g) + 0 : 0;
        if ((this.f1155e & 4) == 4) {
            e2 += f.e(2, this.f1158h);
        }
        if ((this.f1155e & 8) == 8) {
            e2 += f.b(3, this.i);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            e2 += f.b(4, this.k.get(i3));
        }
        if ((this.f1155e & 32) == 32) {
            e2 += f.b(5, this.l);
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            e2 += f.b(6, this.n.get(i4));
        }
        if ((this.f1155e & 16) == 16) {
            e2 += f.e(7, this.j);
        }
        if ((this.f1155e & 64) == 64) {
            e2 += f.e(8, this.m);
        }
        if ((this.f1155e & 1) == 1) {
            e2 += f.e(9, this.f1156f);
        }
        if ((this.f1155e & 128) == 128) {
            e2 += f.b(30, this.o);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.p.size(); i6++) {
            i5 += f.f(this.p.get(i6).intValue());
        }
        int size = (this.p.size() * 2) + e2 + i5;
        if ((this.f1155e & 256) == 256) {
            size += f.b(32, this.q);
        }
        int size2 = this.f1154d.size() + i() + size;
        this.s = size2;
        return size2;
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
    public s<r> f() {
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
        if (!((this.f1155e & 4) == 4)) {
            this.r = 0;
            return false;
        } else if (!n() || this.i.g()) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                if (!this.k.get(i2).g()) {
                    this.r = 0;
                    return false;
                }
            }
            if (!l() || this.l.g()) {
                for (int i3 = 0; i3 < this.n.size(); i3++) {
                    if (!this.n.get(i3).g()) {
                        this.r = 0;
                        return false;
                    }
                }
                if (((this.f1155e & 128) == 128) && !this.o.g()) {
                    this.r = 0;
                    return false;
                } else if (((this.f1155e & 256) == 256) && !this.q.g()) {
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
        } else {
            this.r = 0;
            return false;
        }
    }

    public boolean l() {
        return (this.f1155e & 32) == 32;
    }

    public boolean m() {
        return (this.f1155e & 64) == 64;
    }

    public boolean n() {
        return (this.f1155e & 8) == 8;
    }

    public final void o() {
        this.f1156f = 6;
        this.f1157g = 6;
        this.f1158h = 0;
        this.i = g0.v;
        this.j = 0;
        this.k = Collections.emptyList();
        this.l = g0.v;
        this.m = 0;
        this.n = Collections.emptyList();
        this.o = n0.i;
        this.p = Collections.emptyList();
        this.q = j.f1072g;
    }

    public /* synthetic */ r(i.c cVar, a aVar) {
        super(cVar);
        this.r = -1;
        this.s = -1;
        this.f1154d = cVar.f1390c;
    }
}
