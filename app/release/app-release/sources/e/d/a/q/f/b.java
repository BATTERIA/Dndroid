package e.d.a.q.f;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import e.d.a.q.f.c;
import e.d.a.q.g.e;

public class b<T extends Drawable> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f4247a;
    public final int b;

    public b(c<T> cVar, int i) {
        this.f4247a = cVar;
        this.b = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: e.d.a.q.f.c<T extends android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.a.q.f.c
    public boolean a(Object obj, c.a aVar) {
        Drawable drawable = (Drawable) obj;
        e eVar = (e) aVar;
        Drawable drawable2 = ((ImageView) eVar.b).getDrawable();
        if (drawable2 != null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.b);
            ((ImageView) eVar.b).setImageDrawable(transitionDrawable);
            return true;
        }
        this.f4247a.a(drawable, aVar);
        return false;
    }
}
