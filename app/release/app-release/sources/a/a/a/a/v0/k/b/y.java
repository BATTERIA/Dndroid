package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.e.f;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.x0.e;
import a.w.c.i;
import e.f.a.g;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public final c f1779a;
    public final e b;

    /* renamed from: c  reason: collision with root package name */
    public final m0 f1780c;

    public static final class a extends y {

        /* renamed from: d  reason: collision with root package name */
        public final a.a.a.a.v0.f.a f1781d;

        /* renamed from: e  reason: collision with root package name */
        public final f.c f1782e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f1783f;

        /* renamed from: g  reason: collision with root package name */
        public final f f1784g;

        /* renamed from: h  reason: collision with root package name */
        public final a f1785h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar, c cVar, e eVar, m0 m0Var, a aVar) {
            super(cVar, eVar, m0Var, null);
            if (fVar == null) {
                i.a("classProto");
                throw null;
            } else if (cVar == null) {
                i.a("nameResolver");
                throw null;
            } else if (eVar != null) {
                this.f1784g = fVar;
                this.f1785h = aVar;
                this.f1781d = g.a(cVar, fVar.f1021g);
                f.c a2 = a.a.a.a.v0.e.x0.b.f1241e.a(this.f1784g.f1020f);
                this.f1782e = a2 == null ? f.c.CLASS : a2;
                this.f1783f = e.a.a.a.a.a(a.a.a.a.v0.e.x0.b.f1242f, this.f1784g.f1020f, "Flags.IS_INNER.get(classProto.flags)");
            } else {
                i.a("typeTable");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.k.b.y
        public a.a.a.a.v0.f.b a() {
            a.a.a.a.v0.f.b a2 = this.f1781d.a();
            i.a((Object) a2, "classId.asSingleFqName()");
            return a2;
        }
    }

    public static final class b extends y {

        /* renamed from: d  reason: collision with root package name */
        public final a.a.a.a.v0.f.b f1786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a.a.a.a.v0.f.b bVar, c cVar, e eVar, m0 m0Var) {
            super(cVar, eVar, m0Var, null);
            if (bVar == null) {
                i.a("fqName");
                throw null;
            } else if (cVar == null) {
                i.a("nameResolver");
                throw null;
            } else if (eVar != null) {
                this.f1786d = bVar;
            } else {
                i.a("typeTable");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.k.b.y
        public a.a.a.a.v0.f.b a() {
            return this.f1786d;
        }
    }

    public /* synthetic */ y(c cVar, e eVar, m0 m0Var, a.w.c.f fVar) {
        this.f1779a = cVar;
        this.b = eVar;
        this.f1780c = m0Var;
    }

    public abstract a.a.a.a.v0.f.b a();

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
