package a.a.a.a.v0.h;

import a.a.a.a.v0.h.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class g {
    public static final g b = new g(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, i.g<?, ?>> f1384a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f1385a;
        public final int b;

        public a(Object obj, int i) {
            this.f1385a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1385a == aVar.f1385a && this.b == aVar.b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f1385a) * 65535) + this.b;
        }
    }

    public g() {
        this.f1384a = new HashMap();
    }

    public g(boolean z) {
        this.f1384a = Collections.emptyMap();
    }

    public final void a(i.g<?, ?> gVar) {
        this.f1384a.put(new a(gVar.f1402a, gVar.f1404d.f1398d), gVar);
    }
}
