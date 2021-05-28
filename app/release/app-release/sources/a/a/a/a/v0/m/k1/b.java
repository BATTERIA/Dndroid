package a.a.a.a.v0.m.k1;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class b extends Enum<b> {

    /* renamed from: c  reason: collision with root package name */
    public static final b f1911c;

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ b[] f1912d;

    static {
        b bVar = new b("FOR_SUBTYPING", 0);
        f1911c = bVar;
        f1912d = new b[]{bVar, new b("FOR_INCORPORATION", 1), new b("FROM_EXPRESSION", 2)};
    }

    public b(String str, int i) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f1912d.clone();
    }
}
