package a.a.t;

import a.w.c.i;

public final class a extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(IllegalAccessException illegalAccessException) {
        super(illegalAccessException);
        if (illegalAccessException != null) {
        } else {
            i.a("cause");
            throw null;
        }
    }
}
