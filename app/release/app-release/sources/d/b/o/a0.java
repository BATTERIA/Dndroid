package d.b.o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import d.b.n.i.o;
import d.g.l.u;

public interface a0 {
    u a(int i, long j);

    void a(int i);

    void a(Menu menu, o.a aVar);

    void a(m0 m0Var);

    void a(boolean z);

    boolean a();

    void b(int i);

    void b(boolean z);

    boolean b();

    void c(int i);

    boolean c();

    void collapseActionView();

    boolean d();

    void e();

    boolean f();

    void g();

    CharSequence getTitle();

    int h();

    ViewGroup i();

    Context j();

    int k();

    void l();

    boolean m();

    void n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
