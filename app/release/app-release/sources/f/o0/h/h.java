package f.o0.h;

import f.b0;
import f.e0;
import f.g0;
import f.h0;
import f.o0.g.l;
import f.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class h implements z {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f5169a;

    public h(b0 b0Var) {
        this.f5169a = b0Var;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:182:0x029c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [f.o0.g.e, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r19v0, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0297, code lost:
        r9.b();
        r12 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x011c, code lost:
        if (r3.f5020e == 408) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0125, code lost:
        if (r7.a(r11, 0) > 0) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0151, code lost:
        if (r1.f5020e == 503) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015c, code lost:
        if (r7.a(r11, Integer.MAX_VALUE) != 0) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017b, code lost:
        if (r4.equals("HEAD") == false) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0225 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02a7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // f.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.h0 a(f.z.a r27) {
        /*
        // Method dump skipped, instructions count: 704
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.h.h.a(f.z$a):f.h0");
    }

    public final boolean a(IOException iOException, l lVar, boolean z, e0 e0Var) {
        if (!this.f5169a.y) {
            return false;
        }
        if (z) {
            g0 g0Var = e0Var.f5007d;
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if (!(!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z))) {
            return false;
        }
        if (!(lVar.f5153h.b() && lVar.f5153h.a())) {
            return false;
        }
        return true;
    }

    public final int a(h0 h0Var, int i) {
        String a2 = h0Var.f5023h.a("Retry-After");
        if (a2 == null) {
            a2 = null;
        }
        if (a2 == null) {
            return i;
        }
        if (a2.matches("\\d+")) {
            return Integer.valueOf(a2).intValue();
        }
        return Integer.MAX_VALUE;
    }
}
