package e.i.a.a.a.c;

public enum b {
    None(0, false, false, false, false, false),
    PullDownToRefresh(1, true, false, false, false, false),
    PullUpToLoad(2, true, false, false, false, false),
    PullDownCanceled(1, false, false, false, false, false),
    PullUpCanceled(2, false, false, false, false, false),
    ReleaseToRefresh(1, true, false, false, false, true),
    ReleaseToLoad(2, true, false, false, false, true),
    ReleaseToTwoLevel(1, true, false, false, true, true),
    TwoLevelReleased(1, false, false, false, true, false),
    RefreshReleased(1, false, false, false, false, false),
    LoadReleased(2, false, false, false, false, false),
    Refreshing(1, false, true, false, false, false),
    Loading(2, false, true, false, false, false),
    TwoLevel(1, false, true, false, true, false),
    RefreshFinish(1, false, false, true, false, false),
    LoadFinish(2, false, false, true, false, false),
    TwoLevelFinish(1, false, false, true, true, false);
    

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4892c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4893d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4894e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4895f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4896g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4897h;
    public final boolean i;

    /* access modifiers changed from: public */
    b(int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = false;
        this.f4892c = i2 == 1;
        this.f4893d = i2 == 2 ? true : z6;
        this.f4895f = z;
        this.f4896g = z2;
        this.f4897h = z3;
        this.f4894e = z4;
        this.i = z5;
    }

    public b a() {
        return (!this.f4892c || this.f4894e) ? this : values()[ordinal() + 1];
    }

    public b b() {
        return (!this.f4893d || this.f4894e) ? this : values()[ordinal() - 1];
    }
}
