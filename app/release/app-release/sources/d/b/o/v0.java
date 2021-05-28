package d.b.o;

import android.view.View;
import android.view.Window;
import d.b.n.i.a;

public class v0 implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final a f3000c = new a(this.f3001d.f3010a.getContext(), 0, 16908332, 0, 0, this.f3001d.i);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ w0 f3001d;

    public v0(w0 w0Var) {
        this.f3001d = w0Var;
    }

    public void onClick(View view) {
        w0 w0Var = this.f3001d;
        Window.Callback callback = w0Var.l;
        if (callback != null && w0Var.m) {
            callback.onMenuItemSelected(0, this.f3000c);
        }
    }
}
