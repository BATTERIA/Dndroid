package e.d.a.m.j.s;

import android.content.Context;
import e.d.a.m.h.f;
import e.d.a.m.j.b;
import e.d.a.m.j.c;
import e.d.a.m.j.j;
import e.d.a.m.j.k;
import e.d.a.m.j.l;
import java.io.InputStream;

public class a implements k<c, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final j<c, c> f4077a;

    /* renamed from: e.d.a.m.j.s.a$a  reason: collision with other inner class name */
    public static class C0128a implements l<c, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final j<c, c> f4078a = new j<>(500);

        @Override // e.d.a.m.j.l
        public k<c, InputStream> a(Context context, b bVar) {
            return new a(this.f4078a);
        }

        @Override // e.d.a.m.j.l
        public void a() {
        }
    }

    public a(j<c, c> jVar) {
        this.f4077a = jVar;
    }

    /* Return type fixed from 'e.d.a.m.h.c' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.j.k
    public e.d.a.m.h.c<InputStream> a(c cVar, int i, int i2) {
        c cVar2 = cVar;
        j<c, c> jVar = this.f4077a;
        if (jVar != null) {
            j.b<?> a2 = j.b.a(cVar2, 0, 0);
            Y y = jVar.f4069a.f4274a.get(a2);
            if (a2 != null) {
                j.b.f4070d.offer(a2);
                Y y2 = y;
                if (y2 == null) {
                    j<c, c> jVar2 = this.f4077a;
                    if (jVar2 != null) {
                        jVar2.f4069a.b(j.b.a(cVar2, 0, 0), cVar2);
                    } else {
                        throw null;
                    }
                } else {
                    cVar2 = y2;
                }
            } else {
                throw null;
            }
        }
        return new f(cVar2);
    }
}
