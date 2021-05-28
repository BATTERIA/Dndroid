package d.b.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import d.b.j;
import d.g.e.c.g;
import d.g.m.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3002a;
    public r0 b;

    /* renamed from: c  reason: collision with root package name */
    public r0 f3003c;

    /* renamed from: d  reason: collision with root package name */
    public r0 f3004d;

    /* renamed from: e  reason: collision with root package name */
    public r0 f3005e;

    /* renamed from: f  reason: collision with root package name */
    public r0 f3006f;

    /* renamed from: g  reason: collision with root package name */
    public r0 f3007g;

    /* renamed from: h  reason: collision with root package name */
    public final y f3008h;
    public int i = 0;
    public Typeface j;
    public boolean k;

    public class a extends g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WeakReference f3009a;

        public a(WeakReference weakReference) {
            this.f3009a = weakReference;
        }

        @Override // d.g.e.c.g
        public void a(Typeface typeface) {
            w wVar = w.this;
            WeakReference weakReference = this.f3009a;
            if (wVar.k) {
                wVar.j = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    textView.setTypeface(typeface, wVar.i);
                }
            }
        }
    }

    public w(TextView textView) {
        this.f3002a = textView;
        this.f3008h = new y(this.f3002a);
    }

    public static r0 a(Context context, i iVar, int i2) {
        ColorStateList d2 = iVar.d(context, i2);
        if (d2 == null) {
            return null;
        }
        r0 r0Var = new r0();
        r0Var.f2978d = true;
        r0Var.f2976a = d2;
        return r0Var;
    }

    public void a() {
        if (!(this.b == null && this.f3003c == null && this.f3004d == null && this.f3005e == null)) {
            Drawable[] compoundDrawables = this.f3002a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f3003c);
            a(compoundDrawables[2], this.f3004d);
            a(compoundDrawables[3], this.f3005e);
        }
        if (this.f3006f != null || this.f3007g != null) {
            Drawable[] compoundDrawablesRelative = this.f3002a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f3006f);
            a(compoundDrawablesRelative[2], this.f3007g);
        }
    }

    public final void a(Drawable drawable, r0 r0Var) {
        if (drawable != null && r0Var != null) {
            i.a(drawable, r0Var, this.f3002a.getDrawableState());
        }
    }

    @SuppressLint({"NewApi"})
    public void a(AttributeSet attributeSet, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        boolean z2;
        int resourceId;
        Context context = this.f3002a.getContext();
        i a2 = i.a();
        t0 a3 = t0.a(context, attributeSet, j.AppCompatTextHelper, i2, 0);
        int f2 = a3.f(j.AppCompatTextHelper_android_textAppearance, -1);
        if (a3.e(j.AppCompatTextHelper_android_drawableLeft)) {
            this.b = a(context, a2, a3.f(j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a3.e(j.AppCompatTextHelper_android_drawableTop)) {
            this.f3003c = a(context, a2, a3.f(j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a3.e(j.AppCompatTextHelper_android_drawableRight)) {
            this.f3004d = a(context, a2, a3.f(j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a3.e(j.AppCompatTextHelper_android_drawableBottom)) {
            this.f3005e = a(context, a2, a3.f(j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (a3.e(j.AppCompatTextHelper_android_drawableStart)) {
            this.f3006f = a(context, a2, a3.f(j.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (a3.e(j.AppCompatTextHelper_android_drawableEnd)) {
            this.f3007g = a(context, a2, a3.f(j.AppCompatTextHelper_android_drawableEnd, 0));
        }
        a3.b.recycle();
        boolean z3 = this.f3002a.getTransformationMethod() instanceof PasswordTransformationMethod;
        ColorStateList colorStateList3 = null;
        if (f2 != -1) {
            t0 t0Var = new t0(context, context.obtainStyledAttributes(f2, j.TextAppearance));
            if (z3 || !t0Var.e(j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = t0Var.a(j.TextAppearance_textAllCaps, false);
                z = true;
            }
            a(context, t0Var);
            if (Build.VERSION.SDK_INT < 23) {
                ColorStateList a4 = t0Var.e(j.TextAppearance_android_textColor) ? t0Var.a(j.TextAppearance_android_textColor) : null;
                colorStateList = t0Var.e(j.TextAppearance_android_textColorHint) ? t0Var.a(j.TextAppearance_android_textColorHint) : null;
                if (t0Var.e(j.TextAppearance_android_textColorLink)) {
                    colorStateList3 = t0Var.a(j.TextAppearance_android_textColorLink);
                }
                colorStateList2 = colorStateList3;
                colorStateList3 = a4;
            } else {
                colorStateList2 = null;
                colorStateList = null;
            }
            t0Var.b.recycle();
        } else {
            colorStateList2 = null;
            colorStateList = null;
            z2 = false;
            z = false;
        }
        t0 t0Var2 = new t0(context, context.obtainStyledAttributes(attributeSet, j.TextAppearance, i2, 0));
        if (!z3 && t0Var2.e(j.TextAppearance_textAllCaps)) {
            z2 = t0Var2.a(j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (t0Var2.e(j.TextAppearance_android_textColor)) {
                colorStateList3 = t0Var2.a(j.TextAppearance_android_textColor);
            }
            if (t0Var2.e(j.TextAppearance_android_textColorHint)) {
                colorStateList = t0Var2.a(j.TextAppearance_android_textColorHint);
            }
            if (t0Var2.e(j.TextAppearance_android_textColorLink)) {
                colorStateList2 = t0Var2.a(j.TextAppearance_android_textColorLink);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && t0Var2.e(j.TextAppearance_android_textSize) && t0Var2.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.f3002a.setTextSize(0, 0.0f);
        }
        a(context, t0Var2);
        t0Var2.b.recycle();
        if (colorStateList3 != null) {
            this.f3002a.setTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f3002a.setHintTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f3002a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            this.f3002a.setAllCaps(z2);
        }
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f3002a.setTypeface(typeface, this.i);
        }
        y yVar = this.f3008h;
        TypedArray obtainStyledAttributes = yVar.j.obtainStyledAttributes(attributeSet, j.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeTextType)) {
            yVar.f3030a = obtainStyledAttributes.getInt(j.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(j.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(j.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr = new int[length];
            if (length > 0) {
                for (int i3 = 0; i3 < length; i3++) {
                    iArr[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                }
                yVar.f3034f = yVar.a(iArr);
                yVar.c();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!yVar.d()) {
            yVar.f3030a = 0;
        } else if (yVar.f3030a == 1) {
            if (!yVar.f3035g) {
                DisplayMetrics displayMetrics = yVar.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                yVar.a(dimension2, dimension3, dimension);
            }
            yVar.b();
        }
        if (b.f3387a) {
            y yVar2 = this.f3008h;
            if (yVar2.f3030a != 0) {
                int[] iArr2 = yVar2.f3034f;
                if (iArr2.length > 0) {
                    if (((float) this.f3002a.getAutoSizeStepGranularity()) != -1.0f) {
                        this.f3002a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f3008h.f3032d), Math.round(this.f3008h.f3033e), Math.round(this.f3008h.f3031c), 0);
                    } else {
                        this.f3002a.setAutoSizeTextTypeUniformWithPresetSizes(iArr2, 0);
                    }
                }
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.AppCompatTextView);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(j.AppCompatTextView_firstBaselineToTopHeight, -1);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(j.AppCompatTextView_lastBaselineToBottomHeight, -1);
        int dimensionPixelSize3 = obtainStyledAttributes2.getDimensionPixelSize(j.AppCompatTextView_lineHeight, -1);
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize != -1) {
            c.a.a.a.a.a(this.f3002a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            c.a.a.a.a.b(this.f3002a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            c.a.a.a.a.c(this.f3002a, dimensionPixelSize3);
        }
    }

    public boolean b() {
        y yVar = this.f3008h;
        return yVar.d() && yVar.f3030a != 0;
    }

    public void a(Context context, int i2) {
        ColorStateList a2;
        t0 t0Var = new t0(context, context.obtainStyledAttributes(i2, j.TextAppearance));
        if (t0Var.e(j.TextAppearance_textAllCaps)) {
            this.f3002a.setAllCaps(t0Var.a(j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && t0Var.e(j.TextAppearance_android_textColor) && (a2 = t0Var.a(j.TextAppearance_android_textColor)) != null) {
            this.f3002a.setTextColor(a2);
        }
        if (t0Var.e(j.TextAppearance_android_textSize) && t0Var.c(j.TextAppearance_android_textSize, -1) == 0) {
            this.f3002a.setTextSize(0, 0.0f);
        }
        a(context, t0Var);
        t0Var.b.recycle();
        Typeface typeface = this.j;
        if (typeface != null) {
            this.f3002a.setTypeface(typeface, this.i);
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        y yVar = this.f3008h;
        if (yVar.d()) {
            DisplayMetrics displayMetrics = yVar.j.getResources().getDisplayMetrics();
            yVar.a(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (yVar.b()) {
                yVar.a();
            }
        }
    }

    public void a(int[] iArr, int i2) {
        y yVar = this.f3008h;
        if (yVar.d()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = yVar.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                yVar.f3034f = yVar.a(iArr2);
                if (!yVar.c()) {
                    StringBuilder a2 = e.a.a.a.a.a("None of the preset sizes is valid: ");
                    a2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a2.toString());
                }
            } else {
                yVar.f3035g = false;
            }
            if (yVar.b()) {
                yVar.a();
            }
        }
    }

    public void a(int i2) {
        y yVar = this.f3008h;
        if (!yVar.d()) {
            return;
        }
        if (i2 == 0) {
            yVar.f3030a = 0;
            yVar.f3032d = -1.0f;
            yVar.f3033e = -1.0f;
            yVar.f3031c = -1.0f;
            yVar.f3034f = new int[0];
            yVar.b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = yVar.j.getResources().getDisplayMetrics();
            yVar.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (yVar.b()) {
                yVar.a();
            }
        } else {
            throw new IllegalArgumentException(e.a.a.a.a.a("Unknown auto-size text type: ", i2));
        }
    }

    public final void a(Context context, t0 t0Var) {
        String string;
        Typeface typeface;
        this.i = t0Var.d(j.TextAppearance_android_textStyle, this.i);
        boolean z = true;
        if (t0Var.e(j.TextAppearance_android_fontFamily) || t0Var.e(j.TextAppearance_fontFamily)) {
            this.j = null;
            int i2 = t0Var.e(j.TextAppearance_fontFamily) ? j.TextAppearance_fontFamily : j.TextAppearance_android_fontFamily;
            if (!context.isRestricted()) {
                try {
                    Typeface a2 = t0Var.a(i2, this.i, new a(new WeakReference(this.f3002a)));
                    this.j = a2;
                    if (a2 != null) {
                        z = false;
                    }
                    this.k = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.j == null && (string = t0Var.b.getString(i2)) != null) {
                this.j = Typeface.create(string, this.i);
            }
        } else if (t0Var.e(j.TextAppearance_android_typeface)) {
            this.k = false;
            int d2 = t0Var.d(j.TextAppearance_android_typeface, 1);
            if (d2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (d2 == 2) {
                typeface = Typeface.SERIF;
            } else if (d2 == 3) {
                typeface = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.j = typeface;
        }
    }
}
