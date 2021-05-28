package e.d.a.m.j.r;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import e.d.a.m.j.b;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import java.io.File;

public class a extends e.d.a.m.j.a<ParcelFileDescriptor> implements b<File> {

    /* renamed from: e.d.a.m.j.r.a$a  reason: collision with other inner class name */
    public static class C0127a implements l<File, ParcelFileDescriptor> {
        @Override // e.d.a.m.j.l
        public k<File, ParcelFileDescriptor> a(Context context, b bVar) {
            return new a(bVar.a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public a(k<Uri, ParcelFileDescriptor> kVar) {
        super(kVar);
    }
}
