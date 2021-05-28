package a.a.a.a.v0.l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class f implements Lock {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f1809c = new f();

    public void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    public boolean tryLock() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "unit", "kotlin/reflect/jvm/internal/impl/storage/NoLock", "tryLock"));
        }
        throw new UnsupportedOperationException("Should not be called");
    }

    public void unlock() {
    }
}
