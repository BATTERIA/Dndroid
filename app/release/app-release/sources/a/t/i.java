package a.t;

import a.z.h;
import java.util.Iterator;

public final class i implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Iterable f2116a;

    public i(Iterable iterable) {
        this.f2116a = iterable;
    }

    @Override // a.z.h
    public Iterator<T> iterator() {
        return this.f2116a.iterator();
    }
}
