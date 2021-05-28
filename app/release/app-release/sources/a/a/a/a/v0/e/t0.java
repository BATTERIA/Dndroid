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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class t0 extends i implements u0 {

    /* renamed from: g  reason: collision with root package name */
    public static final t0 f1189g;

    /* renamed from: h  reason: collision with root package name */
    public static s<t0> f1190h = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f1191c;

    /* renamed from: d  reason: collision with root package name */
    public List<r0> f1192d;

    /* renamed from: e  reason: collision with root package name */
    public byte f1193e;

    /* renamed from: f  reason: collision with root package name */
    public int f1194f;

    public static class a extends a.a.a.a.v0.h.b<t0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new t0(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<t0, b> implements u0 {

        /* renamed from: d  reason: collision with root package name */
        public int f1195d;

        /* renamed from: e  reason: collision with root package name */
        public List<r0> f1196e = Collections.emptyList();

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(t0 t0Var) {
            a(t0Var);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            t0 h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m56clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public t0 d() {
            return t0.f1189g;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            return true;
        }

        public t0 h() {
            t0 t0Var = new t0(this, null);
            if ((this.f1195d & 1) == 1) {
                this.f1196e = Collections.unmodifiableList(this.f1196e);
                this.f1195d &= -2;
            }
            t0Var.f1192d = this.f1196e;
            return t0Var;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public t0 m57d() {
            return t0.f1189g;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(t0 t0Var) {
            if (t0Var == t0.f1189g) {
                return this;
            }
            if (!t0Var.f1192d.isEmpty()) {
                if (this.f1196e.isEmpty()) {
                    this.f1196e = t0Var.f1192d;
                    this.f1195d &= -2;
                } else {
                    if ((this.f1195d & 1) != 1) {
                        this.f1196e = new ArrayList(this.f1196e);
                        this.f1195d |= 1;
                    }
                    this.f1196e.addAll(t0Var.f1192d);
                }
            }
            this.f1390c = this.f1390c.b(t0Var.f1191c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            t0 t0Var;
            t0 t0Var2 = null;
            try {
                t0 a2 = t0.f1190h.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                t0Var = (t0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                t0Var2 = t0Var;
            }
            if (t0Var2 != null) {
                a(t0Var2);
            }
            throw th;
        }
    }

    static {
        t0 t0Var = new t0();
        f1189g = t0Var;
        t0Var.f1192d = Collections.emptyList();
    }

    public t0() {
        this.f1193e = -1;
        this.f1194f = -1;
        this.f1191c = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.util.List<a.a.a.a.v0.e.r0> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t0(e eVar, g gVar, a aVar) {
        this.f1193e = -1;
        this.f1194f = -1;
        this.f1192d = Collections.emptyList();
        d.b i = d.i();
        f a2 = f.a(i, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j = eVar.j();
                if (j != 0) {
                    if (j == 10) {
                        if (!z2 || !true) {
                            this.f1192d = new ArrayList();
                            z2 |= true;
                        }
                        this.f1192d.add(eVar.a(r0.n, gVar));
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
                    this.f1192d = Collections.unmodifiableList(this.f1192d);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1191c = i.l();
                    throw th2;
                }
                this.f1191c = i.l();
                throw th;
            }
        }
        if (z2 && true) {
            this.f1192d = Collections.unmodifiableList(this.f1192d);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1191c = i.l();
            throw th3;
        }
        this.f1191c = i.l();
    }

    public static b a(t0 t0Var) {
        b bVar = new b();
        bVar.a(t0Var);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        for (int i = 0; i < this.f1192d.size(); i++) {
            fVar.a(1, this.f1192d.get(i));
        }
        fVar.b(this.f1191c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i = this.f1194f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1192d.size(); i3++) {
            i2 += f.b(1, this.f1192d.get(i3));
        }
        int size = this.f1191c.size() + i2;
        this.f1194f = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return f1189g;
    }

    @Override // a.a.a.a.v0.h.q
    public b e() {
        return a(this);
    }

    @Override // a.a.a.a.v0.h.q
    /* renamed from: e  reason: collision with other method in class */
    public q.a m55e() {
        return a(this);
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<t0> f() {
        return f1190h;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.f1193e;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f1193e = 1;
        return true;
    }

    public /* synthetic */ t0(i.b bVar, a aVar) {
        super(bVar);
        this.f1193e = -1;
        this.f1194f = -1;
        this.f1191c = bVar.f1390c;
    }
}
