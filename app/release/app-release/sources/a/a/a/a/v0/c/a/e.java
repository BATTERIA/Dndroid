package a.a.a.a.v0.c.a;

import a.w.c.f;
import java.io.Serializable;

public final class e implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final e f526e = new e(-1, -1);

    /* renamed from: f  reason: collision with root package name */
    public static final a f527f = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public final int f528c;

    /* renamed from: d  reason: collision with root package name */
    public final int f529d;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }
    }

    public e(int i, int i2) {
        this.f528c = i;
        this.f529d = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f528c == eVar.f528c && this.f529d == eVar.f529d;
    }

    public int hashCode() {
        return (this.f528c * 31) + this.f529d;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Position(line=");
        a2.append(this.f528c);
        a2.append(", column=");
        a2.append(this.f529d);
        a2.append(")");
        return a2.toString();
    }
}
