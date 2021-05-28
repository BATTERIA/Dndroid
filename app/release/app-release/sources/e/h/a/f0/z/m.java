package e.h.a.f0.z;

import e.f.a.g;
import e.h.a.c0;
import e.h.a.d0;
import e.h.a.k;
import e.h.a.o;
import e.h.a.p;
import e.h.a.q;
import e.h.a.s;
import e.h.a.x;
import e.h.a.y;

public final class m<T> extends c0<T> {

    /* renamed from: a  reason: collision with root package name */
    public final y<T> f4770a;
    public final p<T> b;

    /* renamed from: c  reason: collision with root package name */
    public final k f4771c;

    /* renamed from: d  reason: collision with root package name */
    public final e.h.a.g0.a<T> f4772d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f4773e;

    /* renamed from: f  reason: collision with root package name */
    public final m<T>.b f4774f = new b(this, null);

    /* renamed from: g  reason: collision with root package name */
    public c0<T> f4775g;

    public final class b implements x, o {
        public /* synthetic */ b(m mVar, a aVar) {
        }
    }

    public static final class c implements d0 {

        /* renamed from: c  reason: collision with root package name */
        public final e.h.a.g0.a<?> f4776c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4777d;

        /* renamed from: e  reason: collision with root package name */
        public final Class<?> f4778e;

        /* renamed from: f  reason: collision with root package name */
        public final y<?> f4779f;

        /* renamed from: g  reason: collision with root package name */
        public final p<?> f4780g;

        public c(Object obj, e.h.a.g0.a<?> aVar, boolean z, Class<?> cls) {
            p<?> pVar = null;
            this.f4779f = obj instanceof y ? (y) obj : null;
            pVar = obj instanceof p ? (p) obj : pVar;
            this.f4780g = pVar;
            g.a((this.f4779f == null && pVar == null) ? false : true);
            this.f4776c = aVar;
            this.f4777d = z;
            this.f4778e = cls;
        }

        @Override // e.h.a.d0
        public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
            boolean z;
            e.h.a.g0.a<?> aVar2 = this.f4776c;
            if (aVar2 != null) {
                z = aVar2.equals(aVar) || (this.f4777d && this.f4776c.b == aVar.f4806a);
            } else {
                z = this.f4778e.isAssignableFrom(aVar.f4806a);
            }
            if (z) {
                return new m(this.f4779f, this.f4780g, kVar, aVar, this);
            }
            return null;
        }
    }

    public m(y<T> yVar, p<T> pVar, k kVar, e.h.a.g0.a<T> aVar, d0 d0Var) {
        this.f4770a = yVar;
        this.b = pVar;
        this.f4771c = kVar;
        this.f4772d = aVar;
        this.f4773e = d0Var;
    }

    @Override // e.h.a.c0
    public T a(e.h.a.h0.a aVar) {
        if (this.b == null) {
            c0<T> c0Var = this.f4775g;
            if (c0Var == null) {
                c0Var = this.f4771c.a(this.f4773e, this.f4772d);
                this.f4775g = c0Var;
            }
            return c0Var.a(aVar);
        }
        q a2 = g.a(aVar);
        if (a2 == null) {
            throw null;
        } else if (a2 instanceof s) {
            return null;
        } else {
            return this.b.a(a2, this.f4772d.b, this.f4774f);
        }
    }

    @Override // e.h.a.c0
    public void a(e.h.a.h0.c cVar, T t) {
        y<T> yVar = this.f4770a;
        if (yVar == null) {
            c0<T> c0Var = this.f4775g;
            if (c0Var == null) {
                c0Var = this.f4771c.a(this.f4773e, this.f4772d);
                this.f4775g = c0Var;
            }
            c0Var.a(cVar, t);
        } else if (t == null) {
            cVar.p();
        } else {
            o.X.a(cVar, yVar.a(t, this.f4772d.b, this.f4774f));
        }
    }
}
