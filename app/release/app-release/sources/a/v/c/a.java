package a.v.c;

import a.w.c.i;

public class a extends a.v.a {
    @Override // a.v.a
    public void a(Throwable th, Throwable th2) {
        if (th == null) {
            i.a("cause");
            throw null;
        } else if (th2 != null) {
            th.addSuppressed(th2);
        } else {
            i.a("exception");
            throw null;
        }
    }
}
