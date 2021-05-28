package f.o0.j;

import f.o0.d;
import f.o0.j.f;

public class j extends d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f5270d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f5271e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f.i f5272f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(f.i iVar, String str, Object[] objArr, boolean z, q qVar) {
        super(str, objArr);
        this.f5272f = iVar;
        this.f5270d = z;
        this.f5271e = qVar;
    }

    @Override // f.o0.d
    public void a() {
        this.f5272f.a(this.f5270d, this.f5271e);
    }
}
