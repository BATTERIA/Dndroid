package e.d.a.m.k.f;

import e.d.a.m.e;
import e.d.a.m.f;
import e.d.a.m.i.k;
import e.d.a.m.j.n;
import java.io.File;
import java.io.InputStream;

public class d implements e.d.a.p.b<InputStream, File> {

    /* renamed from: e  reason: collision with root package name */
    public static final b f4135e = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public final e<File, File> f4136c = new a();

    /* renamed from: d  reason: collision with root package name */
    public final e.d.a.m.b<InputStream> f4137d = new n();

    public static class b implements e<InputStream, File> {
        public /* synthetic */ b(a aVar) {
        }

        /* Return type fixed from 'e.d.a.m.i.k' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
        @Override // e.d.a.m.e
        public k<File> a(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        @Override // e.d.a.m.e
        public String a() {
            return "";
        }
    }

    @Override // e.d.a.p.b
    public e<File, File> b() {
        return this.f4136c;
    }

    @Override // e.d.a.p.b
    public f<File> d() {
        return e.d.a.m.k.b.f4081a;
    }

    @Override // e.d.a.p.b
    public e.d.a.m.b<InputStream> e() {
        return this.f4137d;
    }

    @Override // e.d.a.p.b
    public e<InputStream, File> g() {
        return f4135e;
    }
}
