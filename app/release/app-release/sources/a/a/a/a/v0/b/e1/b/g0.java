package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.v;
import a.a.a.a.v0.d.a.c0.z;
import a.w.c.i;
import e.a.a.a.a;
import e.f.a.g;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class g0 extends d0 implements z {

    /* renamed from: a  reason: collision with root package name */
    public final WildcardType f464a;

    public g0(WildcardType wildcardType) {
        if (wildcardType != null) {
            this.f464a = wildcardType;
        } else {
            i.a("reflectType");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.e1.b.d0
    public Type S() {
        return this.f464a;
    }

    @Override // a.a.a.a.v0.d.a.c0.z
    public boolean l() {
        Type[] upperBounds = this.f464a.getUpperBounds();
        i.a((Object) upperBounds, "reflectType.upperBounds");
        return !i.a((Type) g.c((Object[]) upperBounds), Object.class);
    }

    @Override // a.a.a.a.v0.d.a.c0.z
    public v r() {
        Type type;
        Type[] upperBounds = this.f464a.getUpperBounds();
        Type[] lowerBounds = this.f464a.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder a2 = a.a("Wildcard types with many bounds are not yet supported: ");
            a2.append(this.f464a);
            throw new UnsupportedOperationException(a2.toString());
        }
        if (lowerBounds.length == 1) {
            i.a((Object) lowerBounds, "lowerBounds");
            Object j = g.j(lowerBounds);
            i.a(j, "lowerBounds.single()");
            type = (Type) j;
        } else if (upperBounds.length != 1) {
            return null;
        } else {
            i.a((Object) upperBounds, "upperBounds");
            type = (Type) g.j(upperBounds);
            if (!(!i.a(type, Object.class))) {
                return null;
            }
            i.a((Object) type, "ub");
        }
        return d0.a(type);
    }
}
