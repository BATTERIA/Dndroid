package e.b.a.a.g;

import a.w.c.i;
import e.a.a.a.a;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f3760a;

    public e(String str) {
        if (str != null) {
            this.f3760a = str;
        } else {
            i.a("title");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && i.a(this.f3760a, ((e) obj).f3760a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3760a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return a.a(a.a("InteractionData(title="), this.f3760a, ")");
    }
}
