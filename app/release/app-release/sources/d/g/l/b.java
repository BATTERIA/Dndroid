package d.g.l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import d.b.n.i.k;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public a f3333a;

    public interface a {
    }

    public b(Context context) {
    }

    public View a(MenuItem menuItem) {
        return ((k.a) this).b.onCreateActionView();
    }

    public void a(a aVar) {
        if (!(this.f3333a == null || aVar == null)) {
            StringBuilder a2 = e.a.a.a.a.a("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            a2.append(getClass().getSimpleName());
            a2.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", a2.toString());
        }
        this.f3333a = aVar;
    }

    public boolean a() {
        return true;
    }

    public boolean b() {
        return false;
    }
}
