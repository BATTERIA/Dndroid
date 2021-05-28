package d.b.n.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import d.g.g.a.b;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2774a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2775c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f2776d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2777e;

    /* renamed from: f  reason: collision with root package name */
    public Intent f2778f;

    /* renamed from: g  reason: collision with root package name */
    public char f2779g;

    /* renamed from: h  reason: collision with root package name */
    public int f2780h = 4096;
    public char i;
    public int j = 4096;
    public Drawable k;
    public Context l;
    public CharSequence m;
    public CharSequence n;
    public ColorStateList o = null;
    public PorterDuff.Mode p = null;
    public boolean q = false;
    public boolean r = false;
    public int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.l = context;
        this.f2774a = i3;
        this.b = i2;
        this.f2775c = i5;
        this.f2776d = charSequence;
    }

    @Override // d.g.g.a.b
    public b a(d.g.l.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // d.g.g.a.b
    public d.g.l.b a() {
        return null;
    }

    public final void b() {
        if (this.k == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable a2 = c.a.a.a.a.a(this.k);
            this.k = a2;
            Drawable mutate = a2.mutate();
            this.k = mutate;
            if (this.q) {
                c.a.a.a.a.a(mutate, this.o);
            }
            if (this.r) {
                c.a.a.a.a.a(this.k, this.p);
            }
        }
    }

    @Override // d.g.g.a.b
    public boolean collapseActionView() {
        return false;
    }

    @Override // d.g.g.a.b
    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // d.g.g.a.b
    public View getActionView() {
        return null;
    }

    @Override // d.g.g.a.b
    public int getAlphabeticModifiers() {
        return this.j;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // d.g.g.a.b
    public CharSequence getContentDescription() {
        return this.m;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    @Override // d.g.g.a.b
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // d.g.g.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public Intent getIntent() {
        return this.f2778f;
    }

    public int getItemId() {
        return this.f2774a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // d.g.g.a.b
    public int getNumericModifiers() {
        return this.f2780h;
    }

    public char getNumericShortcut() {
        return this.f2779g;
    }

    public int getOrder() {
        return this.f2775c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f2776d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2777e;
        return charSequence != null ? charSequence : this.f2776d;
    }

    @Override // d.g.g.a.b
    public CharSequence getTooltipText() {
        return this.n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // d.g.g.a.b
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // d.g.g.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.i = Character.toLowerCase(c2);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // d.g.g.a.b
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m86setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.k = d.g.e.a.b(this.l, i2);
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        b();
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        b();
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2778f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f2779g = c2;
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f2779g = c2;
        this.f2780h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f2779g = c2;
        this.i = Character.toLowerCase(c3);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2779g = c2;
        this.f2780h = KeyEvent.normalizeMetaState(i2);
        this.i = Character.toLowerCase(c3);
        this.j = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // d.g.g.a.b
    public void setShowAsAction(int i2) {
    }

    @Override // d.g.g.a.b
    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.f2776d = this.l.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2776d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2777e = charSequence;
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // d.g.g.a.b
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m87setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    @Override // d.g.g.a.b, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
