package e.d.a.q.f;

import e.d.a.q.f.f;

public class g<R> implements d<R> {

    /* renamed from: a  reason: collision with root package name */
    public final f.a f4250a;
    public c<R> b;

    public g(f.a aVar) {
        this.f4250a = aVar;
    }

    @Override // e.d.a.q.f.d
    public c<R> a(boolean z, boolean z2) {
        if (z || !z2) {
            return e.f4248a;
        }
        if (this.b == null) {
            this.b = new f(this.f4250a);
        }
        return this.b;
    }
}
