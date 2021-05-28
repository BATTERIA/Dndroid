package d.b.k;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import d.b.k.k;
import d.b.n.a;
import d.b.n.f;
import d.b.o.i;
import d.b.o.z0;
import d.j.d.d;
import java.util.ArrayList;

public class h extends d implements i, d.g.d.d {
    public j p;
    public int q = 0;
    public Resources r;

    @Override // d.b.k.i
    public a a(a.AbstractC0090a aVar) {
        return null;
    }

    @Override // d.b.k.i
    public void a(a aVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        k kVar = (k) h();
        kVar.f();
        ((ViewGroup) kVar.u.findViewById(16908290)).addView(view, layoutParams);
        kVar.f2662e.onContentChanged();
    }

    @Override // d.b.k.i
    public void b(a aVar) {
    }

    public void closeOptionsMenu() {
        i();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // d.g.d.d
    public Intent d() {
        return c.a.a.a.a.a((Activity) this);
    }

    @Override // d.g.d.b
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        i();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        k kVar = (k) h();
        kVar.f();
        return (T) kVar.f2661d.findViewById(i);
    }

    @Override // d.j.d.d
    public void g() {
        h().c();
    }

    public MenuInflater getMenuInflater() {
        k kVar = (k) h();
        if (kVar.i == null) {
            kVar.h();
            a aVar = kVar.f2665h;
            kVar.i = new f(aVar != null ? aVar.c() : kVar.f2660c);
        }
        return kVar.i;
    }

    public Resources getResources() {
        if (this.r == null) {
            z0.a();
        }
        Resources resources = this.r;
        return resources == null ? super.getResources() : resources;
    }

    public j h() {
        if (this.p == null) {
            this.p = new k(this, getWindow(), this);
        }
        return this.p;
    }

    public a i() {
        k kVar = (k) h();
        kVar.h();
        return kVar.f2665h;
    }

    public void invalidateOptionsMenu() {
        h().c();
    }

    @Override // d.j.d.d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k kVar = (k) h();
        if (kVar.z && kVar.t) {
            kVar.h();
            a aVar = kVar.f2665h;
            if (aVar != null) {
                aVar.a(configuration);
            }
        }
        i.a().b(kVar.f2660c);
        kVar.a();
        if (this.r != null) {
            this.r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
    }

    @Override // androidx.activity.ComponentActivity, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        int i;
        j h2 = h();
        h2.b();
        h2.a(bundle);
        if (h2.a() && (i = this.q) != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.q, false);
            } else {
                super.setTheme(i);
                this.q = i;
            }
        }
        super.onCreate(bundle);
    }

    @Override // d.j.d.d
    public void onDestroy() {
        super.onDestroy();
        k kVar = (k) h();
        if (kVar.M) {
            kVar.f2661d.getDecorView().removeCallbacks(kVar.O);
        }
        kVar.I = true;
        a aVar = kVar.f2665h;
        k.f fVar = kVar.L;
        if (fVar != null) {
            fVar.a();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // d.j.d.d
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a i2 = i();
        if (menuItem.getItemId() != 16908332 || i2 == null || (i2.b() & 4) == 0 || (a2 = c.a.a.a.a.a((Activity) this)) == null) {
            return false;
        }
        if (shouldUpRecreateTask(a2)) {
            ArrayList arrayList = new ArrayList();
            Intent d2 = d();
            if (d2 == null) {
                d2 = c.a.a.a.a.a((Activity) this);
            }
            if (d2 != null) {
                ComponentName component = d2.getComponent();
                if (component == null) {
                    component = d2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent a3 = c.a.a.a.a.a((Context) this, component);
                        if (a3 == null) {
                            break;
                        }
                        arrayList.add(size, a3);
                        component = a3.getComponent();
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                arrayList.add(d2);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                d.g.e.a.a(this, intentArr, null);
                try {
                    d.g.d.a.a((Activity) this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a2);
            return true;
        }
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // d.j.d.d
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((k) h()).f();
    }

    @Override // d.j.d.d
    public void onPostResume() {
        super.onPostResume();
        k kVar = (k) h();
        kVar.h();
        a aVar = kVar.f2665h;
        if (aVar != null) {
            aVar.c(true);
        }
    }

    @Override // androidx.activity.ComponentActivity, d.g.d.b, d.j.d.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        int i = ((k) h()).J;
        if (i != -100) {
            bundle.putInt("appcompat:local_night_mode", i);
        }
    }

    @Override // d.j.d.d
    public void onStart() {
        super.onStart();
        ((k) h()).a();
    }

    @Override // d.j.d.d
    public void onStop() {
        super.onStop();
        k kVar = (k) h();
        kVar.h();
        a aVar = kVar.f2665h;
        if (aVar != null) {
            aVar.c(false);
        }
        k.f fVar = kVar.L;
        if (fVar != null) {
            fVar.a();
        }
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        h().a(charSequence);
    }

    public void openOptionsMenu() {
        i();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        h().b(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h().a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h().a(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        this.q = i;
    }
}
