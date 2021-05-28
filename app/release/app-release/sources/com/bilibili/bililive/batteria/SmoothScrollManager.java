package com.bilibili.bililive.batteria;

import a.g;
import a.w.c.i;
import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d.o.c.o;

@g(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/bilibili/bililive/batteria/SmoothScrollManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "smoothScrollToPosition", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "position", "", "app_release"}, mv = {1, 1, 16})
public final class SmoothScrollManager extends LinearLayoutManager {

    public static final class a extends o {
        public final /* synthetic */ RecyclerView o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(RecyclerView recyclerView, Context context) {
            super(context);
            this.o = recyclerView;
        }

        @Override // d.o.c.o
        public float a(DisplayMetrics displayMetrics) {
            if (displayMetrics != null) {
                RecyclerView recyclerView = this.o;
                if (recyclerView != null) {
                    recyclerView.getVerticalScrollbarPosition();
                }
                RecyclerView recyclerView2 = this.o;
                if (recyclerView2 != null) {
                    recyclerView2.getHeight();
                }
                RecyclerView recyclerView3 = this.o;
                if (recyclerView3 != null) {
                    recyclerView3.getAdapter();
                }
                return 10.0f / ((float) displayMetrics.densityDpi);
            }
            i.a("displayMetrics");
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m, androidx.recyclerview.widget.LinearLayoutManager
    public void a(RecyclerView recyclerView, RecyclerView.x xVar, int i) {
        if (recyclerView != null) {
            a aVar = new a(recyclerView, recyclerView.getContext());
            aVar.f2497a = i;
            a(aVar);
            return;
        }
        i.a();
        throw null;
    }
}
