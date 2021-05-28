package a.a.a.a.v0.l;

import a.q;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class b implements j {

    /* renamed from: d  reason: collision with root package name */
    public static final String f1788d;

    /* renamed from: e  reason: collision with root package name */
    public static final j f1789e = new a("NO_LOCKS", f.f1795a, f.f1809c);

    /* renamed from: a  reason: collision with root package name */
    public final Lock f1790a;
    public final f b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1791c;

    public static class a extends b {
        public a(String str, f fVar, Lock lock) {
            super(str, fVar, lock);
        }

        @Override // a.a.a.a.v0.l.b
        public <T> o<T> b() {
            return new o<>(null, true);
        }
    }

    /* renamed from: a.a.a.a.v0.l.b$b  reason: collision with other inner class name */
    public class C0070b extends j<T> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f1792f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0070b(b bVar, b bVar2, a.w.b.a aVar, Object obj) {
            super(bVar2, aVar);
            this.f1792f = obj;
        }

        @Override // a.a.a.a.v0.l.b.h
        public o<T> a(boolean z) {
            return new o<>(this.f1792f, false);
        }
    }

    public class c extends k<T> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ a.w.b.l f1793g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a.w.b.l f1794h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(b bVar, b bVar2, a.w.b.a aVar, a.w.b.l lVar, a.w.b.l lVar2) {
            super(bVar2, aVar);
            this.f1793g = lVar;
            this.f1794h = lVar2;
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4";
            } else {
                objArr[0] = "value";
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            if (i != 2) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.a.a.a.v0.l.b.h
        public o<T> a(boolean z) {
            a.w.b.l lVar = this.f1793g;
            if (lVar != null) {
                return new o<>(lVar.a(Boolean.valueOf(z)), false);
            }
            o<T> a2 = super.a(z);
            if (a2 != null) {
                return a2;
            }
            a(0);
            throw null;
        }
    }

    public static class d<K, V> extends e<K, V> implements a<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(b bVar, ConcurrentMap concurrentMap, a aVar) {
            super(bVar, concurrentMap, null);
            if (bVar == null) {
                a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.a.a.a.v0.l.b$d<K, V> */
        /* JADX WARN: Multi-variable type inference failed */
        public V a(K k, a.w.b.a<? extends V> aVar) {
            if (aVar != null) {
                V v = (V) a(new g(k, aVar));
                if (v != null) {
                    return v;
                }
                a(3);
                throw null;
            }
            a(2);
            throw null;
        }
    }

    public static class e<K, V> extends l<g<K, V>, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(b bVar, ConcurrentMap concurrentMap, a aVar) {
            super(bVar, concurrentMap, new c());
            if (bVar == null) {
                a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f1795a = new a();

        public static class a implements f {
            public RuntimeException a(Throwable th) {
                if (th != null) {
                    throw th;
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }
        }
    }

    public static class g<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f1796a;
        public final a.w.b.a<? extends V> b;

        public g(K k, a.w.b.a<? extends V> aVar) {
            this.f1796a = k;
            this.b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.f1796a.equals(((g) obj).f1796a);
        }

        public int hashCode() {
            return this.f1796a.hashCode();
        }
    }

    public static class h<T> implements h<T> {

        /* renamed from: c  reason: collision with root package name */
        public final b f1797c;

        /* renamed from: d  reason: collision with root package name */
        public final a.w.b.a<? extends T> f1798d;

        /* renamed from: e  reason: collision with root package name */
        public volatile Object f1799e;

        public h(b bVar, a.w.b.a<? extends T> aVar) {
            if (bVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
                this.f1799e = n.NOT_COMPUTED;
                this.f1797c = bVar;
                this.f1798d = aVar;
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 2 || i == 3) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        public o<T> a(boolean z) {
            o<T> b = this.f1797c.b();
            if (b != null) {
                return b;
            }
            a(2);
            throw null;
        }

        @Override // a.w.b.a
        public T a() {
            T t = (T) this.f1799e;
            if (!(t instanceof n)) {
                a.a.a.a.v0.o.n.c(t);
                return t;
            }
            this.f1797c.f1790a.lock();
            try {
                T t2 = (T) this.f1799e;
                if (!(t2 instanceof n)) {
                    a.a.a.a.v0.o.n.c(t2);
                } else {
                    if (t2 == n.COMPUTING) {
                        this.f1799e = n.RECURSION_WAS_DETECTED;
                        o<T> a2 = a(true);
                        if (!a2.b) {
                            t2 = a2.f1808a;
                        }
                    }
                    if (t2 == n.RECURSION_WAS_DETECTED) {
                        o<T> a3 = a(false);
                        if (!a3.b) {
                            t2 = a3.f1808a;
                        }
                    }
                    this.f1799e = n.COMPUTING;
                    try {
                        t2 = (T) this.f1798d.a();
                        a(t2);
                        this.f1799e = t2;
                    } catch (Throwable th) {
                        if (!a.a.a.a.v0.m.l1.a.a(th)) {
                            if (this.f1799e == n.COMPUTING) {
                                this.f1799e = a.a.a.a.v0.o.n.a((Throwable) th);
                            }
                            ((f.a) this.f1797c.b).a(th);
                            throw null;
                        }
                        this.f1799e = n.NOT_COMPUTED;
                        throw th;
                    }
                }
                return t2;
            } finally {
                this.f1797c.f1790a.unlock();
            }
        }

        public void a(T t) {
        }
    }

    public static class j<T> extends h<T> implements g<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(b bVar, a.w.b.a<? extends T> aVar) {
            super(bVar, aVar);
            if (bVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // a.a.a.a.v0.l.b.h, a.w.b.a
        public T a() {
            T t = (T) super.a();
            if (t != null) {
                return t;
            }
            a(2);
            throw null;
        }
    }

    public static abstract class k<T> extends i<T> implements g<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(b bVar, a.w.b.a<? extends T> aVar) {
            super(bVar, aVar);
            if (bVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 2) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // a.a.a.a.v0.l.b.i, a.a.a.a.v0.l.b.h, a.w.b.a
        public T a() {
            T t = (T) super.a();
            if (t != null) {
                return t;
            }
            a(2);
            throw null;
        }
    }

    public static class m<K, V> extends l<K, V> implements d<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(b bVar, ConcurrentMap<K, Object> concurrentMap, a.w.b.l<? super K, ? extends V> lVar) {
            super(bVar, concurrentMap, lVar);
            if (bVar == null) {
                a(0);
                throw null;
            } else if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (lVar != null) {
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i != 3) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        @Override // a.w.b.l, a.a.a.a.v0.l.b.l
        public V a(K k) {
            V v = (V) super.a(k);
            if (v != null) {
                return v;
            }
            a(3);
            throw null;
        }
    }

    public enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class o<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f1808a;
        public final boolean b;

        public o(T t, boolean z) {
            this.f1808a = t;
            this.b = z;
        }

        public String toString() {
            if (this.b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.f1808a);
        }
    }

    static {
        String str;
        String canonicalName = b.class.getCanonicalName();
        if (canonicalName != null) {
            int b2 = a.a0.i.b((CharSequence) canonicalName, ".", 0, false, 6);
            if (b2 == -1) {
                str = "";
            } else {
                str = canonicalName.substring(0, b2);
                a.w.c.i.a((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            f1788d = str;
            return;
        }
        a.w.c.i.a("$this$substringBeforeLast");
        throw null;
    }

    public b(String str) {
        this(str, f.f1795a, new ReentrantLock());
    }

    public b(String str, f fVar, Lock lock) {
        if (str == null) {
            a(2);
            throw null;
        } else if (fVar == null) {
            a(3);
            throw null;
        } else if (lock != null) {
            this.f1790a = lock;
            this.b = fVar;
            this.f1791c = str;
        } else {
            a(4);
            throw null;
        }
    }

    public static <T extends Throwable> T a(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (!stackTrace[i3].getClassName().startsWith(f1788d)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i2, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            return t;
        }
        a(27);
        throw null;
    }

    public static /* synthetic */ void a(int i2) {
        String str = (i2 == 8 || i2 == 12 || i2 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 8 || i2 == 12 || i2 == 28) ? 2 : 3)];
        switch (i2) {
            case 1:
            case 3:
            case 6:
                objArr[0] = "exceptionHandlingStrategy";
                break;
            case 2:
            case 5:
            default:
                objArr[0] = "debugText";
                break;
            case 4:
                objArr[0] = "lock";
                break;
            case 7:
            case 9:
            case 11:
            case 13:
                objArr[0] = "compute";
                break;
            case 8:
            case 12:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                break;
            case 10:
            case 14:
                objArr[0] = "map";
                break;
            case 15:
            case 16:
            case 18:
            case 20:
            case 22:
            case 23:
            case 24:
            case 26:
                objArr[0] = "computable";
                break;
            case 17:
            case 19:
                objArr[0] = "onRecursiveCall";
                break;
            case 21:
            case 25:
                objArr[0] = "postCompute";
                break;
            case 27:
                objArr[0] = "throwable";
                break;
        }
        if (i2 == 8) {
            objArr[1] = "createMemoizedFunction";
        } else if (i2 == 12) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i2 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 5:
            case 6:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 7:
            case 9:
            case 10:
                objArr[2] = "createMemoizedFunction";
                break;
            case 8:
            case 12:
            case 28:
                break;
            case 11:
            case 13:
            case 14:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 15:
            case 16:
            case 17:
                objArr[2] = "createLazyValue";
                break;
            case 18:
            case 19:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case 20:
            case 21:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 22:
                objArr[2] = "createNullableLazyValue";
                break;
            case 23:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 24:
            case 25:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 26:
                objArr[2] = "compute";
                break;
            case 27:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 == 8 || i2 == 12 || i2 == 28) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static <K> ConcurrentMap<K, Object> c() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    @Override // a.a.a.a.v0.l.j
    public <K, V> a<K, V> a() {
        return new d(this, c(), null);
    }

    @Override // a.a.a.a.v0.l.j
    public <K, V> d<K, V> a(a.w.b.l<? super K, ? extends V> lVar) {
        if (lVar != null) {
            ConcurrentMap c2 = c();
            if (lVar != null) {
                return new m(this, c2, lVar);
            }
            a(9);
            throw null;
        }
        a(7);
        throw null;
    }

    @Override // a.a.a.a.v0.l.j
    public <T> g<T> a(a.w.b.a<? extends T> aVar) {
        if (aVar != null) {
            return new j(this, aVar);
        }
        a(15);
        throw null;
    }

    @Override // a.a.a.a.v0.l.j
    public <T> g<T> a(a.w.b.a<? extends T> aVar, a.w.b.l<? super Boolean, ? extends T> lVar, a.w.b.l<? super T, q> lVar2) {
        if (aVar == null) {
            a(20);
            throw null;
        } else if (lVar2 != null) {
            return new c(this, this, aVar, lVar, lVar2);
        } else {
            a(21);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.l.j
    public <T> g<T> a(a.w.b.a<? extends T> aVar, T t) {
        if (aVar == null) {
            a(18);
            throw null;
        } else if (t != null) {
            return new C0070b(this, this, aVar, t);
        } else {
            a(19);
            throw null;
        }
    }

    public <T> o<T> b() {
        IllegalStateException illegalStateException = new IllegalStateException("Recursive call in a lazy value under " + this);
        a(illegalStateException);
        throw illegalStateException;
    }

    @Override // a.a.a.a.v0.l.j
    public <K, V> e<K, V> b(a.w.b.l<? super K, ? extends V> lVar) {
        if (lVar != null) {
            ConcurrentMap c2 = c();
            if (lVar != null) {
                return new l(this, c2, lVar);
            }
            a(13);
            throw null;
        }
        a(11);
        throw null;
    }

    @Override // a.a.a.a.v0.l.j
    public <T> T b(a.w.b.a<? extends T> aVar) {
        if (aVar != null) {
            this.f1790a.lock();
            try {
                T t = (T) aVar.a();
                this.f1790a.unlock();
                return t;
            } catch (Throwable th) {
                this.f1790a.unlock();
                throw th;
            }
        } else {
            a(26);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.l.j
    public <T> h<T> c(a.w.b.a<? extends T> aVar) {
        if (aVar != null) {
            return new h(this, aVar);
        }
        a(22);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return e.a.a.a.a.a(sb, this.f1791c, ")");
    }

    public static abstract class i<T> extends h<T> {

        /* renamed from: f  reason: collision with root package name */
        public volatile i<T> f1800f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(b bVar, a.w.b.a<? extends T> aVar) {
            super(bVar, aVar);
            if (bVar == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
                this.f1800f = null;
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.l.b.h, a.w.b.a
        public T a() {
            i<T> iVar = this.f1800f;
            if (iVar != null) {
                boolean z = false;
                if (iVar.b == Thread.currentThread()) {
                    if (iVar.b == Thread.currentThread()) {
                        z = true;
                    }
                    if (z) {
                        return iVar.f1810a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return (T) super.a();
        }

        @Override // a.a.a.a.v0.l.b.h
        public final void a(T t) {
            this.f1800f = new i<>(t);
            try {
                c cVar = (c) this;
                if (t != null) {
                    cVar.f1794h.a(t);
                } else {
                    c.a(2);
                    throw null;
                }
            } finally {
                this.f1800f = null;
            }
        }
    }

    public static class l<K, V> implements e<K, V> {

        /* renamed from: c  reason: collision with root package name */
        public final b f1801c;

        /* renamed from: d  reason: collision with root package name */
        public final ConcurrentMap<K, Object> f1802d;

        /* renamed from: e  reason: collision with root package name */
        public final a.w.b.l<? super K, ? extends V> f1803e;

        public l(b bVar, ConcurrentMap<K, Object> concurrentMap, a.w.b.l<? super K, ? extends V> lVar) {
            if (bVar == null) {
                a(0);
                throw null;
            } else if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (lVar != null) {
                this.f1801c = bVar;
                this.f1802d = concurrentMap;
                this.f1803e = lVar;
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i == 3 || i == 4) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        @Override // a.w.b.l
        public V a(K k) {
            AssertionError th;
            AssertionError assertionError;
            Object obj = this.f1802d.get(k);
            if (obj != null && obj != n.COMPUTING) {
                return (V) a.a.a.a.v0.o.n.b(obj);
            }
            this.f1801c.f1790a.lock();
            try {
                Object obj2 = this.f1802d.get(k);
                if (obj2 == n.COMPUTING) {
                    AssertionError assertionError2 = new AssertionError("Recursion detected on input: " + ((Object) k) + " under " + this.f1801c);
                    b.a(assertionError2);
                    throw assertionError2;
                } else if (obj2 != null) {
                    return (V) a.a.a.a.v0.o.n.b(obj2);
                } else {
                    try {
                        this.f1802d.put(k, n.COMPUTING);
                        V v = (V) this.f1803e.a(k);
                        Object put = this.f1802d.put(k, a.a.a.a.v0.o.n.a((Object) v));
                        if (put == n.COMPUTING) {
                            this.f1801c.f1790a.unlock();
                            return v;
                        }
                        assertionError = a(k, put);
                        try {
                            throw assertionError;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        assertionError = null;
                        if (a.a.a.a.v0.m.l1.a.a(th)) {
                            this.f1802d.remove(k);
                            throw ((RuntimeException) th);
                        } else if (th != assertionError) {
                            Object put2 = this.f1802d.put(k, a.a.a.a.v0.o.n.a((Throwable) th));
                            if (put2 != n.COMPUTING) {
                                throw a(k, put2);
                            }
                            ((f.a) this.f1801c.b).a(th);
                            throw null;
                        } else {
                            ((f.a) this.f1801c.b).a(th);
                            throw null;
                        }
                    }
                }
            } finally {
                this.f1801c.f1790a.unlock();
            }
        }

        public final AssertionError a(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + ((Object) k) + ". Old value is " + obj + " under " + this.f1801c);
            b.a(assertionError);
            return assertionError;
        }
    }
}
