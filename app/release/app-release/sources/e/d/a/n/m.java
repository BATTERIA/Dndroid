package e.d.a.n;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import d.j.d.d;
import d.j.d.n;
import e.d.a.e;
import e.d.a.i;
import java.util.HashSet;

public class m extends Fragment {
    public i X;
    public final a Y;
    public final k Z = new b(this, null);
    public final HashSet<m> a0 = new HashSet<>();
    public m b0;

    public class b implements k {
        public /* synthetic */ b(m mVar, a aVar) {
        }
    }

    public m() {
        a aVar = new a();
        this.Y = aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Activity activity) {
        d dVar;
        this.G = true;
        j jVar = j.f4216e;
        n<?> nVar = this.u;
        if (nVar == null) {
            dVar = null;
        } else {
            dVar = (d) nVar.f3480c;
        }
        m a2 = jVar.a(dVar.f());
        this.b0 = a2;
        if (a2 != this) {
            a2.a0.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        this.G = true;
        i iVar = this.X;
        if (iVar != null) {
            e eVar = iVar.f3867d;
            eVar.f3844c.a();
            ((e.d.a.s.e) eVar.f3845d).a(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t() {
        this.G = true;
        this.Y.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void v() {
        this.G = true;
        m mVar = this.b0;
        if (mVar != null) {
            mVar.a0.remove(this);
            this.b0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void w() {
        this.G = true;
        this.Y.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void x() {
        this.G = true;
        this.Y.c();
    }
}
