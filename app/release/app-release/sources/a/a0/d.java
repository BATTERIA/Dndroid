package a.a0;

import a.w.c.i;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class d implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public final Pattern f2070c;

    public d(String str) {
        if (str != null) {
            Pattern compile = Pattern.compile(str);
            i.a((Object) compile, "Pattern.compile(pattern)");
            this.f2070c = compile;
            return;
        }
        i.a("pattern");
        throw null;
    }

    public final boolean a(CharSequence charSequence) {
        if (charSequence != null) {
            return this.f2070c.matcher(charSequence).matches();
        }
        i.a("input");
        throw null;
    }

    public String toString() {
        String pattern = this.f2070c.toString();
        i.a((Object) pattern, "nativePattern.toString()");
        return pattern;
    }
}
