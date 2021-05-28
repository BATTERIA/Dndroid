package a.z;

import a.n;
import a.w.b.l;
import a.w.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

@a.g(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/GeneratorSequence;", "T", "", "Lkotlin/sequences/Sequence;", "getInitialValue", "Lkotlin/Function0;", "getNextValue", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class g<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a.w.b.a<T> f2177a;
    public final l<T, T> b;

    public static final class a implements Iterator<T>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public T f2178c;

        /* renamed from: d  reason: collision with root package name */
        public int f2179d = -2;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ g f2180e;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(g gVar) {
            this.f2180e = gVar;
        }

        public final void a() {
            T t;
            if (this.f2179d == -2) {
                t = this.f2180e.f2177a.a();
            } else {
                l<T, T> lVar = this.f2180e.b;
                T t2 = this.f2178c;
                if (t2 != null) {
                    t = lVar.a(t2);
                } else {
                    i.a();
                    throw null;
                }
            }
            this.f2178c = t;
            this.f2179d = t == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.f2179d < 0) {
                a();
            }
            return this.f2179d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f2179d < 0) {
                a();
            }
            if (this.f2179d != 0) {
                T t = this.f2178c;
                if (t != null) {
                    this.f2179d = -1;
                    return t;
                }
                throw new n("null cannot be cast to non-null type T");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.w.b.a<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.l<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public g(a.w.b.a<? extends T> aVar, l<? super T, ? extends T> lVar) {
        if (aVar == 0) {
            i.a("getInitialValue");
            throw null;
        } else if (lVar != 0) {
            this.f2177a = aVar;
            this.b = lVar;
        } else {
            i.a("getNextValue");
            throw null;
        }
    }

    @Override // a.z.h
    public Iterator<T> iterator() {
        return new a(this);
    }
}
