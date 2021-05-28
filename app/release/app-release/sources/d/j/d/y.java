package d.j.d;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Fragment> f3529a = new ArrayList<>();
    public final HashMap<String, x> b = new HashMap<>();

    public void a() {
        this.b.values().removeAll(Collections.singleton(null));
    }

    public void a(int i) {
        Iterator<Fragment> it = this.f3529a.iterator();
        while (it.hasNext()) {
            x xVar = this.b.get(it.next().f2395g);
            if (xVar != null) {
                xVar.f3528c = i;
            }
        }
        for (x xVar2 : this.b.values()) {
            if (xVar2 != null) {
                xVar2.f3528c = i;
            }
        }
    }

    public void a(Fragment fragment) {
        if (!this.f3529a.contains(fragment)) {
            synchronized (this.f3529a) {
                this.f3529a.add(fragment);
            }
            fragment.m = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public boolean a(String str) {
        return this.b.containsKey(str);
    }

    public Fragment b(String str) {
        x xVar = this.b.get(str);
        if (xVar != null) {
            return xVar.b;
        }
        return null;
    }

    public void b(Fragment fragment) {
        synchronized (this.f3529a) {
            this.f3529a.remove(fragment);
        }
        fragment.m = false;
    }

    public List<Fragment> c() {
        ArrayList arrayList;
        if (this.f3529a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3529a) {
            arrayList = new ArrayList(this.f3529a);
        }
        return arrayList;
    }

    public ArrayList<String> d() {
        synchronized (this.f3529a) {
            if (this.f3529a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3529a.size());
            Iterator<Fragment> it = this.f3529a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2395g);
                if (q.c(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2395g + "): " + next);
                }
            }
            return arrayList;
        }
    }

    public List<Fragment> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<x> it = this.b.values().iterator();
        while (it.hasNext()) {
            x next = it.next();
            arrayList.add(next != null ? next.b : null);
        }
        return arrayList;
    }
}
