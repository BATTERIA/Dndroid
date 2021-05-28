package d.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.a;

public class w implements a.AbstractC0112a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3666a;

    public w(RecyclerView recyclerView) {
        this.f3666a = recyclerView;
    }

    public RecyclerView.a0 a(int i) {
        RecyclerView recyclerView = this.f3666a;
        int b = recyclerView.f2449g.b();
        int i2 = 0;
        RecyclerView.a0 a0Var = null;
        while (true) {
            if (i2 >= b) {
                break;
            }
            RecyclerView.a0 g2 = RecyclerView.g(recyclerView.f2449g.d(i2));
            if (g2 != null && !g2.i() && g2.f2453c == i) {
                if (!recyclerView.f2449g.c(g2.f2452a)) {
                    a0Var = g2;
                    break;
                }
                a0Var = g2;
            }
            i2++;
        }
        if (a0Var != null && !this.f3666a.f2449g.c(a0Var.f2452a)) {
            return a0Var;
        }
        return null;
    }

    public void a(a.b bVar) {
        int i = bVar.f3581a;
        if (i == 1) {
            RecyclerView recyclerView = this.f3666a;
            recyclerView.o.a(recyclerView, bVar.b, bVar.f3583d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f3666a;
            recyclerView2.o.b(recyclerView2, bVar.b, bVar.f3583d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f3666a;
            recyclerView3.o.a(recyclerView3, bVar.b, bVar.f3583d, bVar.f3582c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f3666a;
            recyclerView4.o.a(recyclerView4, bVar.b, bVar.f3583d, 1);
        }
    }

    public void b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f3666a;
        int b = recyclerView.f2449g.b();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < b; i11++) {
            RecyclerView.a0 g2 = RecyclerView.g(recyclerView.f2449g.d(i11));
            if (g2 != null && (i9 = g2.f2453c) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    g2.a(i2 - i, false);
                } else {
                    g2.a(i3, false);
                }
                recyclerView.i0.f2514f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2446d;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = sVar.f2489c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.a0 a0Var = sVar.f2489c.get(i12);
            if (a0Var != null && (i8 = a0Var.f2453c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    a0Var.a(i2 - i, false);
                } else {
                    a0Var.a(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f3666a.l0 = true;
    }

    public void a(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f3666a;
        int b = recyclerView.f2449g.b();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < b; i6++) {
            View d2 = recyclerView.f2449g.d(i6);
            RecyclerView.a0 g2 = RecyclerView.g(d2);
            if (g2 != null && !g2.n() && (i4 = g2.f2453c) >= i && i4 < i5) {
                g2.a(2);
                g2.a(obj);
                ((RecyclerView.n) d2.getLayoutParams()).f2482c = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2446d;
        int size = sVar.f2489c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.a0 a0Var = sVar.f2489c.get(size);
                if (a0Var != null && (i3 = a0Var.f2453c) >= i && i3 < i5) {
                    a0Var.a(2);
                    sVar.b(size);
                }
            } else {
                this.f3666a.m0 = true;
                return;
            }
        }
    }

    public void a(int i, int i2) {
        RecyclerView recyclerView = this.f3666a;
        int b = recyclerView.f2449g.b();
        for (int i3 = 0; i3 < b; i3++) {
            RecyclerView.a0 g2 = RecyclerView.g(recyclerView.f2449g.d(i3));
            if (g2 != null && !g2.n() && g2.f2453c >= i) {
                g2.a(i2, false);
                recyclerView.i0.f2514f = true;
            }
        }
        RecyclerView.s sVar = recyclerView.f2446d;
        int size = sVar.f2489c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.a0 a0Var = sVar.f2489c.get(i4);
            if (a0Var != null && a0Var.f2453c >= i) {
                a0Var.a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f3666a.l0 = true;
    }
}
