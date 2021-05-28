package a.a.a.a.v0.d.a.d0;

import a.w.b.l;
import a.w.c.j;
import e.f.a.g;

public final class m extends j implements l<Integer, d> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d[] f760c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(d[] dVarArr) {
        super(1);
        this.f760c = dVarArr;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public d a(Integer num) {
        int intValue = num.intValue();
        d[] dVarArr = this.f760c;
        if (intValue >= 0 && intValue <= g.d((Object[]) dVarArr)) {
            return dVarArr[intValue];
        }
        d dVar = d.f694f;
        return d.f693e;
    }
}
