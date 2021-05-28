package d.r;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final d.d.a<String, Method> f3733a;
    public final d.d.a<String, Method> b;

    /* renamed from: c  reason: collision with root package name */
    public final d.d.a<String, Class> f3734c;

    public a(d.d.a<String, Method> aVar, d.d.a<String, Method> aVar2, d.d.a<String, Class> aVar3) {
        this.f3733a = aVar;
        this.b = aVar2;
        this.f3734c = aVar3;
    }

    public final Class a(Class<? extends c> cls) {
        Class orDefault = this.f3734c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f3734c.put(cls.getName(), cls2);
        return cls2;
    }

    public abstract void a();

    public abstract boolean a(int i);

    public abstract a b();

    public final Method b(Class cls) {
        Method orDefault = this.b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class a2 = a(cls);
        System.currentTimeMillis();
        Method declaredMethod = a2.getDeclaredMethod("write", cls, a.class);
        this.b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract void b(int i);

    public <T extends c> T c() {
        String readString = ((b) this).f3736e.readString();
        if (readString == null) {
            return null;
        }
        a b2 = b();
        try {
            return (T) ((c) a(readString).invoke(null, b2));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public final Method a(String str) {
        Method orDefault = this.f3733a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f3733a.put(str, declaredMethod);
        return declaredMethod;
    }

    public void b(int i, int i2) {
        b(i2);
        ((b) this).f3736e.writeInt(i);
    }

    public void b(Parcelable parcelable, int i) {
        b(i);
        ((b) this).f3736e.writeParcelable(parcelable, 0);
    }

    public boolean a(boolean z, int i) {
        if (!a(i)) {
            return z;
        }
        return ((b) this).f3736e.readInt() != 0;
    }

    public CharSequence a(CharSequence charSequence, int i) {
        return !a(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) this).f3736e);
    }

    public int a(int i, int i2) {
        return !a(i2) ? i : ((b) this).f3736e.readInt();
    }

    public <T extends Parcelable> T a(T t, int i) {
        return !a(i) ? t : (T) ((b) this).f3736e.readParcelable(b.class.getClassLoader());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: d.r.a */
    /* JADX WARN: Multi-variable type inference failed */
    public void a(c cVar) {
        if (cVar == null) {
            ((b) this).f3736e.writeString(null);
            return;
        }
        try {
            ((b) this).f3736e.writeString(a((Class<? extends c>) cVar.getClass()).getName());
            a b2 = b();
            try {
                b(cVar.getClass()).invoke(null, cVar, b2);
                b2.a();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (InvocationTargetException e3) {
                if (e3.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e3.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
