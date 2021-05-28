package a.w.c;

import e.a.a.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class u {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f2150a;

    public u(int i) {
        this.f2150a = new ArrayList<>(i);
    }

    public int a() {
        return this.f2150a.size();
    }

    public void a(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f2150a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f2150a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f2150a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object obj2 : (Iterable) obj) {
                    this.f2150a.add(obj2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f2150a.add(it.next());
                }
            } else {
                StringBuilder a2 = a.a("Don't know how to spread ");
                a2.append(obj.getClass());
                throw new UnsupportedOperationException(a2.toString());
            }
        }
    }
}
