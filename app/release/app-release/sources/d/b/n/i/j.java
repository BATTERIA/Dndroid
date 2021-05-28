package d.b.n.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d.g.g.a.b;
import d.g.l.b;

public final class j implements b {
    public d.g.l.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f2828a;
    public final int b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2829c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2830d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f2831e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f2832f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f2833g;

    /* renamed from: h  reason: collision with root package name */
    public char f2834h;
    public int i = 4096;
    public char j;
    public int k = 4096;
    public Drawable l;
    public int m = 0;
    public h n;
    public t o;
    public MenuItem.OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s = null;
    public PorterDuff.Mode t = null;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public int x = 16;
    public int y = 0;
    public View z;

    public class a implements b.a {
        public a() {
        }
    }

    public j(h hVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = hVar;
        this.f2828a = i3;
        this.b = i2;
        this.f2829c = i4;
        this.f2830d = i5;
        this.f2831e = charSequence;
        this.y = i6;
    }

    public static void a(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public final Drawable a(Drawable drawable) {
        if (drawable != null && this.w && (this.u || this.v)) {
            drawable = c.a.a.a.a.a(drawable).mutate();
            if (this.u) {
                c.a.a.a.a.a(drawable, this.s);
            }
            if (this.v) {
                c.a.a.a.a.a(drawable, this.t);
            }
            this.w = false;
        }
        return drawable;
    }

    @Override // d.g.g.a.b
    public d.g.g.a.b a(d.g.l.b bVar) {
        d.g.l.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f3333a = null;
        }
        this.z = null;
        this.A = bVar;
        this.n.b(true);
        d.g.l.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.a(new a());
        }
        return this;
    }

    @Override // d.g.g.a.b
    public d.g.l.b a() {
        return this.A;
    }

    public void a(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.x = i3;
        if (i2 != i3) {
            this.n.b(false);
        }
    }

    public char b() {
        return this.n.f() ? this.j : this.f2834h;
    }

    public void b(boolean z2) {
        this.x = z2 ? this.x | 32 : this.x & -33;
    }

    public boolean c() {
        d.g.l.b bVar;
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null && (bVar = this.A) != null) {
            this.z = bVar.a(this);
        }
        return this.z != null;
    }

    public boolean c(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.x = i3;
        return i2 != i3;
    }

    @Override // d.g.g.a.b
    public boolean collapseActionView() {
        if ((this.y & 8) == 0) {
            return false;
        }
        if (this.z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.a(this);
        }
        return false;
    }

    public boolean d() {
        return (this.x & 32) == 32;
    }

    public boolean e() {
        return (this.x & 4) != 0;
    }

    @Override // d.g.g.a.b
    public boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.b(this);
        }
        return false;
    }

    public boolean f() {
        return this.n.g() && b() != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // d.g.g.a.b
    public View getActionView() {
        View view = this.z;
        if (view != null) {
            return view;
        }
        d.g.l.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View a2 = bVar.a(this);
        this.z = a2;
        return a2;
    }

    @Override // d.g.g.a.b
    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // d.g.g.a.b
    public CharSequence getContentDescription() {
        return this.q;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return a(drawable);
        }
        int i2 = this.m;
        if (i2 == 0) {
            return null;
        }
        Drawable c2 = d.b.l.a.a.c(this.n.f2818a, i2);
        this.m = 0;
        this.l = c2;
        return a(c2);
    }

    @Override // d.g.g.a.b
    public ColorStateList getIconTintList() {
        return this.s;
    }

    @Override // d.g.g.a.b
    public PorterDuff.Mode getIconTintMode() {
        return this.t;
    }

    public Intent getIntent() {
        return this.f2833g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f2828a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    @Override // d.g.g.a.b
    public int getNumericModifiers() {
        return this.i;
    }

    public char getNumericShortcut() {
        return this.f2834h;
    }

    public int getOrder() {
        return this.f2829c;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f2831e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2832f;
        return charSequence != null ? charSequence : this.f2831e;
    }

    @Override // d.g.g.a.b
    public CharSequence getTooltipText() {
        return this.r;
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    @Override // d.g.g.a.b
    public boolean isActionViewExpanded() {
        return this.C;
    }

    public boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    public boolean isVisible() {
        d.g.l.b bVar = this.A;
        return (bVar == null || !bVar.b()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.A.a();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // d.g.g.a.b, android.view.MenuItem
    public MenuItem setActionView(int i2) {
        Context context = this.n.f2818a;
        setActionView(LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // d.g.g.a.b, android.view.MenuItem
    public d.g.g.a.b setActionView(View view) {
        int i2;
        this.z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f2828a) > 0) {
            view.setId(i2);
        }
        this.n.h();
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 1 : 0) | (i2 & -2);
        this.x = i3;
        if (i2 != i3) {
            this.n.b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.x & 4) != 0) {
            h hVar = this.n;
            if (hVar != null) {
                int groupId = getGroupId();
                int size = hVar.f2822f.size();
                hVar.j();
                for (int i2 = 0; i2 < size; i2++) {
                    j jVar = hVar.f2822f.get(i2);
                    if (jVar.b == groupId && jVar.e() && jVar.isCheckable()) {
                        jVar.a(jVar == this);
                    }
                }
                hVar.i();
            } else {
                throw null;
            }
        } else {
            a(z2);
        }
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    /* renamed from: setContentDescription  reason: collision with other method in class */
    public d.g.g.a.b m88setContentDescription(CharSequence charSequence) {
        this.q = charSequence;
        this.n.b(false);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.x = z2 ? this.x | 16 : this.x & -17;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.w = true;
        this.n.b(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.w = true;
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.s = colorStateList;
        this.u = true;
        this.w = true;
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.t = mode;
        this.v = true;
        this.w = true;
        this.n.b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2833g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f2834h == c2) {
            return this;
        }
        this.f2834h = c2;
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f2834h == c2 && this.i == i2) {
            return this;
        }
        this.f2834h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.n.b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f2834h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f2834h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.y = i2;
            this.n.h();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // d.g.g.a.b
    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.n.f2818a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2831e = charSequence;
        this.n.b(false);
        t tVar = this.o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2832f = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.b(false);
        return this;
    }

    @Override // d.g.g.a.b
    /* renamed from: setTooltipText  reason: collision with other method in class */
    public d.g.g.a.b m89setTooltipText(CharSequence charSequence) {
        this.r = charSequence;
        this.n.b(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (c(z2)) {
            h hVar = this.n;
            hVar.f2824h = true;
            hVar.b(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f2831e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
