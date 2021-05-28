package e.d.a.m.j.r;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import e.d.a.m.h.d;
import e.d.a.m.j.b;
import e.d.a.m.j.c;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import e.d.a.m.j.p;

public class e extends p<ParcelFileDescriptor> implements b<Uri> {

    public static class a implements l<Uri, ParcelFileDescriptor> {
        @Override // e.d.a.m.j.l
        public k<Uri, ParcelFileDescriptor> a(Context context, b bVar) {
            return new e(context, bVar.a(c.class, ParcelFileDescriptor.class));
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public e(Context context, k<c, ParcelFileDescriptor> kVar) {
        super(context, kVar);
    }

    @Override // e.d.a.m.j.p
    public e.d.a.m.h.c<ParcelFileDescriptor> a(Context context, Uri uri) {
        return new e.d.a.m.h.e(context, uri);
    }

    @Override // e.d.a.m.j.p
    public e.d.a.m.h.c<ParcelFileDescriptor> a(Context context, String str) {
        return new d(context.getApplicationContext().getAssets(), str);
    }
}
