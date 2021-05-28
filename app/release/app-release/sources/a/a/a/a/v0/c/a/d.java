package a.a.a.a.v0.c.a;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class d extends Enum<d> implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final d f520c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f521d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f522e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f523f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f524g;

    /* renamed from: h  reason: collision with root package name */
    public static final d f525h;
    public static final d i;
    public static final d j;
    public static final d k;
    public static final /* synthetic */ d[] l;

    static {
        d dVar = new d("FROM_BACKEND", 1);
        f520c = dVar;
        d dVar2 = new d("FROM_BUILTINS", 3);
        f521d = dVar2;
        d dVar3 = new d("FROM_REFLECTION", 7);
        f522e = dVar3;
        d dVar4 = new d("FOR_ALREADY_TRACKED", 11);
        f523f = dVar4;
        d dVar5 = new d("WHEN_GET_ALL_DESCRIPTORS", 12);
        f524g = dVar5;
        d dVar6 = new d("WHEN_GET_SUPER_MEMBERS", 14);
        f525h = dVar6;
        d dVar7 = new d("FOR_NON_TRACKED_SCOPE", 15);
        i = dVar7;
        d dVar8 = new d("FROM_DESERIALIZATION", 17);
        j = dVar8;
        d dVar9 = new d("FROM_JAVA_LOADER", 18);
        k = dVar9;
        l = new d[]{new d("FROM_IDE", 0), dVar, new d("FROM_TEST", 2), dVar2, new d("WHEN_CHECK_DECLARATION_CONFLICTS", 4), new d("WHEN_CHECK_OVERRIDES", 5), new d("FOR_SCRIPT", 6), dVar3, new d("WHEN_RESOLVE_DECLARATION", 8), new d("WHEN_GET_DECLARATION_SCOPE", 9), new d("WHEN_RESOLVING_DEFAULT_TYPE_ARGUMENTS", 10), dVar4, dVar5, new d("WHEN_TYPING", 13), dVar6, dVar7, new d("FROM_SYNTHETIC_SCOPE", 16), dVar8, dVar9, new d("WHEN_GET_LOCAL_VARIABLE", 19), new d("WHEN_FIND_BY_FQNAME", 20), new d("WHEN_GET_COMPANION_OBJECT", 21), new d("FOR_DEFAULT_IMPORTS", 22)};
    }

    public d(String str, int i2) {
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) l.clone();
    }

    @Override // a.a.a.a.v0.c.a.b
    public a b() {
        return null;
    }
}
