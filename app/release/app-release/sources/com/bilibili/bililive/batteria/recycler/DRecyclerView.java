package com.bilibili.bililive.batteria.recycler;

import a.g;
import a.w.c.i;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import e.a.a.a.a;

@g(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J0\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0014R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/bilibili/bililive/batteria/recycler/DRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "set", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "def", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "signal", "", "getSignal", "()Ljava/lang/String;", "setSignal", "(Ljava/lang/String;)V", "onDetachedFromWindow", "", "onDraw", "c", "Landroid/graphics/Canvas;", "onLayout", "changed", "", "l", "t", "r", "b", "onMeasure", "widthSpec", "heightSpec", "Companion", "app_release"}, mv = {1, 1, 16})
public final class DRecyclerView extends RecyclerView {
    public String K0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DRecyclerView(Context context) {
        super(context);
        if (context != null) {
            this.K0 = "";
            return;
        }
        i.a("context");
        throw null;
    }

    public final String getSignal() {
        return this.K0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        StringBuilder a2 = a.a("DRecyclerView-");
        a2.append(this.K0);
        String sb = a2.toString();
        if (sb != null) {
            long nanoTime = System.nanoTime();
            super.onDetachedFromWindow();
            if (nanoTime != 0) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onDetachedFromWindow");
                sb2.append(' ');
                sb2.append(nanoTime2 / ((long) 1000000000));
                sb2.append("s ");
                long j = (long) 1000000;
                sb2.append((nanoTime2 / j) % ((long) 1000));
                sb2.append("ms ");
                sb2.append(nanoTime2 % j);
                sb2.append("ns ");
                sb2.append(nanoTime2);
                Log.d(sb, sb2.toString());
                return;
            }
            return;
        }
        i.a("tag");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onDraw(Canvas canvas) {
        StringBuilder a2 = a.a("DRecyclerView-");
        a2.append(this.K0);
        String sb = a2.toString();
        if (sb != null) {
            long nanoTime = System.nanoTime();
            super.onDraw(canvas);
            if (nanoTime != 0) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onDraw");
                sb2.append(' ');
                sb2.append(nanoTime2 / ((long) 1000000000));
                sb2.append("s ");
                long j = (long) 1000000;
                sb2.append((nanoTime2 / j) % ((long) 1000));
                sb2.append("ms ");
                sb2.append(nanoTime2 % j);
                sb2.append("ns ");
                sb2.append(nanoTime2);
                Log.d(sb, sb2.toString());
                return;
            }
            return;
        }
        i.a("tag");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        StringBuilder a2 = a.a("DRecyclerView-");
        a2.append(this.K0);
        String sb = a2.toString();
        if (sb != null) {
            long nanoTime = System.nanoTime();
            super.onLayout(z, i, i2, i3, i4);
            if (nanoTime != 0) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onLayout");
                sb2.append(' ');
                sb2.append(nanoTime2 / ((long) 1000000000));
                sb2.append("s ");
                long j = (long) 1000000;
                sb2.append((nanoTime2 / j) % ((long) 1000));
                sb2.append("ms ");
                sb2.append(nanoTime2 % j);
                sb2.append("ns ");
                sb2.append(nanoTime2);
                Log.d(sb, sb2.toString());
                return;
            }
            return;
        }
        i.a("tag");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        StringBuilder a2 = a.a("DRecyclerView-");
        a2.append(this.K0);
        String sb = a2.toString();
        if (sb != null) {
            long nanoTime = System.nanoTime();
            super.onMeasure(i, i2);
            if (nanoTime != 0) {
                long nanoTime2 = System.nanoTime() - nanoTime;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onMeasure");
                sb2.append(' ');
                sb2.append(nanoTime2 / ((long) 1000000000));
                sb2.append("s ");
                long j = (long) 1000000;
                sb2.append((nanoTime2 / j) % ((long) 1000));
                sb2.append("ms ");
                sb2.append(nanoTime2 % j);
                sb2.append("ns ");
                sb2.append(nanoTime2);
                Log.d(sb, sb2.toString());
                return;
            }
            return;
        }
        i.a("tag");
        throw null;
    }

    public final void setSignal(String str) {
        if (str != null) {
            this.K0 = str;
        } else {
            i.a("<set-?>");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            i.a("context");
            throw null;
        } else if (attributeSet != null) {
            this.K0 = "";
        } else {
            i.a("set");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (context == null) {
            i.a("context");
            throw null;
        } else if (attributeSet != null) {
            this.K0 = "";
        } else {
            i.a("set");
            throw null;
        }
    }
}
