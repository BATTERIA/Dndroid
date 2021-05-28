package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.d.a.c0.c;
import a.a.a.a.v0.f.d;
import a.w.c.i;
import java.lang.annotation.Annotation;

public final class e extends d implements c {
    public final Annotation b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Annotation annotation) {
        super(dVar);
        if (annotation != null) {
            this.b = annotation;
            return;
        }
        i.a("annotation");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.c
    public a e() {
        return new c(this.b);
    }
}
