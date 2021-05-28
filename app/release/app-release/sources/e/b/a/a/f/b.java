package e.b.a.a.f;

import android.graphics.Bitmap;
import android.widget.ImageView;

public final class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ImageView f3748c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bitmap f3749d;

    public b(ImageView imageView, Bitmap bitmap) {
        this.f3748c = imageView;
        this.f3749d = bitmap;
    }

    public final void run() {
        this.f3748c.setImageBitmap(this.f3749d);
    }
}
