package a.a.a.a.v0.m;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.f.b;
import a.w.b.l;

public final class z0 implements l<b, Boolean> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public Boolean a(b bVar) {
        b bVar2 = bVar;
        if (bVar2 != null) {
            return Boolean.valueOf(!bVar2.equals(g.k.F));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
