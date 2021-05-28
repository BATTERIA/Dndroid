package d.b.o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class s0 extends k0 {
    public final WeakReference<Context> b;

    public s0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = this.f2934a.getDrawable(i);
        Context context = this.b.get();
        if (!(drawable == null || context == null)) {
            i.a();
            i.a(context, i, drawable);
        }
        return drawable;
    }
}
