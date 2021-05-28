package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.j.w.o.c;
import e.a.a.a.a;

public class t extends d {

    /* renamed from: f  reason: collision with root package name */
    public final e f425f;

    /* renamed from: g  reason: collision with root package name */
    public final c f426g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(e eVar) {
        super(h.a.f321a);
        if (eVar == null) {
            a(0);
            throw null;
        } else if (h.b != null) {
            this.f425f = eVar;
            this.f426g = new c(eVar, null);
        } else {
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        if (i == 1 || i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i == 1 || i == 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.v0, a.a.a.a.v0.b.k
    public k b() {
        e eVar = this.f425f;
        if (eVar != null) {
            return eVar;
        }
        a(2);
        throw null;
    }

    @Override // a.a.a.a.v0.b.i0
    public a.a.a.a.v0.j.w.o.e getValue() {
        c cVar = this.f426g;
        if (cVar != null) {
            return cVar;
        }
        a(1);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.m
    public String toString() {
        StringBuilder a2 = a.a("class ");
        a2.append(this.f425f.d());
        a2.append("::this");
        return a2.toString();
    }
}
