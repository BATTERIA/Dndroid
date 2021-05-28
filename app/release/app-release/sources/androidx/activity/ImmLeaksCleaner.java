package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import d.l.e;
import d.l.f;
import d.l.h;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements f {
    public static int b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f2236c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f2237d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f2238e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f2239a;

    public ImmLeaksCleaner(Activity activity) {
        this.f2239a = activity;
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            if (b == 0) {
                try {
                    b = 2;
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    f2237d = declaredField;
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    f2238e = declaredField2;
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    f2236c = declaredField3;
                    declaredField3.setAccessible(true);
                    b = 1;
                } catch (NoSuchFieldException unused) {
                }
            }
            if (b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f2239a.getSystemService("input_method");
                try {
                    Object obj = f2236c.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f2237d.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f2238e.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused2) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused3) {
                            } catch (ClassCastException unused4) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused5) {
                }
            }
        }
    }
}
