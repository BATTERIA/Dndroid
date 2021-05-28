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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l0 extends i.d<l0> implements m0 {
    public static final l0 o;
    public static s<l0> p = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1101d;

    /* renamed from: e  reason: collision with root package name */
    public int f1102e;

    /* renamed from: f  reason: collision with root package name */
    public int f1103f;

    /* renamed from: g  reason: collision with root package name */
    public int f1104g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1105h;
    public c i;
    public List<g0> j;
    public List<Integer> k;
    public int l;
    public byte m;
    public int n;

    public static class a extends a.a.a.a.v0.h.b<l0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new l0(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<l0, b> implements m0 {

        /* renamed from: f  reason: collision with root package name */
        public int f1106f;

        /* renamed from: g  reason: collision with root package name */
        public int f1107g;

        /* renamed from: h  reason: collision with root package name */
        public int f1108h;
        public boolean i;
        public c j = c.INV;
        public List<g0> k = Collections.emptyList();
        public List<Integer> l = Collections.emptyList();

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((l0) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            l0 i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m40clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return l0.o;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f1106f & 1) == 1)) {
                return false;
            }
            if (!((this.f1106f & 2) == 2)) {
                return false;
            }
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                if (!this.k.get(i2).g()) {
                    return false;
                }
            }
            return h();
        }

        public l0 i() {
            l0 l0Var = new l0(this, null);
            int i2 = this.f1106f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            l0Var.f1103f = this.f1107g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            l0Var.f1104g = this.f1108h;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            l0Var.f1105h = this.i;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            l0Var.i = this.j;
            if ((this.f1106f & 16) == 16) {
                this.k = Collections.unmodifiableList(this.k);
                this.f1106f &= -17;
            }
            l0Var.j = this.k;
            if ((this.f1106f & 32) == 32) {
                this.l = Collections.unmodifiableList(this.l);
                this.f1106f &= -33;
            }
            l0Var.k = this.l;
            l0Var.f1102e = i3;
            return l0Var;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m41d() {
            return l0.o;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(l0 l0Var) {
            if (l0Var == l0.o) {
                return this;
            }
            boolean z = true;
            if ((l0Var.f1102e & 1) == 1) {
                int i2 = l0Var.f1103f;
                this.f1106f |= 1;
                this.f1107g = i2;
            }
            if ((l0Var.f1102e & 2) == 2) {
                int i3 = l0Var.f1104g;
                this.f1106f = 2 | this.f1106f;
                this.f1108h = i3;
            }
            if ((l0Var.f1102e & 4) == 4) {
                boolean z2 = l0Var.f1105h;
                this.f1106f = 4 | this.f1106f;
                this.i = z2;
            }
            if ((l0Var.f1102e & 8) != 8) {
                z = false;
            }
            if (z) {
                c cVar = l0Var.i;
                if (cVar != null) {
                    this.f1106f |= 8;
                    this.j = cVar;
                } else {
                    throw null;
                }
            }
            if (!l0Var.j.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = l0Var.j;
                    this.f1106f &= -17;
                } else {
                    if ((this.f1106f & 16) != 16) {
                        this.k = new ArrayList(this.k);
                        this.f1106f |= 16;
                    }
                    this.k.addAll(l0Var.j);
                }
            }
            if (!l0Var.k.isEmpty()) {
                if (this.l.isEmpty()) {
                    this.l = l0Var.k;
                    this.f1106f &= -33;
                } else {
                    if ((this.f1106f & 32) != 32) {
                        this.l = new ArrayList(this.l);
                        this.f1106f |= 32;
                    }
                    this.l.addAll(l0Var.k);
                }
            }
            a((i.d) l0Var);
            this.f1390c = this.f1390c.b(l0Var.f1101d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            l0 l0Var;
            l0 l0Var2 = null;
            try {
                l0 a2 = l0.p.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                l0Var = (l0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                l0Var2 = l0Var;
            }
            if (l0Var2 != null) {
                a(l0Var2);
            }
            throw th;
        }
    }

    public enum c implements j.a {
        IN(0),
        OUT(1),
        INV(2);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1113c;

        /* access modifiers changed from: public */
        c(int i) {
            this.f1113c = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1113c;
        }
    }

    static {
        l0 l0Var = new l0();
        o = l0Var;
        l0Var.l();
    }

    public l0() {
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.f1101d = d.f1366c;
    }

    public /* synthetic */ l0(e eVar, g gVar, a aVar) {
        Object obj;
        List list;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        l();
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        this.f1102e |= 1;
                        this.f1103f = eVar.g();
                    } else if (j2 == 16) {
                        this.f1102e |= 2;
                        this.f1104g = eVar.g();
                    } else if (j2 == 24) {
                        this.f1102e |= 4;
                        this.f1105h = eVar.b();
                    } else if (j2 != 32) {
                        if (j2 == 42) {
                            if (!(z2 & true)) {
                                this.j = new ArrayList();
                                z2 |= true;
                            }
                            list = this.j;
                            obj = eVar.a(g0.w, gVar);
                        } else if (j2 == 48) {
                            if (!(z2 & true)) {
                                this.k = new ArrayList();
                                z2 |= true;
                            }
                            list = this.k;
                            obj = Integer.valueOf(eVar.g());
                        } else if (j2 == 50) {
                            int c2 = eVar.c(eVar.g());
                            if (!(z2 & true) && eVar.a() > 0) {
                                this.k = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.a() > 0) {
                                this.k.add(Integer.valueOf(eVar.g()));
                            }
                            eVar.j = c2;
                            eVar.k();
                        } else if (!a(eVar, a2, gVar, j2)) {
                        }
                        list.add(obj);
                    } else {
                        int g2 = eVar.g();
                        c a3 = c.a(g2);
                        if (a3 == null) {
                            a2.e(j2);
                            a2.e(g2);
                        } else {
                            this.f1102e |= 8;
                            this.i = a3;
                        }
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
                if (z2 & true) {
                    this.j = Collections.unmodifiableList(this.j);
                }
                if (z2 & true) {
                    this.k = Collections.unmodifiableList(this.k);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1101d = i2.l();
                    throw th2;
                }
                this.f1101d = i2.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 & true) {
            this.j = Collections.unmodifiableList(this.j);
        }
        if (z2 & true) {
            this.k = Collections.unmodifiableList(this.k);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1101d = i2.l();
            throw th3;
        }
        this.f1101d = i2.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1102e & 1) == 1) {
            fVar.b(1, this.f1103f);
        }
        if ((this.f1102e & 2) == 2) {
            fVar.b(2, this.f1104g);
        }
        if ((this.f1102e & 4) == 4) {
            boolean z = this.f1105h;
            fVar.e(24);
            fVar.c(z ? 1 : 0);
        }
        if ((this.f1102e & 8) == 8) {
            fVar.a(4, this.i.f1113c);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            fVar.a(5, this.j.get(i2));
        }
        if (this.k.size() > 0) {
            fVar.e(50);
            fVar.e(this.l);
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            fVar.b(this.k.get(i3).intValue());
        }
        k2.a(1000, fVar);
        fVar.b(this.f1101d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.n;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1102e & 1) == 1 ? f.e(1, this.f1103f) + 0 : 0;
        if ((this.f1102e & 2) == 2) {
            e2 += f.e(2, this.f1104g);
        }
        if ((this.f1102e & 4) == 4) {
            e2 += f.h(3) + 1;
        }
        if ((this.f1102e & 8) == 8) {
            e2 += f.d(4, this.i.f1113c);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            e2 += f.b(5, this.j.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.k.size(); i5++) {
            i4 += f.f(this.k.get(i5).intValue());
        }
        int i6 = e2 + i4;
        if (!this.k.isEmpty()) {
            i6 = i6 + 1 + f.f(i4);
        }
        this.l = i4;
        int size = this.f1101d.size() + i() + i6;
        this.n = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return o;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<l0> f() {
        return p;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1102e & 1) == 1)) {
            this.m = 0;
            return false;
        }
        if (!((this.f1102e & 2) == 2)) {
            this.m = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            if (!this.j.get(i2).g()) {
                this.m = 0;
                return false;
            }
        }
        if (!h()) {
            this.m = 0;
            return false;
        }
        this.m = 1;
        return true;
    }

    public final void l() {
        this.f1103f = 0;
        this.f1104g = 0;
        this.f1105h = false;
        this.i = c.INV;
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
    }

    public /* synthetic */ l0(i.c cVar, a aVar) {
        super(cVar);
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.f1101d = cVar.f1390c;
    }
}
