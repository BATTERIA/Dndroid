package e.c.a.b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f3818a = new Handler(Looper.getMainLooper());
    public static final Map<Integer, Map<Integer, ExecutorService>> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final int f3819c = Runtime.getRuntime().availableProcessors();

    public static final class a extends LinkedBlockingQueue<Runnable> {

        /* renamed from: c  reason: collision with root package name */
        public volatile b f3820c;

        /* renamed from: d  reason: collision with root package name */
        public int f3821d = Integer.MAX_VALUE;

        public a() {
        }

        public a(boolean z) {
            if (z) {
                this.f3821d = 0;
            }
        }

        /* renamed from: a */
        public boolean offer(Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'runnable' of type Runnable (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
            } else if (this.f3821d > size() || this.f3820c == null || this.f3820c.getPoolSize() >= this.f3820c.getMaximumPoolSize()) {
                return super.offer(runnable);
            } else {
                return false;
            }
        }
    }

    public static final class b extends ThreadPoolExecutor {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f3822a = new AtomicInteger();
        public a b;

        public b(int i, int i2, long j, TimeUnit timeUnit, a aVar, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, aVar, threadFactory);
            aVar.f3820c = this;
            this.b = aVar;
        }

        public static /* synthetic */ ExecutorService a(int i, int i2) {
            b bVar;
            if (i == -8) {
                int i3 = q.f3819c;
                return new b(i3 + 1, (i3 * 2) + 1, 30, TimeUnit.SECONDS, new a(true), new c("cpu", i2));
            } else if (i == -4) {
                int i4 = (q.f3819c * 2) + 1;
                return new b(i4, i4, 30, TimeUnit.SECONDS, new a(), new c("io", i2));
            } else if (i == -2) {
                return new b(0, 128, 60, TimeUnit.SECONDS, new a(true), new c("cached", i2));
            } else {
                if (i != -1) {
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    new a();
                    new c("fixed(" + i + ")", i2);
                    return bVar;
                }
                bVar = new b(1, 1, 0, TimeUnit.MILLISECONDS, new a(), new c("single", i2));
                return bVar;
            }
        }

        public void afterExecute(Runnable runnable, Throwable th) {
            this.f3822a.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        public void execute(Runnable runnable) {
            if (runnable == null) {
                throw new NullPointerException("Argument 'command' of type Runnable (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
            } else if (!isShutdown()) {
                this.f3822a.incrementAndGet();
                try {
                    super.execute(runnable);
                } catch (RejectedExecutionException unused) {
                    Log.e("ThreadUtils", "This will not happen!");
                    this.b.offer(runnable);
                } catch (Throwable unused2) {
                    this.f3822a.decrementAndGet();
                }
            }
        }
    }

    public static final class c extends AtomicLong implements ThreadFactory {

        /* renamed from: f  reason: collision with root package name */
        public static final AtomicInteger f3823f = new AtomicInteger(1);

        /* renamed from: c  reason: collision with root package name */
        public final String f3824c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3825d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f3826e = false;

        public class a extends Thread {
            public a(c cVar, Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                try {
                    super.run();
                } catch (Throwable th) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                }
            }
        }

        public class b implements Thread.UncaughtExceptionHandler {
            public b(c cVar) {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        public c(String str, int i) {
            StringBuilder a2 = e.a.a.a.a.a(str, "-pool-");
            a2.append(f3823f.getAndIncrement());
            a2.append("-thread-");
            this.f3824c = a2.toString();
            this.f3825d = i;
        }

        public Thread newThread(Runnable runnable) {
            if (runnable != null) {
                a aVar = new a(this, runnable, this.f3824c + getAndIncrement());
                aVar.setDaemon(this.f3826e);
                aVar.setUncaughtExceptionHandler(new b(this));
                aVar.setPriority(this.f3825d);
                return aVar;
            }
            throw new NullPointerException("Argument 'r' of type Runnable (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
        }
    }

    static {
        new ConcurrentHashMap();
        new Timer();
    }

    public static ExecutorService a(int i, int i2) {
        ExecutorService executorService;
        synchronized (b) {
            Map<Integer, ExecutorService> map = b.get(Integer.valueOf(i));
            if (map == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorService = b.a(i, i2);
                concurrentHashMap.put(Integer.valueOf(i2), executorService);
                b.put(Integer.valueOf(i), concurrentHashMap);
            } else {
                executorService = map.get(Integer.valueOf(i2));
                if (executorService == null) {
                    executorService = b.a(i, i2);
                    map.put(Integer.valueOf(i2), executorService);
                }
            }
        }
        return executorService;
    }
}
