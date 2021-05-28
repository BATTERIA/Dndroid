package f.o0.j;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public int f5320a;
    public final int[] b = new int[10];

    public int a() {
        if ((this.f5320a & 128) != 0) {
            return this.b[7];
        }
        return 65535;
    }

    public q a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.f5320a = (1 << i) | this.f5320a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
