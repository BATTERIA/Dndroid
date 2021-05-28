package f.o0.j;

import f.o0.e;
import g.h;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final h f5199d = h.c(":");

    /* renamed from: e  reason: collision with root package name */
    public static final h f5200e = h.c(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final h f5201f = h.c(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final h f5202g = h.c(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final h f5203h = h.c(":scheme");
    public static final h i = h.c(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final h f5204a;
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5205c;

    public c(h hVar, h hVar2) {
        this.f5204a = hVar;
        this.b = hVar2;
        this.f5205c = hVar2.h() + hVar.h() + 32;
    }

    public c(h hVar, String str) {
        this(hVar, h.c(str));
    }

    public c(String str, String str2) {
        this(h.c(str), h.c(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5204a.equals(cVar.f5204a) && this.b.equals(cVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + ((this.f5204a.hashCode() + 527) * 31);
    }

    public String toString() {
        return e.a("%s: %s", this.f5204a.k(), this.b.k());
    }
}
