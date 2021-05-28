package a.a.a.a.v0.b.d1;

import a.s;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class z extends j implements a<l> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b0 f441c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(b0 b0Var) {
        super(0);
        this.f441c = b0Var;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public l a() {
        x xVar = this.f441c.f362f;
        if (xVar != null) {
            List<b0> c2 = xVar.c();
            boolean contains = c2.contains(this.f441c);
            if (!s.f2103a || contains) {
                for (T t : c2) {
                    boolean z = t.f363g != null;
                    if (s.f2103a && !z) {
                        StringBuilder a2 = e.a.a.a.a.a("Dependency module ");
                        a2.append(t.r0());
                        a2.append(" was not initialized by the time contents of dependent module ");
                        a2.append(this.f441c.r0());
                        a2.append(" were queried");
                        throw new AssertionError(a2.toString());
                    }
                }
                ArrayList arrayList = new ArrayList(g.a((Iterable) c2, 10));
                Iterator<T> it = c2.iterator();
                while (it.hasNext()) {
                    a.a.a.a.v0.b.z zVar = it.next().f363g;
                    if (zVar != null) {
                        arrayList.add(zVar);
                    } else {
                        i.a();
                        throw null;
                    }
                }
                return new l(arrayList);
            }
            StringBuilder a3 = e.a.a.a.a.a("Module ");
            a3.append(this.f441c.r0());
            a3.append(" is not contained in his own dependencies, this is probably a misconfiguration");
            throw new AssertionError(a3.toString());
        }
        StringBuilder a4 = e.a.a.a.a.a("Dependencies of module ");
        a4.append(this.f441c.r0());
        a4.append(" were not set before querying module content");
        throw new AssertionError(a4.toString());
    }
}
