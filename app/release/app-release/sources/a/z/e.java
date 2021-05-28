package a.z;

import a.g;
import a.w.b.l;
import a.w.c.i;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "sequence", "sendWhen", "", "predicate", "Lkotlin/Function1;", "(Lkotlin/sequences/Sequence;ZLkotlin/jvm/functions/Function1;)V", "iterator", "", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class e<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final h<T> f2166a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final l<T, Boolean> f2167c;

    public static final class a implements Iterator<T>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public final Iterator<T> f2168c;

        /* renamed from: d  reason: collision with root package name */
        public int f2169d = -1;

        /* renamed from: e  reason: collision with root package name */
        public T f2170e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f2171f;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a(e eVar) {
            this.f2171f = eVar;
            this.f2168c = eVar.f2166a.iterator();
        }

        public final void a() {
            int i;
            while (true) {
                if (!this.f2168c.hasNext()) {
                    i = 0;
                    break;
                }
                T next = this.f2168c.next();
                if (this.f2171f.f2167c.a(next).booleanValue() == this.f2171f.b) {
                    this.f2170e = next;
                    i = 1;
                    break;
                }
            }
            this.f2169d = i;
        }

        public boolean hasNext() {
            if (this.f2169d == -1) {
                a();
            }
            return this.f2169d == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f2169d == -1) {
                a();
            }
            if (this.f2169d != 0) {
                T t = this.f2170e;
                this.f2170e = null;
                this.f2169d = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: a.z.h<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: a.w.b.l<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h<? extends T> hVar, boolean z, l<? super T, Boolean> lVar) {
        if (hVar == 0) {
            i.a("sequence");
            throw null;
        } else if (lVar != 0) {
            this.f2166a = hVar;
            this.b = z;
            this.f2167c = lVar;
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
