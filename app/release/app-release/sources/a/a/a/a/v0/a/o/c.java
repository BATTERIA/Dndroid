package a.a.a.a.v0.a.o;

import a.a.a.a.v0.b.s;
import a.a.a.a.v0.j.w.e;
import a.a.a.a.v0.l.j;
import a.n;
import a.t.l;
import a.w.c.i;
import e.f.a.g;
import java.util.List;

public final class c extends e {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(j jVar, b bVar) {
        super(jVar, bVar);
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (bVar != null) {
        } else {
            i.a("containingClass");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.e
    public List<s> c() {
        boolean z;
        b bVar;
        a.a.a.a.v0.b.e eVar = this.f1621c;
        if (eVar != null) {
            int ordinal = ((b) eVar).l.ordinal();
            if (ordinal != 0) {
                z = true;
                if (ordinal != 1) {
                    return l.f2119c;
                }
                bVar = (b) this.f1621c;
            } else {
                bVar = (b) this.f1621c;
                z = false;
            }
            return g.c((Object) d.a(bVar, z));
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
    }
}
