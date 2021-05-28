package d.j.d;

import android.view.View;
import d.g.l.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class n0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3484c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Map f3485d;

    public n0(p0 p0Var, ArrayList arrayList, Map map) {
        this.f3484c = arrayList;
        this.f3485d = map;
    }

    public void run() {
        String str;
        int size = this.f3484c.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f3484c.get(i);
            String k = p.k(view);
            if (k != null) {
                Iterator it = this.f3485d.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (k.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                p.a(view, str);
            }
        }
    }
}
