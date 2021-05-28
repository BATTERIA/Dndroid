package a.a.a.a.v0.m;

public enum g1 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);
    

    /* renamed from: c  reason: collision with root package name */
    public final String f1857c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1858d;

    /* access modifiers changed from: public */
    g1(String str, boolean z, boolean z2, int i) {
        this.f1857c = str;
        this.f1858d = z2;
    }

    public String toString() {
        return this.f1857c;
    }
}
