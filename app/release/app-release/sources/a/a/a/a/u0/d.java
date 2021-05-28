package a.a.a.a.u0;

import a.a.a.a.i0;
import a.a.l;
import a.e;
import a.w.c.i;
import e.f.a.g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public final class d implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f142a;
    public final /* synthetic */ e b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f143c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ e f144d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ l f145e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f146f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map f147g;

    public d(Class cls, e eVar, l lVar, e eVar2, l lVar2, b bVar, Map map) {
        this.f142a = cls;
        this.b = eVar;
        this.f143c = lVar;
        this.f144d = eVar2;
        this.f145e = lVar2;
        this.f146f = bVar;
        this.f147g = map;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        e eVar;
        i.a((Object) method, "method");
        String name = method.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -1776922004) {
                if (hashCode != 147696667) {
                    if (hashCode == 1444986633 && name.equals("annotationType")) {
                        return this.f142a;
                    }
                } else if (name.equals("hashCode")) {
                    eVar = this.f144d;
                }
            } else if (name.equals("toString")) {
                eVar = this.b;
            }
            return eVar.getValue();
        }
        if (i.a((Object) name, (Object) "equals") && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(this.f146f.a(g.j(objArr)));
        }
        if (this.f147g.containsKey(name)) {
            return this.f147g.get(name);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Method is not supported: ");
        sb.append(method);
        sb.append(" (args: ");
        if (objArr == null) {
            objArr = new Object[0];
        }
        sb.append(g.k(objArr));
        sb.append(')');
        throw new i0(sb.toString());
    }
}
