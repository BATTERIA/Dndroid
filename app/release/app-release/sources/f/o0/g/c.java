package f.o0.g;

import e.a.a.a.a;
import f.b0;
import f.m;
import f.o;
import f.o0.e;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f5098a;
    public int b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5099c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5100d;

    public c(List<o> list) {
        this.f5098a = list;
    }

    public o a(SSLSocket sSLSocket) {
        o oVar;
        boolean z;
        int i = this.b;
        int size = this.f5098a.size();
        while (true) {
            if (i >= size) {
                oVar = null;
                break;
            }
            oVar = this.f5098a.get(i);
            if (oVar.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (oVar != null) {
            int i2 = this.b;
            while (true) {
                if (i2 >= this.f5098a.size()) {
                    z = false;
                    break;
                } else if (this.f5098a.get(i2).a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f5099c = z;
            f.o0.c cVar = f.o0.c.f5081a;
            boolean z2 = this.f5100d;
            if (((b0.a) cVar) != null) {
                String[] a2 = oVar.f5073c != null ? e.a(m.b, sSLSocket.getEnabledCipherSuites(), oVar.f5073c) : sSLSocket.getEnabledCipherSuites();
                String[] a3 = oVar.f5074d != null ? e.a(e.i, sSLSocket.getEnabledProtocols(), oVar.f5074d) : sSLSocket.getEnabledProtocols();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a4 = e.a(m.b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z2 && a4 != -1) {
                    String str = supportedCipherSuites[a4];
                    int length = a2.length + 1;
                    String[] strArr = new String[length];
                    System.arraycopy(a2, 0, strArr, 0, a2.length);
                    strArr[length - 1] = str;
                    a2 = strArr;
                }
                o.a aVar = new o.a(oVar);
                aVar.a(a2);
                aVar.b(a3);
                o oVar2 = new o(aVar);
                String[] strArr2 = oVar2.f5074d;
                if (strArr2 != null) {
                    sSLSocket.setEnabledProtocols(strArr2);
                }
                String[] strArr3 = oVar2.f5073c;
                if (strArr3 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr3);
                }
                return oVar;
            }
            throw null;
        }
        StringBuilder a5 = a.a("Unable to find acceptable protocols. isFallback=");
        a5.append(this.f5100d);
        a5.append(", modes=");
        a5.append(this.f5098a);
        a5.append(", supported protocols=");
        a5.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(a5.toString());
    }
}
