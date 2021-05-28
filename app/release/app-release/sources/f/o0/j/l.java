package f.o0.j;

import f.o0.j.d;
import f.o0.j.f;
import g.e;
import g.g;
import g.h;
import g.x;
import g.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class l implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f5280g = Logger.getLogger(e.class.getName());

    /* renamed from: c  reason: collision with root package name */
    public final g f5281c;

    /* renamed from: d  reason: collision with root package name */
    public final a f5282d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5283e;

    /* renamed from: f  reason: collision with root package name */
    public final d.a f5284f;

    public static final class a implements x {

        /* renamed from: c  reason: collision with root package name */
        public final g f5285c;

        /* renamed from: d  reason: collision with root package name */
        public int f5286d;

        /* renamed from: e  reason: collision with root package name */
        public byte f5287e;

        /* renamed from: f  reason: collision with root package name */
        public int f5288f;

        /* renamed from: g  reason: collision with root package name */
        public int f5289g;

        /* renamed from: h  reason: collision with root package name */
        public short f5290h;

        public a(g gVar) {
            this.f5285c = gVar;
        }

        @Override // g.x
        public long c(e eVar, long j) {
            int i;
            int readInt;
            do {
                int i2 = this.f5289g;
                if (i2 == 0) {
                    this.f5285c.skip((long) this.f5290h);
                    this.f5290h = 0;
                    if ((this.f5287e & 4) != 0) {
                        return -1;
                    }
                    i = this.f5288f;
                    int a2 = l.a(this.f5285c);
                    this.f5289g = a2;
                    this.f5286d = a2;
                    byte readByte = (byte) (this.f5285c.readByte() & 255);
                    this.f5287e = (byte) (this.f5285c.readByte() & 255);
                    if (l.f5280g.isLoggable(Level.FINE)) {
                        l.f5280g.fine(e.a(true, this.f5288f, this.f5286d, readByte, this.f5287e));
                    }
                    readInt = this.f5285c.readInt() & Integer.MAX_VALUE;
                    this.f5288f = readInt;
                    if (readByte != 9) {
                        e.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                } else {
                    long c2 = this.f5285c.c(eVar, Math.min(j, (long) i2));
                    if (c2 == -1) {
                        return -1;
                    }
                    this.f5289g = (int) (((long) this.f5289g) - c2);
                    return c2;
                }
            } while (readInt == i);
            e.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        @Override // g.x
        public y c() {
            return this.f5285c.c();
        }

        @Override // g.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public interface b {
    }

    public l(g gVar, boolean z) {
        this.f5281c = gVar;
        this.f5283e = z;
        a aVar = new a(gVar);
        this.f5282d = aVar;
        this.f5284f = new d.a(4096, aVar);
    }

    public static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        e.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public static int a(g gVar) {
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public void a(b bVar) {
        if (!this.f5283e) {
            h b2 = this.f5281c.b((long) e.f5221a.h());
            if (f5280g.isLoggable(Level.FINE)) {
                f5280g.fine(f.o0.e.a("<< CONNECTION %s", b2.b()));
            }
            if (!e.f5221a.equals(b2)) {
                e.b("Expected a connection header but was %s", b2.k());
                throw null;
            }
        } else if (!a(true, bVar)) {
            e.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v13, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v14, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r5v9, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v18, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean a(boolean z, b bVar) {
        short s = 0;
        boolean z2 = false;
        short s2 = 0;
        try {
            this.f5281c.d(9);
            int a2 = a(this.f5281c);
            if (a2 < 0 || a2 > 16384) {
                e.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a2));
                throw null;
            }
            byte readByte = (byte) (this.f5281c.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f5281c.readByte() & 255);
                int readInt = this.f5281c.readInt() & Integer.MAX_VALUE;
                if (f5280g.isLoggable(Level.FINE)) {
                    f5280g.fine(e.a(true, readInt, a2, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        if (readInt != 0) {
                            boolean z3 = (readByte2 & 1) != 0;
                            if (!((readByte2 & 32) != 0)) {
                                short readByte3 = (readByte2 & 8) != 0 ? (short) (this.f5281c.readByte() & 255) : 0;
                                int a3 = a(a2, readByte2, readByte3);
                                g gVar = this.f5281c;
                                f.i iVar = (f.i) bVar;
                                if (f.this.b(readInt)) {
                                    f fVar = f.this;
                                    if (fVar != null) {
                                        e eVar = new e();
                                        long j = (long) a3;
                                        gVar.d(j);
                                        gVar.c(eVar, j);
                                        if (eVar.f5428d == j) {
                                            fVar.a(new h(fVar, "OkHttp %s Push Data[%s]", new Object[]{fVar.f5227f, Integer.valueOf(readInt)}, readInt, eVar, a3, z3));
                                        } else {
                                            throw new IOException(eVar.f5428d + " != " + a3);
                                        }
                                    } else {
                                        throw null;
                                    }
                                } else {
                                    m a4 = f.this.a(readInt);
                                    if (a4 == null) {
                                        f.this.a(readInt, b.PROTOCOL_ERROR);
                                        long j2 = (long) a3;
                                        f.this.g(j2);
                                        gVar.skip(j2);
                                    } else {
                                        a4.f5296g.a(gVar, (long) a3);
                                        if (z3) {
                                            a4.a(f.o0.e.f5084c, true);
                                        }
                                    }
                                }
                                this.f5281c.skip((long) readByte3);
                                break;
                            } else {
                                e.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                                throw null;
                            }
                        } else {
                            e.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 1:
                        if (readInt != 0) {
                            boolean z4 = (readByte2 & 1) != 0;
                            if ((readByte2 & 8) != 0) {
                                s = (short) (this.f5281c.readByte() & 255);
                            }
                            if ((readByte2 & 32) != 0) {
                                a(bVar, readInt);
                                a2 -= 5;
                            }
                            ((f.i) bVar).a(z4, readInt, -1, a(a(a2, readByte2, s), s, readByte2, readInt));
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 2:
                        if (a2 != 5) {
                            e.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(a2));
                            throw null;
                        } else if (readInt != 0) {
                            a(bVar, readInt);
                            break;
                        } else {
                            e.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 3:
                        if (a2 != 4) {
                            e.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(a2));
                            throw null;
                        } else if (readInt != 0) {
                            int readInt2 = this.f5281c.readInt();
                            b a5 = b.a(readInt2);
                            if (a5 != null) {
                                f.i iVar2 = (f.i) bVar;
                                boolean b2 = f.this.b(readInt);
                                f fVar2 = f.this;
                                if (b2) {
                                    fVar2.a(new i(fVar2, "OkHttp %s Push Reset[%s]", new Object[]{fVar2.f5227f, Integer.valueOf(readInt)}, readInt, a5));
                                    break;
                                } else {
                                    m c2 = fVar2.c(readInt);
                                    if (c2 != null) {
                                        c2.b(a5);
                                        break;
                                    }
                                }
                            } else {
                                e.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                                throw null;
                            }
                        } else {
                            e.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                            throw null;
                        }
                        break;
                    case 4:
                        if (readInt != 0) {
                            e.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                            throw null;
                        } else if ((readByte2 & 1) != 0) {
                            if (a2 != 0) {
                                e.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                throw null;
                            } else if (((f.i) bVar) == null) {
                                throw null;
                            }
                        } else if (a2 % 6 == 0) {
                            q qVar = new q();
                            for (int i = 0; i < a2; i += 6) {
                                int readShort = this.f5281c.readShort() & 65535;
                                int readInt3 = this.f5281c.readInt();
                                if (readShort != 2) {
                                    if (readShort == 3) {
                                        readShort = 4;
                                    } else if (readShort == 4) {
                                        readShort = 7;
                                        if (readInt3 < 0) {
                                            e.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                            throw null;
                                        }
                                    } else if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                        e.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                        throw null;
                                    }
                                } else if (!(readInt3 == 0 || readInt3 == 1)) {
                                    e.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                    throw null;
                                }
                                qVar.a(readShort, readInt3);
                            }
                            f.i iVar3 = (f.i) bVar;
                            if (iVar3 != null) {
                                try {
                                    f.this.j.execute(new j(iVar3, "OkHttp %s ACK Settings", new Object[]{f.this.f5227f}, false, qVar));
                                    break;
                                } catch (RejectedExecutionException unused) {
                                    break;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            e.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(a2));
                            throw null;
                        }
                        break;
                    case 5:
                        if (readInt != 0) {
                            if ((readByte2 & 8) != 0) {
                                s2 = (short) (this.f5281c.readByte() & 255);
                            }
                            f.this.a(this.f5281c.readInt() & Integer.MAX_VALUE, a(a(a2 - 4, readByte2, s2), s2, readByte2, readInt));
                            break;
                        } else {
                            e.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                            throw null;
                        }
                    case 6:
                        if (a2 != 8) {
                            e.b("TYPE_PING length != 8: %s", Integer.valueOf(a2));
                            throw null;
                        } else if (readInt == 0) {
                            int readInt4 = this.f5281c.readInt();
                            int readInt5 = this.f5281c.readInt();
                            if ((readByte2 & 1) != 0) {
                                z2 = true;
                            }
                            ((f.i) bVar).a(z2, readInt4, readInt5);
                            break;
                        } else {
                            e.b("TYPE_PING streamId != 0", new Object[0]);
                            throw null;
                        }
                    case 7:
                        if (a2 < 8) {
                            e.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(a2));
                            throw null;
                        } else if (readInt == 0) {
                            int readInt6 = this.f5281c.readInt();
                            int readInt7 = this.f5281c.readInt();
                            int i2 = a2 - 8;
                            b a6 = b.a(readInt7);
                            if (a6 != null) {
                                h hVar = h.f5436g;
                                if (i2 > 0) {
                                    hVar = this.f5281c.b((long) i2);
                                }
                                ((f.i) bVar).a(readInt6, a6, hVar);
                                break;
                            } else {
                                e.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt7));
                                throw null;
                            }
                        } else {
                            e.b("TYPE_GOAWAY streamId != 0", new Object[0]);
                            throw null;
                        }
                    case 8:
                        if (a2 == 4) {
                            long readInt8 = ((long) this.f5281c.readInt()) & 2147483647L;
                            if (readInt8 != 0) {
                                ((f.i) bVar).a(readInt, readInt8);
                                break;
                            } else {
                                e.b("windowSizeIncrement was 0", Long.valueOf(readInt8));
                                throw null;
                            }
                        } else {
                            e.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(a2));
                            throw null;
                        }
                    default:
                        this.f5281c.skip((long) a2);
                        break;
                }
                return true;
            }
            e.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (EOFException unused2) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5281c.close();
    }

    public final List<c> a(int i, short s, byte b2, int i2) {
        a aVar = this.f5282d;
        aVar.f5289g = i;
        aVar.f5286d = i;
        aVar.f5290h = s;
        aVar.f5287e = b2;
        aVar.f5288f = i2;
        d.a aVar2 = this.f5284f;
        while (!aVar2.b.i()) {
            int readByte = aVar2.b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            } else if ((readByte & 128) == 128) {
                int a2 = aVar2.a(readByte, 127) - 1;
                if (a2 >= 0 && a2 <= d.f5206a.length + -1) {
                    aVar2.f5207a.add(d.f5206a[a2]);
                } else {
                    int a3 = aVar2.a(a2 - d.f5206a.length);
                    if (a3 >= 0) {
                        c[] cVarArr = aVar2.f5210e;
                        if (a3 < cVarArr.length) {
                            aVar2.f5207a.add(cVarArr[a3]);
                        }
                    }
                    StringBuilder a4 = e.a.a.a.a.a("Header index too large ");
                    a4.append(a2 + 1);
                    throw new IOException(a4.toString());
                }
            } else if (readByte == 64) {
                h b3 = aVar2.b();
                d.a(b3);
                aVar2.a(-1, new c(b3, aVar2.b()));
            } else if ((readByte & 64) == 64) {
                aVar2.a(-1, new c(aVar2.c(aVar2.a(readByte, 63) - 1), aVar2.b()));
            } else if ((readByte & 32) == 32) {
                int a5 = aVar2.a(readByte, 31);
                aVar2.f5209d = a5;
                if (a5 < 0 || a5 > aVar2.f5208c) {
                    StringBuilder a6 = e.a.a.a.a.a("Invalid dynamic table size update ");
                    a6.append(aVar2.f5209d);
                    throw new IOException(a6.toString());
                }
                int i3 = aVar2.f5213h;
                if (a5 < i3) {
                    if (a5 == 0) {
                        aVar2.a();
                    } else {
                        aVar2.b(i3 - a5);
                    }
                }
            } else if (readByte == 16 || readByte == 0) {
                h b4 = aVar2.b();
                d.a(b4);
                aVar2.f5207a.add(new c(b4, aVar2.b()));
            } else {
                aVar2.f5207a.add(new c(aVar2.c(aVar2.a(readByte, 15) - 1), aVar2.b()));
            }
        }
        d.a aVar3 = this.f5284f;
        if (aVar3 != null) {
            ArrayList arrayList = new ArrayList(aVar3.f5207a);
            aVar3.f5207a.clear();
            return arrayList;
        }
        throw null;
    }

    public final void a(b bVar, int i) {
        int readInt = this.f5281c.readInt() & Integer.MIN_VALUE;
        this.f5281c.readByte();
        if (((f.i) bVar) == null) {
            throw null;
        }
    }
}
