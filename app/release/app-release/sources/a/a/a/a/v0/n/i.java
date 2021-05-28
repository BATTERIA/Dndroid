package a.a.a.a.v0.n;

import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.j.u.a;
import java.util.List;

public final class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public static final i f1973a = new i();

    @Override // a.a.a.a.v0.n.b
    public String a() {
        return "should not have varargs or parameters with default values";
    }

    @Override // a.a.a.a.v0.n.b
    public String a(s sVar) {
        if (sVar == null) {
            a.w.c.i.a("functionDescriptor");
            throw null;
        } else if (!b(sVar)) {
            return a();
        } else {
            return null;
        }
    }

    @Override // a.a.a.a.v0.n.b
    public boolean b(s sVar) {
        boolean z;
        if (sVar != null) {
            List<w0> j = sVar.j();
            a.w.c.i.a((Object) j, "functionDescriptor.valueParameters");
            if (!j.isEmpty()) {
                for (T t : j) {
                    a.w.c.i.a((Object) t, "it");
                    if (a.a((w0) t) || t.W() != null) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
            return true;
        }
        a.w.c.i.a("functionDescriptor");
        throw null;
    }
}
