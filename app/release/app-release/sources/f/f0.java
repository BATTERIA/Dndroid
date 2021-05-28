package f;

import g.f;

public class f0 extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f5014a;
    public final /* synthetic */ int b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f5015c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5016d;

    public f0(a0 a0Var, int i, byte[] bArr, int i2) {
        this.f5014a = a0Var;
        this.b = i;
        this.f5015c = bArr;
        this.f5016d = i2;
    }

    @Override // f.g0
    public long a() {
        return (long) this.b;
    }

    @Override // f.g0
    public void a(f fVar) {
        fVar.write(this.f5015c, this.f5016d, this.b);
    }

    @Override // f.g0
    public a0 b() {
        return this.f5014a;
    }
}
