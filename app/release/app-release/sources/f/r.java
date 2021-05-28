package f;

import f.d0;
import f.o0.e;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public int f5389a = 64;
    public int b = 5;

    /* renamed from: c  reason: collision with root package name */
    public ExecutorService f5390c;

    /* renamed from: d  reason: collision with root package name */
    public final Deque<d0.a> f5391d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final Deque<d0.a> f5392e = new ArrayDeque();

    /* renamed from: f  reason: collision with root package name */
    public final Deque<d0> f5393f = new ArrayDeque();

    public synchronized ExecutorService a() {
        if (this.f5390c == null) {
            this.f5390c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), e.a("OkHttp Dispatcher", false));
        }
        return this.f5390c;
    }

    public void a(d0.a aVar) {
        d0.a aVar2;
        synchronized (this) {
            this.f5391d.add(aVar);
            if (!d0.this.f4993f) {
                String b2 = aVar.b();
                Iterator<d0.a> it = this.f5392e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator<d0.a> it2 = this.f5391d.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                aVar2 = null;
                                break;
                            }
                            aVar2 = it2.next();
                            if (aVar2.b().equals(b2)) {
                                break;
                            }
                        }
                    } else {
                        aVar2 = it.next();
                        if (aVar2.b().equals(b2)) {
                            break;
                        }
                    }
                }
                if (aVar2 != null) {
                    aVar.f4996e = aVar2.f4996e;
                }
            }
        }
        b();
    }

    public final <T> void a(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        b();
    }

    public void b(d0.a aVar) {
        aVar.f4996e.decrementAndGet();
        a(this.f5392e, aVar);
    }

    public synchronized int c() {
        return this.f5392e.size() + this.f5393f.size();
    }

    public final boolean b() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<d0.a> it = this.f5391d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d0.a next = it.next();
                if (this.f5392e.size() >= this.f5389a) {
                    break;
                } else if (next.f4996e.get() < this.b) {
                    it.remove();
                    next.f4996e.incrementAndGet();
                    arrayList.add(next);
                    this.f5392e.add(next);
                }
            }
            z = c() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            d0.a aVar = (d0.a) arrayList.get(i);
            ExecutorService a2 = a();
            if (aVar != null) {
                try {
                    a2.execute(aVar);
                } catch (RejectedExecutionException e2) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e2);
                    d0.this.f4991d.a(interruptedIOException);
                    aVar.f4995d.a(d0.this, interruptedIOException);
                    d0.this.f4990c.f4970c.b(aVar);
                } catch (Throwable th) {
                    d0.this.f4990c.f4970c.b(aVar);
                    throw th;
                }
            } else {
                throw null;
            }
        }
        return z;
    }
}
