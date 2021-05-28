package a.a.a.a.v0.e;

import a.a.a.a.v0.e.b0;
import a.a.a.a.v0.e.e0;
import a.a.a.a.v0.e.v;
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

public final class w extends i.d<w> implements x {
    public static final w l;
    public static s<w> m = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1217d;

    /* renamed from: e  reason: collision with root package name */
    public int f1218e;

    /* renamed from: f  reason: collision with root package name */
    public e0 f1219f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f1220g;

    /* renamed from: h  reason: collision with root package name */
    public v f1221h;
    public List<f> i;
    public byte j;
    public int k;

    public static class a extends a.a.a.a.v0.h.b<w> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new w(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<w, b> implements x {

        /* renamed from: f  reason: collision with root package name */
        public int f1222f;

        /* renamed from: g  reason: collision with root package name */
        public e0 f1223g = e0.f1010g;

        /* renamed from: h  reason: collision with root package name */
        public b0 f1224h = b0.f987g;
        public v i = v.m;
        public List<f> j = Collections.emptyList();

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((w) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            w i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m60clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return w.l;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (((this.f1222f & 2) == 2) && !this.f1224h.g()) {
                return false;
            }
            if (((this.f1222f & 4) == 4) && !this.i.g()) {
                return false;
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (!this.j.get(i2).g()) {
                    return false;
                }
            }
            return h();
        }

        public w i() {
            w wVar = new w(this, null);
            int i2 = this.f1222f;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            wVar.f1219f = this.f1223g;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            wVar.f1220g = this.f1224h;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            wVar.f1221h = this.i;
            if ((this.f1222f & 8) == 8) {
                this.j = Collections.unmodifiableList(this.j);
                this.f1222f &= -9;
            }
            wVar.i = this.j;
            wVar.f1218e = i3;
            return wVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m61d() {
            return w.l;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(w wVar) {
            v vVar;
            b0 b0Var;
            e0 e0Var;
            if (wVar == w.l) {
                return this;
            }
            boolean z = true;
            if ((wVar.f1218e & 1) == 1) {
                e0 e0Var2 = wVar.f1219f;
                if ((this.f1222f & 1) == 1 && (e0Var = this.f1223g) != e0.f1010g) {
                    e0.b bVar = new e0.b();
                    bVar.a(e0Var);
                    bVar.a(e0Var2);
                    e0Var2 = bVar.h();
                }
                this.f1223g = e0Var2;
                this.f1222f |= 1;
            }
            if ((wVar.f1218e & 2) == 2) {
                b0 b0Var2 = wVar.f1220g;
                if ((this.f1222f & 2) == 2 && (b0Var = this.f1224h) != b0.f987g) {
                    b0.b bVar2 = new b0.b();
                    bVar2.a(b0Var);
                    bVar2.a(b0Var2);
                    b0Var2 = bVar2.h();
                }
                this.f1224h = b0Var2;
                this.f1222f |= 2;
            }
            if ((wVar.f1218e & 4) != 4) {
                z = false;
            }
            if (z) {
                v vVar2 = wVar.f1221h;
                if ((this.f1222f & 4) == 4 && (vVar = this.i) != v.m) {
                    v.b bVar3 = new v.b();
                    bVar3.a(vVar);
                    bVar3.a(vVar2);
                    vVar2 = bVar3.i();
                }
                this.i = vVar2;
                this.f1222f |= 4;
            }
            if (!wVar.i.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = wVar.i;
                    this.f1222f &= -9;
                } else {
                    if ((this.f1222f & 8) != 8) {
                        this.j = new ArrayList(this.j);
                        this.f1222f |= 8;
                    }
                    this.j.addAll(wVar.i);
                }
            }
            a((i.d) wVar);
            this.f1390c = this.f1390c.b(wVar.f1217d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            w wVar;
            w wVar2 = null;
            try {
                w a2 = w.m.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                wVar = (w) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                a(wVar2);
            }
            throw th;
        }
    }

    static {
        w wVar = new w();
        l = wVar;
        wVar.f1219f = e0.f1010g;
        wVar.f1220g = b0.f987g;
        wVar.f1221h = v.m;
        wVar.i = Collections.emptyList();
    }

    public w() {
        this.j = -1;
        this.k = -1;
        this.f1217d = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v27, resolved type: java.util.List<a.a.a.a.v0.e.f> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w(e eVar, g gVar, a aVar) {
        int i2;
        this.j = -1;
        this.k = -1;
        this.f1219f = e0.f1010g;
        this.f1220g = b0.f987g;
        this.f1221h = v.m;
        this.i = Collections.emptyList();
        d.b i3 = d.i();
        f a2 = f.a(i3, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    e0.b bVar = null;
                    v.b bVar2 = null;
                    b0.b bVar3 = null;
                    if (j2 != 10) {
                        if (j2 == 18) {
                            i2 = 2;
                            if ((this.f1218e & 2) == 2) {
                                b0 b0Var = this.f1220g;
                                if (b0Var != null) {
                                    bVar3 = new b0.b();
                                    bVar3.a(b0Var);
                                } else {
                                    throw null;
                                }
                            }
                            b0 b0Var2 = (b0) eVar.a(b0.f988h, gVar);
                            this.f1220g = b0Var2;
                            if (bVar3 != null) {
                                bVar3.a(b0Var2);
                                this.f1220g = bVar3.h();
                            }
                        } else if (j2 == 26) {
                            i2 = 4;
                            if ((this.f1218e & 4) == 4) {
                                v vVar = this.f1221h;
                                if (vVar != null) {
                                    bVar2 = new v.b();
                                    bVar2.a(vVar);
                                } else {
                                    throw null;
                                }
                            }
                            v vVar2 = (v) eVar.a(v.n, gVar);
                            this.f1221h = vVar2;
                            if (bVar2 != null) {
                                bVar2.a(vVar2);
                                this.f1221h = bVar2.i();
                            }
                        } else if (j2 == 34) {
                            if (!(z2 & true)) {
                                this.i = new ArrayList();
                                z2 |= true;
                            }
                            this.i.add(eVar.a(f.B, gVar));
                        } else if (!a(eVar, a2, gVar, j2)) {
                        }
                        this.f1218e |= i2;
                    } else {
                        if ((this.f1218e & 1) == 1) {
                            e0 e0Var = this.f1219f;
                            if (e0Var != null) {
                                bVar = new e0.b();
                                bVar.a(e0Var);
                            } else {
                                throw null;
                            }
                        }
                        e0 e0Var2 = (e0) eVar.a(e0.f1011h, gVar);
                        this.f1219f = e0Var2;
                        if (bVar != null) {
                            bVar.a(e0Var2);
                            this.f1219f = bVar.h();
                        }
                        this.f1218e |= 1;
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
                    this.i = Collections.unmodifiableList(this.i);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1217d = i3.l();
                    throw th2;
                }
                this.f1217d = i3.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 & true) {
            this.i = Collections.unmodifiableList(this.i);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1217d = i3.l();
            throw th3;
        }
        this.f1217d = i3.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1218e & 1) == 1) {
            fVar.a(1, this.f1219f);
        }
        if ((this.f1218e & 2) == 2) {
            fVar.a(2, this.f1220g);
        }
        if ((this.f1218e & 4) == 4) {
            fVar.a(3, this.f1221h);
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            fVar.a(4, this.i.get(i2));
        }
        k2.a(200, fVar);
        fVar.b(this.f1217d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        int b2 = (this.f1218e & 1) == 1 ? f.b(1, this.f1219f) + 0 : 0;
        if ((this.f1218e & 2) == 2) {
            b2 += f.b(2, this.f1220g);
        }
        if ((this.f1218e & 4) == 4) {
            b2 += f.b(3, this.f1221h);
        }
        for (int i3 = 0; i3 < this.i.size(); i3++) {
            b2 += f.b(4, this.i.get(i3));
        }
        int size = this.f1217d.size() + i() + b2;
        this.k = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return l;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<w> f() {
        return m;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.j;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1218e & 2) == 2) || this.f1220g.g()) {
            if (!((this.f1218e & 4) == 4) || this.f1221h.g()) {
                for (int i2 = 0; i2 < this.i.size(); i2++) {
                    if (!this.i.get(i2).g()) {
                        this.j = 0;
                        return false;
                    }
                }
                if (!h()) {
                    this.j = 0;
                    return false;
                }
                this.j = 1;
                return true;
            }
            this.j = 0;
            return false;
        }
        this.j = 0;
        return false;
    }

    public /* synthetic */ w(i.c cVar, a aVar) {
        super(cVar);
        this.j = -1;
        this.k = -1;
        this.f1217d = cVar.f1390c;
    }
}
