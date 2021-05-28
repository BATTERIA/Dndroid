package a.a.a.a.u0;

import a.w.b.a;
import a.w.c.i;
import a.w.c.j;
import java.util.Map;

public final class f extends j implements a<String> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Class f149c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f150d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Class cls, Map map) {
        super(0);
        this.f149c = cls;
        this.f150d = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public String a() {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(this.f149c.getCanonicalName());
        a.t.f.a(this.f150d.entrySet(), sb, ", ", "(", ")", 0, null, e.f148c, 48);
        String sb2 = sb.toString();
        i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
