package f.o0.k;

import android.os.Build;
import android.util.Log;
import f.c0;
import f.o0.m.e;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

public class b extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f5322c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f5323d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f5324e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f5325f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f5326g;

    /* renamed from: h  reason: collision with root package name */
    public final C0153b f5327h;

    public static final class a extends f.o0.m.c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f5328a;
        public final Method b;

        public a(Object obj, Method method) {
            this.f5328a = obj;
            this.b = method;
        }

        @Override // f.o0.m.c
        public List<Certificate> a(List<Certificate> list, String str) {
            try {
                return (List) this.b.invoke(this.f5328a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e3) {
                throw new AssertionError(e3);
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: f.o0.k.b$b  reason: collision with other inner class name */
    public static final class C0153b {

        /* renamed from: a  reason: collision with root package name */
        public final Method f5329a;
        public final Method b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f5330c;

        public C0153b(Method method, Method method2, Method method3) {
            this.f5329a = method;
            this.b = method2;
            this.f5330c = method3;
        }
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f5331a;
        public final Method b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.f5331a = x509TrustManager;
        }

        @Override // f.o0.m.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.f5331a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f5331a.equals(cVar.f5331a) && this.b.equals(cVar.b);
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.f5331a.hashCode();
        }
    }

    public b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls3 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls3.getMethod("get", new Class[0]);
            method5 = cls3.getMethod("open", String.class);
            method6 = cls3.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method6 = null;
            method5 = null;
        }
        this.f5327h = new C0153b(method7, method5, method6);
        this.f5322c = cls2;
        this.f5323d = method;
        this.f5324e = method2;
        this.f5325f = method3;
        this.f5326g = method4;
    }

    @Override // f.o0.k.f
    public SSLContext a() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // f.o0.k.f
    public void a(int i, String str, Throwable th) {
        int min;
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // f.o0.k.f
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e2) {
            if (f.o0.e.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e3);
            }
            throw e3;
        }
    }

    @Override // f.o0.k.f
    public void a(SSLSocket sSLSocket, String str, List<c0> list) {
        if (this.f5322c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f5323d.invoke(sSLSocket, true);
                    this.f5324e.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new AssertionError(e2);
                }
            }
            this.f5326g.invoke(sSLSocket, f.b(list));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return ((java.lang.Boolean) r7.getMethod("isCleartextTrafficPermitted", new java.lang.Class[0]).invoke(r8, new java.lang.Object[0])).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        return true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.String r0 = "isCleartextTrafficPermitted"
            r1 = 0
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r1] = r4     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.reflect.Method r3 = r7.getMethod(r0, r3)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x001d }
            r4[r1] = r6     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Object r6 = r3.invoke(r8, r4)     // Catch:{ NoSuchMethodException -> 0x001d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x001d }
            boolean r6 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x001d }
            return r6
        L_0x001d:
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r6 = r7.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Object r6 = r6.invoke(r8, r7)     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ NoSuchMethodException -> 0x002f }
            boolean r2 = r6.booleanValue()     // Catch:{ NoSuchMethodException -> 0x002f }
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.k.b.a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    @Override // f.o0.k.f
    public e b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new f.o0.m.b(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // f.o0.k.f
    public String b(SSLSocket sSLSocket) {
        if (!this.f5322c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f5325f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // f.o0.k.f
    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return a(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            throw new AssertionError("unable to determine cleartext support", e2);
        }
    }

    @Override // f.o0.k.f
    public f.o0.m.c a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return new f.o0.m.a(b(x509TrustManager));
        }
    }

    @Override // f.o0.k.f
    public Object a(String str) {
        C0153b bVar = this.f5327h;
        Method method = bVar.f5329a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            bVar.b.invoke(invoke, str);
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // f.o0.k.f
    public void a(String str, Object obj) {
        C0153b bVar = this.f5327h;
        if (bVar != null) {
            boolean z = false;
            if (obj != null) {
                try {
                    bVar.f5330c.invoke(obj, new Object[0]);
                    z = true;
                } catch (Exception unused) {
                }
            }
            if (!z) {
                a(5, str, (Throwable) null);
                return;
            }
            return;
        }
        throw null;
    }
}
