package e.d.a.q.g;

import e.a.a.a.a;
import e.d.a.s.h;

public abstract class g<Z> extends a<Z> {
    public final int b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final int f4254c = Integer.MIN_VALUE;

    @Override // e.d.a.q.g.a
    public final void a(h hVar) {
        if (h.a(this.b, this.f4254c)) {
            hVar.a(this.b, this.f4254c);
            return;
        }
        StringBuilder a2 = a.a("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        a2.append(this.b);
        a2.append(" and height: ");
        a2.append(this.f4254c);
        a2.append(", either provide dimensions in the constructor");
        a2.append(" or call override()");
        throw new IllegalArgumentException(a2.toString());
    }
}
