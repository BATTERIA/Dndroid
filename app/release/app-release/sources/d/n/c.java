package d.n;

import androidx.media.AudioAttributesCompat;
import java.util.Arrays;

public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public int f3572a = 0;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f3573c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f3574d = -1;

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.b != cVar.b) {
            return false;
        }
        int i = this.f3573c;
        int i2 = cVar.f3573c;
        int i3 = cVar.f3574d;
        if (i3 == -1) {
            i3 = AudioAttributesCompat.a(false, i2, cVar.f3572a);
        }
        if (i3 == 6) {
            i2 |= 4;
        } else if (i3 == 7) {
            i2 |= 1;
        }
        if (i == (i2 & 273) && this.f3572a == cVar.f3572a && this.f3574d == cVar.f3574d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.f3573c), Integer.valueOf(this.f3572a), Integer.valueOf(this.f3574d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3574d != -1) {
            sb.append(" stream=");
            sb.append(this.f3574d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.f3572a));
        sb.append(" content=");
        sb.append(this.b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3573c).toUpperCase());
        return sb.toString();
    }
}
