package a.t;

import a.z.h;
import java.util.Iterator;

public final class g implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object[] f2114a;

    public g(Object[] objArr) {
        this.f2114a = objArr;
    }

    @Override // a.z.h
    public Iterator<T> iterator() {
        return e.f.a.g.e(this.f2114a);
    }
}
