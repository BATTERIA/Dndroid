package a.z;

import a.g;
import a.w.b.l;
import a.w.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/sequences/TakeWhileSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class p<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f2188a;
    public final l<T, Boolean> b;

    public static final class a implements Iterator<T>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<T> f2189c;

        /* renamed from: d  reason: collision with root package name */
        public int f2190d = -1;

        /* renamed from: e  reason: collision with root package name */
        public T f2191e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p f2192f;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(p pVar) {
            this.f2192f = pVar;
            this.f2189c = pVar.f2188a.iterator();
        }

        public final void a() {
            if (this.f2189c.hasNext()) {
                T next = this.f2189c.next();
                if (this.f2192f.b.a(next).booleanValue()) {
                    this.f2190d = 1;
                    this.f2191e = next;
                    return;
                }
            }
            this.f2190d = 0;
        }

        public boolean hasNext() {
            if (this.f2190d == -1) {
                a();
            }
            return this.f2190d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f2190d == -1) {
                a();
            }
            if (this.f2190d != 0) {
                T t = this.f2191e;
                this.f2191e = null;
                this.f2190d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.z.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.l<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public p(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        if (hVar == 0) {
            i.a("sequence");
            throw null;
        } else if (lVar != 0) {
            this.f2188a = hVar;
            this.b = lVar;
        } else {
            i.a("predicate");
            throw null;
        }
    }

    @Override // a.z.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}
