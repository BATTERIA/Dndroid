package e.b.a.a.g;

import a.w.c.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bilibili.bililive.batteria.recycler.DRecyclerView;
import com.bilibili.bililive.tests.R;
import e.f.a.g;
import java.util.List;

public final class b extends Fragment {
    public static final List<Integer> Z = g.g(Integer.valueOf((int) R.drawable.list), Integer.valueOf((int) R.drawable.web), Integer.valueOf((int) R.drawable.image), Integer.valueOf((int) R.drawable.network), Integer.valueOf((int) R.drawable.progress), Integer.valueOf((int) R.drawable.ic_more_cache));
    public DRecyclerView X;
    public final String Y;

    public b(String str) {
        if (str != null) {
            this.Y = str;
        } else {
            i.a("signal");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_d, viewGroup, false);
        }
        i.a("inflater");
        throw null;
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
                dRecyclerView.setSignal(this.Y);
            }
            DRecyclerView dRecyclerView2 = this.X;
            if (dRecyclerView2 != null) {
                dRecyclerView2.setLayoutManager(new LinearLayoutManager(i()));
            }
            a aVar = new a();
            for (int i = 0; i <= 10; i++) {
                aVar.f3755c.add(new c(String.valueOf(i), Z.get(i % 6).intValue()));
            }
            DRecyclerView dRecyclerView3 = this.X;
            if (dRecyclerView3 != null) {
                dRecyclerView3.setAdapter(aVar);
                return;
            }
            return;
        }
        i.a("view");
        throw null;
    }
}
