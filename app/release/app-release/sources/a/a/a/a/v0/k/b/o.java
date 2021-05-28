package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.e.b0;
import a.a.a.a.v0.e.e0;
import a.a.a.a.v0.e.v;
import a.a.a.a.v0.e.w;
import a.a.a.a.v0.e.x0.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.k.b.f0.g;
import a.w.b.l;
import a.w.c.j;
import java.util.List;

public abstract class o extends n {

    /* renamed from: h  reason: collision with root package name */
    public final d f1747h;
    public final x i;
    public w j;
    public i k;
    public final a.a.a.a.v0.e.x0.a l;
    public final g m;

    public static final class a extends j implements l<a.a.a.a.v0.f.a, m0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o f1748c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(1);
            this.f1748c = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public m0 a(a.a.a.a.v0.f.a aVar) {
            if (aVar != null) {
                g gVar = this.f1748c.m;
                if (gVar != null) {
                    return gVar;
                }
                m0 m0Var = m0.f491a;
                a.w.c.i.a((Object) m0Var, "SourceElement.NO_SOURCE");
                return m0Var;
            }
            a.w.c.i.a("it");
            throw null;
        }
    }

    public static final class b extends j implements a.w.b.a<List<? extends a.a.a.a.v0.f.d>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o f1749c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(o oVar) {
            super(0);
            this.f1749c = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0013 A[SYNTHETIC] */
        @Override // a.w.b.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<? extends a.a.a.a.v0.f.d> a() {
            /*
                r5 = this;
                a.a.a.a.v0.k.b.o r0 = r5.f1749c
                a.a.a.a.v0.k.b.x r0 = r0.i
                java.util.Map<a.a.a.a.v0.f.a, a.a.a.a.v0.e.f> r0 = r0.f1776a
                java.util.Set r0 = r0.keySet()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r0 = r0.iterator()
            L_0x0013:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0039
                java.lang.Object r2 = r0.next()
                r3 = r2
                a.a.a.a.v0.f.a r3 = (a.a.a.a.v0.f.a) r3
                boolean r4 = r3.g()
                if (r4 != 0) goto L_0x0032
                a.a.a.a.v0.k.b.h r4 = a.a.a.a.v0.k.b.h.f1725d
                java.util.Set<a.a.a.a.v0.f.a> r4 = a.a.a.a.v0.k.b.h.f1724c
                boolean r3 = r4.contains(r3)
                if (r3 != 0) goto L_0x0032
                r3 = 1
                goto L_0x0033
            L_0x0032:
                r3 = 0
            L_0x0033:
                if (r3 == 0) goto L_0x0013
                r1.add(r2)
                goto L_0x0013
            L_0x0039:
                java.util.ArrayList r0 = new java.util.ArrayList
                r2 = 10
                int r2 = e.f.a.g.a(r1, r2)
                r0.<init>(r2)
                java.util.Iterator r1 = r1.iterator()
            L_0x0048:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x005c
                java.lang.Object r2 = r1.next()
                a.a.a.a.v0.f.a r2 = (a.a.a.a.v0.f.a) r2
                a.a.a.a.v0.f.d r2 = r2.f()
                r0.add(r2)
                goto L_0x0048
            L_0x005c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.o.b.a():java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(a.a.a.a.v0.f.b bVar, a.a.a.a.v0.l.j jVar, a.a.a.a.v0.b.w wVar, w wVar2, a.a.a.a.v0.e.x0.a aVar, g gVar) {
        super(bVar, jVar, wVar);
        if (bVar == null) {
            a.w.c.i.a("fqName");
            throw null;
        } else if (jVar == null) {
            a.w.c.i.a("storageManager");
            throw null;
        } else if (wVar == null) {
            a.w.c.i.a("module");
            throw null;
        } else if (wVar2 == null) {
            a.w.c.i.a("proto");
            throw null;
        } else if (aVar != null) {
            this.l = aVar;
            this.m = gVar;
            e0 e0Var = wVar2.f1219f;
            a.w.c.i.a((Object) e0Var, "proto.strings");
            b0 b0Var = wVar2.f1220g;
            a.w.c.i.a((Object) b0Var, "proto.qualifiedNames");
            d dVar = new d(e0Var, b0Var);
            this.f1747h = dVar;
            this.i = new x(wVar2, dVar, this.l, new a(this));
            this.j = wVar2;
        } else {
            a.w.c.i.a("metadataVersion");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.k.b.n
    public void a(j jVar) {
        if (jVar != null) {
            w wVar = this.j;
            if (wVar != null) {
                this.j = null;
                v vVar = wVar.f1221h;
                a.w.c.i.a((Object) vVar, "proto.`package`");
                this.k = new a.a.a.a.v0.k.b.f0.j(this, vVar, this.f1747h, this.l, this.m, jVar, new b(this));
                return;
            }
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
        }
        a.w.c.i.a("components");
        throw null;
    }

    @Override // a.a.a.a.v0.b.y
    public i u() {
        i iVar = this.k;
        if (iVar != null) {
            return iVar;
        }
        a.w.c.i.b("_memberScope");
        throw null;
    }
}
