package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.n;
import a.a.a.a.v0.m.s0;
import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class c0 extends j {
    public final f j;
    public final boolean k;
    public v l;
    public a1 m;
    public s0 n;
    public List<r0> o;
    public final Collection<d0> p;
    public final j q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0(k kVar, f fVar, boolean z, boolean z2, d dVar, m0 m0Var, j jVar) {
        super(jVar, kVar, dVar, m0Var, z2);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (fVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (m0Var == null) {
            a(3);
            throw null;
        } else if (jVar != null) {
            this.p = new ArrayList();
            this.q = jVar;
            this.j = fVar;
            this.k = z;
        } else {
            a(4);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                i2 = 2;
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "kind";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 9:
                objArr[0] = "visibility";
                break;
            case 12:
                objArr[0] = "supertype";
                break;
            case 14:
                objArr[0] = "typeParameters";
                break;
            case 16:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 5:
                objArr[1] = "getAnnotations";
                break;
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor";
                break;
            case 7:
                objArr[1] = "getModality";
                break;
            case 8:
                objArr[1] = "getKind";
                break;
            case 10:
                objArr[1] = "getVisibility";
                break;
            case 11:
                objArr[1] = "getTypeConstructor";
                break;
            case 13:
                objArr[1] = "getConstructors";
                break;
            case 15:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 17:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 18:
                objArr[1] = "getStaticScope";
                break;
            case 19:
                objArr[1] = "getSealedSubclasses";
                break;
        }
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 9:
                objArr[2] = "setVisibility";
                break;
            case 12:
                objArr[2] = "addSupertype";
                break;
            case 14:
                objArr[2] = "setTypeParameterDescriptors";
                break;
            case 16:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
            case 17:
            case 18:
            case 19:
                throw new IllegalStateException(format);
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
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
        return this.k;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean P() {
        return false;
    }

    public void U() {
        this.n = new n(this, this.o, this.p, this.q);
        Set<a.a.a.a.v0.b.d> emptySet = Collections.emptySet();
        if (emptySet != null) {
            for (a.a.a.a.v0.b.d dVar : emptySet) {
                ((i) dVar).a(v());
            }
            return;
        }
        a(13);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.b.d Y() {
        return null;
    }

    @Override // a.a.a.a.v0.b.e
    public i Z() {
        return i.b.b;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public i a(a.a.a.a.v0.m.i1.f fVar) {
        if (fVar != null) {
            return i.b.b;
        }
        a(16);
        throw null;
    }

    public void a(List<r0> list) {
        if (list == null) {
            a(14);
            throw null;
        } else if (this.o == null) {
            this.o = new ArrayList(list);
        } else {
            StringBuilder a2 = a.a("Type parameters are already set for ");
            a2.append(d());
            throw new IllegalStateException(a2.toString());
        }
    }

    @Override // a.a.a.a.v0.b.e
    public e d0() {
        return null;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public a1 g() {
        a1 a1Var = this.m;
        if (a1Var != null) {
            return a1Var;
        }
        a(10);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.h
    public s0 n() {
        s0 s0Var = this.n;
        if (s0Var != null) {
            return s0Var;
        }
        a(11);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public v o() {
        v vVar = this.l;
        if (vVar != null) {
            return vVar;
        }
        a(7);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean p() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public Collection q() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        a(13);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public f t() {
        f fVar = this.j;
        if (fVar != null) {
            return fVar;
        }
        a(8);
        throw null;
    }

    public String toString() {
        return m.a(this);
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.i
    public List<r0> x() {
        List<r0> list = this.o;
        if (list != null) {
            return list;
        }
        a(15);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        if (h.b != null) {
            h hVar = h.a.f321a;
            if (hVar != null) {
                return hVar;
            }
            a(5);
            throw null;
        }
        throw null;
    }
}
