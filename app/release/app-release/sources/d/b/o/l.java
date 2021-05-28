package d.b.o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import d.b.j;
import d.b.l.a.a;
import d.g.m.f;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f2935a;
    public r0 b;

    /* renamed from: c  reason: collision with root package name */
    public r0 f2936c;

    public l(ImageView imageView) {
        this.f2935a = imageView;
    }

    public void a() {
        Drawable drawable = this.f2935a.getDrawable();
        if (drawable != null) {
            b0.b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f2936c == null) {
                    this.f2936c = new r0();
                }
                r0 r0Var = this.f2936c;
                PorterDuff.Mode mode = null;
                r0Var.f2976a = null;
                r0Var.f2978d = false;
                r0Var.b = null;
                r0Var.f2977c = false;
                ImageView imageView = this.f2935a;
                ColorStateList imageTintList = Build.VERSION.SDK_INT >= 21 ? imageView.getImageTintList() : imageView instanceof f ? ((f) imageView).getSupportImageTintList() : null;
                if (imageTintList != null) {
                    r0Var.f2978d = true;
                    r0Var.f2976a = imageTintList;
                }
                ImageView imageView2 = this.f2935a;
                if (Build.VERSION.SDK_INT >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof f) {
                    mode = ((f) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    r0Var.f2977c = true;
                    r0Var.b = mode;
                }
                if (r0Var.f2978d || r0Var.f2977c) {
                    i.a(drawable, r0Var, this.f2935a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            r0 r0Var2 = this.b;
            if (r0Var2 != null) {
                i.a(drawable, r0Var2, this.f2935a.getDrawableState());
            }
        }
    }

    public void a(int i) {
        if (i != 0) {
            Drawable c2 = a.c(this.f2935a.getContext(), i);
            if (c2 != null) {
                b0.b(c2);
            }
            this.f2935a.setImageDrawable(c2);
        } else {
            this.f2935a.setImageDrawable(null);
        }
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (this.b == null) {
            this.b = new r0();
        }
        r0 r0Var = this.b;
        r0Var.f2976a = colorStateList;
        r0Var.f2978d = true;
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.b == null) {
            this.b = new r0();
        }
        r0 r0Var = this.b;
        r0Var.b = mode;
        r0Var.f2977c = true;
        a();
    }

    public boolean b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f2935a.getBackground() instanceof RippleDrawable);
    }

    public void a(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int f2;
        t0 a2 = t0.a(this.f2935a.getContext(), attributeSet, j.AppCompatImageView, i, 0);
        try {
            Drawable drawable3 = this.f2935a.getDrawable();
            if (!(drawable3 != null || (f2 = a2.f(j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable3 = a.c(this.f2935a.getContext(), f2)) == null)) {
                this.f2935a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                b0.b(drawable3);
            }
            if (a2.e(j.AppCompatImageView_tint)) {
                ImageView imageView = this.f2935a;
                ColorStateList a3 = a2.a(j.AppCompatImageView_tint);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView.setImageTintList(a3);
                    if (!(Build.VERSION.SDK_INT != 21 || (drawable2 = imageView.getDrawable()) == null || imageView.getImageTintList() == null)) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView.getDrawableState());
                        }
                        imageView.setImageDrawable(drawable2);
                    }
                } else if (imageView instanceof f) {
                    ((f) imageView).setSupportImageTintList(a3);
                }
            }
            if (a2.e(j.AppCompatImageView_tintMode)) {
                ImageView imageView2 = this.f2935a;
                PorterDuff.Mode a4 = b0.a(a2.d(j.AppCompatImageView_tintMode, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView2.setImageTintMode(a4);
                    if (!(Build.VERSION.SDK_INT != 21 || (drawable = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable);
                    }
                } else if (imageView2 instanceof f) {
                    ((f) imageView2).setSupportImageTintMode(a4);
                }
            }
        } finally {
            a2.b.recycle();
        }
    }
}
