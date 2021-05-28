package a.a.a.a.v0.o;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public class l<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    public int f2010c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2011d;

    public static class b<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f2012c = new b();

        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    public class c extends d<E> {

        /* renamed from: d  reason: collision with root package name */
        public final int f2013d;

        public c() {
            super(null);
            this.f2013d = ((AbstractList) l.this).modCount;
        }

        @Override // a.a.a.a.v0.o.l.d
        public void a() {
            if (((AbstractList) l.this).modCount != this.f2013d) {
                StringBuilder a2 = e.a.a.a.a.a("ModCount: ");
                a2.append(((AbstractList) l.this).modCount);
                a2.append("; expected: ");
                a2.append(this.f2013d);
                throw new ConcurrentModificationException(a2.toString());
            }
        }

        public void remove() {
            a();
            l.this.clear();
        }
    }

    public static abstract class d<T> implements Iterator<T> {

        /* renamed from: c  reason: collision with root package name */
        public boolean f2015c;

        public /* synthetic */ d(a aVar) {
        }

        public abstract void a();

        public final boolean hasNext() {
            return !this.f2015c;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f2015c) {
                this.f2015c = true;
                a();
                return (T) l.this.f2011d;
            }
            throw new NoSuchElementException();
        }
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, E e2) {
        int i2;
        if (i < 0 || i > (i2 = this.f2010c)) {
            StringBuilder a2 = e.a.a.a.a.a("Index: ", i, ", Size: ");
            a2.append(this.f2010c);
            throw new IndexOutOfBoundsException(a2.toString());
        }
        if (i2 == 0) {
            this.f2011d = e2;
        } else if (i2 == 1 && i == 0) {
            this.f2011d = new Object[]{e2, this.f2011d};
        } else {
            int i3 = this.f2010c;
            Object[] objArr = new Object[(i3 + 1)];
            if (i3 == 1) {
                objArr[0] = this.f2011d;
            } else {
                Object[] objArr2 = (Object[]) this.f2011d;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f2010c - i);
            }
            objArr[i] = e2;
            this.f2011d = objArr;
        }
        this.f2010c++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public boolean add(E e2) {
        int i = this.f2010c;
        if (i == 0) {
            this.f2011d = e2;
        } else if (i == 1) {
            this.f2011d = new Object[]{this.f2011d, e2};
        } else {
            Object[] objArr = (Object[]) this.f2011d;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                Object[] objArr2 = new Object[i2];
                this.f2011d = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f2010c] = e2;
        }
        this.f2010c++;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void clear() {
        this.f2011d = null;
        this.f2010c = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f2010c)) {
            return i2 == 1 ? (E) this.f2011d : (E) ((Object[]) this.f2011d)[i];
        }
        StringBuilder a2 = e.a.a.a.a.a("Index: ", i, ", Size: ");
        a2.append(this.f2010c);
        throw new IndexOutOfBoundsException(a2.toString());
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public Iterator<E> iterator() {
        int i = this.f2010c;
        if (i == 0) {
            return b.f2012c;
        }
        if (i == 1) {
            return new c();
        }
        Iterator<E> it = super.iterator();
        if (it != null) {
            return it;
        }
        b(3);
        throw null;
    }

    @Override // java.util.List, java.util.AbstractList
    public E remove(int i) {
        int i2;
        E e2;
        if (i < 0 || i >= (i2 = this.f2010c)) {
            StringBuilder a2 = e.a.a.a.a.a("Index: ", i, ", Size: ");
            a2.append(this.f2010c);
            throw new IndexOutOfBoundsException(a2.toString());
        }
        if (i2 == 1) {
            e2 = (E) this.f2011d;
            this.f2011d = null;
        } else {
            Object[] objArr = (Object[]) this.f2011d;
            Object obj = objArr[i];
            if (i2 == 2) {
                this.f2011d = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f2010c - 1] = null;
            }
            e2 = (E) obj;
        }
        this.f2010c--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.List, java.util.AbstractList
    public E set(int i, E e2) {
        int i2;
        if (i < 0 || i >= (i2 = this.f2010c)) {
            StringBuilder a2 = e.a.a.a.a.a("Index: ", i, ", Size: ");
            a2.append(this.f2010c);
            throw new IndexOutOfBoundsException(a2.toString());
        } else if (i2 == 1) {
            E e3 = (E) this.f2011d;
            this.f2011d = e2;
            return e3;
        } else {
            Object[] objArr = (Object[]) this.f2011d;
            E e4 = (E) objArr[i];
            objArr[i] = e2;
            return e4;
        }
    }

    public int size() {
        return this.f2010c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T[] */
    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        if (tArr != 0) {
            int length = tArr.length;
            int i = this.f2010c;
            if (i == 1) {
                if (length != 0) {
                    tArr[0] = this.f2011d;
                } else {
                    T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                    tArr2[0] = this.f2011d;
                    return tArr2;
                }
            } else if (length < i) {
                T[] tArr3 = (T[]) Arrays.copyOf((Object[]) this.f2011d, i, tArr.getClass());
                if (tArr3 != null) {
                    return tArr3;
                }
                b(6);
                throw null;
            } else if (i != 0) {
                System.arraycopy(this.f2011d, 0, tArr, 0, i);
            }
            int i2 = this.f2010c;
            if (length > i2) {
                tArr[i2] = 0;
            }
            return tArr;
        }
        b(4);
        throw null;
    }
}
