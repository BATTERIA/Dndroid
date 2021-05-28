package a.a.a.a.v0.e;

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

public final class b0 extends i implements d0 {

    /* renamed from: g  reason: collision with root package name */
    public static final b0 f987g;

    /* renamed from: h  reason: collision with root package name */
    public static s<b0> f988h = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f989c;

    /* renamed from: d  reason: collision with root package name */
    public List<c> f990d;

    /* renamed from: e  reason: collision with root package name */
    public byte f991e;

    /* renamed from: f  reason: collision with root package name */
    public int f992f;

    public static class a extends a.a.a.a.v0.h.b<b0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new b0(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<b0, b> implements d0 {

        /* renamed from: d  reason: collision with root package name */
        public int f993d;

        /* renamed from: e  reason: collision with root package name */
        public List<c> f994e = Collections.emptyList();

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(b0 b0Var) {
            a(b0Var);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            b0 h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m20clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public b0 d() {
            return b0.f987g;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            for (int i = 0; i < this.f994e.size(); i++) {
                if (!this.f994e.get(i).g()) {
                    return false;
                }
            }
            return true;
        }

        public b0 h() {
            b0 b0Var = new b0(this, null);
            if ((this.f993d & 1) == 1) {
                this.f994e = Collections.unmodifiableList(this.f994e);
                this.f993d &= -2;
            }
            b0Var.f990d = this.f994e;
            return b0Var;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public b0 m21d() {
            return b0.f987g;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(b0 b0Var) {
            if (b0Var == b0.f987g) {
                return this;
            }
            if (!b0Var.f990d.isEmpty()) {
                if (this.f994e.isEmpty()) {
                    this.f994e = b0Var.f990d;
                    this.f993d &= -2;
                } else {
                    if ((this.f993d & 1) != 1) {
                        this.f994e = new ArrayList(this.f994e);
                        this.f993d |= 1;
                    }
                    this.f994e.addAll(b0Var.f990d);
                }
            }
            this.f1390c = this.f1390c.b(b0Var.f989c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            b0 b0Var;
            b0 b0Var2 = null;
            try {
                b0 a2 = b0.f988h.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                b0Var = (b0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                b0Var2 = b0Var;
            }
            if (b0Var2 != null) {
                a(b0Var2);
            }
            throw th;
        }
    }

    static {
        b0 b0Var = new b0();
        f987g = b0Var;
        b0Var.f990d = Collections.emptyList();
    }

    public b0() {
        this.f991e = -1;
        this.f992f = -1;
        this.f989c = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: java.util.List<a.a.a.a.v0.e.b0$c> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b0(e eVar, g gVar, a aVar) {
        this.f991e = -1;
        this.f992f = -1;
        this.f990d = Collections.emptyList();
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
                            this.f990d = new ArrayList();
                            z2 |= true;
                        }
                        this.f990d.add(eVar.a(c.k, gVar));
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
                    this.f990d = Collections.unmodifiableList(this.f990d);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f989c = i.l();
                    throw th2;
                }
                this.f989c = i.l();
                throw th;
            }
        }
        if (z2 && true) {
            this.f990d = Collections.unmodifiableList(this.f990d);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f989c = i.l();
            throw th3;
        }
        this.f989c = i.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        for (int i = 0; i < this.f990d.size(); i++) {
            fVar.a(1, this.f990d.get(i));
        }
        fVar.b(this.f989c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i = this.f992f;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f990d.size(); i3++) {
            i2 += f.b(1, this.f990d.get(i3));
        }
        int size = this.f989c.size() + i2;
        this.f992f = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return f987g;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<b0> f() {
        return f988h;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.f991e;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < this.f990d.size(); i++) {
            if (!this.f990d.get(i).g()) {
                this.f991e = 0;
                return false;
            }
        }
        this.f991e = 1;
        return true;
    }

    public /* synthetic */ b0(i.b bVar, a aVar) {
        super(bVar);
        this.f991e = -1;
        this.f992f = -1;
        this.f989c = bVar.f1390c;
    }

    public static final class c extends i implements c0 {
        public static final c j;
        public static s<c> k = new a();

        /* renamed from: c  reason: collision with root package name */
        public final d f995c;

        /* renamed from: d  reason: collision with root package name */
        public int f996d;

        /* renamed from: e  reason: collision with root package name */
        public int f997e;

        /* renamed from: f  reason: collision with root package name */
        public int f998f;

        /* renamed from: g  reason: collision with root package name */
        public EnumC0043c f999g;

        /* renamed from: h  reason: collision with root package name */
        public byte f1000h;
        public int i;

        public static class a extends a.a.a.a.v0.h.b<c> {
            @Override // a.a.a.a.v0.h.s
            public Object a(e eVar, g gVar) {
                return new c(eVar, gVar, null);
            }
        }

        public static final class b extends i.b<c, b> implements c0 {

            /* renamed from: d  reason: collision with root package name */
            public int f1001d;

            /* renamed from: e  reason: collision with root package name */
            public int f1002e = -1;

            /* renamed from: f  reason: collision with root package name */
            public int f1003f;

            /* renamed from: g  reason: collision with root package name */
            public EnumC0043c f1004g = EnumC0043c.PACKAGE;

            /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
            @Override // a.a.a.a.v0.h.i.b
            public /* bridge */ /* synthetic */ b a(c cVar) {
                a(cVar);
                return this;
            }

            @Override // a.a.a.a.v0.h.q.a
            public q a() {
                c h2 = h();
                if (h2.g()) {
                    return h2;
                }
                throw new v();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
            /* renamed from: clone  reason: collision with other method in class */
            public b m22clone() {
                b bVar = new b();
                bVar.a(h());
                return bVar;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
            public c d() {
                return c.j;
            }

            @Override // a.a.a.a.v0.h.r
            public final boolean g() {
                return (this.f1001d & 2) == 2;
            }

            public c h() {
                c cVar = new c(this, null);
                int i = this.f1001d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                cVar.f997e = this.f1002e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                cVar.f998f = this.f1003f;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                cVar.f999g = this.f1004g;
                cVar.f996d = i2;
                return cVar;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
            /* renamed from: d  reason: collision with other method in class */
            public c m23d() {
                return c.j;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
            public b clone() {
                b bVar = new b();
                bVar.a(h());
                return bVar;
            }

            public b a(c cVar) {
                if (cVar == c.j) {
                    return this;
                }
                boolean z = true;
                if ((cVar.f996d & 1) == 1) {
                    int i = cVar.f997e;
                    this.f1001d |= 1;
                    this.f1002e = i;
                }
                if ((cVar.f996d & 2) == 2) {
                    int i2 = cVar.f998f;
                    this.f1001d = 2 | this.f1001d;
                    this.f1003f = i2;
                }
                if ((cVar.f996d & 4) != 4) {
                    z = false;
                }
                if (z) {
                    EnumC0043c cVar2 = cVar.f999g;
                    if (cVar2 != null) {
                        this.f1001d |= 4;
                        this.f1004g = cVar2;
                    } else {
                        throw null;
                    }
                }
                this.f1390c = this.f1390c.b(cVar.f995c);
                return this;
            }

            @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
            public b a(e eVar, g gVar) {
                Throwable th;
                c cVar;
                c cVar2 = null;
                try {
                    c a2 = c.k.a(eVar, gVar);
                    if (a2 != null) {
                        a(a2);
                    }
                    return this;
                } catch (k e2) {
                    cVar = (c) e2.f1407c;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    a(cVar2);
                }
                throw th;
            }
        }

        /* renamed from: a.a.a.a.v0.e.b0$c$c  reason: collision with other inner class name */
        public enum EnumC0043c implements j.a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);
            

            /* renamed from: c  reason: collision with root package name */
            public final int f1009c;

            /* access modifiers changed from: public */
            EnumC0043c(int i) {
                this.f1009c = i;
            }

            public static EnumC0043c a(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // a.a.a.a.v0.h.j.a
            public final int getNumber() {
                return this.f1009c;
            }
        }

        static {
            c cVar = new c();
            j = cVar;
            cVar.f997e = -1;
            cVar.f998f = 0;
            cVar.f999g = EnumC0043c.PACKAGE;
        }

        public c() {
            this.f1000h = -1;
            this.i = -1;
            this.f995c = d.f1366c;
        }

        public /* synthetic */ c(e eVar, g gVar, a aVar) {
            this.f1000h = -1;
            this.i = -1;
            this.f997e = -1;
            boolean z = false;
            this.f998f = 0;
            this.f999g = EnumC0043c.PACKAGE;
            d.b i2 = d.i();
            f a2 = f.a(i2, 1);
            while (!z) {
                try {
                    int j2 = eVar.j();
                    if (j2 != 0) {
                        if (j2 == 8) {
                            this.f996d |= 1;
                            this.f997e = eVar.g();
                        } else if (j2 == 16) {
                            this.f996d |= 2;
                            this.f998f = eVar.g();
                        } else if (j2 == 24) {
                            int g2 = eVar.g();
                            EnumC0043c a3 = EnumC0043c.a(g2);
                            if (a3 == null) {
                                a2.e(j2);
                                a2.e(g2);
                            } else {
                                this.f996d |= 4;
                                this.f999g = a3;
                            }
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
                    try {
                        a2.a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f995c = i2.l();
                        throw th2;
                    }
                    this.f995c = i2.l();
                    throw th;
                }
            }
            try {
                a2.a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f995c = i2.l();
                throw th3;
            }
            this.f995c = i2.l();
        }

        @Override // a.a.a.a.v0.h.q
        public void a(f fVar) {
            b();
            if ((this.f996d & 1) == 1) {
                fVar.b(1, this.f997e);
            }
            if ((this.f996d & 2) == 2) {
                fVar.b(2, this.f998f);
            }
            if ((this.f996d & 4) == 4) {
                fVar.a(3, this.f999g.f1009c);
            }
            fVar.b(this.f995c);
        }

        @Override // a.a.a.a.v0.h.q
        public int b() {
            int i2 = this.i;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f996d & 1) == 1) {
                i3 = 0 + f.e(1, this.f997e);
            }
            if ((this.f996d & 2) == 2) {
                i3 += f.e(2, this.f998f);
            }
            if ((this.f996d & 4) == 4) {
                i3 += f.d(3, this.f999g.f1009c);
            }
            int size = this.f995c.size() + i3;
            this.i = size;
            return size;
        }

        @Override // a.a.a.a.v0.h.q
        public q.a c() {
            return new b();
        }

        @Override // a.a.a.a.v0.h.r
        public q d() {
            return j;
        }

        @Override // a.a.a.a.v0.h.q
        public q.a e() {
            b bVar = new b();
            bVar.a(this);
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
        public s<c> f() {
            return k;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            byte b2 = this.f1000h;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (!((this.f996d & 2) == 2)) {
                this.f1000h = 0;
                return false;
            }
            this.f1000h = 1;
            return true;
        }

        public /* synthetic */ c(i.b bVar, a aVar) {
            super(bVar);
            this.f1000h = -1;
            this.i = -1;
            this.f995c = bVar.f1390c;
        }
    }
}
