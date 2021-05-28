package a.a.a.a.v0.b;

public enum f {
    CLASS,
    INTERFACE,
    ENUM_CLASS,
    ENUM_ENTRY,
    ANNOTATION_CLASS,
    OBJECT;

    public boolean a() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
