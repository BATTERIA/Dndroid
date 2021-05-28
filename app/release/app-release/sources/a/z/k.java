package a.z;

import a.w.b.a;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;

public final class k extends j implements l<T, T> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f2183c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar) {
        super(1);
        this.f2183c = aVar;
    }

    @Override // a.w.b.l
    public final T a(T t) {
        if (t != null) {
            return (T) this.f2183c.a();
        }
        i.a("it");
        throw null;
    }
}
