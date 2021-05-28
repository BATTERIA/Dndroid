package e.e.a.q.b.e;

import e.e.a.q.b.d.b;

public class c implements e.e.a.q.b.c {

    /* renamed from: a  reason: collision with root package name */
    public long f4488a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public e.e.a.q.b.d.c f4489c;

    /* renamed from: d  reason: collision with root package name */
    public b f4490d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f4491e = true;

    public c(long j, long j2) {
        this.f4488a = j;
        this.b = j2;
        this.f4489c = new e.e.a.q.b.e.d.c(j, j2);
        this.f4490d = new e.e.a.q.b.e.d.b(j, j2);
    }

    @Override // e.e.a.q.b.d.b
    public long a(String str) {
        return this.f4490d.a(str);
    }

    @Override // e.e.a.q.b.c
    public e.e.a.q.b.b a() {
        return new b(this.f4488a);
    }

    @Override // e.e.a.q.b.d.b
    public Object a(String str, Object... objArr) {
        return this.f4490d.a(str, objArr);
    }

    @Override // e.e.a.q.b.d.b
    public void a(String str, Object obj) {
        this.f4490d.a(str, obj);
    }

    @Override // e.e.a.q.b.d.b
    public e.e.a.q.b.c b(String str) {
        return this.f4490d.b(str);
    }

    @Override // e.e.a.q.b.d.c
    public boolean b() {
        return this.f4489c.b();
    }

    @Override // e.e.a.q.b.d.c
    public boolean c() {
        return this.f4489c.c();
    }

    @Override // e.e.a.q.b.d.e
    public void d() {
        k();
    }

    @Override // e.e.a.q.b.d.c
    public boolean e() {
        return this.f4489c.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return cVar.f4488a == this.f4488a && cVar.b == this.b;
    }

    @Override // e.e.a.q.b.d.d
    public long f() {
        return this.b;
    }

    @Override // e.e.a.q.b.d.c
    public boolean g() {
        return this.f4489c.g();
    }

    @Override // e.e.a.q.b.d.c
    public boolean h() {
        return this.f4489c.h();
    }

    @Override // e.e.a.q.b.d.c
    public String i() {
        return this.f4489c.i();
    }

    @Override // e.e.a.q.b.d.c
    public boolean j() {
        return this.f4489c.j();
    }

    @Override // e.e.a.q.b.d.c
    public void k() {
        if (!this.f4491e) {
            this.f4491e = true;
            this.f4489c.k();
        }
    }

    @Override // e.e.a.q.b.d.c
    public void l() {
        if (this.f4491e) {
            this.f4491e = false;
            this.f4489c.l();
        }
    }

    @Override // e.e.a.q.b.d.c
    public double m() {
        return this.f4489c.m();
    }
}
