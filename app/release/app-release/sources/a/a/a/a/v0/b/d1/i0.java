package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.j.w.o.e;

public class i0 extends d {

    /* renamed from: f  reason: collision with root package name */
    public final k f391f;

    /* renamed from: g  reason: collision with root package name */
    public final e f392g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(k kVar, e eVar, h hVar) {
        super(hVar);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (eVar == null) {
            a(1);
            throw null;
        } else if (hVar != null) {
            this.f391f = kVar;
            this.f392g = eVar;
        } else {
            a(2);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "value";
        } else if (i == 2) {
            objArr[0] = "annotations";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else if (i != 5) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.l, a.a.a.a.v0.b.v0, a.a.a.a.v0.b.k
    public k b() {
        k kVar = this.f391f;
        if (kVar != null) {
            return kVar;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.b.i0
    public e getValue() {
        e eVar = this.f392g;
        if (eVar != null) {
            return eVar;
        }
        a(3);
        throw null;
    }
}
