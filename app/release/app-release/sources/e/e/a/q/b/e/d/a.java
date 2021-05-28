package e.e.a.q.b.e.d;

import com.didi.hummer.core.engine.jsc.jni.TypeConvertor;
import e.c.a.b.l;

public class a implements e.e.a.q.b.d.a {

    /* renamed from: a  reason: collision with root package name */
    public long f4492a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public long f4493c;

    public a(long j, long j2, long j3) {
        this.f4492a = j;
        this.b = j2;
        this.f4493c = j3;
    }

    @Override // e.e.a.q.b.d.a
    public Object a(Object... objArr) {
        long[] jArr;
        long j = this.f4492a;
        if (objArr == null) {
            jArr = null;
        } else {
            long[] jArr2 = new long[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                jArr2[i] = l.f.a(j, objArr[i]);
            }
            jArr = jArr2;
        }
        return l.f.a(this.f4492a, TypeConvertor.JSFunctionCall(this.f4492a, this.f4493c, this.b, jArr));
    }
}
