package d.b.n.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import d.g.l.t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class h implements d.g.g.a.a {
    public static final int[] z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f2818a;
    public final Resources b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2819c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2820d;

    /* renamed from: e  reason: collision with root package name */
    public a f2821e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<j> f2822f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<j> f2823g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2824h;
    public ArrayList<j> i;
    public ArrayList<j> j;
    public boolean k;
    public int l = 0;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<j> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<o>> v = new CopyOnWriteArrayList<>();
    public j w;
    public boolean x = false;
    public boolean y;

    public interface a {
        void a(h hVar);

        boolean a(h hVar, MenuItem menuItem);
    }

    public interface b {
        boolean a(j jVar);
    }

    public h(Context context) {
        boolean z2 = false;
        this.f2818a = context;
        this.b = context.getResources();
        this.f2822f = new ArrayList<>();
        this.f2823g = new ArrayList<>();
        this.f2824h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        if (this.b.getConfiguration().keyboard != 1 && t.c(ViewConfiguration.get(this.f2818a), this.f2818a)) {
            z2 = true;
        }
        this.f2820d = z2;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = z;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                j jVar = new j(this, i2, i3, i4, i7, charSequence, this.l);
                ArrayList<j> arrayList = this.f2822f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f2830d <= i7) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, jVar);
                b(true);
                return jVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public void a() {
        ArrayList<j> d2 = d();
        if (this.k) {
            Iterator<WeakReference<o>> it = this.v.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.v.remove(next);
                } else {
                    z2 |= oVar.b();
                }
            }
            if (z2) {
                this.i.clear();
                this.j.clear();
                int size = d2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    j jVar = d2.get(i2);
                    (jVar.d() ? this.i : this.j).add(jVar);
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(d());
            }
            this.k = false;
        }
    }

    public final void a(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f2822f.size()) {
            this.f2822f.remove(i2);
            if (z2) {
                b(true);
            }
        }
    }

    public void a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(b());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((t) item.getSubMenu()).a(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void a(o oVar) {
        Iterator<WeakReference<o>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar2 = next.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.v.remove(next);
            }
        }
    }

    public void a(o oVar, Context context) {
        this.v.add(new WeakReference<>(oVar));
        oVar.a(context, this);
        this.k = true;
    }

    public final void a(boolean z2) {
        if (!this.t) {
            this.t = true;
            Iterator<WeakReference<o>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.v.remove(next);
                } else {
                    oVar.a(this, z2);
                }
            }
            this.t = false;
        }
    }

    public boolean a(MenuItem menuItem, int i2) {
        return a(menuItem, (o) null, i2);
    }

    public boolean a(h hVar, MenuItem menuItem) {
        a aVar = this.f2821e;
        return aVar != null && aVar.a(hVar, menuItem);
    }

    public boolean a(j jVar) {
        boolean z2 = false;
        if (!this.v.isEmpty() && this.w == jVar) {
            j();
            Iterator<WeakReference<o>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<o> next = it.next();
                o oVar = next.get();
                if (oVar == null) {
                    this.v.remove(next);
                } else {
                    z2 = oVar.a(this, jVar);
                    if (z2) {
                        break;
                    }
                }
            }
            i();
            if (z2) {
                this.w = null;
            }
        }
        return z2;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.f2818a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        j jVar = (j) a(i2, i3, i4, charSequence);
        t tVar = new t(this.f2818a, this, jVar);
        jVar.o = tVar;
        tVar.setHeaderTitle(jVar.f2831e);
        return tVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public String b() {
        return "android:menu:actionviewstates";
    }

    public void b(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(b(), sparseArray);
        }
    }

    public void b(boolean z2) {
        if (!this.p) {
            if (z2) {
                this.f2824h = true;
                this.k = true;
            }
            if (!this.v.isEmpty()) {
                j();
                Iterator<WeakReference<o>> it = this.v.iterator();
                while (it.hasNext()) {
                    WeakReference<o> next = it.next();
                    o oVar = next.get();
                    if (oVar == null) {
                        this.v.remove(next);
                    } else {
                        oVar.a(z2);
                    }
                }
                i();
                return;
            }
            return;
        }
        this.q = true;
        if (z2) {
            this.r = true;
        }
    }

    public boolean b(j jVar) {
        boolean z2 = false;
        if (this.v.isEmpty()) {
            return false;
        }
        j();
        Iterator<WeakReference<o>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<o> next = it.next();
            o oVar = next.get();
            if (oVar == null) {
                this.v.remove(next);
            } else {
                z2 = oVar.b(this, jVar);
                if (z2) {
                    break;
                }
            }
        }
        i();
        if (z2) {
            this.w = jVar;
        }
        return z2;
    }

    public h c() {
        return this;
    }

    public void clear() {
        j jVar = this.w;
        if (jVar != null) {
            a(jVar);
        }
        this.f2822f.clear();
        b(true);
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        b(false);
    }

    public void close() {
        a(true);
    }

    public ArrayList<j> d() {
        if (!this.f2824h) {
            return this.f2823g;
        }
        this.f2823g.clear();
        int size = this.f2822f.size();
        for (int i2 = 0; i2 < size; i2++) {
            j jVar = this.f2822f.get(i2);
            if (jVar.isVisible()) {
                this.f2823g.add(jVar);
            }
        }
        this.f2824h = false;
        this.k = true;
        return this.f2823g;
    }

    public boolean e() {
        return this.x;
    }

    public boolean f() {
        return this.f2819c;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f2822f.get(i3);
            if (jVar.f2828a == i2) {
                return jVar;
            }
            if (jVar.hasSubMenu() && (findItem = jVar.o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g() {
        return this.f2820d;
    }

    public MenuItem getItem(int i2) {
        return this.f2822f.get(i2);
    }

    public void h() {
        this.k = true;
        b(true);
    }

    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f2822f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        this.p = false;
        if (this.q) {
            this.q = false;
            b(this.r);
        }
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public void j() {
        if (!this.p) {
            this.p = true;
            this.q = false;
            this.r = false;
        }
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        j a2 = a(i2, keyEvent);
        boolean a3 = a2 != null ? a(a2, (o) null, i3) : false;
        if ((i3 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f2822f.get(i3).b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f2822f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f2822f.get(i3).b != i2) {
                    b(true);
                } else {
                    a(i3, false);
                    i4 = i5;
                }
            }
            b(true);
        }
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f2822f.get(i3).f2828a == i2) {
                break;
            } else {
                i3++;
            }
        }
        a(i3, true);
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f2822f.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f2822f.get(i3);
            if (jVar.b == i2) {
                jVar.x = (jVar.x & -5) | (z3 ? 4 : 0);
                jVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.x = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f2822f.size();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f2822f.get(i3);
            if (jVar.b == i2) {
                jVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f2822f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = this.f2822f.get(i3);
            if (jVar.b == i2 && jVar.c(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f2819c = z2;
        b(false);
    }

    public int size() {
        return this.f2822f.size();
    }

    public j a(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<j> arrayList = this.u;
        arrayList.clear();
        a(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean f2 = f();
        for (int i3 = 0; i3 < size; i3++) {
            j jVar = arrayList.get(i3);
            if (f2) {
                c2 = jVar.j;
            } else {
                c2 = jVar.f2834h;
            }
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (f2 && c2 == '\b' && i2 == 67))) {
                return jVar;
            }
        }
        return null;
    }

    public void a(List<j> list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean f2 = f();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f2822f.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar = this.f2822f.get(i4);
                if (jVar.hasSubMenu()) {
                    jVar.o.a(list, i2, keyEvent);
                }
                if (f2) {
                    c2 = jVar.j;
                } else {
                    c2 = jVar.f2834h;
                }
                if (f2) {
                    i3 = jVar.k;
                } else {
                    i3 = jVar.i;
                }
                if (((modifiers & 69647) == (i3 & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (f2 && c2 == '\b' && i2 == 67)) && jVar.isEnabled()) {
                        list.add(jVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0064, code lost:
        if (r1 != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if ((r9 & 1) == 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d9, code lost:
        if (r1 == false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MenuItem r7, d.b.n.i.o r8, int r9) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.n.i.h.a(android.view.MenuItem, d.b.n.i.o, int):boolean");
    }

    public final void a(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i2 > 0) {
                this.m = resources.getText(i2);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i3 > 0) {
                this.n = d.g.e.a.b(this.f2818a, i3);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        b(false);
    }
}
