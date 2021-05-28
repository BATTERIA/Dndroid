package e.d.a.m.j;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import e.d.a.m.h.c;

public class m<T> implements k<Integer, T> {

    /* renamed from: a  reason: collision with root package name */
    public final k<Uri, T> f4073a;
    public final Resources b;

    public m(Context context, k<Uri, T> kVar) {
        this.b = context.getResources();
        this.f4073a = kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.j.k
    public c a(Integer num, int i, int i2) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num2.intValue()) + '/' + this.b.getResourceTypeName(num2.intValue()) + '/' + this.b.getResourceEntryName(num2.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e2);
            }
            uri = null;
        }
        if (uri != null) {
            return this.f4073a.a(uri, i, i2);
        }
        return null;
    }
}
