package a.a.a.a.v0.i;

import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.g;
import a.t.t;
import a.w.c.i;
import java.util.ArrayList;
import java.util.List;

public interface b {

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1473a = new a();

        @Override // a.a.a.a.v0.i.b
        public String a(h hVar, c cVar) {
            if (hVar == null) {
                i.a("classifier");
                throw null;
            } else if (cVar == null) {
                i.a("renderer");
                throw null;
            } else if (hVar instanceof r0) {
                d d2 = ((r0) hVar).d();
                i.a((Object) d2, "classifier.name");
                return cVar.a(d2, false);
            } else {
                a.a.a.a.v0.f.c e2 = g.e(hVar);
                i.a((Object) e2, "DescriptorUtils.getFqName(classifier)");
                return cVar.a(e2);
            }
        }
    }

    /* renamed from: a.a.a.a.v0.i.b$b  reason: collision with other inner class name */
    public static final class C0058b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0058b f1474a = new C0058b();

        @Override // a.a.a.a.v0.i.b
        public String a(h hVar, c cVar) {
            boolean z;
            if (hVar == null) {
                i.a("classifier");
                throw null;
            } else if (cVar == null) {
                i.a("renderer");
                throw null;
            } else if (hVar instanceof r0) {
                d d2 = ((r0) hVar).d();
                i.a((Object) d2, "classifier.name");
                return cVar.a(d2, false);
            } else {
                ArrayList arrayList = new ArrayList();
                h hVar2 = hVar;
                do {
                    arrayList.add(hVar2.d());
                    k b = hVar2.b();
                    z = b instanceof e;
                    hVar2 = b;
                } while (z);
                return e.f.a.g.d((List<d>) new t(arrayList));
            }
        }
    }

    String a(h hVar, c cVar);

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f1475a = new c();

        public final String a(h hVar) {
            String str;
            d d2 = hVar.d();
            i.a((Object) d2, "descriptor.name");
            String a2 = e.f.a.g.a(d2);
            if (hVar instanceof r0) {
                return a2;
            }
            k b = hVar.b();
            i.a((Object) b, "descriptor.containingDeclaration");
            if (b instanceof e) {
                str = a((h) b);
            } else if (b instanceof y) {
                a.a.a.a.v0.f.c f2 = ((y) b).e().f();
                i.a((Object) f2, "descriptor.fqName.toUnsafe()");
                List<d> e2 = f2.e();
                i.a((Object) e2, "pathSegments()");
                str = e.f.a.g.d(e2);
            } else {
                str = null;
            }
            return (str == null || !(i.a(str, "") ^ true)) ? a2 : e.a.a.a.a.a(str, ".", a2);
        }

        @Override // a.a.a.a.v0.i.b
        public String a(h hVar, c cVar) {
            if (hVar == null) {
                i.a("classifier");
                throw null;
            } else if (cVar != null) {
                return a(hVar);
            } else {
                i.a("renderer");
                throw null;
            }
        }
    }
}
