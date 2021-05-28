package e.e.a.n.a.d;

import android.text.TextUtils;
import e.e.a.n.a.b;
import e.e.a.n.a.c;
import f.a0;
import f.b0;
import f.e0;
import f.o0.k.f;
import f.x;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class g implements c {
    public static final a0 b = a0.b("application/json;charset=utf-8");

    /* renamed from: a  reason: collision with root package name */
    public b0 f4333a;

    static {
        a0.b("application/x-www-form-urlencoded;charset=utf-8");
        a0.b("multipart/form-data;charset=utf-8");
        a0.b("application/octet-stream");
        a0.b("text/plain;charset=utf-8");
    }

    public g() {
        b0.b bVar = new b0.b();
        if (h.f4334a == null) {
            h.f4334a = new TrustManager[]{new h()};
        }
        SSLSocketFactory sSLSocketFactory = null;
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, h.f4334a, new SecureRandom());
            sSLSocketFactory = instance.getSocketFactory();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
        } catch (KeyManagementException e3) {
            e3.printStackTrace();
        }
        h hVar = new h();
        if (sSLSocketFactory != null) {
            bVar.m = sSLSocketFactory;
            bVar.n = f.f5341a.a(hVar);
            this.f4333a = new b0(bVar);
            return;
        }
        throw new NullPointerException("sslSocketFactory == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d0, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d1, code lost:
        if (r1 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d3, code lost:
        f.j0.a(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        throw r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ e.e.a.n.a.b a(e.e.a.n.a.d.g r7, f.h0 r8, java.lang.reflect.Type r9) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.n.a.d.g.a(e.e.a.n.a.d.g, f.h0, java.lang.reflect.Type):e.e.a.n.a.b");
    }

    public static /* synthetic */ b a(g gVar, Exception exc) {
        if (gVar != null) {
            b bVar = new b();
            bVar.f4316e = new b.a(-102, exc.toString());
            return bVar;
        }
        throw null;
    }

    public final void a(e0.a aVar, Map<String, Object> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                String valueOf = String.valueOf(map.get(str));
                if (!TextUtils.isEmpty(valueOf)) {
                    x.a aVar2 = aVar.f5011c;
                    if (aVar2 != null) {
                        x.b(str);
                        x.a(valueOf, str);
                        aVar2.f5402a.add(str);
                        aVar2.f5402a.add(valueOf.trim());
                    } else {
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> void a(java.lang.String r24, java.lang.String r25, int r26, java.util.Map<java.lang.String, java.lang.Object> r27, java.util.Map<java.lang.String, java.lang.Object> r28, e.e.a.n.a.a<T> r29, java.lang.reflect.Type r30) {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.a.n.a.d.g.a(java.lang.String, java.lang.String, int, java.util.Map, java.util.Map, e.e.a.n.a.a, java.lang.reflect.Type):void");
    }
}
