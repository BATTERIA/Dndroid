package a.a.a.a.v0.o;

import a.w.b.l;

public final class a extends b<N, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f1994a;
    public final /* synthetic */ boolean[] b;

    public a(l lVar, boolean[] zArr) {
        this.f1994a = lVar;
        this.b = zArr;
    }

    @Override // a.a.a.a.v0.o.d
    public Object a() {
        return Boolean.valueOf(this.b[0]);
    }

    @Override // a.a.a.a.v0.o.d
    public boolean b(N n) {
        if (((Boolean) this.f1994a.a(n)).booleanValue()) {
            this.b[0] = true;
        }
        return !this.b[0];
    }
}
