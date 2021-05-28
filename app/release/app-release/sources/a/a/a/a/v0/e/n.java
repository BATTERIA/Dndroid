package a.a.a.a.v0.e;

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

public final class n extends i.d<n> implements o {
    public static final n i;
    public static s<n> j = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1114d;

    /* renamed from: e  reason: collision with root package name */
    public int f1115e;

    /* renamed from: f  reason: collision with root package name */
    public int f1116f;

    /* renamed from: g  reason: collision with root package name */
    public byte f1117g;

    /* renamed from: h  reason: collision with root package name */
    public int f1118h;

    public static class a extends a.a.a.a.v0.h.b<n> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new n(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<n, b> implements o {

        /* renamed from: f  reason: collision with root package name */
        public int f1119f;

        /* renamed from: g  reason: collision with root package name */
        public int f1120g;

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((n) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            n i = i();
            if (i.g()) {
                return i;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m42clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return n.i;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            return h();
        }

        public n i() {
            n nVar = new n(this, null);
            int i = 1;
            if ((this.f1119f & 1) != 1) {
                i = 0;
            }
            nVar.f1116f = this.f1120g;
            nVar.f1115e = i;
            return nVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m43d() {
            return n.i;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(n nVar) {
            if (nVar == n.i) {
                return this;
            }
            if ((nVar.f1115e & 1) == 1) {
                int i = nVar.f1116f;
                this.f1119f = 1 | this.f1119f;
                this.f1120g = i;
            }
            a((i.d) nVar);
            this.f1390c = this.f1390c.b(nVar.f1114d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            n nVar;
            n nVar2 = null;
            try {
                n a2 = n.j.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                nVar = (n) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                a(nVar2);
            }
            throw th;
        }
    }

    static {
        n nVar = new n();
        i = nVar;
        nVar.f1116f = 0;
    }

    public n() {
        this.f1117g = -1;
        this.f1118h = -1;
        this.f1114d = d.f1366c;
    }

    public /* synthetic */ n(e eVar, g gVar, a aVar) {
        this.f1117g = -1;
        this.f1118h = -1;
        boolean z = false;
        this.f1116f = 0;
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        this.f1115e |= 1;
                        this.f1116f = eVar.g();
                    } else if (!a(eVar, a2, gVar, j2)) {
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
                    this.f1114d = i2.l();
                    throw th2;
                }
                this.f1114d = i2.l();
                this.f1393c.b();
                throw th;
            }
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1114d = i2.l();
            throw th3;
        }
        this.f1114d = i2.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k = k();
        if ((this.f1115e & 1) == 1) {
            fVar.b(1, this.f1116f);
        }
        k.a(200, fVar);
        fVar.b(this.f1114d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.f1118h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f1115e & 1) == 1) {
            i3 = 0 + f.e(1, this.f1116f);
        }
        int size = this.f1114d.size() + i() + i3;
        this.f1118h = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return i;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<n> f() {
        return j;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.f1117g;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!h()) {
            this.f1117g = 0;
            return false;
        }
        this.f1117g = 1;
        return true;
    }

    public /* synthetic */ n(i.c cVar, a aVar) {
        super(cVar);
        this.f1117g = -1;
        this.f1118h = -1;
        this.f1114d = cVar.f1390c;
    }
}
