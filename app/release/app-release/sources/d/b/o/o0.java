package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.g.f.a;

public class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f2962a = new ThreadLocal<>();
    public static final int[] b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2963c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2964d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2965e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2966f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f2967g = new int[1];

    public static int a(Context context, int i) {
        ColorStateList c2 = c(context, i);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(b, c2.getDefaultColor());
        }
        TypedValue typedValue = f2962a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f2962a.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int b2 = b(context, i);
        return a.b(b2, Math.round(((float) Color.alpha(b2)) * f2));
    }

    public static int b(Context context, int i) {
        int[] iArr = f2967g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2967g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = d.b.l.a.a.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
