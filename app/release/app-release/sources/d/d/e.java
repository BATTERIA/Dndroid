package d.d;

public class e<E> implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3071g = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3072c = false;

    /* renamed from: d  reason: collision with root package name */
    public long[] f3073d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f3074e;

    /* renamed from: f  reason: collision with root package name */
    public int f3075f;

    public e() {
        int c2 = d.c(10);
        this.f3073d = new long[c2];
        this.f3074e = new Object[c2];
    }

    public E a(int i) {
        if (this.f3072c) {
            c();
        }
        return (E) this.f3074e[i];
    }

    public E a(long j) {
        return b(j, null);
    }

    public void a(long j, E e2) {
        int i = this.f3075f;
        if (i == 0 || j > this.f3073d[i - 1]) {
            if (this.f3072c && this.f3075f >= this.f3073d.length) {
                c();
            }
            int i2 = this.f3075f;
            if (i2 >= this.f3073d.length) {
                int c2 = d.c(i2 + 1);
                long[] jArr = new long[c2];
                Object[] objArr = new Object[c2];
                long[] jArr2 = this.f3073d;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f3074e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3073d = jArr;
                this.f3074e = objArr;
            }
            this.f3073d[i2] = j;
            this.f3074e[i2] = e2;
            this.f3075f = i2 + 1;
            return;
        }
        c(j, e2);
    }

    public E b(long j, E e2) {
        int a2 = d.a(this.f3073d, this.f3075f, j);
        if (a2 >= 0) {
            Object[] objArr = this.f3074e;
            if (objArr[a2] != f3071g) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public void b() {
        int i = this.f3075f;
        Object[] objArr = this.f3074e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3075f = 0;
        this.f3072c = false;
    }

    public void b(long j) {
        Object[] objArr;
        Object obj;
        int a2 = d.a(this.f3073d, this.f3075f, j);
        if (a2 >= 0 && (objArr = this.f3074e)[a2] != (obj = f3071g)) {
            objArr[a2] = obj;
            this.f3072c = true;
        }
    }

    public final void c() {
        int i = this.f3075f;
        long[] jArr = this.f3073d;
        Object[] objArr = this.f3074e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3071g) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3072c = false;
        this.f3075f = i2;
    }

    public void c(long j, E e2) {
        int a2 = d.a(this.f3073d, this.f3075f, j);
        if (a2 >= 0) {
            this.f3074e[a2] = e2;
            return;
        }
        int i = a2 ^ -1;
        if (i < this.f3075f) {
            Object[] objArr = this.f3074e;
            if (objArr[i] == f3071g) {
                this.f3073d[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f3072c && this.f3075f >= this.f3073d.length) {
            c();
            i = d.a(this.f3073d, this.f3075f, j) ^ -1;
        }
        int i2 = this.f3075f;
        if (i2 >= this.f3073d.length) {
            int c2 = d.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f3073d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3074e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3073d = jArr;
            this.f3074e = objArr2;
        }
        int i3 = this.f3075f;
        if (i3 - i != 0) {
            long[] jArr3 = this.f3073d;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.f3074e;
            System.arraycopy(objArr4, i, objArr4, i4, this.f3075f - i);
        }
        this.f3073d[i] = j;
        this.f3074e[i] = e2;
        this.f3075f++;
    }

    @Override // java.lang.Object
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f3073d = (long[]) this.f3073d.clone();
            eVar.f3074e = (Object[]) this.f3074e.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public int d() {
        if (this.f3072c) {
            c();
        }
        return this.f3075f;
    }

    public String toString() {
        if (d() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3075f * 28);
        sb.append('{');
        for (int i = 0; i < this.f3075f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f3072c) {
                c();
            }
            sb.append(this.f3073d[i]);
            sb.append('=');
            E a2 = a(i);
            if (a2 != this) {
                sb.append((Object) a2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
