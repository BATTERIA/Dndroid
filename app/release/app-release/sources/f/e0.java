package f;

import f.o0.e;
import f.x;
import f.y;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final y f5005a;
    public final String b;

    /* renamed from: c  reason: collision with root package name */
    public final x f5006c;

    /* renamed from: d  reason: collision with root package name */
    public final g0 f5007d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Class<?>, Object> f5008e;

    /* renamed from: f  reason: collision with root package name */
    public volatile i f5009f;

    public e0(a aVar) {
        this.f5005a = aVar.f5010a;
        this.b = aVar.b;
        x.a aVar2 = aVar.f5011c;
        if (aVar2 != null) {
            this.f5006c = new x(aVar2);
            this.f5007d = aVar.f5012d;
            this.f5008e = e.a(aVar.f5013e);
            return;
        }
        throw null;
    }

    public i a() {
        i iVar = this.f5009f;
        if (iVar != null) {
            return iVar;
        }
        i a2 = i.a(this.f5006c);
        this.f5009f = a2;
        return a2;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Request{method=");
        a2.append(this.b);
        a2.append(", url=");
        a2.append(this.f5005a);
        a2.append(", tags=");
        a2.append(this.f5008e);
        a2.append('}');
        return a2.toString();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public y f5010a;
        public String b;

        /* renamed from: c  reason: collision with root package name */
        public x.a f5011c;

        /* renamed from: d  reason: collision with root package name */
        public g0 f5012d;

        /* renamed from: e  reason: collision with root package name */
        public Map<Class<?>, Object> f5013e;

        public a() {
            this.f5013e = Collections.emptyMap();
            this.b = "GET";
            this.f5011c = new x.a();
        }

        public a(e0 e0Var) {
            this.f5013e = Collections.emptyMap();
            this.f5010a = e0Var.f5005a;
            this.b = e0Var.b;
            this.f5012d = e0Var.f5007d;
            this.f5013e = e0Var.f5008e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(e0Var.f5008e);
            this.f5011c = e0Var.f5006c.a();
        }

        public a a(y yVar) {
            if (yVar != null) {
                this.f5010a = yVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(String str, String str2) {
            x.a aVar = this.f5011c;
            if (aVar != null) {
                x.b(str);
                x.a(str2, str);
                aVar.a(str);
                aVar.f5402a.add(str);
                aVar.f5402a.add(str2.trim());
                return this;
            }
            throw null;
        }

        public e0 a() {
            if (this.f5010a != null) {
                return new e0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a a(String str, g0 g0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (g0Var == null || a.a.a.a.v0.m.l1.a.c(str)) {
                if (g0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException(e.a.a.a.a.a("method ", str, " must have a request body."));
                    }
                }
                this.b = str;
                this.f5012d = g0Var;
                return this;
            } else {
                throw new IllegalArgumentException(e.a.a.a.a.a("method ", str, " must not have a request body."));
            }
        }

        public a a(String str) {
            int i;
            StringBuilder sb;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    sb = e.a.a.a.a.a("http:");
                    i = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        sb = e.a.a.a.a.a("https:");
                        i = 4;
                    }
                    y.a aVar = new y.a();
                    aVar.a(null, str);
                    a(aVar.a());
                    return this;
                }
                sb.append(str.substring(i));
                str = sb.toString();
                y.a aVar2 = new y.a();
                aVar2.a(null, str);
                a(aVar2.a());
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }
}
