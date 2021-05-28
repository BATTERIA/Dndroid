package a.a.a.a.v0.e.y0.g;

import a.a.a.a.v0.e.x0.a;
import a.w.c.i;
import java.util.Arrays;

public final class f extends a {

    /* renamed from: g  reason: collision with root package name */
    public static final f f1326g = new f(1, 1, 16);

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1327f;

    static {
        new f(new int[0]);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public f(int... iArr) {
        this(iArr, false);
        if (iArr != null) {
        } else {
            i.a("numbers");
            throw null;
        }
    }

    public boolean a() {
        boolean z;
        if (this.f1234a == 1 && this.b == 0) {
            return false;
        }
        if (this.f1327f) {
            z = a(f1326g);
        } else {
            z = this.f1234a == 1 && this.b <= 4;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        if (iArr != null) {
            this.f1327f = z;
            return;
        }
        i.a("versionArray");
        throw null;
    }
}
