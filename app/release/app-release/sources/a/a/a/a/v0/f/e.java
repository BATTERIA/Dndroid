package a.a.a.a.v0.f;

import a.a0.d;
import a.w.c.i;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f1353a = new d("[^\\p{L}\\p{Digit}]");

    public static final String a(String str) {
        if (str != null) {
            String replaceAll = f1353a.f2070c.matcher(str).replaceAll("_");
            i.a((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
            return replaceAll;
        }
        i.a("name");
        throw null;
    }
}
