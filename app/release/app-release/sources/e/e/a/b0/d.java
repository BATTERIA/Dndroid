package e.e.a.b0;

import android.os.Handler;
import android.os.Looper;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static Handler f4290a;

    public static void a(Runnable runnable) {
        synchronized (d.class) {
            if (f4290a == null) {
                f4290a = new Handler(Looper.getMainLooper());
            }
        }
        f4290a.post(runnable);
    }
}
