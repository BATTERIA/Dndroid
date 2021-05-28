package e.d.a.p;

import e.d.a.m.b;
import e.d.a.m.e;
import e.d.a.m.f;
import e.d.a.m.j.k;
import e.d.a.m.k.i.c;
import java.io.File;

public class a<A, T, Z, R> implements f<A, T, Z, R>, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public final f<A, T, Z, R> f4222c;

    /* renamed from: d  reason: collision with root package name */
    public e<T, Z> f4223d;

    /* renamed from: e  reason: collision with root package name */
    public b<T> f4224e;

    public a(f<A, T, Z, R> fVar) {
        this.f4222c = fVar;
    }

    @Override // e.d.a.p.b
    public e<File, Z> b() {
        return this.f4222c.b();
    }

    @Override // e.d.a.p.f
    public k<A, T> c() {
        return this.f4222c.c();
    }

    @Override // java.lang.Object
    public a<A, T, Z, R> clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.lang.Object
    /* renamed from: clone  reason: collision with other method in class */
    public Object m91clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // e.d.a.p.b
    public f<Z> d() {
        return this.f4222c.d();
    }

    @Override // e.d.a.p.b
    public b<T> e() {
        b<T> bVar = this.f4224e;
        return bVar != null ? bVar : this.f4222c.e();
    }

    @Override // e.d.a.p.f
    public c<Z, R> f() {
        return this.f4222c.f();
    }

    @Override // e.d.a.p.b
    public e<T, Z> g() {
        e<T, Z> eVar = this.f4223d;
        return eVar != null ? eVar : this.f4222c.g();
    }
}
