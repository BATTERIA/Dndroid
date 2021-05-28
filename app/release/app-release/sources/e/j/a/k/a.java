package e.j.a.k;

import android.content.res.Resources;
import e.j.a.h.d;

public class a {
    public static float a(d dVar, float f2, int i) {
        return ((dVar.f4962h + dVar.f4960f) * ((float) i)) + (f2 / 2.0f);
    }

    public static int a(float f2) {
        return (int) ((f2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int a(boolean z, int i, int i2) {
        if (z) {
            i--;
        }
        return (i + i2) % i2;
    }
}
