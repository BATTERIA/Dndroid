package d.j.d;

import android.view.View;
import androidx.fragment.app.Fragment;

public class c extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Fragment f3414a;

    public c(Fragment fragment) {
        this.f3414a = fragment;
    }

    @Override // d.j.d.j
    public View a(int i) {
        View view = this.f3414a.I;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // d.j.d.j
    public boolean d() {
        return this.f3414a.I != null;
    }
}
