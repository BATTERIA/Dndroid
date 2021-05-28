package f.o0.n;

import g.e;
import g.g;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5362a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5363c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5364d;

    /* renamed from: e  reason: collision with root package name */
    public int f5365e;

    /* renamed from: f  reason: collision with root package name */
    public long f5366f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5367g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5368h;
    public final e i = new e();
    public final e j = new e();
    public final byte[] k;
    public final e.a l;

    public interface a {
    }

    public d(boolean z, g gVar, a aVar) {
        if (gVar == null) {
            throw new NullPointerException("source == null");
        } else if (aVar != null) {
            this.f5362a = z;
            this.b = gVar;
            this.f5363c = aVar;
            e.a aVar2 = null;
            this.k = z ? null : new byte[4];
            this.l = !z ? new e.a() : aVar2;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    public final void a() {
        String str;
        long j2 = this.f5366f;
        if (j2 > 0) {
            this.b.b(this.i, j2);
            if (!this.f5362a) {
                this.i.a(this.l);
                this.l.f(0);
                a.a.a.a.v0.m.l1.a.a(this.l, this.k);
                this.l.close();
            }
        }
        switch (this.f5365e) {
            case 8:
                short s = 1005;
                e eVar = this.i;
                long j3 = eVar.f5428d;
                if (j3 != 1) {
                    if (j3 != 0) {
                        s = eVar.readShort();
                        str = this.i.n();
                        String d2 = a.a.a.a.v0.m.l1.a.d(s);
                        if (d2 != null) {
                            throw new ProtocolException(d2);
                        }
                    } else {
                        str = "";
                    }
                    ((c) this.f5363c).a(s, str);
                    this.f5364d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                ((c) this.f5363c).a(this.i.m());
                return;
            case 10:
                ((c) this.f5363c).b(this.i.m());
                return;
            default:
                StringBuilder a2 = e.a.a.a.a.a("Unknown control opcode: ");
                a2.append(Integer.toHexString(this.f5365e));
                throw new ProtocolException(a2.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        if (!this.f5364d) {
            long f2 = this.b.c().f();
            this.b.c().b();
            try {
                int readByte = this.b.readByte() & 255;
                this.b.c().a(f2, TimeUnit.NANOSECONDS);
                this.f5365e = readByte & 15;
                boolean z = true;
                this.f5367g = (readByte & 128) != 0;
                boolean z2 = (readByte & 8) != 0;
                this.f5368h = z2;
                if (!z2 || this.f5367g) {
                    boolean z3 = (readByte & 64) != 0;
                    boolean z4 = (readByte & 32) != 0;
                    boolean z5 = (readByte & 16) != 0;
                    if (z3 || z4 || z5) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    int readByte2 = this.b.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z = false;
                    }
                    if (z == this.f5362a) {
                        throw new ProtocolException(this.f5362a ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j2 = (long) (readByte2 & 127);
                    this.f5366f = j2;
                    if (j2 == 126) {
                        this.f5366f = ((long) this.b.readShort()) & 65535;
                    } else if (j2 == 127) {
                        long readLong = this.b.readLong();
                        this.f5366f = readLong;
                        if (readLong < 0) {
                            StringBuilder a2 = e.a.a.a.a.a("Frame length 0x");
                            a2.append(Long.toHexString(this.f5366f));
                            a2.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(a2.toString());
                        }
                    }
                    if (this.f5368h && this.f5366f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.b.readFully(this.k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.b.c().a(f2, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException("closed");
        }
    }
}
