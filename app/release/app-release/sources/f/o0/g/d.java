package f.o0.g;

import f.b0;
import f.e0;
import f.h0;
import f.j;
import f.o0.h.c;
import f.o0.n.c;
import f.u;
import g.e;
import g.i;
import g.w;
import g.x;
import java.io.IOException;
import java.net.ProtocolException;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final l f5101a;
    public final j b;

    /* renamed from: c  reason: collision with root package name */
    public final u f5102c;

    /* renamed from: d  reason: collision with root package name */
    public final e f5103d;

    /* renamed from: e  reason: collision with root package name */
    public final c f5104e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5105f;

    public final class a extends i {

        /* renamed from: d  reason: collision with root package name */
        public boolean f5106d;

        /* renamed from: e  reason: collision with root package name */
        public long f5107e;

        /* renamed from: f  reason: collision with root package name */
        public long f5108f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5109g;

        public a(w wVar, long j) {
            super(wVar);
            this.f5107e = j;
        }

        public final IOException a(IOException iOException) {
            if (this.f5106d) {
                return iOException;
            }
            this.f5106d = true;
            return d.this.a(this.f5108f, false, true, iOException);
        }

        @Override // g.w
        public void a(e eVar, long j) {
            if (!this.f5109g) {
                long j2 = this.f5107e;
                if (j2 == -1 || this.f5108f + j <= j2) {
                    try {
                        this.f5440c.a(eVar, j);
                        this.f5108f += j;
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    StringBuilder a2 = e.a.a.a.a.a("expected ");
                    a2.append(this.f5107e);
                    a2.append(" bytes but received ");
                    a2.append(this.f5108f + j);
                    throw new ProtocolException(a2.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // g.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5109g) {
                this.f5109g = true;
                long j = this.f5107e;
                if (j == -1 || this.f5108f == j) {
                    try {
                        this.f5440c.close();
                        a(null);
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        @Override // g.w, java.io.Flushable
        public void flush() {
            try {
                this.f5440c.flush();
            } catch (IOException e2) {
                throw a(e2);
            }
        }
    }

    public final class b extends g.j {

        /* renamed from: d  reason: collision with root package name */
        public final long f5111d;

        /* renamed from: e  reason: collision with root package name */
        public long f5112e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5113f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5114g;

        public b(x xVar, long j) {
            super(xVar);
            this.f5111d = j;
            if (j == 0) {
                a(null);
            }
        }

        public IOException a(IOException iOException) {
            if (this.f5113f) {
                return iOException;
            }
            this.f5113f = true;
            return d.this.a(this.f5112e, true, false, iOException);
        }

        @Override // g.x
        public long c(e eVar, long j) {
            if (!this.f5114g) {
                try {
                    long c2 = this.f5441c.c(eVar, j);
                    if (c2 == -1) {
                        a(null);
                        return -1;
                    }
                    long j2 = this.f5112e + c2;
                    if (this.f5111d != -1) {
                        if (j2 > this.f5111d) {
                            throw new ProtocolException("expected " + this.f5111d + " bytes but received " + j2);
                        }
                    }
                    this.f5112e = j2;
                    if (j2 == this.f5111d) {
                        a(null);
                    }
                    return c2;
                } catch (IOException e2) {
                    throw a(e2);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5114g) {
                this.f5114g = true;
                try {
                    this.f5441c.close();
                    a(null);
                } catch (IOException e2) {
                    throw a(e2);
                }
            }
        }
    }

    public d(l lVar, j jVar, u uVar, e eVar, c cVar) {
        this.f5101a = lVar;
        this.b = jVar;
        this.f5102c = uVar;
        this.f5103d = eVar;
        this.f5104e = cVar;
    }

    public g a() {
        return this.f5104e.c();
    }

    public IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            this.f5103d.d();
            this.f5104e.c().a(iOException);
        }
        if (z2) {
            u uVar = this.f5102c;
            if (iOException != null) {
                if (uVar == null) {
                    throw null;
                }
            } else if (uVar == null) {
                throw null;
            }
        }
        if (z) {
            u uVar2 = this.f5102c;
            if (iOException != null) {
                if (uVar2 == null) {
                    throw null;
                }
            } else if (uVar2 == null) {
                throw null;
            }
        }
        return this.f5101a.a(this, z2, z, iOException);
    }

    public void b() {
        try {
            this.f5104e.b();
        } catch (IOException e2) {
            if (this.f5102c != null) {
                this.f5103d.d();
                this.f5104e.c().a(e2);
                throw e2;
            }
            throw null;
        }
    }

    public c.e c() {
        l lVar = this.f5101a;
        if (!lVar.n) {
            lVar.n = true;
            lVar.f5150e.h();
            g c2 = this.f5104e.c();
            c2.f5126e.setSoTimeout(0);
            c2.b();
            return new f(c2, true, c2.i, c2.j, this);
        }
        throw new IllegalStateException();
    }

    public w a(e0 e0Var, boolean z) {
        this.f5105f = z;
        long a2 = e0Var.f5007d.a();
        if (this.f5102c != null) {
            return new a(this.f5104e.a(e0Var, a2), a2);
        }
        throw null;
    }

    public h0.a a(boolean z) {
        try {
            h0.a a2 = this.f5104e.a(z);
            if (a2 != null) {
                if (((b0.a) f.o0.c.f5081a) != null) {
                    a2.m = this;
                } else {
                    throw null;
                }
            }
            return a2;
        } catch (IOException e2) {
            if (this.f5102c != null) {
                this.f5103d.d();
                this.f5104e.c().a(e2);
                throw e2;
            }
            throw null;
        }
    }
}
