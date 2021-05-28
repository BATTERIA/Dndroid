package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.d.a.c0.g;
import a.a.a.a.v0.d.a.c0.t;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.t.l;
import a.w.c.i;
import java.util.Collection;

public final class b0 extends u implements t {

    /* renamed from: a  reason: collision with root package name */
    public final b f456a;

    public b0(b bVar) {
        if (bVar != null) {
            this.f456a = bVar;
        } else {
            i.a("fqName");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public a a(b bVar) {
        if (bVar != null) {
            return null;
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.t
    public b e() {
        return this.f456a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && i.a(this.f456a, ((b0) obj).f456a);
    }

    public int hashCode() {
        return this.f456a.hashCode();
    }

    @Override // a.a.a.a.v0.d.a.c0.t
    public Collection<t> o() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public boolean t() {
        return false;
    }

    public String toString() {
        return b0.class.getName() + ": " + this.f456a;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public Collection y() {
        return l.f2119c;
    }

    @Override // a.a.a.a.v0.d.a.c0.t
    public Collection<g> a(a.w.b.l<? super d, Boolean> lVar) {
        if (lVar != null) {
            return l.f2119c;
        }
        i.a("nameFilter");
        throw null;
    }
}
