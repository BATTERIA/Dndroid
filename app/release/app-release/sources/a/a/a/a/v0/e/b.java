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

public final class b extends i implements e {
    public static final b i;
    public static s<b> j = new a();

    /* renamed from: c  reason: collision with root package name */
    public final d f952c;

    /* renamed from: d  reason: collision with root package name */
    public int f953d;

    /* renamed from: e  reason: collision with root package name */
    public int f954e;

    /* renamed from: f  reason: collision with root package name */
    public List<C0039b> f955f;

    /* renamed from: g  reason: collision with root package name */
    public byte f956g;

    /* renamed from: h  reason: collision with root package name */
    public int f957h;

    public static class a extends a.a.a.a.v0.h.b<b> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new b(eVar, gVar, null);
        }
    }

    public static final class c extends i.b<b, c> implements e {

        /* renamed from: d  reason: collision with root package name */
        public int f984d;

        /* renamed from: e  reason: collision with root package name */
        public int f985e;

        /* renamed from: f  reason: collision with root package name */
        public List<C0039b> f986f = Collections.emptyList();

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ c a(b bVar) {
            a(bVar);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            b h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public c m18clone() {
            c cVar = new c();
            cVar.a(h());
            return cVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public b d() {
            return b.i;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            if (!((this.f984d & 1) == 1)) {
                return false;
            }
            for (int i = 0; i < this.f986f.size(); i++) {
                if (!this.f986f.get(i).g()) {
                    return false;
                }
            }
            return true;
        }

        public b h() {
            b bVar = new b(this, null);
            int i = 1;
            if ((this.f984d & 1) != 1) {
                i = 0;
            }
            bVar.f954e = this.f985e;
            if ((this.f984d & 2) == 2) {
                this.f986f = Collections.unmodifiableList(this.f986f);
                this.f984d &= -3;
            }
            bVar.f955f = this.f986f;
            bVar.f953d = i;
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public b m19d() {
            return b.i;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public c clone() {
            c cVar = new c();
            cVar.a(h());
            return cVar;
        }

        public c a(b bVar) {
            if (bVar == b.i) {
                return this;
            }
            if ((bVar.f953d & 1) == 1) {
                int i = bVar.f954e;
                this.f984d = 1 | this.f984d;
                this.f985e = i;
            }
            if (!bVar.f955f.isEmpty()) {
                if (this.f986f.isEmpty()) {
                    this.f986f = bVar.f955f;
                    this.f984d &= -3;
                } else {
                    if ((this.f984d & 2) != 2) {
                        this.f986f = new ArrayList(this.f986f);
                        this.f984d |= 2;
                    }
                    this.f986f.addAll(bVar.f955f);
                }
            }
            this.f1390c = this.f1390c.b(bVar.f952c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public c a(e eVar, g gVar) {
            Throwable th;
            b bVar;
            b bVar2 = null;
            try {
                b a2 = b.j.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                bVar = (b) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
            }
            if (bVar2 != null) {
                a(bVar2);
            }
            throw th;
        }
    }

    static {
        b bVar = new b();
        i = bVar;
        bVar.f954e = 0;
        bVar.f955f = Collections.emptyList();
    }

    public b() {
        this.f956g = -1;
        this.f957h = -1;
        this.f952c = d.f1366c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.util.List<a.a.a.a.v0.e.b$b> */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b(e eVar, g gVar, a aVar) {
        this.f956g = -1;
        this.f957h = -1;
        boolean z = false;
        this.f954e = 0;
        this.f955f = Collections.emptyList();
        d.b i2 = d.i();
        f a2 = f.a(i2, 1);
        boolean z2 = false;
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        this.f953d |= 1;
                        this.f954e = eVar.g();
                    } else if (j2 == 18) {
                        if (!(z2 & true)) {
                            this.f955f = new ArrayList();
                            z2 |= true;
                        }
                        this.f955f.add(eVar.a(C0039b.j, gVar));
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
                if (z2 & true) {
                    this.f955f = Collections.unmodifiableList(this.f955f);
                }
                try {
                    a2.a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f952c = i2.l();
                    throw th2;
                }
                this.f952c = i2.l();
                throw th;
            }
        }
        if (z2 & true) {
            this.f955f = Collections.unmodifiableList(this.f955f);
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f952c = i2.l();
            throw th3;
        }
        this.f952c = i2.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        if ((this.f953d & 1) == 1) {
            fVar.b(1, this.f954e);
        }
        for (int i2 = 0; i2 < this.f955f.size(); i2++) {
            fVar.a(2, this.f955f.get(i2));
        }
        fVar.b(this.f952c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.f957h;
        if (i2 != -1) {
            return i2;
        }
        int e2 = (this.f953d & 1) == 1 ? f.e(1, this.f954e) + 0 : 0;
        for (int i3 = 0; i3 < this.f955f.size(); i3++) {
            e2 += f.b(2, this.f955f.get(i3));
        }
        int size = this.f952c.size() + e2;
        this.f957h = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new c();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return i;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        c cVar = new c();
        cVar.a(this);
        return cVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<b> f() {
        return j;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b = this.f956g;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!((this.f953d & 1) == 1)) {
            this.f956g = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f955f.size(); i2++) {
            if (!this.f955f.get(i2).g()) {
                this.f956g = 0;
                return false;
            }
        }
        this.f956g = 1;
        return true;
    }

    public /* synthetic */ b(i.b bVar, a aVar) {
        super(bVar);
        this.f956g = -1;
        this.f957h = -1;
        this.f952c = bVar.f1390c;
    }

    /* renamed from: a.a.a.a.v0.e.b$b  reason: collision with other inner class name */
    public static final class C0039b extends i implements d {
        public static final C0039b i;
        public static s<C0039b> j = new a();

        /* renamed from: c  reason: collision with root package name */
        public final d f958c;

        /* renamed from: d  reason: collision with root package name */
        public int f959d;

        /* renamed from: e  reason: collision with root package name */
        public int f960e;

        /* renamed from: f  reason: collision with root package name */
        public c f961f;

        /* renamed from: g  reason: collision with root package name */
        public byte f962g;

        /* renamed from: h  reason: collision with root package name */
        public int f963h;

        /* renamed from: a.a.a.a.v0.e.b$b$a */
        public static class a extends a.a.a.a.v0.h.b<C0039b> {
            @Override // a.a.a.a.v0.h.s
            public Object a(e eVar, g gVar) {
                return new C0039b(eVar, gVar, null);
            }
        }

        /* renamed from: a.a.a.a.v0.e.b$b$b  reason: collision with other inner class name */
        public static final class C0040b extends i.b<C0039b, C0040b> implements d {

            /* renamed from: d  reason: collision with root package name */
            public int f964d;

            /* renamed from: e  reason: collision with root package name */
            public int f965e;

            /* renamed from: f  reason: collision with root package name */
            public c f966f = c.r;

            /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
            @Override // a.a.a.a.v0.h.i.b
            public /* bridge */ /* synthetic */ C0040b a(C0039b bVar) {
                a(bVar);
                return this;
            }

            @Override // a.a.a.a.v0.h.q.a
            public q a() {
                C0039b h2 = h();
                if (h2.g()) {
                    return h2;
                }
                throw new v();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
            /* renamed from: clone  reason: collision with other method in class */
            public C0040b m14clone() {
                C0040b bVar = new C0040b();
                bVar.a(h());
                return bVar;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
            public C0039b d() {
                return C0039b.i;
            }

            @Override // a.a.a.a.v0.h.r
            public final boolean g() {
                if (!((this.f964d & 1) == 1)) {
                    return false;
                }
                return ((this.f964d & 2) == 2) && this.f966f.g();
            }

            public C0039b h() {
                C0039b bVar = new C0039b(this, null);
                int i = this.f964d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                bVar.f960e = this.f965e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.f961f = this.f966f;
                bVar.f959d = i2;
                return bVar;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
            /* renamed from: d  reason: collision with other method in class */
            public C0039b m15d() {
                return C0039b.i;
            }

            /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
            @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
            public C0040b clone() {
                C0040b bVar = new C0040b();
                bVar.a(h());
                return bVar;
            }

            public C0040b a(C0039b bVar) {
                c cVar;
                if (bVar == C0039b.i) {
                    return this;
                }
                boolean z = true;
                if ((bVar.f959d & 1) == 1) {
                    int i = bVar.f960e;
                    this.f964d |= 1;
                    this.f965e = i;
                }
                if ((bVar.f959d & 2) != 2) {
                    z = false;
                }
                if (z) {
                    c cVar2 = bVar.f961f;
                    if ((this.f964d & 2) == 2 && (cVar = this.f966f) != c.r) {
                        c.C0041b bVar2 = new c.C0041b();
                        bVar2.a(cVar);
                        bVar2.a(cVar2);
                        cVar2 = bVar2.h();
                    }
                    this.f966f = cVar2;
                    this.f964d |= 2;
                }
                this.f1390c = this.f1390c.b(bVar.f958c);
                return this;
            }

            @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
            public C0040b a(e eVar, g gVar) {
                Throwable th;
                C0039b bVar;
                C0039b bVar2 = null;
                try {
                    C0039b a2 = C0039b.j.a(eVar, gVar);
                    if (a2 != null) {
                        a(a2);
                    }
                    return this;
                } catch (k e2) {
                    bVar = (C0039b) e2.f1407c;
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    a(bVar2);
                }
                throw th;
            }
        }

        static {
            C0039b bVar = new C0039b();
            i = bVar;
            bVar.f960e = 0;
            bVar.f961f = c.r;
        }

        public C0039b() {
            this.f962g = -1;
            this.f963h = -1;
            this.f958c = d.f1366c;
        }

        public /* synthetic */ C0039b(e eVar, g gVar, a aVar) {
            this.f962g = -1;
            this.f963h = -1;
            boolean z = false;
            this.f960e = 0;
            this.f961f = c.r;
            d.b i2 = d.i();
            f a2 = f.a(i2, 1);
            while (!z) {
                try {
                    int j2 = eVar.j();
                    if (j2 != 0) {
                        if (j2 == 8) {
                            this.f959d |= 1;
                            this.f960e = eVar.g();
                        } else if (j2 == 18) {
                            c.C0041b bVar = null;
                            if ((this.f959d & 2) == 2) {
                                c cVar = this.f961f;
                                if (cVar != null) {
                                    bVar = new c.C0041b();
                                    bVar.a(cVar);
                                } else {
                                    throw null;
                                }
                            }
                            c cVar2 = (c) eVar.a(c.s, gVar);
                            this.f961f = cVar2;
                            if (bVar != null) {
                                bVar.a(cVar2);
                                this.f961f = bVar.h();
                            }
                            this.f959d |= 2;
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
                        this.f958c = i2.l();
                        throw th2;
                    }
                    this.f958c = i2.l();
                    throw th;
                }
            }
            try {
                a2.a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f958c = i2.l();
                throw th3;
            }
            this.f958c = i2.l();
        }

        @Override // a.a.a.a.v0.h.q
        public void a(f fVar) {
            b();
            if ((this.f959d & 1) == 1) {
                fVar.b(1, this.f960e);
            }
            if ((this.f959d & 2) == 2) {
                fVar.a(2, this.f961f);
            }
            fVar.b(this.f958c);
        }

        @Override // a.a.a.a.v0.h.q
        public int b() {
            int i2 = this.f963h;
            if (i2 != -1) {
                return i2;
            }
            int i3 = 0;
            if ((this.f959d & 1) == 1) {
                i3 = 0 + f.e(1, this.f960e);
            }
            if ((this.f959d & 2) == 2) {
                i3 += f.b(2, this.f961f);
            }
            int size = this.f958c.size() + i3;
            this.f963h = size;
            return size;
        }

        @Override // a.a.a.a.v0.h.q
        public q.a c() {
            return new C0040b();
        }

        @Override // a.a.a.a.v0.h.r
        public q d() {
            return i;
        }

        @Override // a.a.a.a.v0.h.q
        public q.a e() {
            C0040b bVar = new C0040b();
            bVar.a(this);
            return bVar;
        }

        @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
        public s<C0039b> f() {
            return j;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            byte b = this.f962g;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!((this.f959d & 1) == 1)) {
                this.f962g = 0;
                return false;
            }
            if (!((this.f959d & 2) == 2)) {
                this.f962g = 0;
                return false;
            } else if (!this.f961f.g()) {
                this.f962g = 0;
                return false;
            } else {
                this.f962g = 1;
                return true;
            }
        }

        public /* synthetic */ C0039b(i.b bVar, a aVar) {
            super(bVar);
            this.f962g = -1;
            this.f963h = -1;
            this.f958c = bVar.f1390c;
        }

        /* renamed from: a.a.a.a.v0.e.b$b$c */
        public static final class c extends i implements c {
            public static final c r;
            public static s<c> s = new a();

            /* renamed from: c  reason: collision with root package name */
            public final d f967c;

            /* renamed from: d  reason: collision with root package name */
            public int f968d;

            /* renamed from: e  reason: collision with root package name */
            public EnumC0042c f969e;

            /* renamed from: f  reason: collision with root package name */
            public long f970f;

            /* renamed from: g  reason: collision with root package name */
            public float f971g;

            /* renamed from: h  reason: collision with root package name */
            public double f972h;
            public int i;
            public int j;
            public int k;
            public b l;
            public List<c> m;
            public int n;
            public int o;
            public byte p;
            public int q;

            /* renamed from: a.a.a.a.v0.e.b$b$c$a */
            public static class a extends a.a.a.a.v0.h.b<c> {
                @Override // a.a.a.a.v0.h.s
                public Object a(e eVar, g gVar) {
                    return new c(eVar, gVar, null);
                }
            }

            /* renamed from: a.a.a.a.v0.e.b$b$c$b  reason: collision with other inner class name */
            public static final class C0041b extends i.b<c, C0041b> implements c {

                /* renamed from: d  reason: collision with root package name */
                public int f973d;

                /* renamed from: e  reason: collision with root package name */
                public EnumC0042c f974e = EnumC0042c.BYTE;

                /* renamed from: f  reason: collision with root package name */
                public long f975f;

                /* renamed from: g  reason: collision with root package name */
                public float f976g;

                /* renamed from: h  reason: collision with root package name */
                public double f977h;
                public int i;
                public int j;
                public int k;
                public b l = b.i;
                public List<c> m = Collections.emptyList();
                public int n;
                public int o;

                /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
                @Override // a.a.a.a.v0.h.i.b
                public /* bridge */ /* synthetic */ C0041b a(c cVar) {
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
                public C0041b m16clone() {
                    C0041b bVar = new C0041b();
                    bVar.a(h());
                    return bVar;
                }

                /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
                @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
                public c d() {
                    return c.r;
                }

                @Override // a.a.a.a.v0.h.r
                public final boolean g() {
                    if (((this.f973d & 128) == 128) && !this.l.g()) {
                        return false;
                    }
                    for (int i2 = 0; i2 < this.m.size(); i2++) {
                        if (!this.m.get(i2).g()) {
                            return false;
                        }
                    }
                    return true;
                }

                public c h() {
                    c cVar = new c(this, null);
                    int i2 = this.f973d;
                    int i3 = 1;
                    if ((i2 & 1) != 1) {
                        i3 = 0;
                    }
                    cVar.f969e = this.f974e;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    cVar.f970f = this.f975f;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    cVar.f971g = this.f976g;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    cVar.f972h = this.f977h;
                    if ((i2 & 16) == 16) {
                        i3 |= 16;
                    }
                    cVar.i = this.i;
                    if ((i2 & 32) == 32) {
                        i3 |= 32;
                    }
                    cVar.j = this.j;
                    if ((i2 & 64) == 64) {
                        i3 |= 64;
                    }
                    cVar.k = this.k;
                    if ((i2 & 128) == 128) {
                        i3 |= 128;
                    }
                    cVar.l = this.l;
                    if ((this.f973d & 256) == 256) {
                        this.m = Collections.unmodifiableList(this.m);
                        this.f973d &= -257;
                    }
                    cVar.m = this.m;
                    if ((i2 & 512) == 512) {
                        i3 |= 256;
                    }
                    cVar.n = this.n;
                    if ((i2 & 1024) == 1024) {
                        i3 |= 512;
                    }
                    cVar.o = this.o;
                    cVar.f968d = i3;
                    return cVar;
                }

                /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
                @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
                /* renamed from: d  reason: collision with other method in class */
                public c m17d() {
                    return c.r;
                }

                /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
                @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
                public C0041b clone() {
                    C0041b bVar = new C0041b();
                    bVar.a(h());
                    return bVar;
                }

                public C0041b a(c cVar) {
                    b bVar;
                    if (cVar == c.r) {
                        return this;
                    }
                    boolean z = true;
                    if ((cVar.f968d & 1) == 1) {
                        EnumC0042c cVar2 = cVar.f969e;
                        if (cVar2 != null) {
                            this.f973d |= 1;
                            this.f974e = cVar2;
                        } else {
                            throw null;
                        }
                    }
                    if ((cVar.f968d & 2) == 2) {
                        long j2 = cVar.f970f;
                        this.f973d |= 2;
                        this.f975f = j2;
                    }
                    if ((cVar.f968d & 4) == 4) {
                        float f2 = cVar.f971g;
                        this.f973d = 4 | this.f973d;
                        this.f976g = f2;
                    }
                    if ((cVar.f968d & 8) == 8) {
                        double d2 = cVar.f972h;
                        this.f973d |= 8;
                        this.f977h = d2;
                    }
                    if ((cVar.f968d & 16) == 16) {
                        int i2 = cVar.i;
                        this.f973d = 16 | this.f973d;
                        this.i = i2;
                    }
                    if ((cVar.f968d & 32) == 32) {
                        int i3 = cVar.j;
                        this.f973d = 32 | this.f973d;
                        this.j = i3;
                    }
                    if ((cVar.f968d & 64) == 64) {
                        int i4 = cVar.k;
                        this.f973d = 64 | this.f973d;
                        this.k = i4;
                    }
                    if ((cVar.f968d & 128) == 128) {
                        b bVar2 = cVar.l;
                        if ((this.f973d & 128) == 128 && (bVar = this.l) != b.i) {
                            c cVar3 = new c();
                            cVar3.a(bVar);
                            cVar3.a(bVar2);
                            bVar2 = cVar3.h();
                        }
                        this.l = bVar2;
                        this.f973d |= 128;
                    }
                    if (!cVar.m.isEmpty()) {
                        if (this.m.isEmpty()) {
                            this.m = cVar.m;
                            this.f973d &= -257;
                        } else {
                            if ((this.f973d & 256) != 256) {
                                this.m = new ArrayList(this.m);
                                this.f973d |= 256;
                            }
                            this.m.addAll(cVar.m);
                        }
                    }
                    if ((cVar.f968d & 256) == 256) {
                        int i5 = cVar.n;
                        this.f973d |= 512;
                        this.n = i5;
                    }
                    if ((cVar.f968d & 512) != 512) {
                        z = false;
                    }
                    if (z) {
                        int i6 = cVar.o;
                        this.f973d |= 1024;
                        this.o = i6;
                    }
                    this.f1390c = this.f1390c.b(cVar.f967c);
                    return this;
                }

                @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
                public C0041b a(e eVar, g gVar) {
                    Throwable th;
                    c cVar;
                    c cVar2 = null;
                    try {
                        c a2 = c.s.a(eVar, gVar);
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

            /* renamed from: a.a.a.a.v0.e.b$b$c$c  reason: collision with other inner class name */
            public enum EnumC0042c implements j.a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);
                

                /* renamed from: c  reason: collision with root package name */
                public final int f983c;

                /* access modifiers changed from: public */
                EnumC0042c(int i) {
                    this.f983c = i;
                }

                public static EnumC0042c a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // a.a.a.a.v0.h.j.a
                public final int getNumber() {
                    return this.f983c;
                }
            }

            static {
                c cVar = new c();
                r = cVar;
                cVar.h();
            }

            public c() {
                this.p = -1;
                this.q = -1;
                this.f967c = d.f1366c;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r5v36, resolved type: java.util.List<a.a.a.a.v0.e.b$b$c> */
            /* JADX WARN: Multi-variable type inference failed */
            public /* synthetic */ c(e eVar, g gVar, a aVar) {
                this.p = -1;
                this.q = -1;
                h();
                d.b i2 = d.i();
                f a2 = f.a(i2, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int j2 = eVar.j();
                        switch (j2) {
                            case 0:
                                break;
                            case 8:
                                int g2 = eVar.g();
                                EnumC0042c a3 = EnumC0042c.a(g2);
                                if (a3 == null) {
                                    a2.e(j2);
                                    a2.e(g2);
                                    continue;
                                } else {
                                    this.f968d |= 1;
                                    this.f969e = a3;
                                }
                            case 16:
                                this.f968d |= 2;
                                long h2 = eVar.h();
                                this.f970f = (-(h2 & 1)) ^ (h2 >>> 1);
                                continue;
                            case 29:
                                this.f968d |= 4;
                                this.f971g = Float.intBitsToFloat(eVar.e());
                                continue;
                            case 33:
                                this.f968d |= 8;
                                this.f972h = Double.longBitsToDouble(eVar.f());
                                continue;
                            case 40:
                                this.f968d |= 16;
                                this.i = eVar.g();
                                continue;
                            case 48:
                                this.f968d |= 32;
                                this.j = eVar.g();
                                continue;
                            case 56:
                                this.f968d |= 64;
                                this.k = eVar.g();
                                continue;
                            case 66:
                                c cVar = null;
                                if ((this.f968d & 128) == 128) {
                                    b bVar = this.l;
                                    if (bVar != null) {
                                        cVar = new c();
                                        cVar.a(bVar);
                                    } else {
                                        throw null;
                                    }
                                }
                                b bVar2 = (b) eVar.a(b.j, gVar);
                                this.l = bVar2;
                                if (cVar != null) {
                                    cVar.a(bVar2);
                                    this.l = cVar.h();
                                }
                                this.f968d |= 128;
                                continue;
                            case 74:
                                if (!(z2 & true)) {
                                    this.m = new ArrayList();
                                    z2 |= true;
                                }
                                this.m.add(eVar.a(s, gVar));
                                continue;
                            case d.b.j.AppCompatTheme_panelBackground /*{ENCODED_INT: 80}*/:
                                this.f968d |= 512;
                                this.o = eVar.g();
                                continue;
                            case d.b.j.AppCompatTheme_ratingBarStyleSmall /*{ENCODED_INT: 88}*/:
                                this.f968d |= 256;
                                this.n = eVar.g();
                                continue;
                            default:
                                if (eVar.a(j2, a2)) {
                                    continue;
                                }
                                break;
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
                            this.m = Collections.unmodifiableList(this.m);
                        }
                        try {
                            a2.a();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f967c = i2.l();
                            throw th2;
                        }
                        this.f967c = i2.l();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.m = Collections.unmodifiableList(this.m);
                }
                try {
                    a2.a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f967c = i2.l();
                    throw th3;
                }
                this.f967c = i2.l();
            }

            @Override // a.a.a.a.v0.h.q
            public void a(f fVar) {
                b();
                if ((this.f968d & 1) == 1) {
                    fVar.a(1, this.f969e.f983c);
                }
                if ((this.f968d & 2) == 2) {
                    long j2 = this.f970f;
                    fVar.e(16);
                    fVar.b((j2 << 1) ^ (j2 >> 63));
                }
                if ((this.f968d & 4) == 4) {
                    float f2 = this.f971g;
                    fVar.e(29);
                    fVar.d(Float.floatToRawIntBits(f2));
                }
                if ((this.f968d & 8) == 8) {
                    double d2 = this.f972h;
                    fVar.e(33);
                    fVar.a(Double.doubleToRawLongBits(d2));
                }
                if ((this.f968d & 16) == 16) {
                    fVar.b(5, this.i);
                }
                if ((this.f968d & 32) == 32) {
                    fVar.b(6, this.j);
                }
                if ((this.f968d & 64) == 64) {
                    fVar.b(7, this.k);
                }
                if ((this.f968d & 128) == 128) {
                    fVar.a(8, this.l);
                }
                for (int i2 = 0; i2 < this.m.size(); i2++) {
                    fVar.a(9, this.m.get(i2));
                }
                if ((this.f968d & 512) == 512) {
                    fVar.b(10, this.o);
                }
                if ((this.f968d & 256) == 256) {
                    fVar.b(11, this.n);
                }
                fVar.b(this.f967c);
            }

            @Override // a.a.a.a.v0.h.q
            public int b() {
                int i2 = this.q;
                if (i2 != -1) {
                    return i2;
                }
                int d2 = (this.f968d & 1) == 1 ? f.d(1, this.f969e.f983c) + 0 : 0;
                if ((this.f968d & 2) == 2) {
                    long j2 = this.f970f;
                    d2 += f.c((j2 >> 63) ^ (j2 << 1)) + f.h(2);
                }
                if ((this.f968d & 4) == 4) {
                    d2 += f.h(3) + 4;
                }
                if ((this.f968d & 8) == 8) {
                    d2 += f.h(4) + 8;
                }
                if ((this.f968d & 16) == 16) {
                    d2 += f.e(5, this.i);
                }
                if ((this.f968d & 32) == 32) {
                    d2 += f.e(6, this.j);
                }
                if ((this.f968d & 64) == 64) {
                    d2 += f.e(7, this.k);
                }
                if ((this.f968d & 128) == 128) {
                    d2 += f.b(8, this.l);
                }
                for (int i3 = 0; i3 < this.m.size(); i3++) {
                    d2 += f.b(9, this.m.get(i3));
                }
                if ((this.f968d & 512) == 512) {
                    d2 += f.e(10, this.o);
                }
                if ((this.f968d & 256) == 256) {
                    d2 += f.e(11, this.n);
                }
                int size = this.f967c.size() + d2;
                this.q = size;
                return size;
            }

            @Override // a.a.a.a.v0.h.q
            public q.a c() {
                return new C0041b();
            }

            @Override // a.a.a.a.v0.h.r
            public q d() {
                return r;
            }

            @Override // a.a.a.a.v0.h.q
            public q.a e() {
                C0041b bVar = new C0041b();
                bVar.a(this);
                return bVar;
            }

            @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
            public s<c> f() {
                return s;
            }

            @Override // a.a.a.a.v0.h.r
            public final boolean g() {
                byte b = this.p;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!((this.f968d & 128) == 128) || this.l.g()) {
                    for (int i2 = 0; i2 < this.m.size(); i2++) {
                        if (!this.m.get(i2).g()) {
                            this.p = 0;
                            return false;
                        }
                    }
                    this.p = 1;
                    return true;
                }
                this.p = 0;
                return false;
            }

            public final void h() {
                this.f969e = EnumC0042c.BYTE;
                this.f970f = 0;
                this.f971g = 0.0f;
                this.f972h = 0.0d;
                this.i = 0;
                this.j = 0;
                this.k = 0;
                this.l = b.i;
                this.m = Collections.emptyList();
                this.n = 0;
                this.o = 0;
            }

            public /* synthetic */ c(i.b bVar, a aVar) {
                super(bVar);
                this.p = -1;
                this.q = -1;
                this.f967c = bVar.f1390c;
            }
        }
    }
}
