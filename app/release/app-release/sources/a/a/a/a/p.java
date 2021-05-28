package a.a.a.a;

import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.i.c;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class p extends j implements l<f0, String> {

    /* renamed from: c  reason: collision with root package name */
    public static final p f113c = new p();

    public p() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // a.w.b.l
    public String a(f0 f0Var) {
        f0 f0Var2 = f0Var;
        if (f0Var2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(c.b.a(f0Var2));
            sb.append(" | ");
            q0 q0Var = q0.b;
            sb.append(q0.a(f0Var2).a());
            return sb.toString();
        }
        i.a("descriptor");
        throw null;
    }
}
