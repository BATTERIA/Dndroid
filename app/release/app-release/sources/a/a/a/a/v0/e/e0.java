package a.a.a.a.v0.e;

import a.a.a.a.v0.h.d;
import a.a.a.a.v0.h.e;
import a.a.a.a.v0.h.f;
import a.a.a.a.v0.h.g;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.k;
import a.a.a.a.v0.h.n;
import a.a.a.a.v0.h.o;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.h.s;
import a.a.a.a.v0.h.v;
import java.io.IOException;

public final class e0 extends i implements f0 {

    /* renamed from: g  reason: collision with root package name */
    public static final e0 f1010g;

    /* renamed from: h  reason: collision with root package name */
    public static s<e0> f1011h = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f1012c;

    /* renamed from: d  reason: collision with root package name */
    public o f1013d;

    /* renamed from: e  reason: collision with root package name */
    public byte f1014e;

    /* renamed from: f  reason: collision with root package name */
    public int f1015f;

    public static class a extends a.a.a.a.v0.h.b<e0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new e0(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<e0, b> implements f0 {

        /* renamed from: d  reason: collision with root package name */
        public int f1016d;

        /* renamed from: e  reason: collision with root package name */
        public o f1017e = n.f1412d;

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(e0 e0Var) {
            a(e0Var);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            e0 h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m24clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public e0 d() {
            return e0.f1010g;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            return true;
        }

        public e0 h() {
            e0 e0Var = new e0(this, null);
            if ((this.f1016d & 1) == 1) {
                this.f1017e = this.f1017e.b();
                this.f1016d &= -2;
            }
            e0Var.f1013d = this.f1017e;
            return e0Var;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public e0 m25d() {
            return e0.f1010g;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(e0 e0Var) {
            if (e0Var == e0.f1010g) {
                return this;
            }
            if (!e0Var.f1013d.isEmpty()) {
                if (this.f1017e.isEmpty()) {
                    this.f1017e = e0Var.f1013d;
                    this.f1016d &= -2;
                } else {
                    if ((this.f1016d & 1) != 1) {
                        this.f1017e = new n(this.f1017e);
                        this.f1016d |= 1;
                    }
                    this.f1017e.addAll(e0Var.f1013d);
                }
            }
            this.f1390c = this.f1390c.b(e0Var.f1012c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            e0 e0Var;
            e0 e0Var2 = null;
            try {
                e0 a2 = e0.f1011h.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                e0Var = (e0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                e0Var2 = e0Var;
            }
            if (e0Var2 != null) {
                a(e0Var2);
            }
            throw th;
        }
    }

    static {
        e0 e0Var = new e0();
        f1010g = e0Var;
        e0Var.f1013d = n.f1412d;
    }

    public e0() {
        this.f1014e = -1;
        this.f1015f = -1;
        this.f1012c = d.f1366c;
    }

    public /* synthetic */ e0(e eVar, g gVar, a aVar) {
        this.f1014e = -1;
        this.f1015f = -1;
        this.f1013d = n.f1412d;
        d.b i = d.i();
        f a2 = f.a(i, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j = eVar.j();
                if (j != 0) {
                    if (j == 10) {
                        d c2 = eVar.c();
                        if (!z2 || !true) {
                            this.f1013d = new n();
                            z2 |= true;
                        }
                        this.f1013d.a(c2);
                    } else if (!eVar.a(j, a2)) {
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
                if (z2 && true) {
                    this.f1013d = this.f1013d.b();
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1012c = i.l();
                    throw th2;
                }
                this.f1012c = i.l();
                throw th;
            }
        }
        if (z2 && true) {
            this.f1013d = this.f1013d.b();
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1012c = i.l();
            throw th3;
        }
        this.f1012c = i.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        for (int i = 0; i < this.f1013d.size(); i++) {
            d a2 = this.f1013d.a(i);
            fVar.e(10);
            fVar.a(a2);
        }
        fVar.b(this.f1012c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i = this.f1015f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1013d.size(); i3++) {
            i2 += f.c(this.f1013d.a(i3));
        }
        int size = this.f1012c.size() + (this.f1013d.size() * 1) + 0 + i2;
        this.f1015f = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return f1010g;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<e0> f() {
        return f1011h;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.f1014e;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f1014e = 1;
        return true;
    }

    public /* synthetic */ e0(i.b bVar, a aVar) {
        super(bVar);
        this.f1014e = -1;
        this.f1015f = -1;
        this.f1012c = bVar.f1390c;
    }
}
