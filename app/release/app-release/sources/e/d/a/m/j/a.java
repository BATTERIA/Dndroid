package e.d.a.m.j;

import android.net.Uri;
import e.d.a.m.h.c;
import java.io.File;

public class a<T> implements k<File, T> {

    /* renamed from: a  reason: collision with root package name */
    public final k<Uri, T> f4051a;

    public a(k<Uri, T> kVar) {
        this.f4051a = kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.j.k
    public c a(File file, int i, int i2) {
        return this.f4051a.a(Uri.fromFile(file), i, i2);
    }
}
