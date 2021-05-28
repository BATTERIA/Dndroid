package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import d.g.l.p;
import d.g.l.y;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int[] e0 = {16842931};
    public static final Comparator<f> f0 = new a();
    public static final Interpolator g0 = new b();
    public static final m h0 = new m();
    public boolean A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I = -1;
    public VelocityTracker J;
    public int K;
    public int L;
    public int M;
    public int N;
    public EdgeEffect O;
    public EdgeEffect P;
    public boolean Q = true;
    public boolean R;
    public int S;
    public List<i> T;
    public i U;
    public j V;
    public int W;
    public int a0;
    public ArrayList<View> b0;

    /* renamed from: c  reason: collision with root package name */
    public int f2552c;
    public final Runnable c0 = new c();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<f> f2553d = new ArrayList<>();
    public int d0 = 0;

    /* renamed from: e  reason: collision with root package name */
    public final f f2554e = new f();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f2555f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public d.s.a.a f2556g;

    /* renamed from: h  reason: collision with root package name */
    public int f2557h;
    public int i = -1;
    public Parcelable j = null;
    public ClassLoader k = null;
    public Scroller l;
    public boolean m;
    public k n;
    public int o;
    public Drawable p;
    public int q;
    public int r;
    public float s = -3.4028235E38f;
    public float t = Float.MAX_VALUE;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y = 1;
    public boolean z;

    public static class a implements Comparator<f> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager viewPager = ViewPager.this;
            viewPager.e(viewPager.f2557h);
        }
    }

    public class d implements d.g.l.l {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f2559a = new Rect();

        public d() {
        }

        @Override // d.g.l.l
        public y a(View view, y yVar) {
            y yVar2;
            y a2 = p.a(view, yVar);
            if (a2.e()) {
                return a2;
            }
            Rect rect = this.f2559a;
            rect.left = a2.b();
            rect.top = a2.d();
            rect.right = a2.c();
            rect.bottom = a2.a();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = ViewPager.this.getChildAt(i);
                if (Build.VERSION.SDK_INT >= 21) {
                    WindowInsets windowInsets = (WindowInsets) y.a(a2);
                    WindowInsets dispatchApplyWindowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                    if (!dispatchApplyWindowInsets.equals(windowInsets)) {
                        windowInsets = new WindowInsets(dispatchApplyWindowInsets);
                    }
                    yVar2 = y.a(windowInsets);
                } else {
                    yVar2 = a2;
                }
                rect.left = Math.min(yVar2.b(), rect.left);
                rect.top = Math.min(yVar2.d(), rect.top);
                rect.right = Math.min(yVar2.c(), rect.right);
                rect.bottom = Math.min(yVar2.a(), rect.bottom);
            }
            return a2.a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public Object f2560a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2561c;

        /* renamed from: d  reason: collision with root package name */
        public float f2562d;

        /* renamed from: e  reason: collision with root package name */
        public float f2563e;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2564a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public float f2565c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2566d;

        /* renamed from: e  reason: collision with root package name */
        public int f2567e;

        /* renamed from: f  reason: collision with root package name */
        public int f2568f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.e0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface i {
        void a(int i);

        void a(int i, float f2, int i2);

        void b(int i);
    }

    public interface j {
        void a(View view, float f2);
    }

    public class k extends DataSetObserver {
        public k() {
        }

        public void onChanged() {
            ViewPager.this.a();
        }

        public void onInvalidated() {
            ViewPager.this.a();
        }
    }

    public static class l extends d.i.a.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f2571e;

        /* renamed from: f  reason: collision with root package name */
        public Parcelable f2572f;

        /* renamed from: g  reason: collision with root package name */
        public ClassLoader f2573g;

        public static class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new l[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? l.class.getClassLoader() : classLoader;
            this.f2571e = parcel.readInt();
            this.f2572f = parcel.readParcelable(classLoader);
            this.f2573g = classLoader;
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("FragmentPager.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" position=");
            a2.append(this.f2571e);
            a2.append("}");
            return a2.toString();
        }

        @Override // d.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3403c, i);
            parcel.writeInt(this.f2571e);
            parcel.writeParcelable(this.f2572f, i);
        }
    }

    public static class m implements Comparator<View> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f2564a;
            if (z != gVar2.f2564a) {
                return z ? 1 : -1;
            }
            return gVar.f2567e - gVar2.f2567e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        c();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.w != z2) {
            this.w = z2;
        }
    }

    public final Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.f2560a = this.f2556g.a(this, i2);
        if (this.f2556g != null) {
            fVar.f2562d = 1.0f;
            if (i3 < 0 || i3 >= this.f2553d.size()) {
                this.f2553d.add(fVar);
            } else {
                this.f2553d.add(i3, fVar);
            }
            return fVar;
        }
        throw null;
    }

    public f a(View view) {
        for (int i2 = 0; i2 < this.f2553d.size(); i2++) {
            f fVar = this.f2553d.get(i2);
            if (this.f2556g.a(view, fVar.f2560a)) {
                return fVar;
            }
        }
        return null;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        int min;
        if (i3 <= 0 || this.f2553d.isEmpty()) {
            f c2 = c(this.f2557h);
            min = (int) ((c2 != null ? Math.min(c2.f2563e, this.t) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
            } else {
                return;
            }
        } else if (!this.l.isFinished()) {
            this.l.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)));
        }
        scrollTo(min, getScrollY());
    }

    public void a(int i2, boolean z2) {
        this.x = false;
        a(i2, z2, false);
    }

    public void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    public void a(int i2, boolean z2, boolean z3, int i3) {
        d.s.a.a aVar = this.f2556g;
        boolean z4 = false;
        if (aVar == null || aVar.a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f2557h != i2 || this.f2553d.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.f2556g.a()) {
                i2 = this.f2556g.a() - 1;
            }
            int i4 = this.y;
            int i5 = this.f2557h;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.f2553d.size(); i6++) {
                    this.f2553d.get(i6).f2561c = true;
                }
            }
            if (this.f2557h != i2) {
                z4 = true;
            }
            if (this.Q) {
                this.f2557h = i2;
                if (z4) {
                    b(i2);
                }
                requestLayout();
                return;
            }
            e(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public final void a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i2);
            this.I = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void a(boolean z2) {
        boolean z3 = this.d0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.l.isFinished()) {
                this.l.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.l.getCurrX();
                int currY = this.l.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        d(currX);
                    }
                }
            }
        }
        this.x = false;
        for (int i2 = 0; i2 < this.f2553d.size(); i2++) {
            f fVar = this.f2553d.get(i2);
            if (fVar.f2561c) {
                fVar.f2561c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            p.a(this, this.c0);
        } else {
            this.c0.run();
        }
    }

    public final boolean a(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.E - f2;
        this.E = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.s * clientWidth;
        float f5 = this.t * clientWidth;
        boolean z4 = false;
        f fVar = this.f2553d.get(0);
        ArrayList<f> arrayList = this.f2553d;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.f2563e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.b != this.f2556g.a() - 1) {
            f5 = fVar2.f2563e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.O.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.P.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.E = (scrollX - ((float) i2)) + this.E;
        scrollTo(i2, getScrollY());
        d(i2);
        return z4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(int r7) {
        /*
        // Method dump skipped, instructions count: 205
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int):boolean");
    }

    public boolean a(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && a(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z2 && view.canScrollHorizontally(-i2);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.f2557h) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        f a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.f2557h) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new g();
        }
        g gVar = (g) layoutParams;
        boolean z2 = gVar.f2564a | (view.getClass().getAnnotation(e.class) != null);
        gVar.f2564a = z2;
        if (!this.v) {
            super.addView(view, i2, layoutParams);
        } else if (!z2) {
            gVar.f2566d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public final f b() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.o) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.f2553d.size()) {
            f fVar2 = this.f2553d.get(i4);
            if (!z2 && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.f2554e;
                fVar2.f2563e = f2 + f4 + f3;
                fVar2.b = i2;
                if (this.f2556g != null) {
                    fVar2.f2562d = 1.0f;
                    i4--;
                } else {
                    throw null;
                }
            }
            f2 = fVar2.f2563e;
            float f5 = fVar2.f2562d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.f2553d.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.b;
            f4 = fVar2.f2562d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    public final void b(int i2) {
        i iVar = this.U;
        if (iVar != null) {
            iVar.b(i2);
        }
        List<i> list = this.T;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar2 = this.T.get(i3);
                if (iVar2 != null) {
                    iVar2.b(i2);
                }
            }
        }
    }

    public final void b(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    public f c(int i2) {
        for (int i3 = 0; i3 < this.f2553d.size(); i3++) {
            f fVar = this.f2553d.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void c() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.l = new Scroller(context, g0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.D = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f2);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.O = new EdgeEffect(context);
        this.P = new EdgeEffect(context);
        this.M = (int) (25.0f * f2);
        this.N = (int) (2.0f * f2);
        this.B = (int) (f2 * 16.0f);
        p.a(this, new h());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        p.a(this, new d());
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.f2556g == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) clientWidth) * this.s)) : i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.t));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.m = true;
        if (this.l.isFinished() || !this.l.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.l.getCurrX();
        int currY = this.l.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!d(currX)) {
                this.l.abortAnimation();
                scrollTo(0, currY);
            }
        }
        p.t(this);
    }

    public boolean d() {
        int i2 = this.f2557h;
        if (i2 <= 0) {
            return false;
        }
        a(i2 - 1, true);
        return true;
    }

    public final boolean d(int i2) {
        if (this.f2553d.size() != 0) {
            f b2 = b();
            int clientWidth = getClientWidth();
            int i3 = this.o;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = b2.b;
            float f3 = ((((float) i2) / f2) - b2.f2563e) / (b2.f2562d + (((float) i3) / f2));
            this.R = false;
            a(i5, f3, (int) (((float) i4) * f3));
            if (this.R) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.Q) {
            return false;
        } else {
            this.R = false;
            a(0, 0.0f, 0);
            if (this.R) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0059
            int r0 = r6.getAction()
            if (r0 != 0) goto L_0x0056
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L_0x0044
            r3 = 22
            if (r0 == r3) goto L_0x0036
            r3 = 61
            if (r0 == r3) goto L_0x0020
            goto L_0x0056
        L_0x0020:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L_0x002b
            boolean r6 = r5.a(r4)
            goto L_0x0057
        L_0x002b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L_0x0056
            boolean r6 = r5.a(r2)
            goto L_0x0057
        L_0x0036:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x0041
            boolean r6 = r5.e()
            goto L_0x0057
        L_0x0041:
            r6 = 66
            goto L_0x0051
        L_0x0044:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L_0x004f
            boolean r6 = r5.d()
            goto L_0x0057
        L_0x004f:
            r6 = 17
        L_0x0051:
            boolean r6 = r5.a(r6)
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.f2557h && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        d.s.a.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2556g) != null && aVar.a() > 1)) {
            if (!this.O.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.s * ((float) width));
                this.O.setSize(height, width);
                z2 = false | this.O.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.P.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.t + 1.0f)) * ((float) width2));
                this.P.setSize(height2, width2);
                z2 |= this.P.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.O.finish();
            this.P.finish();
        }
        if (z2) {
            p.t(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x024b, code lost:
        r7 = r7 - (r8.f2562d + r3);
        r8.f2563e = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0251, code lost:
        if (r10 != 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0253, code lost:
        r14.s = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0255, code lost:
        r4 = r4 - 1;
        r9 = r9 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x027d, code lost:
        if (r9 != r15) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x027f, code lost:
        r14.t = (r8.f2562d + r4) - 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r6 == r7) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bc, code lost:
        if (r6 >= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ca, code lost:
        if (r6 >= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        if (r6 >= 0) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e3, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0138, code lost:
        if (r10 < r14.f2553d.size()) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x014c, code lost:
        if (r10 < r14.f2553d.size()) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015e, code lost:
        if (r10 < r14.f2553d.size()) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0169, code lost:
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(int r15) {
        /*
        // Method dump skipped, instructions count: 880
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.e(int):void");
    }

    public boolean e() {
        d.s.a.a aVar = this.f2556g;
        if (aVar == null || this.f2557h >= aVar.a() - 1) {
            return false;
        }
        a(this.f2557h + 1, true);
        return true;
    }

    public final boolean f() {
        this.I = -1;
        this.z = false;
        this.A = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
        this.O.onRelease();
        this.P.onRelease();
        if (this.O.isFinished() || this.P.isFinished()) {
            return true;
        }
        return false;
    }

    public final void g() {
        if (this.a0 != 0) {
            ArrayList<View> arrayList = this.b0;
            if (arrayList == null) {
                this.b0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.b0.add(getChildAt(i2));
            }
            Collections.sort(this.b0, h0);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g();
    }

    public d.s.a.a getAdapter() {
        return this.f2556g;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.a0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.b0.get(i3).getLayoutParams()).f2568f;
    }

    public int getCurrentItem() {
        return this.f2557h;
    }

    public int getOffscreenPageLimit() {
        return this.y;
    }

    public int getPageMargin() {
        return this.o;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.c0);
        Scroller scroller = this.l;
        if (scroller != null && !scroller.isFinished()) {
            this.l.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.f2553d.size() > 0 && this.f2556g != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.o) / f4;
            int i2 = 0;
            f fVar = this.f2553d.get(0);
            float f6 = fVar.f2563e;
            int size = this.f2553d.size();
            int i3 = fVar.b;
            int i4 = this.f2553d.get(size - 1).b;
            while (i3 < i4) {
                while (i3 > fVar.b && i2 < size) {
                    i2++;
                    fVar = this.f2553d.get(i2);
                }
                if (i3 == fVar.b) {
                    float f7 = fVar.f2563e;
                    float f8 = fVar.f2562d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else if (this.f2556g != null) {
                    f2 = (f6 + 1.0f) * f4;
                    f6 = 1.0f + f5 + f6;
                } else {
                    throw null;
                }
                if (((float) this.o) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.p.setBounds(Math.round(f2), this.q, Math.round(((float) this.o) + f2), this.r);
                    this.p.draw(canvas);
                } else {
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            f();
            return false;
        }
        if (action != 0) {
            if (this.z) {
                return true;
            }
            if (this.A) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.G = x2;
            this.E = x2;
            float y2 = motionEvent.getY();
            this.H = y2;
            this.F = y2;
            this.I = motionEvent.getPointerId(0);
            this.A = false;
            this.m = true;
            this.l.computeScrollOffset();
            if (this.d0 != 2 || Math.abs(this.l.getFinalX() - this.l.getCurrX()) <= this.N) {
                a(false);
                this.z = false;
            } else {
                this.l.abortAnimation();
                this.x = false;
                e(this.f2557h);
                this.z = true;
                b(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.I;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(findPointerIndex);
                float f2 = x3 - this.E;
                float abs = Math.abs(f2);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.H);
                if (f2 != 0.0f) {
                    float f3 = this.E;
                    if (!((f3 < ((float) this.C) && f2 > 0.0f) || (f3 > ((float) (getWidth() - this.C)) && f2 < 0.0f)) && a(this, false, (int) f2, (int) x3, (int) y3)) {
                        this.E = x3;
                        this.F = y3;
                        this.A = true;
                        return false;
                    }
                }
                if (abs > ((float) this.D) && abs * 0.5f > abs2) {
                    this.z = true;
                    b(true);
                    setScrollState(1);
                    this.E = f2 > 0.0f ? this.G + ((float) this.D) : this.G - ((float) this.D);
                    this.F = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.D)) {
                    this.A = true;
                }
                if (this.z && a(x3)) {
                    p.t(this);
                }
            }
        } else if (action == 6) {
            a(motionEvent);
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f a2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.f2557h && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.f3403c);
        d.s.a.a aVar = this.f2556g;
        if (aVar != null) {
            aVar.a(lVar.f2572f, lVar.f2573g);
            a(lVar.f2571e, false, true, 0);
            return;
        }
        this.i = lVar.f2571e;
        this.j = lVar.f2572f;
        this.k = lVar.f2573g;
    }

    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f2571e = this.f2557h;
        d.s.a.a aVar = this.f2556g;
        if (aVar != null) {
            lVar.f2572f = aVar.c();
        }
        return lVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.o;
            a(i2, i4, i6, i6);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.v) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(d.s.a.a aVar) {
        d.s.a.a aVar2 = this.f2556g;
        if (aVar2 != null) {
            aVar2.a((DataSetObserver) null);
            this.f2556g.b(this);
            for (int i2 = 0; i2 < this.f2553d.size(); i2++) {
                f fVar = this.f2553d.get(i2);
                this.f2556g.a(this, fVar.b, fVar.f2560a);
            }
            this.f2556g.a(this);
            this.f2553d.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((g) getChildAt(i3).getLayoutParams()).f2564a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.f2557h = 0;
            scrollTo(0, 0);
        }
        this.f2556g = aVar;
        this.f2552c = 0;
        if (aVar != null) {
            if (this.n == null) {
                this.n = new k();
            }
            this.f2556g.a(this.n);
            this.x = false;
            boolean z2 = this.Q;
            this.Q = true;
            this.f2552c = this.f2556g.a();
            if (this.i >= 0) {
                this.f2556g.a(this.j, this.k);
                a(this.i, false, true, 0);
                this.i = -1;
                this.j = null;
                this.k = null;
            } else if (!z2) {
                e(this.f2557h);
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.x = false;
        a(i2, !this.Q, false, 0);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to " + 1);
            i2 = 1;
        }
        if (i2 != this.y) {
            this.y = i2;
            e(this.f2557h);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(i iVar) {
        this.U = iVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.o;
        this.o = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(d.g.e.a.b(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.d0 != i2) {
            this.d0 = i2;
            if (this.V != null) {
                boolean z2 = i2 != 0;
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    getChildAt(i3).setLayerType(z2 ? this.W : 0, null);
                }
            }
            i iVar = this.U;
            if (iVar != null) {
                iVar.a(i2);
            }
            List<i> list = this.T;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    i iVar2 = this.T.get(i4);
                    if (iVar2 != null) {
                        iVar2.a(i2);
                    }
                }
            }
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public void a() {
        int a2 = this.f2556g.a();
        this.f2552c = a2;
        boolean z2 = this.f2553d.size() < (this.y * 2) + 1 && this.f2553d.size() < a2;
        int i2 = this.f2557h;
        for (int i3 = 0; i3 < this.f2553d.size(); i3++) {
            d.s.a.a aVar = this.f2556g;
            Object obj = this.f2553d.get(i3).f2560a;
            if (aVar == null) {
                throw null;
            }
        }
        Collections.sort(this.f2553d, f0);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                g gVar = (g) getChildAt(i4).getLayoutParams();
                if (!gVar.f2564a) {
                    gVar.f2565c = 0.0f;
                }
            }
            a(i2, false, true, 0);
            requestLayout();
        }
    }

    public class h extends d.g.l.a {
        public h() {
        }

        @Override // d.g.l.a
        public void a(View view, AccessibilityEvent accessibilityEvent) {
            d.s.a.a aVar;
            this.f3331a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            d.s.a.a aVar2 = ViewPager.this.f2556g;
            boolean z = true;
            if (aVar2 == null || aVar2.a() <= 1) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.f2556g) != null) {
                accessibilityEvent.setItemCount(aVar.a());
                accessibilityEvent.setFromIndex(ViewPager.this.f2557h);
                accessibilityEvent.setToIndex(ViewPager.this.f2557h);
            }
        }

        @Override // d.g.l.a
        public boolean a(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.f2557h - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i2 = viewPager.f2557h + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }

        @Override // d.g.l.a
        public void a(View view, d.g.l.z.b bVar) {
            this.f3331a.onInitializeAccessibilityNodeInfo(view, bVar.f3365a);
            bVar.f3365a.setClassName(ViewPager.class.getName());
            d.s.a.a aVar = ViewPager.this.f2556g;
            bVar.f3365a.setScrollable(aVar != null && aVar.a() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.f3365a.addAction(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.f3365a.addAction(8192);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r13, float r14, int r15) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.a(int, float, int):void");
    }

    public final void a(int i2, boolean z2, int i3, boolean z3) {
        int i4;
        int i5;
        f c2 = c(i2);
        int max = c2 != null ? (int) (Math.max(this.s, Math.min(c2.f2563e, this.t)) * ((float) getClientWidth())) : 0;
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.l;
                if (scroller != null && !scroller.isFinished()) {
                    i4 = this.m ? this.l.getCurrX() : this.l.getStartX();
                    this.l.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    i4 = getScrollX();
                }
                int scrollY = getScrollY();
                int i6 = max - i4;
                int i7 = 0 - scrollY;
                if (i6 == 0 && i7 == 0) {
                    a(false);
                    e(this.f2557h);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i8 = clientWidth / 2;
                    float f2 = (float) clientWidth;
                    float f3 = (float) i8;
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                    int abs = Math.abs(i3);
                    if (abs > 0) {
                        i5 = Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4;
                    } else if (this.f2556g != null) {
                        i5 = (int) (((((float) Math.abs(i6)) / ((f2 * 1.0f) + ((float) this.o))) + 1.0f) * 100.0f);
                    } else {
                        throw null;
                    }
                    int min = Math.min(i5, 600);
                    this.m = false;
                    this.l.startScroll(i4, scrollY, i6, i7, min);
                    p.t(this);
                }
            }
            if (z3) {
                b(i2);
                return;
            }
            return;
        }
        if (z3) {
            b(i2);
        }
        a(false);
        scrollTo(max, 0);
        d(max);
    }

    public void a(boolean z2, j jVar) {
        int i2 = 1;
        boolean z3 = jVar != null;
        boolean z4 = z3 != (this.V != null);
        this.V = jVar;
        setChildrenDrawingOrderEnabled(z3);
        if (z3) {
            if (z2) {
                i2 = 2;
            }
            this.a0 = i2;
            this.W = 2;
        } else {
            this.a0 = 0;
        }
        if (z4) {
            e(this.f2557h);
        }
    }
}
