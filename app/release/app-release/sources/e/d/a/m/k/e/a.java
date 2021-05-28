package e.d.a.m.k.e;

import android.graphics.drawable.Drawable;
import e.d.a.m.i.k;

public abstract class a<T extends Drawable> implements k<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f4131a;

    public a(T t) {
        if (t != null) {
            this.f4131a = t;
            return;
        }
        throw new NullPointerException("Drawable must not be null!");
    }

    @Override // e.d.a.m.i.k
    public Object get() {
        return this.f4131a.getConstantState().newDrawable();
    }
}
