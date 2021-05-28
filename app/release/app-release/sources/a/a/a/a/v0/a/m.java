package a.a.a.a.v0.a;

import a.a.a.a.v0.f.a;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.w.c.i;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class m extends Enum<m> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ m[] f225f;

    /* renamed from: c  reason: collision with root package name */
    public final d f226c;

    /* renamed from: d  reason: collision with root package name */
    public final a f227d;

    /* renamed from: e  reason: collision with root package name */
    public final a f228e;

    static {
        a a2 = a.a("kotlin/UByte");
        i.a((Object) a2, "ClassId.fromString(\"kotlin/UByte\")");
        a a3 = a.a("kotlin/UShort");
        i.a((Object) a3, "ClassId.fromString(\"kotlin/UShort\")");
        a a4 = a.a("kotlin/UInt");
        i.a((Object) a4, "ClassId.fromString(\"kotlin/UInt\")");
        a a5 = a.a("kotlin/ULong");
        i.a((Object) a5, "ClassId.fromString(\"kotlin/ULong\")");
        f225f = new m[]{new m("UBYTE", 0, a2), new m("USHORT", 1, a3), new m("UINT", 2, a4), new m("ULONG", 3, a5)};
    }

    public m(String str, int i, a aVar) {
        this.f228e = aVar;
        d f2 = aVar.f();
        i.a((Object) f2, "classId.shortClassName");
        this.f226c = f2;
        b d2 = this.f228e.d();
        this.f227d = new a(d2, d.b(this.f226c.a() + "Array"));
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f225f.clone();
    }
}
