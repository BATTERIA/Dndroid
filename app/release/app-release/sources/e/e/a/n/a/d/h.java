package e.e.a.n.a.d;

import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class h implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    public static TrustManager[] f4334a;
    public static final X509Certificate[] b = new X509Certificate[0];

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return b;
    }
}
