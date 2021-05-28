package a.a.a.a.v0.m;

import a.a.a.a.v0.i.c;
import a.a.a.a.v0.m.k1.h;
import a.a.a.a.v0.m.k1.i;
import a.t.f;
import d.b.j;
import java.util.Iterator;

public abstract class k0 extends f1 implements h, i {
    public k0() {
        super(null);
    }

    @Override // a.a.a.a.v0.m.f1
    public abstract k0 a(a.a.a.a.v0.b.b1.h hVar);

    @Override // a.a.a.a.v0.m.f1
    public abstract k0 a(boolean z);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = y().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", c.a(c.b, (a.a.a.a.v0.b.b1.c) it.next(), null, 2, null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(I0());
        if (!H0().isEmpty()) {
            f.a(H0(), sb, ", ", "<", ">", 0, null, null, j.AppCompatTheme_windowActionBarOverlay);
        }
        if (J0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        a.w.c.i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
