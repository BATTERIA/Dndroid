package e.e.a.o.i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;

public class b extends RecyclerView.e<a> {

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f4386c;

    /* renamed from: d  reason: collision with root package name */
    public int f4387d;

    /* renamed from: e  reason: collision with root package name */
    public e.e.a.q.b.a f4388e;

    /* renamed from: f  reason: collision with root package name */
    public e.e.a.q.b.a f4389f;

    /* renamed from: g  reason: collision with root package name */
    public e.e.a.q.b.a f4390g;

    /* renamed from: h  reason: collision with root package name */
    public Context f4391h;
    public e.e.a.x.b i;

    public class a extends RecyclerView.a0 {
        public c t;

        public a(b bVar, View view, c cVar) {
            super(view);
            RecyclerView.m layoutManager = bVar.f4386c.getLayoutManager();
            view.setLayoutParams(layoutManager instanceof StaggeredGridLayoutManager ? new StaggeredGridLayoutManager.c(-1, -2) : layoutManager instanceof GridLayoutManager ? new GridLayoutManager.b(-1, -2) : new RecyclerView.n(-1, -2));
            this.t = cVar;
        }
    }

    public b(Context context, e.e.a.x.b bVar) {
        this.f4391h = context;
        this.i = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f4387d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a(int i2) {
        Object a2;
        e.e.a.q.b.a aVar = this.f4388e;
        if (aVar == null || (a2 = aVar.a(Integer.valueOf(i2))) == null) {
            return 0;
        }
        return ((Number) a2).intValue();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$a0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void a(a aVar, int i2) {
        a aVar2 = aVar;
        e.e.a.q.b.a aVar3 = this.f4390g;
        if (aVar3 != null && aVar2.t != null) {
            aVar3.a(Integer.valueOf(i2), aVar2.t);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void a(RecyclerView recyclerView) {
        this.f4386c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void b(RecyclerView recyclerView) {
        this.f4386c = null;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$a0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a a(ViewGroup viewGroup, int i2) {
        e.e.a.q.b.a aVar = this.f4389f;
        if (aVar == null) {
            return new a(this, new View(this.f4391h), null);
        }
        c cVar = (c) aVar.a(Integer.valueOf(i2));
        if (cVar == null) {
            return new a(this, new View(this.f4391h), null);
        }
        j jVar = (j) ((e.e.a.x.a) this.i).a(cVar.a("objID"));
        return jVar == null ? new a(this, new View(this.f4391h), null) : new a(this, jVar.getView(), cVar);
    }
}
