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

public final class n0 extends i implements o0 {
    public static final n0 i;
    public static s<n0> j = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f1121c;

    /* renamed from: d  reason: collision with root package name */
    public int f1122d;

    /* renamed from: e  reason: collision with root package name */
    public List<g0> f1123e;

    /* renamed from: f  reason: collision with root package name */
    public int f1124f;

    /* renamed from: g  reason: collision with root package name */
    public byte f1125g;

    /* renamed from: h  reason: collision with root package name */
    public int f1126h;

    public static class a extends a.a.a.a.v0.h.b<n0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new n0(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<n0, b> implements o0 {

        /* renamed from: d  reason: collision with root package name */
        public int f1127d;

        /* renamed from: e  reason: collision with root package name */
        public List<g0> f1128e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        public int f1129f = -1;

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(n0 n0Var) {
            a(n0Var);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            n0 h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m45clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public n0 d() {
            return n0.i;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i = 0; i < this.f1128e.size(); i++) {
                if (!this.f1128e.get(i).g()) {
                    return false;
                }
            }
            return true;
        }

        public n0 h() {
            n0 n0Var = new n0(this, null);
            int i = this.f1127d;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f1128e = Collections.unmodifiableList(this.f1128e);
                this.f1127d &= -2;
            }
            n0Var.f1123e = this.f1128e;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            n0Var.f1124f = this.f1129f;
            n0Var.f1122d = i2;
            return n0Var;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public n0 m46d() {
            return n0.i;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(n0 n0Var) {
            if (n0Var == n0.i) {
                return this;
            }
            boolean z = true;
            if (!n0Var.f1123e.isEmpty()) {
                if (this.f1128e.isEmpty()) {
                    this.f1128e = n0Var.f1123e;
                    this.f1127d &= -2;
                } else {
                    if ((this.f1127d & 1) != 1) {
                        this.f1128e = new ArrayList(this.f1128e);
                        this.f1127d |= 1;
                    }
                    this.f1128e.addAll(n0Var.f1123e);
                }
            }
            if ((n0Var.f1122d & 1) != 1) {
                z = false;
            }
            if (z) {
                int i = n0Var.f1124f;
                this.f1127d |= 2;
                this.f1129f = i;
            }
            this.f1390c = this.f1390c.b(n0Var.f1121c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            n0 n0Var;
            n0 n0Var2 = null;
            try {
                n0 a2 = n0.j.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                n0Var = (n0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                n0Var2 = n0Var;
            }
            if (n0Var2 != null) {
                a(n0Var2);
            }
            throw th;
        }
    }

    static {
        n0 n0Var = new n0();
        i = n0Var;
        n0Var.f1123e = Collections.emptyList();
        n0Var.f1124f = -1;
    }

    public n0() {
        this.f1125g = -1;
        this.f1126h = -1;
        this.f1121c = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.util.List<a.a.a.a.v0.e.g0> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ n0(e eVar, g gVar, a aVar) {
        this.f1125g = -1;
        this.f1126h = -1;
        this.f1123e = Collections.emptyList();
        this.f1124f = -1;
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 10) {
                        if (!z2 || !true) {
                            this.f1123e = new ArrayList();
                            z2 |= true;
                        }
                        this.f1123e.add(eVar.a(g0.w, gVar));
                    } else if (j2 == 16) {
                        this.f1122d |= 1;
                        this.f1124f = eVar.g();
                    } else if (!eVar.a(j2, a2)) {
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
                    this.f1123e = Collections.unmodifiableList(this.f1123e);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1121c = i2.l();
                    throw th2;
                }
                this.f1121c = i2.l();
                throw th;
            }
        }
        if (z2 && true) {
            this.f1123e = Collections.unmodifiableList(this.f1123e);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1121c = i2.l();
            throw th3;
        }
        this.f1121c = i2.l();
    }

    public static b a(n0 n0Var) {
        b bVar = new b();
        bVar.a(n0Var);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        for (int i2 = 0; i2 < this.f1123e.size(); i2++) {
            fVar.a(1, this.f1123e.get(i2));
        }
        if ((this.f1122d & 1) == 1) {
            fVar.b(2, this.f1124f);
        }
        fVar.b(this.f1121c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.f1126h;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1123e.size(); i4++) {
            i3 += f.b(1, this.f1123e.get(i4));
        }
        if ((this.f1122d & 1) == 1) {
            i3 += f.e(2, this.f1124f);
        }
        int size = this.f1121c.size() + i3;
        this.f1126h = size;
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
    public b e() {
        return a(this);
    }

    @Override // a.a.a.a.v0.h.q
    /* renamed from: e  reason: collision with other method in class */
    public q.a m44e() {
        return a(this);
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<n0> f() {
        return j;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.f1125g;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1123e.size(); i2++) {
            if (!this.f1123e.get(i2).g()) {
                this.f1125g = 0;
                return false;
            }
        }
        this.f1125g = 1;
        return true;
    }

    public /* synthetic */ n0(i.b bVar, a aVar) {
        super(bVar);
        this.f1125g = -1;
        this.f1126h = -1;
        this.f1121c = bVar.f1390c;
    }
}
