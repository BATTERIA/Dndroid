package e.d.a.q.g;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import e.d.a.q.f.c;

public abstract class e<Z> extends j<ImageView, Z> implements c.a {
    public e(ImageView imageView) {
        super(imageView);
    }

    @Override // e.d.a.q.g.a
    public void a(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    @Override // e.d.a.q.g.a
    public void a(Exception exc, Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }

    public abstract void a(Z z);

    @Override // e.d.a.q.g.a
    public void a(Z z, c<? super Z> cVar) {
        if (cVar == null || !cVar.a(z, this)) {
            a((Object) z);
        }
    }

    @Override // e.d.a.q.g.a
    public void b(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }
}
