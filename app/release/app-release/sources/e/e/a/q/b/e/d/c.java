package e.e.a.q.b.e.d;

import com.didi.hummer.core.engine.jsc.jni.TypeConvertor;

public class c implements e.e.a.q.b.d.c {

    /* renamed from: a  reason: collision with root package name */
    public long f4495a;
    public long b;

    public c(long j, long j2) {
        this.f4495a = j;
        this.b = j2;
    }

    @Override // e.e.a.q.b.d.c
    public boolean b() {
        return TypeConvertor.isJSString(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public boolean c() {
        return TypeConvertor.JSValue2Boolean(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public boolean e() {
        return TypeConvertor.isJSNumber(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public boolean g() {
        return TypeConvertor.isJSBoolean(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public boolean h() {
        return TypeConvertor.isJSNull(this.f4495a, this.b) || TypeConvertor.isJSUndefined(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public String i() {
        return TypeConvertor.JSValue2String(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public boolean j() {
        return TypeConvertor.isJSFunction(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public void k() {
        TypeConvertor.JSValueUnProtect(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public void l() {
        TypeConvertor.JSValueProtect(this.f4495a, this.b);
    }

    @Override // e.e.a.q.b.d.c
    public double m() {
        return TypeConvertor.JSValue2Double(this.f4495a, this.b);
    }
}
