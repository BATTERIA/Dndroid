package a.a.a.a.v0.j.w.o;

import a.a.a.a.v0.m.d0;
import e.a.a.a.a;

public class h extends a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(d0 d0Var) {
        super(d0Var, null);
        if (d0Var == null) {
            a(0);
            throw null;
        } else if (d0Var != null) {
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        StringBuilder a2 = a.a("{Transient} : ");
        a2.append(c());
        return a2.toString();
    }
}
