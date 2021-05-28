package a.a.a.a.v0.b.b1;

import a.n;
import a.w.c.i;

public enum e {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");
    

    /* renamed from: c  reason: collision with root package name */
    public final String f315c;

    /* access modifiers changed from: public */
    e(String str) {
        if (str == null) {
            String name = name();
            if (name != null) {
                str = name.toLowerCase();
                i.a((Object) str, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new n("null cannot be cast to non-null type java.lang.String");
            }
        }
        this.f315c = str;
    }
}
