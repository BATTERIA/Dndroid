package d.j.d;

import androidx.fragment.app.Fragment;
import d.l.e;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<a> f3530a = new ArrayList<>();
    public int b;

    /* renamed from: c  reason: collision with root package name */
    public int f3531c;

    /* renamed from: d  reason: collision with root package name */
    public int f3532d;

    /* renamed from: e  reason: collision with root package name */
    public int f3533e;

    /* renamed from: f  reason: collision with root package name */
    public int f3534f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3535g;

    /* renamed from: h  reason: collision with root package name */
    public String f3536h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList<String> m;
    public ArrayList<String> n;
    public boolean o = false;
    public ArrayList<Runnable> p;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3537a;
        public Fragment b;

        /* renamed from: c  reason: collision with root package name */
        public int f3538c;

        /* renamed from: d  reason: collision with root package name */
        public int f3539d;

        /* renamed from: e  reason: collision with root package name */
        public int f3540e;

        /* renamed from: f  reason: collision with root package name */
        public int f3541f;

        /* renamed from: g  reason: collision with root package name */
        public e.b f3542g;

        /* renamed from: h  reason: collision with root package name */
        public e.b f3543h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.f3537a = i;
            this.b = fragment;
            e.b bVar = e.b.RESUMED;
            this.f3542g = bVar;
            this.f3543h = bVar;
        }

        public a(int i, Fragment fragment, e.b bVar) {
            this.f3537a = i;
            this.b = fragment;
            this.f3542g = fragment.R;
            this.f3543h = bVar;
        }
    }

    public z(m mVar, ClassLoader classLoader) {
    }

    public abstract int a();

    public z a(Fragment fragment, e.b bVar) {
        a(new a(10, fragment, bVar));
        return this;
    }

    public void a(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder a2 = e.a.a.a.a.a("Fragment ");
            a2.append(cls.getCanonicalName());
            a2.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(a2.toString());
        }
        if (str != null) {
            String str2 = fragment.z;
            if (str2 == null || str.equals(str2)) {
                fragment.z = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.z + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.x;
                if (i4 == 0 || i4 == i2) {
                    fragment.x = i2;
                    fragment.y = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.x + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        a(new a(i3, fragment));
    }

    public void a(a aVar) {
        this.f3530a.add(aVar);
        aVar.f3538c = this.b;
        aVar.f3539d = this.f3531c;
        aVar.f3540e = this.f3532d;
        aVar.f3541f = this.f3533e;
    }

    public abstract void b();
}
