package e.h.a.f0;

import e.h.a.b;
import e.h.a.c0;
import e.h.a.d0;
import e.h.a.e0.c;
import e.h.a.e0.d;
import e.h.a.k;
import java.util.Collections;
import java.util.List;

public final class o implements d0, Cloneable {

    /* renamed from: h  reason: collision with root package name */
    public static final o f4708h = new o();

    /* renamed from: c  reason: collision with root package name */
    public double f4709c = -1.0d;

    /* renamed from: d  reason: collision with root package name */
    public int f4710d = 136;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4711e = true;

    /* renamed from: f  reason: collision with root package name */
    public List<b> f4712f = Collections.emptyList();

    /* renamed from: g  reason: collision with root package name */
    public List<b> f4713g = Collections.emptyList();

    @Override // e.h.a.d0
    public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
        Class<? super T> cls = aVar.f4806a;
        boolean a2 = a(cls);
        boolean z = a2 || a(cls, true);
        boolean z2 = a2 || a(cls, false);
        if (z || z2) {
            return new a(z2, z, kVar, aVar);
        }
        return null;
    }

    public final boolean a(Class<?> cls) {
        if (this.f4709c == -1.0d || a((c) cls.getAnnotation(c.class), (d) cls.getAnnotation(d.class))) {
            return (!this.f4711e && c(cls)) || b(cls);
        }
        return true;
    }

    public final boolean a(Class<?> cls, boolean z) {
        for (b bVar : z ? this.f4712f : this.f4713g) {
            if (bVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean c(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return (o) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public class a extends c0<T> {

        /* renamed from: a  reason: collision with root package name */
        public c0<T> f4714a;
        public final /* synthetic */ boolean b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f4715c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ k f4716d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ e.h.a.g0.a f4717e;

        public a(boolean z, boolean z2, k kVar, e.h.a.g0.a aVar) {
            this.b = z;
            this.f4715c = z2;
            this.f4716d = kVar;
            this.f4717e = aVar;
        }

        @Override // e.h.a.c0
        public T a(e.h.a.h0.a aVar) {
            if (this.b) {
                aVar.D();
                return null;
            }
            c0<T> c0Var = this.f4714a;
            if (c0Var == null) {
                c0Var = this.f4716d.a(o.this, this.f4717e);
                this.f4714a = c0Var;
            }
            return c0Var.a(aVar);
        }

        @Override // e.h.a.c0
        public void a(e.h.a.h0.c cVar, T t) {
            if (this.f4715c) {
                cVar.p();
                return;
            }
            c0<T> c0Var = this.f4714a;
            if (c0Var == null) {
                c0Var = this.f4716d.a(o.this, this.f4717e);
                this.f4714a = c0Var;
            }
            c0Var.a(cVar, t);
        }
    }

    public final boolean a(c cVar, d dVar) {
        if (!(cVar == null || cVar.value() <= this.f4709c)) {
            return false;
        }
        if (dVar == null || dVar.value() > this.f4709c) {
            return true;
        }
        return false;
    }
}
