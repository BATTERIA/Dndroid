package com.didi.hummer.module;

import android.os.Handler;
import android.os.Looper;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.u.b;
import e.e.a.v.d;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class Timer implements b {
    public static Handler timerHandler = new Handler(Looper.getMainLooper());
    public a intervalCallback;
    public Runnable intervalRunnable;
    public AtomicBoolean isDestroyed = new AtomicBoolean(false);
    public boolean isIntervalRunning;
    public boolean isTimeoutRunning;
    public c jsValue;
    public a timeoutCallback;
    public Runnable timeoutRunnable;

    public Timer(c cVar) {
        this.jsValue = cVar;
    }

    public /* synthetic */ void a(long j, a aVar) {
        if (!this.isDestroyed.get()) {
            this.isIntervalRunning = true;
            timerHandler.postDelayed(this.intervalRunnable, j);
            if (aVar != null) {
                aVar.a(new Object[0]);
                if (!this.isIntervalRunning) {
                    aVar.d();
                }
            }
            this.isIntervalRunning = false;
        }
    }

    public /* synthetic */ void a(a aVar) {
        if (!this.isDestroyed.get()) {
            this.isTimeoutRunning = true;
            if (aVar != null) {
                aVar.a(new Object[0]);
                aVar.d();
            }
            this.jsValue.k();
            this.isTimeoutRunning = false;
        }
    }

    @JsMethod
    public void clearInterval() {
        Runnable runnable = this.intervalRunnable;
        if (runnable != null) {
            timerHandler.removeCallbacks(runnable);
        }
        if (!this.isIntervalRunning) {
            a aVar = this.intervalCallback;
            if (aVar != null) {
                aVar.d();
                this.intervalCallback = null;
            }
        } else {
            this.isIntervalRunning = false;
        }
        this.jsValue.k();
    }

    @JsMethod
    public void clearTimeout() {
        a aVar;
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            timerHandler.removeCallbacks(runnable);
        }
        if (!this.isTimeoutRunning && (aVar = this.timeoutCallback) != null) {
            aVar.d();
            this.timeoutCallback = null;
        }
        this.jsValue.k();
    }

    @Override // e.e.a.u.b
    public void onCreate() {
    }

    @Override // e.e.a.u.b
    public void onDestroy() {
        this.isDestroyed.set(true);
        clearInterval();
        clearTimeout();
    }

    @JsMethod
    public void setInterval(a aVar, long j) {
        this.jsValue.l();
        this.intervalCallback = aVar;
        Runnable runnable = this.intervalRunnable;
        if (runnable != null) {
            timerHandler.removeCallbacks(runnable);
        }
        d dVar = new d(this, j, aVar);
        this.intervalRunnable = dVar;
        timerHandler.postDelayed(dVar, j);
    }

    @JsMethod
    public void setTimeout(a aVar, long j) {
        this.jsValue.l();
        this.timeoutCallback = aVar;
        Runnable runnable = this.timeoutRunnable;
        if (runnable != null) {
            timerHandler.removeCallbacks(runnable);
        }
        e.e.a.v.c cVar = new e.e.a.v.c(this, aVar);
        this.timeoutRunnable = cVar;
        timerHandler.postDelayed(cVar, j);
    }
}
