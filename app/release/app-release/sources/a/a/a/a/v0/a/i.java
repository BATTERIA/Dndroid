package a.a.a.a.v0.a;

import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

public enum i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final Set<i> o;

    /* renamed from: c  reason: collision with root package name */
    public final d f210c;

    /* renamed from: d  reason: collision with root package name */
    public final d f211d;

    /* renamed from: e  reason: collision with root package name */
    public b f212e = null;

    /* renamed from: f  reason: collision with root package name */
    public b f213f = null;

    /* access modifiers changed from: public */
    static {
        i iVar;
        o = Collections.unmodifiableSet(EnumSet.of(CHAR, BYTE, SHORT, INT, FLOAT, LONG, iVar));
    }

    /* access modifiers changed from: public */
    i(String str) {
        this.f210c = d.b(str);
        this.f211d = d.b(str + "Array");
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/PrimitiveType";
        if (i == 1 || i == 2) {
            objArr[1] = "getTypeFqName";
        } else if (i == 3) {
            objArr[1] = "getArrayTypeName";
        } else if (i == 4 || i == 5) {
            objArr[1] = "getArrayTypeFqName";
        } else {
            objArr[1] = "getTypeName";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public d a() {
        d dVar = this.f211d;
        if (dVar != null) {
            return dVar;
        }
        a(3);
        throw null;
    }

    public d b() {
        d dVar = this.f210c;
        if (dVar != null) {
            return dVar;
        }
        a(0);
        throw null;
    }
}
