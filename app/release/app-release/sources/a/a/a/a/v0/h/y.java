package a.a.a.a.v0.h;

public enum y {
    DOUBLE(z.DOUBLE, 1),
    FLOAT(z.FLOAT, 5),
    INT64(z.LONG, 0),
    UINT64(z.LONG, 0),
    INT32(z.INT, 0),
    FIXED64(z.LONG, 1),
    FIXED32(z.INT, 5),
    BOOL(z.BOOLEAN, 0),
    STRING(z.STRING, 2) {
        @Override // a.a.a.a.v0.h.y
        public boolean a() {
            return false;
        }
    },
    GROUP(z.MESSAGE, 3) {
        @Override // a.a.a.a.v0.h.y
        public boolean a() {
            return false;
        }
    },
    MESSAGE(z.MESSAGE, 2) {
        @Override // a.a.a.a.v0.h.y
        public boolean a() {
            return false;
        }
    },
    BYTES(z.BYTE_STRING, 2) {
        @Override // a.a.a.a.v0.h.y
        public boolean a() {
            return false;
        }
    },
    UINT32(z.INT, 0),
    ENUM(z.ENUM, 0),
    SFIXED32(z.INT, 5),
    SFIXED64(z.LONG, 1),
    SINT32(z.INT, 0),
    SINT64(z.LONG, 0);
    

    /* renamed from: c  reason: collision with root package name */
    public final z f1460c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1461d;

    /* access modifiers changed from: public */
    y(z zVar, int i) {
        this.f1460c = zVar;
        this.f1461d = i;
    }

    /* access modifiers changed from: public */
    /* synthetic */ y(z zVar, int i, x xVar) {
        this.f1460c = zVar;
        this.f1461d = i;
    }

    public boolean a() {
        return true;
    }
}
