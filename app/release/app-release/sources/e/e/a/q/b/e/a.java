package e.e.a.q.b.e;

import com.didi.hummer.core.engine.jsc.jni.TypeConvertor;
import e.e.a.q.b.b;

public class a implements e.e.a.q.b.a {

    /* renamed from: a  reason: collision with root package name */
    public long f4485a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public e.e.a.q.b.d.a f4486c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f4487d;

    public a(long j, long j2) {
        this.f4485a = j;
        this.b = j2;
        this.f4486c = new e.e.a.q.b.e.d.a(j, j2, -1);
        TypeConvertor.JSValueProtect(j, j2);
    }

    @Override // e.e.a.q.b.d.a
    public Object a(Object... objArr) {
        if (!TypeConvertor.isJSValueValid(this.f4485a, this.b)) {
            return null;
        }
        return this.f4486c.a(objArr);
    }

    @Override // e.e.a.q.b.d.e
    public void d() {
        if (!this.f4487d) {
            this.f4487d = true;
            TypeConvertor.JSValueUnProtect(this.f4485a, this.b);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e.e.a.q.b.a)) {
            return false;
        }
        e.e.a.q.b.a aVar = (e.e.a.q.b.a) obj;
        if (((b) aVar.a()).f4488a == ((b) a()).f4488a && aVar.f() == this.b) {
            return true;
        }
        return false;
    }

    @Override // e.e.a.q.b.d.d
    public long f() {
        return this.b;
    }

    public void finalize() {
        d();
    }

    @Override // e.e.a.q.b.a
    public b a() {
        return new b(this.f4485a);
    }
}
