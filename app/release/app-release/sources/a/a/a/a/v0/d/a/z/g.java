package a.a.a.a.v0.d.a.z;

import a.a.a.a.v0.a.n;
import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.f0;
import a.a.a.a.v0.b.d1.g0;
import a.a.a.a.v0.b.d1.h0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.d.a.d0.x;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.j;
import a.w.c.i;
import java.util.List;

public class g extends f0 implements b {
    public final boolean C;
    public final j<a.AbstractC0014a<?>, ?> D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(k kVar, h hVar, v vVar, a1 a1Var, boolean z, d dVar, m0 m0Var, a.a.a.a.v0.b.f0 f0Var, b.a aVar, boolean z2, j<a.AbstractC0014a<?>, ?> jVar) {
        super(kVar, f0Var, hVar, vVar, a1Var, z, dVar, aVar, m0Var, false, false, false, false, false, false);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (vVar == null) {
            a(2);
            throw null;
        } else if (a1Var == null) {
            a(3);
            throw null;
        } else if (dVar == null) {
            a(4);
            throw null;
        } else if (m0Var == null) {
            a(5);
            throw null;
        } else if (aVar != null) {
            this.C = z2;
            this.D = jVar;
        } else {
            a(6);
            throw null;
        }
    }

    public static g a(k kVar, h hVar, v vVar, a1 a1Var, boolean z, d dVar, m0 m0Var, boolean z2) {
        if (kVar == null) {
            a(7);
            throw null;
        } else if (hVar == null) {
            a(8);
            throw null;
        } else if (vVar == null) {
            a(9);
            throw null;
        } else if (a1Var == null) {
            a(10);
            throw null;
        } else if (dVar == null) {
            a(11);
            throw null;
        } else if (m0Var != null) {
            return new g(kVar, hVar, vVar, a1Var, z, dVar, m0Var, null, b.a.DECLARATION, z2, null);
        } else {
            a(12);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 21 ? 3 : 2)];
        switch (i) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
        }
        if (i != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // a.a.a.a.v0.b.d1.f0, a.a.a.a.v0.b.y0, a.a.a.a.v0.b.d1.p0
    public boolean R() {
        d0 c2 = c();
        if (this.C) {
            if (c2 != null) {
                if (!(((a.a.a.a.v0.a.g.f(c2) || n.f232e.a(c2)) && !c1.c(c2)) || a.a.a.a.v0.a.g.g(c2)) || (x.a(c2) && !a.a.a.a.v0.a.g.g(c2))) {
                    return false;
                }
                return true;
            }
            i.a("type");
            throw null;
        }
        return false;
    }

    @Override // a.a.a.a.v0.b.d1.f0
    public f0 a(k kVar, v vVar, a1 a1Var, a.a.a.a.v0.b.f0 f0Var, b.a aVar, d dVar, m0 m0Var) {
        if (kVar == null) {
            a(13);
            throw null;
        } else if (vVar == null) {
            a(14);
            throw null;
        } else if (a1Var == null) {
            a(15);
            throw null;
        } else if (aVar == null) {
            a(16);
            throw null;
        } else if (dVar == null) {
            a(17);
            throw null;
        } else if (m0Var != null) {
            return new g(kVar, y(), vVar, a1Var, this.f412h, dVar, m0Var, f0Var, aVar, this.C, this.D);
        } else {
            a(18);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public boolean s0() {
        return false;
    }

    @Override // a.a.a.a.v0.d.a.z.b
    public b a(d0 d0Var, List<k> list, d0 d0Var2, j<a.AbstractC0014a<?>, ?> jVar) {
        g0 g0Var;
        h0 h0Var;
        i0 i0Var;
        if (list == null) {
            a(19);
            throw null;
        } else if (d0Var2 != null) {
            a.a.a.a.v0.b.f0 a2 = a() == this ? null : a();
            g gVar = new g(b(), y(), o(), g(), this.f412h, d(), r(), a2, t(), this.C, jVar);
            g0 g0Var2 = this.x;
            if (g0Var2 != null) {
                g0Var = r14;
                g0 g0Var3 = new g0(gVar, g0Var2.y(), g0Var2.o(), g0Var2.g(), g0Var2.f368g, g0Var2.f369h, g0Var2.k, t(), a2 == null ? null : a2.w(), g0Var2.r());
                g0Var.n = g0Var2.n;
                g0Var.o = d0Var2;
            } else {
                g0Var = null;
            }
            a.a.a.a.v0.b.h0 h0Var2 = this.y;
            if (h0Var2 != null) {
                h0 h0Var3 = new h0(gVar, h0Var2.y(), h0Var2.o(), h0Var2.g(), h0Var2.e0(), h0Var2.H(), h0Var2.p(), t(), a2 == null ? null : a2.i(), h0Var2.r());
                h0Var3.n = h0Var3.n;
                h0Var3.a(h0Var2.j().get(0));
                h0Var = h0Var3;
            } else {
                h0Var = null;
            }
            gVar.a(g0Var, h0Var, this.A, this.B);
            gVar.z = this.z;
            a.a.a.a.v0.l.h<a.a.a.a.v0.j.s.g<?>> hVar = this.i;
            if (hVar != null) {
                gVar.a(hVar);
            }
            gVar.a(f());
            if (d0Var == null) {
                i0Var = null;
            } else if (h.b != null) {
                i0Var = e.f.a.g.a(this, d0Var, h.a.f321a);
            } else {
                throw null;
            }
            gVar.a(d0Var2, k(), this.u, i0Var);
            return gVar;
        } else {
            a(20);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [B, V] */
    @Override // a.a.a.a.v0.b.d1.f0, a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public <V> V a(a.AbstractC0014a<V> aVar) {
        j<a.AbstractC0014a<?>, ?> jVar = this.D;
        if (jVar == null || !jVar.f2088c.equals(aVar)) {
            return null;
        }
        return this.D.f2089d;
    }
}
