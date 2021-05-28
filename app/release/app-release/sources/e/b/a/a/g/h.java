package e.b.a.a.g;

import a.g;
import a.w.c.i;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.tests.R;
import java.util.ArrayList;
import java.util.List;

@g(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001c\u0010\u000f\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0002R\u00020\u0000H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bilibili/bililive/batteria/recycler/PagerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bilibili/bililive/batteria/recycler/PagerAdapter$ViewHolder;", "()V", "list", "", "Lcom/bilibili/bililive/batteria/recycler/PagerData;", "vhs", "addData", "", "d", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "Companion", "ViewHolder", "app_release"}, mv = {1, 1, 16})
public final class h extends RecyclerView.e<a> {

    /* renamed from: c  reason: collision with root package name */
    public final List<i> f3761c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f3762d = new ArrayList();

    public final class a extends RecyclerView.a0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h hVar, View view) {
            super(view);
            if (view != null) {
            } else {
                i.a("itemView");
                throw null;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f3761c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a(int i) {
        return 0;
    }

    public final void a(i iVar) {
        if (iVar != null) {
            this.f3761c.add(iVar);
        } else {
            i.a("d");
            throw null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$a0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void a(a aVar, int i) {
        a aVar2 = aVar;
        if (aVar2 != null) {
            StringBuilder a2 = e.a.a.a.a.a("onBindViewHolder ");
            a2.append(aVar2.hashCode());
            Log.d("DAdapter", a2.toString());
            return;
        }
        i.a("holder");
        throw null;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$a0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a a(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            Log.d("DAdapter", "onCreateViewHolder");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.page_view_item_recycler, viewGroup, false);
            i.a((Object) inflate, "view");
            a aVar = new a(this, inflate);
            this.f3762d.add(aVar);
            return aVar;
        }
        i.a("parent");
        throw null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$a0] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void a(a aVar) {
        a aVar2 = aVar;
        if (aVar2 != null) {
            StringBuilder a2 = e.a.a.a.a.a("onViewDetachedFromWindow ");
            a2.append(aVar2.hashCode());
            Log.d("DAdapter", a2.toString());
            return;
        }
        i.a("holder");
        throw null;
    }
}
