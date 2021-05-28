package d.b.o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import d.b.j;

public class f0 extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public boolean f2897c;

    /* renamed from: d  reason: collision with root package name */
    public int f2898d;

    /* renamed from: e  reason: collision with root package name */
    public int f2899e;

    /* renamed from: f  reason: collision with root package name */
    public int f2900f;

    /* renamed from: g  reason: collision with root package name */
    public int f2901g;

    /* renamed from: h  reason: collision with root package name */
    public int f2902h;
    public float i;
    public boolean j;
    public int[] k;
    public int[] l;
    public Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;

    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public float f2903a;
        public int b;

        public a(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.f2903a = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat_Layout);
            this.f2903a = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.b = obtainStyledAttributes.getInt(j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = -1;
        }
    }

    public f0(Context context) {
        this(context, null);
    }

    public f0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int resourceId;
        this.f2897c = true;
        this.f2898d = -1;
        this.f2899e = 0;
        this.f2901g = 8388659;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.LinearLayoutCompat, i2, 0);
        int i3 = obtainStyledAttributes.getInt(j.LinearLayoutCompat_android_orientation, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = obtainStyledAttributes.getInt(j.LinearLayoutCompat_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = obtainStyledAttributes.getBoolean(j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.i = obtainStyledAttributes.getFloat(j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2898d = obtainStyledAttributes.getInt(j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.j = obtainStyledAttributes.getBoolean(j.LinearLayoutCompat_measureWithLargestChild, false);
        int i5 = j.LinearLayoutCompat_divider;
        setDividerDrawable((!obtainStyledAttributes.hasValue(i5) || (resourceId = obtainStyledAttributes.getResourceId(i5, 0)) == 0) ? obtainStyledAttributes.getDrawable(i5) : d.b.l.a.a.c(context, resourceId));
        this.p = obtainStyledAttributes.getInt(j.LinearLayoutCompat_showDividers, 0);
        this.q = obtainStyledAttributes.getDimensionPixelSize(j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    public void a(Canvas canvas, int i2) {
        this.m.setBounds(getPaddingLeft() + this.q, i2, (getWidth() - getPaddingRight()) - this.q, this.o + i2);
        this.m.draw(canvas);
    }

    public boolean a(int i2) {
        if (i2 == 0) {
            return (this.p & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.p & 4) != 0;
        }
        if ((this.p & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void b(Canvas canvas, int i2) {
        this.m.setBounds(i2, getPaddingTop() + this.q, this.n + i2, (getHeight() - getPaddingBottom()) - this.q);
        this.m.draw(canvas);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public a generateDefaultLayoutParams() {
        int i2 = this.f2900f;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getBaseline() {
        int i2;
        if (this.f2898d < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f2898d;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f2899e;
                if (this.f2900f == 1 && (i2 = this.f2901g & j.AppCompatTheme_windowActionBarOverlay) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2902h) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2902h;
                    }
                }
                return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f2898d == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2898d;
    }

    public Drawable getDividerDrawable() {
        return this.m;
    }

    public int getDividerPadding() {
        return this.q;
    }

    public int getDividerWidth() {
        return this.n;
    }

    public int getGravity() {
        return this.f2901g;
    }

    public int getOrientation() {
        return this.f2900f;
    }

    public int getShowDividers() {
        return this.p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.i;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.m != null) {
            int i5 = 0;
            if (this.f2900f == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !a(i5))) {
                        a(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.o);
                    }
                    i5++;
                }
                if (a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    a(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.o : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = a1.a(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    b(canvas, a2 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.n);
                }
                i5++;
            }
            if (a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a2) {
                        i4 = childAt4.getLeft();
                        i3 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    } else {
                        i2 = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                        b(canvas, i2);
                    }
                } else if (a2) {
                    i2 = getPaddingLeft();
                    b(canvas, i2);
                } else {
                    i4 = getWidth();
                    i3 = getPaddingRight();
                }
                i2 = (i4 - i3) - this.n;
                b(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f0.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f0.class.getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r25, int r26, int r27, int r28, int r29) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.f0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b1, code lost:
        if (r13 < 0) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0728, code lost:
        if (r7 < 0) goto L_0x072a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0490  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06d1  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 2239
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.f0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f2897c = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder a2 = e.a.a.a.a.a("base aligned child index out of range (0, ");
            a2.append(getChildCount());
            a2.append(")");
            throw new IllegalArgumentException(a2.toString());
        }
        this.f2898d = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.m) {
            this.m = drawable;
            boolean z = false;
            if (drawable != null) {
                this.n = drawable.getIntrinsicWidth();
                this.o = drawable.getIntrinsicHeight();
            } else {
                this.n = 0;
                this.o = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.q = i2;
    }

    public void setGravity(int i2) {
        if (this.f2901g != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & j.AppCompatTheme_windowActionBarOverlay) == 0) {
                i2 |= 48;
            }
            this.f2901g = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f2901g;
        if ((8388615 & i4) != i3) {
            this.f2901g = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.j = z;
    }

    public void setOrientation(int i2) {
        if (this.f2900f != i2) {
            this.f2900f = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.p) {
            requestLayout();
        }
        this.p = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & j.AppCompatTheme_windowActionBarOverlay;
        int i4 = this.f2901g;
        if ((i4 & j.AppCompatTheme_windowActionBarOverlay) != i3) {
            this.f2901g = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.i = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
