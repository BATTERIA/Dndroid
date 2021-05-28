package a.a;

import a.g;
import a.w.c.f;
import a.w.c.i;

@g(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final r f2051c = new r(null, null);

    /* renamed from: d  reason: collision with root package name */
    public static final a f2052d = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final s f2053a;
    public final p b;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }
    }

    public r(s sVar, p pVar) {
        this.f2053a = sVar;
        this.b = pVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return i.a(this.f2053a, rVar.f2053a) && i.a(this.b, rVar.b);
    }

    public int hashCode() {
        s sVar = this.f2053a;
        int i = 0;
        int hashCode = (sVar != null ? sVar.hashCode() : 0) * 31;
        p pVar = this.b;
        if (pVar != null) {
            i = pVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("KTypeProjection(variance=");
        a2.append(this.f2053a);
        a2.append(", type=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}
