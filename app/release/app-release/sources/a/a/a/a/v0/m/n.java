package a.a.a.a.v0.m;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.p0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.j.g;
import a.a.a.a.v0.l.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class n extends b implements s0 {

    /* renamed from: c  reason: collision with root package name */
    public final e f1932c;

    /* renamed from: d  reason: collision with root package name */
    public final List<r0> f1933d;

    /* renamed from: e  reason: collision with root package name */
    public final Collection<d0> f1934e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(e eVar, List<? extends r0> list, Collection<d0> collection, j jVar) {
        super(jVar);
        if (eVar == null) {
            a(0);
            throw null;
        } else if (list == null) {
            a(1);
            throw null;
        } else if (collection == null) {
            a(2);
            throw null;
        } else if (jVar != null) {
            this.f1932c = eVar;
            this.f1933d = Collections.unmodifiableList(new ArrayList(list));
            this.f1934e = Collections.unmodifiableCollection(collection);
        } else {
            a(3);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 4 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i == 4) {
            objArr[1] = "getParameters";
        } else if (i == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i == 4 || i == 5 || i == 6 || i == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 4 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.m.s0
    public boolean a() {
        return true;
    }

    @Override // a.a.a.a.v0.m.s0, a.a.a.a.v0.m.b
    public e c() {
        e eVar = this.f1932c;
        if (eVar != null) {
            return eVar;
        }
        a(5);
        throw null;
    }

    @Override // a.a.a.a.v0.m.s0
    public List<r0> d() {
        List<r0> list = this.f1933d;
        if (list != null) {
            return list;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.m.h
    public Collection<d0> f() {
        Collection<d0> collection = this.f1934e;
        if (collection != null) {
            return collection;
        }
        a(6);
        throw null;
    }

    @Override // a.a.a.a.v0.m.h
    public p0 h() {
        return p0.a.f493a;
    }

    public String toString() {
        return g.e(this.f1932c).a();
    }
}
