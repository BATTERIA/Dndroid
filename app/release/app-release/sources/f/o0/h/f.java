package f.o0.h;

import e.a.a.a.a;
import f.e0;
import f.h0;
import f.j;
import f.o0.g.d;
import f.o0.g.l;
import f.z;
import java.util.List;

public final class f implements z.a {

    /* renamed from: a  reason: collision with root package name */
    public final List<z> f5159a;
    public final l b;

    /* renamed from: c  reason: collision with root package name */
    public final d f5160c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5161d;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f5162e;

    /* renamed from: f  reason: collision with root package name */
    public final j f5163f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5164g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5165h;
    public final int i;
    public int j;

    public f(List<z> list, l lVar, d dVar, int i2, e0 e0Var, j jVar, int i3, int i4, int i5) {
        this.f5159a = list;
        this.b = lVar;
        this.f5160c = dVar;
        this.f5161d = i2;
        this.f5162e = e0Var;
        this.f5163f = jVar;
        this.f5164g = i3;
        this.f5165h = i4;
        this.i = i5;
    }

    public h0 a(e0 e0Var) {
        return a(e0Var, this.b, this.f5160c);
    }

    public h0 a(e0 e0Var, l lVar, d dVar) {
        if (this.f5161d < this.f5159a.size()) {
            this.j++;
            d dVar2 = this.f5160c;
            if (dVar2 != null) {
                if (!dVar2.a().a(e0Var.f5005a)) {
                    StringBuilder a2 = a.a("network interceptor ");
                    a2.append(this.f5159a.get(this.f5161d - 1));
                    a2.append(" must retain the same host and port");
                    throw new IllegalStateException(a2.toString());
                }
            }
            if (this.f5160c == null || this.j <= 1) {
                f fVar = new f(this.f5159a, lVar, dVar, this.f5161d + 1, e0Var, this.f5163f, this.f5164g, this.f5165h, this.i);
                z zVar = this.f5159a.get(this.f5161d);
                h0 a3 = zVar.a(fVar);
                if (dVar != null && this.f5161d + 1 < this.f5159a.size() && fVar.j != 1) {
                    throw new IllegalStateException("network interceptor " + zVar + " must call proceed() exactly once");
                } else if (a3 == null) {
                    throw new NullPointerException("interceptor " + zVar + " returned null");
                } else if (a3.i != null) {
                    return a3;
                } else {
                    throw new IllegalStateException("interceptor " + zVar + " returned a response with no body");
                }
            } else {
                StringBuilder a4 = a.a("network interceptor ");
                a4.append(this.f5159a.get(this.f5161d - 1));
                a4.append(" must call proceed() exactly once");
                throw new IllegalStateException(a4.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
