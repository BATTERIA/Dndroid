package a.a.a.a.v0.m;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.j.g;
import a.a.a.a.v0.j.u.a;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.o.l;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class b extends h implements s0 {
    public int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(j jVar) {
        super(jVar);
        if (jVar != null) {
            this.b = 0;
            return;
        }
        a(0);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r9) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.m.b.a(int):void");
    }

    public static boolean a(h hVar) {
        if (hVar != null) {
            return !w.a(hVar) && !g.n(hVar);
        }
        a(2);
        throw null;
    }

    @Override // a.a.a.a.v0.m.h
    public Collection<d0> a(boolean z) {
        k b2 = c().b();
        if (!(b2 instanceof e)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            a(3);
            throw null;
        }
        l lVar = new l();
        e eVar = (e) b2;
        lVar.add(eVar.v());
        e d0 = eVar.d0();
        if (z && d0 != null) {
            lVar.add(d0.v());
        }
        return lVar;
    }

    @Override // a.a.a.a.v0.m.s0
    public abstract e c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0) || obj.hashCode() != hashCode()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (s0Var.d().size() != d().size()) {
            return false;
        }
        e c2 = c();
        h c3 = s0Var.c();
        if (!a(c2) || ((c3 != null && !a(c3)) || !(c3 instanceof e))) {
            return false;
        }
        e eVar = (e) c3;
        if (c2.d().equals(eVar.d())) {
            k b2 = c2.b();
            k b3 = eVar.b();
            while (b2 != null && b3 != null) {
                if (b2 instanceof w) {
                    return b3 instanceof w;
                }
                if (!(b3 instanceof w)) {
                    if (b2 instanceof y) {
                        return (b3 instanceof y) && ((y) b2).e().equals(((y) b3).e());
                    }
                    if (!(b3 instanceof y) && b2.d().equals(b3.d())) {
                        b2 = b2.b();
                        b3 = b3.b();
                    }
                }
            }
            return true;
        }
    }

    @Override // a.a.a.a.v0.m.h
    public d0 g() {
        if (a.a.a.a.v0.a.g.b(c())) {
            return null;
        }
        return m().b();
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        e c2 = c();
        int hashCode = a(c2) ? g.e(c2).hashCode() : System.identityHashCode(this);
        this.b = hashCode;
        return hashCode;
    }

    @Override // a.a.a.a.v0.m.s0
    public a.a.a.a.v0.a.g m() {
        a.a.a.a.v0.a.g b2 = a.b((k) c());
        if (b2 != null) {
            return b2;
        }
        a(1);
        throw null;
    }
}
