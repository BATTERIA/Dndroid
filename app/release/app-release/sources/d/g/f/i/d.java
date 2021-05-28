package d.g.f.i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class d extends c {
    public static Method j;

    public d(Drawable drawable) {
        super(drawable);
        c();
    }

    public d(e eVar, Resources resources) {
        super(eVar, resources);
        c();
    }

    @Override // d.g.f.i.c
    public boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f3278h;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void c() {
        if (j == null) {
            try {
                j = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    public Rect getDirtyBounds() {
        return this.f3278h.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f3278h.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f3278h;
        if (!(drawable == null || (method = j) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.f3278h.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f3278h.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // d.g.f.i.c
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // d.g.f.i.c, d.g.f.i.a
    public void setTint(int i) {
        if (b()) {
            super.setTint(i);
        } else {
            this.f3278h.setTint(i);
        }
    }

    @Override // d.g.f.i.c, d.g.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        if (b()) {
            this.f3276f.f3280c = colorStateList;
            a(getState());
            return;
        }
        this.f3278h.setTintList(colorStateList);
    }

    @Override // d.g.f.i.c, d.g.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.f3276f.f3281d = mode;
            a(getState());
            return;
        }
        this.f3278h.setTintMode(mode);
    }
}
