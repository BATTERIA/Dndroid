package d.e.a;

import d.e.a.g;
import d.e.a.h.c;
import java.util.Arrays;
import java.util.HashMap;

public class e {
    public static int p = 1000;

    /* renamed from: a  reason: collision with root package name */
    public int f3120a;
    public HashMap<String, g> b;

    /* renamed from: c  reason: collision with root package name */
    public a f3121c;

    /* renamed from: d  reason: collision with root package name */
    public int f3122d;

    /* renamed from: e  reason: collision with root package name */
    public int f3123e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f3124f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3125g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f3126h;
    public int i;
    public int j;
    public int k;
    public final c l;
    public g[] m;
    public int n;
    public final a o;

    public interface a {
        void a(g gVar);
    }

    public e() {
        this.f3120a = 0;
        this.b = null;
        this.f3122d = 32;
        this.f3123e = 32;
        this.f3124f = null;
        this.f3125g = false;
        this.f3126h = new boolean[32];
        this.i = 1;
        this.j = 0;
        this.k = 32;
        this.m = new g[p];
        this.n = 0;
        this.f3124f = new b[32];
        e();
        c cVar = new c();
        this.l = cVar;
        this.f3121c = new d(cVar);
        this.o = new b(this.l);
    }

    public g a(int i2, String str) {
        if (this.i + 1 >= this.f3123e) {
            d();
        }
        g a2 = a(g.a.ERROR, str);
        int i3 = this.f3120a + 1;
        this.f3120a = i3;
        this.i++;
        a2.b = i3;
        a2.f3130d = i2;
        this.l.f3119c[i3] = a2;
        this.f3121c.a(a2);
        return a2;
    }

    public final g a(g.a aVar, String str) {
        g a2 = this.l.b.a();
        if (a2 == null) {
            a2 = new g(aVar);
        } else {
            a2.a();
        }
        a2.f3133g = aVar;
        int i2 = this.n;
        int i3 = p;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            p = i4;
            this.m = (g[]) Arrays.copyOf(this.m, i4);
        }
        g[] gVarArr = this.m;
        int i5 = this.n;
        this.n = i5 + 1;
        gVarArr[i5] = a2;
        return a2;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.j; i2++) {
            b bVar = this.f3124f[i2];
            bVar.f3114a.f3131e = bVar.b;
        }
    }

    public void a(g gVar, g gVar2, g gVar3, g gVar4, float f2, int i2) {
        b b2 = b();
        b2.a(gVar, gVar2, gVar3, gVar4, f2);
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
    }

    public final void b(b bVar) {
        b[] bVarArr = this.f3124f;
        int i2 = this.j;
        if (bVarArr[i2] != null) {
            this.l.f3118a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f3124f;
        int i3 = this.j;
        bVarArr2[i3] = bVar;
        g gVar = bVar.f3114a;
        gVar.f3129c = i3;
        this.j = i3 + 1;
        gVar.c(bVar);
    }

    public void b(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        g c2 = c();
        c2.f3130d = 0;
        b2.a(gVar, gVar2, c2, i2);
        if (i3 != 6) {
            b2.f3116d.a(a(i3, (String) null), (float) ((int) (b2.f3116d.a(c2) * -1.0f)));
        }
        a(b2);
    }

    public g c() {
        if (this.i + 1 >= this.f3123e) {
            d();
        }
        g a2 = a(g.a.SLACK, (String) null);
        int i2 = this.f3120a + 1;
        this.f3120a = i2;
        this.i++;
        a2.b = i2;
        this.l.f3119c[i2] = a2;
        return a2;
    }

    public void c(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        g c2 = c();
        c2.f3130d = 0;
        b2.b(gVar, gVar2, c2, i2);
        if (i3 != 6) {
            b2.f3116d.a(a(i3, (String) null), (float) ((int) (b2.f3116d.a(c2) * -1.0f)));
        }
        a(b2);
    }

    public final void d() {
        int i2 = this.f3122d * 2;
        this.f3122d = i2;
        this.f3124f = (b[]) Arrays.copyOf(this.f3124f, i2);
        c cVar = this.l;
        cVar.f3119c = (g[]) Arrays.copyOf(cVar.f3119c, this.f3122d);
        int i3 = this.f3122d;
        this.f3126h = new boolean[i3];
        this.f3123e = i3;
        this.k = i3;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f3124f;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.l.f3118a.a(bVar);
                }
                this.f3124f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public void f() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.l;
            g[] gVarArr = cVar.f3119c;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.a();
            }
            i2++;
        }
        f<g> fVar = cVar.b;
        g[] gVarArr2 = this.m;
        int i3 = this.n;
        if (fVar != null) {
            if (i3 > gVarArr2.length) {
                i3 = gVarArr2.length;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                g gVar2 = gVarArr2[i4];
                int i5 = fVar.b;
                Object[] objArr = fVar.f3127a;
                if (i5 < objArr.length) {
                    objArr[i5] = gVar2;
                    fVar.b = i5 + 1;
                }
            }
            this.n = 0;
            Arrays.fill(this.l.f3119c, (Object) null);
            HashMap<String, g> hashMap = this.b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.f3120a = 0;
            b bVar = (b) this.f3121c;
            bVar.f3116d.a();
            bVar.f3114a = null;
            bVar.b = 0.0f;
            this.i = 1;
            for (int i6 = 0; i6 < this.j; i6++) {
                this.f3124f[i6].f3115c = false;
            }
            e();
            this.j = 0;
            return;
        }
        throw null;
    }

    public void a(g gVar, g gVar2, int i2, float f2, g gVar3, g gVar4, int i3, int i4) {
        float f3;
        b b2 = b();
        if (gVar2 == gVar3) {
            b2.f3116d.a(gVar, 1.0f);
            b2.f3116d.a(gVar4, 1.0f);
            b2.f3116d.a(gVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                b2.f3116d.a(gVar, 1.0f);
                b2.f3116d.a(gVar2, -1.0f);
                b2.f3116d.a(gVar3, -1.0f);
                b2.f3116d.a(gVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    f3 = (float) ((-i2) + i3);
                }
            } else if (f2 <= 0.0f) {
                b2.f3116d.a(gVar, -1.0f);
                b2.f3116d.a(gVar2, 1.0f);
                f3 = (float) i2;
            } else if (f2 >= 1.0f) {
                b2.f3116d.a(gVar3, -1.0f);
                b2.f3116d.a(gVar4, 1.0f);
                f3 = (float) i3;
            } else {
                float f4 = 1.0f - f2;
                b2.f3116d.a(gVar, f4 * 1.0f);
                b2.f3116d.a(gVar2, f4 * -1.0f);
                b2.f3116d.a(gVar3, -1.0f * f2);
                b2.f3116d.a(gVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    b2.b = (((float) i3) * f2) + (((float) (-i2)) * f4);
                }
            }
            b2.b = f3;
        }
        if (i4 != 6) {
            b2.a(this, i4);
        }
        a(b2);
    }

    public b b() {
        b a2 = this.l.f3118a.a();
        if (a2 == null) {
            a2 = new b(this.l);
        } else {
            a2.f3114a = null;
            a2.f3116d.a();
            a2.b = 0.0f;
            a2.f3117e = false;
        }
        g.k++;
        return a2;
    }

    public final void c(b bVar) {
        if (this.j > 0) {
            a aVar = bVar.f3116d;
            b[] bVarArr = this.f3124f;
            loop0:
            while (true) {
                int i2 = aVar.i;
                int i3 = 0;
                int i4 = 0;
                while (i2 != -1 && i4 < aVar.f3107a) {
                    g gVar = aVar.f3108c.f3119c[aVar.f3111f[i2]];
                    if (gVar.f3129c != -1) {
                        float f2 = aVar.f3113h[i2];
                        aVar.a(gVar, true);
                        b bVar2 = bVarArr[gVar.f3129c];
                        if (!bVar2.f3117e) {
                            a aVar2 = bVar2.f3116d;
                            int i5 = aVar2.i;
                            while (i5 != -1 && i3 < aVar2.f3107a) {
                                aVar.a(aVar.f3108c.f3119c[aVar2.f3111f[i5]], aVar2.f3113h[i5] * f2, true);
                                i5 = aVar2.f3112g[i5];
                                i3++;
                            }
                        }
                        bVar.b = (bVar2.b * f2) + bVar.b;
                        bVar2.f3114a.b(bVar);
                    } else {
                        i2 = aVar.f3112g[i2];
                        i4++;
                    }
                }
            }
            if (bVar.f3116d.f3107a == 0) {
                bVar.f3117e = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x00e2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(d.e.a.b r19) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.e.a(d.e.a.b):void");
    }

    public int b(Object obj) {
        g gVar = ((c) obj).i;
        if (gVar != null) {
            return (int) (gVar.f3131e + 0.5f);
        }
        return 0;
    }

    public final int b(a aVar) {
        boolean z;
        for (int i2 = 0; i2 < this.i; i2++) {
            this.f3126h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.i * 2) {
                return i3;
            }
            b bVar = (b) aVar;
            g gVar = bVar.f3114a;
            if (gVar != null) {
                this.f3126h[gVar.b] = true;
            }
            g a2 = bVar.f3116d.a(this.f3126h, (g) null);
            if (a2 != null) {
                boolean[] zArr = this.f3126h;
                int i4 = a2.b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.j; i6++) {
                    b bVar2 = this.f3124f[i6];
                    if (bVar2.f3114a.f3133g != g.a.UNRESTRICTED && !bVar2.f3117e) {
                        a aVar2 = bVar2.f3116d;
                        int i7 = aVar2.i;
                        if (i7 != -1) {
                            int i8 = 0;
                            while (true) {
                                if (i7 == -1 || i8 >= aVar2.f3107a) {
                                    break;
                                } else if (aVar2.f3111f[i7] == a2.b) {
                                    z = true;
                                    break;
                                } else {
                                    i7 = aVar2.f3112g[i7];
                                    i8++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            float a3 = bVar2.f3116d.a(a2);
                            if (a3 < 0.0f) {
                                float f3 = (-bVar2.b) / a3;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar3 = this.f3124f[i5];
                    bVar3.f3114a.f3129c = -1;
                    bVar3.b(a2);
                    g gVar2 = bVar3.f3114a;
                    gVar2.f3129c = i5;
                    gVar2.c(bVar3);
                }
            }
            z2 = true;
        }
        return i3;
    }

    public b a(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            b2.b = (float) i2;
        }
        if (!z) {
            b2.f3116d.a(gVar, -1.0f);
            b2.f3116d.a(gVar2, 1.0f);
        } else {
            b2.f3116d.a(gVar, 1.0f);
            b2.f3116d.a(gVar2, -1.0f);
        }
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
        return b2;
    }

    public void a(g gVar, int i2) {
        b bVar;
        a aVar;
        float f2;
        int i3 = gVar.f3129c;
        if (i3 != -1) {
            b bVar2 = this.f3124f[i3];
            if (!bVar2.f3117e) {
                if (bVar2.f3116d.f3107a == 0) {
                    bVar2.f3117e = true;
                } else {
                    bVar = b();
                    if (i2 < 0) {
                        bVar.b = (float) (i2 * -1);
                        aVar = bVar.f3116d;
                        f2 = 1.0f;
                    } else {
                        bVar.b = (float) i2;
                        aVar = bVar.f3116d;
                        f2 = -1.0f;
                    }
                    aVar.a(gVar, f2);
                }
            }
            bVar2.b = (float) i2;
            return;
        }
        bVar = b();
        bVar.f3114a = gVar;
        float f3 = (float) i2;
        gVar.f3131e = f3;
        bVar.b = f3;
        bVar.f3117e = true;
        a(bVar);
    }

    public g a(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.f3123e) {
            d();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            gVar = cVar.i;
            if (gVar == null) {
                cVar.d();
                gVar = cVar.i;
            }
            int i2 = gVar.b;
            if (i2 == -1 || i2 > this.f3120a || this.l.f3119c[i2] == null) {
                if (gVar.b != -1) {
                    gVar.a();
                }
                int i3 = this.f3120a + 1;
                this.f3120a = i3;
                this.i++;
                gVar.b = i3;
                gVar.f3133g = g.a.UNRESTRICTED;
                this.l.f3119c[i3] = gVar;
            }
        }
        return gVar;
    }

    public void a(a aVar) {
        float f2;
        boolean z;
        c((b) aVar);
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f3124f;
            if (bVarArr[i2].f3114a.f3133g != g.a.UNRESTRICTED && bVarArr[i2].b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3++;
                float f3 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.j) {
                    b bVar = this.f3124f[i4];
                    if (bVar.f3114a.f3133g != g.a.UNRESTRICTED && !bVar.f3117e && bVar.b < f2) {
                        int i8 = 1;
                        while (i8 < this.i) {
                            g gVar = this.l.f3119c[i8];
                            float a2 = bVar.f3116d.a(gVar);
                            if (a2 > f2) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f4 = gVar.f3132f[i9] / a2;
                                    if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f3 = f4;
                                        i5 = i4;
                                        i6 = i8;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i4++;
                    f2 = 0.0f;
                }
                if (i5 != -1) {
                    b bVar2 = this.f3124f[i5];
                    bVar2.f3114a.f3129c = -1;
                    bVar2.b(this.l.f3119c[i6]);
                    g gVar2 = bVar2.f3114a;
                    gVar2.f3129c = i5;
                    gVar2.c(bVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
            }
        }
        b(aVar);
        a();
    }
}
