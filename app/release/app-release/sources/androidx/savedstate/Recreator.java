package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import d.l.d;
import d.l.e;
import d.l.h;
import d.l.i;
import d.p.a;
import d.p.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements d {

    /* renamed from: a  reason: collision with root package name */
    public final c f2548a;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f2549a = new HashSet();

        public a(d.p.a aVar) {
            if (aVar.f3673a.b("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        @Override // d.p.a.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2549a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f2548a = cVar;
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        Class cls;
        if (aVar == e.a.ON_CREATE) {
            ((i) hVar.a()).f3558a.remove(this);
            d.p.a c2 = this.f2548a.c();
            if (c2.f3674c) {
                Bundle bundle = c2.b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    c2.b.remove("androidx.savedstate.Restarter");
                    if (c2.b.isEmpty()) {
                        c2.b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 != null) {
                    ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                    if (stringArrayList != null) {
                        Iterator<String> it = stringArrayList.iterator();
                        while (it.hasNext()) {
                            String next = it.next();
                            try {
                                try {
                                    Constructor<? extends U> declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.AbstractC0114a.class).getDeclaredConstructor(new Class[0]);
                                    declaredConstructor.setAccessible(true);
                                    try {
                                        ((a.AbstractC0114a) declaredConstructor.newInstance(new Object[0])).a(this.f2548a);
                                    } catch (Exception e2) {
                                        throw new RuntimeException(e.a.a.a.a.b("Failed to instantiate ", next), e2);
                                    }
                                } catch (NoSuchMethodException e3) {
                                    StringBuilder a2 = e.a.a.a.a.a("Class");
                                    a2.append(cls.getSimpleName());
                                    a2.append(" must have default constructor in order to be automatically recreated");
                                    throw new IllegalStateException(a2.toString(), e3);
                                }
                            } catch (ClassNotFoundException e4) {
                                throw new RuntimeException(e.a.a.a.a.a("Class ", next, " wasn't found"), e4);
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                return;
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
