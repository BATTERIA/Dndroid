package d.d;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f3096f;

    /* renamed from: g  reason: collision with root package name */
    public static int f3097g;

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f3098h;
    public static int i;

    /* renamed from: c  reason: collision with root package name */
    public int[] f3099c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f3100d;

    /* renamed from: e  reason: collision with root package name */
    public int f3101e;

    public h() {
        this.f3099c = d.f3069a;
        this.f3100d = d.f3070c;
        this.f3101e = 0;
    }

    public h(int i2) {
        if (i2 == 0) {
            this.f3099c = d.f3069a;
            this.f3100d = d.f3070c;
        } else {
            a(i2);
        }
        this.f3101e = 0;
    }

    public static void a(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (i < 10) {
                    objArr[0] = f3098h;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3098h = objArr;
                    i++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (h.class) {
                if (f3097g < 10) {
                    objArr[0] = f3096f;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f3096f = objArr;
                    f3097g++;
                }
            }
        }
    }

    public int a(Object obj, int i2) {
        int i3 = this.f3101e;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f3099c, i3, i2);
            if (a2 < 0 || obj.equals(this.f3100d[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f3099c[i4] == i2) {
                if (obj.equals(this.f3100d[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            int i5 = a2 - 1;
            while (i5 >= 0 && this.f3099c[i5] == i2) {
                if (obj.equals(this.f3100d[i5 << 1])) {
                    return i5;
                }
                i5--;
            }
            return i4 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public V a(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f3100d;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (h.class) {
                if (f3098h != null) {
                    Object[] objArr = f3098h;
                    this.f3100d = objArr;
                    f3098h = (Object[]) objArr[0];
                    this.f3099c = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    i--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (h.class) {
                if (f3096f != null) {
                    Object[] objArr2 = f3096f;
                    this.f3100d = objArr2;
                    f3096f = (Object[]) objArr2[0];
                    this.f3099c = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3097g--;
                    return;
                }
            }
        }
        this.f3099c = new int[i2];
        this.f3100d = new Object[(i2 << 1)];
    }

    public int b(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public K b(int i2) {
        return (K) this.f3100d[i2 << 1];
    }

    public int c(Object obj) {
        int i2 = this.f3101e * 2;
        Object[] objArr = this.f3100d;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public V c(int i2) {
        Object[] objArr = this.f3100d;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f3101e;
        int i5 = 0;
        if (i4 <= 1) {
            a(this.f3099c, objArr, i4);
            this.f3099c = d.f3069a;
            this.f3100d = d.f3070c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f3099c;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int[] iArr2 = this.f3099c;
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr2, i8, iArr2, i2, i9);
                    Object[] objArr2 = this.f3100d;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i3, i9 << 1);
                }
                Object[] objArr3 = this.f3100d;
                int i10 = i6 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f3099c;
                Object[] objArr4 = this.f3100d;
                a(i7);
                if (i4 == this.f3101e) {
                    if (i2 > 0) {
                        System.arraycopy(iArr3, 0, this.f3099c, 0, i2);
                        System.arraycopy(objArr4, 0, this.f3100d, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr3, i11, this.f3099c, i2, i12);
                        System.arraycopy(objArr4, i11 << 1, this.f3100d, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f3101e) {
            this.f3101e = i5;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i2 = this.f3101e;
        if (i2 > 0) {
            int[] iArr = this.f3099c;
            Object[] objArr = this.f3100d;
            this.f3099c = d.f3069a;
            this.f3100d = d.f3070c;
            this.f3101e = 0;
            a(iArr, objArr, i2);
        }
        if (this.f3101e > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return b(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return c(obj) >= 0;
    }

    public V d(int i2) {
        return (V) this.f3100d[(i2 << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f3101e != hVar.f3101e) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3101e; i2++) {
                try {
                    K b = b(i2);
                    V d2 = d(i2);
                    Object obj2 = hVar.get(b);
                    if (d2 == null) {
                        if (obj2 != null || !hVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!d2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3101e != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f3101e; i3++) {
                try {
                    K b2 = b(i3);
                    V d3 = d(i3);
                    Object obj3 = map.get(b2);
                    if (d3 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int b = b(obj);
        return b >= 0 ? (V) this.f3100d[(b << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f3099c;
        Object[] objArr = this.f3100d;
        int i2 = this.f3101e;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public boolean isEmpty() {
        return this.f3101e <= 0;
    }

    public V put(K k, V v) {
        int i2;
        int i3;
        int i4 = this.f3101e;
        if (k == null) {
            i3 = a();
            i2 = 0;
        } else {
            int hashCode = k.hashCode();
            i2 = hashCode;
            i3 = a(k, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            Object[] objArr = this.f3100d;
            V v2 = (V) objArr[i5];
            objArr[i5] = v;
            return v2;
        }
        int i6 = i3 ^ -1;
        if (i4 >= this.f3099c.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            int[] iArr = this.f3099c;
            Object[] objArr2 = this.f3100d;
            a(i7);
            if (i4 == this.f3101e) {
                int[] iArr2 = this.f3099c;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f3100d, 0, objArr2.length);
                }
                a(iArr, objArr2, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f3099c;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f3100d;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f3101e - i6) << 1);
        }
        int i9 = this.f3101e;
        if (i4 == i9) {
            int[] iArr4 = this.f3099c;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr4 = this.f3100d;
                int i10 = i6 << 1;
                objArr4[i10] = k;
                objArr4[i10 + 1] = v;
                this.f3101e = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return c(b);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int b = b(obj);
        if (b < 0) {
            return false;
        }
        V d2 = d(b);
        if (obj2 != d2 && (obj2 == null || !obj2.equals(d2))) {
            return false;
        }
        c(b);
        return true;
    }

    public V replace(K k, V v) {
        int b = b(k);
        if (b >= 0) {
            return a(b, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int b = b(k);
        if (b < 0) {
            return false;
        }
        V d2 = d(b);
        if (d2 != v && (v == null || !v.equals(d2))) {
            return false;
        }
        a(b, v2);
        return true;
    }

    public int size() {
        return this.f3101e;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3101e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3101e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K b = b(i2);
            if (b != this) {
                sb.append((Object) b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V d2 = d(i2);
            if (d2 != this) {
                sb.append((Object) d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public int a() {
        int i2 = this.f3101e;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f3099c, i2, 0);
            if (a2 < 0 || this.f3100d[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f3099c[i3] == 0) {
                if (this.f3100d[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = a2 - 1;
            while (i4 >= 0 && this.f3099c[i4] == 0) {
                if (this.f3100d[i4 << 1] == null) {
                    return i4;
                }
                i4--;
            }
            return i3 ^ -1;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
