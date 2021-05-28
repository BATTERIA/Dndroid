package a.a.a.a.v0.e;

import a.a.a.a.v0.e.n0;
import a.a.a.a.v0.e.t0;
import a.a.a.a.v0.h.d;
import a.a.a.a.v0.h.e;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.j;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.h.s;
import a.a.a.a.v0.h.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f extends i.d<f> implements g {
    public static final f A;
    public static s<f> B = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1018d;

    /* renamed from: e  reason: collision with root package name */
    public int f1019e;

    /* renamed from: f  reason: collision with root package name */
    public int f1020f;

    /* renamed from: g  reason: collision with root package name */
    public int f1021g;

    /* renamed from: h  reason: collision with root package name */
    public int f1022h;
    public List<l0> i;
    public List<g0> j;
    public List<Integer> k;
    public int l;
    public List<Integer> m;
    public int n;
    public List<h> o;
    public List<r> p;
    public List<z> q;
    public List<i0> r;
    public List<n> s;
    public List<Integer> t;
    public int u;
    public n0 v;
    public List<Integer> w;
    public t0 x;
    public byte y;
    public int z;

    public static class a extends a.a.a.a.v0.h.b<f> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new f(eVar, gVar);
        }
    }

    public static final class b extends i.c<f, b> implements g {

        /* renamed from: f  reason: collision with root package name */
        public int f1023f;

        /* renamed from: g  reason: collision with root package name */
        public int f1024g = 6;

        /* renamed from: h  reason: collision with root package name */
        public int f1025h;
        public int i;
        public List<l0> j = Collections.emptyList();
        public List<g0> k = Collections.emptyList();
        public List<Integer> l = Collections.emptyList();
        public List<Integer> m = Collections.emptyList();
        public List<h> n = Collections.emptyList();
        public List<r> o = Collections.emptyList();
        public List<z> p = Collections.emptyList();
        public List<i0> q = Collections.emptyList();
        public List<n> r = Collections.emptyList();
        public List<Integer> s = Collections.emptyList();
        public n0 t = n0.i;
        public List<Integer> u = Collections.emptyList();
        public t0 v = t0.f1189g;

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((f) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            f i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m26clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return f.A;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f1023f & 2) == 2)) {
                return false;
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (!this.j.get(i2).g()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                if (!this.k.get(i3).g()) {
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.n.size(); i4++) {
                if (!this.n.get(i4).g()) {
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.o.size(); i5++) {
                if (!this.o.get(i5).g()) {
                    return false;
                }
            }
            for (int i6 = 0; i6 < this.p.size(); i6++) {
                if (!this.p.get(i6).g()) {
                    return false;
                }
            }
            for (int i7 = 0; i7 < this.q.size(); i7++) {
                if (!this.q.get(i7).g()) {
                    return false;
                }
            }
            for (int i8 = 0; i8 < this.r.size(); i8++) {
                if (!this.r.get(i8).g()) {
                    return false;
                }
            }
            return (!((this.f1023f & 8192) == 8192) || this.t.g()) && h();
        }

        public f i() {
            f fVar = new f(this, (a) null);
            int i2 = this.f1023f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            fVar.f1020f = this.f1024g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            fVar.f1021g = this.f1025h;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            fVar.f1022h = this.i;
            if ((this.f1023f & 8) == 8) {
                this.j = Collections.unmodifiableList(this.j);
                this.f1023f &= -9;
            }
            fVar.i = this.j;
            if ((this.f1023f & 16) == 16) {
                this.k = Collections.unmodifiableList(this.k);
                this.f1023f &= -17;
            }
            fVar.j = this.k;
            if ((this.f1023f & 32) == 32) {
                this.l = Collections.unmodifiableList(this.l);
                this.f1023f &= -33;
            }
            fVar.k = this.l;
            if ((this.f1023f & 64) == 64) {
                this.m = Collections.unmodifiableList(this.m);
                this.f1023f &= -65;
            }
            fVar.m = this.m;
            if ((this.f1023f & 128) == 128) {
                this.n = Collections.unmodifiableList(this.n);
                this.f1023f &= -129;
            }
            fVar.o = this.n;
            if ((this.f1023f & 256) == 256) {
                this.o = Collections.unmodifiableList(this.o);
                this.f1023f &= -257;
            }
            fVar.p = this.o;
            if ((this.f1023f & 512) == 512) {
                this.p = Collections.unmodifiableList(this.p);
                this.f1023f &= -513;
            }
            fVar.q = this.p;
            if ((this.f1023f & 1024) == 1024) {
                this.q = Collections.unmodifiableList(this.q);
                this.f1023f &= -1025;
            }
            fVar.r = this.q;
            if ((this.f1023f & 2048) == 2048) {
                this.r = Collections.unmodifiableList(this.r);
                this.f1023f &= -2049;
            }
            fVar.s = this.r;
            if ((this.f1023f & 4096) == 4096) {
                this.s = Collections.unmodifiableList(this.s);
                this.f1023f &= -4097;
            }
            fVar.t = this.s;
            if ((i2 & 8192) == 8192) {
                i3 |= 8;
            }
            fVar.v = this.t;
            if ((this.f1023f & 16384) == 16384) {
                this.u = Collections.unmodifiableList(this.u);
                this.f1023f &= -16385;
            }
            fVar.w = this.u;
            if ((i2 & 32768) == 32768) {
                i3 |= 16;
            }
            fVar.x = this.v;
            fVar.f1019e = i3;
            return fVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m27d() {
            return f.A;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(f fVar) {
            t0 t0Var;
            n0 n0Var;
            if (fVar == f.A) {
                return this;
            }
            boolean z = true;
            if ((fVar.f1019e & 1) == 1) {
                int i2 = fVar.f1020f;
                this.f1023f |= 1;
                this.f1024g = i2;
            }
            if ((fVar.f1019e & 2) == 2) {
                int i3 = fVar.f1021g;
                this.f1023f = 2 | this.f1023f;
                this.f1025h = i3;
            }
            if ((fVar.f1019e & 4) == 4) {
                int i4 = fVar.f1022h;
                this.f1023f = 4 | this.f1023f;
                this.i = i4;
            }
            if (!fVar.i.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = fVar.i;
                    this.f1023f &= -9;
                } else {
                    if ((this.f1023f & 8) != 8) {
                        this.j = new ArrayList(this.j);
                        this.f1023f |= 8;
                    }
                    this.j.addAll(fVar.i);
                }
            }
            if (!fVar.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = fVar.j;
                    this.f1023f &= -17;
                } else {
                    if ((this.f1023f & 16) != 16) {
                        this.k = new ArrayList(this.k);
                        this.f1023f |= 16;
                    }
                    this.k.addAll(fVar.j);
                }
            }
            if (!fVar.k.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = fVar.k;
                    this.f1023f &= -33;
                } else {
                    if ((this.f1023f & 32) != 32) {
                        this.l = new ArrayList(this.l);
                        this.f1023f |= 32;
                    }
                    this.l.addAll(fVar.k);
                }
            }
            if (!fVar.m.isEmpty()) {
                if (this.m.isEmpty()) {
                    this.m = fVar.m;
                    this.f1023f &= -65;
                } else {
                    if ((this.f1023f & 64) != 64) {
                        this.m = new ArrayList(this.m);
                        this.f1023f |= 64;
                    }
                    this.m.addAll(fVar.m);
                }
            }
            if (!fVar.o.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = fVar.o;
                    this.f1023f &= -129;
                } else {
                    if ((this.f1023f & 128) != 128) {
                        this.n = new ArrayList(this.n);
                        this.f1023f |= 128;
                    }
                    this.n.addAll(fVar.o);
                }
            }
            if (!fVar.p.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = fVar.p;
                    this.f1023f &= -257;
                } else {
                    if ((this.f1023f & 256) != 256) {
                        this.o = new ArrayList(this.o);
                        this.f1023f |= 256;
                    }
                    this.o.addAll(fVar.p);
                }
            }
            if (!fVar.q.isEmpty()) {
                if (this.p.isEmpty()) {
                    this.p = fVar.q;
                    this.f1023f &= -513;
                } else {
                    if ((this.f1023f & 512) != 512) {
                        this.p = new ArrayList(this.p);
                        this.f1023f |= 512;
                    }
                    this.p.addAll(fVar.q);
                }
            }
            if (!fVar.r.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = fVar.r;
                    this.f1023f &= -1025;
                } else {
                    if ((this.f1023f & 1024) != 1024) {
                        this.q = new ArrayList(this.q);
                        this.f1023f |= 1024;
                    }
                    this.q.addAll(fVar.r);
                }
            }
            if (!fVar.s.isEmpty()) {
                if (this.r.isEmpty()) {
                    this.r = fVar.s;
                    this.f1023f &= -2049;
                } else {
                    if ((this.f1023f & 2048) != 2048) {
                        this.r = new ArrayList(this.r);
                        this.f1023f |= 2048;
                    }
                    this.r.addAll(fVar.s);
                }
            }
            if (!fVar.t.isEmpty()) {
                if (this.s.isEmpty()) {
                    this.s = fVar.t;
                    this.f1023f &= -4097;
                } else {
                    if ((this.f1023f & 4096) != 4096) {
                        this.s = new ArrayList(this.s);
                        this.f1023f |= 4096;
                    }
                    this.s.addAll(fVar.t);
                }
            }
            if ((fVar.f1019e & 8) == 8) {
                n0 n0Var2 = fVar.v;
                if ((this.f1023f & 8192) == 8192 && (n0Var = this.t) != n0.i) {
                    n0.b a2 = n0.a(n0Var);
                    a2.a(n0Var2);
                    n0Var2 = a2.h();
                }
                this.t = n0Var2;
                this.f1023f |= 8192;
            }
            if (!fVar.w.isEmpty()) {
                if (this.u.isEmpty()) {
                    this.u = fVar.w;
                    this.f1023f &= -16385;
                } else {
                    if ((this.f1023f & 16384) != 16384) {
                        this.u = new ArrayList(this.u);
                        this.f1023f |= 16384;
                    }
                    this.u.addAll(fVar.w);
                }
            }
            if ((fVar.f1019e & 16) != 16) {
                z = false;
            }
            if (z) {
                t0 t0Var2 = fVar.x;
                if ((this.f1023f & 32768) == 32768 && (t0Var = this.v) != t0.f1189g) {
                    t0.b a3 = t0.a(t0Var);
                    a3.a(t0Var2);
                    t0Var2 = a3.h();
                }
                this.v = t0Var2;
                this.f1023f |= 32768;
            }
            a((i.d) fVar);
            this.f1390c = this.f1390c.b(fVar.f1018d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            f fVar;
            f fVar2 = null;
            try {
                f a2 = f.B.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                fVar = (f) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                fVar2 = fVar;
            }
            if (fVar2 != null) {
                a(fVar2);
            }
            throw th;
        }
    }

    public enum c implements j.a {
        CLASS(0),
        INTERFACE(1),
        ENUM_CLASS(2),
        ENUM_ENTRY(3),
        ANNOTATION_CLASS(4),
        OBJECT(5),
        COMPANION_OBJECT(6);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1031c;

        /* access modifiers changed from: public */
        c(int i) {
            this.f1031c = i;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1031c;
        }
    }

    static {
        f fVar = new f();
        A = fVar;
        fVar.l();
    }

    public f() {
        this.l = -1;
        this.n = -1;
        this.u = -1;
        this.y = -1;
        this.z = -1;
        this.f1018d = d.f1366c;
    }

    public f(e eVar, g gVar) {
        List list;
        int c2;
        Object obj;
        this.l = -1;
        this.n = -1;
        this.u = -1;
        this.y = -1;
        this.z = -1;
        l();
        d.b i2 = d.i();
        a.a.a.a.v0.h.f a2 = a.a.a.a.v0.h.f.a(i2, 1);
        boolean z2 = false;
        boolean z3 = false;
        while (!z2) {
            try {
                int j2 = eVar.j();
                n0.b bVar = null;
                t0.b e2 = null;
                switch (j2) {
                    case 0:
                        z2 = true;
                        break;
                    case 8:
                        this.f1019e |= 1;
                        this.f1020f = eVar.d();
                        break;
                    case 16:
                        if (!(z3 & true)) {
                            this.k = new ArrayList();
                            z3 |= true;
                        }
                        list = this.k;
                        obj = Integer.valueOf(eVar.d());
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 18:
                        c2 = eVar.c(eVar.g());
                        if (!(z3 & true) && eVar.a() > 0) {
                            this.k = new ArrayList();
                            z3 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.k.add(Integer.valueOf(eVar.d()));
                        }
                        eVar.b(c2);
                        break;
                    case 24:
                        this.f1019e |= 2;
                        this.f1021g = eVar.d();
                        break;
                    case 32:
                        this.f1019e |= 4;
                        this.f1022h = eVar.d();
                        break;
                    case 42:
                        if (!(z3 & true)) {
                            this.i = new ArrayList();
                            z3 |= true;
                        }
                        list = this.i;
                        obj = eVar.a(l0.p, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 50:
                        if (!(z3 & true)) {
                            this.j = new ArrayList();
                            z3 |= true;
                        }
                        list = this.j;
                        obj = eVar.a(g0.w, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 56:
                        if (!(z3 & true)) {
                            this.m = new ArrayList();
                            z3 |= true;
                        }
                        list = this.m;
                        obj = Integer.valueOf(eVar.d());
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 58:
                        c2 = eVar.c(eVar.g());
                        if (!(z3 & true) && eVar.a() > 0) {
                            this.m = new ArrayList();
                            z3 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.m.add(Integer.valueOf(eVar.d()));
                        }
                        eVar.b(c2);
                        break;
                    case 66:
                        if (!(z3 & true)) {
                            this.o = new ArrayList();
                            z3 |= true;
                        }
                        list = this.o;
                        obj = eVar.a(h.l, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 74:
                        if (!(z3 & true)) {
                            this.p = new ArrayList();
                            z3 |= true;
                        }
                        list = this.p;
                        obj = eVar.a(r.u, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case d.b.j.AppCompatTheme_panelMenuListWidth /*{ENCODED_INT: 82}*/:
                        if (!(z3 & true)) {
                            this.q = new ArrayList();
                            z3 |= true;
                        }
                        list = this.q;
                        obj = eVar.a(z.u, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case d.b.j.AppCompatTheme_seekBarStyle /*{ENCODED_INT: 90}*/:
                        if (!(z3 & true)) {
                            this.r = new ArrayList();
                            z3 |= true;
                        }
                        list = this.r;
                        obj = eVar.a(i0.r, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case d.b.j.AppCompatTheme_toolbarNavigationButtonStyle /*{ENCODED_INT: 106}*/:
                        if (!(z3 & true)) {
                            this.s = new ArrayList();
                            z3 |= true;
                        }
                        list = this.s;
                        obj = eVar.a(n.j, gVar);
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 128:
                        if (!(z3 & true)) {
                            this.t = new ArrayList();
                            z3 |= true;
                        }
                        list = this.t;
                        obj = Integer.valueOf(eVar.d());
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 130:
                        c2 = eVar.c(eVar.g());
                        if (!(z3 & true) && eVar.a() > 0) {
                            this.t = new ArrayList();
                            z3 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.t.add(Integer.valueOf(eVar.d()));
                        }
                        eVar.b(c2);
                        break;
                    case 242:
                        bVar = (this.f1019e & 8) == 8 ? this.v.e() : bVar;
                        n0 n0Var = (n0) eVar.a(n0.j, gVar);
                        this.v = n0Var;
                        if (bVar != null) {
                            bVar.a(n0Var);
                            this.v = bVar.h();
                        }
                        this.f1019e |= 8;
                        break;
                    case 248:
                        if (!(z3 & true)) {
                            this.w = new ArrayList();
                            z3 |= true;
                        }
                        list = this.w;
                        obj = Integer.valueOf(eVar.d());
                        list.add(obj == 1 ? 1 : 0);
                        break;
                    case 250:
                        int c3 = eVar.c(eVar.g());
                        if (!(z3 & true) && eVar.a() > 0) {
                            this.w = new ArrayList();
                            z3 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.w.add(Integer.valueOf(eVar.d()));
                        }
                        eVar.b(c3);
                        break;
                    case 258:
                        e2 = (this.f1019e & 16) == 16 ? this.x.e() : e2;
                        t0 t0Var = (t0) eVar.a(t0.f1190h, gVar);
                        this.x = t0Var;
                        if (e2 != null) {
                            e2.a(t0Var);
                            this.x = e2.h();
                        }
                        this.f1019e |= 16;
                        break;
                    default:
                        if (a(eVar, a2, gVar, j2)) {
                            break;
                        }
                        z2 = true;
                        break;
                }
            } catch (k e3) {
                e3.a(this);
                throw e3;
            } catch (IOException e4) {
                k kVar = new k(e4.getMessage());
                kVar.a(this);
                throw kVar;
            } catch (Throwable th) {
                if (z3 & true) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                if (z3 & true) {
                    this.i = Collections.unmodifiableList(this.i);
                }
                if (z3 & true) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if (z3 & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (z3 & true) {
                    this.o = Collections.unmodifiableList(this.o);
                }
                if (z3 & true) {
                    this.p = Collections.unmodifiableList(this.p);
                }
                if (z3 & true) {
                    this.q = Collections.unmodifiableList(this.q);
                }
                if (z3 & true) {
                    this.r = Collections.unmodifiableList(this.r);
                }
                if (z3 & true) {
                    this.s = Collections.unmodifiableList(this.s);
                }
                if (z3 & true) {
                    this.t = Collections.unmodifiableList(this.t);
                }
                if (z3 & true) {
                    this.w = Collections.unmodifiableList(this.w);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1018d = i2.l();
                    throw th2;
                }
                this.f1018d = i2.l();
                j();
                throw th;
            }
        }
        if (z3 & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        if (z3 & true) {
            this.i = Collections.unmodifiableList(this.i);
        }
        if (z3 & true) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if (z3 & true) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if (z3 & true) {
            this.o = Collections.unmodifiableList(this.o);
        }
        if (z3 & true) {
            this.p = Collections.unmodifiableList(this.p);
        }
        if (z3 & true) {
            this.q = Collections.unmodifiableList(this.q);
        }
        if (z3 & true) {
            this.r = Collections.unmodifiableList(this.r);
        }
        if (z3 & true) {
            this.s = Collections.unmodifiableList(this.s);
        }
        if (z3 & true) {
            this.t = Collections.unmodifiableList(this.t);
        }
        if (z3 & true) {
            this.w = Collections.unmodifiableList(this.w);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1018d = i2.l();
            throw th3;
        }
        this.f1018d = i2.l();
        j();
    }

    public /* synthetic */ f(i.c cVar, a aVar) {
        super(cVar);
        this.l = -1;
        this.n = -1;
        this.u = -1;
        this.y = -1;
        this.z = -1;
        this.f1018d = cVar.f1390c;
    }

    @Override // a.a.a.a.v0.h.q
    public void a(a.a.a.a.v0.h.f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1019e & 1) == 1) {
            fVar.b(1, this.f1020f);
        }
        if (this.k.size() > 0) {
            fVar.e(18);
            fVar.e(this.l);
        }
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            fVar.b(this.k.get(i2).intValue());
        }
        if ((this.f1019e & 2) == 2) {
            fVar.b(3, this.f1021g);
        }
        if ((this.f1019e & 4) == 4) {
            fVar.b(4, this.f1022h);
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            fVar.a(5, this.i.get(i3));
        }
        for (int i4 = 0; i4 < this.j.size(); i4++) {
            fVar.a(6, this.j.get(i4));
        }
        if (this.m.size() > 0) {
            fVar.e(58);
            fVar.e(this.n);
        }
        for (int i5 = 0; i5 < this.m.size(); i5++) {
            fVar.b(this.m.get(i5).intValue());
        }
        for (int i6 = 0; i6 < this.o.size(); i6++) {
            fVar.a(8, this.o.get(i6));
        }
        for (int i7 = 0; i7 < this.p.size(); i7++) {
            fVar.a(9, this.p.get(i7));
        }
        for (int i8 = 0; i8 < this.q.size(); i8++) {
            fVar.a(10, this.q.get(i8));
        }
        for (int i9 = 0; i9 < this.r.size(); i9++) {
            fVar.a(11, this.r.get(i9));
        }
        for (int i10 = 0; i10 < this.s.size(); i10++) {
            fVar.a(13, this.s.get(i10));
        }
        if (this.t.size() > 0) {
            fVar.e(130);
            fVar.e(this.u);
        }
        for (int i11 = 0; i11 < this.t.size(); i11++) {
            fVar.b(this.t.get(i11).intValue());
        }
        if ((this.f1019e & 8) == 8) {
            fVar.a(30, this.v);
        }
        for (int i12 = 0; i12 < this.w.size(); i12++) {
            fVar.b(31, this.w.get(i12).intValue());
        }
        if ((this.f1019e & 16) == 16) {
            fVar.a(32, this.x);
        }
        k2.a(19000, fVar);
        fVar.b(this.f1018d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.z;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1019e & 1) == 1 ? a.a.a.a.v0.h.f.e(1, this.f1020f) + 0 : 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            i3 += a.a.a.a.v0.h.f.f(this.k.get(i4).intValue());
        }
        int i5 = e2 + i3;
        if (!this.k.isEmpty()) {
            i5 = i5 + 1 + a.a.a.a.v0.h.f.f(i3);
        }
        this.l = i3;
        if ((this.f1019e & 2) == 2) {
            i5 += a.a.a.a.v0.h.f.e(3, this.f1021g);
        }
        if ((this.f1019e & 4) == 4) {
            i5 += a.a.a.a.v0.h.f.e(4, this.f1022h);
        }
        for (int i6 = 0; i6 < this.i.size(); i6++) {
            i5 += a.a.a.a.v0.h.f.b(5, this.i.get(i6));
        }
        for (int i7 = 0; i7 < this.j.size(); i7++) {
            i5 += a.a.a.a.v0.h.f.b(6, this.j.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.m.size(); i9++) {
            i8 += a.a.a.a.v0.h.f.f(this.m.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!this.m.isEmpty()) {
            i10 = i10 + 1 + a.a.a.a.v0.h.f.f(i8);
        }
        this.n = i8;
        for (int i11 = 0; i11 < this.o.size(); i11++) {
            i10 += a.a.a.a.v0.h.f.b(8, this.o.get(i11));
        }
        for (int i12 = 0; i12 < this.p.size(); i12++) {
            i10 += a.a.a.a.v0.h.f.b(9, this.p.get(i12));
        }
        for (int i13 = 0; i13 < this.q.size(); i13++) {
            i10 += a.a.a.a.v0.h.f.b(10, this.q.get(i13));
        }
        for (int i14 = 0; i14 < this.r.size(); i14++) {
            i10 += a.a.a.a.v0.h.f.b(11, this.r.get(i14));
        }
        for (int i15 = 0; i15 < this.s.size(); i15++) {
            i10 += a.a.a.a.v0.h.f.b(13, this.s.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.t.size(); i17++) {
            i16 += a.a.a.a.v0.h.f.f(this.t.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!this.t.isEmpty()) {
            i18 = i18 + 2 + a.a.a.a.v0.h.f.f(i16);
        }
        this.u = i16;
        if ((this.f1019e & 8) == 8) {
            i18 += a.a.a.a.v0.h.f.b(30, this.v);
        }
        int i19 = 0;
        for (int i20 = 0; i20 < this.w.size(); i20++) {
            i19 += a.a.a.a.v0.h.f.f(this.w.get(i20).intValue());
        }
        int size = (this.w.size() * 2) + i18 + i19;
        if ((this.f1019e & 16) == 16) {
            size += a.a.a.a.v0.h.f.b(32, this.x);
        }
        int size2 = this.f1018d.size() + i() + size;
        this.z = size2;
        return size2;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return A;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<f> f() {
        return B;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.y;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1019e & 2) == 2)) {
            this.y = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            if (!this.i.get(i2).g()) {
                this.y = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            if (!this.j.get(i3).g()) {
                this.y = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.o.size(); i4++) {
            if (!this.o.get(i4).g()) {
                this.y = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.p.size(); i5++) {
            if (!this.p.get(i5).g()) {
                this.y = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.q.size(); i6++) {
            if (!this.q.get(i6).g()) {
                this.y = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.r.size(); i7++) {
            if (!this.r.get(i7).g()) {
                this.y = 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.s.size(); i8++) {
            if (!this.s.get(i8).g()) {
                this.y = 0;
                return false;
            }
        }
        if (((this.f1019e & 8) == 8) && !this.v.g()) {
            this.y = 0;
            return false;
        } else if (!h()) {
            this.y = 0;
            return false;
        } else {
            this.y = 1;
            return true;
        }
    }

    public final void l() {
        this.f1020f = 6;
        this.f1021g = 0;
        this.f1022h = 0;
        this.i = Collections.emptyList();
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
        this.m = Collections.emptyList();
        this.o = Collections.emptyList();
        this.p = Collections.emptyList();
        this.q = Collections.emptyList();
        this.r = Collections.emptyList();
        this.s = Collections.emptyList();
        this.t = Collections.emptyList();
        this.v = n0.i;
        this.w = Collections.emptyList();
        this.x = t0.f1189g;
    }
}
