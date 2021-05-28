package e.b.a.a.f;

import a.w.c.i;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.io.InputStream;
import java.net.URL;

public final class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f3745c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f3746d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ImageView f3747e;

    public a(c cVar, String str, ImageView imageView) {
        this.f3745c = cVar;
        this.f3746d = str;
        this.f3747e = imageView;
    }

    public final void run() {
        Bitmap a2 = this.f3745c.f3751c.a(this.f3746d);
        if (a2 == null) {
            c cVar = this.f3745c;
            String str = this.f3746d;
            if (cVar != null) {
                try {
                    InputStream inputStream = new URL(str).openConnection().getInputStream();
                    Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                    inputStream.close();
                    a2 = decodeStream;
                } catch (Exception unused) {
                    a2 = null;
                }
            } else {
                throw null;
            }
        }
        if (a2 != null) {
            if (i.a(this.f3747e.getTag(), (Object) this.f3746d)) {
                this.f3745c.b.post(new b(this.f3747e, a2));
            }
            this.f3745c.f3751c.a(this.f3746d, a2);
        }
    }
}
