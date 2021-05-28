package f.o0.i;

import f.b0;
import f.e0;
import f.g0;
import f.h0;
import f.o0.h.i;
import f.x;
import g.k;
import g.w;
import g.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;

public final class a implements f.o0.h.c {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f5172a;
    public final f.o0.g.g b;

    /* renamed from: c  reason: collision with root package name */
    public final g.g f5173c;

    /* renamed from: d  reason: collision with root package name */
    public final g.f f5174d;

    /* renamed from: e  reason: collision with root package name */
    public int f5175e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f5176f = 262144;

    /* renamed from: g  reason: collision with root package name */
    public x f5177g;

    public abstract class b implements g.x {

        /* renamed from: c  reason: collision with root package name */
        public final k f5178c = new k(a.this.f5173c.c());

        /* renamed from: d  reason: collision with root package name */
        public boolean f5179d;

        public /* synthetic */ b(C0151a aVar) {
        }

        public final void a() {
            a aVar = a.this;
            int i = aVar.f5175e;
            if (i != 6) {
                if (i == 5) {
                    a.a(aVar, this.f5178c);
                    a.this.f5175e = 6;
                    return;
                }
                StringBuilder a2 = e.a.a.a.a.a("state: ");
                a2.append(a.this.f5175e);
                throw new IllegalStateException(a2.toString());
            }
        }

        @Override // g.x
        public long c(g.e eVar, long j) {
            try {
                return a.this.f5173c.c(eVar, j);
            } catch (IOException e2) {
                a.this.b.b();
                a();
                throw e2;
            }
        }

        @Override // g.x
        public y c() {
            return this.f5178c;
        }
    }

    public final class c implements w {

        /* renamed from: c  reason: collision with root package name */
        public final k f5181c = new k(a.this.f5174d.c());

        /* renamed from: d  reason: collision with root package name */
        public boolean f5182d;

        public c() {
        }

        @Override // g.w
        public void a(g.e eVar, long j) {
            if (this.f5182d) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                a.this.f5174d.a(j);
                a.this.f5174d.a("\r\n");
                a.this.f5174d.a(eVar, j);
                a.this.f5174d.a("\r\n");
            }
        }

        @Override // g.w
        public y c() {
            return this.f5181c;
        }

        @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (!this.f5182d) {
                this.f5182d = true;
                a.this.f5174d.a("0\r\n\r\n");
                a.a(a.this, this.f5181c);
                a.this.f5175e = 3;
            }
        }

        @Override // g.w, java.io.Flushable
        public synchronized void flush() {
            if (!this.f5182d) {
                a.this.f5174d.flush();
            }
        }
    }

    public class d extends b {

        /* renamed from: f  reason: collision with root package name */
        public final f.y f5184f;

        /* renamed from: g  reason: collision with root package name */
        public long f5185g = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5186h = true;

        public d(f.y yVar) {
            super(null);
            this.f5184f = yVar;
        }

        @Override // g.x, f.o0.i.a.b
        public long c(g.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f5179d) {
                throw new IllegalStateException("closed");
            } else if (!this.f5186h) {
                return -1;
            } else {
                long j2 = this.f5185g;
                if (j2 == 0 || j2 == -1) {
                    if (this.f5185g != -1) {
                        a.this.f5173c.g();
                    }
                    try {
                        this.f5185g = a.this.f5173c.j();
                        String trim = a.this.f5173c.g().trim();
                        if (this.f5185g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f5185g + trim + "\"");
                        }
                        if (this.f5185g == 0) {
                            this.f5186h = false;
                            a aVar = a.this;
                            aVar.f5177g = aVar.e();
                            a aVar2 = a.this;
                            f.o0.h.e.a(aVar2.f5172a.k, this.f5184f, aVar2.f5177g);
                            a();
                        }
                        if (!this.f5186h) {
                            return -1;
                        }
                    } catch (NumberFormatException e2) {
                        throw new ProtocolException(e2.getMessage());
                    }
                }
                long c2 = super.c(eVar, Math.min(j, this.f5185g));
                if (c2 != -1) {
                    this.f5185g -= c2;
                    return c2;
                }
                a.this.b.b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5179d) {
                if (this.f5186h && !f.o0.e.a(this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.b.b();
                    a();
                }
                this.f5179d = true;
            }
        }
    }

    public class e extends b {

        /* renamed from: f  reason: collision with root package name */
        public long f5187f;

        public e(long j) {
            super(null);
            this.f5187f = j;
            if (j == 0) {
                a();
            }
        }

        @Override // g.x, f.o0.i.a.b
        public long c(g.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (!this.f5179d) {
                long j2 = this.f5187f;
                if (j2 == 0) {
                    return -1;
                }
                long c2 = super.c(eVar, Math.min(j2, j));
                if (c2 != -1) {
                    long j3 = this.f5187f - c2;
                    this.f5187f = j3;
                    if (j3 == 0) {
                        a();
                    }
                    return c2;
                }
                a.this.b.b();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5179d) {
                if (this.f5187f != 0 && !f.o0.e.a(this, 100, TimeUnit.MILLISECONDS)) {
                    a.this.b.b();
                    a();
                }
                this.f5179d = true;
            }
        }
    }

    public final class f implements w {

        /* renamed from: c  reason: collision with root package name */
        public final k f5189c = new k(a.this.f5174d.c());

        /* renamed from: d  reason: collision with root package name */
        public boolean f5190d;

        public /* synthetic */ f(C0151a aVar) {
        }

        @Override // g.w
        public void a(g.e eVar, long j) {
            if (!this.f5190d) {
                f.o0.e.a(eVar.f5428d, 0, j);
                a.this.f5174d.a(eVar, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        @Override // g.w
        public y c() {
            return this.f5189c;
        }

        @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5190d) {
                this.f5190d = true;
                a.a(a.this, this.f5189c);
                a.this.f5175e = 3;
            }
        }

        @Override // g.w, java.io.Flushable
        public void flush() {
            if (!this.f5190d) {
                a.this.f5174d.flush();
            }
        }
    }

    public class g extends b {

        /* renamed from: f  reason: collision with root package name */
        public boolean f5192f;

        public /* synthetic */ g(a aVar, C0151a aVar2) {
            super(null);
        }

        @Override // g.x, f.o0.i.a.b
        public long c(g.e eVar, long j) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (this.f5179d) {
                throw new IllegalStateException("closed");
            } else if (this.f5192f) {
                return -1;
            } else {
                long c2 = super.c(eVar, j);
                if (c2 != -1) {
                    return c2;
                }
                this.f5192f = true;
                a();
                return -1;
            }
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5179d) {
                if (!this.f5192f) {
                    a();
                }
                this.f5179d = true;
            }
        }
    }

    public a(b0 b0Var, f.o0.g.g gVar, g.g gVar2, g.f fVar) {
        this.f5172a = b0Var;
        this.b = gVar;
        this.f5173c = gVar2;
        this.f5174d = fVar;
    }

    public static /* synthetic */ void a(a aVar, k kVar) {
        if (aVar != null) {
            y yVar = kVar.f5442e;
            kVar.f5442e = y.f5473d;
            yVar.a();
            yVar.b();
            return;
        }
        throw null;
    }

    public final g.x a(long j) {
        if (this.f5175e == 4) {
            this.f5175e = 5;
            return new e(j);
        }
        StringBuilder a2 = e.a.a.a.a.a("state: ");
        a2.append(this.f5175e);
        throw new IllegalStateException(a2.toString());
    }

    @Override // f.o0.h.c
    public void a() {
        this.f5174d.flush();
    }

    public void a(x xVar, String str) {
        if (this.f5175e == 0) {
            this.f5174d.a(str).a("\r\n");
            int b2 = xVar.b();
            for (int i = 0; i < b2; i++) {
                this.f5174d.a(xVar.a(i)).a(": ").a(xVar.b(i)).a("\r\n");
            }
            this.f5174d.a("\r\n");
            this.f5175e = 1;
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("state: ");
        a2.append(this.f5175e);
        throw new IllegalStateException(a2.toString());
    }

    @Override // f.o0.h.c
    public g.x b(h0 h0Var) {
        if (!f.o0.h.e.b(h0Var)) {
            return a(0);
        }
        String a2 = h0Var.f5023h.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            f.y yVar = h0Var.f5018c.f5005a;
            if (this.f5175e == 4) {
                this.f5175e = 5;
                return new d(yVar);
            }
            StringBuilder a3 = e.a.a.a.a.a("state: ");
            a3.append(this.f5175e);
            throw new IllegalStateException(a3.toString());
        }
        long a4 = f.o0.h.e.a(h0Var);
        if (a4 != -1) {
            return a(a4);
        }
        if (this.f5175e == 4) {
            this.f5175e = 5;
            this.b.b();
            return new g(this, null);
        }
        StringBuilder a5 = e.a.a.a.a.a("state: ");
        a5.append(this.f5175e);
        throw new IllegalStateException(a5.toString());
    }

    @Override // f.o0.h.c
    public void b() {
        this.f5174d.flush();
    }

    @Override // f.o0.h.c
    public f.o0.g.g c() {
        return this.b;
    }

    @Override // f.o0.h.c
    public void cancel() {
        f.o0.g.g gVar = this.b;
        if (gVar != null) {
            f.o0.e.a(gVar.f5125d);
        }
    }

    public final String d() {
        String c2 = this.f5173c.c(this.f5176f);
        this.f5176f -= (long) c2.length();
        return c2;
    }

    public final x e() {
        x.a aVar = new x.a();
        while (true) {
            String d2 = d();
            if (d2.length() == 0) {
                return new x(aVar);
            }
            if (((b0.a) f.o0.c.f5081a) != null) {
                int indexOf = d2.indexOf(":", 1);
                if (indexOf != -1) {
                    aVar.a(d2.substring(0, indexOf), d2.substring(indexOf + 1));
                } else {
                    if (d2.startsWith(":")) {
                        d2 = d2.substring(1);
                    }
                    aVar.f5402a.add("");
                    aVar.f5402a.add(d2.trim());
                }
            } else {
                throw null;
            }
        }
    }

    @Override // f.o0.h.c
    public w a(e0 e0Var, long j) {
        g0 g0Var = e0Var.f5007d;
        if (g0Var != null && g0Var == null) {
            throw null;
        } else if ("chunked".equalsIgnoreCase(e0Var.f5006c.a("Transfer-Encoding"))) {
            if (this.f5175e == 1) {
                this.f5175e = 2;
                return new c();
            }
            StringBuilder a2 = e.a.a.a.a.a("state: ");
            a2.append(this.f5175e);
            throw new IllegalStateException(a2.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f5175e == 1) {
            this.f5175e = 2;
            return new f(null);
        } else {
            StringBuilder a3 = e.a.a.a.a.a("state: ");
            a3.append(this.f5175e);
            throw new IllegalStateException(a3.toString());
        }
    }

    @Override // f.o0.h.c
    public h0.a a(boolean z) {
        int i = this.f5175e;
        if (i == 1 || i == 3) {
            try {
                i a2 = i.a(d());
                h0.a aVar = new h0.a();
                aVar.b = a2.f5170a;
                aVar.f5025c = a2.b;
                aVar.f5026d = a2.f5171c;
                aVar.a(e());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.f5175e = 3;
                    return aVar;
                }
                this.f5175e = 4;
                return aVar;
            } catch (EOFException e2) {
                f.o0.g.g gVar = this.b;
                throw new IOException(e.a.a.a.a.b("unexpected end of stream on ", gVar != null ? gVar.f5124c.f5048a.f4998a.f() : "unknown"), e2);
            }
        } else {
            StringBuilder a3 = e.a.a.a.a.a("state: ");
            a3.append(this.f5175e);
            throw new IllegalStateException(a3.toString());
        }
    }

    @Override // f.o0.h.c
    public long a(h0 h0Var) {
        if (!f.o0.h.e.b(h0Var)) {
            return 0;
        }
        String a2 = h0Var.f5023h.a("Transfer-Encoding");
        if (a2 == null) {
            a2 = null;
        }
        if ("chunked".equalsIgnoreCase(a2)) {
            return -1;
        }
        return f.o0.h.e.a(h0Var);
    }

    @Override // f.o0.h.c
    public void a(e0 e0Var) {
        Proxy.Type type = this.b.f5124c.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(e0Var.b);
        sb.append(' ');
        if (!e0Var.f5005a.f5403a.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(e0Var.f5005a);
        } else {
            sb.append(a.a.a.a.v0.m.l1.a.a(e0Var.f5005a));
        }
        sb.append(" HTTP/1.1");
        a(e0Var.f5006c, sb.toString());
    }
}
