package f.o0.j;

import f.o0.d;
import f.o0.j.p;
import g.e;
import java.io.IOException;

public class h extends d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5262d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f5263e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f5264f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f5265g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f5266h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(f fVar, String str, Object[] objArr, int i, e eVar, int i2, boolean z) {
        super(str, objArr);
        this.f5266h = fVar;
        this.f5262d = i;
        this.f5263e = eVar;
        this.f5264f = i2;
        this.f5265g = z;
    }

    @Override // f.o0.d
    public void a() {
        try {
            p pVar = this.f5266h.l;
            e eVar = this.f5263e;
            int i = this.f5264f;
            if (((p.a) pVar) != null) {
                eVar.skip((long) i);
                this.f5266h.x.a(this.f5262d, b.CANCEL);
                synchronized (this.f5266h) {
                    this.f5266h.z.remove(Integer.valueOf(this.f5262d));
                }
                return;
            }
            throw null;
        } catch (IOException unused) {
        }
    }
}
