package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.g.l.z.b;
import d.o.c.m;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean G = false;
    public int H = -1;
    public int[] I;
    public View[] J;
    public final SparseIntArray K = new SparseIntArray();
    public final SparseIntArray L = new SparseIntArray();
    public c M = new a();
    public final Rect N = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.n {

        /* renamed from: e  reason: collision with root package name */
        public int f2425e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f2426f = 0;

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f2427a = new SparseIntArray();
        public boolean b = false;

        public int a(int i, int i2) {
            if (!this.b) {
                return i % i2;
            }
            int i3 = this.f2427a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int i4 = i % i2;
            this.f2427a.put(i, i4);
            return i4;
        }

        public int b(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(1, false);
        l(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        l(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        l(RecyclerView.m.a(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int a(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.s == 1) {
            return this.H;
        }
        if (xVar.a() < 1) {
            return 0;
        }
        return a(sVar, xVar, xVar.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View a(RecyclerView.s sVar, RecyclerView.x xVar, int i, int i2, int i3) {
        s();
        int f2 = this.u.f();
        int b2 = this.u.b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c2 = c(i);
            int i5 = i(c2);
            if (i5 >= 0 && i5 < i3 && b(sVar, xVar, i5) == 0) {
                if (((RecyclerView.n) c2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = c2;
                    }
                } else if (this.u.d(c2) < b2 && this.u.a(c2) >= f2) {
                    return c2;
                } else {
                    if (view == null) {
                        view = c2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public final void a(View view, int i, int i2, boolean z) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z ? b(view, i, i2, nVar) : a(view, i, i2, nVar)) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i = this.H;
        for (int i2 = 0; i2 < this.H && cVar.a(xVar) && i > 0; i2++) {
            ((m.b) cVar2).a(cVar.f2437d, Math.max(0, cVar.f2440g));
            if (((a) this.M) != null) {
                i--;
                cVar.f2437d += cVar.f2438e;
            } else {
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int b(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.s == 0) {
            return this.H;
        }
        if (xVar.a() < 1) {
            return 0;
        }
        return a(sVar, xVar, xVar.a() - 1) + 1;
    }

    public final int b(RecyclerView.s sVar, RecyclerView.x xVar, int i) {
        if (!xVar.f2515g) {
            return this.M.a(i, this.H);
        }
        int i2 = this.L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a2 = sVar.a(i);
        if (a2 != -1) {
            return this.M.a(a2, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int c(RecyclerView.s sVar, RecyclerView.x xVar, int i) {
        if (xVar.f2515g) {
            int i2 = this.K.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            if (sVar.a(i) == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
                return 1;
            } else if (((a) this.M) != null) {
                return 1;
            } else {
                throw null;
            }
        } else if (((a) this.M) != null) {
            return 1;
        } else {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public RecyclerView.n c() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public int f(int i, int i2) {
        if (this.s != 1 || !v()) {
            int[] iArr = this.I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.I;
        int i3 = this.H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public void g(RecyclerView.x xVar) {
        this.C = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D.b();
        this.G = false;
    }

    public final void k(int i) {
        int i2;
        int[] iArr = this.I;
        int i3 = this.H;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.I = iArr;
    }

    public void l(int i) {
        if (i != this.H) {
            this.G = true;
            if (i >= 1) {
                this.H = i;
                this.M.f2427a.clear();
                p();
                return;
            }
            throw new IllegalArgumentException(e.a.a.a.a.a("Span count should be at least 1. Provided ", i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public boolean r() {
        return this.C == null && !this.G;
    }

    public final void y() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    public final void z() {
        int i;
        int i2;
        if (this.s == 1) {
            i2 = this.q - l();
            i = k();
        } else {
            i2 = this.r - j();
            i = m();
        }
        k(i2 - i);
    }

    public final int a(RecyclerView.s sVar, RecyclerView.x xVar, int i) {
        if (!xVar.f2515g) {
            return this.M.b(i, this.H);
        }
        int a2 = sVar.a(i);
        if (a2 != -1) {
            return this.M.b(a2, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final void b(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int f2 = f(bVar.f2425e, bVar.f2426f);
        if (this.s == 1) {
            i2 = RecyclerView.m.a(f2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.m.a(this.u.g(), this.p, i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int a2 = RecyclerView.m.a(f2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int a3 = RecyclerView.m.a(this.u.g(), this.o, i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = a2;
            i2 = a3;
        }
        a(view, i2, i3, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        View a2;
        int e2 = this.u.e();
        boolean z = e2 != 1073741824;
        int i18 = d() > 0 ? this.I[this.H] : 0;
        if (z) {
            z();
        }
        boolean z2 = cVar.f2438e == 1;
        int i19 = this.H;
        if (!z2) {
            i19 = b(sVar, xVar, cVar.f2437d) + c(sVar, xVar, cVar.f2437d);
        }
        int i20 = 0;
        while (i20 < this.H && cVar.a(xVar) && i19 > 0) {
            int i21 = cVar.f2437d;
            int c2 = c(sVar, xVar, i21);
            if (c2 <= this.H) {
                i19 -= c2;
                if (i19 < 0 || (a2 = cVar.a(sVar)) == null) {
                    break;
                }
                this.J[i20] = a2;
                i20++;
            } else {
                throw new IllegalArgumentException("Item at position " + i21 + " requires " + c2 + " spans but GridLayoutManager has only " + this.H + " spans.");
            }
        }
        if (i20 == 0) {
            bVar.b = true;
            return;
        }
        if (z2) {
            i3 = i20;
            i4 = 0;
            i2 = 0;
            i = 1;
        } else {
            i4 = i20 - 1;
            i3 = -1;
            i2 = 0;
            i = -1;
        }
        while (i4 != i3) {
            View view = this.J[i4];
            b bVar2 = (b) view.getLayoutParams();
            int c3 = c(sVar, xVar, i(view));
            bVar2.f2426f = c3;
            bVar2.f2425e = i2;
            i2 += c3;
            i4 += i;
        }
        float f2 = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i20; i23++) {
            View view2 = this.J[i23];
            if (cVar.k == null) {
                if (z2) {
                    a(view2);
                } else {
                    a(view2, 0, false);
                }
            } else if (z2) {
                a(view2, -1, true);
            } else {
                a(view2, 0, true);
            }
            Rect rect = this.N;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.e(view2));
            }
            b(view2, e2, false);
            int b2 = this.u.b(view2);
            if (b2 > i22) {
                i22 = b2;
            }
            float c4 = (((float) this.u.c(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f2426f);
            if (c4 > f2) {
                f2 = c4;
            }
        }
        if (z) {
            k(Math.max(Math.round(f2 * ((float) this.H)), i18));
            i22 = 0;
            for (int i24 = 0; i24 < i20; i24++) {
                View view3 = this.J[i24];
                b(view3, 1073741824, true);
                int b3 = this.u.b(view3);
                if (b3 > i22) {
                    i22 = b3;
                }
            }
        }
        for (int i25 = 0; i25 < i20; i25++) {
            View view4 = this.J[i25];
            if (this.u.b(view4) != i22) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect2 = bVar3.b;
                int i26 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i27 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int f3 = f(bVar3.f2425e, bVar3.f2426f);
                if (this.s == 1) {
                    i17 = RecyclerView.m.a(f3, 1073741824, i27, ((ViewGroup.MarginLayoutParams) bVar3).width, false);
                    i16 = View.MeasureSpec.makeMeasureSpec(i22 - i26, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, 1073741824);
                    i16 = RecyclerView.m.a(f3, 1073741824, i26, ((ViewGroup.MarginLayoutParams) bVar3).height, false);
                    i17 = makeMeasureSpec;
                }
                a(view4, i17, i16, true);
            }
        }
        bVar.f2432a = i22;
        if (this.s == 1) {
            if (cVar.f2439f == -1) {
                i8 = cVar.b;
                i15 = i8 - i22;
            } else {
                i15 = cVar.b;
                i8 = i22 + i15;
            }
            i6 = i15;
            i7 = 0;
            i5 = 0;
        } else {
            if (cVar.f2439f == -1) {
                i14 = cVar.b;
                i13 = i14 - i22;
            } else {
                i13 = cVar.b;
                i14 = i22 + i13;
            }
            i5 = i13;
            i6 = 0;
            i7 = i14;
            i8 = 0;
        }
        int i28 = 0;
        while (i28 < i20) {
            View view5 = this.J[i28];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.s != 1) {
                i6 = this.I[bVar4.f2425e] + m();
                i8 = this.u.c(view5) + i6;
            } else if (v()) {
                i7 = k() + this.I[this.H - bVar4.f2425e];
                i5 = i7 - this.u.c(view5);
            } else {
                int k = k() + this.I[bVar4.f2425e];
                i12 = i8;
                i9 = k;
                i10 = i6;
                i11 = this.u.c(view5) + k;
                a(view5, i9, i10, i11, i12);
                if (!bVar4.c() || bVar4.b()) {
                    bVar.f2433c = true;
                }
                bVar.f2434d |= view5.hasFocusable();
                i28++;
                i8 = i12;
                i7 = i11;
                i6 = i10;
                i5 = i9;
            }
            i12 = i8;
            i11 = i7;
            i10 = i6;
            i9 = i5;
            a(view5, i9, i10, i11, i12);
            if (!bVar4.c()) {
            }
            bVar.f2433c = true;
            bVar.f2434d |= view5.hasFocusable();
            i28++;
            i8 = i12;
            i7 = i11;
            i6 = i10;
            i5 = i9;
        }
        Arrays.fill(this.J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public void c(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (xVar.f2515g) {
            int d2 = d();
            for (int i = 0; i < d2; i++) {
                b bVar = (b) c(i).getLayoutParams();
                int a2 = bVar.a();
                this.K.put(a2, bVar.f2426f);
                this.L.put(a2, bVar.f2425e);
            }
        }
        super.c(sVar, xVar);
        this.K.clear();
        this.L.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b(RecyclerView recyclerView, int i, int i2) {
        this.M.f2427a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public int b(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        z();
        y();
        if (this.s == 0) {
            return 0;
        }
        return c(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i) {
        z();
        if (xVar.a() > 0 && !xVar.f2515g) {
            boolean z = i == 1;
            int b2 = b(sVar, xVar, aVar.b);
            if (z) {
                while (b2 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    b2 = b(sVar, xVar, i3);
                }
            } else {
                int a2 = xVar.a() - 1;
                int i4 = aVar.b;
                while (i4 < a2) {
                    int i5 = i4 + 1;
                    int b3 = b(sVar, xVar, i5);
                    if (b3 <= b2) {
                        break;
                    }
                    i4 = i5;
                    b2 = b3;
                }
                aVar.b = i4;
            }
        }
        y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r13 == (r2 > r15)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ff, code lost:
        if (r13 == (r2 > r8)) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
        // Method dump skipped, instructions count: 332
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView.s sVar, RecyclerView.x xVar, View view, d.g.l.z.b bVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.a(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int a2 = a(sVar, xVar, bVar2.a());
        if (this.s == 0) {
            int i5 = bVar2.f2425e;
            i3 = bVar2.f2426f;
            i = 1;
            int i6 = this.H;
            z2 = i6 > 1 && i3 == i6;
            z = false;
            i4 = i5;
            i2 = a2;
        } else {
            i3 = 1;
            i2 = bVar2.f2425e;
            i = bVar2.f2426f;
            int i7 = this.H;
            z2 = i7 > 1 && i == i7;
            z = false;
            i4 = a2;
        }
        bVar.a(b.c.a(i4, i3, i2, i, z2, z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, int i, int i2) {
        this.M.f2427a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView) {
        this.M.f2427a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.M.f2427a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.M.f2427a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public int a(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        z();
        y();
        if (this.s == 1) {
            return 0;
        }
        return c(i, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.I == null) {
            super.a(rect, i, i2);
        }
        int l = l() + k();
        int j = j() + m();
        if (this.s == 1) {
            i4 = RecyclerView.m.a(i2, rect.height() + j, h());
            int[] iArr = this.I;
            i3 = RecyclerView.m.a(i, iArr[iArr.length - 1] + l, i());
        } else {
            i3 = RecyclerView.m.a(i, rect.width() + l, i());
            int[] iArr2 = this.I;
            i4 = RecyclerView.m.a(i2, iArr2[iArr2.length - 1] + j, h());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void a(boolean z) {
        if (!z) {
            a((String) null);
            if (this.y) {
                this.y = false;
                p();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
}
