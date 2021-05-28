package e.b.a.a.g;

import a.w.c.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.batteria.recycler.DRecyclerView;
import com.bilibili.bililive.tests.R;
import d.o.c.u;
import java.util.List;

public final class g extends Fragment {
    public DRecyclerView X;

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_page, viewGroup, false);
        }
        i.a("inflater");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void u() {
        this.G = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void a(View view, Bundle bundle) {
        if (view != null) {
            DRecyclerView dRecyclerView = (DRecyclerView) view.findViewById(R.id.recycler_view);
            this.X = dRecyclerView;
            if (dRecyclerView != null) {
                dRecyclerView.setLayoutManager(new LinearLayoutManager(i()));
            }
            DRecyclerView dRecyclerView2 = this.X;
            if (dRecyclerView2 != null) {
                dRecyclerView2.getRecycledViewPool();
            }
            h hVar = new h();
            hVar.a(new i(""));
            hVar.a(new i(""));
            hVar.a(new i(""));
            DRecyclerView dRecyclerView3 = this.X;
            if (dRecyclerView3 != null) {
                dRecyclerView3.setAdapter(hVar);
            }
            u uVar = new u();
            DRecyclerView dRecyclerView4 = this.X;
            RecyclerView recyclerView = uVar.f3671a;
            if (recyclerView != dRecyclerView4) {
                if (recyclerView != null) {
                    RecyclerView.q qVar = uVar.b;
                    List<RecyclerView.q> list = recyclerView.k0;
                    if (list != null) {
                        list.remove(qVar);
                    }
                    uVar.f3671a.setOnFlingListener(null);
                }
                uVar.f3671a = dRecyclerView4;
                if (dRecyclerView4 == null) {
                    return;
                }
                if (dRecyclerView4.getOnFlingListener() == null) {
                    uVar.f3671a.a(uVar.b);
                    uVar.f3671a.setOnFlingListener(uVar);
                    new Scroller(uVar.f3671a.getContext(), new DecelerateInterpolator());
                    uVar.a();
                    return;
                }
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            return;
        }
        i.a("view");
        throw null;
    }
}
