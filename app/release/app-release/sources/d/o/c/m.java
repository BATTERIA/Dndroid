package d.o.c;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<m> f3640g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    public static Comparator<c> f3641h = new a();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<RecyclerView> f3642c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public long f3643d;

    /* renamed from: e  reason: collision with root package name */
    public long f3644e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<c> f3645f = new ArrayList<>();

    public static class a implements Comparator<c> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r6.f3651d == null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r0 != false) goto L_0x0024;
         */
        @Override // java.util.Comparator
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(d.o.c.m.c r6, d.o.c.m.c r7) {
            /*
                r5 = this;
                d.o.c.m$c r6 = (d.o.c.m.c) r6
                d.o.c.m$c r7 = (d.o.c.m.c) r7
                androidx.recyclerview.widget.RecyclerView r0 = r6.f3651d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r3 = r7.f3651d
                if (r3 != 0) goto L_0x0013
                r3 = 1
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                r4 = -1
                if (r0 == r3) goto L_0x001c
                androidx.recyclerview.widget.RecyclerView r6 = r6.f3651d
                if (r6 != 0) goto L_0x0024
                goto L_0x0025
            L_0x001c:
                boolean r0 = r6.f3649a
                boolean r3 = r7.f3649a
                if (r0 == r3) goto L_0x0027
                if (r0 == 0) goto L_0x0025
            L_0x0024:
                r1 = -1
            L_0x0025:
                r2 = r1
                goto L_0x0038
            L_0x0027:
                int r0 = r7.b
                int r1 = r6.b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x0030
                r2 = r0
                goto L_0x0038
            L_0x0030:
                int r6 = r6.f3650c
                int r7 = r7.f3650c
                int r6 = r6 - r7
                if (r6 == 0) goto L_0x0038
                r2 = r6
            L_0x0038:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: d.o.c.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    public static class b implements RecyclerView.m.c {

        /* renamed from: a  reason: collision with root package name */
        public int f3646a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f3647c;

        /* renamed from: d  reason: collision with root package name */
        public int f3648d;

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3648d * 2;
                int[] iArr = this.f3647c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3647c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f3647c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3647c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f3648d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void a(RecyclerView recyclerView, boolean z) {
            this.f3648d = 0;
            int[] iArr = this.f3647c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.o;
            if (recyclerView.n != null && mVar != null && mVar.l) {
                if (z) {
                    if (!recyclerView.f2448f.c()) {
                        mVar.a(recyclerView.n.a(), this);
                    }
                } else if (!recyclerView.l()) {
                    mVar.a(this.f3646a, this.b, recyclerView.i0, this);
                }
                int i = this.f3648d;
                if (i > mVar.m) {
                    mVar.m = i;
                    mVar.n = z;
                    recyclerView.f2446d.d();
                }
            }
        }

        public boolean a(int i) {
            if (this.f3647c != null) {
                int i2 = this.f3648d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3647c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3649a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f3650c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f3651d;

        /* renamed from: e  reason: collision with root package name */
        public int f3652e;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.t && this.f3643d == 0) {
            this.f3643d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.h0;
        bVar.f3646a = i;
        bVar.b = i2;
    }

    public void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (!this.f3642c.isEmpty()) {
                int size = this.f3642c.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3642c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j == 0) {
                    this.f3643d = 0;
                    Trace.endSection();
                    return;
                }
                a(TimeUnit.MILLISECONDS.toNanos(j) + this.f3644e);
                this.f3643d = 0;
                Trace.endSection();
            }
        } finally {
            this.f3643d = 0;
            Trace.endSection();
        }
    }

    public void a(long j) {
        RecyclerView recyclerView;
        c cVar;
        int size = this.f3642c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView2 = this.f3642c.get(i2);
            if (recyclerView2.getWindowVisibility() == 0) {
                recyclerView2.h0.a(recyclerView2, false);
                i += recyclerView2.h0.f3648d;
            }
        }
        this.f3645f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = this.f3642c.get(i4);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.h0;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.f3646a);
                for (int i5 = 0; i5 < bVar.f3648d * 2; i5 += 2) {
                    if (i3 >= this.f3645f.size()) {
                        cVar = new c();
                        this.f3645f.add(cVar);
                    } else {
                        cVar = this.f3645f.get(i3);
                    }
                    int i6 = bVar.f3647c[i5 + 1];
                    cVar.f3649a = i6 <= abs;
                    cVar.b = abs;
                    cVar.f3650c = i6;
                    cVar.f3651d = recyclerView3;
                    cVar.f3652e = bVar.f3647c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3645f, f3641h);
        for (int i7 = 0; i7 < this.f3645f.size(); i7++) {
            c cVar2 = this.f3645f.get(i7);
            if (cVar2.f3651d != null) {
                RecyclerView.a0 a2 = a(cVar2.f3651d, cVar2.f3652e, cVar2.f3649a ? Long.MAX_VALUE : j);
                if (!(a2 == null || a2.b == null || !a2.f() || a2.g() || (recyclerView = a2.b.get()) == null)) {
                    if (recyclerView.E && recyclerView.f2449g.b() != 0) {
                        recyclerView.s();
                    }
                    b bVar2 = recyclerView.h0;
                    bVar2.a(recyclerView, true);
                    if (bVar2.f3648d != 0) {
                        try {
                            Trace.beginSection("RV Nested Prefetch");
                            RecyclerView.x xVar = recyclerView.i0;
                            RecyclerView.e eVar = recyclerView.n;
                            xVar.f2512d = 1;
                            xVar.f2513e = eVar.a();
                            xVar.f2515g = false;
                            xVar.f2516h = false;
                            xVar.i = false;
                            for (int i8 = 0; i8 < bVar2.f3648d * 2; i8 += 2) {
                                a(recyclerView, bVar2.f3647c[i8], j);
                            }
                        } finally {
                            Trace.endSection();
                        }
                    }
                }
                cVar2.f3649a = false;
                cVar2.b = 0;
                cVar2.f3650c = 0;
                cVar2.f3651d = null;
                cVar2.f3652e = 0;
            } else {
                return;
            }
        }
    }

    public final RecyclerView.a0 a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b2 = recyclerView.f2449g.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b2) {
                z = false;
                break;
            }
            RecyclerView.a0 g2 = RecyclerView.g(recyclerView.f2449g.d(i2));
            if (g2.f2453c == i && !g2.g()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f2446d;
        try {
            recyclerView.p();
            RecyclerView.a0 a2 = sVar.a(i, false, j);
            if (a2 != null) {
                if (!a2.f() || a2.g()) {
                    sVar.a(a2, false);
                } else {
                    sVar.a(a2.f2452a);
                }
            }
            return a2;
        } finally {
            recyclerView.a(false);
        }
    }
}
