package e.d.a.q.g;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // e.d.a.q.g.e
    public void a(Bitmap bitmap) {
        ((ImageView) this.b).setImageBitmap(bitmap);
    }
}
