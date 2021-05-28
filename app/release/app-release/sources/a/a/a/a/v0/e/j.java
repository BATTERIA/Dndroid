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

public final class j extends i implements k {

    /* renamed from: g  reason: collision with root package name */
    public static final j f1072g;

    /* renamed from: h  reason: collision with root package name */
    public static s<j> f1073h = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f1074c;

    /* renamed from: d  reason: collision with root package name */
    public List<l> f1075d;

    /* renamed from: e  reason: collision with root package name */
    public byte f1076e;

    /* renamed from: f  reason: collision with root package name */
    public int f1077f;

    public static class a extends a.a.a.a.v0.h.b<j> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new j(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<j, b> implements k {

        /* renamed from: d  reason: collision with root package name */
        public int f1078d;

        /* renamed from: e  reason: collision with root package name */
        public List<l> f1079e = Collections.emptyList();

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(j jVar) {
            a(jVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            j h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m36clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public j d() {
            return j.f1072g;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i = 0; i < this.f1079e.size(); i++) {
                if (!this.f1079e.get(i).g()) {
                    return false;
                }
            }
            return true;
        }

        public j h() {
            j jVar = new j(this, null);
            if ((this.f1078d & 1) == 1) {
                this.f1079e = Collections.unmodifiableList(this.f1079e);
                this.f1078d &= -2;
            }
            jVar.f1075d = this.f1079e;
            return jVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public j m37d() {
            return j.f1072g;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(j jVar) {
            if (jVar == j.f1072g) {
                return this;
            }
            if (!jVar.f1075d.isEmpty()) {
                if (this.f1079e.isEmpty()) {
                    this.f1079e = jVar.f1075d;
                    this.f1078d &= -2;
                } else {
                    if ((this.f1078d & 1) != 1) {
                        this.f1079e = new ArrayList(this.f1079e);
                        this.f1078d |= 1;
                    }
                    this.f1079e.addAll(jVar.f1075d);
                }
            }
            this.f1390c = this.f1390c.b(jVar.f1074c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            j jVar;
            j jVar2 = null;
            try {
                j a2 = j.f1073h.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                jVar = (j) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                jVar2 = jVar;
            }
            if (jVar2 != null) {
                a(jVar2);
            }
            throw th;
        }
    }

    static {
        j jVar = new j();
        f1072g = jVar;
        jVar.f1075d = Collections.emptyList();
    }

    public j() {
        this.f1076e = -1;
        this.f1077f = -1;
        this.f1074c = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.util.List<a.a.a.a.v0.e.l> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(e eVar, g gVar, a aVar) {
        this.f1076e = -1;
        this.f1077f = -1;
        this.f1075d = Collections.emptyList();
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
                            this.f1075d = new ArrayList();
                            z2 |= true;
                        }
                        this.f1075d.add(eVar.a(l.l, gVar));
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
                    this.f1075d = Collections.unmodifiableList(this.f1075d);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1074c = i.l();
                    throw th2;
                }
                this.f1074c = i.l();
                throw th;
            }
        }
        if (z2 && true) {
            this.f1075d = Collections.unmodifiableList(this.f1075d);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1074c = i.l();
            throw th3;
        }
        this.f1074c = i.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        for (int i = 0; i < this.f1075d.size(); i++) {
            fVar.a(1, this.f1075d.get(i));
        }
        fVar.b(this.f1074c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i = this.f1077f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f1075d.size(); i3++) {
            i2 += f.b(1, this.f1075d.get(i3));
        }
        int size = this.f1074c.size() + i2;
        this.f1077f = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return f1072g;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<j> f() {
        return f1073h;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.f1076e;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.f1075d.size(); i++) {
            if (!this.f1075d.get(i).g()) {
                this.f1076e = 0;
                return false;
            }
        }
        this.f1076e = 1;
        return true;
    }

    public /* synthetic */ j(i.b bVar, a aVar) {
        super(bVar);
        this.f1076e = -1;
        this.f1077f = -1;
        this.f1074c = bVar.f1390c;
    }
}
