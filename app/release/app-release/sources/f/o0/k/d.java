package f.o0.k;

import f.c0;
import f.o0.e;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

public class d extends f {

    /* renamed from: c  reason: collision with root package name */
    public final Method f5332c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f5333d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f5334e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f5335f;

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f5336g;

    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f5337a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public String f5338c;

        public a(List<String> list) {
            this.f5337a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return true;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f5337a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        String str = (String) list.get(i);
                        if (this.f5337a.contains(str)) {
                            this.f5338c = str;
                            return str;
                        }
                    }
                    String str2 = this.f5337a.get(0);
                    this.f5338c = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.f5338c = (String) objArr[0];
                    return null;
                }
            }
        }
    }

    public d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f5332c = method;
        this.f5333d = method2;
        this.f5334e = method3;
        this.f5335f = cls;
        this.f5336g = cls2;
    }

    public static f c() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
            return new d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // f.o0.k.f
    public void a(SSLSocket sSLSocket) {
        try {
            this.f5334e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // f.o0.k.f
    public void a(SSLSocket sSLSocket, String str, List<c0> list) {
        List<String> a2 = f.a(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(f.class.getClassLoader(), new Class[]{this.f5335f, this.f5336g}, new a(a2));
            this.f5332c.invoke(null, sSLSocket, newProxyInstance);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // f.o0.k.f
    public String b(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f5333d.invoke(null, sSLSocket));
            if (!aVar.b && aVar.f5338c == null) {
                f.f5341a.a(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.b) {
                return null;
            } else {
                return aVar.f5338c;
            }
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
