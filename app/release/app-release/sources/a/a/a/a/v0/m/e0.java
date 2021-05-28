package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.w;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.j.s.r;
import a.a.a.a.v0.m.i1.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.util.List;

public final class e0 {

    /* renamed from: a */
    public static final e0 f1828a = new e0();

    public static final class a extends j implements l<f, k0> {

        /* renamed from: c */
        public final /* synthetic */ s0 f1829c;

        /* renamed from: d */
        public final /* synthetic */ List f1830d;

        /* renamed from: e */
        public final /* synthetic */ h f1831e;

        /* renamed from: f */
        public final /* synthetic */ boolean f1832f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, List list, h hVar, boolean z) {
            super(1);
            this.f1829c = s0Var;
            this.f1830d = list;
            this.f1831e = hVar;
            this.f1832f = z;
        }

        @Override // a.w.b.l
        public k0 a(f fVar) {
            f fVar2 = fVar;
            if (fVar2 != null) {
                a.a.a.a.v0.b.h c2 = this.f1829c.c();
                if (c2 != null) {
                    fVar2.a(c2);
                }
                return null;
            }
            i.a("refiner");
            throw null;
        }
    }

    public static final class b extends j implements l<f, k0> {

        /* renamed from: c */
        public final /* synthetic */ s0 f1833c;

        /* renamed from: d */
        public final /* synthetic */ List f1834d;

        /* renamed from: e */
        public final /* synthetic */ h f1835e;

        /* renamed from: f */
        public final /* synthetic */ boolean f1836f;

        /* renamed from: g */
        public final /* synthetic */ a.a.a.a.v0.j.w.i f1837g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(s0 s0Var, List list, h hVar, boolean z, a.a.a.a.v0.j.w.i iVar) {
            super(1);
            this.f1833c = s0Var;
            this.f1834d = list;
            this.f1835e = hVar;
            this.f1836f = z;
            this.f1837g = iVar;
        }

        @Override // a.w.b.l
        public k0 a(f fVar) {
            f fVar2 = fVar;
            if (fVar2 != null) {
                a.a.a.a.v0.b.h c2 = this.f1833c.c();
                if (c2 != null) {
                    fVar2.a(c2);
                }
                return null;
            }
            i.a("kotlinTypeRefiner");
            throw null;
        }
    }

    public static final f1 a(k0 k0Var, k0 k0Var2) {
        if (k0Var == null) {
            i.a("lowerBound");
            throw null;
        } else if (k0Var2 != null) {
            return i.a(k0Var, k0Var2) ? k0Var : new y(k0Var, k0Var2);
        } else {
            i.a("upperBound");
            throw null;
        }
    }

    public static /* synthetic */ k0 a(h hVar, s0 s0Var, List list, boolean z, f fVar, int i) {
        if ((i & 16) != 0) {
            fVar = null;
        }
        return a(hVar, s0Var, list, z, fVar);
    }

    public static final k0 a(h hVar, r rVar, boolean z) {
        if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (rVar != null) {
            a.t.l lVar = a.t.l.f2119c;
            a.a.a.a.v0.j.w.i a2 = w.a("Scope for integer literal type", true);
            i.a((Object) a2, "ErrorUtils.createErrorSc…eger literal type\", true)");
            return a(hVar, rVar, lVar, z, a2);
        } else {
            i.a("constructor");
            throw null;
        }
    }

    public static final k0 a(h hVar, e eVar, List<? extends v0> list) {
        if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (eVar == null) {
            i.a("descriptor");
            throw null;
        } else if (list != null) {
            s0 n = eVar.n();
            i.a((Object) n, "descriptor.typeConstructor");
            return a(hVar, n, (List) list, false, (f) null, 16);
        } else {
            i.a("arguments");
            throw null;
        }
    }

    public static final k0 a(h hVar, s0 s0Var, List<? extends v0> list, boolean z, f fVar) {
        a.a.a.a.v0.j.w.i a2;
        w wVar = null;
        if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (s0Var == null) {
            i.a("constructor");
            throw null;
        } else if (list == null) {
            i.a("arguments");
            throw null;
        } else if (!hVar.isEmpty() || !list.isEmpty() || z || s0Var.c() == null) {
            a.a.a.a.v0.b.h c2 = s0Var.c();
            if (c2 instanceof r0) {
                a2 = c2.v().u();
            } else if (c2 instanceof e) {
                if (fVar == null) {
                    fVar = a.a.a.a.v0.j.u.a.a(a.a.a.a.v0.j.u.a.e(c2));
                }
                e eVar = (e) c2;
                if (!list.isEmpty()) {
                    y0 a3 = u0.b.a(s0Var, list);
                    if (eVar == null) {
                        i.a("$this$getRefinedMemberScopeIfPossible");
                        throw null;
                    } else if (a3 == null) {
                        i.a("typeSubstitution");
                        throw null;
                    } else if (fVar != null) {
                        if (eVar instanceof w) {
                            wVar = eVar;
                        }
                        w wVar2 = wVar;
                        if (wVar2 == null || (a2 = wVar2.a(a3, fVar)) == null) {
                            a2 = eVar.a(a3);
                            i.a((Object) a2, "this.getMemberScope(\n   …ubstitution\n            )");
                        }
                    } else {
                        i.a("kotlinTypeRefiner");
                        throw null;
                    }
                } else if (eVar == null) {
                    i.a("$this$getRefinedUnsubstitutedMemberScopeIfPossible");
                    throw null;
                } else if (fVar != null) {
                    if (eVar instanceof w) {
                        wVar = eVar;
                    }
                    w wVar3 = (w) wVar;
                    if (wVar3 == null || (a2 = wVar3.a(fVar)) == null) {
                        a2 = eVar.i0();
                        i.a((Object) a2, "this.unsubstitutedMemberScope");
                    }
                } else {
                    i.a("kotlinTypeRefiner");
                    throw null;
                }
            } else if (c2 instanceof q0) {
                StringBuilder a4 = e.a.a.a.a.a("Scope for abbreviation: ");
                a4.append(((q0) c2).d());
                a2 = w.a(a4.toString(), true);
                i.a((Object) a2, "ErrorUtils.createErrorSc…{descriptor.name}\", true)");
            } else {
                throw new IllegalStateException("Unsupported classifier: " + c2 + " for constructor: " + s0Var);
            }
            return a(hVar, s0Var, list, z, a2, new a(s0Var, list, hVar, z));
        } else {
            a.a.a.a.v0.b.h c3 = s0Var.c();
            if (c3 != null) {
                i.a((Object) c3, "constructor.declarationDescriptor!!");
                k0 v = c3.v();
                i.a((Object) v, "constructor.declarationDescriptor!!.defaultType");
                return v;
            }
            i.a();
            throw null;
        }
    }

    public static final k0 a(h hVar, s0 s0Var, List<? extends v0> list, boolean z, a.a.a.a.v0.j.w.i iVar) {
        if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (s0Var == null) {
            i.a("constructor");
            throw null;
        } else if (list == null) {
            i.a("arguments");
            throw null;
        } else if (iVar != null) {
            l0 l0Var = new l0(s0Var, list, z, iVar, new b(s0Var, list, hVar, z, iVar));
            return hVar.isEmpty() ? l0Var : new m(l0Var, hVar);
        } else {
            i.a("memberScope");
            throw null;
        }
    }

    public static final k0 a(h hVar, s0 s0Var, List<? extends v0> list, boolean z, a.a.a.a.v0.j.w.i iVar, l<? super f, ? extends k0> lVar) {
        if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (s0Var == null) {
            i.a("constructor");
            throw null;
        } else if (list == null) {
            i.a("arguments");
            throw null;
        } else if (iVar == null) {
            i.a("memberScope");
            throw null;
        } else if (lVar != null) {
            l0 l0Var = new l0(s0Var, list, z, iVar, lVar);
            return hVar.isEmpty() ? l0Var : new m(l0Var, hVar);
        } else {
            i.a("refinedTypeFactory");
            throw null;
        }
    }
}
