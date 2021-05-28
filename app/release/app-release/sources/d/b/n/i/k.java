package d.b.n.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

public class k extends c<d.g.g.a.b> implements MenuItem {

    /* renamed from: e  reason: collision with root package name */
    public Method f2836e;

    public class a extends d.g.l.b {
        public final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }
    }

    public static class b extends FrameLayout implements d.b.n.b {

        /* renamed from: c  reason: collision with root package name */
        public final CollapsibleActionView f2838c;

        public b(View view) {
            super(view.getContext());
            this.f2838c = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // d.b.n.b
        public void a() {
            this.f2838c.onActionViewExpanded();
        }

        @Override // d.b.n.b
        public void b() {
            this.f2838c.onActionViewCollapsed();
        }
    }

    public class c extends d<MenuItem.OnActionExpandListener> implements MenuItem.OnActionExpandListener {
        public c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f2789a.onMenuItemActionCollapse(k.this.a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f2789a.onMenuItemActionExpand(k.this.a(menuItem));
        }
    }

    public class d extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f2789a.onMenuItemClick(k.this.a(menuItem));
        }
    }

    public k(Context context, d.g.g.a.b bVar) {
        super(context, bVar);
    }

    public a a(ActionProvider actionProvider) {
        return new a(this.b, actionProvider);
    }

    public boolean collapseActionView() {
        return this.f2789a.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f2789a.expandActionView();
    }

    public ActionProvider getActionProvider() {
        d.g.l.b a2 = this.f2789a.a();
        if (a2 instanceof a) {
            return ((a) a2).b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f2789a.getActionView();
        return actionView instanceof b ? (View) ((b) actionView).f2838c : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f2789a.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f2789a.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f2789a.getContentDescription();
    }

    public int getGroupId() {
        return this.f2789a.getGroupId();
    }

    public Drawable getIcon() {
        return this.f2789a.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f2789a.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2789a.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f2789a.getIntent();
    }

    public int getItemId() {
        return this.f2789a.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f2789a.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f2789a.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f2789a.getNumericShortcut();
    }

    public int getOrder() {
        return this.f2789a.getOrder();
    }

    public SubMenu getSubMenu() {
        return a(this.f2789a.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f2789a.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f2789a.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f2789a.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f2789a.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f2789a.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f2789a.isCheckable();
    }

    public boolean isChecked() {
        return this.f2789a.isChecked();
    }

    public boolean isEnabled() {
        return this.f2789a.isEnabled();
    }

    public boolean isVisible() {
        return this.f2789a.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        this.f2789a.a(actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f2789a.setActionView(i);
        View actionView = this.f2789a.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f2789a.setActionView(new b(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f2789a.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f2789a.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f2789a.setAlphabeticShortcut(c2, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f2789a.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f2789a.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f2789a.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f2789a.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f2789a.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f2789a.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2789a.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2789a.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f2789a.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f2789a.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i) {
        this.f2789a.setNumericShortcut(c2, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2789a.setOnActionExpandListener(onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2789a.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f2789a.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f2789a.setShortcut(c2, c3, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f2789a.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f2789a.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f2789a.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f2789a.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2789a.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f2789a.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f2789a.setVisible(z);
    }
}
