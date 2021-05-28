package e.d.a.m.j;

import android.content.Context;
import android.net.Uri;
import e.d.a.m.h.c;

public abstract class p<T> implements k<Uri, T> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4075a;
    public final k<c, T> b;

    public p(Context context, k<c, T> kVar) {
        this.f4075a = context;
        this.b = kVar;
    }

    public abstract c<T> a(Context context, Uri uri);

    public abstract c<T> a(Context context, String str);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.j.k
    public c a(Uri uri, int i, int i2) {
        Uri uri2 = uri;
        String scheme = uri2.getScheme();
        boolean z = true;
        if ("file".equals(scheme) || "content".equals(scheme) || "android.resource".equals(scheme)) {
            if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
                z = false;
            }
            if (!z) {
                return a(this.f4075a, uri2);
            }
            return a(this.f4075a, uri2.toString().substring(22));
        } else if (this.b == null || (!"http".equals(scheme) && !"https".equals(scheme))) {
            return null;
        } else {
            return this.b.a(new c(uri2.toString()), i, i2);
        }
    }
}
