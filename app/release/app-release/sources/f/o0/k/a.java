package f.o0.k;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import f.c0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
public class a extends b {
    public a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    public static f c() {
        int i;
        if (!f.b()) {
            return null;
        }
        try {
            i = Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            i = 0;
        }
        if (i >= 29) {
            try {
                return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            } catch (ReflectiveOperationException unused2) {
            }
        }
        return null;
    }

    @Override // f.o0.k.b, f.o0.k.f
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void a(SSLSocket sSLSocket, String str, List<c0> list) {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) ((ArrayList) f.a(list)).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e2) {
            throw new IOException("Android internal error", e2);
        }
    }

    @Override // f.o0.k.b, f.o0.k.f
    @IgnoreJRERequirement
    public String b(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
