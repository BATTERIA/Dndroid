package d.b.o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import d.b.j;
import d.g.l.o;
import d.g.l.p;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f2882a;
    public final i b;

    /* renamed from: c  reason: collision with root package name */
    public int f2883c = -1;

    /* renamed from: d  reason: collision with root package name */
    public r0 f2884d;

    /* renamed from: e  reason: collision with root package name */
    public r0 f2885e;

    /* renamed from: f  reason: collision with root package name */
    public r0 f2886f;

    public e(View view) {
        this.f2882a = view;
        this.b = i.a();
    }

    public void a() {
        Drawable background = this.f2882a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.f2884d != null) {
                if (this.f2886f == null) {
                    this.f2886f = new r0();
                }
                r0 r0Var = this.f2886f;
                PorterDuff.Mode mode = null;
                r0Var.f2976a = null;
                r0Var.f2978d = false;
                r0Var.b = null;
                r0Var.f2977c = false;
                ColorStateList c2 = p.c(this.f2882a);
                if (c2 != null) {
                    r0Var.f2978d = true;
                    r0Var.f2976a = c2;
                }
                View view = this.f2882a;
                if (Build.VERSION.SDK_INT >= 21) {
                    mode = view.getBackgroundTintMode();
                } else if (view instanceof o) {
                    mode = ((o) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    r0Var.f2977c = true;
                    r0Var.b = mode;
                }
                if (r0Var.f2978d || r0Var.f2977c) {
                    i.a(background, r0Var, this.f2882a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            r0 r0Var2 = this.f2885e;
            if (r0Var2 != null) {
                i.a(background, r0Var2, this.f2882a.getDrawableState());
                return;
            }
            r0 r0Var3 = this.f2884d;
            if (r0Var3 != null) {
                i.a(background, r0Var3, this.f2882a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        this.f2883c = i;
        i iVar = this.b;
        a(iVar != null ? iVar.d(this.f2882a.getContext(), i) : null);
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2884d == null) {
                this.f2884d = new r0();
            }
            r0 r0Var = this.f2884d;
            r0Var.f2976a = colorStateList;
            r0Var.f2978d = true;
        } else {
            this.f2884d = null;
        }
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.f2885e == null) {
            this.f2885e = new r0();
        }
        r0 r0Var = this.f2885e;
        r0Var.b = mode;
        r0Var.f2977c = true;
        a();
    }

    public ColorStateList b() {
        r0 r0Var = this.f2885e;
        if (r0Var != null) {
            return r0Var.f2976a;
        }
        return null;
    }

    public void b(ColorStateList colorStateList) {
        if (this.f2885e == null) {
            this.f2885e = new r0();
        }
        r0 r0Var = this.f2885e;
        r0Var.f2976a = colorStateList;
        r0Var.f2978d = true;
        a();
    }

    public PorterDuff.Mode c() {
        r0 r0Var = this.f2885e;
        if (r0Var != null) {
            return r0Var.b;
        }
        return null;
    }

    public void d() {
        this.f2883c = -1;
        a((ColorStateList) null);
        a();
    }

    public void a(AttributeSet attributeSet, int i) {
        t0 a2 = t0.a(this.f2882a.getContext(), attributeSet, j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.e(j.ViewBackgroundHelper_android_background)) {
                this.f2883c = a2.f(j.ViewBackgroundHelper_android_background, -1);
                ColorStateList d2 = this.b.d(this.f2882a.getContext(), this.f2883c);
                if (d2 != null) {
                    a(d2);
                }
            }
            if (a2.e(j.ViewBackgroundHelper_backgroundTint)) {
                p.a(this.f2882a, a2.a(j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.e(j.ViewBackgroundHelper_backgroundTintMode)) {
                p.a(this.f2882a, b0.a(a2.d(j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.b.recycle();
        }
    }
}
