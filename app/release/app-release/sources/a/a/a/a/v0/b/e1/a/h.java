package a.a.a.a.v0.b.e1.a;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.k.b.p;
import a.w.c.i;
import e.a.a.a.a;
import java.util.List;

public final class h implements p {
    public static final h b = new h();

    @Override // a.a.a.a.v0.k.b.p
    public void a(b bVar) {
        if (bVar != null) {
            throw new IllegalStateException("Cannot infer visibility for " + bVar);
        }
        i.a("descriptor");
        throw null;
    }

    @Override // a.a.a.a.v0.k.b.p
    public void a(e eVar, List<String> list) {
        if (eVar == null) {
            i.a("descriptor");
            throw null;
        } else if (list != null) {
            StringBuilder a2 = a.a("Incomplete hierarchy for class ");
            a2.append(eVar.d());
            a2.append(", unresolved classes ");
            a2.append(list);
            throw new IllegalStateException(a2.toString());
        } else {
            i.a("unresolvedSuperClasses");
            throw null;
        }
    }
}
