package a.z;

import a.g;
import a.w.b.l;
import a.w.c.i;
import java.util.Iterator;

@g(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J3\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\t0\u0003\"\u0004\b\u0002\u0010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u000b0\u0006H\u0000¢\u0006\u0002\b\fJ\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlin/sequences/TransformingSequence;", "T", "R", "Lkotlin/sequences/Sequence;", "sequence", "transformer", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "flatten", "E", "iterator", "", "flatten$kotlin_stdlib", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class q<T, R> implements h<R> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f2193a;
    public final l<T, R> b;

    public static final class a implements Iterator<R>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<T> f2194c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ q f2195d;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(q qVar) {
            this.f2195d = qVar;
            this.f2194c = qVar.f2193a.iterator();
        }

        public boolean hasNext() {
            return this.f2194c.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return this.f2195d.b.a(this.f2194c.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.z.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.w.b.l<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public q(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        if (hVar == 0) {
            i.a("sequence");
            throw null;
        } else if (lVar != 0) {
            this.f2193a = hVar;
            this.b = lVar;
        } else {
            i.a("transformer");
            throw null;
        }
    }

    @Override // a.z.h
    public Iterator<R> iterator() {
        return new a(this);
    }
}
