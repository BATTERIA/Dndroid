package a.a0;

import a.w.b.p;
import a.w.c.i;

public final class j extends a.w.c.j implements p<CharSequence, Integer, a.j<? extends Integer, ? extends Integer>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ char[] f2072c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2073d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(char[] cArr, boolean z) {
        super(2);
        this.f2072c = cArr;
        this.f2073d = z;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // a.w.b.p
    public a.j<? extends Integer, ? extends Integer> a(CharSequence charSequence, Integer num) {
        CharSequence charSequence2 = charSequence;
        int intValue = num.intValue();
        if (charSequence2 != null) {
            int a2 = i.a(charSequence2, this.f2072c, intValue, this.f2073d);
            if (a2 < 0) {
                return null;
            }
            return new a.j(Integer.valueOf(a2), 1);
        }
        i.a("$receiver");
        throw null;
    }
}
