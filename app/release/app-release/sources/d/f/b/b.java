package d.f.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import d.g.l.h;
import d.g.l.l;
import d.g.l.p;
import d.g.l.y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class b extends ViewGroup implements h {
    public static final String n;
    public static final Class<?>[] o = {Context.class, AttributeSet.class};
    public static final ThreadLocal<Map<String, Constructor<AbstractC0097b>>> p = new ThreadLocal<>();
    public static final Comparator<View> q;
    public static final d.g.k.b<Rect> r = new d.g.k.c(12);

    /* renamed from: c  reason: collision with root package name */
    public Paint f3224c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3225d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3226e;

    /* renamed from: f  reason: collision with root package name */
    public View f3227f;

    /* renamed from: g  reason: collision with root package name */
    public View f3228g;

    /* renamed from: h  reason: collision with root package name */
    public e f3229h;
    public boolean i;
    public y j;
    public boolean k;
    public Drawable l;
    public l m;

    public interface a {
        AbstractC0097b a();
    }

    /* renamed from: d.f.b.b$b  reason: collision with other inner class name */
    public static abstract class AbstractC0097b<V extends View> {
        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;)I */
        public int a() {
            return -16777216;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Ld/g/l/y;)Ld/g/l/y; */
        public y a(y yVar) {
            return yVar;
        }

        public void a(b bVar, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                h();
            }
        }

        public boolean a(b bVar, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return l();
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;)F */
        public float b() {
            return 0.0f;
        }

        public void c() {
        }

        public void d() {
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/view/MotionEvent;)Z */
        public boolean e() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/view/View;FFZ)Z */
        public boolean f() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/view/View;FF)Z */
        public boolean g() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/view/View;IIII)V */
        @Deprecated
        public void h() {
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/graphics/Rect;Z)Z */
        public boolean i() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/os/Parcelable;)V */
        public void j() {
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;)Landroid/os/Parcelable; */
        public Parcelable k() {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/view/View;Landroid/view/View;I)Z */
        @Deprecated
        public boolean l() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: (Ld/f/b/b;TV;Landroid/view/MotionEvent;)Z */
        public boolean m() {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class<? extends AbstractC0097b> value();
    }

    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public AbstractC0097b f3230a;
        public boolean b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f3231c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f3232d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f3233e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3234f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f3235g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f3236h = 0;
        public boolean i;
        public boolean j;
        public boolean k;
        public final Rect l = new Rect();

        public d(int i2, int i3) {
            super(i2, i3);
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f.a.CoordinatorLayout_Layout);
            this.f3231c = obtainStyledAttributes.getInteger(d.f.a.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.f3234f = obtainStyledAttributes.getResourceId(d.f.a.CoordinatorLayout_Layout_layout_anchor, -1);
            this.f3232d = obtainStyledAttributes.getInteger(d.f.a.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.f3233e = obtainStyledAttributes.getInteger(d.f.a.CoordinatorLayout_Layout_layout_keyline, -1);
            this.f3235g = obtainStyledAttributes.getInt(d.f.a.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.f3236h = obtainStyledAttributes.getInt(d.f.a.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(d.f.a.CoordinatorLayout_Layout_layout_behavior);
            this.b = hasValue;
            if (hasValue) {
                this.f3230a = b.a(context, attributeSet, obtainStyledAttributes.getString(d.f.a.CoordinatorLayout_Layout_layout_behavior));
            }
            obtainStyledAttributes.recycle();
            AbstractC0097b bVar = this.f3230a;
            if (bVar != null) {
                bVar.c();
            }
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
        }

        public void a(int i2, boolean z) {
            if (i2 == 0) {
                this.j = z;
            } else if (i2 == 1) {
                this.k = z;
            }
        }

        public boolean a(int i2) {
            if (i2 == 0) {
                return this.j;
            }
            if (i2 != 1) {
                return false;
            }
            return this.k;
        }
    }

    public class e implements ViewTreeObserver.OnPreDrawListener {
        public e() {
        }

        public boolean onPreDraw() {
            b bVar = b.this;
            if (bVar != null) {
                p.h(bVar);
                throw null;
            }
            throw null;
        }
    }

    public static class f extends d.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public SparseArray<Parcelable> f3238e;

        public static class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new f[i];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3238e = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f3238e.append(iArr[i], readParcelableArray[i]);
            }
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // d.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3403c, i);
            SparseArray<Parcelable> sparseArray = this.f3238e;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f3238e.keyAt(i2);
                parcelableArr[i2] = this.f3238e.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public static class g implements Comparator<View> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            View view3 = view2;
            float m = p.m(view);
            float z = Build.VERSION.SDK_INT >= 21 ? view3.getZ() : 0.0f;
            if (m > z) {
                return -1;
            }
            return m < z ? 1 : 0;
        }
    }

    static {
        Package r0 = b.class.getPackage();
        n = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            q = new g();
        } else {
            q = null;
        }
    }

    public static AbstractC0097b a(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(n)) {
            str = n + '.' + str;
        }
        try {
            Map<String, Constructor<AbstractC0097b>> map = p.get();
            if (map == null) {
                map = new HashMap<>();
                p.set(map);
            }
            Constructor<AbstractC0097b> constructor = map.get(str);
            if (constructor == null) {
                constructor = context.getClassLoader().loadClass(str).getConstructor(o);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (AbstractC0097b) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException(e.a.a.a.a.b("Could not inflate Behavior subclass ", str), e2);
        }
    }

    public d a(View view) {
        d dVar = (d) view.getLayoutParams();
        if (!dVar.b) {
            if (view instanceof a) {
                AbstractC0097b a2 = ((a) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                AbstractC0097b bVar = dVar.f3230a;
                if (bVar != a2) {
                    if (bVar != null) {
                        bVar.d();
                    }
                    dVar.f3230a = a2;
                    dVar.b = true;
                    if (a2 != null) {
                        a2.c();
                    }
                }
            } else {
                c cVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        AbstractC0097b bVar2 = (AbstractC0097b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        AbstractC0097b bVar3 = dVar.f3230a;
                        if (bVar3 != bVar2) {
                            if (bVar3 != null) {
                                bVar3.d();
                            }
                            dVar.f3230a = bVar2;
                            dVar.b = true;
                            if (bVar2 != null) {
                                bVar2.c();
                            }
                        }
                    } catch (Exception e2) {
                        StringBuilder a3 = e.a.a.a.a.a("Default behavior class ");
                        a3.append(cVar.value().getName());
                        a3.append(" could not be instantiated. Did you forget");
                        a3.append(" a default constructor?");
                        Log.e("CoordinatorLayout", a3.toString(), e2);
                    }
                }
            }
            dVar.b = true;
        }
        return dVar;
    }

    @Override // d.g.l.h
    public void a(View view, int i2) {
        throw null;
    }

    @Override // d.g.l.h
    public void a(View view, View view2, int i2, int i3) {
        throw null;
    }

    @Override // d.g.l.h
    public boolean b(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                AbstractC0097b bVar = dVar.f3230a;
                if (bVar != null) {
                    boolean a2 = bVar.a(this, childAt, view, view2, i2, i3);
                    z |= a2;
                    dVar.a(i3, a2);
                } else {
                    dVar.a(i3, false);
                }
            }
        }
        return z;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        d dVar = (d) view.getLayoutParams();
        AbstractC0097b bVar = dVar.f3230a;
        if (bVar != null) {
            float b = bVar.b();
            if (b > 0.0f) {
                if (this.f3224c == null) {
                    this.f3224c = new Paint();
                }
                this.f3224c.setColor(dVar.f3230a.a());
                Paint paint = this.f3224c;
                int round = Math.round(b * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f3224c);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.l;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        throw null;
    }

    public final y getLastWindowInsets() {
        return this.j;
    }

    public int getNestedScrollAxes() {
        throw null;
    }

    public Drawable getStatusBarBackground() {
        return this.l;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false);
        if (this.i) {
            if (this.f3229h == null) {
                this.f3229h = new e();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3229h);
        }
        if (this.j == null && p.e(this)) {
            if (Build.VERSION.SDK_INT >= 20) {
                requestApplyInsets();
            } else {
                requestFitSystemWindows();
            }
        }
        this.f3226e = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(false);
        if (this.i && this.f3229h != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3229h);
        }
        if (this.f3228g == null) {
            this.f3226e = false;
            return;
        }
        throw null;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.k && this.l != null) {
            y yVar = this.j;
            int d2 = yVar != null ? yVar.d() : 0;
            if (d2 > 0) {
                this.l.setBounds(0, 0, getWidth(), d2);
                this.l.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            a(true);
        }
        motionEvent.getActionMasked();
        throw null;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        p.h(this);
        throw null;
    }

    public void onMeasure(int i2, int i3) {
        throw null;
    }

    @Override // d.g.l.j
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        AbstractC0097b bVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (bVar = dVar.f3230a) != null) {
                    z2 |= bVar.f();
                }
            }
        }
        if (!z2) {
            return z2;
        }
        p.h(this);
        throw null;
    }

    @Override // d.g.l.j
    public boolean onNestedPreFling(View view, float f2, float f3) {
        AbstractC0097b bVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(0) && (bVar = dVar.f3230a) != null) {
                    z |= bVar.g();
                }
            }
        }
        return z;
    }

    @Override // d.g.l.j
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        a(view, i2, i3, iArr, 0);
    }

    @Override // d.g.l.j
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        a(view, i2, i3, i4, i5, 0);
    }

    @Override // d.g.l.j
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f3403c);
        SparseArray<Parcelable> sparseArray = fVar.f3238e;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0097b bVar = a(childAt).f3230a;
            if (!(id == -1 || bVar == null || sparseArray.get(id) == null)) {
                bVar.j();
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable k2;
        f fVar = new f(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC0097b bVar = ((d) childAt.getLayoutParams()).f3230a;
            if (!(id == -1 || bVar == null || (k2 = bVar.k()) == null)) {
                sparseArray.append(id, k2);
            }
        }
        fVar.f3238e = sparseArray;
        return fVar;
    }

    @Override // d.g.l.j
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return b(view, view2, i2, 0);
    }

    @Override // d.g.l.j
    public void onStopNestedScroll(View view) {
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        View view = this.f3227f;
        if (view != null) {
            AbstractC0097b bVar = ((d) view.getLayoutParams()).f3230a;
            boolean m2 = bVar != null ? bVar.m() : false;
            if (this.f3227f == null) {
                m2 |= super.onTouchEvent(motionEvent);
            }
            if (actionMasked == 1 || actionMasked == 3) {
                a(false);
            }
            return m2;
        }
        motionEvent.getActionMasked();
        throw null;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0097b bVar = ((d) view.getLayoutParams()).f3230a;
        if (bVar == null || !bVar.i()) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f3225d) {
            a(false);
            this.f3225d = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        if (Build.VERSION.SDK_INT >= 21) {
            if (p.e(this)) {
                if (this.m == null) {
                    this.m = new a(this);
                }
                p.a(this, this.m);
                setSystemUiVisibility(1280);
                return;
            }
            p.a(this, (l) null);
        }
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.l;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.l = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.l.setState(getDrawableState());
                }
                c.a.a.a.a.a(this.l, p.h(this));
                this.l.setVisible(getVisibility() == 0, false);
                this.l.setCallback(this);
            }
            p.t(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? d.g.e.a.b(getContext(), i2) : null);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.l;
        if (drawable != null && drawable.isVisible() != z) {
            this.l.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.l;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @Override // d.g.l.h
    public void a(View view, int i2, int i3, int[] iArr, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i4) && dVar.f3230a != null) {
                    throw null;
                }
            }
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // d.g.l.h
    public void a(View view, int i2, int i3, int i4, int i5, int i6) {
        AbstractC0097b bVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.a(i6) && (bVar = dVar.f3230a) != null) {
                    bVar.a(this, childAt, view, i2, i3, i4, i5, i6);
                    z = true;
                }
            }
        }
        if (z) {
            p.h(this);
            throw null;
        }
    }

    public final void a(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            AbstractC0097b bVar = ((d) getChildAt(i2).getLayoutParams()).f3230a;
            if (bVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    bVar.e();
                } else {
                    bVar.m();
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((d) getChildAt(i3).getLayoutParams()).i = false;
        }
        this.f3227f = null;
        this.f3225d = false;
    }
}
