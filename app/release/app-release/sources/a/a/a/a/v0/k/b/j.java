package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.c1.a;
import a.a.a.a.v0.b.c1.b;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.b.y;
import a.a.a.a.v0.b.z;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.m.i1.l;
import a.w.c.i;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final h f1731a;
    public final a.a.a.a.v0.l.j b;

    /* renamed from: c  reason: collision with root package name */
    public final w f1732c;

    /* renamed from: d  reason: collision with root package name */
    public final k f1733d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1734e;

    /* renamed from: f  reason: collision with root package name */
    public final c<c, g<?>> f1735f;

    /* renamed from: g  reason: collision with root package name */
    public final z f1736g;

    /* renamed from: h  reason: collision with root package name */
    public final t f1737h;
    public final p i;
    public final a.a.a.a.v0.c.a.c j;
    public final q k;
    public final Iterable<b> l;
    public final x m;
    public final i n;
    public final a o;
    public final a.a.a.a.v0.b.c1.c p;
    public final a.a.a.a.v0.h.g q;
    public final l r;

    /* JADX DEBUG: Multi-variable search result rejected for r22v0, resolved type: a.a.a.a.v0.k.b.c<? extends a.a.a.a.v0.b.b1.c, ? extends a.a.a.a.v0.j.s.g<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r28v0, resolved type: java.lang.Iterable<? extends a.a.a.a.v0.b.c1.b> */
    /* JADX WARN: Multi-variable type inference failed */
    public j(a.a.a.a.v0.l.j jVar, w wVar, k kVar, g gVar, c<? extends c, ? extends g<?>> cVar, z zVar, t tVar, p pVar, a.a.a.a.v0.c.a.c cVar2, q qVar, Iterable<? extends b> iterable, x xVar, i iVar, a aVar, a.a.a.a.v0.b.c1.c cVar3, a.a.a.a.v0.h.g gVar2, l lVar) {
        if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (wVar == null) {
            i.a("moduleDescriptor");
            throw null;
        } else if (kVar == null) {
            i.a("configuration");
            throw null;
        } else if (gVar == null) {
            i.a("classDataFinder");
            throw null;
        } else if (cVar == 0) {
            i.a("annotationAndConstantLoader");
            throw null;
        } else if (zVar == null) {
            i.a("packageFragmentProvider");
            throw null;
        } else if (tVar == null) {
            i.a("localClassifierTypeSettings");
            throw null;
        } else if (pVar == null) {
            i.a("errorReporter");
            throw null;
        } else if (cVar2 == null) {
            i.a("lookupTracker");
            throw null;
        } else if (qVar == null) {
            i.a("flexibleTypeDeserializer");
            throw null;
        } else if (iterable == 0) {
            i.a("fictitiousClassDescriptorFactories");
            throw null;
        } else if (xVar == null) {
            i.a("notFoundClasses");
            throw null;
        } else if (iVar == null) {
            i.a("contractDeserializer");
            throw null;
        } else if (aVar == null) {
            i.a("additionalClassPartsProvider");
            throw null;
        } else if (cVar3 == null) {
            i.a("platformDependentDeclarationFilter");
            throw null;
        } else if (gVar2 == null) {
            i.a("extensionRegistryLite");
            throw null;
        } else if (lVar != null) {
            this.b = jVar;
            this.f1732c = wVar;
            this.f1733d = kVar;
            this.f1734e = gVar;
            this.f1735f = cVar;
            this.f1736g = zVar;
            this.f1737h = tVar;
            this.i = pVar;
            this.j = cVar2;
            this.k = qVar;
            this.l = iterable;
            this.m = xVar;
            this.n = iVar;
            this.o = aVar;
            this.p = cVar3;
            this.q = gVar2;
            this.r = lVar;
            this.f1731a = new h(this);
        } else {
            i.a("kotlinTypeChecker");
            throw null;
        }
    }

    public final l a(y yVar, a.a.a.a.v0.e.x0.c cVar, e eVar, a.a.a.a.v0.e.x0.g gVar, a.a.a.a.v0.e.x0.a aVar, a.a.a.a.v0.k.b.f0.g gVar2) {
        if (yVar == null) {
            i.a("descriptor");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (eVar == null) {
            i.a("typeTable");
            throw null;
        } else if (gVar == null) {
            i.a("versionRequirementTable");
            throw null;
        } else if (aVar != null) {
            return new l(this, cVar, yVar, eVar, gVar, aVar, gVar2, null, a.t.l.f2119c);
        } else {
            i.a("metadataVersion");
            throw null;
        }
    }

    public final a.a.a.a.v0.b.e a(a.a.a.a.v0.f.a aVar) {
        if (aVar != null) {
            return h.a(this.f1731a, aVar, null, 2);
        }
        i.a("classId");
        throw null;
    }
}
