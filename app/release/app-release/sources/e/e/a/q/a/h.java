package e.e.a.q.a;

import android.util.LongSparseArray;
import e.c.a.b.l;
import e.e.a.q.d.b;

public class h {
    public static volatile h b;

    /* renamed from: a  reason: collision with root package name */
    public LongSparseArray<j> f4461a = new LongSparseArray<>();

    public static h a() {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    public void a(long j, i iVar) {
        if (b.f4498a) {
            try {
                j jVar = this.f4461a.get(j);
                if (jVar == null) {
                    return;
                }
                if (iVar != null) {
                    iVar.f4466f = System.nanoTime();
                    jVar.b.submit(new b(jVar, iVar));
                    return;
                }
                throw null;
            } catch (Exception e2) {
                l.f.a("HummerDebug", "stopTrack, e = ", (Throwable) e2);
            }
        }
    }
}
