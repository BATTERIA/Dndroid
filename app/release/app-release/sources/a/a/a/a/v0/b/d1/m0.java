package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d;
import a.a.a.a.v0.b.d1.s;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.q0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.d0;
import a.n;
import a.w.c.f;
import a.w.c.i;
import a.w.c.p;
import a.w.c.s;

public final class m0 extends s implements l0 {
    public static final a I = new a(null);
    public d F;
    public final j G;
    public final q0 H;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }
    }

    public static final class b extends a.w.c.j implements a.w.b.a<m0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ m0 f398c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(m0 m0Var, d dVar) {
            super(0);
            this.f398c = m0Var;
            this.f399d = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public m0 a() {
            m0 m0Var = this.f398c;
            j jVar = m0Var.G;
            q0 q0Var = m0Var.H;
            d dVar = this.f399d;
            h y = dVar.y();
            b.a t = this.f399d.t();
            i.a((Object) t, "underlyingConstructorDescriptor.kind");
            a.a.a.a.v0.b.m0 r = this.f398c.H.r();
            i.a((Object) r, "typeAliasDescriptor.source");
            m0 m0Var2 = new m0(jVar, q0Var, dVar, m0Var, y, t, r);
            a aVar = m0.I;
            q0 q0Var2 = this.f398c.H;
            i0 i0Var = null;
            if (aVar != null) {
                a1 a2 = q0Var2.l() == null ? null : a1.a((d0) q0Var2.h0());
                if (a2 == null) {
                    return null;
                }
                i0 J = this.f399d.J();
                if (J != null) {
                    i0Var = J.a(a2);
                }
                m0Var2.a(null, i0Var, this.f398c.H.x(), this.f398c.j(), this.f398c.h(), v.FINAL, this.f398c.H.g());
                return m0Var2;
            }
            throw null;
        }
    }

    static {
        s.a(new p(s.a(m0.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"));
    }

    public m0(j jVar, q0 q0Var, d dVar, l0 l0Var, h hVar, b.a aVar, a.a.a.a.v0.b.m0 m0Var) {
        super(q0Var, l0Var, hVar, a.a.a.a.v0.f.d.d("<init>"), aVar, m0Var);
        this.G = jVar;
        this.H = q0Var;
        this.t = q0Var.m0();
        this.G.c(new b(this, dVar));
        this.F = dVar;
    }

    @Override // a.a.a.a.v0.b.j
    public boolean X() {
        return this.F.X();
    }

    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k
    public l0 a() {
        a.a.a.a.v0.b.s a2 = super.a();
        if (a2 != null) {
            return (l0) a2;
        }
        throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
    }

    @Override // a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.b
    public l0 a(k kVar, v vVar, a.a.a.a.v0.b.a1 a1Var, b.a aVar, boolean z) {
        if (kVar == null) {
            i.a("newOwner");
            throw null;
        } else if (vVar == null) {
            i.a("modality");
            throw null;
        } else if (a1Var == null) {
            i.a("visibility");
            throw null;
        } else if (aVar != null) {
            s.c cVar = (s.c) s();
            cVar.a(kVar);
            cVar.a(vVar);
            cVar.a(a1Var);
            cVar.a(aVar);
            cVar.a(z);
            a.a.a.a.v0.b.s a2 = cVar.a();
            if (a2 != null) {
                return (l0) a2;
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        } else {
            i.a("kind");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.k, a.a.a.a.v0.b.j
    public a.a.a.a.v0.b.i b() {
        return this.H;
    }

    @Override // a.a.a.a.v0.b.j
    public e b0() {
        e b0 = this.F.b0();
        i.a((Object) b0, "underlyingConstructorDescriptor.constructedClass");
        return b0;
    }

    @Override // a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.a, a.a.a.a.v0.b.j
    public d0 h() {
        d0 d0Var = this.i;
        if (d0Var != null) {
            return d0Var;
        }
        i.a();
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.l0
    public d q0() {
        return this.F;
    }

    @Override // a.a.a.a.v0.b.d1.s
    public s a(k kVar, a.a.a.a.v0.b.s sVar, b.a aVar, a.a.a.a.v0.f.d dVar, h hVar, a.a.a.a.v0.b.m0 m0Var) {
        if (kVar == null) {
            i.a("newOwner");
            throw null;
        } else if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (hVar == null) {
            i.a("annotations");
            throw null;
        } else if (m0Var != null) {
            boolean z = true;
            boolean z2 = aVar == b.a.DECLARATION || aVar == b.a.SYNTHESIZED;
            if (!a.s.f2103a || z2) {
                if (dVar != null) {
                    z = false;
                }
                if (!a.s.f2103a || z) {
                    return new m0(this.G, this.H, this.F, this, hVar, b.a.DECLARATION, m0Var);
                }
                throw new AssertionError("Renaming type alias constructor: " + this);
            }
            throw new AssertionError("Creating a type alias constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + kVar + "\nkind: " + aVar);
        } else {
            i.a("source");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.s, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.k, a.a.a.a.v0.b.j
    /* renamed from: b  reason: collision with other method in class */
    public k m12b() {
        return this.H;
    }

    /* Return type fixed from 'a.a.a.a.v0.b.d1.l0' to match base method */
    @Override // a.a.a.a.v0.b.s, a.a.a.a.v0.b.o0, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.d1.s, a.a.a.a.v0.b.j
    public a.a.a.a.v0.b.a a(a1 a1Var) {
        if (a1Var != null) {
            a.a.a.a.v0.b.s a2 = super.a(a1Var);
            if (a2 != null) {
                m0 m0Var = (m0) a2;
                a1 a3 = a1.a(m0Var.h());
                i.a((Object) a3, "TypeSubstitutor.create(s…asConstructor.returnType)");
                d a4 = this.F.a().a(a3);
                if (a4 == null) {
                    return null;
                }
                m0Var.F = a4;
                return m0Var;
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        }
        i.a("substitutor");
        throw null;
    }
}
