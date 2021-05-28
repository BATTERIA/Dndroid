package e.h.a;

import e.f.a.g;
import e.h.a.f0.o;
import e.h.a.f0.z.m;
import e.h.a.f0.z.o;
import e.h.a.g0.a;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public o f4836a = o.f4708h;
    public a0 b = a0.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    public e f4837c = d.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Type, m<?>> f4838d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List<d0> f4839e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<d0> f4840f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f4841g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f4842h = 2;
    public int i = 2;
    public boolean j = false;
    public boolean k = false;
    public boolean l = true;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;

    public k a() {
        ArrayList arrayList = new ArrayList(this.f4840f.size() + this.f4839e.size() + 3);
        arrayList.addAll(this.f4839e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f4840f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i2 = this.f4842h;
        int i3 = this.i;
        if (!(i2 == 2 || i3 == 2)) {
            a aVar = new a(Date.class, i2, i3);
            a aVar2 = new a(Timestamp.class, i2, i3);
            a aVar3 = new a(java.sql.Date.class, i2, i3);
            arrayList.add(e.h.a.f0.z.o.a(Date.class, aVar));
            arrayList.add(new o.y(Timestamp.class, aVar2));
            arrayList.add(new o.y(java.sql.Date.class, aVar3));
        }
        return new k(this.f4836a, this.f4837c, this.f4838d, this.f4841g, this.j, this.n, this.l, this.m, this.o, this.k, this.b, null, this.f4842h, this.i, this.f4839e, this.f4840f, arrayList);
    }

    public l a(Type type, Object obj) {
        boolean z = obj instanceof y;
        boolean z2 = false;
        g.a(z || (obj instanceof p) || (obj instanceof m) || (obj instanceof c0));
        if (obj instanceof m) {
            this.f4838d.put(type, (m) obj);
        }
        if (z || (obj instanceof p)) {
            a aVar = new a(type);
            List<d0> list = this.f4839e;
            if (aVar.b == aVar.f4806a) {
                z2 = true;
            }
            list.add(new m.c(obj, aVar, z2, null));
        }
        if (obj instanceof c0) {
            this.f4839e.add(e.h.a.f0.z.o.a(new a(type), (c0) obj));
        }
        return this;
    }
}
