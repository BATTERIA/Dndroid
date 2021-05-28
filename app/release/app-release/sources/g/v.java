package g;

import java.util.Arrays;

public final class v extends h {

    /* renamed from: h  reason: collision with root package name */
    public final transient byte[][] f5472h;
    public final transient int[] i;

    public v(e eVar, int i2) {
        super(null);
        z.a(eVar.f5428d, 0, (long) i2);
        t tVar = eVar.f5427c;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            int i6 = tVar.f5466c;
            int i7 = tVar.b;
            if (i6 != i7) {
                i4 += i6 - i7;
                i5++;
                tVar = tVar.f5469f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f5472h = new byte[i5][];
        this.i = new int[(i5 * 2)];
        t tVar2 = eVar.f5427c;
        int i8 = 0;
        while (i3 < i2) {
            this.f5472h[i8] = tVar2.f5465a;
            int i9 = (tVar2.f5466c - tVar2.b) + i3;
            i3 = i9 > i2 ? i2 : i9;
            int[] iArr = this.i;
            iArr[i8] = i3;
            iArr[this.f5472h.length + i8] = tVar2.b;
            tVar2.f5467d = true;
            i8++;
            tVar2 = tVar2.f5469f;
        }
    }

    @Override // g.h
    public byte a(int i2) {
        z.a((long) this.i[this.f5472h.length - 1], (long) i2, 1);
        int b = b(i2);
        int i3 = b == 0 ? 0 : this.i[b - 1];
        int[] iArr = this.i;
        byte[][] bArr = this.f5472h;
        return bArr[b][(i2 - i3) + iArr[bArr.length + b]];
    }

    @Override // g.h
    public h a(int i2, int i3) {
        return l().a(i2, i3);
    }

    @Override // g.h
    public String a() {
        return l().a();
    }

    @Override // g.h
    public void a(e eVar) {
        int length = this.f5472h.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr = this.i;
            int i4 = iArr[length + i2];
            int i5 = iArr[i2];
            t tVar = new t(this.f5472h[i2], i4, (i4 + i5) - i3, true, false);
            t tVar2 = eVar.f5427c;
            if (tVar2 == null) {
                tVar.f5470g = tVar;
                tVar.f5469f = tVar;
                eVar.f5427c = tVar;
            } else {
                tVar2.f5470g.a(tVar);
            }
            i2++;
            i3 = i5;
        }
        eVar.f5428d += (long) i3;
    }

    @Override // g.h
    public boolean a(int i2, h hVar, int i3, int i4) {
        if (i2 < 0 || i2 > h() - i4) {
            return false;
        }
        int b = b(i2);
        while (i4 > 0) {
            int i5 = b == 0 ? 0 : this.i[b - 1];
            int min = Math.min(i4, ((this.i[b] - i5) + i5) - i2);
            int[] iArr = this.i;
            byte[][] bArr = this.f5472h;
            if (!hVar.a(i3, bArr[b], (i2 - i5) + iArr[bArr.length + b], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            b++;
        }
        return true;
    }

    @Override // g.h
    public boolean a(int i2, byte[] bArr, int i3, int i4) {
        if (i2 < 0 || i2 > h() - i4 || i3 < 0 || i3 > bArr.length - i4) {
            return false;
        }
        int b = b(i2);
        while (i4 > 0) {
            int i5 = b == 0 ? 0 : this.i[b - 1];
            int min = Math.min(i4, ((this.i[b] - i5) + i5) - i2);
            int[] iArr = this.i;
            byte[][] bArr2 = this.f5472h;
            if (!z.a(bArr2[b], (i2 - i5) + iArr[bArr2.length + b], bArr, i3, min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i4 -= min;
            b++;
        }
        return true;
    }

    public final int b(int i2) {
        int binarySearch = Arrays.binarySearch(this.i, 0, this.f5472h.length, i2 + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    @Override // g.h
    public String b() {
        return l().b();
    }

    @Override // g.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return hVar.h() == h() && a(0, hVar, 0, h());
        }
    }

    @Override // g.h
    public h f() {
        return l().f();
    }

    @Override // g.h
    public int h() {
        return this.i[this.f5472h.length - 1];
    }

    @Override // g.h
    public int hashCode() {
        int i2 = this.f5438d;
        if (i2 != 0) {
            return i2;
        }
        int length = this.f5472h.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < length) {
            byte[] bArr = this.f5472h[i3];
            int[] iArr = this.i;
            int i6 = iArr[length + i3];
            int i7 = iArr[i3];
            int i8 = (i7 - i4) + i6;
            while (i6 < i8) {
                i5 = (i5 * 31) + bArr[i6];
                i6++;
            }
            i3++;
            i4 = i7;
        }
        this.f5438d = i5;
        return i5;
    }

    @Override // g.h
    public h i() {
        return l().i();
    }

    @Override // g.h
    public byte[] j() {
        int[] iArr = this.i;
        byte[][] bArr = this.f5472h;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int[] iArr2 = this.i;
            int i4 = iArr2[length + i2];
            int i5 = iArr2[i2];
            System.arraycopy(this.f5472h[i2], i4, bArr2, i3, i5 - i3);
            i2++;
            i3 = i5;
        }
        return bArr2;
    }

    @Override // g.h
    public String k() {
        return l().k();
    }

    public final h l() {
        return new h(j());
    }

    @Override // g.h
    public String toString() {
        return l().toString();
    }
}
