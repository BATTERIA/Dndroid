package d.b.o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import d.b.f;
import d.b.g;
import d.b.i;

public class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3037a;
    public final View b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f3038c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f3039d = new WindowManager.LayoutParams();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3040e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f3041f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3042g = new int[2];

    public y0(Context context) {
        this.f3037a = context;
        View inflate = LayoutInflater.from(context).inflate(g.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.f3038c = (TextView) inflate.findViewById(f.message);
        this.f3039d.setTitle(y0.class.getSimpleName());
        this.f3039d.packageName = this.f3037a.getPackageName();
        WindowManager.LayoutParams layoutParams = this.f3039d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.b.getParent() != null) {
            ((WindowManager) this.f3037a.getSystemService("window")).removeView(this.b);
        }
    }
}
