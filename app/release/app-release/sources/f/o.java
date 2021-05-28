package f;

import f.o0.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

public final class o {

    /* renamed from: e  reason: collision with root package name */
    public static final m[] f5068e = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o};

    /* renamed from: f  reason: collision with root package name */
    public static final m[] f5069f = {m.q, m.r, m.s, m.k, m.m, m.l, m.n, m.p, m.o, m.i, m.j, m.f5064g, m.f5065h, m.f5062e, m.f5063f, m.f5061d};

    /* renamed from: g  reason: collision with root package name */
    public static final o f5070g;

    /* renamed from: h  reason: collision with root package name */
    public static final o f5071h = new o(new a(false));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5072a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f5073c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f5074d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5075a;
        public String[] b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f5076c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5077d;

        public a(o oVar) {
            this.f5075a = oVar.f5072a;
            this.b = oVar.f5073c;
            this.f5076c = oVar.f5074d;
            this.f5077d = oVar.b;
        }

        public a(boolean z) {
            this.f5075a = z;
        }

        public a a(boolean z) {
            if (this.f5075a) {
                this.f5077d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public a a(l0... l0VarArr) {
            if (this.f5075a) {
                String[] strArr = new String[l0VarArr.length];
                for (int i = 0; i < l0VarArr.length; i++) {
                    strArr[i] = l0VarArr[i].f5059c;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(m... mVarArr) {
            if (this.f5075a) {
                String[] strArr = new String[mVarArr.length];
                for (int i = 0; i < mVarArr.length; i++) {
                    strArr[i] = mVarArr[i].f5066a;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a a(String... strArr) {
            if (!this.f5075a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a b(String... strArr) {
            if (!this.f5075a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f5076c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }
    }

    static {
        a aVar = new a(true);
        aVar.a(f5068e);
        aVar.a(l0.TLS_1_3, l0.TLS_1_2);
        aVar.a(true);
        new o(aVar);
        a aVar2 = new a(true);
        aVar2.a(f5069f);
        aVar2.a(l0.TLS_1_3, l0.TLS_1_2);
        aVar2.a(true);
        f5070g = new o(aVar2);
        a aVar3 = new a(true);
        aVar3.a(f5069f);
        aVar3.a(l0.TLS_1_3, l0.TLS_1_2, l0.TLS_1_1, l0.TLS_1_0);
        aVar3.a(true);
        new o(aVar3);
    }

    public o(a aVar) {
        this.f5072a = aVar.f5075a;
        this.f5073c = aVar.b;
        this.f5074d = aVar.f5076c;
        this.b = aVar.f5077d;
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.f5072a) {
            return false;
        }
        String[] strArr = this.f5074d;
        if (strArr != null && !e.b(e.i, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f5073c;
        return strArr2 == null || e.b(m.b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o oVar = (o) obj;
        boolean z = this.f5072a;
        if (z != oVar.f5072a) {
            return false;
        }
        return !z || (Arrays.equals(this.f5073c, oVar.f5073c) && Arrays.equals(this.f5074d, oVar.f5074d) && this.b == oVar.b);
    }

    public int hashCode() {
        if (this.f5072a) {
            return ((((527 + Arrays.hashCode(this.f5073c)) * 31) + Arrays.hashCode(this.f5074d)) * 31) + (!this.b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        List list;
        if (!this.f5072a) {
            return "ConnectionSpec()";
        }
        StringBuilder a2 = e.a.a.a.a.a("ConnectionSpec(cipherSuites=");
        String[] strArr = this.f5073c;
        List list2 = null;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(m.a(str));
            }
            list = Collections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        a2.append(Objects.toString(list, "[all enabled]"));
        a2.append(", tlsVersions=");
        String[] strArr2 = this.f5074d;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str2 : strArr2) {
                arrayList2.add(l0.a(str2));
            }
            list2 = Collections.unmodifiableList(arrayList2);
        }
        a2.append(Objects.toString(list2, "[all enabled]"));
        a2.append(", supportsTlsExtensions=");
        a2.append(this.b);
        a2.append(")");
        return a2.toString();
    }
}
