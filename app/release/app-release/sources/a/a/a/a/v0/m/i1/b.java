package a.a.a.a.v0.m.i1;

import a.a.a.a.v0.j.s.r;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.i1.l;
import a.a.a.a.v0.m.k1.c;
import a.a.a.a.v0.m.k1.d;
import a.a.a.a.v0.m.k1.e;
import a.a.a.a.v0.m.k1.h;
import a.a.a.a.v0.m.k1.j;
import a.a.a.a.v0.m.k1.k;
import a.a.a.a.v0.m.k1.l;
import a.a.a.a.v0.m.k1.n;
import a.a.a.a.v0.m.k1.q;
import a.a.a.a.v0.m.s0;
import a.w.c.i;
import java.util.Collection;
import java.util.List;

public class b extends g implements c {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1866e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1867f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1868g;

    /* renamed from: h  reason: collision with root package name */
    public final f f1869h;

    public /* synthetic */ b(boolean z, boolean z2, boolean z3, f fVar, int i) {
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? true : z3;
        fVar = (i & 8) != 0 ? f.a.f1873a : fVar;
        if (fVar != null) {
            this.f1866e = z;
            this.f1867f = z2;
            this.f1868g = z3;
            this.f1869h = fVar;
            return;
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public e a(a.a.a.a.v0.m.k1.f fVar) {
        if (fVar != null) {
            return e.f.a.g.a((c) this, fVar);
        }
        i.a("$this$asDynamicType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.g
    public boolean b(k kVar, k kVar2) {
        if (kVar == null) {
            i.a("a");
            throw null;
        } else if (kVar2 == null) {
            i.a("b");
            throw null;
        } else if (!(kVar instanceof s0)) {
            throw new IllegalArgumentException(e.f.a.g.a(kVar).toString());
        } else if (kVar2 instanceof s0) {
            s0 s0Var = (s0) kVar;
            s0 s0Var2 = (s0) kVar2;
            if (s0Var instanceof r) {
                return ((r) s0Var).a(s0Var2);
            }
            return s0Var2 instanceof r ? ((r) s0Var2).a(s0Var) : i.a(s0Var, s0Var2);
        } else {
            throw new IllegalArgumentException(e.f.a.g.a(kVar2).toString());
        }
    }

    @Override // a.a.a.a.v0.m.k1.n
    public a.a.a.a.v0.m.k1.g c(j jVar) {
        if (jVar != null) {
            return e.f.a.g.a(this, jVar);
        }
        i.a("$this$getType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public int d(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.a((c) this, gVar);
        }
        i.a("$this$argumentsCount");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public d e(h hVar) {
        if (hVar != null) {
            return e.f.a.g.c((c) this, hVar);
        }
        i.a("$this$asDefinitelyNotNullType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public c f(h hVar) {
        if (hVar != null) {
            return e.f.a.g.b((c) this, hVar);
        }
        i.a("$this$asCapturedType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public a.a.a.a.v0.m.k1.i g(h hVar) {
        if (hVar != null) {
            return e.f.a.g.a((c) this, hVar);
        }
        i.a("$this$asArgumentList");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public l h(k kVar) {
        if (kVar != null) {
            return e.f.a.g.d(this, kVar);
        }
        i.a("$this$getTypeParameterClassifier");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public a.a.a.a.v0.m.k1.f i(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.b((c) this, gVar);
        }
        i.a("$this$asFlexibleType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public a.a.a.a.v0.m.k1.g j(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.e((c) this, gVar);
        }
        i.a("$this$getSubstitutedUnderlyingType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public j k(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.d((c) this, gVar);
        }
        i.a("$this$asTypeArgument");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean l(k kVar) {
        if (kVar != null) {
            return e.f.a.g.g(this, kVar);
        }
        i.a("$this$isCommonFinalClassConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.g
    public boolean m(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.b((n) this, gVar);
        }
        i.a("$this$isDefinitelyNotNullType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public boolean n(k kVar) {
        if (kVar != null) {
            return e.f.a.g.i(this, kVar);
        }
        i.a("$this$isInlineClass");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean o(k kVar) {
        if (kVar != null) {
            return e.f.a.g.l(this, kVar);
        }
        i.a("$this$isNothingConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n, a.a.a.a.v0.m.i1.c
    public h a(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.c((c) this, gVar);
        }
        i.a("$this$asSimpleType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean c(k kVar) {
        if (kVar != null) {
            return e.f.a.g.h(this, kVar);
        }
        i.a("$this$isDenotable");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public a.a.a.a.v0.a.i d(k kVar) {
        if (kVar != null) {
            return e.f.a.g.c(this, kVar);
        }
        i.a("$this$getPrimitiveType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public boolean e(k kVar) {
        if (kVar != null) {
            return e.f.a.g.m(this, kVar);
        }
        i.a("$this$isUnderKotlinPackage");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean f(k kVar) {
        if (kVar != null) {
            return e.f.a.g.e(this, kVar);
        }
        i.a("$this$isAnyConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public a.a.a.a.v0.a.i g(k kVar) {
        if (kVar != null) {
            return e.f.a.g.b(this, kVar);
        }
        i.a("$this$getPrimitiveArrayType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean h(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.f((c) this, gVar);
        }
        i.a("$this$isError");
        throw null;
    }

    @Override // a.a.a.a.v0.m.g
    public boolean i(h hVar) {
        if (hVar != null) {
            return j(a(hVar));
        }
        i.a("$this$isClassType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean j(k kVar) {
        if (kVar != null) {
            return e.f.a.g.f(this, kVar);
        }
        i.a("$this$isClassTypeConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public a.a.a.a.v0.f.c k(k kVar) {
        if (kVar != null) {
            return e.f.a.g.a(this, kVar);
        }
        i.a("$this$getClassFqNameUnsafe");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public a.a.a.a.v0.m.k1.g l(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.i(this, gVar);
        }
        i.a("$this$makeNullable");
        throw null;
    }

    @Override // a.a.a.a.v0.m.g
    public a.a.a.a.v0.m.k1.g n(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("type");
            throw null;
        } else if (!(gVar instanceof d0)) {
            throw new IllegalArgumentException(e.f.a.g.a(gVar).toString());
        } else if (l.b != null) {
            return l.a.f1889a.a(((d0) gVar).K0());
        } else {
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.g
    public a.a.a.a.v0.m.k1.g o(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar == null) {
            i.a("type");
            throw null;
        } else if (gVar instanceof d0) {
            d0 d0Var = (d0) gVar;
            this.f1869h.a(d0Var);
            return d0Var;
        } else {
            throw new IllegalArgumentException(e.f.a.g.a(gVar).toString());
        }
    }

    @Override // a.a.a.a.v0.m.k1.n
    public h a(h hVar, a.a.a.a.v0.m.k1.b bVar) {
        if (hVar == null) {
            i.a("type");
            throw null;
        } else if (bVar != null) {
            return e.f.a.g.a(this, hVar, bVar);
        } else {
            i.a("status");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean c(h hVar) {
        if (hVar != null) {
            e.f.a.g.f((c) this, hVar);
            return false;
        }
        i.a("$this$isStubType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean d(h hVar) {
        if (hVar != null) {
            return e.f.a.g.d((c) this, hVar);
        }
        i.a("$this$isMarkedNullable");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n, a.a.a.a.v0.m.g
    public h e(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.g((n) this, gVar);
        }
        i.a("$this$upperBoundIfFlexible");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public boolean f(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.g((c) this, gVar);
        }
        i.a("$this$isMarkedNullable");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean g(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.h(this, gVar);
        }
        i.a("$this$isNullableType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean h(h hVar) {
        if (hVar != null) {
            return e.f.a.g.e((c) this, hVar);
        }
        i.a("$this$isPrimitiveType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.g
    public boolean j(h hVar) {
        if (hVar != null) {
            return i(a(hVar));
        }
        i.a("$this$isIntegerLiteralType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean m(k kVar) {
        if (kVar != null) {
            return e.f.a.g.k(this, kVar);
        }
        i.a("$this$isIntersection");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public j a(a.a.a.a.v0.m.k1.i iVar, int i) {
        if (iVar != null) {
            return e.f.a.g.a(this, iVar, i);
        }
        i.a("$this$get");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public a.a.a.a.v0.m.k1.g b(a.a.a.a.v0.m.k1.l lVar) {
        if (lVar != null) {
            return e.f.a.g.a(this, lVar);
        }
        i.a("$this$getRepresentativeUpperBound");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public h c(a.a.a.a.v0.m.k1.f fVar) {
        if (fVar != null) {
            return e.f.a.g.b((c) this, fVar);
        }
        i.a("$this$lowerBound");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean i(k kVar) {
        if (kVar != null) {
            return e.f.a.g.j(this, kVar);
        }
        i.a("$this$isIntegerLiteralTypeConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean b(j jVar) {
        if (jVar != null) {
            return e.f.a.g.c(this, jVar);
        }
        i.a("$this$isStarProjection");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n, a.a.a.a.v0.m.g
    public k c(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.f((n) this, gVar);
        }
        i.a("$this$typeConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public j a(a.a.a.a.v0.m.k1.g gVar, int i) {
        if (gVar != null) {
            return e.f.a.g.a(this, gVar, i);
        }
        i.a("$this$getArgument");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n, a.a.a.a.v0.m.g
    public h b(a.a.a.a.v0.m.k1.g gVar) {
        if (gVar != null) {
            return e.f.a.g.e((n) this, gVar);
        }
        i.a("$this$lowerBoundIfFlexible");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public a.a.a.a.v0.m.k1.l a(k kVar, int i) {
        if (kVar != null) {
            return e.f.a.g.a(this, kVar, i);
        }
        i.a("$this$getParameter");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public q a(j jVar) {
        if (jVar != null) {
            return e.f.a.g.b(this, jVar);
        }
        i.a("$this$getVariance");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public int b(k kVar) {
        if (kVar != null) {
            return e.f.a.g.n(this, kVar);
        }
        i.a("$this$parametersCount");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public q a(a.a.a.a.v0.m.k1.l lVar) {
        if (lVar != null) {
            return e.f.a.g.b(this, lVar);
        }
        i.a("$this$getVariance");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public Collection<a.a.a.a.v0.m.k1.g> b(h hVar) {
        if (hVar != null) {
            return e.f.a.g.g((c) this, hVar);
        }
        i.a("$this$possibleIntegerTypes");
        throw null;
    }

    @Override // a.a.a.a.v0.m.b1
    public boolean a(a.a.a.a.v0.m.k1.g gVar, a.a.a.a.v0.f.b bVar) {
        if (gVar == null) {
            i.a("$this$hasAnnotation");
            throw null;
        } else if (bVar != null) {
            return e.f.a.g.a(this, gVar, bVar);
        } else {
            i.a("fqName");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.k1.n
    public h b(a.a.a.a.v0.m.k1.f fVar) {
        if (fVar != null) {
            return e.f.a.g.c((c) this, fVar);
        }
        i.a("$this$upperBound");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.p
    public boolean a(h hVar, h hVar2) {
        if (hVar == null) {
            i.a("a");
            throw null;
        } else if (hVar2 != null) {
            return e.f.a.g.a(this, hVar, hVar2);
        } else {
            i.a("b");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.k1.n
    public a.a.a.a.v0.m.k1.g a(List<? extends a.a.a.a.v0.m.k1.g> list) {
        if (list != null) {
            return e.f.a.g.b((List) list);
        }
        i.a("types");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public boolean a(k kVar, k kVar2) {
        if (kVar == null) {
            i.a("c1");
            throw null;
        } else if (kVar2 != null) {
            return e.f.a.g.a(this, kVar, kVar2);
        } else {
            i.a("c2");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.m.k1.n
    public a.a.a.a.v0.m.k1.g a(c cVar) {
        if (cVar != null) {
            return e.f.a.g.a((c) this, cVar);
        }
        i.a("$this$lowerType");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public int a(a.a.a.a.v0.m.k1.i iVar) {
        if (iVar != null) {
            return e.f.a.g.a(this, iVar);
        }
        i.a("$this$size");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public Collection<a.a.a.a.v0.m.k1.g> a(k kVar) {
        if (kVar != null) {
            return e.f.a.g.o(this, kVar);
        }
        i.a("$this$supertypes");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n, a.a.a.a.v0.m.i1.c
    public k a(h hVar) {
        if (hVar != null) {
            return e.f.a.g.h((c) this, hVar);
        }
        i.a("$this$typeConstructor");
        throw null;
    }

    @Override // a.a.a.a.v0.m.k1.n
    public h a(h hVar, boolean z) {
        if (hVar != null) {
            return e.f.a.g.a(this, hVar, z);
        }
        i.a("$this$withNullability");
        throw null;
    }
}
