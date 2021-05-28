package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.m.d0;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import e.a.a.a.a;
import java.util.Collection;

public final class t implements s<h> {

    /* renamed from: a  reason: collision with root package name */
    public static final t f922a = new t();

    @Override // a.a.a.a.v0.d.b.s
    public d0 a(Collection<? extends d0> collection) {
        if (collection != null) {
            StringBuilder a2 = a.a("There should be no intersection type in existing descriptors, but found: ");
            a2.append(f.a(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 63));
            throw new AssertionError(a2.toString());
        }
        i.a("types");
        throw null;
    }

    @Override // a.a.a.a.v0.d.b.s
    public boolean a() {
        return true;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.a.a.a.v0.d.b.s
    public h b(e eVar) {
        if (eVar != null) {
            return null;
        }
        i.a("classDescriptor");
        throw null;
    }

    @Override // a.a.a.a.v0.d.b.s
    public String c(e eVar) {
        if (eVar != null) {
            return null;
        }
        i.a("classDescriptor");
        throw null;
    }

    @Override // a.a.a.a.v0.d.b.s
    public String a(e eVar) {
        if (eVar != null) {
            return null;
        }
        i.a("classDescriptor");
        throw null;
    }

    @Override // a.a.a.a.v0.d.b.s
    public d0 a(d0 d0Var) {
        if (d0Var != null) {
            return null;
        }
        i.a("kotlinType");
        throw null;
    }

    @Override // a.a.a.a.v0.d.b.s
    public void a(d0 d0Var, e eVar) {
        if (d0Var == null) {
            i.a("kotlinType");
            throw null;
        } else if (eVar == null) {
            i.a("descriptor");
            throw null;
        }
    }
}
