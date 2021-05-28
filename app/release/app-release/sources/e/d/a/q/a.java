package e.d.a.q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import e.d.a.m.g;
import e.d.a.m.i.b;
import e.d.a.m.i.c;
import e.d.a.m.i.e;
import e.d.a.m.i.i;
import e.d.a.m.i.k;
import e.d.a.p.f;
import e.d.a.q.f.d;
import e.d.a.q.g.h;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.Future;

public final class a<A, T, Z, R> implements b, h, d {
    public static final Queue<a<?, ?, ?, ?>> D = e.d.a.s.h.a(0);
    public c.C0121c A;
    public long B;
    public EnumC0129a C;

    /* renamed from: a  reason: collision with root package name */
    public final String f4230a = String.valueOf(hashCode());
    public e.d.a.m.c b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f4231c;

    /* renamed from: d  reason: collision with root package name */
    public int f4232d;

    /* renamed from: e  reason: collision with root package name */
    public int f4233e;

    /* renamed from: f  reason: collision with root package name */
    public int f4234f;

    /* renamed from: g  reason: collision with root package name */
    public Context f4235g;

    /* renamed from: h  reason: collision with root package name */
    public g<Z> f4236h;
    public f<A, T, Z, R> i;
    public e j;
    public A k;
    public Class<R> l;
    public boolean m;
    public e.d.a.g n;
    public e.d.a.q.g.a<R> o;
    public c<? super A, R> p;
    public float q;
    public c r;
    public d<R> s;
    public int t;
    public int u;
    public b v;
    public Drawable w;
    public Drawable x;
    public boolean y;
    public k<?> z;

    /* renamed from: e.d.a.q.a$a  reason: collision with other inner class name */
    public enum EnumC0129a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    public static void a(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    @Override // e.d.a.q.b
    public void a() {
        this.i = null;
        this.k = null;
        this.f4235g = null;
        this.o = null;
        this.w = null;
        this.x = null;
        this.f4231c = null;
        this.p = null;
        this.j = null;
        this.f4236h = null;
        this.s = null;
        this.y = false;
        this.A = null;
        D.offer(this);
    }

    @Override // e.d.a.q.d
    public void a(Exception exc) {
        Drawable drawable;
        if (Log.isLoggable("GenericRequest", 3)) {
            Log.d("GenericRequest", "load failed", exc);
        }
        this.C = EnumC0129a.FAILED;
        c<? super A, R> cVar = this.p;
        if (cVar != null) {
            A a2 = this.k;
            e.d.a.q.g.a<R> aVar = this.o;
            e eVar = this.j;
            if (cVar.a(exc, a2, aVar, eVar == null || !eVar.e())) {
                return;
            }
        }
        if (e()) {
            if (this.k == null) {
                if (this.f4231c == null && this.f4232d > 0) {
                    this.f4231c = this.f4235g.getResources().getDrawable(this.f4232d);
                }
                drawable = this.f4231c;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                if (this.x == null && this.f4234f > 0) {
                    this.x = this.f4235g.getResources().getDrawable(this.f4234f);
                }
                drawable = this.x;
            }
            if (drawable == null) {
                drawable = f();
            }
            this.o.a(exc, drawable);
        }
    }

    public final void a(String str) {
        StringBuilder a2 = e.a.a.a.a.a(str, " this: ");
        a2.append(this.f4230a);
        Log.v("GenericRequest", a2.toString());
    }

    @Override // e.d.a.q.b
    public void b() {
        clear();
        this.C = EnumC0129a.PAUSED;
    }

    public final void b(k kVar) {
        if (this.r != null) {
            e.d.a.s.h.a();
            if (kVar instanceof e.d.a.m.i.h) {
                ((e.d.a.m.i.h) kVar).d();
                this.z = null;
                return;
            }
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        throw null;
    }

    @Override // e.d.a.q.b
    public void c() {
        this.B = e.d.a.s.d.a();
        if (this.k == null) {
            a((Exception) null);
            return;
        }
        this.C = EnumC0129a.WAITING_FOR_SIZE;
        if (e.d.a.s.h.a(this.t, this.u)) {
            a(this.t, this.u);
        } else {
            this.o.a((h) this);
        }
        if (!d()) {
            if (!(this.C == EnumC0129a.FAILED) && e()) {
                this.o.b(f());
            }
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder a2 = e.a.a.a.a.a("finished run method in ");
            a2.append(e.d.a.s.d.a(this.B));
            a(a2.toString());
        }
    }

    @Override // e.d.a.q.b
    public void clear() {
        e.d.a.s.h.a();
        if (this.C != EnumC0129a.CLEARED) {
            this.C = EnumC0129a.CANCELLED;
            c.C0121c cVar = this.A;
            if (cVar != null) {
                e.d.a.m.i.d dVar = cVar.f3976a;
                d dVar2 = cVar.b;
                if (dVar != null) {
                    e.d.a.s.h.a();
                    if (dVar.j || dVar.l) {
                        if (dVar.m == null) {
                            dVar.m = new HashSet();
                        }
                        dVar.m.add(dVar2);
                    } else {
                        dVar.f3979a.remove(dVar2);
                        if (dVar.f3979a.isEmpty() && !dVar.l && !dVar.j && !dVar.f3985h) {
                            i iVar = dVar.n;
                            iVar.f4002g = true;
                            e.d.a.m.i.a<?, ?, ?> aVar = iVar.f4000e;
                            aVar.l = true;
                            aVar.f3953d.cancel();
                            Future<?> future = dVar.p;
                            if (future != null) {
                                future.cancel(true);
                            }
                            dVar.f3985h = true;
                            e eVar = dVar.f3980c;
                            e.d.a.m.c cVar2 = dVar.f3981d;
                            c cVar3 = (c) eVar;
                            if (cVar3 != null) {
                                e.d.a.s.h.a();
                                if (dVar.equals(cVar3.f3966a.get(cVar2))) {
                                    cVar3.f3966a.remove(cVar2);
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                    this.A = null;
                } else {
                    throw null;
                }
            }
            k<?> kVar = this.z;
            if (kVar != null) {
                b(kVar);
            }
            if (e()) {
                this.o.a(f());
            }
            this.C = EnumC0129a.CLEARED;
        }
    }

    @Override // e.d.a.q.b
    public boolean d() {
        return this.C == EnumC0129a.COMPLETE;
    }

    public final boolean e() {
        e eVar = this.j;
        return eVar == null || eVar.a(this);
    }

    public final Drawable f() {
        if (this.w == null && this.f4233e > 0) {
            this.w = this.f4235g.getResources().getDrawable(this.f4233e);
        }
        return this.w;
    }

    @Override // e.d.a.q.b
    public boolean isCancelled() {
        EnumC0129a aVar = this.C;
        return aVar == EnumC0129a.CANCELLED || aVar == EnumC0129a.CLEARED;
    }

    @Override // e.d.a.q.b
    public boolean isRunning() {
        EnumC0129a aVar = this.C;
        return aVar == EnumC0129a.RUNNING || aVar == EnumC0129a.WAITING_FOR_SIZE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: e.d.a.q.c<? super A, R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e.d.a.q.d
    public void a(k<?> kVar) {
        if (kVar == null) {
            StringBuilder a2 = e.a.a.a.a.a("Expected to receive a Resource<R> with an object of ");
            a2.append(this.l);
            a2.append(" inside, but instead got null.");
            a(new Exception(a2.toString()));
            return;
        }
        Object obj = kVar.get();
        if (obj == null || !this.l.isAssignableFrom(obj.getClass())) {
            b(kVar);
            StringBuilder a3 = e.a.a.a.a.a("Expected to receive an object of ");
            a3.append(this.l);
            a3.append(" but instead got ");
            String str = "";
            a3.append(obj != null ? obj.getClass() : str);
            a3.append("{");
            a3.append(obj);
            a3.append("}");
            a3.append(" inside Resource{");
            a3.append(kVar);
            a3.append("}.");
            String str2 = str;
            if (obj == null) {
                str2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            a3.append(str2);
            a(new Exception(a3.toString()));
            return;
        }
        e eVar = this.j;
        if (!(eVar == null || eVar.b(this))) {
            b(kVar);
            this.C = EnumC0129a.COMPLETE;
            return;
        }
        e eVar2 = this.j;
        boolean z2 = eVar2 == null || !eVar2.e();
        this.C = EnumC0129a.COMPLETE;
        this.z = kVar;
        c<? super A, R> cVar = this.p;
        if (cVar == 0 || !cVar.a(obj, this.k, this.o, this.y, z2)) {
            this.o.a(obj, this.s.a(this.y, z2));
        }
        e eVar3 = this.j;
        if (eVar3 != null) {
            eVar3.c(this);
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder a4 = e.a.a.a.a.a("Resource ready in ");
            a4.append(e.d.a.s.d.a(this.B));
            a4.append(" size: ");
            double b2 = (double) kVar.b();
            Double.isNaN(b2);
            Double.isNaN(b2);
            a4.append(b2 * 9.5367431640625E-7d);
            a4.append(" fromCache: ");
            a4.append(this.y);
            a(a4.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @Override // e.d.a.q.g.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r33, int r34) {
        /*
        // Method dump skipped, instructions count: 556
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.q.a.a(int, int):void");
    }
}
