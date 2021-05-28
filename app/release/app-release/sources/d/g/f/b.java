package d.g.f;

import android.graphics.Path;
import android.util.Log;
import c.a.a.a.a;
import d.b.j;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public char f3261a;
    public float[] b;

    public b(char c2, float[] fArr) {
        this.f3261a = c2;
        this.b = fArr;
    }

    public b(b bVar) {
        this.f3261a = bVar.f3261a;
        float[] fArr = bVar.b;
        this.b = a.a(fArr, 0, fArr.length);
    }

    public static void a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
        double d2;
        double d3;
        double radians = Math.toRadians((double) f8);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d4 = (double) f2;
        Double.isNaN(d4);
        double d5 = (double) f3;
        Double.isNaN(d5);
        double d6 = (d5 * sin) + (d4 * cos);
        double d7 = d4;
        double d8 = (double) f6;
        Double.isNaN(d8);
        double d9 = d6 / d8;
        double d10 = (double) (-f2);
        Double.isNaN(d10);
        Double.isNaN(d5);
        double d11 = (d5 * cos) + (d10 * sin);
        double d12 = (double) f7;
        Double.isNaN(d12);
        double d13 = d11 / d12;
        double d14 = d5;
        double d15 = (double) f4;
        Double.isNaN(d15);
        double d16 = (double) f5;
        Double.isNaN(d16);
        Double.isNaN(d8);
        double d17 = ((d16 * sin) + (d15 * cos)) / d8;
        double d18 = (double) (-f4);
        Double.isNaN(d18);
        Double.isNaN(d16);
        Double.isNaN(d12);
        double d19 = ((d16 * cos) + (d18 * sin)) / d12;
        double d20 = d9 - d17;
        double d21 = d13 - d19;
        double d22 = (d9 + d17) / 2.0d;
        double d23 = (d13 + d19) / 2.0d;
        double d24 = (d21 * d21) + (d20 * d20);
        if (d24 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d25 = (1.0d / d24) - 0.25d;
        if (d25 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d24);
            float sqrt = (float) (Math.sqrt(d24) / 1.99999d);
            a(path, f2, f3, f4, f5, f6 * sqrt, f7 * sqrt, f8, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d25);
        double d26 = d20 * sqrt2;
        double d27 = sqrt2 * d21;
        if (z == z2) {
            d3 = d22 - d27;
            d2 = d23 + d26;
        } else {
            d3 = d22 + d27;
            d2 = d23 - d26;
        }
        double atan2 = Math.atan2(d13 - d2, d9 - d3);
        double atan22 = Math.atan2(d19 - d2, d17 - d3) - atan2;
        int i = 0;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        Double.isNaN(d8);
        double d28 = d3 * d8;
        Double.isNaN(d12);
        double d29 = d2 * d12;
        double d30 = (d28 * cos) - (d29 * sin);
        double d31 = (d29 * cos) + (d28 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        Double.isNaN(d8);
        double d32 = -d8;
        double d33 = d32 * cos2;
        Double.isNaN(d12);
        double d34 = d12 * sin2;
        double d35 = (d33 * sin3) - (d34 * cos3);
        double d36 = d32 * sin2;
        Double.isNaN(d12);
        double d37 = d12 * cos2;
        double d38 = (cos3 * d37) + (sin3 * d36);
        double d39 = (double) ceil;
        Double.isNaN(d39);
        Double.isNaN(d39);
        double d40 = atan22 / d39;
        double d41 = atan2;
        while (i < ceil) {
            double d42 = d41 + d40;
            double sin4 = Math.sin(d42);
            double cos4 = Math.cos(d42);
            Double.isNaN(d8);
            double d43 = (((d8 * cos2) * cos4) + d30) - (d34 * sin4);
            Double.isNaN(d8);
            double d44 = (d37 * sin4) + (d8 * sin2 * cos4) + d31;
            double d45 = (d33 * sin4) - (d34 * cos4);
            double d46 = (cos4 * d37) + (sin4 * d36);
            double d47 = d42 - d41;
            double tan = Math.tan(d47 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d35 * sqrt3) + d7), (float) ((d38 * sqrt3) + d14), (float) (d43 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d43, (float) d44);
            i++;
            d37 = d37;
            d36 = d36;
            ceil = ceil;
            cos2 = cos2;
            d41 = d42;
            d8 = d8;
            d38 = d46;
            d35 = d45;
            d7 = d43;
            d14 = d44;
            d40 = d40;
            d30 = d30;
        }
    }

    public static void a(b[] bVarArr, Path path) {
        int i;
        int i2;
        int i3;
        float[] fArr;
        char c2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        b[] bVarArr2 = bVarArr;
        float[] fArr2 = new float[6];
        char c3 = 'm';
        char c4 = 0;
        char c5 = 'm';
        int i4 = 0;
        while (i4 < bVarArr2.length) {
            char c6 = bVarArr2[i4].f3261a;
            float[] fArr3 = bVarArr2[i4].b;
            float f21 = fArr2[c4];
            float f22 = fArr2[1];
            float f23 = fArr2[2];
            float f24 = fArr2[3];
            float f25 = fArr2[4];
            float f26 = fArr2[5];
            switch (c6) {
                case 'A':
                case j.AppCompatTheme_textAppearanceListItem:
                    i = 7;
                    break;
                case 'C':
                case j.AppCompatTheme_textAppearanceListItemSmall:
                    i = 6;
                    break;
                case 'H':
                case j.AppCompatTheme_ratingBarStyle:
                case j.AppCompatTheme_textColorAlertDialogListItem:
                case j.AppCompatTheme_windowMinWidthMajor:
                    i = 1;
                    break;
                case j.AppCompatTheme_panelMenuListTheme:
                case j.AppCompatTheme_popupMenuStyle:
                case j.AppCompatTheme_windowActionModeOverlay:
                case j.AppCompatTheme_windowFixedHeightMinor:
                    i = 4;
                    break;
                case j.AppCompatTheme_seekBarStyle:
                case 'z':
                    path.close();
                    path.moveTo(f25, f26);
                    f21 = f25;
                    f23 = f21;
                    f22 = f26;
                    f24 = f22;
                default:
                    i = 2;
                    break;
            }
            float f27 = f25;
            float f28 = f26;
            float f29 = f21;
            float f30 = f22;
            int i5 = 0;
            while (i5 < fArr3.length) {
                if (c6 != 'A') {
                    if (c6 != 'C') {
                        if (c6 == 'H') {
                            i2 = i5;
                            fArr = fArr3;
                            c2 = c6;
                            i3 = i4;
                            int i6 = i2 + 0;
                            path.lineTo(fArr[i6], f30);
                            f29 = fArr[i6];
                        } else if (c6 == 'Q') {
                            i2 = i5;
                            fArr = fArr3;
                            c2 = c6;
                            i3 = i4;
                            int i7 = i2 + 0;
                            int i8 = i2 + 1;
                            int i9 = i2 + 2;
                            int i10 = i2 + 3;
                            path.quadTo(fArr[i7], fArr[i8], fArr[i9], fArr[i10]);
                            f3 = fArr[i7];
                            f2 = fArr[i8];
                            f29 = fArr[i9];
                            f30 = fArr[i10];
                        } else if (c6 == 'V') {
                            i2 = i5;
                            fArr = fArr3;
                            c2 = c6;
                            i3 = i4;
                            int i11 = i2 + 0;
                            path.lineTo(f29, fArr[i11]);
                            f30 = fArr[i11];
                        } else if (c6 != 'a') {
                            if (c6 != 'c') {
                                if (c6 == 'h') {
                                    i2 = i5;
                                    int i12 = i2 + 0;
                                    path.rLineTo(fArr3[i12], 0.0f);
                                    f29 += fArr3[i12];
                                } else if (c6 != 'q') {
                                    if (c6 == 'v') {
                                        i2 = i5;
                                        f11 = f30;
                                        int i13 = i2 + 0;
                                        path.rLineTo(0.0f, fArr3[i13]);
                                        f12 = fArr3[i13];
                                    } else if (c6 != 'L') {
                                        if (c6 == 'M') {
                                            i2 = i5;
                                            int i14 = i2 + 0;
                                            float f31 = fArr3[i14];
                                            int i15 = i2 + 1;
                                            float f32 = fArr3[i15];
                                            if (i2 > 0) {
                                                path.lineTo(fArr3[i14], fArr3[i15]);
                                                f29 = f31;
                                                f30 = f32;
                                            } else {
                                                path.moveTo(fArr3[i14], fArr3[i15]);
                                                f29 = f31;
                                                f30 = f32;
                                            }
                                        } else if (c6 == 'S') {
                                            i2 = i5;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f13 = (f30 * 2.0f) - f24;
                                                f14 = (f29 * 2.0f) - f23;
                                            } else {
                                                f14 = f29;
                                                f13 = f30;
                                            }
                                            int i16 = i2 + 0;
                                            int i17 = i2 + 1;
                                            int i18 = i2 + 2;
                                            int i19 = i2 + 3;
                                            path.cubicTo(f14, f13, fArr3[i16], fArr3[i17], fArr3[i18], fArr3[i19]);
                                            float f33 = fArr3[i16];
                                            float f34 = fArr3[i17];
                                            f5 = fArr3[i18];
                                            f4 = fArr3[i19];
                                            f23 = f33;
                                            f24 = f34;
                                            f29 = f5;
                                            f30 = f4;
                                        } else if (c6 == 'T') {
                                            i2 = i5;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f15 = (f29 * 2.0f) - f23;
                                                f16 = (f30 * 2.0f) - f24;
                                            } else {
                                                f15 = f29;
                                                f16 = f30;
                                            }
                                            int i20 = i2 + 0;
                                            int i21 = i2 + 1;
                                            path.quadTo(f15, f16, fArr3[i20], fArr3[i21]);
                                            f24 = f16;
                                            f23 = f15;
                                            fArr = fArr3;
                                            c2 = c6;
                                            i3 = i4;
                                            f29 = fArr3[i20];
                                            f30 = fArr3[i21];
                                        } else if (c6 == 'l') {
                                            i2 = i5;
                                            f11 = f30;
                                            int i22 = i2 + 0;
                                            int i23 = i2 + 1;
                                            path.rLineTo(fArr3[i22], fArr3[i23]);
                                            f29 += fArr3[i22];
                                            f12 = fArr3[i23];
                                        } else if (c6 == c3) {
                                            i2 = i5;
                                            int i24 = i2 + 0;
                                            f29 += fArr3[i24];
                                            int i25 = i2 + 1;
                                            f30 += fArr3[i25];
                                            if (i2 > 0) {
                                                path.rLineTo(fArr3[i24], fArr3[i25]);
                                            } else {
                                                path.rMoveTo(fArr3[i24], fArr3[i25]);
                                            }
                                        } else if (c6 != 's') {
                                            if (c6 == 't') {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f19 = f29 - f23;
                                                    f20 = f30 - f24;
                                                } else {
                                                    f20 = 0.0f;
                                                    f19 = 0.0f;
                                                }
                                                int i26 = i5 + 0;
                                                int i27 = i5 + 1;
                                                path.rQuadTo(f19, f20, fArr3[i26], fArr3[i27]);
                                                f23 = f19 + f29;
                                                float f35 = f20 + f30;
                                                f29 += fArr3[i26];
                                                f30 += fArr3[i27];
                                                f24 = f35;
                                            }
                                            i2 = i5;
                                        } else {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f17 = f30 - f24;
                                                f18 = f29 - f23;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i28 = i5 + 0;
                                            int i29 = i5 + 1;
                                            int i30 = i5 + 2;
                                            int i31 = i5 + 3;
                                            i2 = i5;
                                            f6 = f30;
                                            path.rCubicTo(f18, f17, fArr3[i28], fArr3[i29], fArr3[i30], fArr3[i31]);
                                            f9 = fArr3[i28] + f29;
                                            f8 = fArr3[i29] + f6;
                                            f7 = f29 + fArr3[i30];
                                            f10 = fArr3[i31];
                                        }
                                        f28 = f30;
                                        f27 = f29;
                                    } else {
                                        i2 = i5;
                                        int i32 = i2 + 0;
                                        int i33 = i2 + 1;
                                        path.lineTo(fArr3[i32], fArr3[i33]);
                                        f29 = fArr3[i32];
                                        f30 = fArr3[i33];
                                    }
                                    f30 = f11 + f12;
                                } else {
                                    i2 = i5;
                                    f6 = f30;
                                    int i34 = i2 + 0;
                                    int i35 = i2 + 1;
                                    int i36 = i2 + 2;
                                    int i37 = i2 + 3;
                                    path.rQuadTo(fArr3[i34], fArr3[i35], fArr3[i36], fArr3[i37]);
                                    f9 = fArr3[i34] + f29;
                                    f8 = fArr3[i35] + f6;
                                    float f36 = f29 + fArr3[i36];
                                    float f37 = fArr3[i37];
                                    f7 = f36;
                                    f10 = f37;
                                }
                                fArr = fArr3;
                                c2 = c6;
                                i3 = i4;
                            } else {
                                i2 = i5;
                                f6 = f30;
                                int i38 = i2 + 2;
                                int i39 = i2 + 3;
                                int i40 = i2 + 4;
                                int i41 = i2 + 5;
                                path.rCubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i38], fArr3[i39], fArr3[i40], fArr3[i41]);
                                f9 = fArr3[i38] + f29;
                                f8 = fArr3[i39] + f6;
                                f7 = f29 + fArr3[i40];
                                f10 = fArr3[i41];
                            }
                            f4 = f6 + f10;
                            f23 = f9;
                            f24 = f8;
                            f5 = f7;
                            f29 = f5;
                            f30 = f4;
                            fArr = fArr3;
                            c2 = c6;
                            i3 = i4;
                        } else {
                            i2 = i5;
                            int i42 = i2 + 5;
                            int i43 = i2 + 6;
                            fArr = fArr3;
                            c2 = c6;
                            i3 = i4;
                            a(path, f29, f30, fArr3[i42] + f29, fArr3[i43] + f30, fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                            f29 += fArr[i42];
                            f30 += fArr[i43];
                        }
                        i5 = i2 + i;
                        c3 = 'm';
                        c5 = c2;
                        c6 = c5;
                        fArr3 = fArr;
                        i4 = i3;
                    } else {
                        i2 = i5;
                        fArr = fArr3;
                        c2 = c6;
                        i3 = i4;
                        int i44 = i2 + 2;
                        int i45 = i2 + 3;
                        int i46 = i2 + 4;
                        int i47 = i2 + 5;
                        path.cubicTo(fArr[i2 + 0], fArr[i2 + 1], fArr[i44], fArr[i45], fArr[i46], fArr[i47]);
                        f29 = fArr[i46];
                        f30 = fArr[i47];
                        f3 = fArr[i44];
                        f2 = fArr[i45];
                    }
                    f23 = f3;
                    f24 = f2;
                    i5 = i2 + i;
                    c3 = 'm';
                    c5 = c2;
                    c6 = c5;
                    fArr3 = fArr;
                    i4 = i3;
                } else {
                    i2 = i5;
                    fArr = fArr3;
                    c2 = c6;
                    i3 = i4;
                    int i48 = i2 + 5;
                    int i49 = i2 + 6;
                    a(path, f29, f30, fArr[i48], fArr[i49], fArr[i2 + 0], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                    f29 = fArr[i48];
                    f30 = fArr[i49];
                }
                f24 = f30;
                f23 = f29;
                i5 = i2 + i;
                c3 = 'm';
                c5 = c2;
                c6 = c5;
                fArr3 = fArr;
                i4 = i3;
            }
            fArr2[0] = f29;
            fArr2[1] = f30;
            fArr2[2] = f23;
            fArr2[3] = f24;
            fArr2[4] = f27;
            fArr2[5] = f28;
            i4++;
            c5 = bVarArr[i4].f3261a;
            c3 = 'm';
            c4 = 0;
            bVarArr2 = bVarArr;
        }
    }
}
