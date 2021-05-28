package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.i;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import java.util.Arrays;

public final class e extends s<Character> {
    public e(char c2) {
        super(Character.valueOf(c2));
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        if (wVar != null) {
            g m = wVar.m();
            if (m != null) {
                k0 b = m.b(i.CHAR);
                if (b != null) {
                    a.w.c.i.a((Object) b, "module.builtIns.charType");
                    return b;
                }
                g.b(61);
                throw null;
            }
            throw null;
        }
        a.w.c.i.a("module");
        throw null;
    }

    @Override // a.a.a.a.v0.j.s.g
    public String toString() {
        String str;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(this.f1578a.charValue());
        char charValue = this.f1578a.charValue();
        switch (charValue) {
            case '\b':
                str = "\\b";
                break;
            case '\t':
                str = "\\t";
                break;
            case '\n':
                str = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(charValue);
                if (!(type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19)) {
                    z = true;
                }
                if (!z) {
                    str = "?";
                    break;
                } else {
                    str = String.valueOf(charValue);
                    break;
                }
            case '\f':
                str = "\\f";
                break;
            case '\r':
                str = "\\r";
                break;
        }
        objArr[1] = str;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        a.w.c.i.a((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }
}
