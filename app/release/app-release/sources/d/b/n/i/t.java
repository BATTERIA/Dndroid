package d.b.n.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class t extends h implements SubMenu {
    public h A;
    public j B;

    public t(Context context, h hVar, j jVar) {
        super(context);
        this.A = hVar;
        this.B = jVar;
    }

    @Override // d.b.n.i.h
    public boolean a(h hVar, MenuItem menuItem) {
        return super.a(hVar, menuItem) || this.A.a(hVar, menuItem);
    }

    @Override // d.b.n.i.h
    public boolean a(j jVar) {
        return this.A.a(jVar);
    }

    @Override // d.b.n.i.h
    public String b() {
        j jVar = this.B;
        int i = jVar != null ? jVar.f2828a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i;
    }

    @Override // d.b.n.i.h
    public boolean b(j jVar) {
        return this.A.b(jVar);
    }

    @Override // d.b.n.i.h
    public h c() {
        return this.A.c();
    }

    @Override // d.b.n.i.h
    public boolean e() {
        return this.A.e();
    }

    @Override // d.b.n.i.h
    public boolean f() {
        return this.A.f();
    }

    @Override // d.b.n.i.h
    public boolean g() {
        return this.A.g();
    }

    public MenuItem getItem() {
        return this.B;
    }

    @Override // d.b.n.i.h
    public void setGroupDividerEnabled(boolean z) {
        this.A.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        a(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.B.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.B.setIcon(drawable);
        return this;
    }

    @Override // d.b.n.i.h
    public void setQwertyMode(boolean z) {
        this.A.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }
}
