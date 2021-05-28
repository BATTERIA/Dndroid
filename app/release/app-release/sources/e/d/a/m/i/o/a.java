package e.d.a.m.i.o;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class a extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f4043a = new AtomicInteger();
    public final d b;

    public static class b implements ThreadFactory {

        /* renamed from: c  reason: collision with root package name */
        public int f4044c = 0;

        /* renamed from: e.d.a.m.i.o.a$b$a  reason: collision with other inner class name */
        public class C0125a extends Thread {
            public C0125a(b bVar, Runnable runnable, String str) {
                super(runnable, str);
            }

            public void run() {
                Process.setThreadPriority(10);
                super.run();
            }
        }

        public Thread newThread(Runnable runnable) {
            StringBuilder a2 = e.a.a.a.a.a("fifo-pool-thread-");
            a2.append(this.f4044c);
            C0125a aVar = new C0125a(this, runnable, a2.toString());
            this.f4044c++;
            return aVar;
        }
    }

    public static class c<T> extends FutureTask<T> implements Comparable<c<?>> {

        /* renamed from: c  reason: collision with root package name */
        public final int f4045c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4046d;

        public c(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (runnable instanceof b) {
                this.f4045c = ((b) runnable).a();
                this.f4046d = i;
                return;
            }
            throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // java.lang.Comparable
        public int compareTo(c<?> cVar) {
            c<?> cVar2 = cVar;
            int i = this.f4045c - cVar2.f4045c;
            return i == 0 ? this.f4046d - cVar2.f4046d : i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f4046d == cVar.f4046d && this.f4045c == cVar.f4045c;
        }

        public int hashCode() {
            return (this.f4045c * 31) + this.f4046d;
        }
    }

    public enum d {
        IGNORE,
        LOG {
            @Override // e.d.a.m.i.o.a.d
            public void a(Throwable th) {
                if (Log.isLoggable("PriorityExecutor", 6)) {
                    Log.e("PriorityExecutor", "Request threw uncaught throwable", th);
                }
            }
        },
        THROW {
            @Override // e.d.a.m.i.o.a.d
            public void a(Throwable th) {
                throw new RuntimeException(th);
            }
        };

        /* access modifiers changed from: public */
        /* synthetic */ d(C0124a aVar) {
        }

        public void a(Throwable th) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i) {
        super(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b());
        d dVar = d.LOG;
        this.b = dVar;
    }

    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone() && !future.isCancelled()) {
                try {
                    future.get();
                } catch (InterruptedException | ExecutionException e2) {
                    this.b.a(e2);
                }
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new c(runnable, t, this.f4043a.getAndIncrement());
    }
}
