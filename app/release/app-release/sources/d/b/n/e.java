package d.b.n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import d.b.n.a;
import d.b.n.i.l;
import d.b.n.i.q;
import d.d.h;
import d.g.g.a.b;
import java.util.ArrayList;

public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2748a;
    public final a b;

    public e(Context context, a aVar) {
        this.f2748a = context;
        this.b = aVar;
    }

    public void finish() {
        this.b.a();
    }

    public View getCustomView() {
        return this.b.b();
    }

    public Menu getMenu() {
        return new q(this.f2748a, (d.g.g.a.a) this.b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.b.d();
    }

    public CharSequence getSubtitle() {
        return this.b.e();
    }

    public Object getTag() {
        return this.b.f2739c;
    }

    public CharSequence getTitle() {
        return this.b.f();
    }

    public boolean getTitleOptionalHint() {
        return this.b.f2740d;
    }

    public void invalidate() {
        this.b.g();
    }

    public boolean isTitleOptional() {
        return this.b.h();
    }

    public void setCustomView(View view) {
        this.b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.b.a(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.b.f2739c = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.b.b(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.b.a(z);
    }

    public static class a implements a.AbstractC0090a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f2749a;
        public final Context b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f2750c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final h<Menu, Menu> f2751d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.f2749a = callback;
        }

        public final Menu a(Menu menu) {
            Menu orDefault = this.f2751d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            q qVar = new q(this.b, (d.g.g.a.a) menu);
            this.f2751d.put(menu, qVar);
            return qVar;
        }

        @Override // d.b.n.a.AbstractC0090a
        public void a(a aVar) {
            this.f2749a.onDestroyActionMode(b(aVar));
        }

        @Override // d.b.n.a.AbstractC0090a
        public boolean a(a aVar, Menu menu) {
            return this.f2749a.onPrepareActionMode(b(aVar), a(menu));
        }

        public ActionMode b(a aVar) {
            int size = this.f2750c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f2750c.get(i);
                if (eVar != null && eVar.b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.b, aVar);
            this.f2750c.add(eVar2);
            return eVar2;
        }

        @Override // d.b.n.a.AbstractC0090a
        public boolean b(a aVar, Menu menu) {
            return this.f2749a.onCreateActionMode(b(aVar), a(menu));
        }

        @Override // d.b.n.a.AbstractC0090a
        public boolean a(a aVar, MenuItem menuItem) {
            return this.f2749a.onActionItemClicked(b(aVar), new l(this.b, (b) menuItem));
        }
    }
}
