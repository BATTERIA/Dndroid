package e.d.a.m.k.h;

import android.graphics.Bitmap;
import e.d.a.m.f;
import e.d.a.m.i.k;
import e.d.a.m.k.g.b;
import java.io.OutputStream;

public class d implements f<a> {

    /* renamed from: a  reason: collision with root package name */
    public final f<Bitmap> f4192a;
    public final f<b> b;

    /* renamed from: c  reason: collision with root package name */
    public String f4193c;

    public d(f<Bitmap> fVar, f<b> fVar2) {
        this.f4192a = fVar;
        this.b = fVar2;
    }

    @Override // e.d.a.m.b
    public String a() {
        if (this.f4193c == null) {
            this.f4193c = this.f4192a.a() + this.b.a();
        }
        return this.f4193c;
    }

    @Override // e.d.a.m.b
    public boolean a(Object obj, OutputStream outputStream) {
        a aVar = (a) ((k) obj).get();
        k<Bitmap> kVar = aVar.b;
        if (kVar != null) {
            return this.f4192a.a(kVar, outputStream);
        }
        return this.b.a(aVar.f4183a, outputStream);
    }
}
