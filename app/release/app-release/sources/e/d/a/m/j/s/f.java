package e.d.a.m.j.s;

import android.content.Context;
import android.net.Uri;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.o;
import java.io.InputStream;

public class f extends o<InputStream> implements d<String> {

    public static class a implements l<String, InputStream> {
        @Override // e.d.a.m.j.l
        public k<String, InputStream> a(Context context, b bVar) {
            return new f(bVar.a(Uri.class, InputStream.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public f(k<Uri, InputStream> kVar) {
        super(kVar);
    }
}
