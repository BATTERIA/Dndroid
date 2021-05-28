package e.d.a.m.j.s;

import android.content.Context;
import e.d.a.m.h.c;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import java.io.InputStream;

public class b implements d<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4079a = "";

    public static class a implements l<byte[], InputStream> {
        @Override // e.d.a.m.j.l
        public k<byte[], InputStream> a(Context context, e.d.a.m.j.b bVar) {
            return new b();
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    /* Return type fixed from 'e.d.a.m.h.c' to match base method */
    @Override // e.d.a.m.j.k
    public c<InputStream> a(Object obj, int i, int i2) {
        return new e.d.a.m.h.b((byte[]) obj, this.f4079a);
    }
}
