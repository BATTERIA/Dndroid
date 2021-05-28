package g;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f5465a;
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f5466c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5467d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5468e;

    /* renamed from: f  reason: collision with root package name */
    public t f5469f;

    /* renamed from: g  reason: collision with root package name */
    public t f5470g;

    public t() {
        this.f5465a = new byte[8192];
        this.f5468e = true;
        this.f5467d = false;
    }

    public t(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f5465a = bArr;
        this.b = i;
        this.f5466c = i2;
        this.f5467d = z;
        this.f5468e = z2;
    }

    public final t a() {
        t tVar = this.f5469f;
        if (tVar == this) {
            tVar = null;
        }
        t tVar2 = this.f5470g;
        tVar2.f5469f = this.f5469f;
        this.f5469f.f5470g = tVar2;
        this.f5469f = null;
        this.f5470g = null;
        return tVar;
    }

    public final t a(t tVar) {
        tVar.f5470g = this;
        tVar.f5469f = this.f5469f;
        this.f5469f.f5470g = tVar;
        this.f5469f = tVar;
        return tVar;
    }

    public final void a(t tVar, int i) {
        if (tVar.f5468e) {
            int i2 = tVar.f5466c;
            if (i2 + i > 8192) {
                if (!tVar.f5467d) {
                    int i3 = tVar.b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = tVar.f5465a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        tVar.f5466c -= tVar.b;
                        tVar.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f5465a, this.b, tVar.f5465a, tVar.f5466c, i);
            tVar.f5466c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final t b() {
        this.f5467d = true;
        return new t(this.f5465a, this.b, this.f5466c, true, false);
    }
}
