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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i0 extends i.d<i0> implements j0 {
    public static final i0 q;
    public static s<i0> r = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1064d;

    /* renamed from: e  reason: collision with root package name */
    public int f1065e;

    /* renamed from: f  reason: collision with root package name */
    public int f1066f;

    /* renamed from: g  reason: collision with root package name */
    public int f1067g;

    /* renamed from: h  reason: collision with root package name */
    public List<l0> f1068h;
    public g0 i;
    public int j;
    public g0 k;
    public int l;
    public List<b> m;
    public List<Integer> n;
    public byte o;
    public int p;

    public static class a extends a.a.a.a.v0.h.b<i0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new i0(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<i0, b> implements j0 {

        /* renamed from: f  reason: collision with root package name */
        public int f1069f;

        /* renamed from: g  reason: collision with root package name */
        public int f1070g = 6;

        /* renamed from: h  reason: collision with root package name */
        public int f1071h;
        public List<l0> i = Collections.emptyList();
        public g0 j;
        public int k;
        public g0 l;
        public int m;
        public List<b> n;
        public List<Integer> o;

        public b() {
            g0 g0Var = g0.v;
            this.j = g0Var;
            this.l = g0Var;
            this.n = Collections.emptyList();
            this.o = Collections.emptyList();
        }

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((i0) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            i0 i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m34clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return i0.q;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f1069f & 2) == 2)) {
                return false;
            }
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                if (!this.i.get(i2).g()) {
                    return false;
                }
            }
            if (((this.f1069f & 8) == 8) && !this.j.g()) {
                return false;
            }
            if (((this.f1069f & 32) == 32) && !this.l.g()) {
                return false;
            }
            for (int i3 = 0; i3 < this.n.size(); i3++) {
                if (!this.n.get(i3).g()) {
                    return false;
                }
            }
            return h();
        }

        public i0 i() {
            i0 i0Var = new i0(this, null);
            int i2 = this.f1069f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            i0Var.f1066f = this.f1070g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            i0Var.f1067g = this.f1071h;
            if ((this.f1069f & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
                this.f1069f &= -5;
            }
            i0Var.f1068h = this.i;
            if ((i2 & 8) == 8) {
                i3 |= 4;
            }
            i0Var.i = this.j;
            if ((i2 & 16) == 16) {
                i3 |= 8;
            }
            i0Var.j = this.k;
            if ((i2 & 32) == 32) {
                i3 |= 16;
            }
            i0Var.k = this.l;
            if ((i2 & 64) == 64) {
                i3 |= 32;
            }
            i0Var.l = this.m;
            if ((this.f1069f & 128) == 128) {
                this.n = Collections.unmodifiableList(this.n);
                this.f1069f &= -129;
            }
            i0Var.m = this.n;
            if ((this.f1069f & 256) == 256) {
                this.o = Collections.unmodifiableList(this.o);
                this.f1069f &= -257;
            }
            i0Var.n = this.o;
            i0Var.f1065e = i3;
            return i0Var;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m35d() {
            return i0.q;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(i0 i0Var) {
            g0 g0Var;
            g0 g0Var2;
            if (i0Var == i0.q) {
                return this;
            }
            boolean z = true;
            if ((i0Var.f1065e & 1) == 1) {
                int i2 = i0Var.f1066f;
                this.f1069f |= 1;
                this.f1070g = i2;
            }
            if ((i0Var.f1065e & 2) == 2) {
                int i3 = i0Var.f1067g;
                this.f1069f = 2 | this.f1069f;
                this.f1071h = i3;
            }
            if (!i0Var.f1068h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = i0Var.f1068h;
                    this.f1069f &= -5;
                } else {
                    if ((this.f1069f & 4) != 4) {
                        this.i = new ArrayList(this.i);
                        this.f1069f |= 4;
                    }
                    this.i.addAll(i0Var.f1068h);
                }
            }
            if (i0Var.m()) {
                g0 g0Var3 = i0Var.i;
                if ((this.f1069f & 8) == 8 && (g0Var2 = this.j) != g0.v) {
                    g0Var3 = e.a.a.a.a.a(g0Var2, g0Var3);
                }
                this.j = g0Var3;
                this.f1069f |= 8;
            }
            if ((i0Var.f1065e & 8) == 8) {
                int i4 = i0Var.j;
                this.f1069f |= 16;
                this.k = i4;
            }
            if (i0Var.l()) {
                g0 g0Var4 = i0Var.k;
                if ((this.f1069f & 32) == 32 && (g0Var = this.l) != g0.v) {
                    g0Var4 = e.a.a.a.a.a(g0Var, g0Var4);
                }
                this.l = g0Var4;
                this.f1069f |= 32;
            }
            if ((i0Var.f1065e & 32) != 32) {
                z = false;
            }
            if (z) {
                int i5 = i0Var.l;
                this.f1069f |= 64;
                this.m = i5;
            }
            if (!i0Var.m.isEmpty()) {
                if (this.n.isEmpty()) {
                    this.n = i0Var.m;
                    this.f1069f &= -129;
                } else {
                    if ((this.f1069f & 128) != 128) {
                        this.n = new ArrayList(this.n);
                        this.f1069f |= 128;
                    }
                    this.n.addAll(i0Var.m);
                }
            }
            if (!i0Var.n.isEmpty()) {
                if (this.o.isEmpty()) {
                    this.o = i0Var.n;
                    this.f1069f &= -257;
                } else {
                    if ((this.f1069f & 256) != 256) {
                        this.o = new ArrayList(this.o);
                        this.f1069f |= 256;
                    }
                    this.o.addAll(i0Var.n);
                }
            }
            a((i.d) i0Var);
            this.f1390c = this.f1390c.b(i0Var.f1064d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            i0 i0Var;
            i0 i0Var2 = null;
            try {
                i0 a2 = i0.r.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                i0Var = (i0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                i0Var2 = i0Var;
            }
            if (i0Var2 != null) {
                a(i0Var2);
            }
            throw th;
        }
    }

    static {
        i0 i0Var = new i0();
        q = i0Var;
        i0Var.n();
    }

    public i0() {
        this.o = -1;
        this.p = -1;
        this.f1064d = d.f1366c;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ i0(e eVar, g gVar, a aVar) {
        Object obj;
        List list;
        Object obj2;
        this.o = -1;
        this.p = -1;
        n();
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                g0.c cVar = null;
                switch (j2) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f1065e |= 1;
                        this.f1066f = eVar.g();
                        break;
                    case 16:
                        this.f1065e |= 2;
                        this.f1067g = eVar.g();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.f1068h = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f1068h;
                        obj2 = l0.p;
                        obj = eVar.a((s) obj2, gVar);
                        list.add(obj);
                        break;
                    case 34:
                        cVar = (this.f1065e & 4) == 4 ? this.i.e() : cVar;
                        g0 g0Var = (g0) eVar.a(g0.w, gVar);
                        this.i = g0Var;
                        if (cVar != null) {
                            cVar.a(g0Var);
                            this.i = cVar.i();
                        }
                        this.f1065e |= 4;
                        break;
                    case 40:
                        this.f1065e |= 8;
                        this.j = eVar.g();
                        break;
                    case 50:
                        cVar = (this.f1065e & 16) == 16 ? this.k.e() : cVar;
                        g0 g0Var2 = (g0) eVar.a(g0.w, gVar);
                        this.k = g0Var2;
                        if (cVar != null) {
                            cVar.a(g0Var2);
                            this.k = cVar.i();
                        }
                        this.f1065e |= 16;
                        break;
                    case 56:
                        this.f1065e |= 32;
                        this.l = eVar.g();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.m = new ArrayList();
                            z2 |= true;
                        }
                        list = this.m;
                        obj2 = b.j;
                        obj = eVar.a((s) obj2, gVar);
                        list.add(obj);
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.n = new ArrayList();
                            z2 |= true;
                        }
                        list = this.n;
                        obj = Integer.valueOf(eVar.g());
                        list.add(obj);
                        break;
                    case 250:
                        int c2 = eVar.c(eVar.g());
                        if (!(z2 & true) && eVar.a() > 0) {
                            this.n = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.a() > 0) {
                            this.n.add(Integer.valueOf(eVar.g()));
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
            } catch (k e2) {
                e2.f1407c = this;
                throw e2;
            } catch (IOException e3) {
                k kVar = new k(e3.getMessage());
                kVar.f1407c = this;
                throw kVar;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f1068h = Collections.unmodifiableList(this.f1068h);
                }
                if (z2 & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                if (z2 & true) {
                    this.n = Collections.unmodifiableList(this.n);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1064d = i2.l();
                    throw th2;
                }
                this.f1064d = i2.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 & true) {
            this.f1068h = Collections.unmodifiableList(this.f1068h);
        }
        if (z2 & true) {
            this.m = Collections.unmodifiableList(this.m);
        }
        if (z2 & true) {
            this.n = Collections.unmodifiableList(this.n);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1064d = i2.l();
            throw th3;
        }
        this.f1064d = i2.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1065e & 1) == 1) {
            fVar.b(1, this.f1066f);
        }
        if ((this.f1065e & 2) == 2) {
            fVar.b(2, this.f1067g);
        }
        for (int i2 = 0; i2 < this.f1068h.size(); i2++) {
            fVar.a(3, this.f1068h.get(i2));
        }
        if ((this.f1065e & 4) == 4) {
            fVar.a(4, this.i);
        }
        if ((this.f1065e & 8) == 8) {
            fVar.b(5, this.j);
        }
        if ((this.f1065e & 16) == 16) {
            fVar.a(6, this.k);
        }
        if ((this.f1065e & 32) == 32) {
            fVar.b(7, this.l);
        }
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            fVar.a(8, this.m.get(i3));
        }
        for (int i4 = 0; i4 < this.n.size(); i4++) {
            fVar.b(31, this.n.get(i4).intValue());
        }
        k2.a(200, fVar);
        fVar.b(this.f1064d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.p;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1065e & 1) == 1 ? f.e(1, this.f1066f) + 0 : 0;
        if ((this.f1065e & 2) == 2) {
            e2 += f.e(2, this.f1067g);
        }
        for (int i3 = 0; i3 < this.f1068h.size(); i3++) {
            e2 += f.b(3, this.f1068h.get(i3));
        }
        if ((this.f1065e & 4) == 4) {
            e2 += f.b(4, this.i);
        }
        if ((this.f1065e & 8) == 8) {
            e2 += f.e(5, this.j);
        }
        if ((this.f1065e & 16) == 16) {
            e2 += f.b(6, this.k);
        }
        if ((this.f1065e & 32) == 32) {
            e2 += f.e(7, this.l);
        }
        for (int i4 = 0; i4 < this.m.size(); i4++) {
            e2 += f.b(8, this.m.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.n.size(); i6++) {
            i5 += f.f(this.n.get(i6).intValue());
        }
        int size = this.f1064d.size() + i() + (this.n.size() * 2) + e2 + i5;
        this.p = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return q;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<i0> f() {
        return r;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.o;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1065e & 2) == 2)) {
            this.o = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f1068h.size(); i2++) {
            if (!this.f1068h.get(i2).g()) {
                this.o = 0;
                return false;
            }
        }
        if (m() && !this.i.g()) {
            this.o = 0;
            return false;
        } else if (!l() || this.k.g()) {
            for (int i3 = 0; i3 < this.m.size(); i3++) {
                if (!this.m.get(i3).g()) {
                    this.o = 0;
                    return false;
                }
            }
            if (!h()) {
                this.o = 0;
                return false;
            }
            this.o = 1;
            return true;
        } else {
            this.o = 0;
            return false;
        }
    }

    public boolean l() {
        return (this.f1065e & 16) == 16;
    }

    public boolean m() {
        return (this.f1065e & 4) == 4;
    }

    public final void n() {
        this.f1066f = 6;
        this.f1067g = 0;
        this.f1068h = Collections.emptyList();
        g0 g0Var = g0.v;
        this.i = g0Var;
        this.j = 0;
        this.k = g0Var;
        this.l = 0;
        this.m = Collections.emptyList();
        this.n = Collections.emptyList();
    }

    public /* synthetic */ i0(i.c cVar, a aVar) {
        super(cVar);
        this.o = -1;
        this.p = -1;
        this.f1064d = cVar.f1390c;
    }
}
