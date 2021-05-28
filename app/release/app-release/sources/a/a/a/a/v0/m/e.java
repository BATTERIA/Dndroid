package a.a.a.a.v0.m;

import a.a.a.a.v0.m.k1.g;
import a.a.a.a.v0.m.k1.h;
import a.w.b.q;
import a.w.c.i;
import a.w.c.j;
import java.util.Collection;

public final class e extends j implements q<h, h, Boolean, Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f1827c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar) {
        super(3);
        this.f1827c = gVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // a.w.b.q
    public /* bridge */ /* synthetic */ Boolean a(h hVar, h hVar2, Boolean bool) {
        return Boolean.valueOf(a(hVar, hVar2, bool.booleanValue()));
    }

    public final boolean a(h hVar, h hVar2, boolean z) {
        boolean z2;
        if (hVar == null) {
            i.a("integerLiteralType");
            throw null;
        } else if (hVar2 != null) {
            Collection<g> b = this.f1827c.b(hVar);
            if ((b instanceof Collection) && b.isEmpty()) {
                return false;
            }
            for (T t : b) {
                if (i.a(this.f1827c.c((g) t), this.f1827c.a(hVar2)) || (z && f.b(this.f1827c, (g) hVar2, (g) t))) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        } else {
            i.a("type");
            throw null;
        }
    }
}
