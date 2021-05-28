package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.k;
import a.a.a.a.v0.e.l0;
import a.a.a.a.v0.e.x0.a;
import a.a.a.a.v0.e.x0.c;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.x0.g;
import a.w.c.i;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f1739a;
    public final v b;

    /* renamed from: c  reason: collision with root package name */
    public final j f1740c;

    /* renamed from: d  reason: collision with root package name */
    public final c f1741d;

    /* renamed from: e  reason: collision with root package name */
    public final k f1742e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1743f;

    /* renamed from: g  reason: collision with root package name */
    public final g f1744g;

    /* renamed from: h  reason: collision with root package name */
    public final a f1745h;
    public final a.a.a.a.v0.k.b.f0.g i;

    public l(j jVar, c cVar, k kVar, e eVar, g gVar, a aVar, a.a.a.a.v0.k.b.f0.g gVar2, b0 b0Var, List<l0> list) {
        String str;
        if (jVar == null) {
            i.a("components");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (kVar == null) {
            i.a("containingDeclaration");
            throw null;
        } else if (eVar == null) {
            i.a("typeTable");
            throw null;
        } else if (gVar == null) {
            i.a("versionRequirementTable");
            throw null;
        } else if (aVar == null) {
            i.a("metadataVersion");
            throw null;
        } else if (list != null) {
            this.f1740c = jVar;
            this.f1741d = cVar;
            this.f1742e = kVar;
            this.f1743f = eVar;
            this.f1744g = gVar;
            this.f1745h = aVar;
            this.i = gVar2;
            StringBuilder a2 = e.a.a.a.a.a("Deserializer for \"");
            a2.append(this.f1742e.d());
            a2.append('\"');
            String sb = a2.toString();
            a.a.a.a.v0.k.b.f0.g gVar3 = this.i;
            this.f1739a = new b0(this, b0Var, list, sb, (gVar3 == null || (str = gVar3.c()) == null) ? "[container not found]" : str, false, 32);
            this.b = new v(this);
        } else {
            i.a("typeParameters");
            throw null;
        }
    }

    public static /* synthetic */ l a(l lVar, k kVar, List list, c cVar, e eVar, g gVar, a aVar, int i2) {
        if ((i2 & 4) != 0) {
            cVar = lVar.f1741d;
        }
        if ((i2 & 8) != 0) {
            eVar = lVar.f1743f;
        }
        if ((i2 & 16) != 0) {
            gVar = lVar.f1744g;
        }
        if ((i2 & 32) != 0) {
            aVar = lVar.f1745h;
        }
        return lVar.a(kVar, list, cVar, eVar, gVar, aVar);
    }

    public final l a(k kVar, List<l0> list, c cVar, e eVar, g gVar, a aVar) {
        g gVar2;
        if (kVar == null) {
            i.a("descriptor");
            throw null;
        } else if (list == null) {
            i.a("typeParameterProtos");
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
            j jVar = this.f1740c;
            boolean z = true;
            if (aVar.f1234a != 1 || aVar.b < 4) {
                z = false;
            }
            if (z) {
                gVar2 = gVar;
            } else {
                gVar2 = this.f1744g;
            }
            return new l(jVar, cVar, kVar, eVar, gVar2, aVar, this.i, this.f1739a, list);
        } else {
            i.a("metadataVersion");
            throw null;
        }
    }
}
