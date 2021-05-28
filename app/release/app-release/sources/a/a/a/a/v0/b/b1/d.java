package a.a.a.a.v0.b.b1;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.i.c;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.m.d0;
import java.util.Map;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f308a;
    public final Map<a.a.a.a.v0.f.d, g<?>> b;

    /* renamed from: c  reason: collision with root package name */
    public final m0 f309c;

    public d(d0 d0Var, Map<a.a.a.a.v0.f.d, g<?>> map, m0 m0Var) {
        if (d0Var == null) {
            a(0);
            throw null;
        } else if (map == null) {
            a(1);
            throw null;
        } else if (m0Var != null) {
            this.f308a = d0Var;
            this.b = map;
            this.f309c = m0Var;
        } else {
            a(2);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = "source";
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4 || i == 5) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // a.a.a.a.v0.b.b1.c
    public Map<a.a.a.a.v0.f.d, g<?>> a() {
        Map<a.a.a.a.v0.f.d, g<?>> map = this.b;
        if (map != null) {
            return map;
        }
        a(4);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public d0 c() {
        d0 d0Var = this.f308a;
        if (d0Var != null) {
            return d0Var;
        }
        a(3);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.c
    public b e() {
        return e.f.a.g.a((c) this);
    }

    @Override // a.a.a.a.v0.b.b1.c
    public m0 r() {
        m0 m0Var = this.f309c;
        if (m0Var != null) {
            return m0Var;
        }
        a(5);
        throw null;
    }

    public String toString() {
        return c.f1476a.a(this, (e) null);
    }
}
