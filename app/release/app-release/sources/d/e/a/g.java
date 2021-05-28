package d.e.a;

import java.util.Arrays;

public class g {
    public static int k = 1;

    /* renamed from: a  reason: collision with root package name */
    public String f3128a;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3129c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3130d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f3131e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f3132f = new float[7];

    /* renamed from: g  reason: collision with root package name */
    public a f3133g;

    /* renamed from: h  reason: collision with root package name */
    public b[] f3134h = new b[8];
    public int i = 0;
    public int j = 0;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.f3133g = aVar;
    }

    public void a() {
        this.f3128a = null;
        this.f3133g = a.UNKNOWN;
        this.f3130d = 0;
        this.b = -1;
        this.f3129c = -1;
        this.f3131e = 0.0f;
        this.i = 0;
        this.j = 0;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.i;
            if (i2 >= i3) {
                b[] bVarArr = this.f3134h;
                if (i3 >= bVarArr.length) {
                    this.f3134h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3134h;
                int i4 = this.i;
                bVarArr2[i4] = bVar;
                this.i = i4 + 1;
                return;
            } else if (this.f3134h[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f3134h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.f3134h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.i--;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.f3134h;
            a aVar = bVarArr[i3].f3116d;
            b bVar2 = bVarArr[i3];
            while (true) {
                int i4 = aVar.i;
                int i5 = 0;
                while (i4 != -1 && i5 < aVar.f3107a) {
                    int i6 = aVar.f3111f[i4];
                    g gVar = bVar.f3114a;
                    if (i6 == gVar.b) {
                        float f2 = aVar.f3113h[i4];
                        aVar.a(gVar, false);
                        a aVar2 = bVar.f3116d;
                        int i7 = aVar2.i;
                        int i8 = 0;
                        while (i7 != -1 && i8 < aVar2.f3107a) {
                            aVar.a(aVar.f3108c.f3119c[aVar2.f3111f[i7]], aVar2.f3113h[i7] * f2, false);
                            i7 = aVar2.f3112g[i7];
                            i8++;
                        }
                        bVar2.b = (bVar.b * f2) + bVar2.b;
                    } else {
                        i4 = aVar.f3112g[i4];
                        i5++;
                    }
                }
            }
        }
        this.i = 0;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("");
        a2.append(this.f3128a);
        return a2.toString();
    }
}
