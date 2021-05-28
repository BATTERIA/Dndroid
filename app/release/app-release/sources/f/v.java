package f;

import f.o0.e;
import g.f;
import java.util.List;

public final class v extends g0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f5396c = a0.a("application/x-www-form-urlencoded");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f5397a;
    public final List<String> b;

    public v(List<String> list, List<String> list2) {
        this.f5397a = e.a(list);
        this.b = e.a(list2);
    }

    @Override // f.g0
    public long a() {
        return a((f) null, true);
    }

    public final long a(f fVar, boolean z) {
        g.e eVar = z ? new g.e() : fVar.b();
        int size = this.f5397a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.writeByte(38);
            }
            eVar.a(this.f5397a.get(i));
            eVar.writeByte(61);
            eVar.a(this.b.get(i));
        }
        if (!z) {
            return 0;
        }
        long j = eVar.f5428d;
        eVar.k();
        return j;
    }

    @Override // f.g0
    public void a(f fVar) {
        a(fVar, false);
    }

    @Override // f.g0
    public a0 b() {
        return f5396c;
    }
}
