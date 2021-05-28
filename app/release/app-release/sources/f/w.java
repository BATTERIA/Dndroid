package f;

import e.a.a.a.a;
import f.o0.e;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f5398a;
    public final m b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Certificate> f5399c;

    /* renamed from: d  reason: collision with root package name */
    public final List<Certificate> f5400d;

    public w(l0 l0Var, m mVar, List<Certificate> list, List<Certificate> list2) {
        this.f5398a = l0Var;
        this.b = mVar;
        this.f5399c = list;
        this.f5400d = list2;
    }

    public static w a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            m a2 = m.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                l0 a3 = l0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List a4 = certificateArr != null ? e.a(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new w(a3, a2, a4, localCertificates != null ? e.a(localCertificates) : Collections.emptyList());
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public final List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f5398a.equals(wVar.f5398a) && this.b.equals(wVar.b) && this.f5399c.equals(wVar.f5399c) && this.f5400d.equals(wVar.f5400d);
    }

    public int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.f5399c.hashCode();
        return this.f5400d.hashCode() + ((hashCode2 + ((hashCode + ((this.f5398a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("Handshake{tlsVersion=");
        a2.append(this.f5398a);
        a2.append(" cipherSuite=");
        a2.append(this.b);
        a2.append(" peerCertificates=");
        a2.append(a(this.f5399c));
        a2.append(" localCertificates=");
        a2.append(a(this.f5400d));
        a2.append('}');
        return a2.toString();
    }
}
