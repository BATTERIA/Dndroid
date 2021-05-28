package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.a;
import a.a.a.a.v0.d.a.c0.v;
import a.a.a.a.v0.d.a.c0.y;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.w.c.i;
import e.f.a.g;
import java.lang.annotation.Annotation;
import java.util.Collection;

public final class f0 extends u implements y {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f461a;
    public final Annotation[] b;

    /* renamed from: c  reason: collision with root package name */
    public final String f462c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f463d;

    public f0(d0 d0Var, Annotation[] annotationArr, String str, boolean z) {
        if (d0Var == null) {
            i.a("type");
            throw null;
        } else if (annotationArr != null) {
            this.f461a = d0Var;
            this.b = annotationArr;
            this.f462c = str;
            this.f463d = z;
        } else {
            i.a("reflectAnnotations");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.y
    public boolean A() {
        return this.f463d;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public a a(b bVar) {
        if (bVar != null) {
            return g.a(this.b, bVar);
        }
        i.a("fqName");
        throw null;
    }

    @Override // a.a.a.a.v0.d.a.c0.y
    public v c() {
        return this.f461a;
    }

    @Override // a.a.a.a.v0.d.a.c0.y
    public d d() {
        String str = this.f462c;
        if (str != null) {
            return d.a(str);
        }
        return null;
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public boolean t() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f0.class.getName());
        sb.append(": ");
        sb.append(this.f463d ? "vararg " : "");
        String str = this.f462c;
        sb.append(str != null ? d.a(str) : null);
        sb.append(": ");
        sb.append(this.f461a);
        return sb.toString();
    }

    @Override // a.a.a.a.v0.d.a.c0.d
    public Collection y() {
        return g.a(this.b);
    }
}
