package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.g.l.z.b;
import d.o.c.m;
import d.o.c.n;
import d.o.c.o;
import d.o.c.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public boolean A = false;
    public BitSet B;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public d E = new d();
    public int F = 2;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public int[] O;
    public final Runnable P = new a();
    public int s = -1;
    public f[] t;
    public s u;
    public s v;
    public int w;
    public int x;
    public final n y;
    public boolean z = false;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.s();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2524a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2525c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2526d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2527e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2528f;

        public b() {
            b();
        }

        public void a() {
            this.b = this.f2525c ? StaggeredGridLayoutManager.this.u.b() : StaggeredGridLayoutManager.this.u.f();
        }

        public void b() {
            this.f2524a = -1;
            this.b = Integer.MIN_VALUE;
            this.f2525c = false;
            this.f2526d = false;
            this.f2527e = false;
            int[] iArr = this.f2528f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public f f2530e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2531f;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int d() {
            f fVar = this.f2530e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2546e;
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2537c;

        /* renamed from: d  reason: collision with root package name */
        public int f2538d;

        /* renamed from: e  reason: collision with root package name */
        public int f2539e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f2540f;

        /* renamed from: g  reason: collision with root package name */
        public int f2541g;

        /* renamed from: h  reason: collision with root package name */
        public int[] f2542h;
        public List<d.a> i;
        public boolean j;
        public boolean k;
        public boolean l;

        public static class a implements Parcelable.Creator<e> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f2537c = parcel.readInt();
            this.f2538d = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2539e = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2540f = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2541g = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2542h = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1;
            this.l = parcel.readInt() == 1 ? true : z;
            this.i = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2539e = eVar.f2539e;
            this.f2537c = eVar.f2537c;
            this.f2538d = eVar.f2538d;
            this.f2540f = eVar.f2540f;
            this.f2541g = eVar.f2541g;
            this.f2542h = eVar.f2542h;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.i = eVar.i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f2537c);
            parcel.writeInt(this.f2538d);
            parcel.writeInt(this.f2539e);
            if (this.f2539e > 0) {
                parcel.writeIntArray(this.f2540f);
            }
            parcel.writeInt(this.f2541g);
            if (this.f2541g > 0) {
                parcel.writeIntArray(this.f2542h);
            }
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeList(this.i);
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.w = i2;
        n(i);
        this.y = new n();
        this.u = s.a(this, this.w);
        this.v = s.a(this, 1 - this.w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int a(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        return c(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int a(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.w == 1 ? this.s : super.a(sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int a(RecyclerView.x xVar) {
        return h(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public PointF a(int i) {
        int i2 = i(i);
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i2;
        }
        return pointF;
    }

    public View a(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int d2 = d() - 1; d2 >= 0; d2--) {
            View c2 = c(d2);
            int d3 = this.u.d(c2);
            int a2 = this.u.a(c2);
            if (a2 > f2 && d3 < b2) {
                if (a2 <= b2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n a(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public void a(int i, RecyclerView.x xVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = u();
            i2 = 1;
        } else {
            i3 = t();
            i2 = -1;
        }
        this.y.f3653a = true;
        b(i3, xVar);
        m(i2);
        n nVar = this.y;
        nVar.f3654c = i3 + nVar.f3655d;
        nVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (d() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 != null && a2 != null) {
                int i = i(b2);
                int i2 = i(a2);
                if (i < i2) {
                    accessibilityEvent.setFromIndex(i);
                    accessibilityEvent.setToIndex(i2);
                    return;
                }
                accessibilityEvent.setFromIndex(i2);
                accessibilityEvent.setToIndex(i);
            }
        }
    }

    public final void a(RecyclerView.s sVar, int i) {
        for (int d2 = d() - 1; d2 >= 0; d2--) {
            View c2 = c(d2);
            if (this.u.d(c2) >= i && this.u.f(c2) >= i) {
                c cVar = (c) c2.getLayoutParams();
                if (cVar.f2531f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].f2543a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].f();
                    }
                } else if (cVar.f2530e.f2543a.size() != 1) {
                    cVar.f2530e.f();
                } else {
                    return;
                }
                a(c2, sVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView.s sVar, RecyclerView.x xVar, View view, d.g.l.z.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.a(view, bVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.w == 0) {
            i4 = cVar.d();
            i3 = cVar.f2531f ? this.s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar.d();
            i = cVar.f2531f ? this.s : 1;
        }
        bVar.a(b.c.a(i4, i3, i2, i, cVar.f2531f, false));
    }

    public final void a(RecyclerView.s sVar, RecyclerView.x xVar, boolean z2) {
        int b2;
        int j = j(Integer.MIN_VALUE);
        if (j != Integer.MIN_VALUE && (b2 = this.u.b() - j) > 0) {
            int i = b2 - (-c(-b2, sVar, xVar));
            if (z2 && i > 0) {
                this.u.a(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView) {
        this.E.a();
        p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        c(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        c(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(String str) {
        RecyclerView recyclerView;
        if (this.I == null && (recyclerView = this.b) != null) {
            recyclerView.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int b(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        return c(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int b(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.w == 0 ? this.s : super.b(sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int b(RecyclerView.x xVar) {
        return i(xVar);
    }

    public View b(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        int d2 = d();
        View view = null;
        for (int i = 0; i < d2; i++) {
            View c2 = c(i);
            int d3 = this.u.d(c2);
            if (this.u.a(c2) > f2 && d3 < b2) {
                if (d3 >= f2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r5, androidx.recyclerview.widget.RecyclerView.x r6) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void b(RecyclerView.s sVar, int i) {
        while (d() > 0) {
            View c2 = c(0);
            if (this.u.a(c2) <= i && this.u.e(c2) <= i) {
                c cVar = (c) c2.getLayoutParams();
                if (cVar.f2531f) {
                    for (int i2 = 0; i2 < this.s; i2++) {
                        if (this.t[i2].f2543a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.s; i3++) {
                        this.t[i3].g();
                    }
                } else if (cVar.f2530e.f2543a.size() != 1) {
                    cVar.f2530e.g();
                } else {
                    return;
                }
                a(c2, sVar);
            } else {
                return;
            }
        }
    }

    public final void b(RecyclerView.s sVar, RecyclerView.x xVar, boolean z2) {
        int f2;
        int k = k(Integer.MAX_VALUE);
        if (k != Integer.MAX_VALUE && (f2 = k - this.u.f()) > 0) {
            int c2 = f2 - c(f2, sVar, xVar);
            if (z2 && c2 > 0) {
                this.u.a(-c2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b(RecyclerView recyclerView, int i, int i2) {
        c(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b() {
        return this.w == 1;
    }

    public int c(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (d() == 0 || i == 0) {
            return 0;
        }
        a(i, xVar);
        int a2 = a(sVar, this.y, xVar);
        if (this.y.b >= a2) {
            i = i < 0 ? -a2 : a2;
        }
        this.u.a(-i);
        this.G = this.A;
        n nVar = this.y;
        nVar.b = 0;
        a(sVar, nVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int c(RecyclerView.x xVar) {
        return j(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n c() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final void c(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].f2543a.isEmpty()) {
                a(this.t[i3], i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.u()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.t()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.a(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.t()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.u()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.p()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c(RecyclerView.s sVar, RecyclerView.x xVar) {
        c(sVar, xVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0403, code lost:
        if (s() != false) goto L_0x0407;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.recyclerview.widget.RecyclerView.s r13, androidx.recyclerview.widget.RecyclerView.x r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 1061
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    public final int d(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int d(RecyclerView.x xVar) {
        return h(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d(int i) {
        super.d(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            f fVar = this.t[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.f2544c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f2544c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int e(RecyclerView.x xVar) {
        return i(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void e(int i) {
        super.e(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            f fVar = this.t[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.f2544c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f2544c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int f(RecyclerView.x xVar) {
        return j(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void f(int i) {
        if (i == 0) {
            s();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void g(RecyclerView.x xVar) {
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.b();
    }

    public final int h(RecyclerView.x xVar) {
        if (d() == 0) {
            return 0;
        }
        return c.a.a.a.a.a(xVar, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void h(int i) {
        e eVar = this.I;
        if (!(eVar == null || eVar.f2537c == i)) {
            eVar.f2540f = null;
            eVar.f2539e = 0;
            eVar.f2537c = -1;
            eVar.f2538d = -1;
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        p();
    }

    public final int i(int i) {
        if (d() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < t()) != this.A ? -1 : 1;
    }

    public final int i(RecyclerView.x xVar) {
        if (d() == 0) {
            return 0;
        }
        return c.a.a.a.a.a(xVar, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    public final int j(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    public final int j(RecyclerView.x xVar) {
        if (d() == 0) {
            return 0;
        }
        return c.a.a.a.a.b(xVar, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    public final int k(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public final boolean l(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == w();
    }

    public final void m(int i) {
        n nVar = this.y;
        nVar.f3656e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        nVar.f3655d = i2;
    }

    public void n(int i) {
        a((String) null);
        if (i != this.s) {
            this.E.a();
            p();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean n() {
        return this.F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable o() {
        int i;
        int i2;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.j = this.z;
        eVar.k = this.G;
        eVar.l = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f2532a) == null) {
            eVar.f2541g = 0;
        } else {
            eVar.f2542h = iArr;
            eVar.f2541g = iArr.length;
            eVar.i = dVar.b;
        }
        int i3 = -1;
        if (d() > 0) {
            eVar.f2537c = this.G ? u() : t();
            View a2 = this.A ? a(true) : b(true);
            if (a2 != null) {
                i3 = i(a2);
            }
            eVar.f2538d = i3;
            int i4 = this.s;
            eVar.f2539e = i4;
            eVar.f2540f = new int[i4];
            for (int i5 = 0; i5 < this.s; i5++) {
                if (this.G) {
                    i = this.t[i5].a(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.b();
                    } else {
                        eVar.f2540f[i5] = i;
                    }
                } else {
                    i = this.t[i5].b(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.f();
                    } else {
                        eVar.f2540f[i5] = i;
                    }
                }
                i -= i2;
                eVar.f2540f[i5] = i;
            }
        } else {
            eVar.f2537c = -1;
            eVar.f2538d = -1;
            eVar.f2539e = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean r() {
        return this.I == null;
    }

    public boolean s() {
        int i;
        int i2;
        if (d() == 0 || this.F == 0 || !this.i) {
            return false;
        }
        if (this.A) {
            i2 = u();
            i = t();
        } else {
            i2 = t();
            i = u();
        }
        if (i2 == 0 && v() != null) {
            this.E.a();
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            d.a a2 = this.E.a(i2, i4, i3, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i4);
                return false;
            }
            d.a a3 = this.E.a(i2, a2.f2533c, i3 * -1, true);
            if (a3 == null) {
                this.E.b(a2.f2533c);
            } else {
                this.E.b(a3.f2533c + 1);
            }
        }
        this.f2475h = true;
        p();
        return true;
    }

    public int t() {
        if (d() == 0) {
            return 0;
        }
        return i(c(0));
    }

    public int u() {
        int d2 = d();
        if (d2 == 0) {
            return 0;
        }
        return i(c(d2 - 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        if (r11 == r12) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r11 == r12) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cf, code lost:
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0091 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View v() {
        /*
        // Method dump skipped, instructions count: 243
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v():android.view.View");
    }

    public boolean w() {
        return g() == 1;
    }

    public final void x() {
        this.A = (this.w == 1 || !w()) ? this.z : !this.z;
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2532a;
        public List<a> b;

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0082a();

            /* renamed from: c  reason: collision with root package name */
            public int f2533c;

            /* renamed from: d  reason: collision with root package name */
            public int f2534d;

            /* renamed from: e  reason: collision with root package name */
            public int[] f2535e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f2536f;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0082a implements Parcelable.Creator<a> {
                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f2533c = parcel.readInt();
                this.f2534d = parcel.readInt();
                this.f2536f = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2535e = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a2 = e.a.a.a.a.a("FullSpanItem{mPosition=");
                a2.append(this.f2533c);
                a2.append(", mGapDir=");
                a2.append(this.f2534d);
                a2.append(", mHasUnwantedGapAfter=");
                a2.append(this.f2536f);
                a2.append(", mGapPerSpan=");
                a2.append(Arrays.toString(this.f2535e));
                a2.append('}');
                return a2.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2533c);
                parcel.writeInt(this.f2534d);
                parcel.writeInt(this.f2536f ? 1 : 0);
                int[] iArr = this.f2535e;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2535e);
            }
        }

        public a a(int i, int i2, int i3, boolean z) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.b.get(i4);
                int i5 = aVar.f2533c;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f2534d == i3 || (z && aVar.f2536f))) {
                    return aVar;
                }
            }
            return null;
        }

        public void a() {
            int[] iArr = this.f2532a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void a(int i) {
            int[] iArr = this.f2532a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f2532a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2532a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2532a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public void a(a aVar) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.b.get(i);
                if (aVar2.f2533c == aVar.f2533c) {
                    this.b.remove(i);
                }
                if (aVar2.f2533c >= aVar.f2533c) {
                    this.b.add(i, aVar);
                    return;
                }
            }
            this.b.add(aVar);
        }

        public int b(int i) {
            List<a> list = this.b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.b.get(size).f2533c >= i) {
                        this.b.remove(size);
                    }
                }
            }
            return d(i);
        }

        public void b(int i, int i2) {
            int[] iArr = this.f2532a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                a(i3);
                int[] iArr2 = this.f2532a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2532a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<a> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.b.get(size);
                        int i4 = aVar.f2533c;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.b.remove(size);
                            } else {
                                aVar.f2533c = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        public a c(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.f2533c == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f2532a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f2533c
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.b
                r3.remove(r2)
                int r0 = r0.f2533c
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f2532a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f2532a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f2532a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public void a(int i, int i2) {
            int[] iArr = this.f2532a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                a(i3);
                int[] iArr2 = this.f2532a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2532a, i, i3, -1);
                List<a> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.b.get(size);
                        int i4 = aVar.f2533c;
                        if (i4 >= i) {
                            aVar.f2533c = i4 + i2;
                        }
                    }
                }
            }
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f2543a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f2544c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f2545d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f2546e;

        public f(int i) {
            this.f2546e = i;
        }

        public int a(int i) {
            int i2 = this.f2544c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2543a.size() == 0) {
                return i;
            }
            a();
            return this.f2544c;
        }

        public View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2543a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2543a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.i(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.i(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2543a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f2543a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.i(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.i(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public void a() {
            d.a c2;
            ArrayList<View> arrayList = this.f2543a;
            View view = arrayList.get(arrayList.size() - 1);
            c b2 = b(view);
            this.f2544c = StaggeredGridLayoutManager.this.u.a(view);
            if (b2.f2531f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f2534d == 1) {
                int i = this.f2544c;
                int i2 = this.f2546e;
                int[] iArr = c2.f2535e;
                this.f2544c = i + (iArr == null ? 0 : iArr[i2]);
            }
        }

        public void a(View view) {
            c b2 = b(view);
            b2.f2530e = this;
            this.f2543a.add(view);
            this.f2544c = Integer.MIN_VALUE;
            if (this.f2543a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f2545d = StaggeredGridLayoutManager.this.u.b(view) + this.f2545d;
            }
        }

        public int b(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2543a.size() == 0) {
                return i;
            }
            b();
            return this.b;
        }

        public c b(View view) {
            return (c) view.getLayoutParams();
        }

        public void b() {
            d.a c2;
            int i = 0;
            View view = this.f2543a.get(0);
            c b2 = b(view);
            this.b = StaggeredGridLayoutManager.this.u.d(view);
            if (b2.f2531f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f2534d == -1) {
                int i2 = this.b;
                int i3 = this.f2546e;
                int[] iArr = c2.f2535e;
                if (iArr != null) {
                    i = iArr[i3];
                }
                this.b = i2 - i;
            }
        }

        public void c() {
            this.f2543a.clear();
            this.b = Integer.MIN_VALUE;
            this.f2544c = Integer.MIN_VALUE;
            this.f2545d = 0;
        }

        public void c(View view) {
            c b2 = b(view);
            b2.f2530e = this;
            this.f2543a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.f2543a.size() == 1) {
                this.f2544c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f2545d = StaggeredGridLayoutManager.this.u.b(view) + this.f2545d;
            }
        }

        public int d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = this.f2543a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f2543a.size();
            }
            return a(i2, i, true);
        }

        public int e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = 0;
                i = this.f2543a.size();
            } else {
                i2 = this.f2543a.size() - 1;
                i = -1;
            }
            return a(i2, i, true);
        }

        public void f() {
            int size = this.f2543a.size();
            View remove = this.f2543a.remove(size - 1);
            c b2 = b(remove);
            b2.f2530e = null;
            if (b2.c() || b2.b()) {
                this.f2545d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.f2544c = Integer.MIN_VALUE;
        }

        public void g() {
            View remove = this.f2543a.remove(0);
            c b2 = b(remove);
            b2.f2530e = null;
            if (this.f2543a.size() == 0) {
                this.f2544c = Integer.MIN_VALUE;
            }
            if (b2.c() || b2.b()) {
                this.f2545d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public int a(int i, int i2, boolean z) {
            int f2 = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f2543a.get(i);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z2 = false;
                boolean z3 = !z ? d2 < b2 : d2 <= b2;
                if (!z ? a2 > f2 : a2 >= f2) {
                    z2 = true;
                }
                if (z3 && z2 && (d2 < f2 || a2 > b2)) {
                    return StaggeredGridLayoutManager.this.i(view);
                }
                i += i3;
            }
            return -1;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.m.d a2 = RecyclerView.m.a(context, attributeSet, i, i2);
        int i3 = a2.f2478a;
        if (i3 == 0 || i3 == 1) {
            a((String) null);
            if (i3 != this.w) {
                this.w = i3;
                s sVar = this.u;
                this.u = this.v;
                this.v = sVar;
                p();
            }
            n(a2.b);
            boolean z2 = a2.f2479c;
            a((String) null);
            e eVar = this.I;
            if (!(eVar == null || eVar.j == z2)) {
                eVar.j = z2;
            }
            this.z = z2;
            p();
            this.y = new n();
            this.u = s.a(this, this.w);
            this.v = s.a(this, 1 - this.w);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(int i, int i2, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (!(d() == 0 || i == 0)) {
            a(i, xVar);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.s; i6++) {
                n nVar = this.y;
                if (nVar.f3655d == -1) {
                    i4 = nVar.f3657f;
                    i3 = this.t[i6].b(i4);
                } else {
                    i4 = this.t[i6].a(nVar.f3658g);
                    i3 = this.y.f3658g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.O, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = this.y.f3654c;
                if (i9 >= 0 && i9 < xVar.a()) {
                    ((m.b) cVar).a(this.y.f3654c, this.O[i8]);
                    n nVar2 = this.y;
                    nVar2.f3654c += nVar2.f3655d;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(androidx.recyclerview.widget.RecyclerView.s r19, d.o.c.n r20, androidx.recyclerview.widget.RecyclerView.x r21) {
        /*
        // Method dump skipped, instructions count: 934
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$s, d.o.c.n, androidx.recyclerview.widget.RecyclerView$x):int");
    }

    public final void a(View view, int i, int i2, boolean z2) {
        Rect rect = this.K;
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.e(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect2 = this.K;
        int d2 = d(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect3 = this.K;
        int d3 = d(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect3.bottom);
        if (z2 ? b(view, d2, d3, cVar) : a(view, d2, d3, cVar)) {
            view.measure(d2, d3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, RecyclerView.s sVar) {
        Runnable runnable = this.P;
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.s; i++) {
            this.t[i].c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r9.w == 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r9.w == 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (w() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (w() == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.x r13) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f3656e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.recyclerview.widget.RecyclerView.s r5, d.o.c.n r6) {
        /*
        // Method dump skipped, instructions count: 125
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$s, d.o.c.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int l = l() + k();
        int j = j() + m();
        if (this.w == 1) {
            i4 = RecyclerView.m.a(i2, rect.height() + j, h());
            i3 = RecyclerView.m.a(i, (this.x * this.s) + l, i());
        } else {
            i3 = RecyclerView.m.a(i, rect.width() + l, i());
            i4 = RecyclerView.m.a(i2, (this.x * this.s) + j, h());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2497a = i;
        a(oVar);
    }

    public final void a(f fVar, int i, int i2) {
        int i3 = fVar.f2545d;
        if (i == -1) {
            int i4 = fVar.b;
            if (i4 == Integer.MIN_VALUE) {
                fVar.b();
                i4 = fVar.b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.f2544c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.a();
                i5 = fVar.f2544c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.B.set(fVar.f2546e, false);
    }
}
