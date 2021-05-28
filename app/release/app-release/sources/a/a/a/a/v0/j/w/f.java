package a.a.a.a.v0.j.w;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.j.j;
import a.a.a.a.v0.j.l;
import a.q;
import a.w.c.i;
import e.a.a.a.a;
import java.util.ArrayList;

public final class f extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f1623a;
    public final /* synthetic */ ArrayList b;

    public f(e eVar, ArrayList arrayList) {
        this.f1623a = eVar;
        this.b = arrayList;
    }

    @Override // a.a.a.a.v0.j.k
    public void a(b bVar) {
        if (bVar != null) {
            l.a(bVar, (a.w.b.l<b, q>) null);
            this.b.add(bVar);
            return;
        }
        i.a("fakeOverride");
        throw null;
    }

    @Override // a.a.a.a.v0.j.j
    public void a(b bVar, b bVar2) {
        if (bVar == null) {
            i.a("fromSuper");
            throw null;
        } else if (bVar2 != null) {
            StringBuilder a2 = a.a("Conflict in scope of ");
            a2.append(this.f1623a.f1621c);
            a2.append(": ");
            a2.append(bVar);
            a2.append(" vs ");
            a2.append(bVar2);
            throw new IllegalStateException(a2.toString().toString());
        } else {
            i.a("fromCurrent");
            throw null;
        }
    }
}
