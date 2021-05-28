package g;

import e.a.a.a.a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class h implements Serializable, Comparable<h> {

    /* renamed from: f  reason: collision with root package name */
    public static final char[] f5435f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: g  reason: collision with root package name */
    public static final h f5436g = a(new byte[0]);

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f5437c;

    /* renamed from: d  reason: collision with root package name */
    public transient int f5438d;

    /* renamed from: e  reason: collision with root package name */
    public transient String f5439e;

    public h(byte[] bArr) {
        this.f5437c = bArr;
    }

    public static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }

    public static h a(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static h b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (a(str.charAt(i2 + 1)) + (a(str.charAt(i2)) << 4));
            }
            return a(bArr);
        } else {
            throw new IllegalArgumentException(a.b("Unexpected hex string: ", str));
        }
    }

    public static h c(String str) {
        if (str != null) {
            h hVar = new h(str.getBytes(z.f5476a));
            hVar.f5439e = str;
            return hVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public byte a(int i) {
        return this.f5437c[i];
    }

    public h a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f5437c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f5437c, i, bArr2, 0, i3);
                    return new h(bArr2);
                }
            } else {
                StringBuilder a2 = a.a("endIndex > length(");
                a2.append(this.f5437c.length);
                a2.append(")");
                throw new IllegalArgumentException(a2.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public final h a(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f5437c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public String a() {
        byte[] bArr = this.f5437c;
        byte[] bArr2 = d.f5425a;
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int i3 = i + 1;
            bArr3[i] = bArr2[(bArr[i2] & 255) >> 2];
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr3[i3] = bArr2[((bArr[i2] & 3) << 4) | ((bArr[i5] & 255) >> 4)];
            int i6 = i4 + 1;
            int i7 = i2 + 2;
            bArr3[i4] = bArr2[((bArr[i5] & 15) << 2) | ((bArr[i7] & 255) >> 6)];
            i = i6 + 1;
            bArr3[i6] = bArr2[bArr[i7] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i8 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i9 = i8 + 1;
            bArr3[i8] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i9] = 61;
            bArr3[i9 + 1] = 61;
        } else if (length2 == 2) {
            int i10 = i + 1;
            bArr3[i] = bArr2[(bArr[length] & 255) >> 2];
            int i11 = i10 + 1;
            int i12 = length + 1;
            bArr3[i10] = bArr2[((bArr[i12] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i11] = bArr2[(bArr[i12] & 15) << 2];
            bArr3[i11 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public void a(e eVar) {
        byte[] bArr = this.f5437c;
        eVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i, h hVar, int i2, int i3) {
        return hVar.a(i2, this.f5437c, i, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f5437c;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && z.a(bArr2, i, bArr, i2, i3);
        }
    }

    public String b() {
        byte[] bArr = this.f5437c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5435f;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN, SYNTHETIC] */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(g.h r10) {
        /*
            r9 = this;
            g.h r10 = (g.h) r10
            int r0 = r9.h()
            int r1 = r10.h()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.a(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.a(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = -1
            goto L_0x0031
        L_0x0029:
            r3 = 1
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int h2 = hVar.h();
            byte[] bArr = this.f5437c;
            return h2 == bArr.length && hVar.a(0, bArr, 0, bArr.length);
        }
    }

    public h f() {
        return a("SHA-1");
    }

    public int h() {
        return this.f5437c.length;
    }

    public int hashCode() {
        int i = this.f5438d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f5437c);
        this.f5438d = hashCode;
        return hashCode;
    }

    public h i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f5437c;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b < 65 || b > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new h(bArr2);
            }
        }
    }

    public byte[] j() {
        return (byte[]) this.f5437c.clone();
    }

    public String k() {
        String str = this.f5439e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f5437c, z.f5476a);
        this.f5439e = str2;
        return str2;
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f5437c.length == 0) {
            return "[size=0]";
        }
        String k = k();
        int length = k.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = k.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = k.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i == -1) {
            if (this.f5437c.length <= 64) {
                sb2 = a.a("[hex=");
                sb2.append(b());
                sb2.append("]");
            } else {
                sb2 = a.a("[size=");
                sb2.append(this.f5437c.length);
                sb2.append(" hex=");
                sb2.append(a(0, 64).b());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = k.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (i < k.length()) {
            sb = a.a("[size=");
            sb.append(this.f5437c.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }
}
