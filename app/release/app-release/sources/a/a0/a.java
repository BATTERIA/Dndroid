package a.a0;

import a.g;
import a.j;
import a.n;
import a.w.b.p;
import a.w.c.i;
import a.y.c;
import a.z.h;
import java.util.Iterator;
import java.util.NoSuchElementException;

@g(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mv = {1, 1, 16})
public final class a implements h<c> {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f2058a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2059c;

    /* renamed from: d  reason: collision with root package name */
    public final p<CharSequence, Integer, j<Integer, Integer>> f2060d;

    /* renamed from: a.a0.a$a  reason: collision with other inner class name */
    public static final class C0077a implements Iterator<c>, a.w.c.w.a {

        /* renamed from: c  reason: collision with root package name */
        public int f2061c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f2062d;

        /* renamed from: e  reason: collision with root package name */
        public int f2063e;

        /* renamed from: f  reason: collision with root package name */
        public c f2064f;

        /* renamed from: g  reason: collision with root package name */
        public int f2065g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ a f2066h;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C0077a(a aVar) {
            this.f2066h = aVar;
            int i = aVar.b;
            int length = aVar.f2058a.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.f2062d = i;
                this.f2063e = i;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum " + 0 + '.');
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r4 < r0) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
            // Method dump skipped, instructions count: 129
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a0.a.C0077a.a():void");
        }

        public boolean hasNext() {
            if (this.f2061c == -1) {
                a();
            }
            return this.f2061c == 1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public c next() {
            if (this.f2061c == -1) {
                a();
            }
            if (this.f2061c != 0) {
                c cVar = this.f2064f;
                if (cVar != null) {
                    this.f2064f = null;
                    this.f2061c = -1;
                    return cVar;
                }
                throw new n("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: a.w.b.p<? super java.lang.CharSequence, ? super java.lang.Integer, a.j<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(CharSequence charSequence, int i, int i2, p<? super CharSequence, ? super Integer, j<Integer, Integer>> pVar) {
        if (charSequence == null) {
            i.a("input");
            throw null;
        } else if (pVar != 0) {
            this.f2058a = charSequence;
            this.b = i;
            this.f2059c = i2;
            this.f2060d = pVar;
        } else {
            i.a("getNextMatch");
            throw null;
        }
    }

    @Override // a.z.h
    public Iterator<c> iterator() {
        return new C0077a(this);
    }
}
