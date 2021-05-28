package e.d.a;

import android.content.Context;
import e.d.a.m.a;
import e.d.a.m.i.c;
import e.d.a.m.i.m.b;
import e.d.a.m.i.m.d;
import e.d.a.m.i.n.a;
import e.d.a.m.i.n.g;
import e.d.a.m.i.n.h;
import e.d.a.m.i.n.i;
import e.d.a.m.i.n.j;
import java.util.concurrent.ExecutorService;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3850a;
    public c b;

    /* renamed from: c  reason: collision with root package name */
    public b f3851c;

    /* renamed from: d  reason: collision with root package name */
    public i f3852d;

    /* renamed from: e  reason: collision with root package name */
    public ExecutorService f3853e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f3854f;

    /* renamed from: g  reason: collision with root package name */
    public a f3855g;

    /* renamed from: h  reason: collision with root package name */
    public a.AbstractC0122a f3856h;

    public f(Context context) {
        this.f3850a = context.getApplicationContext();
    }

    public e a() {
        if (this.f3853e == null) {
            this.f3853e = new e.d.a.m.i.o.a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f3854f == null) {
            this.f3854f = new e.d.a.m.i.o.a(1);
        }
        j jVar = new j(this.f3850a);
        if (this.f3851c == null) {
            this.f3851c = new d(jVar.f4040a);
        }
        if (this.f3852d == null) {
            this.f3852d = new h(jVar.b);
        }
        if (this.f3856h == null) {
            this.f3856h = new g(this.f3850a);
        }
        if (this.b == null) {
            this.b = new c(this.f3852d, this.f3856h, this.f3854f, this.f3853e);
        }
        if (this.f3855g == null) {
            this.f3855g = e.d.a.m.a.f3938f;
        }
        return new e(this.b, this.f3852d, this.f3851c, this.f3850a, this.f3855g);
    }
}
