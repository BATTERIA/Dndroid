package d.g.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import d.d.f;
import d.g.e.c.b;
import d.g.e.c.e;
import d.g.e.c.g;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h f3262a;
    public static final f<String, Typeface> b = new f<>(16);

    static {
        h hVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            hVar = new g();
        } else if (i >= 26) {
            hVar = new f();
        } else {
            if (i >= 24) {
                if (e.f3268d == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (e.f3268d != null) {
                    hVar = new e();
                }
            }
            hVar = Build.VERSION.SDK_INT >= 21 ? new d() : new h();
        }
        f3262a = hVar;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f3262a.a(context, resources, i, str, i2);
        if (a2 != null) {
            b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, b bVar, Resources resources, int i, int i2, g gVar, Handler handler, boolean z) {
        Typeface typeface;
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            boolean z2 = false;
            if (!z ? gVar == null : eVar.f3255c == 0) {
                z2 = true;
            }
            typeface = d.g.i.b.a(context, eVar.f3254a, gVar, handler, z2, z ? eVar.b : -1, i2);
        } else {
            typeface = f3262a.a(context, (d.g.e.c.c) bVar, resources, i2);
            if (gVar != null) {
                if (typeface != null) {
                    gVar.a(typeface, handler);
                } else {
                    gVar.a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            b.a(a(resources, i, i2), typeface);
        }
        return typeface;
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
