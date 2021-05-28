package e.h.a.f0.a0;

import e.h.a.r;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

public final class c extends b {

    /* renamed from: d  reason: collision with root package name */
    public static Class f4699d;
    public final Object b;

    /* renamed from: c  reason: collision with root package name */
    public final Field f4700c;

    public c() {
        Object obj;
        Field field = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f4699d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.b = obj;
        try {
            field = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f4700c = field;
    }

    @Override // e.h.a.f0.a0.b
    public void a(AccessibleObject accessibleObject) {
        boolean z = false;
        if (!(this.b == null || this.f4700c == null)) {
            try {
                long longValue = ((Long) f4699d.getMethod("objectFieldOffset", Field.class).invoke(this.b, this.f4700c)).longValue();
                f4699d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.b, accessibleObject, Long.valueOf(longValue), true);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e2) {
                throw new r("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
            }
        }
    }
}
