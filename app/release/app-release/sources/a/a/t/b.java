package a.a.t;

import a.w.c.i;

public final class b extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(IllegalAccessException illegalAccessException) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", illegalAccessException);
        if (illegalAccessException != null) {
        } else {
            i.a("cause");
            throw null;
        }
    }
}
