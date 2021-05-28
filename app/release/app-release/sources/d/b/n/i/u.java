package d.b.n.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.g.g.a.c;

public class u extends q implements SubMenu {
    public u(Context context, c cVar) {
        super(context, cVar);
    }

    public void clearHeader() {
        this.f2789a.clearHeader();
    }

    public MenuItem getItem() {
        return a(this.f2789a.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f2789a.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f2789a.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f2789a.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f2789a.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f2789a.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f2789a.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f2789a.setIcon(drawable);
        return this;
    }
}
