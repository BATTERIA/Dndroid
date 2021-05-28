package e.d.a.m.j.s;

import android.content.Context;
import android.net.Uri;
import e.d.a.m.h.h;
import e.d.a.m.h.i;
import e.d.a.m.j.b;
import e.d.a.m.j.c;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.p;
import java.io.InputStream;

public class g extends p<InputStream> implements d<Uri> {

    public static class a implements l<Uri, InputStream> {
        @Override // e.d.a.m.j.l
        public k<Uri, InputStream> a(Context context, b bVar) {
            return new g(context, bVar.a(c.class, InputStream.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public g(Context context, k<c, InputStream> kVar) {
        super(context, kVar);
    }

    @Override // e.d.a.m.j.p
    public e.d.a.m.h.c<InputStream> a(Context context, Uri uri) {
        return new i(context, uri);
    }

    @Override // e.d.a.m.j.p
    public e.d.a.m.h.c<InputStream> a(Context context, String str) {
        return new h(context.getApplicationContext().getAssets(), str);
    }
}
