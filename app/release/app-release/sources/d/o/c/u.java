package d.o.c;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class u extends z {

    /* renamed from: c  reason: collision with root package name */
    public s f3663c;

    /* renamed from: d  reason: collision with root package name */
    public s f3664d;

    public final int a(RecyclerView.m mVar, View view, s sVar) {
        int i;
        int b = (sVar.b(view) / 2) + sVar.d(view);
        if (mVar.e()) {
            i = (sVar.g() / 2) + sVar.f();
        } else {
            i = sVar.a() / 2;
        }
        return b - i;
    }

    public final View a(RecyclerView.m mVar, s sVar) {
        int d2 = mVar.d();
        View view = null;
        if (d2 == 0) {
            return null;
        }
        int g2 = mVar.e() ? (sVar.g() / 2) + sVar.f() : sVar.a() / 2;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < d2; i2++) {
            View c2 = mVar.c(i2);
            int abs = Math.abs(((sVar.b(c2) / 2) + sVar.d(c2)) - g2);
            if (abs < i) {
                view = c2;
                i = abs;
            }
        }
        return view;
    }

    public final s a(RecyclerView.m mVar) {
        s sVar = this.f3664d;
        if (sVar == null || sVar.f3661a != mVar) {
            this.f3664d = new q(mVar);
        }
        return this.f3664d;
    }

    @Override // d.o.c.z
    public int[] a(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.a()) {
            iArr[0] = a(mVar, view, a(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.b()) {
            iArr[1] = a(mVar, view, b(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final View b(RecyclerView.m mVar, s sVar) {
        int d2 = mVar.d();
        View view = null;
        if (d2 == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < d2; i2++) {
            View c2 = mVar.c(i2);
            int d3 = sVar.d(c2);
            if (d3 < i) {
                view = c2;
                i = d3;
            }
        }
        return view;
    }

    public final s b(RecyclerView.m mVar) {
        s sVar = this.f3663c;
        if (sVar == null || sVar.f3661a != mVar) {
            this.f3663c = new r(mVar);
        }
        return this.f3663c;
    }
}
