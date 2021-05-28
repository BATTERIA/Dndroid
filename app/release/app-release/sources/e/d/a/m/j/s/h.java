package e.d.a.m.j.s;

import android.content.Context;
import e.d.a.m.j.b;
import e.d.a.m.j.c;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.q;
import java.io.InputStream;
import java.net.URL;

public class h extends q<InputStream> {

    public static class a implements l<URL, InputStream> {
        @Override // e.d.a.m.j.l
        public k<URL, InputStream> a(Context context, b bVar) {
            return new h(bVar.a(c.class, InputStream.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public h(k<c, InputStream> kVar) {
        super(kVar);
    }
}
