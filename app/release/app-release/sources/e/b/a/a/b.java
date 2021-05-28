package e.b.a.a;

import a.g;
import a.w.c.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.tests.R;
import java.util.ArrayList;
import java.util.List;

@g(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/bilibili/bililive/batteria/ItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bilibili/bililive/batteria/ItemAdapter$ConsolePluginViewHandler;", "()V", "pluginItems", "", "Lcom/bilibili/bililive/batteria/Item;", "addItem", "", "item", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "", "ConsolePluginViewHandler", "app_release"}, mv = {1, 1, 16})
public final class b extends RecyclerView.e<a> {

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f3743c = new ArrayList();

    public final class a extends RecyclerView.a0 {
        public final ImageView t;
        public final TextView u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, View view) {
            super(view);
            if (view != null) {
                View findViewById = view.findViewById(R.id.item_image_view);
                i.a((Object) findViewById, "itemView.findViewById(R.id.item_image_view)");
                this.t = (ImageView) findViewById;
                View findViewById2 = view.findViewById(R.id.item_text_view);
                i.a((Object) findViewById2, "itemView.findViewById(R.id.item_text_view)");
                this.u = (TextView) findViewById2;
                return;
            }
            i.a("itemView");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f3743c.size();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$a0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void a(a aVar, int i) {
        a aVar2 = aVar;
        if (aVar2 != null) {
            a aVar3 = this.f3743c.get(i);
            aVar2.u.setText(aVar3.f3741a);
            aVar2.t.setImageResource(aVar3.b);
            aVar2.f2452a.setOnClickListener(new c(aVar3));
            return;
        }
        i.a("holder");
        throw null;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$a0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a a(ViewGroup viewGroup, int i) {
        if (viewGroup != null) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_item_tools, viewGroup, false);
            i.a((Object) inflate, "LayoutInflater.from(pare…tem_tools, parent, false)");
            return new a(this, inflate);
        }
        i.a("parent");
        throw null;
    }
}
