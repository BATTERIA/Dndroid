package f.o0.h;

import f.a0;
import f.e0;
import f.g0;
import f.h0;
import f.o0.e;
import f.p;
import f.q;
import f.x;
import f.z;
import g.l;
import g.s;
import java.util.Collections;
import java.util.List;

public final class a implements z {

    /* renamed from: a  reason: collision with root package name */
    public final q f5155a;

    public a(q qVar) {
        this.f5155a = qVar;
    }

    @Override // f.z
    public h0 a(z.a aVar) {
        boolean z;
        f fVar = (f) aVar;
        e0 e0Var = fVar.f5162e;
        if (e0Var != null) {
            e0.a aVar2 = new e0.a(e0Var);
            g0 g0Var = e0Var.f5007d;
            if (g0Var != null) {
                a0 b = g0Var.b();
                if (b != null) {
                    aVar2.a("Content-Type", b.f4968a);
                }
                long a2 = g0Var.a();
                if (a2 != -1) {
                    aVar2.a("Content-Length", Long.toString(a2));
                    aVar2.f5011c.a("Transfer-Encoding");
                } else {
                    aVar2.a("Transfer-Encoding", "chunked");
                    aVar2.f5011c.a("Content-Length");
                }
            }
            if (e0Var.f5006c.a("Host") == null) {
                aVar2.a("Host", e.a(e0Var.f5005a, false));
            }
            if (e0Var.f5006c.a("Connection") == null) {
                aVar2.a("Connection", "Keep-Alive");
            }
            if (e0Var.f5006c.a("Accept-Encoding") == null && e0Var.f5006c.a("Range") == null) {
                aVar2.a("Accept-Encoding", "gzip");
                z = true;
            } else {
                z = false;
            }
            if (((q.a) this.f5155a) != null) {
                List emptyList = Collections.emptyList();
                if (!emptyList.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    int size = emptyList.size();
                    for (int i = 0; i < size; i++) {
                        if (i > 0) {
                            sb.append("; ");
                        }
                        p pVar = (p) emptyList.get(i);
                        sb.append(pVar.f5381a);
                        sb.append('=');
                        sb.append(pVar.b);
                    }
                    aVar2.a("Cookie", sb.toString());
                }
                if (e0Var.f5006c.a("User-Agent") == null) {
                    aVar2.a("User-Agent", "okhttp/3.14.9");
                }
                h0 a3 = fVar.a(aVar2.a(), fVar.b, fVar.f5160c);
                e.a(this.f5155a, e0Var.f5005a, a3.f5023h);
                h0.a aVar3 = new h0.a(a3);
                aVar3.f5024a = e0Var;
                if (z) {
                    String a4 = a3.f5023h.a("Content-Encoding");
                    if (a4 == null) {
                        a4 = null;
                    }
                    if ("gzip".equalsIgnoreCase(a4) && e.b(a3)) {
                        l lVar = new l(a3.i.l());
                        x.a a5 = a3.f5023h.a();
                        a5.a("Content-Encoding");
                        a5.a("Content-Length");
                        List<String> list = a5.f5402a;
                        x.a aVar4 = new x.a();
                        Collections.addAll(aVar4.f5402a, (String[]) list.toArray(new String[list.size()]));
                        aVar3.f5028f = aVar4;
                        String a6 = a3.f5023h.a("Content-Type");
                        if (a6 == null) {
                            a6 = null;
                        }
                        aVar3.f5029g = new g(a6, -1, new s(lVar));
                    }
                }
                return aVar3.a();
            }
            throw null;
        }
        throw null;
    }
}
