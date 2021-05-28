package d.b.n.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import d.g.g.a.a;
import d.g.g.a.b;
import d.g.g.a.c;
import java.util.Iterator;
import java.util.Map;

public class q extends c<a> implements Menu {
    public q(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(this.f2789a.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.f2789a.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.f2789a.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(this.f2789a.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f2789a.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return a(this.f2789a.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(this.f2789a.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.f2789a.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(this.f2789a.addSubMenu(charSequence));
    }

    public void clear() {
        Map<b, MenuItem> map = this.f2787c;
        if (map != null) {
            map.clear();
        }
        Map<c, SubMenu> map2 = this.f2788d;
        if (map2 != null) {
            map2.clear();
        }
        this.f2789a.clear();
    }

    public void close() {
        this.f2789a.close();
    }

    public MenuItem findItem(int i) {
        return a(this.f2789a.findItem(i));
    }

    public MenuItem getItem(int i) {
        return a(this.f2789a.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f2789a.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f2789a.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f2789a.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f2789a.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        Map<b, MenuItem> map = this.f2787c;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
        this.f2789a.removeGroup(i);
    }

    public void removeItem(int i) {
        Map<b, MenuItem> map = this.f2787c;
        if (map != null) {
            Iterator<b> it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == it.next().getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        this.f2789a.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f2789a.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f2789a.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f2789a.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f2789a.setQwertyMode(z);
    }

    public int size() {
        return this.f2789a.size();
    }
}
