package a.t;

import a.w.b.a;
import java.util.Iterator;

public final class j extends a.w.c.j implements a<Iterator<? extends T>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterable f2117c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Iterable iterable) {
        super(0);
        this.f2117c = iterable;
    }

    @Override // a.w.b.a
    public Object a() {
        return this.f2117c.iterator();
    }
}
