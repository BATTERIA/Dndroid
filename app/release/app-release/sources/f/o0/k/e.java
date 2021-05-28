package f.o0.k;

import f.c0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f5339c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f5340d;

    public e(Method method, Method method2) {
        this.f5339c = method;
        this.f5340d = method2;
    }

    public static e c() {
        try {
            return new e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // f.o0.k.f
    public void a(SSLSocket sSLSocket, String str, List<c0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> a2 = f.a(list);
            Method method = this.f5339c;
            Object[] objArr = new Object[1];
            ArrayList arrayList = (ArrayList) a2;
            objArr[0] = arrayList.toArray(new String[arrayList.size()]);
            method.invoke(sSLParameters, objArr);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set SSL parameters", e2);
        }
    }

    @Override // f.o0.k.f
    public String b(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f5340d.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
