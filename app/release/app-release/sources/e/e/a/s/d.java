package e.e.a.s;

import android.widget.Toast;
import e.c.a.b.l;
import e.e.a.p.b;

public class d {

    /* renamed from: a */
    public e.e.a.n.f.d.a f4544a;

    public interface a {
        void a(String str);
    }

    public static /* synthetic */ void a(b bVar, String str, e.e.a.n.a.b bVar2) {
        bVar.a(bVar2.f4315d, str);
        Toast.makeText(bVar, "页面已刷新", 0).show();
    }

    public static /* synthetic */ void a(String str, b bVar, String str2) {
        if (str != null && str.equalsIgnoreCase(str2)) {
            l.f.a(str, new a(bVar, str));
        }
    }
}
