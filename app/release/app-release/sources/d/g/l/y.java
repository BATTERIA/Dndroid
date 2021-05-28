package d.g.l;

import android.os.Build;
import android.view.WindowInsets;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3360a;

    public y(Object obj) {
        this.f3360a = obj;
    }

    public static y a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new y(obj);
    }

    public static Object a(y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar.f3360a;
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3360a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public y a(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new y(((WindowInsets) this.f3360a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3360a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3360a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3360a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean e() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f3360a).isConsumed();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f3360a;
        Object obj3 = ((y) obj).f3360a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f3360a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
