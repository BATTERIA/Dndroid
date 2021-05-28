package f.o0.j;

import f.o0.d;
import f.o0.j.p;
import java.io.IOException;
import java.util.List;

public class g extends d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5258d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ List f5259e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f5260f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ f f5261g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(f fVar, String str, Object[] objArr, int i, List list, boolean z) {
        super(str, objArr);
        this.f5261g = fVar;
        this.f5258d = i;
        this.f5259e = list;
        this.f5260f = z;
    }

    @Override // f.o0.d
    public void a() {
        f fVar = this.f5261g;
        p pVar = fVar.l;
        int i = this.f5258d;
        if (((p.a) pVar) != null) {
            try {
                fVar.x.a(i, b.CANCEL);
                synchronized (this.f5261g) {
                    this.f5261g.z.remove(Integer.valueOf(this.f5258d));
                }
            } catch (IOException unused) {
            }
        } else {
            throw null;
        }
    }
}
