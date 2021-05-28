package a.a.a.a.v0.h;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class n extends AbstractList<String> implements RandomAccess, o {

    /* renamed from: d  reason: collision with root package name */
    public static final o f1412d = new w(new n());

    /* renamed from: c  reason: collision with root package name */
    public final List<Object> f1413c;

    public n() {
        this.f1413c = new ArrayList();
    }

    public n(o oVar) {
        this.f1413c = new ArrayList(oVar.size());
        addAll(size(), oVar);
    }

    public static String a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).h() : j.a((byte[]) obj);
    }

    @Override // a.a.a.a.v0.h.o
    public d a(int i) {
        Object obj = this.f1413c.get(i);
        d b = obj instanceof d ? (d) obj : obj instanceof String ? d.b((String) obj) : d.a((byte[]) obj);
        if (b != obj) {
            this.f1413c.set(i, b);
        }
        return b;
    }

    @Override // a.a.a.a.v0.h.o
    public void a(d dVar) {
        this.f1413c.add(dVar);
        ((AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList
    public void add(int i, String str) {
        this.f1413c.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, java.util.AbstractList
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof o) {
            collection = ((o) collection).f();
        }
        boolean addAll = this.f1413c.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // a.a.a.a.v0.h.o
    public o b() {
        return new w(this);
    }

    public void clear() {
        this.f1413c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // a.a.a.a.v0.h.o
    public List<?> f() {
        return Collections.unmodifiableList(this.f1413c);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0.d() != false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (e.f.a.g.b(r0, 0, r0.length) != false) goto L_0x002c;
     */
    @Override // java.util.List, java.util.AbstractList
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String get(int r5) {
        /*
            r4 = this;
            java.util.List<java.lang.Object> r0 = r4.f1413c
            java.lang.Object r0 = r0.get(r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x000d
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0032
        L_0x000d:
            boolean r1 = r0 instanceof a.a.a.a.v0.h.d
            if (r1 == 0) goto L_0x001e
            a.a.a.a.v0.h.d r0 = (a.a.a.a.v0.h.d) r0
            java.lang.String r1 = r0.h()
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0031
            goto L_0x002c
        L_0x001e:
            byte[] r0 = (byte[]) r0
            java.lang.String r1 = a.a.a.a.v0.h.j.a(r0)
            int r2 = r0.length
            r3 = 0
            boolean r0 = e.f.a.g.b(r0, r3, r2)
            if (r0 == 0) goto L_0x0031
        L_0x002c:
            java.util.List<java.lang.Object> r0 = r4.f1413c
            r0.set(r5, r1)
        L_0x0031:
            r0 = r1
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.n.get(int):java.lang.Object");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public String remove(int i) {
        Object remove = this.f1413c.remove(i);
        ((AbstractList) this).modCount++;
        return a(remove);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList
    public String set(int i, String str) {
        return a(this.f1413c.set(i, str));
    }

    public int size() {
        return this.f1413c.size();
    }
}
