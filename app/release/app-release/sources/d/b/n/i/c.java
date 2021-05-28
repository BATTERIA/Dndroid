package d.b.n.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import d.d.a;
import d.g.g.a.b;
import java.util.Map;

public abstract class c<T> extends d<T> {
    public final Context b;

    /* renamed from: c  reason: collision with root package name */
    public Map<b, MenuItem> f2787c;

    /* renamed from: d  reason: collision with root package name */
    public Map<d.g.g.a.c, SubMenu> f2788d;

    public c(Context context, T t) {
        super(t);
        this.b = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f2787c == null) {
            this.f2787c = new a();
        }
        MenuItem menuItem2 = this.f2787c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l lVar = new l(this.b, bVar);
        this.f2787c.put(bVar, lVar);
        return lVar;
    }

    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof d.g.g.a.c)) {
            return subMenu;
        }
        d.g.g.a.c cVar = (d.g.g.a.c) subMenu;
        if (this.f2788d == null) {
            this.f2788d = new a();
        }
        SubMenu subMenu2 = this.f2788d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        u uVar = new u(this.b, cVar);
        this.f2788d.put(cVar, uVar);
        return uVar;
    }
}
