package a.a.a.a.v0.e;

import a.a.a.a.v0.e.p;
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

public final class l extends i implements m {
    public static final l k;
    public static s<l> l = new a();

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.h.d f1080c;

    /* renamed from: d  reason: collision with root package name */
    public int f1081d;

    /* renamed from: e  reason: collision with root package name */
    public c f1082e;

    /* renamed from: f  reason: collision with root package name */
    public List<p> f1083f;

    /* renamed from: g  reason: collision with root package name */
    public p f1084g;

    /* renamed from: h  reason: collision with root package name */
    public d f1085h;
    public byte i;
    public int j;

    public static class a extends a.a.a.a.v0.h.b<l> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new l(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<l, b> implements m {

        /* renamed from: d  reason: collision with root package name */
        public int f1086d;

        /* renamed from: e  reason: collision with root package name */
        public c f1087e = c.RETURNS_CONSTANT;

        /* renamed from: f  reason: collision with root package name */
        public List<p> f1088f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        public p f1089g = p.n;

        /* renamed from: h  reason: collision with root package name */
        public d f1090h = d.AT_MOST_ONCE;

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(l lVar) {
            a(lVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            l h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m38clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public l d() {
            return l.k;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i = 0; i < this.f1088f.size(); i++) {
                if (!this.f1088f.get(i).g()) {
                    return false;
                }
            }
            if (!((this.f1086d & 4) == 4) || this.f1089g.g()) {
                return true;
            }
            return false;
        }

        public l h() {
            l lVar = new l(this, null);
            int i = this.f1086d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            lVar.f1082e = this.f1087e;
            if ((this.f1086d & 2) == 2) {
                this.f1088f = Collections.unmodifiableList(this.f1088f);
                this.f1086d &= -3;
            }
            lVar.f1083f = this.f1088f;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            lVar.f1084g = this.f1089g;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            lVar.f1085h = this.f1090h;
            lVar.f1081d = i2;
            return lVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public l m39d() {
            return l.k;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(l lVar) {
            p pVar;
            if (lVar == l.k) {
                return this;
            }
            boolean z = true;
            if ((lVar.f1081d & 1) == 1) {
                c cVar = lVar.f1082e;
                if (cVar != null) {
                    this.f1086d |= 1;
                    this.f1087e = cVar;
                } else {
                    throw null;
                }
            }
            if (!lVar.f1083f.isEmpty()) {
                if (this.f1088f.isEmpty()) {
                    this.f1088f = lVar.f1083f;
                    this.f1086d &= -3;
                } else {
                    if ((this.f1086d & 2) != 2) {
                        this.f1088f = new ArrayList(this.f1088f);
                        this.f1086d |= 2;
                    }
                    this.f1088f.addAll(lVar.f1083f);
                }
            }
            if ((lVar.f1081d & 2) == 2) {
                p pVar2 = lVar.f1084g;
                if ((this.f1086d & 4) == 4 && (pVar = this.f1089g) != p.n) {
                    p.b bVar = new p.b();
                    bVar.a(pVar);
                    bVar.a(pVar2);
                    pVar2 = bVar.h();
                }
                this.f1089g = pVar2;
                this.f1086d |= 4;
            }
            if ((lVar.f1081d & 4) != 4) {
                z = false;
            }
            if (z) {
                d dVar = lVar.f1085h;
                if (dVar != null) {
                    this.f1086d |= 8;
                    this.f1090h = dVar;
                } else {
                    throw null;
                }
            }
            this.f1390c = this.f1390c.b(lVar.f1080c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            l lVar;
            l lVar2 = null;
            try {
                l a2 = l.l.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                lVar = (l) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                a(lVar2);
            }
            throw th;
        }
    }

    public enum c implements j.a {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1095c;

        /* access modifiers changed from: public */
        c(int i) {
            this.f1095c = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1095c;
        }
    }

    public enum d implements j.a {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1100c;

        /* access modifiers changed from: public */
        d(int i) {
            this.f1100c = i;
        }

        public static d a(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1100c;
        }
    }

    static {
        l lVar = new l();
        k = lVar;
        lVar.f1082e = c.RETURNS_CONSTANT;
        lVar.f1083f = Collections.emptyList();
        lVar.f1084g = p.n;
        lVar.f1085h = d.AT_MOST_ONCE;
    }

    public l() {
        this.i = -1;
        this.j = -1;
        this.f1080c = a.a.a.a.v0.h.d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: java.util.List<a.a.a.a.v0.e.p> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ l(e eVar, g gVar, a aVar) {
        int g2;
        this.i = -1;
        this.j = -1;
        this.f1082e = c.RETURNS_CONSTANT;
        this.f1083f = Collections.emptyList();
        this.f1084g = p.n;
        this.f1085h = d.AT_MOST_ONCE;
        d.b i2 = a.a.a.a.v0.h.d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        g2 = eVar.g();
                        c a3 = c.a(g2);
                        if (a3 != null) {
                            this.f1081d |= 1;
                            this.f1082e = a3;
                        }
                    } else if (j2 == 18) {
                        if (!(z2 & true)) {
                            this.f1083f = new ArrayList();
                            z2 |= true;
                        }
                        this.f1083f.add(eVar.a(p.o, gVar));
                    } else if (j2 == 26) {
                        p.b bVar = null;
                        if ((this.f1081d & 2) == 2) {
                            p pVar = this.f1084g;
                            if (pVar != null) {
                                bVar = new p.b();
                                bVar.a(pVar);
                            } else {
                                throw null;
                            }
                        }
                        p pVar2 = (p) eVar.a(p.o, gVar);
                        this.f1084g = pVar2;
                        if (bVar != null) {
                            bVar.a(pVar2);
                            this.f1084g = bVar.h();
                        }
                        this.f1081d |= 2;
                    } else if (j2 == 32) {
                        g2 = eVar.g();
                        d a4 = d.a(g2);
                        if (a4 != null) {
                            this.f1081d |= 4;
                            this.f1085h = a4;
                        }
                    } else if (!eVar.a(j2, a2)) {
                    }
                    a2.e(j2);
                    a2.e(g2);
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
                    this.f1083f = Collections.unmodifiableList(this.f1083f);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1080c = i2.l();
                    throw th2;
                }
                this.f1080c = i2.l();
                throw th;
            }
        }
        if (z2 & true) {
            this.f1083f = Collections.unmodifiableList(this.f1083f);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1080c = i2.l();
            throw th3;
        }
        this.f1080c = i2.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        if ((this.f1081d & 1) == 1) {
            fVar.a(1, this.f1082e.f1095c);
        }
        for (int i2 = 0; i2 < this.f1083f.size(); i2++) {
            fVar.a(2, this.f1083f.get(i2));
        }
        if ((this.f1081d & 2) == 2) {
            fVar.a(3, this.f1084g);
        }
        if ((this.f1081d & 4) == 4) {
            fVar.a(4, this.f1085h.f1100c);
        }
        fVar.b(this.f1080c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.j;
        if (i2 != -1) {
            return i2;
        }
        int d2 = (this.f1081d & 1) == 1 ? f.d(1, this.f1082e.f1095c) + 0 : 0;
        for (int i3 = 0; i3 < this.f1083f.size(); i3++) {
            d2 += f.b(2, this.f1083f.get(i3));
        }
        if ((this.f1081d & 2) == 2) {
            d2 += f.b(3, this.f1084g);
        }
        if ((this.f1081d & 4) == 4) {
            d2 += f.d(4, this.f1085h.f1100c);
        }
        int size = this.f1080c.size() + d2;
        this.j = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return k;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<l> f() {
        return l;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.i;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < this.f1083f.size(); i2++) {
            if (!this.f1083f.get(i2).g()) {
                this.i = 0;
                return false;
            }
        }
        if (!((this.f1081d & 2) == 2) || this.f1084g.g()) {
            this.i = 1;
            return true;
        }
        this.i = 0;
        return false;
    }

    public /* synthetic */ l(i.b bVar, a aVar) {
        super(bVar);
        this.i = -1;
        this.j = -1;
        this.f1080c = bVar.f1390c;
    }
}
