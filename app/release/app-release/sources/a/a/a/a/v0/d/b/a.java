package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.d.a.s;
import a.a.a.a.v0.d.b.l;
import a.a.a.a.v0.e.f;
import a.a.a.a.v0.e.g0;
import a.a.a.a.v0.e.h;
import a.a.a.a.v0.e.l0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.y0.a;
import a.a.a.a.v0.e.y0.g.e;
import a.a.a.a.v0.e.z;
import a.a.a.a.v0.h.i;
import a.a.a.a.v0.h.q;
import a.a.a.a.v0.k.b.y;
import a.n;
import a.t.f;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class a<A, C> implements a.a.a.a.v0.k.b.c<A, C> {

    /* renamed from: c */
    public static final Set<a.a.a.a.v0.f.a> f874c;

    /* renamed from: a */
    public final a.a.a.a.v0.l.d<l, b<A, C>> f875a;
    public final k b;

    /* renamed from: a.a.a.a.v0.d.b.a$a */
    public enum EnumC0032a {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    public static final class b<A, C> {

        /* renamed from: a */
        public final Map<o, List<A>> f880a;
        public final Map<o, C> b;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<a.a.a.a.v0.d.b.o, ? extends java.util.List<? extends A>> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<a.a.a.a.v0.d.b.o, ? extends C> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Map<o, ? extends List<? extends A>> map, Map<o, ? extends C> map2) {
            if (map == 0) {
                i.a("memberAnnotations");
                throw null;
            } else if (map2 != 0) {
                this.f880a = map;
                this.b = map2;
            } else {
                i.a("propertyConstants");
                throw null;
            }
        }
    }

    public static final class c implements l.c {

        /* renamed from: a */
        public final /* synthetic */ a f881a;
        public final /* synthetic */ ArrayList b;

        public c(a aVar, ArrayList arrayList) {
            this.f881a = aVar;
            this.b = arrayList;
        }

        @Override // a.a.a.a.v0.d.b.l.c
        public l.a a(a.a.a.a.v0.f.a aVar, m0 m0Var) {
            if (aVar == null) {
                i.a("classId");
                throw null;
            } else if (m0Var != null) {
                return a.a(this.f881a, aVar, m0Var, this.b);
            } else {
                i.a("source");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.c
        public void a() {
        }
    }

    public static final class d extends j implements a.w.b.l<l, b<? extends A, ? extends C>> {

        /* renamed from: c */
        public final /* synthetic */ a f882c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(a aVar) {
            super(1);
            this.f882c = aVar;
        }

        @Override // a.w.b.l
        public Object a(l lVar) {
            l lVar2 = lVar;
            if (lVar2 != null) {
                a aVar = this.f882c;
                if (aVar != null) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    lVar2.a(new b(aVar, hashMap, hashMap2), (byte[]) null);
                    return new b(hashMap, hashMap2);
                }
                throw null;
            }
            i.a("kotlinClass");
            throw null;
        }
    }

    static {
        List<a.a.a.a.v0.f.b> g2 = g.g(s.f811a, s.f812c, s.f813d, new a.a.a.a.v0.f.b("java.lang.annotation.Target"), new a.a.a.a.v0.f.b("java.lang.annotation.Retention"), new a.a.a.a.v0.f.b("java.lang.annotation.Documented"));
        ArrayList arrayList = new ArrayList(g.a((Iterable) g2, 10));
        for (a.a.a.a.v0.f.b bVar : g2) {
            arrayList.add(a.a.a.a.v0.f.a.a(bVar));
        }
        f874c = f.k(arrayList);
    }

    public a(a.a.a.a.v0.l.j jVar, k kVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (kVar != null) {
            this.b = kVar;
            this.f875a = jVar.a(new d(this));
        } else {
            i.a("kotlinClassFinder");
            throw null;
        }
    }

    public static final /* synthetic */ l.a a(a aVar, a.a.a.a.v0.f.a aVar2, m0 m0Var, List list) {
        if (aVar == null) {
            throw null;
        } else if (f874c.contains(aVar2)) {
            return null;
        } else {
            return aVar.a(aVar2, m0Var, list);
        }
    }

    public static /* synthetic */ o a(a aVar, z zVar, a.a.a.a.v0.e.x0.c cVar, e eVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return aVar.a(zVar, cVar, eVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    public static /* synthetic */ o a(a aVar, q qVar, a.a.a.a.v0.e.x0.c cVar, e eVar, a.a.a.a.v0.k.b.b bVar, boolean z, int i, Object obj) {
        if (obj == null) {
            return aVar.a(qVar, cVar, eVar, bVar, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    public static /* synthetic */ List a(a aVar, y yVar, o oVar, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return aVar.a(yVar, oVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public abstract l.a a(a.a.a.a.v0.f.a aVar, m0 m0Var, List<A> list);

    public abstract A a(a.a.a.a.v0.e.b bVar, a.a.a.a.v0.e.x0.c cVar);

    @Override // a.a.a.a.v0.k.b.c
    public List<A> b(y yVar, q qVar, a.a.a.a.v0.k.b.b bVar) {
        if (yVar == null) {
            i.a("container");
            throw null;
        } else if (qVar == null) {
            i.a("proto");
            throw null;
        } else if (bVar != null) {
            o a2 = a(this, qVar, yVar.f1779a, yVar.b, bVar, false, 16, null);
            if (a2 != null) {
                return a((a) this, yVar, o.a(a2, 0), false, false, (Boolean) null, false, 60, (Object) null);
            }
            return a.t.l.f2119c;
        } else {
            i.a("kind");
            throw null;
        }
    }

    public final List<A> a(y yVar, o oVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        l a2 = a(yVar, z, z2, bool, z3);
        if (a2 == null) {
            a2 = yVar instanceof y.a ? b((y.a) yVar) : null;
        }
        if (a2 == null) {
            return a.t.l.f2119c;
        }
        List<A> list = this.f875a.a(a2).f880a.get(oVar);
        return list != null ? list : a.t.l.f2119c;
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> b(y yVar, z zVar) {
        if (yVar == null) {
            i.a("container");
            throw null;
        } else if (zVar != null) {
            return a(yVar, zVar, EnumC0032a.DELEGATE_FIELD);
        } else {
            i.a("proto");
            throw null;
        }
    }

    public final o a(q qVar, a.a.a.a.v0.e.x0.c cVar, e eVar, a.a.a.a.v0.k.b.b bVar, boolean z) {
        e.b bVar2;
        String str;
        a.c cVar2;
        if (qVar instanceof h) {
            bVar2 = a.a.a.a.v0.e.y0.g.h.b.a((h) qVar, cVar, eVar);
            if (bVar2 == null) {
                return null;
            }
        } else if (qVar instanceof r) {
            bVar2 = a.a.a.a.v0.e.y0.g.h.b.a((r) qVar, cVar, eVar);
            if (bVar2 == null) {
                return null;
            }
        } else if (!(qVar instanceof z)) {
            return null;
        } else {
            i.g<z, a.d> gVar = a.a.a.a.v0.e.y0.a.f1261d;
            a.w.c.i.a((Object) gVar, "propertySignature");
            a.d dVar = (a.d) g.a((i.d) qVar, gVar);
            if (dVar == null) {
                return null;
            }
            int ordinal = bVar.ordinal();
            if (ordinal == 1) {
                return a((z) qVar, cVar, eVar, true, true, z);
            }
            if (ordinal != 2) {
                if (ordinal != 3 || !dVar.i()) {
                    return null;
                }
                cVar2 = dVar.f1289h;
                str = "signature.setter";
            } else if (!dVar.h()) {
                return null;
            } else {
                cVar2 = dVar.f1288g;
                str = "signature.getter";
            }
            a.w.c.i.a((Object) cVar2, str);
            return o.a(cVar, cVar2);
        }
        return o.a(bVar2);
    }

    public final l b(y.a aVar) {
        m0 m0Var = aVar.f1780c;
        if (!(m0Var instanceof n)) {
            m0Var = null;
        }
        n nVar = (n) m0Var;
        if (nVar != null) {
            return nVar.b;
        }
        return null;
    }

    public final o a(z zVar, a.a.a.a.v0.e.x0.c cVar, a.a.a.a.v0.e.x0.e eVar, boolean z, boolean z2, boolean z3) {
        i.g<z, a.d> gVar = a.a.a.a.v0.e.y0.a.f1261d;
        a.w.c.i.a((Object) gVar, "propertySignature");
        a.d dVar = (a.d) g.a(zVar, gVar);
        if (dVar != null) {
            if (z) {
                e.a a2 = a.a.a.a.v0.e.y0.g.h.b.a(zVar, cVar, eVar, z3);
                if (a2 != null) {
                    return o.a(a2);
                }
                return null;
            } else if (z2) {
                if ((dVar.f1285d & 2) == 2) {
                    a.c cVar2 = dVar.f1287f;
                    a.w.c.i.a((Object) cVar2, "signature.syntheticMethod");
                    return o.a(cVar, cVar2);
                }
            }
        }
        return null;
    }

    public final l a(y yVar, boolean z, boolean z2, Boolean bool, boolean z3) {
        y.a aVar;
        f.c cVar;
        String str;
        a.a.a.a.v0.f.a aVar2;
        k kVar;
        if (z) {
            if (bool != null) {
                if (yVar instanceof y.a) {
                    y.a aVar3 = (y.a) yVar;
                    if (aVar3.f1782e == f.c.INTERFACE) {
                        kVar = this.b;
                        aVar2 = aVar3.f1781d.a(a.a.a.a.v0.f.d.b("DefaultImpls"));
                        str = "container.classId.create…EFAULT_IMPLS_CLASS_NAME))";
                        a.w.c.i.a((Object) aVar2, str);
                        return g.a(kVar, aVar2);
                    }
                }
                if (bool.booleanValue() && (yVar instanceof y.b)) {
                    m0 m0Var = yVar.f1780c;
                    if (!(m0Var instanceof g)) {
                        m0Var = null;
                    }
                    g gVar = (g) m0Var;
                    a.a.a.a.v0.j.v.b bVar = gVar != null ? gVar.f910c : null;
                    if (bVar != null) {
                        kVar = this.b;
                        String a2 = bVar.a();
                        a.w.c.i.a((Object) a2, "facadeClassName.internalName");
                        aVar2 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b(a.a.a.a.v0.m.l1.a.a(a2, '/', '.', false, 4)));
                        str = "ClassId.topLevel(FqName(…lName.replace('/', '.')))";
                        a.w.c.i.a((Object) aVar2, str);
                        return g.a(kVar, aVar2);
                    }
                }
            } else {
                throw new IllegalStateException(("isConst should not be null for property (container=" + yVar + ')').toString());
            }
        }
        if (z2 && (yVar instanceof y.a)) {
            y.a aVar4 = (y.a) yVar;
            if (aVar4.f1782e == f.c.COMPANION_OBJECT && (aVar = aVar4.f1785h) != null && ((cVar = aVar.f1782e) == f.c.CLASS || cVar == f.c.ENUM_CLASS || (z3 && (cVar == f.c.INTERFACE || cVar == f.c.ANNOTATION_CLASS)))) {
                return b(aVar);
            }
        }
        if (yVar instanceof y.b) {
            m0 m0Var2 = yVar.f1780c;
            if (m0Var2 instanceof g) {
                if (m0Var2 != null) {
                    g gVar2 = (g) m0Var2;
                    l lVar = gVar2.f911d;
                    return lVar != null ? lVar : g.a(this.b, gVar2.d());
                }
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
            }
        }
        return null;
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> a(y yVar, q qVar, a.a.a.a.v0.k.b.b bVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (qVar == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("kind");
            throw null;
        } else if (bVar == a.a.a.a.v0.k.b.b.PROPERTY) {
            return a(yVar, (z) qVar, EnumC0032a.PROPERTY);
        } else {
            o a2 = a(this, qVar, yVar.f1779a, yVar.b, bVar, false, 16, null);
            if (a2 != null) {
                return a((a) this, yVar, a2, false, false, (Boolean) null, false, 60, (Object) null);
            }
            return a.t.l.f2119c;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> a(y.a aVar) {
        if (aVar != null) {
            l b2 = b(aVar);
            if (b2 != null) {
                ArrayList arrayList = new ArrayList(1);
                b2.a(new c(this, arrayList), (byte[]) null);
                return arrayList;
            }
            StringBuilder a2 = e.a.a.a.a.a("Class for loading annotations is not found: ");
            a.a.a.a.v0.f.b a3 = aVar.f1781d.a();
            a.w.c.i.a((Object) a3, "classId.asSingleFqName()");
            a2.append(a3);
            throw new IllegalStateException(a2.toString().toString());
        }
        a.w.c.i.a("container");
        throw null;
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> a(y yVar, a.a.a.a.v0.e.n nVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (nVar != null) {
            String a2 = yVar.f1779a.a(nVar.f1116f);
            String b2 = ((y.a) yVar).f1781d.b();
            a.w.c.i.a((Object) b2, "(container as ProtoConta…Class).classId.asString()");
            return a((a) this, yVar, o.a(a2, a.a.a.a.v0.e.y0.g.b.a(b2)), false, false, (Boolean) null, false, 60, (Object) null);
        } else {
            a.w.c.i.a("proto");
            throw null;
        }
    }

    public final List<A> a(y yVar, z zVar, EnumC0032a aVar) {
        boolean a2 = e.a.a.a.a.a(a.a.a.a.v0.e.x0.b.w, zVar.f1335f, "Flags.IS_CONST.get(proto.flags)");
        boolean a3 = a.a.a.a.v0.e.y0.g.h.a(zVar);
        if (aVar == EnumC0032a.PROPERTY) {
            o a4 = a((a) this, zVar, yVar.f1779a, yVar.b, false, true, false, 40, (Object) null);
            if (a4 != null) {
                return a((a) this, yVar, a4, true, false, Boolean.valueOf(a2), a3, 8, (Object) null);
            }
            return a.t.l.f2119c;
        }
        o a5 = a((a) this, zVar, yVar.f1779a, yVar.b, true, false, false, 48, (Object) null);
        if (a5 == null) {
            return a.t.l.f2119c;
        }
        boolean z = false;
        boolean a6 = a.a0.i.a((CharSequence) a5.f918a, (CharSequence) "$delegate", false, 2);
        if (aVar == EnumC0032a.DELEGATE_FIELD) {
            z = true;
        }
        if (a6 != z) {
            return a.t.l.f2119c;
        }
        return a(yVar, a5, true, true, Boolean.valueOf(a2), a3);
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> a(y yVar, z zVar) {
        if (yVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (zVar != null) {
            return a(yVar, zVar, EnumC0032a.BACKING_FIELD);
        } else {
            a.w.c.i.a("proto");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc A[RETURN] */
    @Override // a.a.a.a.v0.k.b.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C a(a.a.a.a.v0.k.b.y r9, a.a.a.a.v0.e.z r10, a.a.a.a.v0.m.d0 r11) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.b.a.a(a.a.a.a.v0.k.b.y, a.a.a.a.v0.e.z, a.a.a.a.v0.m.d0):java.lang.Object");
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> a(g0 g0Var, a.a.a.a.v0.e.x0.c cVar) {
        if (g0Var == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (cVar != null) {
            Object a2 = g0Var.a(a.a.a.a.v0.e.y0.a.f1263f);
            a.w.c.i.a(a2, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
            Iterable<a.a.a.a.v0.e.b> iterable = (Iterable) a2;
            ArrayList arrayList = new ArrayList(g.a(iterable, 10));
            for (a.a.a.a.v0.e.b bVar : iterable) {
                a.w.c.i.a((Object) bVar, "it");
                arrayList.add(a(bVar, cVar));
            }
            return arrayList;
        } else {
            a.w.c.i.a("nameResolver");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.c
    public List<A> a(l0 l0Var, a.a.a.a.v0.e.x0.c cVar) {
        if (l0Var == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (cVar != null) {
            Object a2 = l0Var.a(a.a.a.a.v0.e.y0.a.f1265h);
            a.w.c.i.a(a2, "proto.getExtension(JvmPr….typeParameterAnnotation)");
            Iterable<a.a.a.a.v0.e.b> iterable = (Iterable) a2;
            ArrayList arrayList = new ArrayList(g.a(iterable, 10));
            for (a.a.a.a.v0.e.b bVar : iterable) {
                a.w.c.i.a((Object) bVar, "it");
                arrayList.add(a(bVar, cVar));
            }
            return arrayList;
        } else {
            a.w.c.i.a("nameResolver");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (e.f.a.g.a((a.a.a.a.v0.e.r) r11) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (e.f.a.g.a((a.a.a.a.v0.e.z) r11) != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        if (r11.f1783f != false) goto L_0x004a;
     */
    @Override // a.a.a.a.v0.k.b.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<A> a(a.a.a.a.v0.k.b.y r10, a.a.a.a.v0.h.q r11, a.a.a.a.v0.k.b.b r12, int r13, a.a.a.a.v0.e.p0 r14) {
        /*
        // Method dump skipped, instructions count: 143
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.d.b.a.a(a.a.a.a.v0.k.b.y, a.a.a.a.v0.h.q, a.a.a.a.v0.k.b.b, int, a.a.a.a.v0.e.p0):java.util.List");
    }
}
