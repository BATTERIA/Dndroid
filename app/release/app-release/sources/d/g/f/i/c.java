package d.g.f.i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class c extends Drawable implements Drawable.Callback, b, a {
    public static final PorterDuff.Mode i = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public int f3273c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f3274d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3275e;

    /* renamed from: f  reason: collision with root package name */
    public e f3276f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3277g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3278h;

    public c(Drawable drawable) {
        this.f3276f = new e(this.f3276f);
        a(drawable);
    }

    @Override // d.g.f.i.b
    public final Drawable a() {
        return this.f3278h;
    }

    @Override // d.g.f.i.b
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f3278h;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3278h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            e eVar = this.f3276f;
            if (eVar != null) {
                eVar.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        e eVar = this.f3276f;
        ColorStateList colorStateList = eVar.f3280c;
        PorterDuff.Mode mode = eVar.f3281d;
        if (colorStateList == null || mode == null) {
            this.f3275e = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f3275e && colorForState == this.f3273c && mode == this.f3274d)) {
                setColorFilter(colorForState, mode);
                this.f3273c = colorForState;
                this.f3274d = mode;
                this.f3275e = true;
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f3278h.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        e eVar = this.f3276f;
        return changingConfigurations | (eVar != null ? eVar.getChangingConfigurations() : 0) | this.f3278h.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        e eVar = this.f3276f;
        if (eVar == null) {
            return null;
        }
        if (!(eVar.b != null)) {
            return null;
        }
        this.f3276f.f3279a = getChangingConfigurations();
        return this.f3276f;
    }

    public Drawable getCurrent() {
        return this.f3278h.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3278h.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3278h.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3278h.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3278h.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3278h.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f3278h.getPadding(rect);
    }

    public int[] getState() {
        return this.f3278h.getState();
    }

    public Region getTransparentRegion() {
        return this.f3278h.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f3278h.isAutoMirrored();
    }

    public boolean isStateful() {
        e eVar;
        ColorStateList colorStateList = (!b() || (eVar = this.f3276f) == null) ? null : eVar.f3280c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f3278h.isStateful();
    }

    public void jumpToCurrentState() {
        this.f3278h.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f3277g && super.mutate() == this) {
            this.f3276f = new e(this.f3276f);
            Drawable drawable = this.f3278h;
            if (drawable != null) {
                drawable.mutate();
            }
            e eVar = this.f3276f;
            if (eVar != null) {
                Drawable drawable2 = this.f3278h;
                eVar.b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f3277g = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3278h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        return this.f3278h.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i2) {
        this.f3278h.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z) {
        this.f3278h.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i2) {
        this.f3278h.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3278h.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3278h.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3278h.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return a(iArr) || this.f3278h.setState(iArr);
    }

    @Override // d.g.f.i.a
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // d.g.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        this.f3276f.f3280c = colorStateList;
        a(getState());
    }

    @Override // d.g.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f3276f.f3281d = mode;
        a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f3278h.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public c(e eVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f3276f = eVar;
        if (eVar != null && (constantState = eVar.b) != null) {
            a(constantState.newDrawable(resources));
        }
    }
}
