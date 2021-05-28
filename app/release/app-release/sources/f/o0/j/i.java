package f.o0.j;

import f.o0.d;
import f.o0.j.p;

public class i extends d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5267d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f5268e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f5269f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(f fVar, String str, Object[] objArr, int i, b bVar) {
        super(str, objArr);
        this.f5269f = fVar;
        this.f5267d = i;
        this.f5268e = bVar;
    }

    @Override // f.o0.d
    public void a() {
        f fVar = this.f5269f;
        if (((p.a) fVar.l) != null) {
            synchronized (fVar) {
                this.f5269f.z.remove(Integer.valueOf(this.f5267d));
            }
            return;
        }
        throw null;
    }
}
