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

public final class h extends i.d<h> implements i {
    public static final h k;
    public static s<h> l = new a();

    /* renamed from: d  reason: collision with root package name */
    public final d f1056d;

    /* renamed from: e  reason: collision with root package name */
    public int f1057e;

    /* renamed from: f  reason: collision with root package name */
    public int f1058f;

    /* renamed from: g  reason: collision with root package name */
    public List<p0> f1059g;

    /* renamed from: h  reason: collision with root package name */
    public List<Integer> f1060h;
    public byte i;
    public int j;

    public static class a extends a.a.a.a.v0.h.b<h> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new h(eVar, gVar, null);
        }
    }

    public static final class b extends i.c<h, b> implements i {

        /* renamed from: f  reason: collision with root package name */
        public int f1061f;

        /* renamed from: g  reason: collision with root package name */
        public int f1062g = 6;

        /* renamed from: h  reason: collision with root package name */
        public List<p0> f1063h = Collections.emptyList();
        public List<Integer> i = Collections.emptyList();

        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ i.b a(i iVar) {
            a((h) iVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            h i2 = i();
            if (i2.g()) {
                return i2;
            }
            throw new v();
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public Object m32clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public i d() {
            return h.k;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i2 = 0; i2 < this.f1063h.size(); i2++) {
                if (!this.f1063h.get(i2).g()) {
                    return false;
                }
            }
            if (!h()) {
                return false;
            }
            return true;
        }

        public h i() {
            h hVar = new h(this, null);
            int i2 = 1;
            if ((this.f1061f & 1) != 1) {
                i2 = 0;
            }
            hVar.f1058f = this.f1062g;
            if ((this.f1061f & 2) == 2) {
                this.f1063h = Collections.unmodifiableList(this.f1063h);
                this.f1061f &= -3;
            }
            hVar.f1059g = this.f1063h;
            if ((this.f1061f & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
                this.f1061f &= -5;
            }
            hVar.f1060h = this.i;
            hVar.f1057e = i2;
            return hVar;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public q m33d() {
            return h.k;
        }

        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public i.b clone() {
            b bVar = new b();
            bVar.a(i());
            return bVar;
        }

        public b a(h hVar) {
            if (hVar == h.k) {
                return this;
            }
            if ((hVar.f1057e & 1) == 1) {
                int i2 = hVar.f1058f;
                this.f1061f = 1 | this.f1061f;
                this.f1062g = i2;
            }
            if (!hVar.f1059g.isEmpty()) {
                if (this.f1063h.isEmpty()) {
                    this.f1063h = hVar.f1059g;
                    this.f1061f &= -3;
                } else {
                    if ((this.f1061f & 2) != 2) {
                        this.f1063h = new ArrayList(this.f1063h);
                        this.f1061f |= 2;
                    }
                    this.f1063h.addAll(hVar.f1059g);
                }
            }
            if (!hVar.f1060h.isEmpty()) {
                if (this.i.isEmpty()) {
                    this.i = hVar.f1060h;
                    this.f1061f &= -5;
                } else {
                    if ((this.f1061f & 4) != 4) {
                        this.i = new ArrayList(this.i);
                        this.f1061f |= 4;
                    }
                    this.i.addAll(hVar.f1060h);
                }
            }
            a((i.d) hVar);
            this.f1390c = this.f1390c.b(hVar.f1056d);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            h hVar;
            h hVar2 = null;
            try {
                h a2 = h.l.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                hVar = (h) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                a(hVar2);
            }
            throw th;
        }
    }

    static {
        h hVar = new h();
        k = hVar;
        hVar.f1058f = 6;
        hVar.f1059g = Collections.emptyList();
        hVar.f1060h = Collections.emptyList();
    }

    public h() {
        this.i = -1;
        this.j = -1;
        this.f1056d = d.f1366c;
    }

    public /* synthetic */ h(e eVar, g gVar, a aVar) {
        Object obj;
        List list;
        this.i = -1;
        this.j = -1;
        this.f1058f = 6;
        this.f1059g = Collections.emptyList();
        this.f1060h = Collections.emptyList();
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 != 8) {
                        if (j2 == 18) {
                            if (!(z2 & true)) {
                                this.f1059g = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f1059g;
                            obj = eVar.a(p0.o, gVar);
                        } else if (j2 == 248) {
                            if (!(z2 & true)) {
                                this.f1060h = new ArrayList();
                                z2 |= true;
                            }
                            list = this.f1060h;
                            obj = Integer.valueOf(eVar.g());
                        } else if (j2 == 250) {
                            int c2 = eVar.c(eVar.g());
                            if (!(z2 & true) && eVar.a() > 0) {
                                this.f1060h = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.a() > 0) {
                                this.f1060h.add(Integer.valueOf(eVar.g()));
                            }
                            eVar.j = c2;
                            eVar.k();
                        } else if (!a(eVar, a2, gVar, j2)) {
                        }
                        list.add(obj);
                    } else {
                        this.f1057e |= 1;
                        this.f1058f = eVar.g();
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
                    this.f1059g = Collections.unmodifiableList(this.f1059g);
                }
                if (z2 & true) {
                    this.f1060h = Collections.unmodifiableList(this.f1060h);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1056d = i2.l();
                    throw th2;
                }
                this.f1056d = i2.l();
                this.f1393c.b();
                throw th;
            }
        }
        if (z2 & true) {
            this.f1059g = Collections.unmodifiableList(this.f1059g);
        }
        if (z2 & true) {
            this.f1060h = Collections.unmodifiableList(this.f1060h);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1056d = i2.l();
            throw th3;
        }
        this.f1056d = i2.l();
        this.f1393c.b();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        i.d<MessageType>.a k2 = k();
        if ((this.f1057e & 1) == 1) {
            fVar.b(1, this.f1058f);
        }
        for (int i2 = 0; i2 < this.f1059g.size(); i2++) {
            fVar.a(2, this.f1059g.get(i2));
        }
        for (int i3 = 0; i3 < this.f1060h.size(); i3++) {
            fVar.b(31, this.f1060h.get(i3).intValue());
        }
        k2.a(19000, fVar);
        fVar.b(this.f1056d);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.j;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f1057e & 1) == 1 ? f.e(1, this.f1058f) + 0 : 0;
        for (int i3 = 0; i3 < this.f1059g.size(); i3++) {
            e2 += f.b(2, this.f1059g.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f1060h.size(); i5++) {
            i4 += f.f(this.f1060h.get(i5).intValue());
        }
        int size = this.f1056d.size() + i() + (this.f1060h.size() * 2) + e2 + i4;
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
    public s<h> f() {
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
        for (int i2 = 0; i2 < this.f1059g.size(); i2++) {
            if (!this.f1059g.get(i2).g()) {
                this.i = 0;
                return false;
            }
        }
        if (!h()) {
            this.i = 0;
            return false;
        }
        this.i = 1;
        return true;
    }

    public /* synthetic */ h(i.c cVar, a aVar) {
        super(cVar);
        this.i = -1;
        this.j = -1;
        this.f1056d = cVar.f1390c;
    }
}
