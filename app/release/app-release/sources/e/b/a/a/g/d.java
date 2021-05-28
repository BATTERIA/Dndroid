package e.b.a.a.g;

import a.g;
import a.w.c.i;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.tests.R;
import java.util.ArrayList;
import java.util.List;

@g(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\t2\n\u0010\u0012\u001a\u00060\u0002R\u00020\u0000H\u0016J\u0006\u0010\u0018\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/bilibili/bililive/batteria/recycler/InteractionAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bilibili/bililive/batteria/recycler/InteractionAdapter$ViewHolder;", "()V", "list", "", "Lcom/bilibili/bililive/batteria/recycler/InteractionData;", "vhs", "addBaseData", "", "addData", "d", "clear", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewDetachedFromWindow", "refresh", "Companion", "ViewHolder", "app_release"}, mv = {1, 1, 16})
public final class d extends RecyclerView.e<a> {

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f3758c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final List<a> f3759d = new ArrayList();

    public final class a extends RecyclerView.a0 {
        public final TextView t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar, View view) {
            super(view);
            if (view != null) {
                View findViewById = view.findViewById(R.id.tv);
                i.a((Object) findViewById, "itemView.findViewById(R.id.tv)");
                this.t = (TextView) findViewById;
                return;
            }
            i.a("itemView");
            throw null;
        }
    }

    public d() {
        for (int i = 0; i <= 20; i++) {
            this.f3758c.add(new e(e.a.a.a.a.a("欢迎乔巴不小心～ ", i)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f3758c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a(int i) {
        return 0;
    }

    public final void a(e eVar) {
        if (eVar != null) {
            this.f3758c.add(eVar);
            this.f2461a.a(this.f3758c.size() - 1, 1);
            return;
        }
        i.a("d");
        throw null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$a0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void a(a aVar, int i) {
        a aVar2 = aVar;
        if (aVar2 != null) {
            StringBuilder a2 = e.a.a.a.a.a("onBindViewHolder ");
            a2.append(aVar2.hashCode());
            Log.d("DAdapter", a2.toString());
            aVar2.t.setText(this.f3758c.get(i).f3760a);
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
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.interaction_view_item_recycler, viewGroup, false);
            i.a((Object) inflate, "view");
            a aVar = new a(this, inflate);
            this.f3759d.add(aVar);
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
