package a.a.a.a.v0.d.a.y;

import a.a.a.a.v0.b.b1.m;
import a.a.a.a.v0.b.b1.n;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.d.a.c0.b;
import a.a.a.a.v0.j.s.k;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.j;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, EnumSet<n>> f846a = f.a(new j("PACKAGE", EnumSet.noneOf(n.class)), new j("TYPE", EnumSet.of(n.f337d, n.p)), new j("ANNOTATION_TYPE", EnumSet.of(n.f338e)), new j("TYPE_PARAMETER", EnumSet.of(n.f339f)), new j("FIELD", EnumSet.of(n.f341h)), new j("LOCAL_VARIABLE", EnumSet.of(n.i)), new j("PARAMETER", EnumSet.of(n.j)), new j("CONSTRUCTOR", EnumSet.of(n.k)), new j("METHOD", EnumSet.of(n.l, n.m, n.n)), new j("TYPE_USE", EnumSet.of(n.o)));
    public static final Map<String, m> b = f.a(new j("RUNTIME", m.RUNTIME), new j("CLASS", m.BINARY), new j("SOURCE", m.SOURCE));

    /* renamed from: c  reason: collision with root package name */
    public static final d f847c = new d();

    public static final class a extends a.w.c.j implements l<w, d0> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f848c = new a();

        public a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public d0 a(w wVar) {
            d0 c2;
            w wVar2 = wVar;
            if (wVar2 != null) {
                c cVar = c.j;
                w0 a2 = g.a(c.f844g, wVar2.m().a(a.a.a.a.v0.a.g.k.z));
                if (a2 != null && (c2 = a2.c()) != null) {
                    return c2;
                }
                k0 b = a.a.a.a.v0.m.w.b("Error: AnnotationTarget[]");
                i.a((Object) b, "ErrorUtils.createErrorTy…ror: AnnotationTarget[]\")");
                return b;
            }
            i.a("module");
            throw null;
        }
    }

    public final a.a.a.a.v0.j.s.g<?> a(List<? extends b> list) {
        if (list != null) {
            ArrayList<a.a.a.a.v0.d.a.c0.m> arrayList = new ArrayList();
            for (T t : list) {
                if (t instanceof a.a.a.a.v0.d.a.c0.m) {
                    arrayList.add(t);
                }
            }
            ArrayList<n> arrayList2 = new ArrayList();
            for (a.a.a.a.v0.d.a.c0.m mVar : arrayList) {
                a.a.a.a.v0.f.d a2 = mVar.a();
                EnumSet<n> enumSet = f846a.get(a2 != null ? a2.a() : null);
                if (enumSet == null) {
                    enumSet = a.t.n.f2121c;
                }
                g.a(arrayList2, enumSet);
            }
            ArrayList arrayList3 = new ArrayList(g.a((Iterable) arrayList2, 10));
            for (n nVar : arrayList2) {
                a.a.a.a.v0.f.a a3 = a.a.a.a.v0.f.a.a(a.a.a.a.v0.a.g.k.A);
                i.a((Object) a3, "ClassId.topLevel(KotlinB…Q_NAMES.annotationTarget)");
                a.a.a.a.v0.f.d b2 = a.a.a.a.v0.f.d.b(nVar.name());
                i.a((Object) b2, "Name.identifier(kotlinTarget.name)");
                arrayList3.add(new k(a3, b2));
            }
            return new a.a.a.a.v0.j.s.b(arrayList3, a.f848c);
        }
        i.a("arguments");
        throw null;
    }
}
