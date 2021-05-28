package e.d.a.s;

import e.a.a.a.a;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f4277a;
    public Class<?> b;

    public g() {
    }

    public g(Class<?> cls, Class<?> cls2) {
        this.f4277a = cls;
        this.b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f4277a.equals(gVar.f4277a) && this.b.equals(gVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.f4277a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("MultiClassKey{first=");
        a2.append(this.f4277a);
        a2.append(", second=");
        a2.append(this.b);
        a2.append('}');
        return a2.toString();
    }
}
