package e.d.a.q.g;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class c extends e<Drawable> {
    public c(ImageView imageView) {
        super(imageView);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // e.d.a.q.g.e
    public void a(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }
}
