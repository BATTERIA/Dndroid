package f.o0.k;

import android.os.Build;
import e.a.a.a.a;
import f.b0;
import f.c0;
import f.o0.e;
import f.o0.m.b;
import f.o0.m.c;
import java.io.EOFException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f5341a;
    public static final Logger b = Logger.getLogger(b0.class.getName());

    static {
        f fVar;
        boolean z = true;
        b bVar = null;
        if (b()) {
            fVar = a.c();
            if (fVar == null) {
                if (b()) {
                    try {
                        Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                        if (Build.VERSION.SDK_INT >= 21) {
                            try {
                                bVar = new b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
                            } catch (NoSuchMethodException unused) {
                            }
                        }
                        StringBuilder a2 = a.a("Expected Android API level 21+ but was ");
                        a2.append(Build.VERSION.SDK_INT);
                        throw new IllegalStateException(a2.toString());
                    } catch (ClassNotFoundException unused2) {
                    }
                }
                if (bVar != null) {
                    fVar = bVar;
                } else {
                    throw new NullPointerException("No platform found on Android");
                }
            }
        } else {
            if (!"conscrypt".equals(e.a("okhttp.platform", (String) null))) {
                z = "Conscrypt".equals(Security.getProviders()[0].getName());
            }
            if ((!z || (fVar = c.d()) == null) && (fVar = e.c()) == null && (fVar = d.c()) == null) {
                fVar = new f();
            }
        }
        f5341a = fVar;
    }

    public static List<String> a(List<c0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = list.get(i);
            if (c0Var != c0.HTTP_1_0) {
                arrayList.add(c0Var.f4988c);
            }
        }
        return arrayList;
    }

    public static boolean b() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static byte[] b(List<c0> list) {
        g.e eVar = new g.e();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c0 c0Var = list.get(i);
            if (c0Var != c0.HTTP_1_0) {
                eVar.writeByte(c0Var.f4988c.length());
                eVar.a(c0Var.f4988c);
            }
        }
        try {
            return eVar.e(eVar.f5428d);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public c a(X509TrustManager x509TrustManager) {
        return new f.o0.m.a(b(x509TrustManager));
    }

    public Object a(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public SSLContext a() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = a.b(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<c0> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    public f.o0.m.e b(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public boolean b(String str) {
        return true;
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
