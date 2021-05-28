package e.d.a.m.j.s;

import android.content.Context;
import android.net.Uri;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import java.io.File;
import java.io.InputStream;

public class c extends e.d.a.m.j.a<InputStream> implements d<File> {

    public static class a implements l<File, InputStream> {
        @Override // e.d.a.m.j.l
        public k<File, InputStream> a(Context context, b bVar) {
            return new c(bVar.a(Uri.class, InputStream.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public c(k<Uri, InputStream> kVar) {
        super(kVar);
    }
}
