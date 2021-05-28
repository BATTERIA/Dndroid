package a.a.a.a.v0.m.i1;

import a.a0.n;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class v extends j implements l<String, StringBuilder> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ StringBuilder f1907c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(StringBuilder sb) {
        super(1);
        this.f1907c = sb;
    }

    public final StringBuilder a(String str) {
        if (str != null) {
            StringBuilder sb = this.f1907c;
            sb.append(str);
            i.a((Object) sb, "append(value)");
            sb.append(n.f2078a);
            i.a((Object) sb, "append(SystemProperties.LINE_SEPARATOR)");
            return sb;
        }
        i.a("$this$unaryPlus");
        throw null;
    }
}
