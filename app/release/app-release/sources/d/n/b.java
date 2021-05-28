package d.n;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import e.a.a.a.a;

@TargetApi(21)
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f3571a;
    public int b = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f3571a.equals(((b) obj).f3571a);
    }

    public int hashCode() {
        return this.f3571a.hashCode();
    }

    public String toString() {
        StringBuilder a2 = a.a("AudioAttributesCompat: audioattributes=");
        a2.append(this.f3571a);
        return a2.toString();
    }
}
