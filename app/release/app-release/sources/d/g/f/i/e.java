package d.g.f.i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class e extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f3279a;
    public Drawable.ConstantState b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f3280c = null;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f3281d = c.i;

    public e(e eVar) {
        if (eVar != null) {
            this.f3279a = eVar.f3279a;
            this.b = eVar.b;
            this.f3280c = eVar.f3280c;
            this.f3281d = eVar.f3281d;
        }
    }

    public int getChangingConfigurations() {
        int i = this.f3279a;
        Drawable.ConstantState constantState = this.b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new d(this, resources) : new c(this, resources);
    }
}
