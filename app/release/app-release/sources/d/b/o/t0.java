package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import d.b.l.a.a;

public class t0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2985a;
    public final TypedArray b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f2986c;

    public t0(Context context, TypedArray typedArray) {
        this.f2985a = context;
        this.b = typedArray;
    }

    public static t0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new t0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int a(int i, int i2) {
        return this.b.getColor(i, i2);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList b2;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0 || (b2 = a.b(this.f2985a, resourceId)) == null) ? this.b.getColorStateList(i) : b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        if (r15 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r15 != null) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(int r13, int r14, d.g.e.c.g r15) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.t0.a(int, int, d.g.e.c.g):android.graphics.Typeface");
    }

    public boolean a(int i, boolean z) {
        return this.b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.b.getDimensionPixelOffset(i, i2);
    }

    public Drawable b(int i) {
        int resourceId;
        return (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) ? this.b.getDrawable(i) : a.c(this.f2985a, resourceId);
    }

    public int c(int i, int i2) {
        return this.b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return i.a().a(this.f2985a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.b.getInt(i, i2);
    }

    public CharSequence d(int i) {
        return this.b.getText(i);
    }

    public int e(int i, int i2) {
        return this.b.getLayoutDimension(i, i2);
    }

    public boolean e(int i) {
        return this.b.hasValue(i);
    }

    public int f(int i, int i2) {
        return this.b.getResourceId(i, i2);
    }
}
