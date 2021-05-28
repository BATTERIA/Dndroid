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

public final class r0 extends i implements s0 {
    public static final r0 m;
    public static s<r0> n = new a();

    /* renamed from: c  reason: collision with root package name */
    public final a.a.a.a.v0.h.d f1162c;

    /* renamed from: d  reason: collision with root package name */
    public int f1163d;

    /* renamed from: e  reason: collision with root package name */
    public int f1164e;

    /* renamed from: f  reason: collision with root package name */
    public int f1165f;

    /* renamed from: g  reason: collision with root package name */
    public c f1166g;

    /* renamed from: h  reason: collision with root package name */
    public int f1167h;
    public int i;
    public d j;
    public byte k;
    public int l;

    public static class a extends a.a.a.a.v0.h.b<r0> {
        @Override // a.a.a.a.v0.h.s
        public Object a(e eVar, g gVar) {
            return new r0(eVar, gVar, null);
        }
    }

    public static final class b extends i.b<r0, b> implements s0 {

        /* renamed from: d  reason: collision with root package name */
        public int f1168d;

        /* renamed from: e  reason: collision with root package name */
        public int f1169e;

        /* renamed from: f  reason: collision with root package name */
        public int f1170f;

        /* renamed from: g  reason: collision with root package name */
        public c f1171g = c.ERROR;

        /* renamed from: h  reason: collision with root package name */
        public int f1172h;
        public int i;
        public d j = d.LANGUAGE_VERSION;

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [a.a.a.a.v0.h.i] */
        @Override // a.a.a.a.v0.h.i.b
        public /* bridge */ /* synthetic */ b a(r0 r0Var) {
            a(r0Var);
            return this;
        }

        @Override // a.a.a.a.v0.h.q.a
        public q a() {
            r0 h2 = h();
            if (h2.g()) {
                return h2;
            }
            throw new v();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        /* renamed from: clone  reason: collision with other method in class */
        public b m53clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        public r0 d() {
            return r0.m;
        }

        @Override // a.a.a.a.v0.h.r
        public final boolean g() {
            return true;
        }

        public r0 h() {
            r0 r0Var = new r0(this, null);
            int i2 = this.f1168d;
            int i3 = 1;
            if ((i2 & 1) != 1) {
                i3 = 0;
            }
            r0Var.f1164e = this.f1169e;
            if ((i2 & 2) == 2) {
                i3 |= 2;
            }
            r0Var.f1165f = this.f1170f;
            if ((i2 & 4) == 4) {
                i3 |= 4;
            }
            r0Var.f1166g = this.f1171g;
            if ((i2 & 8) == 8) {
                i3 |= 8;
            }
            r0Var.f1167h = this.f1172h;
            if ((i2 & 16) == 16) {
                i3 |= 16;
            }
            r0Var.i = this.i;
            if ((i2 & 32) == 32) {
                i3 |= 32;
            }
            r0Var.j = this.j;
            r0Var.f1163d = i3;
            return r0Var;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.q' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.r
        /* renamed from: d  reason: collision with other method in class */
        public r0 m54d() {
            return r0.m;
        }

        /* Return type fixed from 'a.a.a.a.v0.h.i$b' to match base method */
        @Override // a.a.a.a.v0.h.i.b, a.a.a.a.v0.h.i.b, java.lang.Object
        public b clone() {
            b bVar = new b();
            bVar.a(h());
            return bVar;
        }

        public b a(r0 r0Var) {
            if (r0Var == r0.m) {
                return this;
            }
            boolean z = true;
            if ((r0Var.f1163d & 1) == 1) {
                int i2 = r0Var.f1164e;
                this.f1168d |= 1;
                this.f1169e = i2;
            }
            if ((r0Var.f1163d & 2) == 2) {
                int i3 = r0Var.f1165f;
                this.f1168d = 2 | this.f1168d;
                this.f1170f = i3;
            }
            if ((r0Var.f1163d & 4) == 4) {
                c cVar = r0Var.f1166g;
                if (cVar != null) {
                    this.f1168d = 4 | this.f1168d;
                    this.f1171g = cVar;
                } else {
                    throw null;
                }
            }
            if ((r0Var.f1163d & 8) == 8) {
                int i4 = r0Var.f1167h;
                this.f1168d = 8 | this.f1168d;
                this.f1172h = i4;
            }
            if ((r0Var.f1163d & 16) == 16) {
                int i5 = r0Var.i;
                this.f1168d = 16 | this.f1168d;
                this.i = i5;
            }
            if ((r0Var.f1163d & 32) != 32) {
                z = false;
            }
            if (z) {
                d dVar = r0Var.j;
                if (dVar != null) {
                    this.f1168d |= 32;
                    this.j = dVar;
                } else {
                    throw null;
                }
            }
            this.f1390c = this.f1390c.b(r0Var.f1162c);
            return this;
        }

        @Override // a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.a.AbstractC0055a, a.a.a.a.v0.h.q.a
        public b a(e eVar, g gVar) {
            Throwable th;
            r0 r0Var;
            r0 r0Var2 = null;
            try {
                r0 a2 = r0.n.a(eVar, gVar);
                if (a2 != null) {
                    a(a2);
                }
                return this;
            } catch (k e2) {
                r0Var = (r0) e2.f1407c;
                throw e2;
            } catch (Throwable th2) {
                th = th2;
                r0Var2 = r0Var;
            }
            if (r0Var2 != null) {
                a(r0Var2);
            }
            throw th;
        }
    }

    public enum c implements j.a {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1177c;

        /* access modifiers changed from: public */
        c(int i) {
            this.f1177c = i;
        }

        public static c a(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1177c;
        }
    }

    public enum d implements j.a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);
        

        /* renamed from: c  reason: collision with root package name */
        public final int f1182c;

        /* access modifiers changed from: public */
        d(int i) {
            this.f1182c = i;
        }

        public static d a(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // a.a.a.a.v0.h.j.a
        public final int getNumber() {
            return this.f1182c;
        }
    }

    static {
        r0 r0Var = new r0();
        m = r0Var;
        r0Var.f1164e = 0;
        r0Var.f1165f = 0;
        r0Var.f1166g = c.ERROR;
        r0Var.f1167h = 0;
        r0Var.i = 0;
        r0Var.j = d.LANGUAGE_VERSION;
    }

    public r0() {
        this.k = -1;
        this.l = -1;
        this.f1162c = a.a.a.a.v0.h.d.f1366c;
    }

    public /* synthetic */ r0(e eVar, g gVar, a aVar) {
        int g2;
        this.k = -1;
        this.l = -1;
        boolean z = false;
        this.f1164e = 0;
        this.f1165f = 0;
        this.f1166g = c.ERROR;
        this.f1167h = 0;
        this.i = 0;
        this.j = d.LANGUAGE_VERSION;
        d.b i2 = a.a.a.a.v0.h.d.i();
        f a2 = f.a(i2, 1);
        while (!z) {
            try {
                int j2 = eVar.j();
                if (j2 != 0) {
                    if (j2 == 8) {
                        this.f1163d |= 1;
                        this.f1164e = eVar.g();
                    } else if (j2 != 16) {
                        if (j2 == 24) {
                            g2 = eVar.g();
                            c a3 = c.a(g2);
                            if (a3 != null) {
                                this.f1163d |= 4;
                                this.f1166g = a3;
                            }
                        } else if (j2 == 32) {
                            this.f1163d |= 8;
                            this.f1167h = eVar.g();
                        } else if (j2 == 40) {
                            this.f1163d |= 16;
                            this.i = eVar.g();
                        } else if (j2 == 48) {
                            g2 = eVar.g();
                            d a4 = d.a(g2);
                            if (a4 != null) {
                                this.f1163d |= 32;
                                this.j = a4;
                            }
                        } else if (!eVar.a(j2, a2)) {
                        }
                        a2.e(j2);
                        a2.e(g2);
                    } else {
                        this.f1163d |= 2;
                        this.f1165f = eVar.g();
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
                    this.f1162c = i2.l();
                    throw th2;
                }
                this.f1162c = i2.l();
                throw th;
            }
        }
        try {
            a2.a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1162c = i2.l();
            throw th3;
        }
        this.f1162c = i2.l();
    }

    @Override // a.a.a.a.v0.h.q
    public void a(f fVar) {
        b();
        if ((this.f1163d & 1) == 1) {
            fVar.b(1, this.f1164e);
        }
        if ((this.f1163d & 2) == 2) {
            fVar.b(2, this.f1165f);
        }
        if ((this.f1163d & 4) == 4) {
            fVar.a(3, this.f1166g.f1177c);
        }
        if ((this.f1163d & 8) == 8) {
            fVar.b(4, this.f1167h);
        }
        if ((this.f1163d & 16) == 16) {
            fVar.b(5, this.i);
        }
        if ((this.f1163d & 32) == 32) {
            fVar.a(6, this.j.f1182c);
        }
        fVar.b(this.f1162c);
    }

    @Override // a.a.a.a.v0.h.q
    public int b() {
        int i2 = this.l;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.f1163d & 1) == 1) {
            i3 = 0 + f.e(1, this.f1164e);
        }
        if ((this.f1163d & 2) == 2) {
            i3 += f.e(2, this.f1165f);
        }
        if ((this.f1163d & 4) == 4) {
            i3 += f.d(3, this.f1166g.f1177c);
        }
        if ((this.f1163d & 8) == 8) {
            i3 += f.e(4, this.f1167h);
        }
        if ((this.f1163d & 16) == 16) {
            i3 += f.e(5, this.i);
        }
        if ((this.f1163d & 32) == 32) {
            i3 += f.d(6, this.j.f1182c);
        }
        int size = this.f1162c.size() + i3;
        this.l = size;
        return size;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a c() {
        return new b();
    }

    @Override // a.a.a.a.v0.h.r
    public q d() {
        return m;
    }

    @Override // a.a.a.a.v0.h.q
    public q.a e() {
        b bVar = new b();
        bVar.a(this);
        return bVar;
    }

    @Override // a.a.a.a.v0.h.i, a.a.a.a.v0.h.q
    public s<r0> f() {
        return n;
    }

    @Override // a.a.a.a.v0.h.r
    public final boolean g() {
        byte b2 = this.k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.k = 1;
        return true;
    }

    public /* synthetic */ r0(i.b bVar, a aVar) {
        super(bVar);
        this.k = -1;
        this.l = -1;
        this.f1162c = bVar.f1390c;
    }
}
