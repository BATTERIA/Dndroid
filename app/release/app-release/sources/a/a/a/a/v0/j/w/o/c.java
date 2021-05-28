package a.a.a.a.v0.j.w.o;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.w.c.i;
import e.a.a.a.a;

public class c implements d, g {

    /* renamed from: a  reason: collision with root package name */
    public final e f1638a;

    public c(e eVar, c cVar) {
        if (eVar != null) {
            this.f1638a = eVar;
        } else {
            i.a("classDescriptor");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.w.o.e
    public d0 c() {
        k0 v = this.f1638a.v();
        i.a((Object) v, "classDescriptor.defaultType");
        return v;
    }

    public boolean equals(Object obj) {
        e eVar = this.f1638a;
        e eVar2 = null;
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar != null) {
            eVar2 = cVar.f1638a;
        }
        return i.a(eVar, eVar2);
    }

    public int hashCode() {
        return this.f1638a.hashCode();
    }

    @Override // a.a.a.a.v0.j.w.o.g
    public final e l() {
        return this.f1638a;
    }

    public String toString() {
        StringBuilder a2 = a.a("Class{");
        k0 v = this.f1638a.v();
        i.a((Object) v, "classDescriptor.defaultType");
        a2.append(v);
        a2.append('}');
        return a2.toString();
    }
}
