package f.o0.g;

import f.e;
import f.j;
import f.k0;
import f.u;
import f.y;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final e f5139a;
    public final i b;

    /* renamed from: c  reason: collision with root package name */
    public final j f5140c;

    /* renamed from: d  reason: collision with root package name */
    public final u f5141d;

    /* renamed from: e  reason: collision with root package name */
    public List<Proxy> f5142e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public int f5143f;

    /* renamed from: g  reason: collision with root package name */
    public List<InetSocketAddress> f5144g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final List<k0> f5145h = new ArrayList();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<k0> f5146a;
        public int b = 0;

        public a(List<k0> list) {
            this.f5146a = list;
        }

        public boolean a() {
            return this.b < this.f5146a.size();
        }
    }

    public k(e eVar, i iVar, j jVar, u uVar) {
        List<Proxy> list;
        this.f5139a = eVar;
        this.b = iVar;
        this.f5140c = jVar;
        this.f5141d = uVar;
        y yVar = eVar.f4998a;
        Proxy proxy = eVar.f5004h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = eVar.f5003g.select(yVar.g());
            if (select == null || select.isEmpty()) {
                list = f.o0.e.a(Proxy.NO_PROXY);
            } else {
                list = f.o0.e.a(select);
            }
        }
        this.f5142e = list;
        this.f5143f = 0;
    }

    public boolean a() {
        return b() || !this.f5145h.isEmpty();
    }

    public final boolean b() {
        return this.f5143f < this.f5142e.size();
    }
}
