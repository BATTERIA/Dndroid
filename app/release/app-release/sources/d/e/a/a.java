package d.e.a;

import d.e.a.g;
import java.util.Arrays;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public int f3107a = 0;
    public final b b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3108c;

    /* renamed from: d  reason: collision with root package name */
    public int f3109d = 8;

    /* renamed from: e  reason: collision with root package name */
    public g f3110e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3111f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f3112g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f3113h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    public a(b bVar, c cVar) {
        this.b = bVar;
        this.f3108c = cVar;
    }

    public final float a(g gVar) {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3107a) {
            if (this.f3111f[i2] == gVar.b) {
                return this.f3113h[i2];
            }
            i2 = this.f3112g[i2];
            i3++;
        }
        return 0.0f;
    }

    public final float a(g gVar, boolean z) {
        if (this.f3110e == gVar) {
            this.f3110e = null;
        }
        int i2 = this.i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3107a) {
            if (this.f3111f[i2] == gVar.b) {
                if (i2 == this.i) {
                    this.i = this.f3112g[i2];
                } else {
                    int[] iArr = this.f3112g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    gVar.b(this.b);
                }
                gVar.j--;
                this.f3107a--;
                this.f3111f[i2] = -1;
                if (this.k) {
                    this.j = i2;
                }
                return this.f3113h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f3112g[i2];
        }
        return 0.0f;
    }

    public final g a(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f3107a) {
            if (i4 == i2) {
                return this.f3108c.f3119c[this.f3111f[i3]];
            }
            i3 = this.f3112g[i3];
            i4++;
        }
        return null;
    }

    public g a(boolean[] zArr, g gVar) {
        g.a aVar;
        int i2 = this.i;
        int i3 = 0;
        g gVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.f3107a) {
            if (this.f3113h[i2] < 0.0f) {
                g gVar3 = this.f3108c.f3119c[this.f3111f[i2]];
                if ((zArr == null || !zArr[gVar3.b]) && gVar3 != gVar && ((aVar = gVar3.f3133g) == g.a.SLACK || aVar == g.a.ERROR)) {
                    float f3 = this.f3113h[i2];
                    if (f3 < f2) {
                        gVar2 = gVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.f3112g[i2];
            i3++;
        }
        return gVar2;
    }

    public final void a() {
        int i2 = this.i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3107a) {
            g gVar = this.f3108c.f3119c[this.f3111f[i2]];
            if (gVar != null) {
                gVar.b(this.b);
            }
            i2 = this.f3112g[i2];
            i3++;
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f3107a = 0;
    }

    public final void a(g gVar, float f2) {
        if (f2 == 0.0f) {
            a(gVar, true);
            return;
        }
        int i2 = this.i;
        if (i2 == -1) {
            this.i = 0;
            this.f3113h[0] = f2;
            this.f3111f[0] = gVar.b;
            this.f3112g[0] = -1;
            gVar.j++;
            gVar.a(this.b);
            this.f3107a++;
            if (!this.k) {
                int i3 = this.j + 1;
                this.j = i3;
                int[] iArr = this.f3111f;
                if (i3 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f3107a) {
            int[] iArr2 = this.f3111f;
            int i6 = iArr2[i2];
            int i7 = gVar.b;
            if (i6 == i7) {
                this.f3113h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f3112g[i2];
            i4++;
        }
        int i8 = this.j;
        int i9 = i8 + 1;
        if (this.k) {
            int[] iArr3 = this.f3111f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f3111f;
        if (i8 >= iArr4.length && this.f3107a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f3111f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f3111f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f3109d * 2;
            this.f3109d = i11;
            this.k = false;
            this.j = i8 - 1;
            this.f3113h = Arrays.copyOf(this.f3113h, i11);
            this.f3111f = Arrays.copyOf(this.f3111f, this.f3109d);
            this.f3112g = Arrays.copyOf(this.f3112g, this.f3109d);
        }
        this.f3111f[i8] = gVar.b;
        this.f3113h[i8] = f2;
        int[] iArr7 = this.f3112g;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.i;
            this.i = i8;
        }
        gVar.j++;
        gVar.a(this.b);
        this.f3107a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f3107a >= this.f3111f.length) {
            this.k = true;
        }
        int i12 = this.j;
        int[] iArr8 = this.f3111f;
        if (i12 >= iArr8.length) {
            this.k = true;
            this.j = iArr8.length - 1;
        }
    }

    public final void a(g gVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.i;
            if (i2 == -1) {
                this.i = 0;
                this.f3113h[0] = f2;
                this.f3111f[0] = gVar.b;
                this.f3112g[0] = -1;
                gVar.j++;
                gVar.a(this.b);
                this.f3107a++;
                if (!this.k) {
                    int i3 = this.j + 1;
                    this.j = i3;
                    int[] iArr = this.f3111f;
                    if (i3 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f3107a) {
                int[] iArr2 = this.f3111f;
                int i6 = iArr2[i2];
                int i7 = gVar.b;
                if (i6 == i7) {
                    float[] fArr = this.f3113h;
                    fArr[i2] = fArr[i2] + f2;
                    if (fArr[i2] == 0.0f) {
                        if (i2 == this.i) {
                            this.i = this.f3112g[i2];
                        } else {
                            int[] iArr3 = this.f3112g;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            gVar.b(this.b);
                        }
                        if (this.k) {
                            this.j = i2;
                        }
                        gVar.j--;
                        this.f3107a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f3112g[i2];
                i4++;
            }
            int i8 = this.j;
            int i9 = i8 + 1;
            if (this.k) {
                int[] iArr4 = this.f3111f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f3111f;
            if (i8 >= iArr5.length && this.f3107a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f3111f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f3111f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f3109d * 2;
                this.f3109d = i11;
                this.k = false;
                this.j = i8 - 1;
                this.f3113h = Arrays.copyOf(this.f3113h, i11);
                this.f3111f = Arrays.copyOf(this.f3111f, this.f3109d);
                this.f3112g = Arrays.copyOf(this.f3112g, this.f3109d);
            }
            this.f3111f[i8] = gVar.b;
            this.f3113h[i8] = f2;
            int[] iArr8 = this.f3112g;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.i;
                this.i = i8;
            }
            gVar.j++;
            gVar.a(this.b);
            this.f3107a++;
            if (!this.k) {
                this.j++;
            }
            int i12 = this.j;
            int[] iArr9 = this.f3111f;
            if (i12 >= iArr9.length) {
                this.k = true;
                this.j = iArr9.length - 1;
            }
        }
    }

    public final float b(int i2) {
        int i3 = this.i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f3107a) {
            if (i4 == i2) {
                return this.f3113h[i3];
            }
            i3 = this.f3112g[i3];
            i4++;
        }
        return 0.0f;
    }

    public final boolean b(g gVar) {
        return gVar.j <= 1;
    }

    public String toString() {
        int i2 = this.i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3107a) {
            StringBuilder a2 = e.a.a.a.a.a(e.a.a.a.a.b(str, " -> "));
            a2.append(this.f3113h[i2]);
            a2.append(" : ");
            StringBuilder a3 = e.a.a.a.a.a(a2.toString());
            a3.append(this.f3108c.f3119c[this.f3111f[i2]]);
            str = a3.toString();
            i2 = this.f3112g[i2];
            i3++;
        }
        return str;
    }
}
