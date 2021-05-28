package d.d;

import d.d.g;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f3063g = new int[0];

    /* renamed from: h  reason: collision with root package name */
    public static final Object[] f3064h = new Object[0];
    public static Object[] i;
    public static int j;
    public static Object[] k;
    public static int l;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3065c = f3063g;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f3066d = f3064h;

    /* renamed from: e  reason: collision with root package name */
    public int f3067e = 0;

    /* renamed from: f  reason: collision with root package name */
    public g<E, E> f3068f;

    public static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (l < 10) {
                    objArr[0] = k;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    k = objArr;
                    l++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (j < 10) {
                    objArr[0] = i;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    i = objArr;
                    j++;
                }
            }
        }
    }

    public final int a() {
        int i2 = this.f3067e;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f3065c, i2, 0);
        if (a2 < 0 || this.f3066d[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f3065c[i3] == 0) {
            if (this.f3066d[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f3065c[i4] == 0) {
            if (this.f3066d[i4] == null) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    public final int a(Object obj, int i2) {
        int i3 = this.f3067e;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f3065c, i3, i2);
        if (a2 < 0 || obj.equals(this.f3066d[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f3065c[i4] == i2) {
            if (obj.equals(this.f3066d[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f3065c[i5] == i2) {
            if (obj.equals(this.f3066d[i5])) {
                return i5;
            }
            i5--;
        }
        return i4 ^ -1;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = a();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = a(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = i3 ^ -1;
        int i5 = this.f3067e;
        if (i5 >= this.f3065c.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            int[] iArr = this.f3065c;
            Object[] objArr = this.f3066d;
            b(i6);
            int[] iArr2 = this.f3065c;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3066d, 0, objArr.length);
            }
            a(iArr, objArr, this.f3067e);
        }
        int i7 = this.f3067e;
        if (i4 < i7) {
            int[] iArr3 = this.f3065c;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f3066d;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f3067e - i4);
        }
        this.f3065c[i4] = i2;
        this.f3066d[i4] = e2;
        this.f3067e++;
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: d.d.c<E> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f3067e;
        int[] iArr = this.f3065c;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3066d;
            b(size);
            int i2 = this.f3067e;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3065c, 0, i2);
                System.arraycopy(objArr, 0, this.f3066d, 0, this.f3067e);
            }
            a(iArr, objArr, this.f3067e);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public final void b(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                if (k != null) {
                    Object[] objArr = k;
                    this.f3066d = objArr;
                    k = (Object[]) objArr[0];
                    this.f3065c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    l--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                if (i != null) {
                    Object[] objArr2 = i;
                    this.f3066d = objArr2;
                    i = (Object[]) objArr2[0];
                    this.f3065c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    j--;
                    return;
                }
            }
        }
        this.f3065c = new int[i2];
        this.f3066d = new Object[i2];
    }

    public E c(int i2) {
        Object[] objArr = this.f3066d;
        E e2 = (E) objArr[i2];
        int i3 = this.f3067e;
        if (i3 <= 1) {
            a(this.f3065c, objArr, i3);
            this.f3065c = f3063g;
            this.f3066d = f3064h;
            this.f3067e = 0;
        } else {
            int[] iArr = this.f3065c;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = this.f3067e - 1;
                this.f3067e = i5;
                if (i2 < i5) {
                    int[] iArr2 = this.f3065c;
                    int i6 = i2 + 1;
                    System.arraycopy(iArr2, i6, iArr2, i2, i5 - i2);
                    Object[] objArr2 = this.f3066d;
                    System.arraycopy(objArr2, i6, objArr2, i2, this.f3067e - i2);
                }
                this.f3066d[this.f3067e] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.f3065c;
                Object[] objArr3 = this.f3066d;
                b(i4);
                this.f3067e--;
                if (i2 > 0) {
                    System.arraycopy(iArr3, 0, this.f3065c, 0, i2);
                    System.arraycopy(objArr3, 0, this.f3066d, 0, i2);
                }
                int i7 = this.f3067e;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr3, i8, this.f3065c, i2, i7 - i2);
                    System.arraycopy(objArr3, i8, this.f3066d, i2, this.f3067e - i2);
                }
            }
        }
        return e2;
    }

    public void clear() {
        int i2 = this.f3067e;
        if (i2 != 0) {
            a(this.f3065c, this.f3066d, i2);
            this.f3065c = f3063g;
            this.f3066d = f3064h;
            this.f3067e = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3067e != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3067e; i2++) {
                try {
                    if (!set.contains(this.f3066d[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f3065c;
        int i2 = this.f3067e;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f3067e <= 0;
    }

    @Override // java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.f3068f == null) {
            this.f3068f = new b(this);
        }
        g<E, E> gVar = this.f3068f;
        if (gVar.b == null) {
            gVar.b = new g.c();
        }
        return gVar.b.iterator();
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        c(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f3067e - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3066d[i2])) {
                c(i2);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f3067e;
    }

    public Object[] toArray() {
        int i2 = this.f3067e;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3066d, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3067e) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3067e));
        }
        System.arraycopy(this.f3066d, 0, tArr, 0, this.f3067e);
        int length = tArr.length;
        int i2 = this.f3067e;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3067e * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3067e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3066d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
