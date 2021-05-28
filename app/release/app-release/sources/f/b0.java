package f;

import f.o0.e;
import f.o0.k.f;
import f.o0.m.c;
import f.o0.m.d;
import f.u;
import f.x;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class b0 implements Cloneable {
    public static final List<c0> E = e.a(c0.HTTP_2, c0.HTTP_1_1);
    public static final List<o> F = e.a(o.f5070g, o.f5071h);
    public final int A;
    public final int B;
    public final int C;
    public final int D;

    /* renamed from: c  reason: collision with root package name */
    public final r f4970c;

    /* renamed from: d  reason: collision with root package name */
    public final Proxy f4971d;

    /* renamed from: e  reason: collision with root package name */
    public final List<c0> f4972e;

    /* renamed from: f  reason: collision with root package name */
    public final List<o> f4973f;

    /* renamed from: g  reason: collision with root package name */
    public final List<z> f4974g;

    /* renamed from: h  reason: collision with root package name */
    public final List<z> f4975h;
    public final u.b i;
    public final ProxySelector j;
    public final q k;
    public final h l;
    public final f.o0.f.e m;
    public final SocketFactory n;
    public final SSLSocketFactory o;
    public final c p;
    public final HostnameVerifier q;
    public final l r;
    public final g s;
    public final g t;
    public final n u;
    public final t v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public class a extends f.o0.c {
        @Override // f.o0.c
        public void a(x.a aVar, String str, String str2) {
            aVar.f5402a.add(str);
            aVar.f5402a.add(str2.trim());
        }
    }

    public static final class b {
        public int A;
        public int B;

        /* renamed from: a  reason: collision with root package name */
        public r f4976a;
        public Proxy b;

        /* renamed from: c  reason: collision with root package name */
        public List<c0> f4977c;

        /* renamed from: d  reason: collision with root package name */
        public List<o> f4978d;

        /* renamed from: e  reason: collision with root package name */
        public final List<z> f4979e;

        /* renamed from: f  reason: collision with root package name */
        public final List<z> f4980f;

        /* renamed from: g  reason: collision with root package name */
        public u.b f4981g;

        /* renamed from: h  reason: collision with root package name */
        public ProxySelector f4982h;
        public q i;
        public h j;
        public f.o0.f.e k;
        public SocketFactory l;
        public SSLSocketFactory m;
        public c n;
        public HostnameVerifier o;
        public l p;
        public g q;
        public g r;
        public n s;
        public t t;
        public boolean u;
        public boolean v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        public b() {
            this.f4979e = new ArrayList();
            this.f4980f = new ArrayList();
            this.f4976a = new r();
            this.f4977c = b0.E;
            this.f4978d = b0.F;
            this.f4981g = new d(u.f5395a);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f4982h = proxySelector;
            if (proxySelector == null) {
                this.f4982h = new f.o0.l.a();
            }
            this.i = q.f5388a;
            this.l = SocketFactory.getDefault();
            this.o = d.f5344a;
            this.p = l.f5050c;
            g gVar = g.f5017a;
            this.q = gVar;
            this.r = gVar;
            this.s = new n();
            this.t = t.f5394a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public b(b0 b0Var) {
            this.f4979e = new ArrayList();
            this.f4980f = new ArrayList();
            this.f4976a = b0Var.f4970c;
            this.b = b0Var.f4971d;
            this.f4977c = b0Var.f4972e;
            this.f4978d = b0Var.f4973f;
            this.f4979e.addAll(b0Var.f4974g);
            this.f4980f.addAll(b0Var.f4975h);
            this.f4981g = b0Var.i;
            this.f4982h = b0Var.j;
            this.i = b0Var.k;
            this.k = b0Var.m;
            this.j = null;
            this.l = b0Var.n;
            this.m = b0Var.o;
            this.n = b0Var.p;
            this.o = b0Var.q;
            this.p = b0Var.r;
            this.q = b0Var.s;
            this.r = b0Var.t;
            this.s = b0Var.u;
            this.t = b0Var.v;
            this.u = b0Var.w;
            this.v = b0Var.x;
            this.w = b0Var.y;
            this.x = b0Var.z;
            this.y = b0Var.A;
            this.z = b0Var.B;
            this.A = b0Var.C;
            this.B = b0Var.D;
        }
    }

    static {
        f.o0.c.f5081a = new a();
    }

    public b0() {
        this(new b());
    }

    public b0(b bVar) {
        boolean z2;
        c cVar;
        this.f4970c = bVar.f4976a;
        this.f4971d = bVar.b;
        this.f4972e = bVar.f4977c;
        this.f4973f = bVar.f4978d;
        this.f4974g = e.a(bVar.f4979e);
        this.f4975h = e.a(bVar.f4980f);
        this.i = bVar.f4981g;
        this.j = bVar.f4982h;
        this.k = bVar.i;
        this.l = null;
        this.m = bVar.k;
        this.n = bVar.l;
        Iterator<o> it = this.f4973f.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                o next = it.next();
                if (z2 || next.f5072a) {
                    z2 = true;
                }
            }
        }
        if (bVar.m != null || !z2) {
            this.o = bVar.m;
            cVar = bVar.n;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                    throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                }
                X509TrustManager x509TrustManager = (X509TrustManager) trustManagers[0];
                try {
                    SSLContext a2 = f.f5341a.a();
                    a2.init(null, new TrustManager[]{x509TrustManager}, null);
                    this.o = a2.getSocketFactory();
                    cVar = f.f5341a.a(x509TrustManager);
                } catch (GeneralSecurityException e2) {
                    throw new AssertionError("No System TLS", e2);
                }
            } catch (GeneralSecurityException e3) {
                throw new AssertionError("No System TLS", e3);
            }
        }
        this.p = cVar;
        SSLSocketFactory sSLSocketFactory = this.o;
        if (sSLSocketFactory != null) {
            f.f5341a.a(sSLSocketFactory);
        }
        this.q = bVar.o;
        l lVar = bVar.p;
        c cVar2 = this.p;
        this.r = !Objects.equals(lVar.b, cVar2) ? new l(lVar.f5051a, cVar2) : lVar;
        this.s = bVar.q;
        this.t = bVar.r;
        this.u = bVar.s;
        this.v = bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.y;
        this.B = bVar.z;
        this.C = bVar.A;
        this.D = bVar.B;
        if (this.f4974g.contains(null)) {
            StringBuilder a3 = e.a.a.a.a.a("Null interceptor: ");
            a3.append(this.f4974g);
            throw new IllegalStateException(a3.toString());
        } else if (this.f4975h.contains(null)) {
            StringBuilder a4 = e.a.a.a.a.a("Null network interceptor: ");
            a4.append(this.f4975h);
            throw new IllegalStateException(a4.toString());
        }
    }
}
