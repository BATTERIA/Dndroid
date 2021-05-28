package d.b.n.i;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import d.b.d;
import d.b.n.i.o;
import d.g.l.p;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2841a;
    public final h b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2842c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2843d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2844e;

    /* renamed from: f  reason: collision with root package name */
    public View f2845f;

    /* renamed from: g  reason: collision with root package name */
    public int f2846g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2847h;
    public o.a i;
    public m j;
    public PopupWindow.OnDismissListener k;
    public final PopupWindow.OnDismissListener l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            n.this.c();
        }
    }

    public n(Context context, h hVar, View view, boolean z, int i2, int i3) {
        this.f2841a = context;
        this.b = hVar;
        this.f2845f = view;
        this.f2842c = z;
        this.f2843d = i2;
        this.f2844e = i3;
    }

    public m a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.f2841a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            m eVar = Math.min(point.x, point.y) >= this.f2841a.getResources().getDimensionPixelSize(d.abc_cascading_menus_min_smallest_width) ? new e(this.f2841a, this.f2845f, this.f2843d, this.f2844e, this.f2842c) : new s(this.f2841a, this.b, this.f2845f, this.f2843d, this.f2844e, this.f2842c);
            eVar.a(this.b);
            eVar.a(this.l);
            eVar.a(this.f2845f);
            eVar.a(this.i);
            eVar.b(this.f2847h);
            eVar.a(this.f2846g);
            this.j = eVar;
        }
        return this.j;
    }

    public void a(o.a aVar) {
        this.i = aVar;
        m mVar = this.j;
        if (mVar != null) {
            mVar.a(aVar);
        }
    }

    public boolean b() {
        m mVar = this.j;
        return mVar != null && mVar.c();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean d() {
        if (b()) {
            return true;
        }
        if (this.f2845f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public final void a(int i2, int i3, boolean z, boolean z2) {
        m a2 = a();
        a2.c(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f2846g, p.h(this.f2845f)) & 7) == 5) {
                i2 -= this.f2845f.getWidth();
            }
            a2.b(i2);
            a2.c(i3);
            int i4 = (int) ((this.f2841a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f2840c = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.a();
    }
}
