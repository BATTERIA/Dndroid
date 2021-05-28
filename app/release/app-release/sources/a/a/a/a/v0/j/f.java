package a.a.a.a.v0.j;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.i;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.m0;
import java.util.Collections;

public class f extends i {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(e eVar, m0 m0Var) {
        super(eVar, null, h.a.f321a, true, b.a.DECLARATION, m0Var);
        if (eVar == null) {
            a(0);
            throw null;
        } else if (m0Var == null) {
            a(1);
            throw null;
        } else if (h.b != null) {
            a(Collections.emptyList(), g.a(eVar));
        } else {
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "containingClass";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
