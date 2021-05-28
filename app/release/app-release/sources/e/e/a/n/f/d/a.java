package e.e.a.n.f.d;

import e.e.a.n.f.b;
import f.b0;
import f.c0;
import f.d0;
import f.e0;
import f.m0;
import f.n0;
import f.o0.n.c;
import f.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class a implements e.e.a.n.f.a {

    /* renamed from: a  reason: collision with root package name */
    public String f4366a;
    public b0 b = new b0(new b0.b());

    /* renamed from: c  reason: collision with root package name */
    public m0 f4367c;

    /* renamed from: e.e.a.n.f.d.a$a  reason: collision with other inner class name */
    public class C0134a extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f4368a;

        public C0134a(b bVar) {
            this.f4368a = bVar;
        }
    }

    public void a(int i, String str) {
        m0 m0Var = this.f4367c;
        if (m0Var != null) {
            ((c) m0Var).a(i, str, 60000);
        }
        this.f4366a = null;
        this.f4367c = null;
    }

    public void a(String str, b bVar) {
        if (this.f4367c != null) {
            if (str != null && !str.equals(this.f4366a)) {
                a(e.e.a.n.f.c.CLOSE_NORMAL.f4365c, "CLOSE_NORMAL");
            } else {
                return;
            }
        }
        this.f4366a = str;
        e0.a aVar = new e0.a();
        aVar.a(str);
        e0 a2 = aVar.a();
        b0 b0Var = this.b;
        C0134a aVar2 = new C0134a(bVar);
        if (b0Var != null) {
            c cVar = new c(a2, aVar2, new Random(), (long) b0Var.D);
            b0.b bVar2 = new b0.b(b0Var);
            bVar2.f4981g = u.a(u.f5395a);
            ArrayList arrayList = new ArrayList(c.x);
            if (!arrayList.contains(c0.H2_PRIOR_KNOWLEDGE) && !arrayList.contains(c0.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            } else if (arrayList.contains(c0.H2_PRIOR_KNOWLEDGE) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            } else if (arrayList.contains(c0.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            } else if (!arrayList.contains(null)) {
                arrayList.remove(c0.SPDY_3);
                bVar2.f4977c = Collections.unmodifiableList(arrayList);
                b0 b0Var2 = new b0(bVar2);
                e0 e0Var = cVar.f5347a;
                if (e0Var != null) {
                    e0.a aVar3 = new e0.a(e0Var);
                    aVar3.a("Upgrade", "websocket");
                    aVar3.a("Connection", "Upgrade");
                    aVar3.a("Sec-WebSocket-Key", cVar.f5350e);
                    aVar3.a("Sec-WebSocket-Version", "13");
                    e0 a3 = aVar3.a();
                    if (((b0.a) f.o0.c.f5081a) != null) {
                        d0 a4 = d0.a(b0Var2, a3, true);
                        cVar.f5351f = a4;
                        a4.a(new f.o0.n.b(cVar, a3));
                        return;
                    }
                    throw null;
                }
                throw null;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        } else {
            throw null;
        }
    }
}
