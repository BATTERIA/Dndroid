package d.c.a.a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3045a = new Object();
    public final ExecutorService b = Executors.newFixedThreadPool(4, new a(this));

    public class a implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f3046c = new AtomicInteger(0);

        public a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f3046c.getAndIncrement())));
            return thread;
        }
    }

    @Override // d.c.a.a.c
    public boolean a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
