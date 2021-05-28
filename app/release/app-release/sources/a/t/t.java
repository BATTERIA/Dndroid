package a.t;

import a.w.c.i;
import a.w.c.w.d;
import a.y.c;
import e.a.a.a.a;
import e.f.a.g;
import java.util.AbstractList;
import java.util.List;

/* JADX WARN: Incorrect class signature, class is equals to this class: <T:Ljava/lang/Object;>La/t/t<TT;>; */
public final class t<T> extends AbstractList implements List, d {

    /* renamed from: c  reason: collision with root package name */
    public final List<T> f2126c;

    public t(List<T> list) {
        if (list != null) {
            this.f2126c = list;
        } else {
            i.a("delegate");
            throw null;
        }
    }

    @Override // java.util.List, java.util.AbstractList
    public void add(int i, T t) {
        List<T> list = this.f2126c;
        int size = size();
        if (i < 0 || size < i) {
            StringBuilder a2 = a.a("Position index ", i, " must be in range [");
            a2.append(new c(0, size()));
            a2.append("].");
            throw new IndexOutOfBoundsException(a2.toString());
        }
        list.add(size() - i, t);
    }

    public void clear() {
        this.f2126c.clear();
    }

    @Override // java.util.List, java.util.AbstractList
    public T get(int i) {
        return this.f2126c.get(g.a((List) this, i));
    }

    @Override // java.util.List, java.util.AbstractList
    public final Object remove(int i) {
        return this.f2126c.remove(g.a((List) this, i));
    }

    @Override // java.util.List, java.util.AbstractList
    public T set(int i, T t) {
        return this.f2126c.set(g.a((List) this, i), t);
    }

    public final int size() {
        return this.f2126c.size();
    }
}
