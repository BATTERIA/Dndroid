package e.d.a.m.j.s;

import android.content.Context;
import android.net.Uri;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.m;
import java.io.InputStream;

public class e extends m<InputStream> implements d<Integer> {

    public static class a implements l<Integer, InputStream> {
        @Override // e.d.a.m.j.l
        public k<Integer, InputStream> a(Context context, b bVar) {
            return new e(context, bVar.a(Uri.class, InputStream.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public e(Context context, k<Uri, InputStream> kVar) {
        super(context, kVar);
    }
}
