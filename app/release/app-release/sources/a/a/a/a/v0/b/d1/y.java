package a.a.a.a.v0.b.d1;

import a.w.c.i;
import java.util.List;
import java.util.Set;

public final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    public final List<b0> f439a;
    public final Set<b0> b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b0> f440c;

    public y(List<b0> list, Set<b0> set, List<b0> list2) {
        if (list == null) {
            i.a("allDependencies");
            throw null;
        } else if (set == null) {
            i.a("modulesWhoseInternalsAreVisible");
            throw null;
        } else if (list2 != null) {
            this.f439a = list;
            this.b = set;
            this.f440c = list2;
        } else {
            i.a("expectedByDependencies");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.d1.x
    public Set<b0> a() {
        return this.b;
    }

    @Override // a.a.a.a.v0.b.d1.x
    public List<b0> b() {
        return this.f440c;
    }

    @Override // a.a.a.a.v0.b.d1.x
    public List<b0> c() {
        return this.f439a;
    }
}
