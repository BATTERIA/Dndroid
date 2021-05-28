package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import d.b.k.a;
import d.b.n.i.h;
import d.b.n.i.j;
import d.b.n.i.o;
import d.b.n.i.t;
import d.b.o.a0;
import d.b.o.a1;
import d.b.o.k;
import d.b.o.l0;
import d.b.o.m;
import d.b.o.t0;
import d.b.o.u0;
import d.b.o.w0;
import d.b.o.x;
import d.g.l.p;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    public CharSequence A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public final ArrayList<View> F;
    public final ArrayList<View> G;
    public final int[] H;
    public e I;
    public final ActionMenuView.e J;
    public w0 K;
    public d.b.o.c L;
    public c M;
    public boolean N;
    public final Runnable O;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f2340c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f2341d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f2342e;

    /* renamed from: f  reason: collision with root package name */
    public ImageButton f2343f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f2344g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2345h;
    public CharSequence i;
    public ImageButton j;
    public View k;
    public Context l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public l0 v;
    public int w;
    public int x;
    public int y;
    public CharSequence z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.f();
        }
    }

    public class c implements o {

        /* renamed from: c  reason: collision with root package name */
        public h f2348c;

        /* renamed from: d  reason: collision with root package name */
        public j f2349d;

        public c() {
        }

        @Override // d.b.n.i.o
        public void a(Context context, h hVar) {
            j jVar;
            h hVar2 = this.f2348c;
            if (!(hVar2 == null || (jVar = this.f2349d) == null)) {
                hVar2.a(jVar);
            }
            this.f2348c = hVar;
        }

        @Override // d.b.n.i.o
        public void a(h hVar, boolean z) {
        }

        @Override // d.b.n.i.o
        public void a(o.a aVar) {
        }

        @Override // d.b.n.i.o
        public void a(boolean z) {
            if (this.f2349d != null) {
                h hVar = this.f2348c;
                boolean z2 = false;
                if (hVar != null) {
                    int size = hVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f2348c.getItem(i) == this.f2349d) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    a(this.f2348c, this.f2349d);
                }
            }
        }

        @Override // d.b.n.i.o
        public boolean a(h hVar, j jVar) {
            View view = Toolbar.this.k;
            if (view instanceof d.b.n.b) {
                ((d.b.n.b) view).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.k);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.j);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.k = null;
            int size = toolbar3.G.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.G.get(size));
                } else {
                    toolbar3.G.clear();
                    this.f2349d = null;
                    Toolbar.this.requestLayout();
                    jVar.C = false;
                    jVar.n.b(false);
                    return true;
                }
            }
        }

        @Override // d.b.n.i.o
        public boolean a(t tVar) {
            return false;
        }

        @Override // d.b.n.i.o
        public boolean b() {
            return false;
        }

        @Override // d.b.n.i.o
        public boolean b(h hVar, j jVar) {
            Toolbar toolbar = Toolbar.this;
            if (toolbar.j == null) {
                k kVar = new k(toolbar.getContext(), null, d.b.a.toolbarNavigationButtonStyle);
                toolbar.j = kVar;
                kVar.setImageDrawable(toolbar.f2345h);
                toolbar.j.setContentDescription(toolbar.i);
                d generateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f2648a = (toolbar.p & d.b.j.AppCompatTheme_windowActionBarOverlay) | 8388611;
                generateDefaultLayoutParams.b = 2;
                toolbar.j.setLayoutParams(generateDefaultLayoutParams);
                toolbar.j.setOnClickListener(new u0(toolbar));
            }
            ViewParent parent = Toolbar.this.j.getParent();
            Toolbar toolbar2 = Toolbar.this;
            if (parent != toolbar2) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar2.j);
                }
                Toolbar toolbar3 = Toolbar.this;
                toolbar3.addView(toolbar3.j);
            }
            Toolbar.this.k = jVar.getActionView();
            this.f2349d = jVar;
            ViewParent parent2 = Toolbar.this.k.getParent();
            Toolbar toolbar4 = Toolbar.this;
            if (parent2 != toolbar4) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar4.k);
                }
                d generateDefaultLayoutParams2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar5 = Toolbar.this;
                generateDefaultLayoutParams2.f2648a = 8388611 | (toolbar5.p & d.b.j.AppCompatTheme_windowActionBarOverlay);
                generateDefaultLayoutParams2.b = 2;
                toolbar5.k.setLayoutParams(generateDefaultLayoutParams2);
                Toolbar toolbar6 = Toolbar.this;
                toolbar6.addView(toolbar6.k);
            }
            Toolbar toolbar7 = Toolbar.this;
            int childCount = toolbar7.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar7.getChildAt(childCount);
                if (!(((d) childAt.getLayoutParams()).b == 2 || childAt == toolbar7.f2340c)) {
                    toolbar7.removeViewAt(childCount);
                    toolbar7.G.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            jVar.C = true;
            jVar.n.b(false);
            View view = Toolbar.this.k;
            if (view instanceof d.b.n.b) {
                ((d.b.n.b) view).a();
            }
            return true;
        }
    }

    public static class d extends a.C0086a {
        public int b = 0;

        public d(int i, int i2) {
            super(i, i2);
            this.f2648a = 8388627;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public d(d dVar) {
            super((a.C0086a) dVar);
            this.b = dVar.b;
        }

        public d(a.C0086a aVar) {
            super(aVar);
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class f extends d.i.a.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f2351e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2352f;

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
            this.f2351e = parcel.readInt();
            this.f2352f = parcel.readInt() != 0;
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // d.i.a.a
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f3403c, i);
            parcel.writeInt(this.f2351e);
            parcel.writeInt(this.f2352f ? 1 : 0);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.b.a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.y = 8388627;
        this.F = new ArrayList<>();
        this.G = new ArrayList<>();
        this.H = new int[2];
        this.J = new a();
        this.O = new b();
        t0 a2 = t0.a(getContext(), attributeSet, d.b.j.Toolbar, i2, 0);
        this.n = a2.f(d.b.j.Toolbar_titleTextAppearance, 0);
        this.o = a2.f(d.b.j.Toolbar_subtitleTextAppearance, 0);
        this.y = a2.b.getInteger(d.b.j.Toolbar_android_gravity, this.y);
        this.p = a2.b.getInteger(d.b.j.Toolbar_buttonGravity, 48);
        int b2 = a2.b(d.b.j.Toolbar_titleMargin, 0);
        b2 = a2.e(d.b.j.Toolbar_titleMargins) ? a2.b(d.b.j.Toolbar_titleMargins, b2) : b2;
        this.u = b2;
        this.t = b2;
        this.s = b2;
        this.r = b2;
        int b3 = a2.b(d.b.j.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.r = b3;
        }
        int b4 = a2.b(d.b.j.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.s = b4;
        }
        int b5 = a2.b(d.b.j.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.t = b5;
        }
        int b6 = a2.b(d.b.j.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.u = b6;
        }
        this.q = a2.c(d.b.j.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(d.b.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b8 = a2.b(d.b.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c2 = a2.c(d.b.j.Toolbar_contentInsetLeft, 0);
        int c3 = a2.c(d.b.j.Toolbar_contentInsetRight, 0);
        a();
        l0 l0Var = this.v;
        l0Var.f2943h = false;
        if (c2 != Integer.MIN_VALUE) {
            l0Var.f2940e = c2;
            l0Var.f2937a = c2;
        }
        if (c3 != Integer.MIN_VALUE) {
            l0Var.f2941f = c3;
            l0Var.b = c3;
        }
        if (!(b7 == Integer.MIN_VALUE && b8 == Integer.MIN_VALUE)) {
            this.v.a(b7, b8);
        }
        this.w = a2.b(d.b.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.x = a2.b(d.b.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f2345h = a2.b(d.b.j.Toolbar_collapseIcon);
        this.i = a2.d(d.b.j.Toolbar_collapseContentDescription);
        CharSequence d2 = a2.d(d.b.j.Toolbar_title);
        if (!TextUtils.isEmpty(d2)) {
            setTitle(d2);
        }
        CharSequence d3 = a2.d(d.b.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(d3)) {
            setSubtitle(d3);
        }
        this.l = getContext();
        setPopupTheme(a2.f(d.b.j.Toolbar_popupTheme, 0));
        Drawable b9 = a2.b(d.b.j.Toolbar_navigationIcon);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence d4 = a2.d(d.b.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(d4)) {
            setNavigationContentDescription(d4);
        }
        Drawable b10 = a2.b(d.b.j.Toolbar_logo);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence d5 = a2.d(d.b.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(d5)) {
            setLogoDescription(d5);
        }
        if (a2.e(d.b.j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(d.b.j.Toolbar_titleTextColor, -1));
        }
        if (a2.e(d.b.j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(d.b.j.Toolbar_subtitleTextColor, -1));
        }
        a2.b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new d.b.n.f(getContext());
    }

    public final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int a(View view, int i2, int[] iArr, int i3) {
        d dVar = (d) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) dVar).leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) dVar).rightMargin + max;
    }

    public final void a() {
        if (this.v == null) {
            this.v = new l0();
        }
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void a(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        d generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (d) layoutParams;
        generateDefaultLayoutParams.b = 1;
        if (!z2 || this.k == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.G.add(view);
    }

    public final void a(List<View> list, int i2) {
        boolean z2 = p.h(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                d dVar = (d) childAt.getLayoutParams();
                if (dVar.b == 0 && d(childAt) && a(dVar.f2648a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            d dVar2 = (d) childAt2.getLayoutParams();
            if (dVar2.b == 0 && d(childAt2) && a(dVar2.f2648a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int b(View view, int i2, int[] iArr, int i3) {
        d dVar = (d) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) dVar).rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) dVar).leftMargin);
    }

    public final void b() {
        c();
        ActionMenuView actionMenuView = this.f2340c;
        if (actionMenuView.r == null) {
            h hVar = (h) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new c();
            }
            this.f2340c.setExpandedActionViewsExclusive(true);
            hVar.a(this.M, this.l);
        }
    }

    public final void c() {
        if (this.f2340c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f2340c = actionMenuView;
            actionMenuView.setPopupTheme(this.m);
            this.f2340c.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f2340c;
            actionMenuView2.w = null;
            actionMenuView2.x = null;
            d generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2648a = 8388613 | (this.p & d.b.j.AppCompatTheme_windowActionBarOverlay);
            this.f2340c.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.f2340c, false);
        }
    }

    public final boolean c(View view) {
        return view.getParent() == this || this.G.contains(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof d);
    }

    public final void d() {
        if (this.f2343f == null) {
            this.f2343f = new k(getContext(), null, d.b.a.toolbarNavigationButtonStyle);
            d generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2648a = 8388611 | (this.p & d.b.j.AppCompatTheme_windowActionBarOverlay);
            this.f2343f.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public final boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean e() {
        ActionMenuView actionMenuView = this.f2340c;
        if (actionMenuView != null) {
            d.b.o.c cVar = actionMenuView.v;
            if (cVar != null && cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        ActionMenuView actionMenuView = this.f2340c;
        if (actionMenuView != null) {
            d.b.o.c cVar = actionMenuView.v;
            if (cVar != null && cVar.f()) {
                return true;
            }
        }
        return false;
    }

    public d generateDefaultLayoutParams() {
        return new d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public d generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof a.C0086a ? new d((a.C0086a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    public int getContentInsetEnd() {
        l0 l0Var = this.v;
        if (l0Var != null) {
            return l0Var.f2942g ? l0Var.f2937a : l0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.x;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        l0 l0Var = this.v;
        if (l0Var != null) {
            return l0Var.f2937a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        l0 l0Var = this.v;
        if (l0Var != null) {
            return l0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        l0 l0Var = this.v;
        if (l0Var != null) {
            return l0Var.f2942g ? l0Var.b : l0Var.f2937a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        h hVar;
        ActionMenuView actionMenuView = this.f2340c;
        return actionMenuView != null && (hVar = actionMenuView.r) != null && hVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.x, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return p.h(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return p.h(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f2344g;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f2344g;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        b();
        return this.f2340c.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f2343f;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f2343f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public d.b.o.c getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        b();
        return this.f2340c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.l;
    }

    public int getPopupTheme() {
        return this.m;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    public CharSequence getTitle() {
        return this.z;
    }

    public int getTitleMarginBottom() {
        return this.u;
    }

    public int getTitleMarginEnd() {
        return this.s;
    }

    public int getTitleMarginStart() {
        return this.r;
    }

    public int getTitleMarginTop() {
        return this.t;
    }

    public a0 getWrapper() {
        if (this.K == null) {
            this.K = new w0(this, true);
        }
        return this.K;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.E = false;
        }
        if (!this.E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.E = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.E = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0295 A[LOOP:0: B:106:0x0293->B:107:0x0295, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b7 A[LOOP:1: B:109:0x02b5->B:110:0x02b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02dc A[LOOP:2: B:112:0x02da->B:113:0x02dc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x032e A[LOOP:3: B:120:0x032c->B:121:0x032e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
        // Method dump skipped, instructions count: 835
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.H;
        boolean z2 = true;
        int i11 = 0;
        if (a1.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (d(this.f2343f)) {
            a(this.f2343f, i2, 0, i3, 0, this.q);
            i6 = a(this.f2343f) + this.f2343f.getMeasuredWidth();
            i5 = Math.max(0, b(this.f2343f) + this.f2343f.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.f2343f.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (d(this.j)) {
            a(this.j, i2, 0, i3, 0, this.q);
            i6 = a(this.j) + this.j.getMeasuredWidth();
            i5 = Math.max(i5, b(this.j) + this.j.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (d(this.f2340c)) {
            a(this.f2340c, i2, max, i3, 0, this.q);
            i7 = a(this.f2340c) + this.f2340c.getMeasuredWidth();
            i5 = Math.max(i5, b(this.f2340c) + this.f2340c.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f2340c.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (d(this.k)) {
            max2 += a(this.k, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, b(this.k) + this.k.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.k.getMeasuredState());
        }
        if (d(this.f2344g)) {
            max2 += a(this.f2344g, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, b(this.f2344g) + this.f2344g.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f2344g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((d) childAt.getLayoutParams()).b == 0 && d(childAt)) {
                max2 += a(childAt, i2, max2, i3, 0, iArr);
                i5 = Math.max(i5, b(childAt) + childAt.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, childAt.getMeasuredState());
            }
        }
        int i13 = this.t + this.u;
        int i14 = this.r + this.s;
        if (d(this.f2341d)) {
            a(this.f2341d, i2, max2 + i14, i3, i13, iArr);
            int a2 = a(this.f2341d) + this.f2341d.getMeasuredWidth();
            i8 = b(this.f2341d) + this.f2341d.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.f2341d.getMeasuredState());
            i9 = a2;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (d(this.f2342e)) {
            i9 = Math.max(i9, a(this.f2342e, i2, max2 + i14, i3, i8 + i13, iArr));
            i8 = b(this.f2342e) + this.f2342e.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.f2342e.getMeasuredState());
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.N) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (d(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f3403c);
        ActionMenuView actionMenuView = this.f2340c;
        h hVar = actionMenuView != null ? actionMenuView.r : null;
        int i2 = fVar.f2351e;
        if (!(i2 == 0 || this.M == null || hVar == null || (findItem = hVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (fVar.f2352f) {
            removeCallbacks(this.O);
            post(this.O);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.a()
            d.b.o.l0 r0 = r2.v
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f2942g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f2942g = r1
            boolean r3 = r0.f2943h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f2939d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.f2940e
        L_0x0023:
            r0.f2937a = r1
            int r1 = r0.f2938c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.f2938c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.f2940e
        L_0x0031:
            r0.f2937a = r1
            int r1 = r0.f2939d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.f2940e
            r0.f2937a = r3
        L_0x003c:
            int r1 = r0.f2941f
        L_0x003e:
            r0.b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        j jVar;
        f fVar = new f(super.onSaveInstanceState());
        c cVar = this.M;
        if (!(cVar == null || (jVar = cVar.f2349d) == null)) {
            fVar.f2351e = jVar.f2828a;
        }
        fVar.f2352f = e();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.D = false;
        }
        if (!this.D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    public void setCollapsible(boolean z2) {
        this.N = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.x) {
            this.x = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.w) {
            this.w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(d.b.l.a.a.c(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2344g == null) {
                this.f2344g = new m(getContext(), null, 0);
            }
            if (!c(this.f2344g)) {
                a((View) this.f2344g, true);
            }
        } else {
            ImageView imageView = this.f2344g;
            if (imageView != null && c(imageView)) {
                removeView(this.f2344g);
                this.G.remove(this.f2344g);
            }
        }
        ImageView imageView2 = this.f2344g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2344g == null) {
            this.f2344g = new m(getContext(), null, 0);
        }
        ImageView imageView = this.f2344g;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            d();
        }
        ImageButton imageButton = this.f2343f;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(d.b.l.a.a.c(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            d();
            if (!c(this.f2343f)) {
                a((View) this.f2343f, true);
            }
        } else {
            ImageButton imageButton = this.f2343f;
            if (imageButton != null && c(imageButton)) {
                removeView(this.f2343f);
                this.G.remove(this.f2343f);
            }
        }
        ImageButton imageButton2 = this.f2343f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        d();
        this.f2343f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.I = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        b();
        this.f2340c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.m != i2) {
            this.m = i2;
            if (i2 == 0) {
                this.l = getContext();
            } else {
                this.l = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2342e == null) {
                Context context = getContext();
                x xVar = new x(context);
                this.f2342e = xVar;
                xVar.setSingleLine();
                this.f2342e.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.o;
                if (i2 != 0) {
                    this.f2342e.setTextAppearance(context, i2);
                }
                int i3 = this.C;
                if (i3 != 0) {
                    this.f2342e.setTextColor(i3);
                }
            }
            if (!c(this.f2342e)) {
                a((View) this.f2342e, true);
            }
        } else {
            TextView textView = this.f2342e;
            if (textView != null && c(textView)) {
                removeView(this.f2342e);
                this.G.remove(this.f2342e);
            }
        }
        TextView textView2 = this.f2342e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        this.C = i2;
        TextView textView = this.f2342e;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2341d == null) {
                Context context = getContext();
                x xVar = new x(context);
                this.f2341d = xVar;
                xVar.setSingleLine();
                this.f2341d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.n;
                if (i2 != 0) {
                    this.f2341d.setTextAppearance(context, i2);
                }
                int i3 = this.B;
                if (i3 != 0) {
                    this.f2341d.setTextColor(i3);
                }
            }
            if (!c(this.f2341d)) {
                a((View) this.f2341d, true);
            }
        } else {
            TextView textView = this.f2341d;
            if (textView != null && c(textView)) {
                removeView(this.f2341d);
                this.G.remove(this.f2341d);
            }
        }
        TextView textView2 = this.f2341d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.s = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.r = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        this.B = i2;
        TextView textView = this.f2341d;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public final int a(int i2) {
        int h2 = p.h(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, h2) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return h2 == 1 ? 5 : 3;
    }

    public final int a(View view, int i2) {
        d dVar = (d) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = dVar.f2648a & d.b.j.AppCompatTheme_windowActionBarOverlay;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.y & d.b.j.AppCompatTheme_windowActionBarOverlay;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) dVar).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }
}
