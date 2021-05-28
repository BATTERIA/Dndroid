package a.a.a.a.v0.d.a.a0;

import a.a.a.a.v0.d.a.a;
import a.a.a.a.v0.d.a.d0.d;
import a.a.a.a.v0.d.a.d0.h;
import a.w.c.i;
import java.util.EnumMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap<a.EnumC0022a, h> f553a;

    public e(EnumMap<a.EnumC0022a, h> enumMap) {
        if (enumMap != null) {
            this.f553a = enumMap;
        } else {
            i.a("nullabilityQualifiers");
            throw null;
        }
    }

    public final d a(a.EnumC0022a aVar) {
        h hVar = this.f553a.get(aVar);
        if (hVar == null) {
            return null;
        }
        i.a((Object) hVar, "nullabilityQualifiers[ap…ilityType] ?: return null");
        return new d(hVar.f706a, null, false, hVar.b);
    }
}
