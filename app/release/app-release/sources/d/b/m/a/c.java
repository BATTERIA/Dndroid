package d.b.m.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import c.a.a.a.a;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: c  reason: collision with root package name */
    public Drawable f2738c;

    public c(Drawable drawable) {
        Drawable drawable2 = this.f2738c;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2738c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2738c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2738c.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2738c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2738c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2738c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2738c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2738c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2738c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2738c.getPadding(rect);
    }

    public int[] getState() {
        return this.f2738c.getState();
    }

    public Region getTransparentRegion() {
        return this.f2738c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2738c.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f2738c.isStateful();
    }

    public void jumpToCurrentState() {
        this.f2738c.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f2738c.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.f2738c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2738c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2738c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2738c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2738c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2738c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2738c.setFilterBitmap(z);
    }

    public void setHotspot(float f2, float f3) {
        a.a(this.f2738c, f2, f3);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        a.a(this.f2738c, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f2738c.setState(iArr);
    }

    public void setTint(int i) {
        a.b(this.f2738c, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.a(this.f2738c, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.a(this.f2738c, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2738c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
