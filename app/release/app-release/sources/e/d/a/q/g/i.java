package e.d.a.q.g;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import e.d.a.m.k.e.b;

public class i extends b {

    /* renamed from: c  reason: collision with root package name */
    public b f4255c;

    /* renamed from: d  reason: collision with root package name */
    public a f4256d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4257e;

    public static class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f4258a;
        public final int b;

        public a(Drawable.ConstantState constantState, int i) {
            this.f4258a = constantState;
            this.b = i;
        }

        public a(a aVar) {
            Drawable.ConstantState constantState = aVar.f4258a;
            int i = aVar.b;
            this.f4258a = constantState;
            this.b = i;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public Drawable newDrawable(Resources resources) {
            return new i(this, null, resources);
        }
    }

    public i(a aVar, b bVar, Resources resources) {
        Drawable drawable;
        this.f4256d = aVar;
        if (bVar == null) {
            if (resources != null) {
                drawable = aVar.f4258a.newDrawable(resources);
            } else {
                drawable = aVar.f4258a.newDrawable();
            }
            this.f4255c = (b) drawable;
            return;
        }
        this.f4255c = bVar;
    }

    @Override // e.d.a.m.k.e.b
    public void a(int i) {
        this.f4255c.a(i);
    }

    @Override // e.d.a.m.k.e.b
    public boolean a() {
        return this.f4255c.a();
    }

    public void clearColorFilter() {
        this.f4255c.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        this.f4255c.draw(canvas);
    }

    @TargetApi(19)
    public int getAlpha() {
        return this.f4255c.getAlpha();
    }

    @TargetApi(11)
    public Drawable.Callback getCallback() {
        return this.f4255c.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f4255c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f4256d;
    }

    public Drawable getCurrent() {
        return this.f4255c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4256d.b;
    }

    public int getIntrinsicWidth() {
        return this.f4256d.b;
    }

    public int getMinimumHeight() {
        return this.f4255c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4255c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4255c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f4255c.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f4255c.invalidateSelf();
    }

    public boolean isRunning() {
        return this.f4255c.isRunning();
    }

    public Drawable mutate() {
        if (!this.f4257e && super.mutate() == this) {
            this.f4255c = (b) this.f4255c.mutate();
            this.f4256d = new a(this.f4256d);
            this.f4257e = true;
        }
        return this;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f4255c.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f4255c.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f4255c.setBounds(i, i2, i3, i4);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f4255c.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f4255c.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f4255c.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4255c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4255c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4255c.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f4255c.setVisible(z, z2);
    }

    public void start() {
        this.f4255c.start();
    }

    public void stop() {
        this.f4255c.stop();
    }

    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f4255c.unscheduleSelf(runnable);
    }
}
