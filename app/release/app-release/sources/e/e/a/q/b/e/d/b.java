package e.e.a.q.b.e.d;

import com.didi.hummer.core.engine.jsc.jni.TypeConvertor;
import e.c.a.b.l;
import e.e.a.q.b.c;
import e.e.a.q.d.d;

public class b implements e.e.a.q.b.d.b {

    /* renamed from: a  reason: collision with root package name */
    public long f4494a;
    public long b;

    public b(long j, long j2) {
        this.f4494a = j;
        this.b = j2;
    }

    @Override // e.e.a.q.b.d.b
    public Object a(String str, Object... objArr) {
        long[] jArr;
        long j = this.f4494a;
        long JSValueGetProperty = TypeConvertor.JSValueGetProperty(j, this.b, str);
        long j2 = this.b;
        if (objArr == null) {
            jArr = null;
        } else {
            jArr = new long[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                jArr[i] = l.f.a(j, objArr[i]);
            }
        }
        return l.f.a(j, TypeConvertor.JSFunctionCall(j, j2, JSValueGetProperty, jArr));
    }

    @Override // e.e.a.q.b.d.b
    public c b(String str) {
        long j = this.f4494a;
        return new e.e.a.q.b.e.c(j, TypeConvertor.JSValueGetProperty(j, this.b, str));
    }

    @Override // e.e.a.q.b.d.b
    public long a(String str) {
        long j = this.f4494a;
        return (long) TypeConvertor.JSValue2Double(j, TypeConvertor.JSValueGetProperty(j, this.b, str));
    }

    @Override // e.e.a.q.b.d.b
    public void a(String str, Object obj) {
        long j = this.f4494a;
        long makeFromJsonString = TypeConvertor.makeFromJsonString(j, d.a(obj));
        new c(j, makeFromJsonString);
        new b(j, makeFromJsonString);
        TypeConvertor.JSValueSetProperty(this.f4494a, this.b, str, makeFromJsonString);
    }
}
