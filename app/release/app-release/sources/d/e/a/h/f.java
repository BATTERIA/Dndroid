package d.e.a.h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public List<d> f3180a;
    public int b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3181c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3182d = false;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f3183e = {-1, -1};

    /* renamed from: f  reason: collision with root package name */
    public List<d> f3184f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<d> f3185g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public HashSet<d> f3186h = new HashSet<>();
    public HashSet<d> i = new HashSet<>();
    public List<d> j = new ArrayList();
    public List<d> k = new ArrayList();

    public f(List<d> list) {
        this.f3180a = list;
    }

    public f(List<d> list, boolean z) {
        this.f3180a = list;
        this.f3182d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d.e.a.h.d r7) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.f.a(d.e.a.h.d):void");
    }

    public void a(d dVar, int i2) {
        HashSet<d> hashSet;
        if (i2 == 0) {
            hashSet = this.f3186h;
        } else if (i2 == 1) {
            hashSet = this.i;
        } else {
            return;
        }
        hashSet.add(dVar);
    }

    public final void a(ArrayList<d> arrayList, d dVar) {
        d dVar2;
        if (!dVar.d0) {
            arrayList.add(dVar);
            dVar.d0 = true;
            if (!dVar.k()) {
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    int i2 = hVar.l0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, hVar.k0[i3]);
                    }
                }
                int length = dVar.A.length;
                for (int i4 = 0; i4 < length; i4++) {
                    c cVar = dVar.A[i4].f3150d;
                    if (!(cVar == null || (dVar2 = cVar.b) == dVar.D)) {
                        a(arrayList, dVar2);
                    }
                }
            }
        }
    }
}
