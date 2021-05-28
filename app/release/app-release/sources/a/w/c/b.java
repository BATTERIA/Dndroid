package a.w.c;

import a.a.e;
import java.io.Serializable;

public abstract class b implements a.a.b, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f2131e = a.f2134c;

    /* renamed from: c  reason: collision with root package name */
    public transient a.a.b f2132c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2133d;

    public static class a implements Serializable {

        /* renamed from: c  reason: collision with root package name */
        public static final a f2134c = new a();
    }

    public b() {
        this.f2133d = f2131e;
    }

    public b(Object obj) {
        this.f2133d = obj;
    }

    public a.a.b a() {
        a.a.b bVar = this.f2132c;
        if (bVar != null) {
            return bVar;
        }
        a.a.b b = b();
        this.f2132c = b;
        return b;
    }

    @Override // a.a.b
    public Object a(Object... objArr) {
        return e().a(objArr);
    }

    public abstract a.a.b b();

    public e c() {
        throw new AbstractMethodError();
    }

    @Override // a.a.b
    public String d() {
        throw new AbstractMethodError();
    }

    public a.a.b e() {
        a.a.b a2 = a();
        if (a2 != this) {
            return a2;
        }
        throw new a.w.a();
    }

    public String f() {
        throw new AbstractMethodError();
    }
}
