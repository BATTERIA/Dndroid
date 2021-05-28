package e.h.a.f0.z;

import e.h.a.h0.c;
import e.h.a.n;
import e.h.a.q;
import e.h.a.s;
import e.h.a.t;
import e.h.a.w;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f extends c {
    public static final Writer q = new a();
    public static final w r = new w("closed");
    public final List<q> n = new ArrayList();
    public String o;
    public q p = s.f4844a;

    public class a extends Writer {
        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public f() {
        super(q);
    }

    @Override // e.h.a.h0.c
    public c a(boolean z) {
        a(new w(Boolean.valueOf(z)));
        return this;
    }

    public final void a(q qVar) {
        if (this.o != null) {
            if (qVar != null) {
                if (!(qVar instanceof s) || this.k) {
                    ((t) q()).f4845a.put(this.o, qVar);
                }
                this.o = null;
                return;
            }
            throw null;
        } else if (this.n.isEmpty()) {
            this.p = qVar;
        } else {
            q q2 = q();
            if (q2 instanceof n) {
                n nVar = (n) q2;
                if (nVar != null) {
                    if (qVar == null) {
                        qVar = s.f4844a;
                    }
                    nVar.f4843c.add(qVar);
                    return;
                }
                throw null;
            }
            throw new IllegalStateException();
        }
    }

    @Override // e.h.a.h0.c
    public c b(String str) {
        if (this.n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        } else if (q() instanceof t) {
            this.o = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // e.h.a.h0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.n.isEmpty()) {
            this.n.add(r);
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // e.h.a.h0.c
    public c d(String str) {
        if (str == null) {
            a(s.f4844a);
            return this;
        }
        a(new w(str));
        return this;
    }

    @Override // e.h.a.h0.c
    public c f(long j) {
        a(new w(Long.valueOf(j)));
        return this;
    }

    @Override // e.h.a.h0.c, java.io.Flushable
    public void flush() {
    }

    @Override // e.h.a.h0.c
    public c k() {
        n nVar = new n();
        a(nVar);
        this.n.add(nVar);
        return this;
    }

    @Override // e.h.a.h0.c
    public c l() {
        t tVar = new t();
        a(tVar);
        this.n.add(tVar);
        return this;
    }

    @Override // e.h.a.h0.c
    public c m() {
        if (this.n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        } else if (q() instanceof n) {
            List<q> list = this.n;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // e.h.a.h0.c
    public c n() {
        if (this.n.isEmpty() || this.o != null) {
            throw new IllegalStateException();
        } else if (q() instanceof t) {
            List<q> list = this.n;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // e.h.a.h0.c
    public c p() {
        a(s.f4844a);
        return this;
    }

    @Override // e.h.a.h0.c
    public final q q() {
        List<q> list = this.n;
        return list.get(list.size() - 1);
    }

    @Override // e.h.a.h0.c
    public c a(Boolean bool) {
        if (bool == null) {
            a(s.f4844a);
            return this;
        }
        a(new w(bool));
        return this;
    }

    @Override // e.h.a.h0.c
    public c a(Number number) {
        if (number == null) {
            a(s.f4844a);
            return this;
        }
        if (!this.f4825h) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a(new w(number));
        return this;
    }
}
