package e.d.a.m.j.r;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.m;

public class c extends m<ParcelFileDescriptor> implements b<Integer> {

    public static class a implements l<Integer, ParcelFileDescriptor> {
        @Override // e.d.a.m.j.l
        public k<Integer, ParcelFileDescriptor> a(Context context, b bVar) {
            return new c(context, bVar.a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public c(Context context, k<Uri, ParcelFileDescriptor> kVar) {
        super(context, kVar);
    }
}
