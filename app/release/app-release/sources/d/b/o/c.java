package d.b.o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import d.b.g;
import d.b.n.i.h;
import d.b.n.i.j;
import d.b.n.i.m;
import d.b.n.i.n;
import d.b.n.i.o;
import d.b.n.i.p;
import d.b.n.i.r;
import d.b.n.i.t;
import java.util.ArrayList;

public class c extends d.b.n.i.b {
    public final f A = new f();
    public int B;
    public d k;
    public Drawable l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public int t;
    public final SparseBooleanArray u = new SparseBooleanArray();
    public View v;
    public e w;
    public a x;
    public RunnableC0092c y;
    public b z;

    public class a extends n {
        public a(Context context, t tVar, View view) {
            super(context, tVar, view, false, d.b.a.actionOverflowMenuStyle, 0);
            if (!tVar.B.d()) {
                View view2 = c.this.k;
                this.f2845f = view2 == null ? (View) c.this.j : view2;
            }
            a(c.this.A);
        }

        @Override // d.b.n.i.n
        public void c() {
            c cVar = c.this;
            cVar.x = null;
            cVar.B = 0;
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: d.b.o.c$c  reason: collision with other inner class name */
    public class RunnableC0092c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public e f2867c;

        public RunnableC0092c(e eVar) {
            this.f2867c = eVar;
        }

        public void run() {
            h.a aVar;
            h hVar = c.this.f2783e;
            if (!(hVar == null || (aVar = hVar.f2821e) == null)) {
                aVar.a(hVar);
            }
            View view = (View) c.this.j;
            if (!(view == null || view.getWindowToken() == null || !this.f2867c.d())) {
                c.this.w = this.f2867c;
            }
            c.this.y = null;
        }
    }

    public class d extends m implements ActionMenuView.a {

        public class a extends e0 {
            public a(View view, c cVar) {
                super(view);
            }

            @Override // d.b.o.e0
            public r b() {
                e eVar = c.this.w;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // d.b.o.e0
            public boolean c() {
                c.this.f();
                return true;
            }

            @Override // d.b.o.e0
            public boolean d() {
                c cVar = c.this;
                if (cVar.y != null) {
                    return false;
                }
                cVar.c();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, d.b.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c.a.a.a.a.a((View) this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.f();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                c.a.a.a.a.a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends n {
        public e(Context context, h hVar, View view, boolean z) {
            super(context, hVar, view, z, d.b.a.actionOverflowMenuStyle, 0);
            this.f2846g = 8388613;
            a(c.this.A);
        }

        @Override // d.b.n.i.n
        public void c() {
            h hVar = c.this.f2783e;
            if (hVar != null) {
                hVar.a(true);
            }
            c.this.w = null;
            super.c();
        }
    }

    public c(Context context) {
        super(context, g.abc_action_menu_layout, g.abc_action_menu_item_layout);
    }

    @Override // d.b.n.i.b
    public View a(j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.c()) {
            actionView = super.a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public boolean a() {
        return c() | d();
    }

    @Override // d.b.n.i.o
    public boolean b() {
        int i;
        ArrayList<j> arrayList;
        int i2;
        boolean z2;
        h hVar = this.f2783e;
        boolean z3 = false;
        if (hVar != null) {
            arrayList = hVar.d();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.r;
        int i4 = this.q;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.j;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= i) {
                break;
            }
            j jVar = arrayList.get(i5);
            if ((jVar.y & 2) == 2) {
                i7++;
            } else if ((jVar.y & 1) == 1) {
                i6++;
            } else {
                z4 = true;
            }
            if (this.s && jVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.n && (z4 || i6 + i7 > i3)) {
            i3--;
        }
        int i8 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.u;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < i) {
            j jVar2 = arrayList.get(i9);
            if ((jVar2.y & i2) == i2) {
                View a2 = a(jVar2, this.v, viewGroup);
                if (this.v == null) {
                    this.v = a2;
                }
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i11 = jVar2.b;
                if (i11 != 0) {
                    sparseBooleanArray.put(i11, z2);
                }
                jVar2.b(z2);
            } else {
                int i12 = jVar2.y;
                int i13 = z2 ? 1 : 0;
                char c2 = z2 ? 1 : 0;
                char c3 = z2 ? 1 : 0;
                if ((i12 & i13) == z2) {
                    int i14 = jVar2.b;
                    boolean z5 = sparseBooleanArray.get(i14);
                    boolean z6 = (i8 > 0 || z5) && i4 > 0;
                    if (z6) {
                        View a3 = a(jVar2, this.v, viewGroup);
                        if (this.v == null) {
                            this.v = a3;
                        }
                        a3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a3.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z6 &= i4 + i10 > 0;
                    }
                    if (z6 && i14 != 0) {
                        sparseBooleanArray.put(i14, z2);
                    } else if (z5) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i9; i15++) {
                            j jVar3 = arrayList.get(i15);
                            if (jVar3.b == i14) {
                                if (jVar3.d()) {
                                    i8++;
                                }
                                jVar3.b(false);
                            }
                        }
                    }
                    if (z6) {
                        i8--;
                    }
                    jVar2.b(z6);
                    z3 = false;
                } else {
                    jVar2.b(z3);
                }
            }
            i9++;
            i2 = 2;
            z2 = true;
        }
        return true;
    }

    public boolean c() {
        p pVar;
        RunnableC0092c cVar = this.y;
        if (cVar == null || (pVar = this.j) == null) {
            e eVar = this.w;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.j.dismiss();
            }
            return true;
        }
        ((View) pVar).removeCallbacks(cVar);
        this.y = null;
        return true;
    }

    public boolean d() {
        a aVar = this.x;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.j.dismiss();
        return true;
    }

    public boolean e() {
        e eVar = this.w;
        return eVar != null && eVar.b();
    }

    public boolean f() {
        h hVar;
        if (!this.n || e() || (hVar = this.f2783e) == null || this.j == null || this.y != null) {
            return false;
        }
        hVar.a();
        if (hVar.j.isEmpty()) {
            return false;
        }
        RunnableC0092c cVar = new RunnableC0092c(new e(this.f2782d, this.f2783e, this.k, true));
        this.y = cVar;
        ((View) this.j).post(cVar);
        super.a((t) null);
        return true;
    }

    public class f implements o.a {
        public f() {
        }

        @Override // d.b.n.i.o.a
        public void a(h hVar, boolean z) {
            if (hVar instanceof t) {
                hVar.c().a(false);
            }
            o.a aVar = c.this.f2785g;
            if (aVar != null) {
                aVar.a(hVar, z);
            }
        }

        @Override // d.b.n.i.o.a
        public boolean a(h hVar) {
            if (hVar == null) {
                return false;
            }
            c.this.B = ((t) hVar).B.getItemId();
            o.a aVar = c.this.f2785g;
            if (aVar != null) {
                return aVar.a(hVar);
            }
            return false;
        }
    }

    @Override // d.b.n.i.o
    public void a(Context context, h hVar) {
        this.f2782d = context;
        LayoutInflater.from(context);
        this.f2783e = hVar;
        Resources resources = context.getResources();
        if (!this.o) {
            this.n = true;
        }
        int i = 2;
        this.p = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.r = i;
        int i4 = this.p;
        if (this.n) {
            if (this.k == null) {
                d dVar = new d(this.f2781c);
                this.k = dVar;
                if (this.m) {
                    dVar.setImageDrawable(this.l);
                    this.l = null;
                    this.m = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.k.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.k.getMeasuredWidth();
        } else {
            this.k = null;
        }
        this.q = i4;
        this.t = (int) (resources.getDisplayMetrics().density * 56.0f);
        this.v = null;
    }

    @Override // d.b.n.i.o
    public void a(h hVar, boolean z2) {
        a();
        o.a aVar = this.f2785g;
        if (aVar != null) {
            aVar.a(hVar, z2);
        }
    }

    @Override // d.b.n.i.b, d.b.n.i.o
    public boolean a(t tVar) {
        boolean z2 = false;
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        t tVar2 = tVar;
        while (true) {
            h hVar = tVar2.A;
            if (hVar == this.f2783e) {
                break;
            }
            tVar2 = (t) hVar;
        }
        j jVar = tVar2.B;
        ViewGroup viewGroup = (ViewGroup) this.j;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof p.a) && ((p.a) childAt).getItemData() == jVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        tVar.B.getItemId();
        int size = tVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = tVar.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i2++;
        }
        a aVar = new a(this.f2782d, tVar, view);
        this.x = aVar;
        aVar.f2847h = z2;
        m mVar = aVar.j;
        if (mVar != null) {
            mVar.b(z2);
        }
        if (this.x.d()) {
            o.a aVar2 = this.f2785g;
            if (aVar2 != null) {
                aVar2.a(tVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    @Override // d.b.n.i.b, d.b.n.i.o
    public void a(boolean z2) {
        ArrayList<j> arrayList;
        p pVar;
        super.a(z2);
        ((View) this.j).requestLayout();
        h hVar = this.f2783e;
        boolean z3 = false;
        if (hVar != null) {
            hVar.a();
            ArrayList<j> arrayList2 = hVar.i;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                d.g.l.b bVar = arrayList2.get(i).A;
            }
        }
        h hVar2 = this.f2783e;
        if (hVar2 != null) {
            hVar2.a();
            arrayList = hVar2.j;
        } else {
            arrayList = null;
        }
        if (this.n && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size2 > 0) {
                z3 = true;
            }
        }
        d dVar = this.k;
        if (z3) {
            if (dVar == null) {
                this.k = new d(this.f2781c);
            }
            ViewGroup viewGroup = (ViewGroup) this.k.getParent();
            if (viewGroup != this.j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.j;
                d dVar2 = this.k;
                ActionMenuView.c generateDefaultLayoutParams = actionMenuView.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f2298c = true;
                actionMenuView.addView(dVar2, generateDefaultLayoutParams);
            }
        } else if (dVar != null && dVar.getParent() == (pVar = this.j)) {
            ((ViewGroup) pVar).removeView(this.k);
        }
        ((ActionMenuView) this.j).setOverflowReserved(this.n);
    }
}
