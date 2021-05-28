package f.o0.h;

import f.a0;
import f.j0;

public final class g extends j0 {

    /* renamed from: c  reason: collision with root package name */
    public final String f5166c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5167d;

    /* renamed from: e  reason: collision with root package name */
    public final g.g f5168e;

    public g(String str, long j, g.g gVar) {
        this.f5166c = str;
        this.f5167d = j;
        this.f5168e = gVar;
    }

    @Override // f.j0
    public long a() {
        return this.f5167d;
    }

    @Override // f.j0
    public a0 k() {
        String str = this.f5166c;
        if (str != null) {
            return a0.b(str);
        }
        return null;
    }

    @Override // f.j0
    public g.g l() {
        return this.f5168e;
    }
}
