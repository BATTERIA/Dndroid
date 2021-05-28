package a.t;

import a.w.c.i;
import e.f.a.g;
import java.util.RandomAccess;

public final class e extends b<Integer> implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int[] f2113c;

    public e(int[] iArr) {
        this.f2113c = iArr;
    }

    @Override // a.t.a
    public int a() {
        return this.f2113c.length;
    }

    @Override // a.t.a
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f2113c;
        if (iArr == null) {
            i.a("$this$contains");
            throw null;
        } else if (g.b(iArr, intValue) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, a.t.b
    public Integer get(int i) {
        return Integer.valueOf(this.f2113c[i]);
    }

    @Override // a.t.b
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return g.b(this.f2113c, ((Number) obj).intValue());
    }

    @Override // a.t.a
    public boolean isEmpty() {
        return this.f2113c.length == 0;
    }

    @Override // a.t.b
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f2113c;
        if (iArr != null) {
            for (int length = iArr.length - 1; length >= 0; length--) {
                if (intValue == iArr[length]) {
                    return length;
                }
            }
            return -1;
        }
        i.a("$this$lastIndexOf");
        throw null;
    }
}
