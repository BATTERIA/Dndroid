package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.e.b;
import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.h;
import a.a.a.a.v0.e.l0;
import a.a.a.a.v0.e.n;
import a.a.a.a.v0.e.p0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.e.z;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.k.a;
import a.a.a.a.v0.k.b.y;
import a.a.a.a.v0.m.d0;
import a.t.l;
import a.w.c.i;
import java.util.ArrayList;
import java.util.List;

public final class d implements c<c, g<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final e f1668a;
    public final a b;

    public d(w wVar, x xVar, a aVar) {
        if (wVar == null) {
            i.a("module");
            throw null;
        } else if (xVar == null) {
            i.a("notFoundClasses");
            throw null;
        } else if (aVar != null) {
            this.b = aVar;
            this.f1668a = new e(wVar, xVar);
        } else {
            i.a("protocol");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(y yVar, q qVar, b bVar) {
        i.d dVar;
        Object obj;
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (qVar == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (bVar != null) {
            if (qVar instanceof h) {
                dVar = (h) qVar;
                obj = this.b.b;
            } else if (qVar instanceof r) {
                dVar = (r) qVar;
                obj = this.b.f1641d;
            } else if (qVar instanceof z) {
                int ordinal = bVar.ordinal();
                if (ordinal == 1) {
                    dVar = (z) qVar;
                    obj = this.b.f1642e;
                } else if (ordinal == 2) {
                    dVar = (z) qVar;
                    obj = this.b.f1643f;
                } else if (ordinal == 3) {
                    dVar = (z) qVar;
                    obj = this.b.f1644g;
                } else {
                    throw new IllegalStateException("Unsupported callable kind with property proto".toString());
                }
            } else {
                throw new IllegalStateException(("Unknown message: " + qVar).toString());
            }
            Iterable<b> iterable = (List) dVar.a((i.g) obj);
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(e.f.a.g.a(iterable, 10));
            for (b bVar2 : iterable) {
                arrayList.add(this.f1668a.a(bVar2, yVar.f1779a));
            }
            return arrayList;
        } else {
            a.w.c.i.a("kind");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> b(y yVar, q qVar, b bVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (qVar == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (bVar != null) {
            return l.f2119c;
        } else {
            a.w.c.i.a("kind");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> b(y yVar, z zVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (zVar != null) {
            return l.f2119c;
        } else {
            a.w.c.i.a("proto");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(y.a aVar) {
        if (aVar != null) {
            Iterable<b> iterable = (List) aVar.f1784g.a(this.b.f1640c);
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(e.f.a.g.a(iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(this.f1668a.a(bVar, aVar.f1779a));
            }
            return arrayList;
        }
        a.w.c.i.a("container");
        throw null;
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(y yVar, n nVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (nVar != null) {
            Iterable<b> iterable = (List) nVar.a(this.b.f1645h);
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(e.f.a.g.a(iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(this.f1668a.a(bVar, yVar.f1779a));
            }
            return arrayList;
        } else {
            a.w.c.i.a("proto");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(y yVar, z zVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (zVar != null) {
            return l.f2119c;
        } else {
            a.w.c.i.a("proto");
            throw null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.a.a.a.v0.k.b.c
    public g<?> a(y yVar, z zVar, d0 d0Var) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (zVar == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (d0Var != null) {
            b.C0039b.c cVar = (b.C0039b.c) e.f.a.g.a(zVar, this.b.i);
            if (cVar != null) {
                return this.f1668a.a(d0Var, cVar, yVar.f1779a);
            }
            return null;
        } else {
            a.w.c.i.a("expectedType");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(g0 g0Var, a.a.a.a.v0.e.x0.c cVar) {
        if (g0Var == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (cVar != null) {
            Iterable<b> iterable = (List) g0Var.a(this.b.k);
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(e.f.a.g.a(iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(this.f1668a.a(bVar, cVar));
            }
            return arrayList;
        } else {
            a.w.c.i.a("nameResolver");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(l0 l0Var, a.a.a.a.v0.e.x0.c cVar) {
        if (l0Var == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (cVar != null) {
            Iterable<b> iterable = (List) l0Var.a(this.b.l);
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(e.f.a.g.a(iterable, 10));
            for (b bVar : iterable) {
                arrayList.add(this.f1668a.a(bVar, cVar));
            }
            return arrayList;
        } else {
            a.w.c.i.a("nameResolver");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<c> a(y yVar, q qVar, b bVar, int i, p0 p0Var) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (qVar == null) {
            a.w.c.i.a("callableProto");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("kind");
            throw null;
        } else if (p0Var != null) {
            Iterable<b> iterable = (List) p0Var.a(this.b.j);
            if (iterable == null) {
                iterable = l.f2119c;
            }
            ArrayList arrayList = new ArrayList(e.f.a.g.a(iterable, 10));
            for (b bVar2 : iterable) {
                arrayList.add(this.f1668a.a(bVar2, yVar.f1779a));
            }
            return arrayList;
        } else {
            a.w.c.i.a("proto");
            throw null;
        }
    }
}
