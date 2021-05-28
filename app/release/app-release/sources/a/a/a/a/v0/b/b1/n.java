package a.a.a.a.v0.b.b1;

import a.j;
import a.t.f;
import e.f.a.g;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public final class n extends Enum<n> {

    /* renamed from: d  reason: collision with root package name */
    public static final n f337d;

    /* renamed from: e  reason: collision with root package name */
    public static final n f338e;

    /* renamed from: f  reason: collision with root package name */
    public static final n f339f;

    /* renamed from: g  reason: collision with root package name */
    public static final n f340g;

    /* renamed from: h  reason: collision with root package name */
    public static final n f341h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    public static final n o;
    public static final n p;
    public static final /* synthetic */ n[] q;
    public static final HashMap<String, n> r = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f342c;

    static {
        n nVar = new n("CLASS", 0, "class", false, 2);
        f337d = nVar;
        n nVar2 = new n("ANNOTATION_CLASS", 1, "annotation class", false, 2);
        f338e = nVar2;
        n nVar3 = new n("TYPE_PARAMETER", 2, "type parameter", false);
        f339f = nVar3;
        n nVar4 = new n("PROPERTY", 3, "property", false, 2);
        f340g = nVar4;
        n nVar5 = new n("FIELD", 4, "field", false, 2);
        f341h = nVar5;
        n nVar6 = new n("LOCAL_VARIABLE", 5, "local variable", false, 2);
        i = nVar6;
        n nVar7 = new n("VALUE_PARAMETER", 6, "value parameter", false, 2);
        j = nVar7;
        n nVar8 = new n("CONSTRUCTOR", 7, "constructor", false, 2);
        k = nVar8;
        n nVar9 = new n("FUNCTION", 8, "function", false, 2);
        l = nVar9;
        n nVar10 = new n("PROPERTY_GETTER", 9, "getter", false, 2);
        m = nVar10;
        n nVar11 = new n("PROPERTY_SETTER", 10, "setter", false, 2);
        n = nVar11;
        n nVar12 = new n("TYPE", 11, "type usage", false);
        o = nVar12;
        n nVar13 = new n("FILE", 13, "file", false);
        p = nVar13;
        q = new n[]{nVar, nVar2, nVar3, nVar4, nVar5, nVar6, nVar7, nVar8, nVar9, nVar10, nVar11, nVar12, new n("EXPRESSION", 12, "expression", false), nVar13, new n("TYPEALIAS", 14, "typealias", false), new n("TYPE_PROJECTION", 15, "type projection", false), new n("STAR_PROJECTION", 16, "star projection", false), new n("PROPERTY_PARAMETER", 17, "property constructor parameter", false), new n("CLASS_ONLY", 18, "class", false), new n("OBJECT", 19, "object", false), new n("COMPANION_OBJECT", 20, "companion object", false), new n("INTERFACE", 21, "interface", false), new n("ENUM_CLASS", 22, "enum class", false), new n("ENUM_ENTRY", 23, "enum entry", false), new n("LOCAL_CLASS", 24, "local class", false), new n("LOCAL_FUNCTION", 25, "local function", false), new n("MEMBER_FUNCTION", 26, "member function", false), new n("TOP_LEVEL_FUNCTION", 27, "top level function", false), new n("MEMBER_PROPERTY", 28, "member property", false), new n("MEMBER_PROPERTY_WITH_BACKING_FIELD", 29, "member property with backing field", false), new n("MEMBER_PROPERTY_WITH_DELEGATE", 30, "member property with delegate", false), new n("MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 31, "member property without backing field or delegate", false), new n("TOP_LEVEL_PROPERTY", 32, "top level property", false), new n("TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", 33, "top level property with backing field", false), new n("TOP_LEVEL_PROPERTY_WITH_DELEGATE", 34, "top level property with delegate", false), new n("TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", 35, "top level property without backing field or delegate", false), new n("INITIALIZER", 36, "initializer", false), new n("DESTRUCTURING_DECLARATION", 37, "destructuring declaration", false), new n("LAMBDA_EXPRESSION", 38, "lambda expression", false), new n("ANONYMOUS_FUNCTION", 39, "anonymous function", false), new n("OBJECT_LITERAL", 40, "object literal", false)};
        n[] values = values();
        for (n nVar14 : values) {
            r.put(nVar14.name(), nVar14);
        }
        n[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (n nVar15 : values2) {
            if (nVar15.f342c) {
                arrayList.add(nVar15);
            }
        }
        f.k(arrayList);
        g.l(values());
        f.a(new j(e.CONSTRUCTOR_PARAMETER, j), new j(e.FIELD, f341h), new j(e.PROPERTY, f340g), new j(e.FILE, p), new j(e.PROPERTY_GETTER, m), new j(e.PROPERTY_SETTER, n), new j(e.RECEIVER, j), new j(e.SETTER_PARAMETER, j), new j(e.PROPERTY_DELEGATE_FIELD, f341h));
    }

    public n(String str, int i2, String str2, boolean z) {
        this.f342c = z;
    }

    public /* synthetic */ n(String str, int i2, String str2, boolean z, int i3) {
        this.f342c = (i3 & 2) != 0 ? true : z;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) q.clone();
    }
}
