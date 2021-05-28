package g;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class y {

    /* renamed from: d  reason: collision with root package name */
    public static final y f5473d = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f5474a;
    public long b;

    /* renamed from: c  reason: collision with root package name */
    public long f5475c;

    public class a extends y {
        @Override // g.y
        public y a(long j) {
            return this;
        }

        @Override // g.y
        public y a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // g.y
        public void e() {
        }
    }

    public y a() {
        this.f5474a = false;
        return this;
    }

    public y a(long j) {
        this.f5474a = true;
        this.b = j;
        return this;
    }

    public y a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        } else if (timeUnit != null) {
            this.f5475c = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public y b() {
        this.f5475c = 0;
        return this;
    }

    public long c() {
        if (this.f5474a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.f5474a;
    }

    public void e() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f5474a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.f5475c;
    }
}
