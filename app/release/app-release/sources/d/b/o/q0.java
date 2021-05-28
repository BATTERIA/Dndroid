package d.b.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class q0 extends ContextWrapper {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2972c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static ArrayList<WeakReference<q0>> f2973d;

    /* renamed from: a  reason: collision with root package name */
    public final Resources f2974a;
    public final Resources.Theme b = null;

    public q0(Context context) {
        super(context);
        z0.a();
        this.f2974a = new s0(this, context.getResources());
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof q0) && !(context.getResources() instanceof s0) && !(context.getResources() instanceof z0)) {
            if (Build.VERSION.SDK_INT >= 21) {
                z0.a();
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (f2972c) {
            if (f2973d == null) {
                f2973d = new ArrayList<>();
            } else {
                for (int size = f2973d.size() - 1; size >= 0; size--) {
                    WeakReference<q0> weakReference = f2973d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f2973d.remove(size);
                    }
                }
                for (int size2 = f2973d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<q0> weakReference2 = f2973d.get(size2);
                    q0 q0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (q0Var != null && q0Var.getBaseContext() == context) {
                        return q0Var;
                    }
                }
            }
            q0 q0Var2 = new q0(context);
            f2973d.add(new WeakReference<>(q0Var2));
            return q0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f2974a.getAssets();
    }

    public Resources getResources() {
        return this.f2974a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
