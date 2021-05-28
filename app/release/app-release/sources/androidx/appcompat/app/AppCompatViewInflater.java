package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    public static final Class<?>[] b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2263c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f2264d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Constructor<? extends View>> f2265e = new d.d.a();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2266a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final View f2267c;

        /* renamed from: d  reason: collision with root package name */
        public final String f2268d;

        /* renamed from: e  reason: collision with root package name */
        public Method f2269e;

        /* renamed from: f  reason: collision with root package name */
        public Context f2270f;

        public a(View view, String str) {
            this.f2267c = view;
            this.f2268d = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f2269e == null) {
                Context context = this.f2267c.getContext();
                while (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2268d, View.class)) != null) {
                            this.f2269e = method;
                            this.f2270f = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
                int id = this.f2267c.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder a2 = e.a.a.a.a.a(" with id '");
                    a2.append(this.f2267c.getContext().getResources().getResourceEntryName(id));
                    a2.append("'");
                    str = a2.toString();
                }
                StringBuilder a3 = e.a.a.a.a.a("Could not find method ");
                a3.append(this.f2268d);
                a3.append("(View) in a parent or ancestor Context for android:onClick ");
                a3.append("attribute defined on view ");
                a3.append(this.f2267c.getClass());
                a3.append(str);
                throw new IllegalStateException(a3.toString());
            }
            try {
                this.f2269e.invoke(this.f2270f, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public final View a(Context context, String str, String str2) {
        String str3;
        Constructor<? extends View> constructor = f2265e.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(b);
                f2265e.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f2266a);
    }

    public final void a(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(AppCompatViewInflater.class.getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
