package f;

import f.o0.g.d;
import f.x;
import java.io.Closeable;

public final class h0 implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final e0 f5018c;

    /* renamed from: d  reason: collision with root package name */
    public final c0 f5019d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5020e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5021f;

    /* renamed from: g  reason: collision with root package name */
    public final w f5022g;

    /* renamed from: h  reason: collision with root package name */
    public final x f5023h;
    public final j0 i;
    public final h0 j;
    public final h0 k;
    public final h0 l;
    public final long m;
    public final long n;
    public final d o;
    public volatile i p;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e0 f5024a;
        public c0 b;

        /* renamed from: c  reason: collision with root package name */
        public int f5025c;

        /* renamed from: d  reason: collision with root package name */
        public String f5026d;

        /* renamed from: e  reason: collision with root package name */
        public w f5027e;

        /* renamed from: f  reason: collision with root package name */
        public x.a f5028f;

        /* renamed from: g  reason: collision with root package name */
        public j0 f5029g;

        /* renamed from: h  reason: collision with root package name */
        public h0 f5030h;
        public h0 i;
        public h0 j;
        public long k;
        public long l;
        public d m;

        public a() {
            this.f5025c = -1;
            this.f5028f = new x.a();
        }

        public a(h0 h0Var) {
            this.f5025c = -1;
            this.f5024a = h0Var.f5018c;
            this.b = h0Var.f5019d;
            this.f5025c = h0Var.f5020e;
            this.f5026d = h0Var.f5021f;
            this.f5027e = h0Var.f5022g;
            this.f5028f = h0Var.f5023h.a();
            this.f5029g = h0Var.i;
            this.f5030h = h0Var.j;
            this.i = h0Var.k;
            this.j = h0Var.l;
            this.k = h0Var.m;
            this.l = h0Var.n;
            this.m = h0Var.o;
        }

        public a a(h0 h0Var) {
            if (h0Var != null) {
                a("cacheResponse", h0Var);
            }
            this.i = h0Var;
            return this;
        }

        public a a(x xVar) {
            this.f5028f = xVar.a();
            return this;
        }

        public a a(String str, String str2) {
            x.a aVar = this.f5028f;
            if (aVar != null) {
                x.b(str);
                x.a(str2, str);
                aVar.f5402a.add(str);
                aVar.f5402a.add(str2.trim());
                return this;
            }
            throw null;
        }

        public h0 a() {
            if (this.f5024a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f5025c < 0) {
                StringBuilder a2 = e.a.a.a.a.a("code < 0: ");
                a2.append(this.f5025c);
                throw new IllegalStateException(a2.toString());
            } else if (this.f5026d != null) {
                return new h0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public final void a(String str, h0 h0Var) {
            if (h0Var.i != null) {
                throw new IllegalArgumentException(e.a.a.a.a.b(str, ".body != null"));
            } else if (h0Var.j != null) {
                throw new IllegalArgumentException(e.a.a.a.a.b(str, ".networkResponse != null"));
            } else if (h0Var.k != null) {
                throw new IllegalArgumentException(e.a.a.a.a.b(str, ".cacheResponse != null"));
            } else if (h0Var.l != null) {
                throw new IllegalArgumentException(e.a.a.a.a.b(str, ".priorResponse != null"));
            }
        }
    }

    public h0(a aVar) {
        this.f5018c = aVar.f5024a;
        this.f5019d = aVar.b;
        this.f5020e = aVar.f5025c;
        this.f5021f = aVar.f5026d;
        this.f5022g = aVar.f5027e;
        x.a aVar2 = aVar.f5028f;
        if (aVar2 != null) {
            this.f5023h = new x(aVar2);
            this.i = aVar.f5029g;
            this.j = aVar.f5030h;
            this.k = aVar.i;
            this.l = aVar.j;
            this.m = aVar.k;
            this.n = aVar.l;
            this.o = aVar.m;
            return;
        }
        throw null;
    }

    public i a() {
        i iVar = this.p;
        if (iVar != null) {
            return iVar;
        }
        i a2 = i.a(this.f5023h);
        this.p = a2;
        return a2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        j0 j0Var = this.i;
        if (j0Var != null) {
            j0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Response{protocol=");
        a2.append(this.f5019d);
        a2.append(", code=");
        a2.append(this.f5020e);
        a2.append(", message=");
        a2.append(this.f5021f);
        a2.append(", url=");
        a2.append(this.f5018c.f5005a);
        a2.append('}');
        return a2.toString();
    }
}
