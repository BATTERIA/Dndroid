package a.a0;

import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import a.y.c;

public final class m extends j implements l<c, String> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CharSequence f2077c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(CharSequence charSequence) {
        super(1);
        this.f2077c = charSequence;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public String a(c cVar) {
        c cVar2 = cVar;
        if (cVar2 != null) {
            return i.a(this.f2077c, cVar2);
        }
        i.a("it");
        throw null;
    }
}
