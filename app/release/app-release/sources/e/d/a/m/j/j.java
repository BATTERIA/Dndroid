package e.d.a.m.j;

import e.d.a.s.e;
import e.d.a.s.h;
import java.util.Queue;

public class j<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final e<b<A>, B> f4069a;

    public class a extends e<b<A>, B> {
        public a(j jVar, int i) {
            super(i);
        }

        @Override // e.d.a.s.e
        public void a(Object obj, Object obj2) {
            b<?> bVar = (b) obj;
            if (bVar != null) {
                b.f4070d.offer(bVar);
                return;
            }
            throw null;
        }
    }

    public static final class b<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final Queue<b<?>> f4070d = h.a(0);

        /* renamed from: a  reason: collision with root package name */
        public int f4071a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public A f4072c;

        public static <A> b<A> a(A a2, int i, int i2) {
            b<A> bVar = (b<A>) f4070d.poll();
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.f4072c = a2;
            bVar.b = i;
            bVar.f4071a = i2;
            return bVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.f4071a == bVar.f4071a && this.f4072c.equals(bVar.f4072c);
        }

        public int hashCode() {
            return this.f4072c.hashCode() + (((this.f4071a * 31) + this.b) * 31);
        }
    }

    public j(int i) {
        this.f4069a = new a(this, i);
    }
}
