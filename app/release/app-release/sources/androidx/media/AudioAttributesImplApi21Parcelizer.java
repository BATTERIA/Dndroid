package androidx.media;

import android.media.AudioAttributes;
import d.n.b;
import d.r.a;

public final class AudioAttributesImplApi21Parcelizer {
    public static b read(a aVar) {
        b bVar = new b();
        bVar.f3571a = (AudioAttributes) aVar.a(bVar.f3571a, 1);
        bVar.b = aVar.a(bVar.b, 2);
        return bVar;
    }

    public static void write(b bVar, a aVar) {
        if (aVar != null) {
            aVar.b(bVar.f3571a, 1);
            aVar.b(bVar.b, 2);
            return;
        }
        throw null;
    }
}
