package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.n;
import a.a.a.a.v0.m.s0;
import e.a.a.a.a;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class k extends j {
    public final v j;
    public final f k;
    public final s0 l;
    public i m;
    public Set<d> n;
    public d o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a.a.a.a.v0.b.k kVar, a.a.a.a.v0.f.d dVar, v vVar, f fVar, Collection<d0> collection, m0 m0Var, boolean z, j jVar) {
        super(jVar, kVar, dVar, m0Var, z);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (dVar == null) {
            a(1);
            throw null;
        } else if (vVar == null) {
            a(2);
            throw null;
        } else if (fVar == null) {
            a(3);
            throw null;
        } else if (collection == null) {
            a(4);
            throw null;
        } else if (m0Var == null) {
            a(5);
            throw null;
        } else if (jVar != null) {
            this.j = vVar;
            this.k = fVar;
            this.l = new n(this, Collections.emptyList(), collection, jVar);
        } else {
            a(6);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 12:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "supertypes";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 8:
                objArr[0] = "constructors";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 12:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "getAnnotations";
                break;
            case 10:
                objArr[1] = "getTypeConstructor";
                break;
            case 11:
                objArr[1] = "getConstructors";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 14:
                objArr[1] = "getStaticScope";
                break;
            case 15:
                objArr[1] = "getKind";
                break;
            case 16:
                objArr[1] = "getModality";
                break;
            case 17:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                break;
            case 12:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 12:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.e
    public Collection<e> A0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(19);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean D0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.i
    public boolean E() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean P() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public d Y() {
        return this.o;
    }

    @Override // a.a.a.a.v0.b.e
    public i Z() {
        return i.b.b;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public i a(a.a.a.a.v0.m.i1.f fVar) {
        if (fVar != null) {
            i iVar = this.m;
            if (iVar != null) {
                return iVar;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public final void a(i iVar, Set<d> set, d dVar) {
        if (iVar == null) {
            a(7);
            throw null;
        } else if (set != null) {
            this.m = iVar;
            this.n = set;
            this.o = dVar;
        } else {
            a(8);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e
    public e d0() {
        return null;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public a1 g() {
        a1 a1Var = z0.f515e;
        if (a1Var != null) {
            return a1Var;
        }
        a(17);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.h
    public s0 n() {
        s0 s0Var = this.l;
        if (s0Var != null) {
            return s0Var;
        }
        a(10);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public v o() {
        v vVar = this.j;
        if (vVar != null) {
            return vVar;
        }
        a(16);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean p() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public Collection<d> q() {
        Set<d> set = this.n;
        if (set != null) {
            return set;
        }
        a(11);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public f t() {
        f fVar = this.k;
        if (fVar != null) {
            return fVar;
        }
        a(15);
        throw null;
    }

    public String toString() {
        StringBuilder a2 = a.a("class ");
        a2.append(d());
        return a2.toString();
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.i
    public List<r0> x() {
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(18);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        if (h.b != null) {
            h hVar = h.a.f321a;
            if (hVar != null) {
                return hVar;
            }
            a(9);
            throw null;
        }
        throw null;
    }
}
