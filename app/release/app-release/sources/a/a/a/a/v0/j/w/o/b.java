package a.a.a.a.v0.j.w.o;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.m.d0;

public class b extends a implements d {
    public final a b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, d0 d0Var, e eVar) {
        super(d0Var, eVar);
        if (aVar == null) {
            a(0);
            throw null;
        } else if (d0Var != null) {
            this.b = aVar;
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public String toString() {
        return c() + ": Ext {" + this.b + "}";
    }
}
