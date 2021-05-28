package d.g.e.c;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import d.b.o.w;

public abstract class g {

    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Typeface f3257c;

        public a(Typeface typeface) {
            this.f3257c = typeface;
        }

        public void run() {
            g.this.a(this.f3257c);
        }
    }

    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f3259c;

        public b(int i) {
            this.f3259c = i;
        }

        public void run() {
            if (((w.a) g.this) == null) {
                throw null;
            }
        }
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }

    public abstract void a(Typeface typeface);

    public final void a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }
}
