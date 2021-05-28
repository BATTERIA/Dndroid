package g;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class m implements x {

    /* renamed from: c  reason: collision with root package name */
    public final g f5448c;

    /* renamed from: d  reason: collision with root package name */
    public final Inflater f5449d;

    /* renamed from: e  reason: collision with root package name */
    public int f5450e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5451f;

    public m(g gVar, Inflater inflater) {
        if (gVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f5448c = gVar;
            this.f5449d = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    public final void a() {
        int i = this.f5450e;
        if (i != 0) {
            int remaining = i - this.f5449d.getRemaining();
            this.f5450e -= remaining;
            this.f5448c.skip((long) remaining);
        }
    }

    @Override // g.x
    public long c(e eVar, long j) {
        t a2;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f5451f) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean z = false;
                if (this.f5449d.needsInput()) {
                    a();
                    if (this.f5449d.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.f5448c.i()) {
                        z = true;
                    } else {
                        t tVar = this.f5448c.b().f5427c;
                        int i = tVar.f5466c;
                        int i2 = tVar.b;
                        int i3 = i - i2;
                        this.f5450e = i3;
                        this.f5449d.setInput(tVar.f5465a, i2, i3);
                    }
                }
                try {
                    a2 = eVar.a(1);
                    int inflate = this.f5449d.inflate(a2.f5465a, a2.f5466c, (int) Math.min(j, (long) (8192 - a2.f5466c)));
                    if (inflate > 0) {
                        a2.f5466c += inflate;
                        long j2 = (long) inflate;
                        eVar.f5428d += j2;
                        return j2;
                    } else if (this.f5449d.finished()) {
                        break;
                    } else if (this.f5449d.needsDictionary()) {
                        break;
                    } else if (z) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            a();
            if (a2.b != a2.f5466c) {
                return -1;
            }
            eVar.f5427c = a2.a();
            u.a(a2);
            return -1;
        }
    }

    @Override // g.x
    public y c() {
        return this.f5448c.c();
    }

    @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f5451f) {
            this.f5449d.end();
            this.f5451f = true;
            this.f5448c.close();
        }
    }
}
