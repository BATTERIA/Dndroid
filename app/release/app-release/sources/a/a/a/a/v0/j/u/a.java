package a.a.a.a.v0.j.u;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.e0;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.j.w.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.i1.f;
import a.n;
import a.q;
import a.t.f;
import a.w.b.l;
import a.w.b.p;
import a.w.c.h;
import a.w.c.j;
import a.w.c.r;
import a.w.c.s;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class a {

    /* renamed from: a.a.a.a.v0.j.u.a$a */
    public static final class C0063a extends j implements p<i, Boolean, q> {

        /* renamed from: c */
        public final /* synthetic */ e f1594c;

        /* renamed from: d */
        public final /* synthetic */ LinkedHashSet f1595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0063a(e eVar, LinkedHashSet linkedHashSet) {
            super(2);
            this.f1594c = eVar;
            this.f1595d = linkedHashSet;
        }

        @Override // a.w.b.p
        public /* bridge */ /* synthetic */ q a(i iVar, Boolean bool) {
            a(iVar, bool.booleanValue());
            return q.f2100a;
        }

        public final void a(i iVar, boolean z) {
            if (iVar != null) {
                for (k kVar : g.a(iVar, d.p, (l) null, 2, (Object) null)) {
                    if (kVar instanceof e) {
                        e eVar = (e) kVar;
                        if (a.a.a.a.v0.j.g.a(eVar, this.f1594c)) {
                            this.f1595d.add(kVar);
                        }
                        if (z) {
                            i T = eVar.T();
                            a.w.c.i.a((Object) T, "descriptor.unsubstitutedInnerClassesScope");
                            a(T, z);
                        }
                    }
                }
                return;
            }
            a.w.c.i.a("scope");
            throw null;
        }
    }

    public static final class b<N> implements a.a.a.a.v0.o.c<N> {

        /* renamed from: a */
        public static final b f1596a = new b();

        @Override // a.a.a.a.v0.o.c
        public Iterable a(Object obj) {
            w0 w0Var = (w0) obj;
            a.w.c.i.a((Object) w0Var, "current");
            Collection<w0> f2 = w0Var.f();
            ArrayList arrayList = new ArrayList(g.a(f2, 10));
            Iterator<T> it = f2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    public static final /* synthetic */ class c extends h implements l<w0, Boolean> {

        /* renamed from: f */
        public static final c f1597f = new c();

        public c() {
            super(1);
        }

        @Override // a.w.b.l
        public Boolean a(w0 w0Var) {
            w0 w0Var2 = w0Var;
            if (w0Var2 != null) {
                return Boolean.valueOf(w0Var2.B());
            }
            a.w.c.i.a("p1");
            throw null;
        }

        @Override // a.w.c.b
        public final a.a.e c() {
            return s.a(w0.class);
        }

        @Override // a.a.b, a.w.c.b
        public final String d() {
            return "declaresDefaultValue";
        }

        @Override // a.w.c.b
        public final String f() {
            return "declaresDefaultValue()Z";
        }
    }

    static {
        a.w.c.i.a((Object) a.a.a.a.v0.f.d.b("value"), "Name.identifier(\"value\")");
    }

    public static final a.a.a.a.v0.f.a a(a.a.a.a.v0.b.h hVar) {
        k b2;
        a.a.a.a.v0.f.a a2;
        if (hVar == null || (b2 = hVar.b()) == null) {
            return null;
        }
        if (b2 instanceof y) {
            return new a.a.a.a.v0.f.a(((y) b2).e(), hVar.d());
        }
        if (!(b2 instanceof a.a.a.a.v0.b.i) || (a2 = a((a.a.a.a.v0.b.h) b2)) == null) {
            return null;
        }
        return a2.a(hVar.d());
    }

    public static final Collection<e> a(e eVar) {
        if (eVar == null) {
            a.w.c.i.a("sealedClass");
            throw null;
        } else if (eVar.o() != v.SEALED) {
            return a.t.l.f2119c;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            C0063a aVar = new C0063a(eVar, linkedHashSet);
            k b2 = eVar.b();
            a.w.c.i.a((Object) b2, "sealedClass.containingDeclaration");
            if (b2 instanceof y) {
                aVar.a(((y) b2).u(), false);
            }
            i T = eVar.T();
            a.w.c.i.a((Object) T, "sealedClass.unsubstitutedInnerClassesScope");
            aVar.a(T, true);
            return linkedHashSet;
        }
    }

    public static final e b(a.a.a.a.v0.b.b1.c cVar) {
        e eVar = null;
        if (cVar != null) {
            a.a.a.a.v0.b.h c2 = cVar.c().I0().c();
            if (c2 instanceof e) {
                eVar = c2;
            }
            return eVar;
        }
        a.w.c.i.a("$this$annotationClass");
        throw null;
    }

    public static final a.a.a.a.v0.f.b c(k kVar) {
        if (kVar != null) {
            a.a.a.a.v0.f.b f2 = a.a.a.a.v0.j.g.f(kVar);
            if (f2 == null) {
                f2 = a.a.a.a.v0.j.g.g(kVar).g();
            }
            if (f2 != null) {
                a.w.c.i.a((Object) f2, "DescriptorUtils.getFqNameSafe(this)");
                return f2;
            }
            a.a.a.a.v0.j.g.a(4);
            throw null;
        }
        a.w.c.i.a("$this$fqNameSafe");
        throw null;
    }

    public static final a.a.a.a.v0.f.c d(k kVar) {
        if (kVar != null) {
            a.a.a.a.v0.f.c e2 = a.a.a.a.v0.j.g.e(kVar);
            a.w.c.i.a((Object) e2, "DescriptorUtils.getFqName(this)");
            return e2;
        }
        a.w.c.i.a("$this$fqNameUnsafe");
        throw null;
    }

    public static final w e(k kVar) {
        if (kVar != null) {
            w a2 = a.a.a.a.v0.j.g.a(kVar);
            a.w.c.i.a((Object) a2, "DescriptorUtils.getContainingModule(this)");
            return a2;
        }
        a.w.c.i.a("$this$module");
        throw null;
    }

    public static final a.z.h<k> f(k kVar) {
        if (kVar != null) {
            a.z.h a2 = a.a.a.a.v0.m.l1.a.a(kVar, d.f1600c);
            if (a2 != null) {
                return a2 instanceof a.z.c ? ((a.z.c) a2).a(1) : new a.z.b(a2, 1);
            }
            a.w.c.i.a("$this$drop");
            throw null;
        }
        a.w.c.i.a("$this$parents");
        throw null;
    }

    public static final a.a.a.a.v0.a.g b(k kVar) {
        if (kVar != null) {
            return e(kVar).m();
        }
        a.w.c.i.a("$this$builtIns");
        throw null;
    }

    public static final e b(e eVar) {
        if (eVar != null) {
            for (d0 d0Var : eVar.v().I0().b()) {
                if (!a.a.a.a.v0.a.g.b(d0Var)) {
                    a.a.a.a.v0.b.h c2 = d0Var.I0().c();
                    if (a.a.a.a.v0.j.g.j(c2)) {
                        if (c2 != null) {
                            return (e) c2;
                        }
                        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    }
                }
            }
            return null;
        }
        a.w.c.i.a("$this$getSuperClassNotAny");
        throw null;
    }

    public static final boolean a(w0 w0Var) {
        if (w0Var != null) {
            Boolean a2 = a.a.a.a.v0.m.l1.a.a(g.c(w0Var), b.f1596a, c.f1597f);
            a.w.c.i.a((Object) a2, "DFS.ifAny(\n        listO…eclaresDefaultValue\n    )");
            return a2.booleanValue();
        }
        a.w.c.i.a("$this$declaresOrInheritsDefaultValue");
        throw null;
    }

    public static final a.a.a.a.v0.j.s.g<?> a(a.a.a.a.v0.b.b1.c cVar) {
        if (cVar != null) {
            return (a.a.a.a.v0.j.s.g) f.c(cVar.a().values());
        }
        a.w.c.i.a("$this$firstArgument");
        throw null;
    }

    public static /* synthetic */ a.a.a.a.v0.b.b a(a.a.a.a.v0.b.b bVar, boolean z, l lVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (bVar == null) {
            a.w.c.i.a("$this$firstOverridden");
            throw null;
        } else if (lVar != null) {
            r rVar = new r();
            rVar.f2148c = null;
            return (a.a.a.a.v0.b.b) a.a.a.a.v0.m.l1.a.a(g.c((Object) bVar), new b(z), new c(rVar, lVar));
        } else {
            a.w.c.i.a("predicate");
            throw null;
        }
    }

    public static final a.a.a.a.v0.f.b a(k kVar) {
        if (kVar != null) {
            a.a.a.a.v0.f.c d2 = d(kVar);
            if (!d2.d()) {
                d2 = null;
            }
            if (d2 != null) {
                return d2.g();
            }
            return null;
        }
        a.w.c.i.a("$this$fqNameOrNull");
        throw null;
    }

    public static final a.a.a.a.v0.m.i1.f a(w wVar) {
        T t;
        if (wVar != null) {
            a.a.a.a.v0.m.i1.n nVar = (a.a.a.a.v0.m.i1.n) wVar.a(a.a.a.a.v0.m.i1.g.f1874a);
            return (nVar == null || (t = nVar.f1892a) == null) ? f.a.f1873a : t;
        }
        a.w.c.i.a("$this$getKotlinTypeRefiner");
        throw null;
    }

    public static final a.a.a.a.v0.b.b a(a.a.a.a.v0.b.b bVar) {
        if (bVar == null) {
            a.w.c.i.a("$this$propertyIfAccessor");
            throw null;
        } else if (!(bVar instanceof e0)) {
            return bVar;
        } else {
            f0 a0 = ((e0) bVar).a0();
            a.w.c.i.a((Object) a0, "correspondingProperty");
            return a0;
        }
    }

    public static final e a(w wVar, a.a.a.a.v0.f.b bVar, a.a.a.a.v0.c.a.b bVar2) {
        e eVar = null;
        if (wVar == null) {
            a.w.c.i.a("$this$resolveTopLevelClass");
            throw null;
        } else if (bVar == null) {
            a.w.c.i.a("topLevelClassFqName");
            throw null;
        } else if (bVar2 != null) {
            boolean z = !bVar.b();
            if (!a.s.f2103a || z) {
                a.a.a.a.v0.f.b c2 = bVar.c();
                a.w.c.i.a((Object) c2, "topLevelClassFqName.parent()");
                i u = wVar.a(c2).u();
                a.a.a.a.v0.f.d d2 = bVar.d();
                a.w.c.i.a((Object) d2, "topLevelClassFqName.shortName()");
                a.a.a.a.v0.b.h b2 = u.b(d2, bVar2);
                if (b2 instanceof e) {
                    eVar = b2;
                }
                return eVar;
            }
            throw new AssertionError("Assertion failed");
        } else {
            a.w.c.i.a("location");
            throw null;
        }
    }
}
