package e.d.a.m.j;

import android.net.Uri;
import android.text.TextUtils;
import e.d.a.m.h.c;
import java.io.File;

public class o<T> implements k<String, T> {

    /* renamed from: a  reason: collision with root package name */
    public final k<Uri, T> f4074a;

    public o(k<Uri, T> kVar) {
        this.f4074a = kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.j.k
    public c a(String str, int i, int i2) {
        Uri uri;
        File file;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str2.startsWith("/")) {
            file = new File(str2);
        } else {
            uri = Uri.parse(str2);
            if (uri.getScheme() == null) {
                file = new File(str2);
            }
            return this.f4074a.a(uri, i, i2);
        }
        uri = Uri.fromFile(file);
        return this.f4074a.a(uri, i, i2);
    }
}
