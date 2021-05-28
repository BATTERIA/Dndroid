package e.d.a.m.k.h;

import android.graphics.Bitmap;
import e.d.a.m.i.k;
import e.d.a.m.k.g.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final k<b> f4183a;
    public final k<Bitmap> b;

    public a(k<Bitmap> kVar, k<b> kVar2) {
        if (kVar != null && kVar2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        } else if (kVar == null && kVar2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else {
            this.b = kVar;
            this.f4183a = kVar2;
        }
    }
}
