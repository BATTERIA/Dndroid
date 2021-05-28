package f.o0.j;

import f.o0.j.o;
import g.e;
import g.g;
import g.h;
import g.o;
import g.x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c[] f5206a = {new c(c.i, ""), new c(c.f5201f, "GET"), new c(c.f5201f, "POST"), new c(c.f5202g, "/"), new c(c.f5202g, "/index.html"), new c(c.f5203h, "http"), new c(c.f5203h, "https"), new c(c.f5200e, "200"), new c(c.f5200e, "204"), new c(c.f5200e, "206"), new c(c.f5200e, "304"), new c(c.f5200e, "400"), new c(c.f5200e, "404"), new c(c.f5200e, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
    public static final Map<h, Integer> b;

    static {
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(f5206a.length);
        while (true) {
            c[] cVarArr = f5206a;
            if (i < cVarArr.length) {
                if (!linkedHashMap.containsKey(cVarArr[i].f5204a)) {
                    linkedHashMap.put(f5206a[i].f5204a, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static h a(h hVar) {
        int h2 = hVar.h();
        for (int i = 0; i < h2; i++) {
            byte a2 = hVar.a(i);
            if (a2 >= 65 && a2 <= 90) {
                StringBuilder a3 = e.a.a.a.a.a("PROTOCOL_ERROR response malformed: mixed case name: ");
                a3.append(hVar.k());
                throw new IOException(a3.toString());
            }
        }
        return hVar;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f5207a = new ArrayList();
        public final g b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5208c;

        /* renamed from: d  reason: collision with root package name */
        public int f5209d;

        /* renamed from: e  reason: collision with root package name */
        public c[] f5210e = new c[8];

        /* renamed from: f  reason: collision with root package name */
        public int f5211f = 7;

        /* renamed from: g  reason: collision with root package name */
        public int f5212g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f5213h = 0;

        public a(int i, x xVar) {
            this.f5208c = i;
            this.f5209d = i;
            this.b = o.a(xVar);
        }

        public final int a(int i) {
            return this.f5211f + 1 + i;
        }

        public final void a() {
            Arrays.fill(this.f5210e, (Object) null);
            this.f5211f = this.f5210e.length - 1;
            this.f5212g = 0;
            this.f5213h = 0;
        }

        public final void a(int i, c cVar) {
            this.f5207a.add(cVar);
            int i2 = cVar.f5205c;
            if (i != -1) {
                i2 -= this.f5210e[(this.f5211f + 1) + i].f5205c;
            }
            int i3 = this.f5209d;
            if (i2 > i3) {
                a();
                return;
            }
            int b2 = b((this.f5213h + i2) - i3);
            if (i == -1) {
                int i4 = this.f5212g + 1;
                c[] cVarArr = this.f5210e;
                if (i4 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f5211f = this.f5210e.length - 1;
                    this.f5210e = cVarArr2;
                }
                int i5 = this.f5211f;
                this.f5211f = i5 - 1;
                this.f5210e[i5] = cVar;
                this.f5212g++;
            } else {
                this.f5210e[this.f5211f + 1 + i + b2 + i] = cVar;
            }
            this.f5213h += i2;
        }

        public final int b(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f5210e.length;
                while (true) {
                    length--;
                    if (length < this.f5211f || i <= 0) {
                        c[] cVarArr = this.f5210e;
                        int i3 = this.f5211f;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f5212g);
                        this.f5211f += i2;
                    } else {
                        c[] cVarArr2 = this.f5210e;
                        i -= cVarArr2[length].f5205c;
                        this.f5213h -= cVarArr2[length].f5205c;
                        this.f5212g--;
                        i2++;
                    }
                }
                c[] cVarArr3 = this.f5210e;
                int i32 = this.f5211f;
                System.arraycopy(cVarArr3, i32 + 1, cVarArr3, i32 + 1 + i2, this.f5212g);
                this.f5211f += i2;
            }
            return i2;
        }

        public h b() {
            int readByte = this.b.readByte() & 255;
            boolean z = (readByte & 128) == 128;
            int a2 = a(readByte, 127);
            if (!z) {
                return this.b.b((long) a2);
            }
            o oVar = o.f5315d;
            byte[] e2 = this.b.e((long) a2);
            if (oVar != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                o.a aVar = oVar.f5316a;
                int i = 0;
                int i2 = 0;
                for (byte b2 : e2) {
                    i = (i << 8) | (b2 & 255);
                    i2 += 8;
                    while (i2 >= 8) {
                        int i3 = i2 - 8;
                        aVar = aVar.f5317a[(i >>> i3) & 255];
                        if (aVar.f5317a == null) {
                            byteArrayOutputStream.write(aVar.b);
                            i2 -= aVar.f5318c;
                            aVar = oVar.f5316a;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                while (i2 > 0) {
                    o.a aVar2 = aVar.f5317a[(i << (8 - i2)) & 255];
                    if (aVar2.f5317a != null || aVar2.f5318c > i2) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.b);
                    i2 -= aVar2.f5318c;
                    aVar = oVar.f5316a;
                }
                return h.a(byteArrayOutputStream.toByteArray());
            }
            throw null;
        }

        public final h c(int i) {
            c cVar;
            if (i >= 0 && i <= d.f5206a.length + -1) {
                cVar = d.f5206a[i];
            } else {
                int a2 = a(i - d.f5206a.length);
                if (a2 >= 0) {
                    c[] cVarArr = this.f5210e;
                    if (a2 < cVarArr.length) {
                        cVar = cVarArr[a2];
                    }
                }
                StringBuilder a3 = e.a.a.a.a.a("Header index too large ");
                a3.append(i + 1);
                throw new IOException(a3.toString());
            }
            return cVar.f5204a;
        }

        public int a(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = this.b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final e f5214a;
        public final boolean b = true;

        /* renamed from: c  reason: collision with root package name */
        public int f5215c = Integer.MAX_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5216d;

        /* renamed from: e  reason: collision with root package name */
        public int f5217e = 4096;

        /* renamed from: f  reason: collision with root package name */
        public c[] f5218f = new c[8];

        /* renamed from: g  reason: collision with root package name */
        public int f5219g = 7;

        /* renamed from: h  reason: collision with root package name */
        public int f5220h = 0;
        public int i = 0;

        public b(e eVar) {
            this.f5214a = eVar;
        }

        public final int a(int i2) {
            int i3 = 0;
            if (i2 > 0) {
                int length = this.f5218f.length;
                while (true) {
                    length--;
                    if (length < this.f5219g || i2 <= 0) {
                        c[] cVarArr = this.f5218f;
                        int i4 = this.f5219g;
                        System.arraycopy(cVarArr, i4 + 1, cVarArr, i4 + 1 + i3, this.f5220h);
                        c[] cVarArr2 = this.f5218f;
                        int i5 = this.f5219g;
                        Arrays.fill(cVarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                        this.f5219g += i3;
                    } else {
                        c[] cVarArr3 = this.f5218f;
                        i2 -= cVarArr3[length].f5205c;
                        this.i -= cVarArr3[length].f5205c;
                        this.f5220h--;
                        i3++;
                    }
                }
                c[] cVarArr4 = this.f5218f;
                int i42 = this.f5219g;
                System.arraycopy(cVarArr4, i42 + 1, cVarArr4, i42 + 1 + i3, this.f5220h);
                c[] cVarArr22 = this.f5218f;
                int i52 = this.f5219g;
                Arrays.fill(cVarArr22, i52 + 1, i52 + 1 + i3, (Object) null);
                this.f5219g += i3;
            }
            return i3;
        }

        public final void a() {
            Arrays.fill(this.f5218f, (Object) null);
            this.f5219g = this.f5218f.length - 1;
            this.f5220h = 0;
            this.i = 0;
        }

        public void a(int i2, int i3, int i4) {
            int i5;
            e eVar;
            if (i2 < i3) {
                eVar = this.f5214a;
                i5 = i2 | i4;
            } else {
                this.f5214a.writeByte(i4 | i3);
                i5 = i2 - i3;
                while (i5 >= 128) {
                    this.f5214a.writeByte(128 | (i5 & 127));
                    i5 >>>= 7;
                }
                eVar = this.f5214a;
            }
            eVar.writeByte(i5);
        }

        public final void a(c cVar) {
            int i2 = cVar.f5205c;
            int i3 = this.f5217e;
            if (i2 > i3) {
                a();
                return;
            }
            a((this.i + i2) - i3);
            int i4 = this.f5220h + 1;
            c[] cVarArr = this.f5218f;
            if (i4 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f5219g = this.f5218f.length - 1;
                this.f5218f = cVarArr2;
            }
            int i5 = this.f5219g;
            this.f5219g = i5 - 1;
            this.f5218f[i5] = cVar;
            this.f5220h++;
            this.i += i2;
        }

        public void a(h hVar) {
            int i2;
            int i3 = 0;
            if (this.b) {
                if (o.f5315d != null) {
                    long j = 0;
                    long j2 = 0;
                    for (int i4 = 0; i4 < hVar.h(); i4++) {
                        j2 += (long) o.f5314c[hVar.a(i4) & 255];
                    }
                    if (((int) ((j2 + 7) >> 3)) < hVar.h()) {
                        e eVar = new e();
                        if (o.f5315d != null) {
                            byte b2 = 0;
                            while (i3 < hVar.h()) {
                                int a2 = hVar.a(i3) & 255;
                                int i5 = o.b[a2];
                                byte b3 = o.f5314c[a2];
                                j = (j << b3) | ((long) i5);
                                int i6 = b2 + b3;
                                while (i6 >= 8) {
                                    i6 = (i6 == 1 ? 1 : 0) - 8;
                                    eVar.writeByte((int) (j >> i6));
                                }
                                i3++;
                                b2 = i6;
                            }
                            if (b2 > 0) {
                                eVar.writeByte((int) (((long) (255 >>> b2)) | (j << (8 - b2))));
                            }
                            hVar = eVar.m();
                            i2 = hVar.f5437c.length;
                            i3 = 128;
                            a(i2, 127, i3);
                            this.f5214a.a(hVar);
                        }
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            i2 = hVar.h();
            a(i2, 127, i3);
            this.f5214a.a(hVar);
        }

        public void a(List<c> list) {
            int i2;
            int i3;
            if (this.f5216d) {
                int i4 = this.f5215c;
                if (i4 < this.f5217e) {
                    a(i4, 31, 32);
                }
                this.f5216d = false;
                this.f5215c = Integer.MAX_VALUE;
                a(this.f5217e, 31, 32);
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                c cVar = list.get(i5);
                h i6 = cVar.f5204a.i();
                h hVar = cVar.b;
                Integer num = d.b.get(i6);
                if (num != null) {
                    i3 = num.intValue() + 1;
                    if (i3 > 1 && i3 < 8) {
                        if (Objects.equals(d.f5206a[i3 - 1].b, hVar)) {
                            i2 = i3;
                        } else if (Objects.equals(d.f5206a[i3].b, hVar)) {
                            i2 = i3;
                            i3++;
                        }
                    }
                    i2 = i3;
                    i3 = -1;
                } else {
                    i3 = -1;
                    i2 = -1;
                }
                if (i3 == -1) {
                    int i7 = this.f5219g + 1;
                    int length = this.f5218f.length;
                    while (true) {
                        if (i7 >= length) {
                            break;
                        }
                        if (Objects.equals(this.f5218f[i7].f5204a, i6)) {
                            if (Objects.equals(this.f5218f[i7].b, hVar)) {
                                i3 = d.f5206a.length + (i7 - this.f5219g);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i7 - this.f5219g) + d.f5206a.length;
                            }
                        }
                        i7++;
                    }
                }
                if (i3 != -1) {
                    a(i3, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.f5214a.writeByte(64);
                        a(i6);
                    } else {
                        h hVar2 = c.f5199d;
                        if (i6 == null) {
                            throw null;
                        } else if (!i6.a(0, hVar2, 0, hVar2.h()) || c.i.equals(i6)) {
                            a(i2, 63, 64);
                        } else {
                            a(i2, 15, 0);
                            a(hVar);
                        }
                    }
                    a(hVar);
                    a(cVar);
                }
            }
        }
    }
}
