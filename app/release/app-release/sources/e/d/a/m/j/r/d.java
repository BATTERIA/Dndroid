package e.d.a.m.j.r;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.o;

public class d extends o<ParcelFileDescriptor> implements b<String> {

    public static class a implements l<String, ParcelFileDescriptor> {
        @Override // e.d.a.m.j.l
        public k<String, ParcelFileDescriptor> a(Context context, b bVar) {
            return new d(bVar.a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public d(k<Uri, ParcelFileDescriptor> kVar) {
        super(kVar);
    }
}
