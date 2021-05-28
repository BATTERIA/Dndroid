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
import d.o.c.m;
import d.o.c.o;
import d.o.c.s;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public int A;
    public int B;
    public d C;
    public final a D;
    public final b E;
    public int F;
    public int s;
    public c t;
    public s u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public s f2428a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2429c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2430d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2431e;

        public a() {
            b();
        }

        public void a() {
            this.f2429c = this.f2430d ? this.f2428a.b() : this.f2428a.f();
        }

        public void a(View view, int i) {
            if (this.f2430d) {
                this.f2429c = this.f2428a.h() + this.f2428a.a(view);
            } else {
                this.f2429c = this.f2428a.d(view);
            }
            this.b = i;
        }

        public void b() {
            this.b = -1;
            this.f2429c = Integer.MIN_VALUE;
            this.f2430d = false;
            this.f2431e = false;
        }

        public void b(View view, int i) {
            int i2;
            int h2 = this.f2428a.h();
            if (h2 >= 0) {
                a(view, i);
                return;
            }
            this.b = i;
            if (this.f2430d) {
                int b2 = (this.f2428a.b() - h2) - this.f2428a.a(view);
                this.f2429c = this.f2428a.b() - b2;
                if (b2 > 0) {
                    int b3 = this.f2429c - this.f2428a.b(view);
                    int f2 = this.f2428a.f();
                    int min = b3 - (Math.min(this.f2428a.d(view) - f2, 0) + f2);
                    if (min < 0) {
                        i2 = Math.min(b2, -min) + this.f2429c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int d2 = this.f2428a.d(view);
                int f3 = d2 - this.f2428a.f();
                this.f2429c = d2;
                if (f3 > 0) {
                    int b4 = (this.f2428a.b() - Math.min(0, (this.f2428a.b() - h2) - this.f2428a.a(view))) - (this.f2428a.b(view) + d2);
                    if (b4 < 0) {
                        i2 = this.f2429c - Math.min(f3, -b4);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f2429c = i2;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("AnchorInfo{mPosition=");
            a2.append(this.b);
            a2.append(", mCoordinate=");
            a2.append(this.f2429c);
            a2.append(", mLayoutFromEnd=");
            a2.append(this.f2430d);
            a2.append(", mValid=");
            a2.append(this.f2431e);
            a2.append('}');
            return a2.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2432a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2433c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2434d;
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f2442c;

        /* renamed from: d  reason: collision with root package name */
        public int f2443d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2444e;

        public static class a implements Parcelable.Creator<d> {
            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f2442c = parcel.readInt();
            this.f2443d = parcel.readInt();
            this.f2444e = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f2442c = dVar.f2442c;
            this.f2443d = dVar.f2443d;
            this.f2444e = dVar.f2444e;
        }

        public boolean a() {
            return this.f2442c >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2442c);
            parcel.writeInt(this.f2443d);
            parcel.writeInt(this.f2444e ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.C = null;
        this.D = new a();
        this.E = new b();
        this.F = 2;
        j(i);
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            p();
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int a(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.s == 1) {
            return 0;
        }
        return c(i, sVar, xVar);
    }

    public final int a(int i, RecyclerView.s sVar, RecyclerView.x xVar, boolean z2) {
        int b2;
        int b3 = this.u.b() - i;
        if (b3 <= 0) {
            return 0;
        }
        int i2 = -c(-b3, sVar, xVar);
        int i3 = i + i2;
        if (!z2 || (b2 = this.u.b() - i3) <= 0) {
            return i2;
        }
        this.u.a(b2);
        return b2 + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int a(RecyclerView.x xVar) {
        return h(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public PointF a(int i) {
        if (d() == 0) {
            return null;
        }
        boolean z2 = false;
        int i2 = 1;
        if (i < i(c(0))) {
            z2 = true;
        }
        if (z2 != this.x) {
            i2 = -1;
        }
        return this.s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public View a(int i, int i2, boolean z2, boolean z3) {
        s();
        int i3 = 320;
        int i4 = z2 ? 24579 : 320;
        if (!z3) {
            i3 = 0;
        }
        return (this.s == 0 ? this.f2472e : this.f2473f).a(i, i2, i4, i3);
    }

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
            if (i5 >= 0 && i5 < i3) {
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

    public final View a(boolean z2, boolean z3) {
        int d2;
        int i;
        if (this.x) {
            d2 = 0;
            i = d();
        } else {
            d2 = d() - 1;
            i = -1;
        }
        return a(d2, i, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(int i, int i2, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (d() != 0 && i != 0) {
            s();
            a(i > 0 ? 1 : -1, Math.abs(i), true, xVar);
            a(xVar, this.t, cVar);
        }
    }

    public final void a(int i, int i2, boolean z2, RecyclerView.x xVar) {
        int i3;
        this.t.l = w();
        this.t.f2441h = k(xVar);
        c cVar = this.t;
        cVar.f2439f = i;
        int i4 = -1;
        if (i == 1) {
            cVar.f2441h = this.u.c() + cVar.f2441h;
            View t2 = t();
            c cVar2 = this.t;
            if (!this.x) {
                i4 = 1;
            }
            cVar2.f2438e = i4;
            c cVar3 = this.t;
            int i5 = i(t2);
            c cVar4 = this.t;
            cVar3.f2437d = i5 + cVar4.f2438e;
            cVar4.b = this.u.a(t2);
            i3 = this.u.a(t2) - this.u.b();
        } else {
            View u2 = u();
            c cVar5 = this.t;
            cVar5.f2441h = this.u.f() + cVar5.f2441h;
            c cVar6 = this.t;
            if (this.x) {
                i4 = 1;
            }
            cVar6.f2438e = i4;
            c cVar7 = this.t;
            int i6 = i(u2);
            c cVar8 = this.t;
            cVar7.f2437d = i6 + cVar8.f2438e;
            cVar8.b = this.u.d(u2);
            i3 = (-this.u.d(u2)) + this.u.f();
        }
        c cVar9 = this.t;
        cVar9.f2436c = i2;
        if (z2) {
            cVar9.f2436c = i2 - i3;
        }
        this.t.f2440g = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(int i, RecyclerView.m.c cVar) {
        boolean z2;
        int i2;
        d dVar = this.C;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            x();
            z2 = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z2 ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.C;
            z2 = dVar2.f2444e;
            i2 = dVar2.f2442c;
        }
        if (!z2) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.F && i2 >= 0 && i2 < i; i4++) {
            ((m.b) cVar).a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.C = (d) parcelable;
            p();
        }
    }

    public final void a(RecyclerView.s sVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    a(i3, sVar);
                }
                return;
            }
            while (i > i2) {
                a(i, sVar);
                i--;
            }
        }
    }

    public void a(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i) {
    }

    public void a(RecyclerView.x xVar, c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.f2437d;
        if (i >= 0 && i < xVar.a()) {
            ((m.b) cVar2).a(i, Math.max(0, cVar.f2440g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, RecyclerView.s sVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(String str) {
        RecyclerView recyclerView;
        if (this.C == null && (recyclerView = this.b) != null) {
            recyclerView.a(str);
        }
    }

    public void a(boolean z2) {
        a((String) null);
        if (this.y != z2) {
            this.y = z2;
            p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int b(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.s == 0) {
            return 0;
        }
        return c(i, sVar, xVar);
    }

    public final int b(int i, RecyclerView.s sVar, RecyclerView.x xVar, boolean z2) {
        int f2;
        int f3 = i - this.u.f();
        if (f3 <= 0) {
            return 0;
        }
        int i2 = -c(f3, sVar, xVar);
        int i3 = i + i2;
        if (!z2 || (f2 = i3 - this.u.f()) <= 0) {
            return i2;
        }
        this.u.a(-f2);
        return i2 - f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int b(RecyclerView.x xVar) {
        return i(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View b(int i) {
        int d2 = d();
        if (d2 == 0) {
            return null;
        }
        int i2 = i - i(c(0));
        if (i2 >= 0 && i2 < d2) {
            View c2 = c(i2);
            if (i(c2) == i) {
                return c2;
            }
        }
        return super.b(i);
    }

    public final View b(boolean z2, boolean z3) {
        int i;
        int d2;
        if (this.x) {
            i = d() - 1;
            d2 = -1;
        } else {
            i = 0;
            d2 = d();
        }
        return a(i, d2, z2, z3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b() {
        return this.s == 1;
    }

    public int c(int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (d() == 0 || i == 0) {
            return 0;
        }
        this.t.f2435a = true;
        s();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, xVar);
        c cVar = this.t;
        int a2 = a(sVar, cVar, xVar, false) + cVar.f2440g;
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.a(-i);
        this.t.j = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int c(RecyclerView.x xVar) {
        return j(xVar);
    }

    public View c(int i, int i2) {
        int i3;
        int i4;
        s();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return c(i);
        }
        if (this.u.d(c(i)) < this.u.f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.s == 0 ? this.f2472e : this.f2473f).a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n c() {
        return new RecyclerView.n(-2, -2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0177  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.x r18) {
        /*
        // Method dump skipped, instructions count: 1053
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int d(RecyclerView.x xVar) {
        return h(xVar);
    }

    public final View d(RecyclerView.s sVar, RecyclerView.x xVar) {
        return a(sVar, xVar, 0, d(), xVar.a());
    }

    public final void d(int i, int i2) {
        this.t.f2436c = this.u.b() - i2;
        this.t.f2438e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.f2437d = i;
        cVar.f2439f = 1;
        cVar.b = i2;
        cVar.f2440g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int e(RecyclerView.x xVar) {
        return i(xVar);
    }

    public final View e(RecyclerView.s sVar, RecyclerView.x xVar) {
        return a(sVar, xVar, d() - 1, -1, xVar.a());
    }

    public final void e(int i, int i2) {
        this.t.f2436c = i2 - this.u.f();
        c cVar = this.t;
        cVar.f2437d = i;
        cVar.f2438e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f2439f = -1;
        cVar2.b = i2;
        cVar2.f2440g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int f(RecyclerView.x xVar) {
        return j(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void g(RecyclerView.x xVar) {
        this.C = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D.b();
    }

    public final int h(RecyclerView.x xVar) {
        if (d() == 0) {
            return 0;
        }
        s();
        return c.a.a.a.a.a(xVar, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void h(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        d dVar = this.C;
        if (dVar != null) {
            dVar.f2442c = -1;
        }
        p();
    }

    public int i(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && v()) ? -1 : 1 : (this.s != 1 && v()) ? 1 : -1;
    }

    public final int i(RecyclerView.x xVar) {
        if (d() == 0) {
            return 0;
        }
        s();
        return c.a.a.a.a.a(xVar, this.u, b(!this.z, true), a(!this.z, true), this, this.z, this.x);
    }

    public final int j(RecyclerView.x xVar) {
        if (d() == 0) {
            return 0;
        }
        s();
        return c.a.a.a.a.b(xVar, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    public void j(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i != this.s || this.u == null) {
                s a2 = s.a(this, i);
                this.u = a2;
                this.D.f2428a = a2;
                this.s = i;
                p();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(e.a.a.a.a.a("invalid orientation:", i));
    }

    public int k(RecyclerView.x xVar) {
        if (xVar.f2510a != -1) {
            return this.u.g();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean n() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable o() {
        if (this.C != null) {
            return new d(this.C);
        }
        d dVar = new d();
        if (d() > 0) {
            s();
            boolean z2 = this.v ^ this.x;
            dVar.f2444e = z2;
            if (z2) {
                View t2 = t();
                dVar.f2443d = this.u.b() - this.u.a(t2);
                dVar.f2442c = i(t2);
            } else {
                View u2 = u();
                dVar.f2442c = i(u2);
                dVar.f2443d = this.u.d(u2) - this.u.f();
            }
        } else {
            dVar.f2442c = -1;
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean q() {
        boolean z2;
        if (!(this.p == 1073741824 || this.o == 1073741824)) {
            int d2 = d();
            int i = 0;
            while (true) {
                if (i >= d2) {
                    z2 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = c(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z2 = true;
                    break;
                }
                i++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean r() {
        return this.C == null && this.v == this.y;
    }

    public void s() {
        if (this.t == null) {
            this.t = new c();
        }
    }

    public final View t() {
        return c(this.x ? 0 : d() - 1);
    }

    public final View u() {
        return c(this.x ? d() - 1 : 0);
    }

    public boolean v() {
        return g() == 1;
    }

    public boolean w() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    public final void x() {
        this.x = (this.s == 1 || !v()) ? this.w : !this.w;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2435a = true;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public int f2436c;

        /* renamed from: d  reason: collision with root package name */
        public int f2437d;

        /* renamed from: e  reason: collision with root package name */
        public int f2438e;

        /* renamed from: f  reason: collision with root package name */
        public int f2439f;

        /* renamed from: g  reason: collision with root package name */
        public int f2440g;

        /* renamed from: h  reason: collision with root package name */
        public int f2441h = 0;
        public boolean i;
        public int j;
        public List<RecyclerView.a0> k = null;
        public boolean l;

        public void a(View view) {
            int i2;
            int a2;
            int size = this.k.size();
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < size; i4++) {
                View view3 = this.k.get(i4).f2452a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a2 = (nVar.a() - this.f2437d) * this.f2438e) >= 0 && a2 < i3) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i3 = a2;
                }
            }
            if (view2 == null) {
                i2 = -1;
            } else {
                i2 = ((RecyclerView.n) view2.getLayoutParams()).a();
            }
            this.f2437d = i2;
        }

        public boolean a(RecyclerView.x xVar) {
            int i2 = this.f2437d;
            return i2 >= 0 && i2 < xVar.a();
        }

        public View a(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.k;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.k.get(i2).f2452a;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.c() && this.f2437d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = sVar.a(this.f2437d, false, Long.MAX_VALUE).f2452a;
            this.f2437d += this.f2438e;
            return view2;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.C = null;
        this.D = new a();
        this.E = new b();
        this.F = 2;
        RecyclerView.m.d a2 = RecyclerView.m.a(context, attributeSet, i, i2);
        j(a2.f2478a);
        boolean z2 = a2.f2479c;
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            p();
        }
        a(a2.f2480d);
    }

    public int a(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z2) {
        int i = cVar.f2436c;
        int i2 = cVar.f2440g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f2440g = i2 + i;
            }
            a(sVar, cVar);
        }
        int i3 = cVar.f2436c + cVar.f2441h;
        b bVar = this.E;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.a(xVar)) {
                break;
            }
            bVar.f2432a = 0;
            bVar.b = false;
            bVar.f2433c = false;
            bVar.f2434d = false;
            a(sVar, xVar, cVar, bVar);
            if (!bVar.b) {
                cVar.b = (bVar.f2432a * cVar.f2439f) + cVar.b;
                if (!bVar.f2433c || this.t.k != null || !xVar.f2515g) {
                    int i4 = cVar.f2436c;
                    int i5 = bVar.f2432a;
                    cVar.f2436c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f2440g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f2432a;
                    cVar.f2440g = i7;
                    int i8 = cVar.f2436c;
                    if (i8 < 0) {
                        cVar.f2440g = i7 + i8;
                    }
                    a(sVar, cVar);
                }
                if (z2 && bVar.f2434d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2436c;
    }

    public void a(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a2 = cVar.a(sVar);
        if (a2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) a2.getLayoutParams();
        if (cVar.k == null) {
            if (this.x == (cVar.f2439f == -1)) {
                a(a2, -1, false);
            } else {
                a(a2, 0, false);
            }
        } else {
            if (this.x == (cVar.f2439f == -1)) {
                a(a2, -1, true);
            } else {
                a(a2, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) a2.getLayoutParams();
        Rect e2 = this.b.e(a2);
        int a3 = RecyclerView.m.a(this.q, this.o, l() + k() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + e2.left + e2.right + 0, ((ViewGroup.MarginLayoutParams) nVar2).width, a());
        int a4 = RecyclerView.m.a(this.r, this.p, j() + m() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + e2.top + e2.bottom + 0, ((ViewGroup.MarginLayoutParams) nVar2).height, b());
        if (a(a2, a3, a4, nVar2)) {
            a2.measure(a3, a4);
        }
        bVar.f2432a = this.u.b(a2);
        if (this.s == 1) {
            if (v()) {
                i5 = this.q - l();
                i4 = i5 - this.u.c(a2);
            } else {
                i4 = k();
                i5 = this.u.c(a2) + i4;
            }
            int i6 = cVar.f2439f;
            int i7 = cVar.b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f2432a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f2432a + i7;
            }
        } else {
            int m = m();
            int c2 = this.u.c(a2) + m;
            int i8 = cVar.f2439f;
            int i9 = cVar.b;
            if (i8 == -1) {
                i2 = i9;
                i3 = m;
                i = c2;
                i4 = i9 - bVar.f2432a;
            } else {
                i3 = m;
                i2 = bVar.f2432a + i9;
                i = c2;
                i4 = i9;
            }
        }
        a(a2, i4, i3, i2, i);
        if (nVar.c() || nVar.b()) {
            bVar.f2433c = true;
        }
        bVar.f2434d = a2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View a(View view, int i, RecyclerView.s sVar, RecyclerView.x xVar) {
        int i2;
        View view2;
        x();
        if (d() == 0 || (i2 = i(i)) == Integer.MIN_VALUE) {
            return null;
        }
        s();
        s();
        a(i2, (int) (((float) this.u.g()) * 0.33333334f), false, xVar);
        c cVar = this.t;
        cVar.f2440g = Integer.MIN_VALUE;
        cVar.f2435a = false;
        a(sVar, cVar, xVar, true);
        if (i2 == -1) {
            if (this.x) {
                view2 = c(d() - 1, -1);
            } else {
                view2 = c(0, d());
            }
        } else if (this.x) {
            view2 = c(0, d());
        } else {
            view2 = c(d() - 1, -1);
        }
        View u2 = i2 == -1 ? u() : t();
        if (!u2.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return u2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (d() > 0) {
            View a2 = a(0, d(), false, true);
            int i = -1;
            accessibilityEvent.setFromIndex(a2 == null ? -1 : i(a2));
            View a3 = a(d() - 1, -1, false, true);
            if (a3 != null) {
                i = i(a3);
            }
            accessibilityEvent.setToIndex(i);
        }
    }

    public final void a(RecyclerView.s sVar, c cVar) {
        if (cVar.f2435a && !cVar.l) {
            int i = cVar.f2439f;
            int i2 = cVar.f2440g;
            if (i == -1) {
                int d2 = d();
                if (i2 >= 0) {
                    int a2 = this.u.a() - i2;
                    if (this.x) {
                        for (int i3 = 0; i3 < d2; i3++) {
                            View c2 = c(i3);
                            if (this.u.d(c2) < a2 || this.u.f(c2) < a2) {
                                a(sVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = d2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View c3 = c(i5);
                        if (this.u.d(c3) < a2 || this.u.f(c3) < a2) {
                            a(sVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int d3 = d();
                if (this.x) {
                    int i6 = d3 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View c4 = c(i7);
                        if (this.u.a(c4) > i2 || this.u.e(c4) > i2) {
                            a(sVar, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                for (int i8 = 0; i8 < d3; i8++) {
                    View c5 = c(i8);
                    if (this.u.a(c5) > i2 || this.u.e(c5) > i2) {
                        a(sVar, 0, i8);
                        return;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.f2497a = i;
        a(oVar);
    }
}
