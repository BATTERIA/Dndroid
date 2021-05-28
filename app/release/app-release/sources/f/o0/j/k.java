package f.o0.j;

import a.a.a.a.v0.m.l1.a;
import f.b0;
import f.c0;
import f.e0;
import f.h0;
import f.o0.e;
import f.o0.g.g;
import f.o0.h.c;
import f.o0.h.f;
import f.o0.h.i;
import f.o0.j.m;
import f.x;
import f.z;
import g.w;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class k implements c {

    /* renamed from: g  reason: collision with root package name */
    public static final List<String> f5273g = e.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: h  reason: collision with root package name */
    public static final List<String> f5274h = e.a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final z.a f5275a;
    public final g b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5276c;

    /* renamed from: d  reason: collision with root package name */
    public volatile m f5277d;

    /* renamed from: e  reason: collision with root package name */
    public final c0 f5278e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f5279f;

    public k(b0 b0Var, g gVar, z.a aVar, f fVar) {
        this.b = gVar;
        this.f5275a = aVar;
        this.f5276c = fVar;
        this.f5278e = b0Var.f4972e.contains(c0.H2_PRIOR_KNOWLEDGE) ? c0.H2_PRIOR_KNOWLEDGE : c0.HTTP_2;
    }

    @Override // f.o0.h.c
    public long a(h0 h0Var) {
        return f.o0.h.e.a(h0Var);
    }

    @Override // f.o0.h.c
    public h0.a a(boolean z) {
        x f2 = this.f5277d.f();
        c0 c0Var = this.f5278e;
        ArrayList arrayList = new ArrayList(20);
        int b2 = f2.b();
        i iVar = null;
        for (int i = 0; i < b2; i++) {
            String a2 = f2.a(i);
            String b3 = f2.b(i);
            if (a2.equals(":status")) {
                iVar = i.a("HTTP/1.1 " + b3);
            } else if (f5274h.contains(a2)) {
                continue;
            } else if (((b0.a) f.o0.c.f5081a) != null) {
                arrayList.add(a2);
                arrayList.add(b3.trim());
            } else {
                throw null;
            }
        }
        if (iVar != null) {
            h0.a aVar = new h0.a();
            aVar.b = c0Var;
            aVar.f5025c = iVar.b;
            aVar.f5026d = iVar.f5171c;
            x.a aVar2 = new x.a();
            Collections.addAll(aVar2.f5402a, (String[]) arrayList.toArray(new String[arrayList.size()]));
            aVar.f5028f = aVar2;
            if (z) {
                if (((b0.a) f.o0.c.f5081a) == null) {
                    throw null;
                } else if (aVar.f5025c == 100) {
                    return null;
                }
            }
            return aVar;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    @Override // f.o0.h.c
    public w a(e0 e0Var, long j) {
        return this.f5277d.c();
    }

    @Override // f.o0.h.c
    public void a() {
        ((m.a) this.f5277d.c()).close();
    }

    @Override // f.o0.h.c
    public void b() {
        this.f5276c.x.flush();
    }

    @Override // f.o0.h.c
    public g c() {
        return this.b;
    }

    @Override // f.o0.h.c
    public void cancel() {
        this.f5279f = true;
        if (this.f5277d != null) {
            this.f5277d.a(b.CANCEL);
        }
    }

    @Override // f.o0.h.c
    public g.x b(h0 h0Var) {
        return this.f5277d.f5296g;
    }

    @Override // f.o0.h.c
    public void a(e0 e0Var) {
        if (this.f5277d == null) {
            boolean z = e0Var.f5007d != null;
            x xVar = e0Var.f5006c;
            ArrayList arrayList = new ArrayList(xVar.b() + 4);
            arrayList.add(new c(c.f5201f, e0Var.b));
            arrayList.add(new c(c.f5202g, a.a(e0Var.f5005a)));
            String a2 = e0Var.f5006c.a("Host");
            if (a2 != null) {
                arrayList.add(new c(c.i, a2));
            }
            arrayList.add(new c(c.f5203h, e0Var.f5005a.f5403a));
            int b2 = xVar.b();
            for (int i = 0; i < b2; i++) {
                String lowerCase = xVar.a(i).toLowerCase(Locale.US);
                if (!f5273g.contains(lowerCase) || (lowerCase.equals("te") && xVar.b(i).equals("trailers"))) {
                    arrayList.add(new c(lowerCase, xVar.b(i)));
                }
            }
            this.f5277d = this.f5276c.a(0, arrayList, z);
            if (!this.f5279f) {
                this.f5277d.i.a((long) ((f) this.f5275a).f5165h, TimeUnit.MILLISECONDS);
                this.f5277d.j.a((long) ((f) this.f5275a).i, TimeUnit.MILLISECONDS);
                return;
            }
            this.f5277d.a(b.CANCEL);
            throw new IOException("Canceled");
        }
    }
}
