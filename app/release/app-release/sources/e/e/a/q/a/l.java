package e.e.a.q.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public long f4478a;
    public String b;

    /* renamed from: c  reason: collision with root package name */
    public String f4479c;

    /* renamed from: d  reason: collision with root package name */
    public List<l> f4480d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public l f4481e;

    /* renamed from: f  reason: collision with root package name */
    public l f4482f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4483g;

    /* renamed from: h  reason: collision with root package name */
    public long f4484h;

    public l(long j, String str) {
        this.f4478a = j;
        this.b = str;
    }

    public void a(l lVar) {
        Iterator<l> it = this.f4480d.iterator();
        while (it.hasNext()) {
            if (it.next().f4478a == lVar.f4478a) {
                it.remove();
                return;
            }
        }
    }
}
