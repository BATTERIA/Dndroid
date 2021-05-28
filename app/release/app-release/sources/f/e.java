package f;

import e.a.a.a.a;
import f.y;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final y f4998a;
    public final t b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f4999c;

    /* renamed from: d  reason: collision with root package name */
    public final g f5000d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c0> f5001e;

    /* renamed from: f  reason: collision with root package name */
    public final List<o> f5002f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f5003g;

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f5004h;
    public final SSLSocketFactory i;
    public final HostnameVerifier j;
    public final l k;

    public e(String str, int i2, t tVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, l lVar, g gVar, Proxy proxy, List<c0> list, List<o> list2, ProxySelector proxySelector) {
        y.a aVar = new y.a();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? str2 : "http";
        if (str3.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (!str3.equalsIgnoreCase(str2)) {
            throw new IllegalArgumentException(a.b("unexpected scheme: ", str3));
        }
        aVar.f5410a = str2;
        if (str != null) {
            String a2 = y.a.a(str, 0, str.length());
            if (a2 != null) {
                aVar.f5412d = a2;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException(a.a("unexpected port: ", i2));
                }
                aVar.f5413e = i2;
                this.f4998a = aVar.a();
                if (tVar != null) {
                    this.b = tVar;
                    if (socketFactory != null) {
                        this.f4999c = socketFactory;
                        if (gVar != null) {
                            this.f5000d = gVar;
                            if (list != null) {
                                this.f5001e = f.o0.e.a(list);
                                if (list2 != null) {
                                    this.f5002f = f.o0.e.a(list2);
                                    if (proxySelector != null) {
                                        this.f5003g = proxySelector;
                                        this.f5004h = proxy;
                                        this.i = sSLSocketFactory;
                                        this.j = hostnameVerifier;
                                        this.k = lVar;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException(a.b("unexpected host: ", str));
        }
        throw new NullPointerException("host == null");
    }

    public boolean a(e eVar) {
        return this.b.equals(eVar.b) && this.f5000d.equals(eVar.f5000d) && this.f5001e.equals(eVar.f5001e) && this.f5002f.equals(eVar.f5002f) && this.f5003g.equals(eVar.f5003g) && Objects.equals(this.f5004h, eVar.f5004h) && Objects.equals(this.i, eVar.i) && Objects.equals(this.j, eVar.j) && Objects.equals(this.k, eVar.k) && this.f4998a.f5406e == eVar.f4998a.f5406e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f4998a.equals(eVar.f4998a) && a(eVar);
        }
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f5000d.hashCode();
        int hashCode3 = this.f5001e.hashCode();
        int hashCode4 = this.f5002f.hashCode();
        int hashCode5 = this.f5003g.hashCode();
        int hashCode6 = Objects.hashCode(this.f5004h);
        int hashCode7 = Objects.hashCode(this.i);
        int hashCode8 = Objects.hashCode(this.j);
        return Objects.hashCode(this.k) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f4998a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        Object obj;
        StringBuilder a2 = a.a("Address{");
        a2.append(this.f4998a.f5405d);
        a2.append(":");
        a2.append(this.f4998a.f5406e);
        if (this.f5004h != null) {
            a2.append(", proxy=");
            obj = this.f5004h;
        } else {
            a2.append(", proxySelector=");
            obj = this.f5003g;
        }
        a2.append(obj);
        a2.append("}");
        return a2.toString();
    }
}
