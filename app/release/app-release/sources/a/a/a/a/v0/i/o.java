package a.a.a.a.v0.i;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class o extends Enum<o> {

    /* renamed from: c  reason: collision with root package name */
    public static final o f1519c;

    /* renamed from: d  reason: collision with root package name */
    public static final o f1520d;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ o[] f1521e;

    static {
        o oVar = new o("RENDER_OVERRIDE", 0);
        f1519c = oVar;
        o oVar2 = new o("RENDER_OPEN", 1);
        f1520d = oVar2;
        f1521e = new o[]{oVar, oVar2, new o("RENDER_OPEN_OVERRIDE", 2)};
    }

    public o(String str, int i) {
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f1521e.clone();
    }
}
