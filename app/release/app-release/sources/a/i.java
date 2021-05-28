package a;

public final class i extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str) {
        super(str);
        if (str != null) {
        } else {
            a.w.c.i.a("message");
            throw null;
        }
    }
}
