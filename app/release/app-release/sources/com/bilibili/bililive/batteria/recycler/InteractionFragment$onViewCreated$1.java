package com.bilibili.bililive.batteria.recycler;

import a.g;
import a.w.c.i;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e.b.a.a.g.f;

@g(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/bilibili/bililive/batteria/recycler/InteractionFragment$onViewCreated$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "smoothScrollToPosition", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "position", "", "app_release"}, mv = {1, 1, 16})
public final class InteractionFragment$onViewCreated$1 extends LinearLayoutManager {
    public final /* synthetic */ InteractionFragment G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteractionFragment$onViewCreated$1(InteractionFragment interactionFragment, Context context) {
        super(1, false);
        this.G = interactionFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        if (recyclerView == null) {
            i.a("recyclerView");
            throw null;
        } else if (xVar != null) {
            f fVar = new f(this.G.i());
            fVar.l = 1000.0f;
            fVar.f2497a = i;
            a(fVar);
        } else {
            i.a("state");
            throw null;
        }
    }
}
