package androidx.media;

import d.r.a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f2424a;
        if (aVar.a(1)) {
            obj = aVar.c();
        }
        audioAttributesCompat.f2424a = (d.n.a) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        if (aVar != null) {
            d.n.a aVar2 = audioAttributesCompat.f2424a;
            aVar.b(1);
            aVar.a(aVar2);
            return;
        }
        throw null;
    }
}
