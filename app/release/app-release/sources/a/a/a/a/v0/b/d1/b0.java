package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.t;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.g.a;
import a.a.a.a.v0.l.d;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.i1.n;
import a.e;
import a.s;
import a.t.f;
import a.t.m;
import a.w.b.l;
import a.w.c.i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b0 extends m implements w {

    /* renamed from: e  reason: collision with root package name */
    public final Map<w.a<?>, Object> f361e;

    /* renamed from: f  reason: collision with root package name */
    public x f362f;

    /* renamed from: g  reason: collision with root package name */
    public z f363g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f364h;
    public final d<b, a.a.a.a.v0.b.b0> i;
    public final e j;
    public final j k;
    public final g l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(a.a.a.a.v0.f.d dVar, j jVar, g gVar, a aVar, Map map, a.a.a.a.v0.f.d dVar2, int i2) {
        super(h.a.f321a, dVar);
        int i3 = i2 & 8;
        map = (i2 & 16) != 0 ? m.f2120c : map;
        int i4 = i2 & 32;
        if (dVar == null) {
            i.a("moduleName");
            throw null;
        } else if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (gVar == null) {
            i.a("builtIns");
            throw null;
        } else if (map == null) {
            i.a("capabilities");
            throw null;
        } else if (h.b != null) {
            this.k = jVar;
            this.l = gVar;
            if (dVar.f1352d) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                this.f361e = linkedHashMap;
                linkedHashMap.put(a.a.a.a.v0.m.i1.g.f1874a, new n(null));
                this.f364h = true;
                this.i = this.k.a(new a0(this));
                this.j = e.f.a.g.m92a((a.w.b.a) new z(this));
                return;
            }
            throw new IllegalArgumentException("Module name must be special: " + dVar);
        } else {
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.w
    public List<w> E0() {
        x xVar = this.f362f;
        if (xVar != null) {
            return xVar.b();
        }
        StringBuilder a2 = e.a.a.a.a.a("Dependencies of module ");
        a2.append(r0());
        a2.append(" were not set");
        throw new AssertionError(a2.toString());
    }

    public void U() {
        if (!this.f364h) {
            throw new t("Accessing invalid module descriptor " + this);
        }
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(a.a.a.a.v0.b.m<R, D> mVar, D d2) {
        if (mVar != null) {
            return mVar.a(this, d2);
        }
        i.a("visitor");
        throw null;
    }

    @Override // a.a.a.a.v0.b.k
    public k b() {
        return null;
    }

    @Override // a.a.a.a.v0.b.w
    public g m() {
        return this.l;
    }

    public final String r0() {
        String str = d().f1351c;
        i.a((Object) str, "name.toString()");
        return str;
    }

    @Override // a.a.a.a.v0.b.w
    public <T> T a(w.a<T> aVar) {
        if (aVar != null) {
            T t = (T) this.f361e.get(aVar);
            if (!(t instanceof Object)) {
                return null;
            }
            return t;
        }
        i.a("capability");
        throw null;
    }

    @Override // a.a.a.a.v0.b.w
    public a.a.a.a.v0.b.b0 a(b bVar) {
        if (bVar != null) {
            U();
            return this.i.a(bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.b.w
    public Collection<b> a(b bVar, l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
        if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (lVar != null) {
            U();
            U();
            return ((l) this.j.getValue()).a(bVar, lVar);
        } else {
            i.a("nameFilter");
            throw null;
        }
    }

    public final void a(z zVar) {
        if (zVar != null) {
            boolean z = !(this.f363g != null);
            if (!s.f2103a || z) {
                this.f363g = zVar;
                return;
            }
            StringBuilder a2 = e.a.a.a.a.a("Attempt to initialize module ");
            a2.append(r0());
            a2.append(" twice");
            throw new AssertionError(a2.toString());
        }
        i.a("providerForModuleContent");
        throw null;
    }

    public final void a(b0... b0VarArr) {
        if (b0VarArr != null) {
            List k2 = e.f.a.g.k(b0VarArr);
            if (k2 != null) {
                y yVar = new y(k2, a.t.n.f2121c, a.t.l.f2119c);
                boolean z = this.f362f == null;
                if (!s.f2103a || z) {
                    this.f362f = yVar;
                    return;
                }
                StringBuilder a2 = e.a.a.a.a.a("Dependencies of ");
                a2.append(r0());
                a2.append(" were already set");
                throw new AssertionError(a2.toString());
            }
            i.a("descriptors");
            throw null;
        }
        i.a("descriptors");
        throw null;
    }

    @Override // a.a.a.a.v0.b.w
    public boolean a(w wVar) {
        if (wVar == null) {
            i.a("targetModule");
            throw null;
        } else if (i.a(this, wVar)) {
            return true;
        } else {
            x xVar = this.f362f;
            if (xVar != null) {
                return f.a(xVar.a(), wVar) || E0().contains(wVar) || wVar.E0().contains(this);
            }
            i.a();
            throw null;
        }
    }
}
