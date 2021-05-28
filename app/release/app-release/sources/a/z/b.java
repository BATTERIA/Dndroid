package a.z;

import a.g;
import a.w.c.i;
import java.util.Iterator;

@g(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "sequence", "count", "", "(Lkotlin/sequences/Sequence;I)V", "drop", "n", "iterator", "", "take", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class b<T> implements h<T>, c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f2162a;
    public final int b;

    public static final class a implements Iterator<T>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<T> f2163c;

        /* renamed from: d  reason: collision with root package name */
        public int f2164d;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(b bVar) {
            this.f2163c = bVar.f2162a.iterator();
            this.f2164d = bVar.b;
        }

        public final void a() {
            while (this.f2164d > 0 && this.f2163c.hasNext()) {
                this.f2163c.next();
                this.f2164d--;
            }
        }

        public boolean hasNext() {
            a();
            return this.f2163c.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f2163c.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.z.h<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(h<? extends T> hVar, int i) {
        if (hVar != 0) {
            this.f2162a = hVar;
            this.b = i;
            if (!(i >= 0)) {
                StringBuilder a2 = e.a.a.a.a.a("count must be non-negative, but was ");
                a2.append(this.b);
                a2.append('.');
                throw new IllegalArgumentException(a2.toString().toString());
            }
            return;
        }
        i.a("sequence");
        throw null;
    }

    @Override // a.z.c
    public h<T> a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new b(this, i) : new b(this.f2162a, i2);
    }

    @Override // a.z.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}
