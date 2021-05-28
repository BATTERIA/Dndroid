package d.g.i;

import android.os.Handler;
import d.g.i.c;
import java.util.concurrent.Callable;

public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callable f3317c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Handler f3318d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c.AbstractC0102c f3319e;

    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f3320c;

        public a(Object obj) {
            this.f3320c = obj;
        }

        public void run() {
            d.this.f3319e.a(this.f3320c);
        }
    }

    public d(c cVar, Callable callable, Handler handler, c.AbstractC0102c cVar2) {
        this.f3317c = callable;
        this.f3318d = handler;
        this.f3319e = cVar2;
    }

    public void run() {
        Object obj;
        try {
            obj = this.f3317c.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f3318d.post(new a(obj));
    }
}
