package com.bilibili.bililive.batteria.view;

import a.g;
import a.w.c.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.bilibili.bililive.batteria.login.User;
import com.bilibili.bililive.tests.R;

@g(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0015J\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bilibili/bililive/batteria/view/ProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "set", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "Lcom/bilibili/bililive/batteria/login/User$Test;", "array", "", "getArray", "()[I", "paint", "Landroid/graphics/Paint;", "path", "Landroid/graphics/Path;", "user", "Lcom/bilibili/bililive/batteria/login/User;", "dip2px", "", "dipValue", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "test", "", "app_release"}, mv = {1, 1, 16})
public final class ProgressView extends View {

    /* renamed from: c  reason: collision with root package name */
    public final Paint f2603c;

    /* renamed from: d  reason: collision with root package name */
    public final User.a f2604d;

    /* renamed from: e  reason: collision with root package name */
    public final User f2605e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2606f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context == null) {
            i.a("context");
            throw null;
        } else if (attributeSet != null) {
            this.f2603c = new Paint(1);
            this.f2604d = new User.a();
            new Path();
            this.f2605e = new User(1, "", "");
            this.f2606f = new int[]{getResources().getColor(R.color.pk_battle_left_progress_start), getResources().getColor(R.color.pk_battle_left_progress_end), getResources().getColor(R.color.pk_battle_right_progress_start), getResources().getColor(R.color.pk_battle_right_progress_end)};
        } else {
            i.a("set");
            throw null;
        }
    }

    public final float a(Context context, float f2) {
        Resources resources = context.getResources();
        i.a((Object) resources, "context.resources");
        return (f2 * resources.getDisplayMetrics().density) + 0.5f;
    }

    public final int[] getArray() {
        return this.f2606f;
    }

    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2603c.setColor(getResources().getColor(R.color.pk_bg));
        Path path = new Path();
        Context context = getContext();
        i.a((Object) context, "context");
        float a2 = a(context, 15.0f);
        Context context2 = getContext();
        i.a((Object) context2, "context");
        float a3 = a(context2, 15.0f);
        Context context3 = getContext();
        i.a((Object) context3, "context");
        path.addCircle(a2, a3, a(context3, 15.0f), Path.Direction.CW);
        Context context4 = getContext();
        i.a((Object) context4, "context");
        float a4 = a(context4, 244.0f);
        Context context5 = getContext();
        i.a((Object) context5, "context");
        float a5 = a(context5, 15.0f);
        Context context6 = getContext();
        i.a((Object) context6, "context");
        path.addCircle(a4, a5, a(context6, 15.0f), Path.Direction.CW);
        Context context7 = getContext();
        i.a((Object) context7, "context");
        float a6 = a(context7, 15.0f);
        Context context8 = getContext();
        i.a((Object) context8, "context");
        float a7 = a(context8, 6.0f);
        Context context9 = getContext();
        i.a((Object) context9, "context");
        float a8 = a(context9, 244.0f);
        Context context10 = getContext();
        i.a((Object) context10, "context");
        path.addRect(a6, a7, a8, a(context10, 24.0f), Path.Direction.CW);
        if (canvas != null) {
            canvas.drawPath(path, this.f2603c);
        }
        System.out.print(this.f2605e.getId());
        System.out.print(this.f2604d.f2597a);
        this.f2605e.print();
    }
}
