package a.a.a.a.v0.b;

import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.i1.f;
import a.a.l;
import a.w.c.p;
import a.w.c.s;

public final class j0<T extends i> {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ l[] f485e = {s.a(new p(s.a(j0.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: f  reason: collision with root package name */
    public static final a f486f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final g f487a;
    public final e b;

    /* renamed from: c  reason: collision with root package name */
    public final a.w.b.l<f, T> f488c;

    /* renamed from: d  reason: collision with root package name */
    public final f f489d;

    public static final class a {
        public /* synthetic */ a(a.w.c.f fVar) {
        }

        public final <T extends i> j0<T> a(e eVar, j jVar, f fVar, a.w.b.l<? super f, ? extends T> lVar) {
            if (eVar == null) {
                a.w.c.i.a("classDescriptor");
                throw null;
            } else if (jVar == null) {
                a.w.c.i.a("storageManager");
                throw null;
            } else if (fVar == null) {
                a.w.c.i.a("kotlinTypeRefinerForOwnerModule");
                throw null;
            } else if (lVar != null) {
                return new j0<>(eVar, jVar, lVar, fVar, null);
            } else {
                a.w.c.i.a("scopeFactory");
                throw null;
            }
        }
    }

    public /* synthetic */ j0(e eVar, j jVar, a.w.b.l lVar, f fVar, a.w.c.f fVar2) {
        this.b = eVar;
        this.f488c = lVar;
        this.f489d = fVar;
        this.f487a = jVar.a(new k0(this));
    }

    public final T a(f fVar) {
        if (fVar == null) {
            a.w.c.i.a("kotlinTypeRefiner");
            throw null;
        } else if (a.a.a.a.v0.j.u.a.e(this.b) != null) {
            return (T) ((i) e.f.a.g.a(this.f487a, f485e[0]));
        } else {
            a.w.c.i.a("moduleDescriptor");
            throw null;
        }
    }
}
