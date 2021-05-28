package d.j.d;

import android.util.Log;
import androidx.fragment.app.Fragment;
import d.l.q;
import d.l.r;
import java.util.HashMap;
import java.util.Iterator;

public final class u extends q {

    /* renamed from: h  reason: collision with root package name */
    public static final r f3511h = new a();
    public final HashMap<String, Fragment> b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, u> f3512c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, d.l.u> f3513d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3514e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3515f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3516g = false;

    public static class a implements r {
        @Override // d.l.r
        public <T extends q> T a(Class<T> cls) {
            return new u(true);
        }
    }

    public u(boolean z) {
        this.f3514e = z;
    }

    public boolean a(Fragment fragment) {
        if (!this.b.containsKey(fragment.f2395g)) {
            return true;
        }
        return this.f3514e ? this.f3515f : !this.f3516g;
    }

    @Override // d.l.q
    public void b() {
        if (q.c(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3515f = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.b.equals(uVar.b) && this.f3512c.equals(uVar.f3512c) && this.f3513d.equals(uVar.f3513d);
    }

    public int hashCode() {
        int hashCode = this.f3512c.hashCode();
        return this.f3513d.hashCode() + ((hashCode + (this.b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3512c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3513d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
