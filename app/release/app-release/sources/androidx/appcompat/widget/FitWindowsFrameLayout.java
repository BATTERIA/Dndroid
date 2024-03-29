package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import d.b.k.m;
import d.b.o.d0;

public class FitWindowsFrameLayout extends FrameLayout implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public d0.a f2316c;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        d0.a aVar = this.f2316c;
        if (aVar != null) {
            rect.top = ((m) aVar).f2685a.f(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // d.b.o.d0
    public void setOnFitSystemWindowsListener(d0.a aVar) {
        this.f2316c = aVar;
    }
}
