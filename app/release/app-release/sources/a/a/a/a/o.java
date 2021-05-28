package a.a.a.a;

import a.a.a.a.v0.b.s;
import a.a.a.a.v0.i.c;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class o extends j implements l<s, String> {

    /* renamed from: c  reason: collision with root package name */
    public static final o f110c = new o();

    public o() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public String a(s sVar) {
        s sVar2 = sVar;
        if (sVar2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c.b.a(sVar2));
            sb.append(" | ");
            q0 q0Var = q0.b;
            sb.append(q0.b(sVar2).a());
            return sb.toString();
        }
        i.a("descriptor");
        throw null;
    }
}
