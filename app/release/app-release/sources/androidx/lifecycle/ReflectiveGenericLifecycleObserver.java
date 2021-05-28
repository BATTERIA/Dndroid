package androidx.lifecycle;

import d.l.a;
import d.l.e;
import d.l.f;
import d.l.h;

public class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2420a;
    public final a.C0110a b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2420a = obj;
        this.b = a.f3548c.a(obj.getClass());
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        a.C0110a aVar2 = this.b;
        Object obj = this.f2420a;
        a.C0110a.a(aVar2.f3550a.get(aVar), hVar, aVar, obj);
        a.C0110a.a(aVar2.f3550a.get(e.a.ON_ANY), hVar, aVar, obj);
    }
}
