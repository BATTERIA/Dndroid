package d.g.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3304a = new Object();
    public HandlerThread b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f3305c;

    /* renamed from: d  reason: collision with root package name */
    public int f3306d;

    /* renamed from: e  reason: collision with root package name */
    public Handler.Callback f3307e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f3308f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3309g;

    /* renamed from: h  reason: collision with root package name */
    public final String f3310h;

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            } else if (i != 1) {
                return true;
            } else {
                c.this.a((Runnable) message.obj);
                return true;
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f3312c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Callable f3313d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ReentrantLock f3314e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f3315f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Condition f3316g;

        public b(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f3312c = atomicReference;
            this.f3313d = callable;
            this.f3314e = reentrantLock;
            this.f3315f = atomicBoolean;
            this.f3316g = condition;
        }

        public void run() {
            try {
                this.f3312c.set(this.f3313d.call());
            } catch (Exception unused) {
            }
            this.f3314e.lock();
            try {
                this.f3315f.set(false);
                this.f3316g.signal();
            } finally {
                this.f3314e.unlock();
            }
        }
    }

    /* renamed from: d.g.i.c$c  reason: collision with other inner class name */
    public interface AbstractC0102c<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.f3310h = str;
        this.f3309g = i;
        this.f3308f = i2;
        this.f3306d = 0;
    }

    public <T> T a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new b(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    T t = (T) atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void a() {
        synchronized (this.f3304a) {
            if (!this.f3305c.hasMessages(1)) {
                this.b.quit();
                this.b = null;
                this.f3305c = null;
            }
        }
    }

    public void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f3304a) {
            this.f3305c.removeMessages(0);
            this.f3305c.sendMessageDelayed(this.f3305c.obtainMessage(0), (long) this.f3308f);
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.f3304a) {
            if (this.b == null) {
                HandlerThread handlerThread = new HandlerThread(this.f3310h, this.f3309g);
                this.b = handlerThread;
                handlerThread.start();
                this.f3305c = new Handler(this.b.getLooper(), this.f3307e);
                this.f3306d++;
            }
            this.f3305c.removeMessages(0);
            this.f3305c.sendMessage(this.f3305c.obtainMessage(1, runnable));
        }
    }
}
