package a.a.a.a.v0.i;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class a extends Enum<a> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1468e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f1469f;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ a[] f1470g;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1471c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1472d;

    static {
        a aVar = new a("NO_ARGUMENTS", 0, false, false, 3);
        f1468e = aVar;
        a aVar2 = new a("ALWAYS_PARENTHESIZED", 2, true, true);
        f1469f = aVar2;
        f1470g = new a[]{aVar, new a("UNLESS_EMPTY", 1, true, false, 2), aVar2};
    }

    public a(String str, int i, boolean z, boolean z2) {
        this.f1471c = z;
        this.f1472d = z2;
    }

    public /* synthetic */ a(String str, int i, boolean z, boolean z2, int i2) {
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        this.f1471c = z;
        this.f1472d = z2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1470g.clone();
    }
}
