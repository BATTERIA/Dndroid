package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import d.b.n.i.h;
import d.b.n.i.j;
import d.b.n.i.p;
import d.b.n.i.r;
import d.b.o.c;
import d.b.o.e0;
import d.b.o.x;

public class ActionMenuItemView extends x implements p.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f  reason: collision with root package name */
    public j f2271f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2272g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f2273h;
    public h.b i;
    public e0 j;
    public b k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;

    public class a extends e0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // d.b.o.e0
        public r b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.k;
            if (bVar == null || (aVar = c.this.x) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // d.b.o.e0
        public boolean c() {
            r b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            h.b bVar = actionMenuItemView.i;
            return bVar != null && bVar.a(actionMenuItemView.f2271f) && (b = b()) != null && b.c();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.b.j.ActionMenuItemView, i2, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(d.b.j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    @Override // d.b.n.i.p.a
    public void a(j jVar, int i2) {
        CharSequence charSequence;
        this.f2271f = jVar;
        setIcon(jVar.getIcon());
        if (c()) {
            charSequence = jVar.getTitleCondensed();
        } else {
            charSequence = jVar.f2831e;
        }
        setTitle(charSequence);
        setId(jVar.f2828a);
        setVisibility(jVar.isVisible() ? 0 : 8);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d() && this.f2271f.getIcon() == null;
    }

    @Override // d.b.n.i.p.a
    public boolean c() {
        return true;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2272g);
        if (this.f2273h != null) {
            if (!((this.f2271f.y & 4) == 4) || (!this.l && !this.m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.f2272g : null);
        CharSequence charSequence2 = this.f2271f.q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f2271f.f2831e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f2271f.r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.f2271f.f2831e;
            }
            c.a.a.a.a.a((View) this, charSequence);
            return;
        }
        c.a.a.a.a.a((View) this, charSequence3);
    }

    @Override // d.b.n.i.p.a
    public j getItemData() {
        return this.f2271f;
    }

    public void onClick(View view) {
        h.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f2271f);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = e();
        f();
    }

    @Override // d.b.o.x
    public void onMeasure(int i2, int i3) {
        int i4;
        boolean d2 = d();
        if (d2 && (i4 = this.o) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.n) : this.n;
        if (mode != 1073741824 && this.n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!d2 && this.f2273h != null) {
            super.setPadding((getMeasuredWidth() - this.f2273h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        if (!this.f2271f.hasSubMenu() || (e0Var = this.j) == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m != z) {
            this.m = z;
            j jVar = this.f2271f;
            if (jVar != null) {
                jVar.n.h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2273h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.p;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.p;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(h.b bVar) {
        this.i = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.o = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2272g = charSequence;
        f();
    }
}
