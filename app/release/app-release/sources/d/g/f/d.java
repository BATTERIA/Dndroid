package d.g.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import c.a.a.a.a;
import d.g.e.c.c;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class d extends h {
    public static Class b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f3263c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f3264d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f3265e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3266f = false;

    public static void a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f3266f) {
            f3266f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f3263c = constructor;
            b = cls;
            f3264d = method;
            f3265e = method2;
        }
    }

    public static boolean a(Object obj, String str, int i, boolean z) {
        a();
        try {
            return ((Boolean) f3264d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // d.g.f.h
    public Typeface a(Context context, c cVar, Resources resources, int i) {
        a();
        try {
            Object newInstance = f3263c.newInstance(new Object[0]);
            d.g.e.c.d[] dVarArr = cVar.f3248a;
            for (d.g.e.c.d dVar : dVarArr) {
                File a2 = a.a(context);
                if (a2 == null) {
                    return null;
                }
                try {
                    if (!a.a(a2, resources, dVar.f3253f)) {
                        a2.delete();
                        return null;
                    }
                    if (!a(newInstance, a2.getPath(), dVar.b, dVar.f3250c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    a2.delete();
                }
            }
            a();
            try {
                Object newInstance2 = Array.newInstance(b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f3265e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        r4.addSuppressed(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0082, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0083, code lost:
        r4.addSuppressed(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        throw r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC] */
    @Override // d.g.f.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r4, android.os.CancellationSignal r5, d.g.i.b.f[] r6, int r7) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.f.d.a(android.content.Context, android.os.CancellationSignal, d.g.i.b$f[], int):android.graphics.Typeface");
    }
}
