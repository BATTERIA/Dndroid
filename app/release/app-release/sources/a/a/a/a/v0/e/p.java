package a.a.a.a.v0.e;

import a.a.a.a.v0.e.g0;
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

public final class p extends i implements q {
    public static final p n;
    public static s<p> o = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f1130c;

    /* renamed from: d  reason: collision with root package name */
    public int f1131d;

    /* renamed from: e  reason: collision with root package name */
    public int f1132e;

    /* renamed from: f  reason: collision with root package name */
    public int f1133f;

    /* renamed from: g  reason: collision with root package name */
    public c f1134g;

    /* renamed from: h  reason: collision with root package name */
    public g0 f1135h;
    public int i;
    public List<p> j;
    public List<p> k;
    public byte l;
    public int m;

    public static class a extends a.a.a.a.v0.h.b<p> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new p(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<p, b> implements q {

        /* renamed from: d  reason: collision with root package name */
        public int f1136d;

        /* renamed from: e  reason: collision with root package name */
        public int f1137e;

        /* renamed from: f  reason: collision with root package name */
        public int f1138f;

        /* renamed from: g  reason: collision with root package name */
        public c f1139g = c.TRUE;

        /* renamed from: h  reason: collision with root package name */
        public g0 f1140h = g0.v;
        public int i;
        public List<p> j = Collections.emptyList();
        public List<p> k = Collections.emptyList();

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(p pVar) {
            a(pVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            p h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m47clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public p d() {
            return p.n;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (((this.f1136d & 8) == 8) && !this.f1140h.g()) {
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
            return true;
        }

        public p h() {
            p pVar = new p(this, null);
            int i2 = this.f1136d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            pVar.f1132e = this.f1137e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            pVar.f1133f = this.f1138f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            pVar.f1134g = this.f1139g;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            pVar.f1135h = this.f1140h;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            pVar.i = this.i;
            if ((this.f1136d & 32) == 32) {
                this.j = Collections.unmodifiableList(this.j);
                this.f1136d &= -33;
            }
            pVar.j = this.j;
            if ((this.f1136d & 64) == 64) {
                this.k = Collections.unmodifiableList(this.k);
                this.f1136d &= -65;
            }
            pVar.k = this.k;
            pVar.f1131d = i3;
            return pVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public p m48d() {
            return p.n;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(p pVar) {
            g0 g0Var;
            if (pVar == p.n) {
                return this;
            }
            boolean z = true;
            if ((pVar.f1131d & 1) == 1) {
                int i2 = pVar.f1132e;
                this.f1136d |= 1;
                this.f1137e = i2;
            }
            if ((pVar.f1131d & 2) == 2) {
                int i3 = pVar.f1133f;
                this.f1136d = 2 | this.f1136d;
                this.f1138f = i3;
            }
            if ((pVar.f1131d & 4) == 4) {
                c cVar = pVar.f1134g;
                if (cVar != null) {
                    this.f1136d = 4 | this.f1136d;
                    this.f1139g = cVar;
                } else {
                    throw null;
                }
            }
            if ((pVar.f1131d & 8) == 8) {
                g0 g0Var2 = pVar.f1135h;
                if ((this.f1136d & 8) == 8 && (g0Var = this.f1140h) != g0.v) {
                    g0Var2 = e.a.a.a.a.a(g0Var, g0Var2);
                }
                this.f1140h = g0Var2;
                this.f1136d |= 8;
            }
            if ((pVar.f1131d & 16) != 16) {
                z = false;
            }
            if (z) {
                int i4 = pVar.i;
                this.f1136d |= 16;
                this.i = i4;
            }
            if (!pVar.j.isEmpty()) {
                if (this.j.isEmpty()) {
                    this.j = pVar.j;
                    this.f1136d &= -33;
                } else {
                    if ((this.f1136d & 32) != 32) {
                        this.j = new ArrayList(this.j);
                        this.f1136d |= 32;
                    }
                    this.j.addAll(pVar.j);
                }
            }
            if (!pVar.k.isEmpty()) {
                if (this.k.isEmpty()) {
                    this.k = pVar.k;
                    this.f1136d &= -65;
                } else {
                    if ((this.f1136d & 64) != 64) {
                        this.k = new ArrayList(this.k);
                        this.f1136d |= 64;
                    }
                    this.k.addAll(pVar.k);
                }
            }
            this.f1390c = this.f1390c.b(pVar.f1130c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            p pVar;
            p pVar2 = null;
            try {
                p a2 = p.o.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                pVar = (p) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                a(pVar2);
            }
            throw th;
        }
    }

    public enum c implements j.a {
        TRUE(0),
        FALSE(1),
        NULL(2);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1145c;

        /* access modifiers changed from: public */
        c(int i) {
            this.f1145c = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1145c;
        }
    }

    static {
        p pVar = new p();
        n = pVar;
        pVar.h();
    }

    public p() {
        this.l = -1;
        this.m = -1;
        this.f1130c = d.f1366c;
    }

    public /* synthetic */ p(e eVar, g gVar, a aVar) {
        List list;
        s<p> sVar;
        this.l = -1;
        this.m = -1;
        h();
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        this.f1131d |= 1;
                        this.f1132e = eVar.g();
                    } else if (j2 == 16) {
                        this.f1131d |= 2;
                        this.f1133f = eVar.g();
                    } else if (j2 == 24) {
                        int g2 = eVar.g();
                        c a3 = c.a(g2);
                        if (a3 == null) {
                            a2.e(j2);
                            a2.e(g2);
                        } else {
                            this.f1131d |= 4;
                            this.f1134g = a3;
                        }
                    } else if (j2 == 34) {
                        g0.c cVar = (this.f1131d & 8) == 8 ? this.f1135h.e() : null;
                        g0 g0Var = (g0) eVar.a(g0.w, gVar);
                        this.f1135h = g0Var;
                        if (cVar != null) {
                            cVar.a(g0Var);
                            this.f1135h = cVar.i();
                        }
                        this.f1131d |= 8;
                    } else if (j2 != 40) {
                        if (j2 == 50) {
                            if (!(z2 & true)) {
                                this.j = new ArrayList();
                                z2 |= true;
                            }
                            list = this.j;
                            sVar = o;
                        } else if (j2 == 58) {
                            if (!(z2 & true)) {
                                this.k = new ArrayList();
                                z2 |= true;
                            }
                            list = this.k;
                            sVar = o;
                        } else if (!eVar.a(j2, a2)) {
                        }
                        list.add(eVar.a(sVar, gVar));
                    } else {
                        this.f1131d |= 16;
                        this.i = eVar.g();
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
                    this.f1130c = i2.l();
                    throw th2;
                }
                this.f1130c = i2.l();
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
            this.f1130c = i2.l();
            throw th3;
        }
        this.f1130c = i2.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        if ((this.f1131d & 1) == 1) {
            fVar.b(1, this.f1132e);
        }
        if ((this.f1131d & 2) == 2) {
            fVar.b(2, this.f1133f);
        }
        if ((this.f1131d & 4) == 4) {
            fVar.a(3, this.f1134g.f1145c);
        }
        if ((this.f1131d & 8) == 8) {
            fVar.a(4, this.f1135h);
        }
        if ((this.f1131d & 16) == 16) {
            fVar.b(5, this.i);
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            fVar.a(6, this.j.get(i2));
        }
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            fVar.a(7, this.k.get(i3));
        }
        fVar.b(this.f1130c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.m;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1131d & 1) == 1 ? f.e(1, this.f1132e) + 0 : 0;
        if ((this.f1131d & 2) == 2) {
            e2 += f.e(2, this.f1133f);
        }
        if ((this.f1131d & 4) == 4) {
            e2 += f.d(3, this.f1134g.f1145c);
        }
        if ((this.f1131d & 8) == 8) {
            e2 += f.b(4, this.f1135h);
        }
        if ((this.f1131d & 16) == 16) {
            e2 += f.e(5, this.i);
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            e2 += f.b(6, this.j.get(i3));
        }
        for (int i4 = 0; i4 < this.k.size(); i4++) {
            e2 += f.b(7, this.k.get(i4));
        }
        int size = this.f1130c.size() + e2;
        this.m = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return n;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<p> f() {
        return o;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!((this.f1131d & 8) == 8) || this.f1135h.g()) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (!this.j.get(i2).g()) {
                    this.l = 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                if (!this.k.get(i3).g()) {
                    this.l = 0;
                    return false;
                }
            }
            this.l = 1;
            return true;
        }
        this.l = 0;
        return false;
    }

    public final void h() {
        this.f1132e = 0;
        this.f1133f = 0;
        this.f1134g = c.TRUE;
        this.f1135h = g0.v;
        this.i = 0;
        this.j = Collections.emptyList();
        this.k = Collections.emptyList();
    }

    public /* synthetic */ p(i.b bVar, a aVar) {
        super(bVar);
        this.l = -1;
        this.m = -1;
        this.f1130c = bVar.f1390c;
    }
}
