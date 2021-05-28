package d.j.d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import c.a.a.a.a;

public abstract class n<E> extends j {

    /* renamed from: c  reason: collision with root package name */
    public final Activity f3480c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f3481d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f3482e;

    /* renamed from: f  reason: collision with root package name */
    public final q f3483f = new s();

    public n(d dVar) {
        Handler handler = new Handler();
        this.f3480c = dVar;
        a.a((Object) dVar, (Object) "context == null");
        this.f3481d = dVar;
        a.a(handler, "handler == null");
        this.f3482e = handler;
    }
}
