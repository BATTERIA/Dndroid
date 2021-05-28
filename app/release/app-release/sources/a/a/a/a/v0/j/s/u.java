package a.a.a.a.v0.j.s;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.x0;
import a.w.c.f;
import a.w.c.i;

public final class u extends g<a> {

    public static abstract class a {

        /* renamed from: a.a.a.a.v0.j.s.u$a$a  reason: collision with other inner class name */
        public static final class C0061a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final d0 f1591a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0061a(d0 d0Var) {
                super(null);
                if (d0Var != null) {
                    this.f1591a = d0Var;
                    return;
                }
                i.a("type");
                throw null;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C0061a) && i.a(this.f1591a, ((C0061a) obj).f1591a);
                }
                return true;
            }

            public int hashCode() {
                d0 d0Var = this.f1591a;
                if (d0Var != null) {
                    return d0Var.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a2 = e.a.a.a.a.a("LocalClass(type=");
                a2.append(this.f1591a);
                a2.append(")");
                return a2.toString();
            }
        }

        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final f f1592a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(f fVar) {
                super(null);
                if (fVar != null) {
                    this.f1592a = fVar;
                    return;
                }
                i.a("value");
                throw null;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof b) && i.a(this.f1592a, ((b) obj).f1592a);
                }
                return true;
            }

            public int hashCode() {
                f fVar = this.f1592a;
                if (fVar != null) {
                    return fVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder a2 = e.a.a.a.a.a("NormalClass(value=");
                a2.append(this.f1592a);
                a2.append(")");
                return a2.toString();
            }
        }

        public a() {
        }

        public /* synthetic */ a(f fVar) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(a.a.a.a.v0.f.a aVar, int i) {
        this(new f(aVar, i));
        if (aVar != null) {
        } else {
            i.a("classId");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.s.g
    public d0 a(w wVar) {
        d0 d0Var;
        if (wVar == null) {
            i.a("module");
            throw null;
        } else if (h.b != null) {
            h hVar = h.a.f321a;
            g m = wVar.m();
            if (m != null) {
                e a2 = m.a(g.k.W.g());
                if (a2 != null) {
                    i.a((Object) a2, "module.builtIns.kClass");
                    T t = this.f1578a;
                    T t2 = t;
                    if (t2 instanceof a.C0061a) {
                        d0Var = t.f1591a;
                    } else if (t2 instanceof a.b) {
                        f fVar = t.f1592a;
                        a.a.a.a.v0.f.a aVar = fVar.f1577a;
                        int i = fVar.b;
                        e a3 = e.f.a.g.a(wVar, aVar);
                        if (a3 != null) {
                            k0 v = a3.v();
                            i.a((Object) v, "descriptor.defaultType");
                            d0 e2 = a.a.a.a.v0.m.l1.a.e(v);
                            for (int i2 = 0; i2 < i; i2++) {
                                e2 = wVar.m().a(g1.INVARIANT, e2);
                                i.a((Object) e2, "module.builtIns.getArray…Variance.INVARIANT, type)");
                            }
                            d0Var = e2;
                        } else {
                            d0Var = a.a.a.a.v0.m.w.b("Unresolved type: " + aVar + " (arrayDimensions=" + i + ')');
                            i.a((Object) d0Var, "ErrorUtils.createErrorTy…sions=$arrayDimensions)\")");
                        }
                    } else {
                        throw new a.h();
                    }
                    return e0.a(hVar, a2, e.f.a.g.c(new x0(d0Var)));
                }
                g.b(19);
                throw null;
            }
            throw null;
        } else {
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(f fVar) {
        super(new a.b(fVar));
        if (fVar != null) {
        } else {
            i.a("value");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(a aVar) {
        super(aVar);
        if (aVar != null) {
        } else {
            i.a("value");
            throw null;
        }
    }
}
