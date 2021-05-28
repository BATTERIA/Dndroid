package a.a.a.a.v0.e;

import a.a.a.a.v0.e.n0;
import a.a.a.a.v0.e.t0;
import a.a.a.a.v0.h.d;
import a.a.a.a.v0.h.e;
import a.a.a.a.v0.h.f;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.h.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class v extends i.d<v> implements y {
    public static final v m;
    public static s<v> n = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1203d;

    /* renamed from: e  reason: collision with root package name */
    public int f1204e;

    /* renamed from: f  reason: collision with root package name */
    public List<r> f1205f;

    /* renamed from: g  reason: collision with root package name */
    public List<z> f1206g;

    /* renamed from: h  reason: collision with root package name */
    public List<i0> f1207h;
    public n0 i;
    public t0 j;
    public byte k;
    public int l;

    public static class a extends a.a.a.a.v0.h.b<v> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new v(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<v, b> implements y {

        /* renamed from: f  reason: collision with root package name */
        public int f1208f;

        /* renamed from: g  reason: collision with root package name */
        public List<r> f1209g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        public List<z> f1210h = Collections.emptyList();
        public List<i0> i = Collections.emptyList();
        public n0 j = n0.i;
        public t0 k = t0.f1189g;

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((v) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            v i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new a.a.a.a.v0.h.v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m58clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return v.m;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i2 = 0; i2 < this.f1209g.size(); i2++) {
                if (!this.f1209g.get(i2).g()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.f1210h.size(); i3++) {
                if (!this.f1210h.get(i3).g()) {
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.i.size(); i4++) {
                if (!this.i.get(i4).g()) {
                    return false;
                }
            }
            if ((!((this.f1208f & 8) == 8) || this.j.g()) && h()) {
                return true;
            }
            return false;
        }

        public v i() {
            v vVar = new v(this, null);
            int i2 = this.f1208f;
            int i3 = 1;
            if ((i2 & 1) == 1) {
                this.f1209g = Collections.unmodifiableList(this.f1209g);
                this.f1208f &= -2;
            }
            vVar.f1205f = this.f1209g;
            if ((this.f1208f & 2) == 2) {
                this.f1210h = Collections.unmodifiableList(this.f1210h);
                this.f1208f &= -3;
            }
            vVar.f1206g = this.f1210h;
            if ((this.f1208f & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
                this.f1208f &= -5;
            }
            vVar.f1207h = this.i;
            if ((i2 & 8) != 8) {
                i3 = 0;
            }
            vVar.i = this.j;
            if ((i2 & 16) == 16) {
                i3 |= 2;
            }
            vVar.j = this.k;
            vVar.f1204e = i3;
            return vVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m59d() {
            return v.m;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(v vVar) {
            t0 t0Var;
            n0 n0Var;
            if (vVar == v.m) {
                return this;
            }
            boolean z = true;
            if (!vVar.f1205f.isEmpty()) {
                if (this.f1209g.isEmpty()) {
                    this.f1209g = vVar.f1205f;
                    this.f1208f &= -2;
                } else {
                    if ((this.f1208f & 1) != 1) {
                        this.f1209g = new ArrayList(this.f1209g);
                        this.f1208f |= 1;
                    }
                    this.f1209g.addAll(vVar.f1205f);
                }
            }
            if (!vVar.f1206g.isEmpty()) {
                if (this.f1210h.isEmpty()) {
                    this.f1210h = vVar.f1206g;
                    this.f1208f &= -3;
                } else {
                    if ((this.f1208f & 2) != 2) {
                        this.f1210h = new ArrayList(this.f1210h);
                        this.f1208f |= 2;
                    }
                    this.f1210h.addAll(vVar.f1206g);
                }
            }
            if (!vVar.f1207h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = vVar.f1207h;
                    this.f1208f &= -5;
                } else {
                    if ((this.f1208f & 4) != 4) {
                        this.i = new ArrayList(this.i);
                        this.f1208f |= 4;
                    }
                    this.i.addAll(vVar.f1207h);
                }
            }
            if ((vVar.f1204e & 1) == 1) {
                n0 n0Var2 = vVar.i;
                if ((this.f1208f & 8) == 8 && (n0Var = this.j) != n0.i) {
                    n0.b a2 = n0.a(n0Var);
                    a2.a(n0Var2);
                    n0Var2 = a2.h();
                }
                this.j = n0Var2;
                this.f1208f |= 8;
            }
            if ((vVar.f1204e & 2) != 2) {
                z = false;
            }
            if (z) {
                t0 t0Var2 = vVar.j;
                if ((this.f1208f & 16) == 16 && (t0Var = this.k) != t0.f1189g) {
                    t0.b a3 = t0.a(t0Var);
                    a3.a(t0Var2);
                    t0Var2 = a3.h();
                }
                this.k = t0Var2;
                this.f1208f |= 16;
            }
            a((i.d) vVar);
            this.f1390c = this.f1390c.b(vVar.f1203d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            v vVar;
            v vVar2 = null;
            try {
                v a2 = v.n.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                vVar = (v) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                a(vVar2);
            }
            throw th;
        }
    }

    static {
        v vVar = new v();
        m = vVar;
        vVar.l();
    }

    public v() {
        this.k = -1;
        this.l = -1;
        this.f1203d = d.f1366c;
    }

    public /* synthetic */ v(e eVar, g gVar, a aVar) {
        List list;
        Object obj;
        this.k = -1;
        this.l = -1;
        l();
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 26) {
                        if (!z2 || !true) {
                            this.f1205f = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f1205f;
                        obj = r.u;
                    } else if (j2 == 34) {
                        if (!(z2 & true)) {
                            this.f1206g = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f1206g;
                        obj = z.u;
                    } else if (j2 != 42) {
                        n0.b bVar = null;
                        t0.b bVar2 = null;
                        if (j2 == 242) {
                            if ((this.f1204e & 1) == 1) {
                                n0 n0Var = this.i;
                                if (n0Var != null) {
                                    bVar = n0.a(n0Var);
                                } else {
                                    throw null;
                                }
                            }
                            n0 n0Var2 = (n0) eVar.a(n0.j, gVar);
                            this.i = n0Var2;
                            if (bVar != null) {
                                bVar.a(n0Var2);
                                this.i = bVar.h();
                            }
                            this.f1204e |= 1;
                        } else if (j2 == 258) {
                            if ((this.f1204e & 2) == 2) {
                                t0 t0Var = this.j;
                                if (t0Var != null) {
                                    bVar2 = t0.a(t0Var);
                                } else {
                                    throw null;
                                }
                            }
                            t0 t0Var2 = (t0) eVar.a(t0.f1190h, gVar);
                            this.j = t0Var2;
                            if (bVar2 != null) {
                                bVar2.a(t0Var2);
                                this.j = bVar2.h();
                            }
                            this.f1204e |= 2;
                        } else if (!a(eVar, a2, gVar, j2)) {
                        }
                    } else {
                        if (!(z2 & true)) {
                            this.f1207h = new ArrayList();
                            z2 |= true;
                        }
                        list = this.f1207h;
                        obj = i0.r;
                    }
                    list.add(eVar.a(obj == 1 ? 1 : 0, gVar));
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
                if (z2 && true) {
                    this.f1205f = Collections.unmodifiableList(this.f1205f);
                }
                if (z2 & true) {
                    this.f1206g = Collections.unmodifiableList(this.f1206g);
                }
                if (z2 & true) {
                    this.f1207h = Collections.unmodifiableList(this.f1207h);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1203d = i2.l();
                    throw th2;
                }
                this.f1203d = i2.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 && true) {
            this.f1205f = Collections.unmodifiableList(this.f1205f);
        }
        if (z2 & true) {
            this.f1206g = Collections.unmodifiableList(this.f1206g);
        }
        if (z2 & true) {
            this.f1207h = Collections.unmodifiableList(this.f1207h);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1203d = i2.l();
            throw th3;
        }
        this.f1203d = i2.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        for (int i2 = 0; i2 < this.f1205f.size(); i2++) {
            fVar.a(3, this.f1205f.get(i2));
        }
        for (int i3 = 0; i3 < this.f1206g.size(); i3++) {
            fVar.a(4, this.f1206g.get(i3));
        }
        for (int i4 = 0; i4 < this.f1207h.size(); i4++) {
            fVar.a(5, this.f1207h.get(i4));
        }
        if ((this.f1204e & 1) == 1) {
            fVar.a(30, this.i);
        }
        if ((this.f1204e & 2) == 2) {
            fVar.a(32, this.j);
        }
        k2.a(200, fVar);
        fVar.b(this.f1203d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1205f.size(); i4++) {
            i3 += f.b(3, this.f1205f.get(i4));
        }
        for (int i5 = 0; i5 < this.f1206g.size(); i5++) {
            i3 += f.b(4, this.f1206g.get(i5));
        }
        for (int i6 = 0; i6 < this.f1207h.size(); i6++) {
            i3 += f.b(5, this.f1207h.get(i6));
        }
        if ((this.f1204e & 1) == 1) {
            i3 += f.b(30, this.i);
        }
        if ((this.f1204e & 2) == 2) {
            i3 += f.b(32, this.j);
        }
        int size = this.f1203d.size() + i() + i3;
        this.l = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return m;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<v> f() {
        return n;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1205f.size(); i2++) {
            if (!this.f1205f.get(i2).g()) {
                this.k = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f1206g.size(); i3++) {
            if (!this.f1206g.get(i3).g()) {
                this.k = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f1207h.size(); i4++) {
            if (!this.f1207h.get(i4).g()) {
                this.k = 0;
                return false;
            }
        }
        if (((this.f1204e & 1) == 1) && !this.i.g()) {
            this.k = 0;
            return false;
        } else if (!h()) {
            this.k = 0;
            return false;
        } else {
            this.k = 1;
            return true;
        }
    }

    public final void l() {
        this.f1205f = Collections.emptyList();
        this.f1206g = Collections.emptyList();
        this.f1207h = Collections.emptyList();
        this.i = n0.i;
        this.j = t0.f1189g;
    }

    public /* synthetic */ v(i.c cVar, a aVar) {
        super(cVar);
        this.k = -1;
        this.l = -1;
        this.f1203d = cVar.f1390c;
    }
}
