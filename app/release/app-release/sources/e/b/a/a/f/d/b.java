package e.b.a.a.f.d;

import a.w.c.i;
import android.content.Context;
import android.graphics.Bitmap;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final a f3753a;
    public final d b;

    public b(Context context) {
        if (context != null) {
            this.f3753a = new a(context);
            this.b = new d();
            return;
        }
        i.a("context");
        throw null;
    }

    @Override // e.b.a.a.f.d.c
    public Bitmap a(String str) {
        if (str != null) {
            Bitmap a2 = this.b.a(str);
            return a2 != null ? a2 : this.f3753a.a(str);
        }
        i.a("url");
        throw null;
    }

    @Override // e.b.a.a.f.d.c
    public void a(String str, Bitmap bitmap) {
        if (str == null) {
            i.a("url");
            throw null;
        } else if (bitmap != null) {
            this.b.a(str, bitmap);
            this.f3753a.a(str, bitmap);
        } else {
            i.a("bitmap");
            throw null;
        }
    }
}
