package e.d.a.m.k.h;

import e.d.a.m.i.k;
import e.d.a.m.j.f;
import java.io.InputStream;

public class e implements e.d.a.m.e<InputStream, a> {

    /* renamed from: a  reason: collision with root package name */
    public final e.d.a.m.e<f, a> f4194a;

    public e(e.d.a.m.e<f, a> eVar) {
        this.f4194a = eVar;
    }

    /* Return type fixed from 'e.d.a.m.i.k' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.e
    public k<a> a(InputStream inputStream, int i, int i2) {
        return this.f4194a.a(new f(inputStream, null), i, i2);
    }

    @Override // e.d.a.m.e
    public String a() {
        return this.f4194a.a();
    }
}
