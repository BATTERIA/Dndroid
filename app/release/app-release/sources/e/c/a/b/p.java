package e.c.a.b;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import e.c.a.b.l;
import java.util.HashMap;
import java.util.Map;

@SuppressLint({"ApplySharedPref"})
public final class p {
    public static final Map<String, p> b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f3817a;

    public p(String str, int i) {
        this.f3817a = l.f.b().getSharedPreferences(str, i);
    }

    public static p a(String str, int i) {
        boolean z = false;
        if (str != null) {
            int length = str.length();
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (!Character.isWhitespace(str.charAt(i2))) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        z = true;
        if (z) {
            str = "spUtils";
        }
        p pVar = b.get(str);
        if (pVar == null) {
            synchronized (p.class) {
                pVar = b.get(str);
                if (pVar == null) {
                    pVar = new p(str, i);
                    b.put(str, pVar);
                }
            }
        }
        return pVar;
    }
}
