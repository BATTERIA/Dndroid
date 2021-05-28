package f;

import e.a.a.a.a;
import java.net.InetSocketAddress;
import java.net.Proxy;

public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f5048a;
    public final Proxy b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f5049c;

    public k0(e eVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (eVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f5048a = eVar;
            this.b = proxy;
            this.f5049c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public boolean a() {
        return this.f5048a.i != null && this.b.type() == Proxy.Type.HTTP;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return k0Var.f5048a.equals(this.f5048a) && k0Var.b.equals(this.b) && k0Var.f5049c.equals(this.f5049c);
        }
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        return this.f5049c.hashCode() + ((hashCode + ((this.f5048a.hashCode() + 527) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("Route{");
        a2.append(this.f5049c);
        a2.append("}");
        return a2.toString();
    }
}
