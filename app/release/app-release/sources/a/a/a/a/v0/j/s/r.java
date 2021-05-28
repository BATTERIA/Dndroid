package a.a.a.a.v0.j.s;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.s0;
import a.e;
import a.t.l;
import a.w.b.a;
import a.w.c.f;
import a.w.c.i;
import e.f.a.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class r implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f1587a;
    public final w b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<d0> f1588c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f1589d;

    /* renamed from: e  reason: collision with root package name */
    public final e f1590e;

    public /* synthetic */ r(long j, w wVar, Set set, f fVar) {
        if (h.b != null) {
            this.f1589d = e0.a(h.a.f321a, this, false);
            this.f1590e = g.m92a((a) new p(this));
            this.f1587a = j;
            this.b = wVar;
            this.f1588c = set;
            return;
        }
        throw null;
    }

    @Override // a.a.a.a.v0.m.s0
    public boolean a() {
        return false;
    }

    public final boolean a(s0 s0Var) {
        if (s0Var != null) {
            Set<d0> set = this.f1588c;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (i.a(it.next().I0(), s0Var)) {
                    return true;
                }
            }
            return false;
        }
        i.a("constructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.s0
    public Collection<d0> b() {
        return (List) this.f1590e.getValue();
    }

    @Override // a.a.a.a.v0.m.s0
    public a.a.a.a.v0.b.h c() {
        return null;
    }

    @Override // a.a.a.a.v0.m.s0
    public List<r0> d() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.m.s0
    public a.a.a.a.v0.a.g m() {
        return this.b.m();
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("IntegerLiteralType");
        a2.append('[' + a.t.f.a(this.f1588c, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, q.f1586c, 30) + ']');
        return a2.toString();
    }
}
