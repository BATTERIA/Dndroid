package com.didi.hummer.component.scroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;
import e.c.a.b.l;
import e.e.a.o.l.a;
import e.e.a.o.l.l;
import e.e.a.o.l.m;
import e.e.a.o.l.n;
import e.e.a.o.l.o;

public class HScrollView extends HorizontalScrollView {

    /* renamed from: c  reason: collision with root package name */
    public o f2620c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2621d;

    /* renamed from: e  reason: collision with root package name */
    public l f2622e;

    /* renamed from: f  reason: collision with root package name */
    public n f2623f;

    /* renamed from: g  reason: collision with root package name */
    public m f2624g;

    public HScrollView(Context context) {
        this(context, null);
    }

    public HScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2621d = false;
        this.f2622e = null;
        this.f2623f = null;
        this.f2624g = null;
        setOverScrollMode(2);
        setImportantForAccessibility(2);
        o oVar = new o();
        this.f2620c = oVar;
        oVar.f4410e = new a(this);
    }

    public /* synthetic */ void a(int i) {
        l lVar;
        if (i == 1) {
            l lVar2 = this.f2622e;
            if (lVar2 != null) {
                lVar2.a();
            }
        } else if (i == 3) {
            l lVar3 = this.f2622e;
            if (lVar3 != null) {
                lVar3.c();
            }
        } else if (i == 4 && (lVar = this.f2622e) != null) {
            lVar.b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2621d = false;
        }
        o oVar = this.f2620c;
        if (oVar != null) {
            if (motionEvent.getAction() == 0) {
                oVar.b = false;
                oVar.f4408c = true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        throw null;
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        if (!z) {
            this.f2621d = false;
        } else if (!this.f2621d) {
            this.f2621d = true;
            if (i > 0) {
                m mVar = this.f2624g;
                if (mVar != null) {
                    mVar.a();
                    return;
                }
                return;
            }
            n nVar = this.f2623f;
            if (nVar != null) {
                nVar.a();
            }
        }
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f2620c.a(i);
        l lVar = this.f2622e;
        if (lVar != null) {
            lVar.a(this, i, i2, i - i3, i2 - i4);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            l.f.a(getContext());
        }
        this.f2620c.a(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setOnScrollListener(e.e.a.o.l.l lVar) {
        this.f2622e = lVar;
    }

    public void setOnScrollToBottomListener(m mVar) {
        this.f2624g = mVar;
    }

    public void setOnScrollToTopListener(n nVar) {
        this.f2623f = nVar;
    }
}
