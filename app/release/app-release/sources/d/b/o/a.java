package d.b.o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import d.b.j;
import d.b.n.i.h;
import d.g.l.p;
import d.g.l.u;
import d.g.l.v;

public abstract class a extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public final C0091a f2856c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f2857d;

    /* renamed from: e  reason: collision with root package name */
    public ActionMenuView f2858e;

    /* renamed from: f  reason: collision with root package name */
    public c f2859f;

    /* renamed from: g  reason: collision with root package name */
    public int f2860g;

    /* renamed from: h  reason: collision with root package name */
    public u f2861h;
    public boolean i;
    public boolean j;

    /* renamed from: d.b.o.a$a  reason: collision with other inner class name */
    public class C0091a implements v {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2862a = false;
        public int b;

        public C0091a() {
        }

        @Override // d.g.l.v
        public void a(View view) {
            if (!this.f2862a) {
                a aVar = a.this;
                aVar.f2861h = null;
                a.super.setVisibility(this.b);
            }
        }

        @Override // d.g.l.v
        public void b(View view) {
            a.super.setVisibility(0);
            this.f2862a = false;
        }

        @Override // d.g.l.v
        public void c(View view) {
            this.f2862a = true;
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2856c = new C0091a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(d.b.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2857d = context;
        } else {
            this.f2857d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int a(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public u a(int i2, long j2) {
        u uVar = this.f2861h;
        if (uVar != null) {
            uVar.a();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            u a2 = p.a(this);
            a2.a(1.0f);
            a2.a(j2);
            C0091a aVar = this.f2856c;
            a.this.f2861h = a2;
            aVar.b = i2;
            View view = a2.f3355a.get();
            if (view != null) {
                a2.a(view, aVar);
            }
            return a2;
        }
        u a3 = p.a(this);
        a3.a(0.0f);
        a3.a(j2);
        C0091a aVar2 = this.f2856c;
        a.this.f2861h = a3;
        aVar2.b = i2;
        View view2 = a3.f3355a.get();
        if (view2 != null) {
            a3.a(view2, aVar2);
        }
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.f2861h != null ? this.f2856c.b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2860g;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, j.ActionBar, d.b.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f2859f;
        if (cVar != null) {
            Configuration configuration2 = cVar.f2782d.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            cVar.r = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            h hVar = cVar.f2783e;
            if (hVar != null) {
                hVar.b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.j = false;
        }
        if (!this.j) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.j = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.j = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.i = false;
        }
        if (!this.i) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            u uVar = this.f2861h;
            if (uVar != null) {
                uVar.a();
            }
            super.setVisibility(i2);
        }
    }
}
