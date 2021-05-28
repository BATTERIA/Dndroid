package a.a.a.a.v0.d.a;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.z.f;
import a.a.a.a.v0.j.h;
import a.a.a.a.v0.j.l;
import a.a.a.a.v0.m.d0;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.util.Iterator;
import java.util.List;

public final class j implements h {

    public static final class a extends a.w.c.j implements l<w0, d0> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f803c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public d0 a(w0 w0Var) {
            w0 w0Var2 = w0Var;
            i.a((Object) w0Var2, "it");
            return w0Var2.c();
        }
    }

    @Override // a.a.a.a.v0.j.h
    public h.a a() {
        return h.a.SUCCESS_ONLY;
    }

    @Override // a.a.a.a.v0.j.h
    public h.b a(a.a.a.a.v0.b.a aVar, a.a.a.a.v0.b.a aVar2, e eVar) {
        boolean z;
        boolean z2;
        if (aVar == null) {
            i.a("superDescriptor");
            throw null;
        } else if (aVar2 != null) {
            if (aVar2 instanceof f) {
                f fVar = (f) aVar2;
                List<r0> k = fVar.k();
                i.a((Object) k, "subDescriptor.typeParameters");
                if (!(!k.isEmpty())) {
                    l.d a2 = a.a.a.a.v0.j.l.a(aVar, aVar2);
                    if ((a2 != null ? a2.a() : null) != null) {
                        return h.b.UNKNOWN;
                    }
                    List<w0> j = fVar.j();
                    i.a((Object) j, "subDescriptor.valueParameters");
                    a.z.h d2 = a.a.a.a.v0.m.l1.a.d(a.t.f.a((Iterable) j), a.f803c);
                    d0 d0Var = fVar.i;
                    if (d0Var != null) {
                        a.z.h a3 = a.a.a.a.v0.m.l1.a.a(d2, d0Var);
                        i0 i0Var = fVar.j;
                        List d3 = g.d((Object) (i0Var != null ? i0Var.c() : null));
                        if (a3 == null) {
                            i.a("$this$plus");
                            throw null;
                        } else if (d3 != null) {
                            Iterator it = a.a.a.a.v0.m.l1.a.a(a.a.a.a.v0.m.l1.a.a(a3, a.t.f.a((Iterable) d3))).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                d0 d0Var2 = (d0) it.next();
                                if (!(!d0Var2.H0().isEmpty()) || (d0Var2.K0() instanceof a.a.a.a.v0.d.a.a0.o.i)) {
                                    z2 = false;
                                    continue;
                                } else {
                                    z2 = true;
                                    continue;
                                }
                                if (z2) {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                return h.b.UNKNOWN;
                            }
                            a.a.a.a.v0.b.a aVar3 = (a.a.a.a.v0.b.a) aVar.a(a.a.a.a.v0.d.a.a0.o.h.f669d.c());
                            if (aVar3 == null) {
                                return h.b.UNKNOWN;
                            }
                            if (aVar3 instanceof l0) {
                                l0 l0Var = (l0) aVar3;
                                List<r0> k2 = l0Var.k();
                                i.a((Object) k2, "erasedSuper.typeParameters");
                                if ((!k2.isEmpty()) && (aVar3 = l0Var.s().b(a.t.l.f2119c).a()) == null) {
                                    i.a();
                                    throw null;
                                }
                            }
                            l.d a4 = a.a.a.a.v0.j.l.f1556d.a(aVar3, aVar2, false);
                            i.a((Object) a4, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                            l.d.a a5 = a4.a();
                            i.a((Object) a5, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                            return a5.ordinal() != 0 ? h.b.UNKNOWN : h.b.OVERRIDABLE;
                        } else {
                            i.a("elements");
                            throw null;
                        }
                    } else {
                        i.a();
                        throw null;
                    }
                }
            }
            return h.b.UNKNOWN;
        } else {
            i.a("subDescriptor");
            throw null;
        }
    }
}
