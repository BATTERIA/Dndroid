package e.c.a.b;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import d.l.e;
import e.c.a.b.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class v implements Application.ActivityLifecycleCallbacks {

    /* renamed from: g  reason: collision with root package name */
    public static final v f3828g = new v();

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<Activity> f3829a = new LinkedList<>();
    public final List<u> b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Activity, List<s>> f3830c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public int f3831d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f3832e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3833f = false;

    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Activity f3834c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f3835d;

        public a(v vVar, Activity activity, Object obj) {
            this.f3834c = activity;
            this.f3835d = obj;
        }

        public void run() {
            Window window = this.f3834c.getWindow();
            if (window != null) {
                window.setSoftInputMode(((Integer) this.f3835d).intValue());
            }
        }
    }

    public final void a(Activity activity) {
        if (this.f3829a.contains(activity)) {
            if (!this.f3829a.getFirst().equals(activity)) {
                this.f3829a.remove(activity);
            } else {
                return;
            }
        }
        this.f3829a.addFirst(activity);
    }

    public final void a(Activity activity, e.a aVar) {
        List<s> list = this.f3830c.get(activity);
        if (list != null) {
            for (s sVar : list) {
                if (sVar == null) {
                    throw null;
                } else if (activity == null) {
                    throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
                } else if (!aVar.equals(e.a.ON_CREATE) && !aVar.equals(e.a.ON_START) && !aVar.equals(e.a.ON_RESUME) && !aVar.equals(e.a.ON_PAUSE) && !aVar.equals(e.a.ON_STOP)) {
                    aVar.equals(e.a.ON_DESTROY);
                }
            }
            if (aVar.equals(e.a.ON_DESTROY)) {
                this.f3830c.remove(activity);
            }
        }
    }

    public final void a(Activity activity, boolean z) {
        if (!this.b.isEmpty()) {
            for (u uVar : this.b) {
                if (z) {
                    uVar.a(activity);
                } else {
                    uVar.b(activity);
                }
            }
        }
    }

    public final void b(Activity activity, boolean z) {
        if (z) {
            activity.getWindow().getDecorView().setTag(-123, Integer.valueOf(activity.getWindow().getAttributes().softInputMode));
            activity.getWindow().setSoftInputMode(3);
            return;
        }
        Object tag = activity.getWindow().getDecorView().getTag(-123);
        if (tag instanceof Integer) {
            q.f3818a.postDelayed(new a(this, activity, tag), 100);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Locale locale;
        if (activity != null) {
            p a2 = p.a("Utils", 0);
            if (a2 != null) {
                String string = a2.f3817a.getString("KEY_LOCALE", "");
                if (!TextUtils.isEmpty(string)) {
                    if ("VALUE_FOLLOW_SYSTEM".equals(string)) {
                        Locale locale2 = Resources.getSystem().getConfiguration().locale;
                        c.a.a.a.a.a((Context) l.f.b(), locale2);
                        c.a.a.a.a.a((Context) activity, locale2);
                    } else {
                        String[] split = string.split("\\$");
                        if (split.length != 2) {
                            Log.e("LanguageUtils", "The string of " + string + " is not in the correct format.");
                            locale = null;
                        } else {
                            locale = new Locale(split[0], split[1]);
                        }
                        if (locale != null) {
                            c.a.a.a.a.a((Context) l.f.b(), locale);
                            c.a.a.a.a.a((Context) activity, locale);
                        }
                    }
                }
                if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
                    try {
                        Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                        declaredField.setAccessible(true);
                        if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                            declaredField.set(null, Float.valueOf(1.0f));
                            Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
                        }
                    } catch (NoSuchFieldException e2) {
                        e2.printStackTrace();
                    } catch (IllegalAccessException e3) {
                        e3.printStackTrace();
                    }
                }
                a(activity);
                a(activity, e.a.ON_CREATE);
                return;
            }
            throw null;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity != null) {
            this.f3829a.remove(activity);
            Window window = activity.getWindow();
            if (window != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) l.f.b().getSystemService("input_method");
                if (inputMethodManager != null) {
                    String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
                    for (int i = 0; i < 4; i++) {
                        try {
                            Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i]);
                            if (!declaredField.isAccessible()) {
                                declaredField.setAccessible(true);
                            }
                            Object obj = declaredField.get(inputMethodManager);
                            if (obj instanceof View) {
                                if (((View) obj).getRootView() == window.getDecorView().getRootView()) {
                                    declaredField.set(inputMethodManager, null);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                a(activity, e.a.ON_DESTROY);
                return;
            }
            throw new NullPointerException("Argument 'window' of type Window (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
    }

    public void onActivityPaused(Activity activity) {
        if (activity != null) {
            a(activity, e.a.ON_PAUSE);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
    }

    public void onActivityResumed(Activity activity) {
        if (activity != null) {
            a(activity);
            if (this.f3833f) {
                this.f3833f = false;
                a(activity, true);
            }
            b(activity, false);
            a(activity, e.a.ON_RESUME);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (activity == null) {
            throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 2, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
        }
    }

    public void onActivityStarted(Activity activity) {
        if (activity != null) {
            if (!this.f3833f) {
                a(activity);
            }
            int i = this.f3832e;
            if (i < 0) {
                this.f3832e = i + 1;
            } else {
                this.f3831d++;
            }
            a(activity, e.a.ON_START);
            return;
        }
        throw new NullPointerException("Argument 'activity' of type Activity (#0 out of 1, zero-based) is marked by @android.support.annotation.NonNull but got null for it");
    }

    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.f3832e--;
        } else {
            int i = this.f3831d - 1;
            this.f3831d = i;
            if (i <= 0) {
                this.f3833f = true;
                a(activity, false);
            }
        }
        b(activity, true);
        a(activity, e.a.ON_STOP);
    }

    public final Object a() {
        Object obj;
        Object obj2;
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception e2) {
            StringBuilder a2 = e.a.a.a.a.a("getActivityThreadInActivityThreadStaticField: ");
            a2.append(e2.getMessage());
            Log.e("UtilsActivityLifecycle", a2.toString());
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        try {
            obj2 = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e3) {
            StringBuilder a3 = e.a.a.a.a.a("getActivityThreadInActivityThreadStaticMethod: ");
            a3.append(e3.getMessage());
            Log.e("UtilsActivityLifecycle", a3.toString());
            obj2 = null;
        }
        if (obj2 != null) {
            return obj2;
        }
        try {
            Field declaredField2 = Application.class.getDeclaredField("mLoadedApk");
            declaredField2.setAccessible(true);
            Object obj3 = declaredField2.get(l.f.b());
            Field declaredField3 = obj3.getClass().getDeclaredField("mActivityThread");
            declaredField3.setAccessible(true);
            return declaredField3.get(obj3);
        } catch (Exception e4) {
            StringBuilder a4 = e.a.a.a.a.a("getActivityThreadInLoadedApkField: ");
            a4.append(e4.getMessage());
            Log.e("UtilsActivityLifecycle", a4.toString());
            return null;
        }
    }
}
