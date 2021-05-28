package e.b.a.a;

import a.q;
import a.w.c.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3741a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final a.w.b.a<q> f3742c;

    public a(String str, int i, a.w.b.a<q> aVar) {
        if (str == null) {
            i.a("name");
            throw null;
        } else if (aVar != null) {
            this.f3741a = str;
            this.b = i;
            this.f3742c = aVar;
        } else {
            i.a("clickAction");
            throw null;
        }
    }
}
