package com.bilibili.bililive.batteria.recycler;

import a.g;
import a.q;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.bililive.tests.R;
import e.b.a.a.g.d;
import e.b.a.a.g.e;
import java.util.ArrayList;
import java.util.List;

@g(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0002$%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/bilibili/bililive/batteria/recycler/InteractionFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/bilibili/bililive/batteria/recycler/InteractionAdapter;", "getAdapter", "()Lcom/bilibili/bililive/batteria/recycler/InteractionAdapter;", "setAdapter", "(Lcom/bilibili/bililive/batteria/recycler/InteractionAdapter;)V", "isRunning", "", "recyclerView", "Lcom/bilibili/bililive/batteria/recycler/DRecyclerView;", "getRecyclerView", "()Lcom/bilibili/bililive/batteria/recycler/DRecyclerView;", "setRecyclerView", "(Lcom/bilibili/bililive/batteria/recycler/DRecyclerView;)V", "t", "", "workers", "", "Ljava/lang/Thread;", "interrupt", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "Companion", "Worker", "app_release"}, mv = {1, 1, 16})
public final class InteractionFragment extends Fragment {
    public DRecyclerView X;
    public d Y;
    public final List<Thread> Z = new ArrayList();
    public int a0 = 1;
    public boolean b0;

    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class a extends j implements a.w.b.a<q> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2598c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Object f2599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(0);
            this.f2598c = i;
            this.f2599d = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public final q a() {
            switch (this.f2598c) {
                case 0:
                    d dVar = ((InteractionFragment) this.f2599d).Y;
                    if (dVar != null) {
                        int a2 = dVar.a();
                        for (int i = 1; i <= 110; i++) {
                            d dVar2 = ((InteractionFragment) this.f2599d).Y;
                            if (dVar2 != null) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("keep adding ");
                                InteractionFragment interactionFragment = (InteractionFragment) this.f2599d;
                                int i2 = interactionFragment.a0;
                                interactionFragment.a0 = i2 + 1;
                                sb.append(i2);
                                dVar2.a(new e(sb.toString()));
                            }
                        }
                        d dVar3 = ((InteractionFragment) this.f2599d).Y;
                        if (dVar3 != null) {
                            dVar3.f2461a.a(a2, d.b.j.AppCompatTheme_viewInflaterClass);
                        }
                        InteractionFragment interactionFragment2 = (InteractionFragment) this.f2599d;
                        DRecyclerView dRecyclerView = interactionFragment2.X;
                        if (dRecyclerView != null) {
                            d dVar4 = interactionFragment2.Y;
                            if (dVar4 != null) {
                                dRecyclerView.e(dVar4.a() - 1);
                            } else {
                                i.a();
                                throw null;
                            }
                        }
                        return q.f2100a;
                    }
                    i.a();
                    throw null;
                case 1:
                    d dVar5 = ((InteractionFragment) this.f2599d).Y;
                    if (dVar5 != null) {
                        dVar5.a(new e("add last"));
                    }
                    return q.f2100a;
                case 2:
                    d dVar6 = ((InteractionFragment) this.f2599d).Y;
                    if (dVar6 != null) {
                        dVar6.f2461a.a();
                    }
                    return q.f2100a;
                case 3:
                    d dVar7 = ((InteractionFragment) this.f2599d).Y;
                    if (dVar7 != null) {
                        dVar7.f3758c.clear();
                        for (int i3 = 0; i3 <= 20; i3++) {
                            List<e> list = dVar7.f3758c;
                            list.add(new e("欢迎乔巴不小心～ " + i3));
                        }
                        dVar7.f2461a.a();
                    }
                    InteractionFragment interactionFragment3 = (InteractionFragment) this.f2599d;
                    DRecyclerView dRecyclerView2 = interactionFragment3.X;
                    if (dRecyclerView2 != null) {
                        d dVar8 = interactionFragment3.Y;
                        if (dVar8 != null) {
                            dRecyclerView2.e(dVar8.a() - 1);
                        } else {
                            i.a();
                            throw null;
                        }
                    }
                    return q.f2100a;
                case 4:
                    d dVar9 = ((InteractionFragment) this.f2599d).Y;
                    if (dVar9 != null) {
                        dVar9.f3758c.clear();
                        dVar9.f2461a.a();
                    }
                    return q.f2100a;
                case 5:
                    InteractionFragment interactionFragment4 = (InteractionFragment) this.f2599d;
                    if (!interactionFragment4.b0) {
                        interactionFragment4.b0 = true;
                        b bVar = new b();
                        bVar.start();
                        ((InteractionFragment) this.f2599d).Z.add(bVar);
                    }
                    return q.f2100a;
                case 6:
                    ((InteractionFragment) this.f2599d).A();
                    ((InteractionFragment) this.f2599d).b0 = false;
                    return q.f2100a;
                case 7:
                    InteractionFragment interactionFragment5 = (InteractionFragment) this.f2599d;
                    DRecyclerView dRecyclerView3 = interactionFragment5.X;
                    if (dRecyclerView3 != null) {
                        d dVar10 = interactionFragment5.Y;
                        if (dVar10 != null) {
                            dRecyclerView3.e(dVar10.a() - 1);
                        } else {
                            i.a();
                            throw null;
                        }
                    }
                    return q.f2100a;
                case 8:
                    d dVar11 = ((InteractionFragment) this.f2599d).Y;
                    if (dVar11 != null) {
                        int a3 = dVar11.a();
                        for (int i4 = 1; i4 <= 10; i4++) {
                            d dVar12 = ((InteractionFragment) this.f2599d).Y;
                            if (dVar12 != null) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("keep adding ");
                                InteractionFragment interactionFragment6 = (InteractionFragment) this.f2599d;
                                int i5 = interactionFragment6.a0;
                                interactionFragment6.a0 = i5 + 1;
                                sb2.append(i5);
                                dVar12.a(new e(sb2.toString()));
                            }
                        }
                        d dVar13 = ((InteractionFragment) this.f2599d).Y;
                        if (dVar13 != null) {
                            dVar13.f2461a.a(a3, 10);
                        }
                        InteractionFragment interactionFragment7 = (InteractionFragment) this.f2599d;
                        DRecyclerView dRecyclerView4 = interactionFragment7.X;
                        if (dRecyclerView4 != null) {
                            d dVar14 = interactionFragment7.Y;
                            if (dVar14 != null) {
                                dRecyclerView4.e(dVar14.a() - 1);
                            } else {
                                i.a();
                                throw null;
                            }
                        }
                        return q.f2100a;
                    }
                    i.a();
                    throw null;
                default:
                    throw null;
            }
        }
    }

    @g(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/bilibili/bililive/batteria/recycler/InteractionFragment$Worker;", "Ljava/lang/Thread;", "(Lcom/bilibili/bililive/batteria/recycler/InteractionFragment;)V", "run", "", "app_release"}, mv = {1, 1, 16})
    public final class b extends Thread {

        public static final class a extends j implements l<Context, q> {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b f2601c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(1);
                this.f2601c = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public q a(Context context) {
                if (context != null) {
                    d dVar = InteractionFragment.this.Y;
                    if (dVar != null) {
                        int a2 = dVar.a();
                        for (int i = 1; i <= 11; i++) {
                            d dVar2 = InteractionFragment.this.Y;
                            if (dVar2 != null) {
                                StringBuilder a3 = e.a.a.a.a.a("keep adding ");
                                InteractionFragment interactionFragment = InteractionFragment.this;
                                int i2 = interactionFragment.a0;
                                interactionFragment.a0 = i2 + 1;
                                a3.append(i2);
                                dVar2.a(new e(a3.toString()));
                            }
                        }
                        d dVar3 = InteractionFragment.this.Y;
                        if (dVar3 != null) {
                            dVar3.f2461a.a(a2, 11);
                        }
                        InteractionFragment interactionFragment2 = InteractionFragment.this;
                        DRecyclerView dRecyclerView = interactionFragment2.X;
                        if (dRecyclerView != null) {
                            d dVar4 = interactionFragment2.Y;
                            if (dVar4 != null) {
                                dRecyclerView.e(dVar4.a() - 1);
                            } else {
                                i.a();
                                throw null;
                            }
                        }
                        return q.f2100a;
                    }
                    i.a();
                    throw null;
                }
                i.a("$receiver");
                throw null;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b() {
        }

        public void run() {
            while (true) {
                try {
                    Thread.sleep(400);
                    Context i = InteractionFragment.this.i();
                    if (i != null) {
                        a aVar = new a(this);
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            aVar.a(i);
                        } else {
                            h.a.a.b bVar = h.a.a.b.b;
                            h.a.a.b.f5479a.post(new h.a.a.a(i, aVar));
                        }
                    }
                } catch (Exception unused) {
                    return;
                }
            }
        }
    }

    public final void A() {
        for (T t : this.Z) {
            try {
                if (t.isAlive()) {
                    t.interrupt();
                }
                this.Z.remove(t);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            return layoutInflater.inflate(R.layout.fragment_interaction, viewGroup, false);
        }
        i.a("inflater");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void t() {
        this.G = true;
        A();
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
                dRecyclerView.setLayoutManager(new InteractionFragment$onViewCreated$1(this, i()));
            }
            DRecyclerView dRecyclerView2 = this.X;
            if (dRecyclerView2 != null) {
                dRecyclerView2.getRecycledViewPool();
            }
            d dVar = new d();
            this.Y = dVar;
            DRecyclerView dRecyclerView3 = this.X;
            if (dRecyclerView3 != null) {
                dRecyclerView3.setAdapter(dVar);
            }
            DRecyclerView dRecyclerView4 = this.X;
            if (dRecyclerView4 != null) {
                d dVar2 = this.Y;
                if (dVar2 != null) {
                    dRecyclerView4.e(dVar2.a() - 1);
                } else {
                    i.a();
                    throw null;
                }
            }
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_buttons);
            i.a((Object) recyclerView, "recyclerViewButtons");
            recyclerView.setLayoutManager(new GridLayoutManager(i(), 5));
            e.b.a.a.b bVar = new e.b.a.a.b();
            List g2 = e.f.a.g.g(new e.b.a.a.a("addLast", R.drawable.ic_more_cache, new a(1, this)), new e.b.a.a.a("notifyAll", R.drawable.ic_more_cache, new a(2, this)), new e.b.a.a.a("refresh", R.drawable.ic_more_cache, new a(3, this)), new e.b.a.a.a("clear", R.drawable.ic_more_cache, new a(4, this)), new e.b.a.a.a("keepAdd", R.drawable.ic_more_cache, new a(5, this)), new e.b.a.a.a("stopAdd", R.drawable.ic_more_cache, new a(6, this)), new e.b.a.a.a("moveToLast", R.drawable.ic_more_cache, new a(7, this)), new e.b.a.a.a("addAndAnim10", R.drawable.ic_more_cache, new a(8, this)), new e.b.a.a.a("addAndAnim110", R.drawable.ic_more_cache, new a(0, this)));
            if (g2 != null) {
                bVar.f3743c.addAll(g2);
                recyclerView.setAdapter(bVar);
                return;
            }
            i.a("items");
            throw null;
        }
        i.a("view");
        throw null;
    }
}
