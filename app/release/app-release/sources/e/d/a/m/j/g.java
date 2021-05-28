package e.d.a.m.j;

import android.os.ParcelFileDescriptor;
import e.d.a.m.b;
import java.io.InputStream;
import java.io.OutputStream;

public class g implements b<f> {

    /* renamed from: a  reason: collision with root package name */
    public final b<InputStream> f4063a;
    public final b<ParcelFileDescriptor> b;

    /* renamed from: c  reason: collision with root package name */
    public String f4064c;

    public g(b<InputStream> bVar, b<ParcelFileDescriptor> bVar2) {
        this.f4063a = bVar;
        this.b = bVar2;
    }

    @Override // e.d.a.m.b
    public String a() {
        if (this.f4064c == null) {
            this.f4064c = this.f4063a.a() + this.b.a();
        }
        return this.f4064c;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.io.OutputStream] */
    @Override // e.d.a.m.b
    public boolean a(f fVar, OutputStream outputStream) {
        f fVar2 = fVar;
        InputStream inputStream = fVar2.f4062a;
        if (inputStream != null) {
            return this.f4063a.a(inputStream, outputStream);
        }
        return this.b.a(fVar2.b, outputStream);
    }
}
