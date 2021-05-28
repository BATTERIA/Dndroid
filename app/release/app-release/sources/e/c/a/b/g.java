package e.c.a.b;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.Log;
import c.a.a.a.a;
import e.c.a.b.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class g implements Runnable {
    public void run() {
        DisplayMetrics displayMetrics;
        Resources system = Resources.getSystem();
        float f2 = Resources.getSystem().getDisplayMetrics().xdpi;
        system.getDisplayMetrics().xdpi = f2;
        l.f.b().getResources().getDisplayMetrics().xdpi = f2;
        List<Field> list = a.u;
        if (list == null) {
            a.u = new ArrayList();
            Class<?> cls = system.getClass();
            do {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields != null && declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                            field.setAccessible(true);
                            try {
                                displayMetrics = (DisplayMetrics) field.get(system);
                            } catch (Exception unused) {
                                displayMetrics = null;
                            }
                            if (displayMetrics != null) {
                                a.u.add(field);
                                displayMetrics.xdpi = f2;
                            }
                        }
                    }
                    cls = cls.getSuperclass();
                } else {
                    return;
                }
            } while (cls != null);
            return;
        }
        for (Field field2 : list) {
            try {
                DisplayMetrics displayMetrics2 = (DisplayMetrics) field2.get(system);
                if (displayMetrics2 != null) {
                    displayMetrics2.xdpi = f2;
                }
            } catch (Exception e2) {
                Log.e("AdaptScreenUtils", "applyMetricsFields: " + e2);
            }
        }
    }
}
