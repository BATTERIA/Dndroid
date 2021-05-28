package e.d.a.n;

import e.d.a.s.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g> f4204a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4205c;

    public void a() {
        this.f4205c = true;
        Iterator it = ((ArrayList) h.a(this.f4204a)).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onDestroy();
        }
    }

    @Override // e.d.a.n.f
    public void a(g gVar) {
        this.f4204a.add(gVar);
        if (this.f4205c) {
            gVar.onDestroy();
        } else if (this.b) {
            gVar.a();
        } else {
            gVar.b();
        }
    }

    public void b() {
        this.b = true;
        Iterator it = ((ArrayList) h.a(this.f4204a)).iterator();
        while (it.hasNext()) {
            ((g) it.next()).a();
        }
    }

    public void c() {
        this.b = false;
        Iterator it = ((ArrayList) h.a(this.f4204a)).iterator();
        while (it.hasNext()) {
            ((g) it.next()).b();
        }
    }
}
