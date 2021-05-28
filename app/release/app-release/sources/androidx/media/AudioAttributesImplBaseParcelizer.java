package androidx.media;

import d.n.c;
import d.r.a;

public final class AudioAttributesImplBaseParcelizer {
    public static c read(a aVar) {
        c cVar = new c();
        cVar.f3572a = aVar.a(cVar.f3572a, 1);
        cVar.b = aVar.a(cVar.b, 2);
        cVar.f3573c = aVar.a(cVar.f3573c, 3);
        cVar.f3574d = aVar.a(cVar.f3574d, 4);
        return cVar;
    }

    public static void write(c cVar, a aVar) {
        if (aVar != null) {
            aVar.b(cVar.f3572a, 1);
            aVar.b(cVar.b, 2);
            aVar.b(cVar.f3573c, 3);
            aVar.b(cVar.f3574d, 4);
            return;
        }
        throw null;
    }
}
