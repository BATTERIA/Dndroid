package a.a.a.a.v0.a.p;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.c1.b;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.l.j;
import a.a.l;
import a.t.n;
import a.w.c.f;
import a.w.c.i;
import a.w.c.p;
import a.w.c.s;
import java.util.Collection;

public final class e implements b {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ l[] f259d = {s.a(new p(s.a(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final a.a.a.a.v0.f.b f260e = g.f189f;

    /* renamed from: f  reason: collision with root package name */
    public static final d f261f;

    /* renamed from: g  reason: collision with root package name */
    public static final a.a.a.a.v0.f.a f262g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f263h = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final a.a.a.a.v0.l.g f264a;
    public final w b;

    /* renamed from: c  reason: collision with root package name */
    public final a.w.b.l<w, k> f265c;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }
    }

    static {
        d f2 = g.k.f199c.f();
        i.a((Object) f2, "KotlinBuiltIns.FQ_NAMES.cloneable.shortName()");
        f261f = f2;
        a.a.a.a.v0.f.a a2 = a.a.a.a.v0.f.a.a(g.k.f199c.g());
        i.a((Object) a2, "ClassId.topLevel(KotlinB…NAMES.cloneable.toSafe())");
        f262g = a2;
    }

    public /* synthetic */ e(j jVar, w wVar, a.w.b.l lVar, int i) {
        lVar = (i & 4) != 0 ? d.f258c : lVar;
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (wVar == null) {
            i.a("moduleDescriptor");
            throw null;
        } else if (lVar != null) {
            this.b = wVar;
            this.f265c = lVar;
            this.f264a = jVar.a(new f(this, jVar));
        } else {
            i.a("computeContainingDeclaration");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.c1.b
    public a.a.a.a.v0.b.e a(a.a.a.a.v0.f.a aVar) {
        if (aVar == null) {
            i.a("classId");
            throw null;
        } else if (i.a(aVar, f262g)) {
            return (a.a.a.a.v0.b.d1.k) e.f.a.g.a(this.f264a, f259d[0]);
        } else {
            return null;
        }
    }

    @Override // a.a.a.a.v0.b.c1.b
    public Collection<a.a.a.a.v0.b.e> a(a.a.a.a.v0.f.b bVar) {
        if (bVar == null) {
            i.a("packageFqName");
            throw null;
        } else if (i.a(bVar, f260e)) {
            return e.f.a.g.e((Object) ((a.a.a.a.v0.b.d1.k) e.f.a.g.a(this.f264a, f259d[0])));
        } else {
            return n.f2121c;
        }
    }

    @Override // a.a.a.a.v0.b.c1.b
    public boolean a(a.a.a.a.v0.f.b bVar, d dVar) {
        if (bVar == null) {
            i.a("packageFqName");
            throw null;
        } else if (dVar != null) {
            return i.a(dVar, f261f) && i.a(bVar, f260e);
        } else {
            i.a("name");
            throw null;
        }
    }
}
