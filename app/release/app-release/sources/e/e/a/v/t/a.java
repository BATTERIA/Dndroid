package e.e.a.v.t;

import e.e.a.q.b.b;

public abstract class a implements e.e.a.q.b.a {
    @Override // e.e.a.q.b.a
    public b a() {
        return null;
    }

    @Override // e.e.a.q.b.d.a
    public Object a(Object... objArr) {
        a(objArr.length > 0 ? objArr[0] : null);
        return null;
    }

    public abstract void a(Object obj);

    public long b() {
        return 0;
    }

    @Override // e.e.a.q.b.d.e
    public void d() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e.e.a.q.b.a)) {
            return false;
        }
        e.e.a.q.b.a aVar = (e.e.a.q.b.a) obj;
        if (((e.e.a.q.b.e.b) aVar.a()).f4488a == b() && aVar.f() == f()) {
            return true;
        }
        return false;
    }

    @Override // e.e.a.q.b.d.d
    public long f() {
        return 0;
    }
}
