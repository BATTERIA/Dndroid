package e.d.a.n;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import e.d.a.e;
import e.d.a.m.i.n.h;
import java.util.HashSet;

@TargetApi(11)
public class i extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public final a f4211c;

    /* renamed from: d  reason: collision with root package name */
    public final k f4212d = new b(this, null);

    /* renamed from: e  reason: collision with root package name */
    public e.d.a.i f4213e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<i> f4214f = new HashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public i f4215g;

    public class b implements k {
        public /* synthetic */ b(i iVar, a aVar) {
        }
    }

    public i() {
        a aVar = new a();
        this.f4211c = aVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        i a2 = j.f4216e.a(getActivity().getFragmentManager());
        this.f4215g = a2;
        if (a2 != this) {
            a2.f4214f.add(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f4211c.a();
    }

    public void onDetach() {
        super.onDetach();
        i iVar = this.f4215g;
        if (iVar != null) {
            iVar.f4214f.remove(this);
            this.f4215g = null;
        }
    }

    public void onLowMemory() {
        e.d.a.i iVar = this.f4213e;
        if (iVar != null) {
            e eVar = iVar.f3867d;
            eVar.f3844c.a();
            ((e.d.a.s.e) eVar.f3845d).a(0);
        }
    }

    public void onStart() {
        super.onStart();
        this.f4211c.b();
    }

    public void onStop() {
        super.onStop();
        this.f4211c.c();
    }

    public void onTrimMemory(int i) {
        e.d.a.i iVar = this.f4213e;
        if (iVar != null) {
            e eVar = iVar.f3867d;
            eVar.f3844c.a(i);
            h hVar = (h) eVar.f3845d;
            if (hVar == null) {
                throw null;
            } else if (i >= 60) {
                hVar.a(0);
            } else if (i >= 40) {
                hVar.a(hVar.f4275c / 2);
            }
        }
    }
}
