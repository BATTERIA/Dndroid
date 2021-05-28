package d.d;

import java.util.Map;

public class b extends g<E, E> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f3062d;

    public b(c cVar) {
        this.f3062d = cVar;
    }

    @Override // d.d.g
    public int a(Object obj) {
        return this.f3062d.indexOf(obj);
    }

    @Override // d.d.g
    public Object a(int i, int i2) {
        return this.f3062d.f3066d[i];
    }

    @Override // d.d.g
    public E a(int i, E e2) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // d.d.g
    public void a() {
        this.f3062d.clear();
    }

    @Override // d.d.g
    public void a(int i) {
        this.f3062d.c(i);
    }

    @Override // d.d.g
    public void a(E e2, E e3) {
        this.f3062d.add(e2);
    }

    @Override // d.d.g
    public int b(Object obj) {
        return this.f3062d.indexOf(obj);
    }

    @Override // d.d.g
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // d.d.g
    public int c() {
        return this.f3062d.f3067e;
    }
}
