package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import d.e.a.h.d;
import d.e.a.h.e;
import d.e.a.h.g;
import d.e.b.b;
import d.e.b.c;
import d.e.b.f;
import d.e.b.h;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<View> f2358c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<b> f2359d = new ArrayList<>(4);

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<d> f2360e = new ArrayList<>(100);

    /* renamed from: f  reason: collision with root package name */
    public e f2361f = new e();

    /* renamed from: g  reason: collision with root package name */
    public int f2362g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2363h = 0;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;
    public int l = 7;
    public c m = null;
    public int n = -1;
    public HashMap<String, Integer> o = new HashMap<>();
    public int p = -1;
    public int q = -1;

    public static class a extends ViewGroup.MarginLayoutParams {
        public float A = 0.5f;
        public String B = null;
        public int C = 1;
        public float D = -1.0f;
        public float E = -1.0f;
        public int F = 0;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public float N = 1.0f;
        public float O = 1.0f;
        public int P = -1;
        public int Q = -1;
        public int R = -1;
        public boolean S = false;
        public boolean T = false;
        public boolean U = true;
        public boolean V = true;
        public boolean W = false;
        public boolean X = false;
        public boolean Y = false;
        public boolean Z = false;

        /* renamed from: a  reason: collision with root package name */
        public int f2364a = -1;
        public int a0 = -1;
        public int b = -1;
        public int b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public float f2365c = -1.0f;
        public int c0 = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2366d = -1;
        public int d0 = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f2367e = -1;
        public int e0 = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2368f = -1;
        public int f0 = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f2369g = -1;
        public float g0 = 0.5f;

        /* renamed from: h  reason: collision with root package name */
        public int f2370h = -1;
        public int h0;
        public int i = -1;
        public int i0;
        public int j = -1;
        public float j0;
        public int k = -1;
        public d k0 = new d();
        public int l = -1;
        public boolean l0 = false;
        public int m = -1;
        public int n = 0;
        public float o = 0.0f;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0081a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f2371a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2371a = sparseIntArray;
                sparseIntArray.append(h.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f2371a.append(h.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f2371a.append(h.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f2371a.append(h.ConstraintLayout_Layout_android_orientation, 1);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f2371a.append(h.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f2371a.append(h.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f2371a.append(h.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f2371a.append(h.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f2371a.append(h.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f2371a.append(h.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f2371a.append(h.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f2371a.append(h.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f2371a.append(h.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i2;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = C0081a.f2371a.get(index);
                switch (i4) {
                    case 1:
                        this.R = obtainStyledAttributes.getInt(index, this.R);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId;
                        if (resourceId == -1) {
                            this.m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                        continue;
                    case 4:
                        float f2 = obtainStyledAttributes.getFloat(index, this.o) % 360.0f;
                        this.o = f2;
                        if (f2 < 0.0f) {
                            this.o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f2364a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2364a);
                        continue;
                    case 6:
                        this.b = obtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                        continue;
                    case 7:
                        this.f2365c = obtainStyledAttributes.getFloat(index, this.f2365c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2366d);
                        this.f2366d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2366d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2367e);
                        this.f2367e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2367e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2368f);
                        this.f2368f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2368f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2369g);
                        this.f2369g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2369g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2370h);
                        this.f2370h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2370h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId7;
                        if (resourceId7 == -1) {
                            this.i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId8;
                        if (resourceId8 == -1) {
                            this.j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId9;
                        if (resourceId9 == -1) {
                            this.k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId10;
                        if (resourceId10 == -1) {
                            this.l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId11;
                        if (resourceId11 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.q);
                        this.q = resourceId12;
                        if (resourceId12 == -1) {
                            this.q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.r);
                        this.r = resourceId13;
                        if (resourceId13 == -1) {
                            this.r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId14;
                        if (resourceId14 == -1) {
                            this.s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        continue;
                    case 22:
                        this.u = obtainStyledAttributes.getDimensionPixelSize(index, this.u);
                        continue;
                    case 23:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        continue;
                    case 24:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                    case 25:
                        this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                    case 26:
                        this.y = obtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                    case 27:
                        this.S = obtainStyledAttributes.getBoolean(index, this.S);
                        continue;
                    case 28:
                        this.T = obtainStyledAttributes.getBoolean(index, this.T);
                        continue;
                    case 29:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        continue;
                    case 30:
                        this.A = obtainStyledAttributes.getFloat(index, this.A);
                        continue;
                    case 31:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.H = i5;
                        if (i5 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.I = i6;
                        if (i6 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.J) == -2) {
                                this.J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.L) == -2) {
                                this.L = -2;
                            }
                        }
                    case 35:
                        this.N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.N));
                        continue;
                    case 36:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                            }
                        }
                    case 38:
                        this.O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.O));
                        continue;
                    default:
                        switch (i4) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.B = string;
                                this.C = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i2 = 0;
                                    } else {
                                        String substring = this.B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.C = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.C = 1;
                                        }
                                        i2 = indexOf + 1;
                                    }
                                    int indexOf2 = this.B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.B.substring(i2);
                                        if (substring2.length() > 0) {
                                            Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.B.substring(i2, indexOf2);
                                        String substring4 = this.B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.C == 1) {
                                                        Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                continue;
                            case 46:
                                this.E = obtainStyledAttributes.getFloat(index, this.E);
                                continue;
                            case 47:
                                this.F = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.P = obtainStyledAttributes.getDimensionPixelOffset(index, this.P);
                                continue;
                            case 50:
                                this.Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.Q);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.X = false;
            this.U = true;
            this.V = true;
            if (((ViewGroup.MarginLayoutParams) this).width == -2 && this.S) {
                this.U = false;
                this.H = 1;
            }
            if (((ViewGroup.MarginLayoutParams) this).height == -2 && this.T) {
                this.V = false;
                this.I = 1;
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i2 == 0 || i2 == -1) {
                this.U = false;
                if (((ViewGroup.MarginLayoutParams) this).width == 0 && this.H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.S = true;
                }
            }
            int i3 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i3 == 0 || i3 == -1) {
                this.V = false;
                if (((ViewGroup.MarginLayoutParams) this).height == 0 && this.I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.T = true;
                }
            }
            if (this.f2365c != -1.0f || this.f2364a != -1 || this.b != -1) {
                this.X = true;
                this.U = true;
                this.V = true;
                if (!(this.k0 instanceof g)) {
                    this.k0 = new g();
                }
                ((g) this.k0).g(this.R);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d6, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e5, code lost:
            if (r1 > 0) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00ec  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00f7  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
            // Method dump skipped, instructions count: 261
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(attributeSet);
    }

    public final d a(int i2) {
        if (i2 == 0) {
            return this.f2361f;
        }
        View view = this.f2358c.get(i2);
        if (view == null && (view = findViewById(i2)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f2361f;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).k0;
    }

    public final d a(View view) {
        if (view == this) {
            return this.f2361f;
        }
        if (view == null) {
            return null;
        }
        return ((a) view.getLayoutParams()).k0;
    }

    public Object a(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.o;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.o.get(str);
    }

    public void a(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.o == null) {
                this.o = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.o.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void a(AttributeSet attributeSet) {
        this.f2361f.X = this;
        this.f2358c.put(getId(), this);
        this.m = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == h.ConstraintLayout_Layout_android_minWidth) {
                    this.f2362g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2362g);
                } else if (index == h.ConstraintLayout_Layout_android_minHeight) {
                    this.f2363h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2363h);
                } else if (index == h.ConstraintLayout_Layout_android_maxWidth) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == h.ConstraintLayout_Layout_android_maxHeight) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(index, this.j);
                } else if (index == h.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.l = obtainStyledAttributes.getInt(index, this.l);
                } else if (index == h.ConstraintLayout_Layout_constraintSet) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        c cVar = new c();
                        this.m = cVar;
                        cVar.a(getContext(), resourceId);
                    } catch (Resources.NotFoundException unused) {
                        this.m = null;
                    }
                    this.n = resourceId;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2361f.C0 = this.l;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 691
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b(int, int):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i3;
                        float f3 = (float) i4;
                        float f4 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.j;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinHeight() {
        return this.f2363h;
    }

    public int getMinWidth() {
        return this.f2362g;
    }

    public int getOptimizationLevel() {
        return this.f2361f.C0;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            d dVar = aVar.k0;
            if ((childAt.getVisibility() != 8 || aVar.X || aVar.Y || isInEditMode) && !aVar.Z) {
                int i7 = dVar.M + dVar.O;
                int i8 = dVar.N + dVar.P;
                int j2 = dVar.j() + i7;
                int d2 = dVar.d() + i8;
                childAt.layout(i7, i8, j2, d2);
                if ((childAt instanceof f) && (content = ((f) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(i7, i8, j2, d2);
                }
            }
        }
        int size = this.f2359d.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                if (this.f2359d.get(i9) == null) {
                    throw null;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:226:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04fa A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x056d  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0591  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0645  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x066b  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0679  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x08e2  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x08fb  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x0af3  */
    /* JADX WARNING: Removed duplicated region for block: B:547:0x0b2c  */
    /* JADX WARNING: Removed duplicated region for block: B:550:0x0b33  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r40, int r41) {
        /*
        // Method dump skipped, instructions count: 2876
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        d a2 = a(view);
        if ((view instanceof d.e.b.e) && !(a2 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.k0 = gVar;
            aVar.X = true;
            gVar.g(aVar.R);
        }
        if (view instanceof b) {
            b bVar = (b) view;
            bVar.a();
            ((a) view.getLayoutParams()).Y = true;
            if (!this.f2359d.contains(bVar)) {
                this.f2359d.add(bVar);
            }
        }
        this.f2358c.put(view.getId(), view);
        this.k = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2358c.remove(view.getId());
        d a2 = a(view);
        this.f2361f.k0.remove(a2);
        a2.D = null;
        this.f2359d.remove(view);
        this.f2360e.remove(a2);
        this.k = true;
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        super.requestLayout();
        this.k = true;
        this.p = -1;
        this.q = -1;
    }

    public void setConstraintSet(c cVar) {
        this.m = cVar;
    }

    public void setId(int i2) {
        this.f2358c.remove(getId());
        super.setId(i2);
        this.f2358c.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.j) {
            this.j = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.i) {
            this.i = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f2363h) {
            this.f2363h = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f2362g) {
            this.f2362g = i2;
            requestLayout();
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f2361f.C0 = i2;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void a(int i2, int i3) {
        boolean z;
        int baseline;
        int i4;
        int i5;
        int childMeasureSpec;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                d dVar = aVar.k0;
                if (!aVar.X && !aVar.Y) {
                    dVar.Y = childAt.getVisibility();
                    int i7 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    int i8 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    boolean z2 = aVar.U;
                    boolean z3 = true;
                    if (z2 || aVar.V || (!z2 && aVar.H == 1) || ((ViewGroup.MarginLayoutParams) aVar).width == -1 || (!aVar.V && (aVar.I == 1 || ((ViewGroup.MarginLayoutParams) aVar).height == -1))) {
                        if (i7 == 0) {
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingRight, -2);
                            z = true;
                        } else if (i7 == -1) {
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingRight, -1);
                            z = false;
                        } else {
                            z = i7 == -2;
                            i4 = ViewGroup.getChildMeasureSpec(i2, paddingRight, i7);
                        }
                        if (i8 == 0) {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
                        } else if (i8 == -1) {
                            i5 = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -1);
                            z3 = false;
                            childAt.measure(i4, i5);
                            i7 = childAt.getMeasuredWidth();
                            i8 = childAt.getMeasuredHeight();
                        } else {
                            if (i8 != -2) {
                                z3 = false;
                            }
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, i8);
                        }
                        i5 = childMeasureSpec;
                        childAt.measure(i4, i5);
                        i7 = childAt.getMeasuredWidth();
                        i8 = childAt.getMeasuredHeight();
                    } else {
                        z3 = false;
                        z = false;
                    }
                    dVar.f(i7);
                    dVar.e(i8);
                    if (z) {
                        dVar.T = i7;
                    }
                    if (z3) {
                        dVar.U = i8;
                    }
                    if (aVar.W && (baseline = childAt.getBaseline()) != -1) {
                        dVar.Q = baseline;
                    }
                }
            }
        }
    }
}
