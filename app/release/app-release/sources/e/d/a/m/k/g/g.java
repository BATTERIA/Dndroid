package e.d.a.m.k.g;

import e.d.a.m.h.c;
import e.d.a.m.j.k;

public class g implements k<e.d.a.k.a, e.d.a.k.a> {
    /* Return type fixed from 'e.d.a.m.h.c' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, int] */
    @Override // e.d.a.m.j.k
    public c<e.d.a.k.a> a(e.d.a.k.a aVar, int i, int i2) {
        return new a(aVar);
    }

    public static class a implements c<e.d.a.k.a> {

        /* renamed from: a  reason: collision with root package name */
        public final e.d.a.k.a f4170a;

        public a(e.d.a.k.a aVar) {
            this.f4170a = aVar;
        }

        @Override // e.d.a.m.h.c
        public String a() {
            return String.valueOf(this.f4170a.i);
        }

        @Override // e.d.a.m.h.c
        public void b() {
        }

        @Override // e.d.a.m.h.c
        public void cancel() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // e.d.a.m.h.c
        public e.d.a.k.a a(e.d.a.g gVar) {
            return this.f4170a;
        }
    }
}
