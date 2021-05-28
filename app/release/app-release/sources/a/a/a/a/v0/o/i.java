package a.a.a.a.v0.o;

import a.t.m;
import a.w.b.a;
import e.f.a.g;
import java.util.Map;

public final class i {

    /* renamed from: e  reason: collision with root package name */
    public static final i f2000e;

    /* renamed from: a  reason: collision with root package name */
    public final k f2001a;
    public final k b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, k> f2002c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2003d;

    static {
        new i(k.WARN, null, m.f2120c, false, 8);
        k kVar = k.IGNORE;
        f2000e = new i(kVar, kVar, m.f2120c, false, 8);
        k kVar2 = k.STRICT;
        new i(kVar2, kVar2, m.f2120c, false, 8);
    }

    public /* synthetic */ i(k kVar, k kVar2, Map map, boolean z, int i) {
        z = (i & 8) != 0 ? true : z;
        if (kVar == null) {
            a.w.c.i.a("global");
            throw null;
        } else if (map != null) {
            this.f2001a = kVar;
            this.b = kVar2;
            this.f2002c = map;
            this.f2003d = z;
            g.m92a((a) new h(this));
        } else {
            a.w.c.i.a("user");
            throw null;
        }
    }

    public final boolean a() {
        return this == f2000e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return a.w.c.i.a(this.f2001a, iVar.f2001a) && a.w.c.i.a(this.b, iVar.b) && a.w.c.i.a(this.f2002c, iVar.f2002c) && this.f2003d == iVar.f2003d;
    }

    public int hashCode() {
        k kVar = this.f2001a;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.b;
        int hashCode2 = (hashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        Map<String, k> map = this.f2002c;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f2003d;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Jsr305State(global=");
        a2.append(this.f2001a);
        a2.append(", migration=");
        a2.append(this.b);
        a2.append(", user=");
        a2.append(this.f2002c);
        a2.append(", enableCompatqualCheckerFrameworkAnnotations=");
        a2.append(this.f2003d);
        a2.append(")");
        return a2.toString();
    }
}
