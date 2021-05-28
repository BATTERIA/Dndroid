package e.e.a.y.b;

import e.e.a.u.b;
import java.util.HashMap;
import java.util.List;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, List<e.e.a.q.b.a>> f4594a;

    public void a(String str, e.e.a.y.b.b.a aVar) {
        if (this.f4594a.containsKey(str)) {
            for (e.e.a.q.b.a aVar2 : this.f4594a.get(str)) {
                aVar2.a(aVar);
            }
        }
    }

    @Override // e.e.a.u.b
    public void onCreate() {
        this.f4594a = new HashMap<>();
    }

    @Override // e.e.a.u.b
    public void onDestroy() {
        HashMap<String, List<e.e.a.q.b.a>> hashMap = this.f4594a;
        if (hashMap != null) {
            for (List<e.e.a.q.b.a> list : hashMap.values()) {
                if (list != null) {
                    list.clear();
                }
            }
            this.f4594a.clear();
        }
    }
}
