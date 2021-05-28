package d.p;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public d.c.a.b.b<String, b> f3673a = new d.c.a.b.b<>();
    public Bundle b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3674c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f3675d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3676e = true;

    /* renamed from: d.p.a$a  reason: collision with other inner class name */
    public interface AbstractC0114a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public void a(Class<? extends AbstractC0114a> cls) {
        if (this.f3676e) {
            if (this.f3675d == null) {
                this.f3675d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.f3675d;
                aVar.f2549a.add(cls.getName());
            } catch (NoSuchMethodException e2) {
                StringBuilder a2 = e.a.a.a.a.a("Class");
                a2.append(cls.getSimpleName());
                a2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(a2.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
