package a.z;

import a.g;
import a.w.b.l;
import a.w.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u0004BA\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\tH\u0002R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "iterator", "", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class f<T, R, E> implements h<E> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f2172a;
    public final l<T, R> b;

    /* renamed from: c  reason: collision with root package name */
    public final l<R, Iterator<E>> f2173c;

    public static final class a implements Iterator<E>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<T> f2174c;

        /* renamed from: d  reason: collision with root package name */
        public Iterator<? extends E> f2175d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ f f2176e;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(f fVar) {
            this.f2176e = fVar;
            this.f2174c = fVar.f2172a.iterator();
        }

        public final boolean a() {
            Iterator<? extends E> it = this.f2175d;
            if (it != null && !it.hasNext()) {
                this.f2175d = null;
            }
            while (true) {
                if (this.f2175d == null) {
                    if (this.f2174c.hasNext()) {
                        T next = this.f2174c.next();
                        f fVar = this.f2176e;
                        Iterator<E> a2 = fVar.f2173c.a(fVar.b.a(next));
                        if (a2.hasNext()) {
                            this.f2175d = a2;
                            break;
                        }
                    } else {
                        return false;
                    }
                } else {
                    break;
                }
            }
            return true;
        }

        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public E next() {
            if (a()) {
                Iterator<? extends E> it = this.f2175d;
                if (it != null) {
                    return (E) it.next();
                }
                i.a();
                throw null;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.z.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.l<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.w.b.l<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(h<? extends T> hVar, l<? super T, ? extends R> lVar, l<? super R, ? extends Iterator<? extends E>> lVar2) {
        if (hVar == 0) {
            i.a("sequence");
            throw null;
        } else if (lVar == 0) {
            i.a("transformer");
            throw null;
        } else if (lVar2 != 0) {
            this.f2172a = hVar;
            this.b = lVar;
            this.f2173c = lVar2;
        } else {
            i.a("iterator");
            throw null;
        }
    }

    @Override // a.z.h
    public Iterator<E> iterator() {
        return new a(this);
    }
}
