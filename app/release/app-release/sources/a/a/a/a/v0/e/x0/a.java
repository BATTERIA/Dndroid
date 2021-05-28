package a.a.a.a.v0.e.x0;

import a.t.b;
import a.t.e;
import a.t.f;
import a.t.l;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.List;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f1234a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1235c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Integer> f1236d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f1237e;

    public a(int... iArr) {
        List<Integer> list;
        if (iArr != null) {
            this.f1237e = iArr;
            Integer a2 = g.a(iArr, 0);
            int i = -1;
            this.f1234a = a2 != null ? a2.intValue() : -1;
            Integer a3 = g.a(this.f1237e, 1);
            this.b = a3 != null ? a3.intValue() : -1;
            Integer a4 = g.a(this.f1237e, 2);
            this.f1235c = a4 != null ? a4.intValue() : i;
            int[] iArr2 = this.f1237e;
            if (iArr2.length <= 3) {
                list = l.f2119c;
            } else if (iArr2 != null) {
                list = f.g(new b.c(new e(iArr2), 3, this.f1237e.length));
            } else {
                i.a("$this$asList");
                throw null;
            }
            this.f1236d = list;
            return;
        }
        i.a("numbers");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(a.a.a.a.v0.e.x0.a r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0020
            int r0 = r4.f1234a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0013
            int r0 = r5.f1234a
            if (r0 != 0) goto L_0x001e
            int r0 = r4.b
            int r5 = r5.b
            if (r0 != r5) goto L_0x001e
            goto L_0x001f
        L_0x0013:
            int r3 = r5.f1234a
            if (r0 != r3) goto L_0x001e
            int r0 = r4.b
            int r5 = r5.b
            if (r0 > r5) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            return r1
        L_0x0020:
            java.lang.String r5 = "ourVersion"
            a.w.c.i.a(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.e.x0.a.a(a.a.a.a.v0.e.x0.a):boolean");
    }

    public boolean equals(Object obj) {
        if (obj != null && i.a(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            return this.f1234a == aVar.f1234a && this.b == aVar.b && this.f1235c == aVar.f1235c && i.a(this.f1236d, aVar.f1236d);
        }
    }

    public int hashCode() {
        int i = this.f1234a;
        int i2 = (i * 31) + this.b + i;
        int i3 = (i2 * 31) + this.f1235c + i2;
        return this.f1236d.hashCode() + (i3 * 31) + i3;
    }

    public String toString() {
        int[] iArr = this.f1237e;
        ArrayList arrayList = new ArrayList();
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (!(i2 != -1)) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return arrayList.isEmpty() ? "unknown" : f.a(arrayList, ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (a.w.b.l) null, 62);
    }
}
