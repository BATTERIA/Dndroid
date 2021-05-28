package g;

import java.util.concurrent.TimeUnit;

public class k extends y {

    /* renamed from: e  reason: collision with root package name */
    public y f5442e;

    public k(y yVar) {
        if (yVar != null) {
            this.f5442e = yVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // g.y
    public y a() {
        return this.f5442e.a();
    }

    @Override // g.y
    public y a(long j) {
        return this.f5442e.a(j);
    }

    @Override // g.y
    public y a(long j, TimeUnit timeUnit) {
        return this.f5442e.a(j, timeUnit);
    }

    @Override // g.y
    public y b() {
        return this.f5442e.b();
    }

    @Override // g.y
    public long c() {
        return this.f5442e.c();
    }

    @Override // g.y
    public boolean d() {
        return this.f5442e.d();
    }

    @Override // g.y
    public void e() {
        this.f5442e.e();
    }

    @Override // g.y
    public long f() {
        return this.f5442e.f();
    }
}
