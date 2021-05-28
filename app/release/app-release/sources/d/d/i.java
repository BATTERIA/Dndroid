package d.d;

public class i<E> implements Cloneable {

    /* renamed from: g  reason: collision with root package name */
    public static final Object f3102g = new Object();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3103c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f3104d;

    /* renamed from: e  reason: collision with root package name */
    public Object[] f3105e;

    /* renamed from: f  reason: collision with root package name */
    public int f3106f;

    public i() {
        this(10);
    }

    public i(int i) {
        this.f3103c = false;
        if (i == 0) {
            this.f3104d = d.f3069a;
            this.f3105e = d.f3070c;
            return;
        }
        int b = d.b(i);
        this.f3104d = new int[b];
        this.f3105e = new Object[b];
    }

    public E a(int i) {
        return b(i, null);
    }

    public void a(int i, E e2) {
        int i2 = this.f3106f;
        if (i2 == 0 || i > this.f3104d[i2 - 1]) {
            if (this.f3103c && this.f3106f >= this.f3104d.length) {
                b();
            }
            int i3 = this.f3106f;
            if (i3 >= this.f3104d.length) {
                int b = d.b(i3 + 1);
                int[] iArr = new int[b];
                Object[] objArr = new Object[b];
                int[] iArr2 = this.f3104d;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3105e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3104d = iArr;
                this.f3105e = objArr;
            }
            this.f3104d[i3] = i;
            this.f3105e[i3] = e2;
            this.f3106f = i3 + 1;
            return;
        }
        c(i, e2);
    }

    public int b(int i) {
        if (this.f3103c) {
            b();
        }
        return this.f3104d[i];
    }

    public E b(int i, E e2) {
        int a2 = d.a(this.f3104d, this.f3106f, i);
        if (a2 >= 0) {
            Object[] objArr = this.f3105e;
            if (objArr[a2] != f3102g) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public final void b() {
        int i = this.f3106f;
        int[] iArr = this.f3104d;
        Object[] objArr = this.f3105e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3102g) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3103c = false;
        this.f3106f = i2;
    }

    public int c() {
        if (this.f3103c) {
            b();
        }
        return this.f3106f;
    }

    public void c(int i) {
        Object[] objArr;
        Object obj;
        int a2 = d.a(this.f3104d, this.f3106f, i);
        if (a2 >= 0 && (objArr = this.f3105e)[a2] != (obj = f3102g)) {
            objArr[a2] = obj;
            this.f3103c = true;
        }
    }

    public void c(int i, E e2) {
        int a2 = d.a(this.f3104d, this.f3106f, i);
        if (a2 >= 0) {
            this.f3105e[a2] = e2;
            return;
        }
        int i2 = a2 ^ -1;
        if (i2 < this.f3106f) {
            Object[] objArr = this.f3105e;
            if (objArr[i2] == f3102g) {
                this.f3104d[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f3103c && this.f3106f >= this.f3104d.length) {
            b();
            i2 = d.a(this.f3104d, this.f3106f, i) ^ -1;
        }
        int i3 = this.f3106f;
        if (i3 >= this.f3104d.length) {
            int b = d.b(i3 + 1);
            int[] iArr = new int[b];
            Object[] objArr2 = new Object[b];
            int[] iArr2 = this.f3104d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3105e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3104d = iArr;
            this.f3105e = objArr2;
        }
        int i4 = this.f3106f;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f3104d;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.f3105e;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f3106f - i2);
        }
        this.f3104d[i2] = i;
        this.f3105e[i2] = e2;
        this.f3106f++;
    }

    @Override // java.lang.Object
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f3104d = (int[]) this.f3104d.clone();
            iVar.f3105e = (Object[]) this.f3105e.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E d(int i) {
        if (this.f3103c) {
            b();
        }
        return (E) this.f3105e[i];
    }

    public String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3106f * 28);
        sb.append('{');
        for (int i = 0; i < this.f3106f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
            sb.append('=');
            E d2 = d(i);
            if (d2 != this) {
                sb.append((Object) d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
