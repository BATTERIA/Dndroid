package d.g.f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import d.g.e.c.c;
import d.g.e.c.d;
import e.a.a.a.a;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f extends d {

    /* renamed from: g  reason: collision with root package name */
    public final Class f3270g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor f3271h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public f() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = a((Class) cls2);
            method2 = b((Class) cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = c((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder a2 = a.a("Unable to collect necessary methods for class ");
            a2.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a2.toString(), e2);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f3270g = cls;
        this.f3271h = constructor;
        this.i = method3;
        this.j = method2;
        this.k = method;
        this.l = method4;
        this.m = method5;
    }

    private Object c() {
        try {
            return this.f3271h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // d.g.f.h
    public Typeface a(Context context, Resources resources, int i2, String str, int i3) {
        if (!b()) {
            return super.a(context, resources, i2, str, i3);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        if (!a(context, c2, str, 0, -1, -1, null)) {
            a(c2);
            return null;
        } else if (!c(c2)) {
            return null;
        } else {
            return b(c2);
        }
    }

    @Override // d.g.f.h, d.g.f.d
    public Typeface a(Context context, c cVar, Resources resources, int i2) {
        if (!b()) {
            return super.a(context, cVar, resources, i2);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        d[] dVarArr = cVar.f3248a;
        for (d dVar : dVarArr) {
            if (!a(context, c2, dVar.f3249a, dVar.f3252e, dVar.b, dVar.f3250c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f3251d))) {
                a(c2);
                return null;
            }
        }
        if (!c(c2)) {
            return null;
        }
        return b(c2);
    }

    public Method a(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void a(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean a(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface b(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3270g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final boolean b() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method c(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean c(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        r13.addSuppressed(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        throw r14;
     */
    @Override // d.g.f.h, d.g.f.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r12, android.os.CancellationSignal r13, d.g.i.b.f[] r14, int r15) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.f.f.a(android.content.Context, android.os.CancellationSignal, d.g.i.b$f[], int):android.graphics.Typeface");
    }
}
