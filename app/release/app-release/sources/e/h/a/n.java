package e.h.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n extends q implements Iterable<q> {

    /* renamed from: c  reason: collision with root package name */
    public final List<q> f4843c = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f4843c.equals(this.f4843c));
    }

    public int hashCode() {
        return this.f4843c.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<q> iterator() {
        return this.f4843c.iterator();
    }
}
