package d.b.o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import d.g.l.u;
import d.g.m.c;
import java.lang.reflect.Field;

public class c0 extends ListView {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2871c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public int f2872d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2873e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2874f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2875g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2876h;
    public Field i;
    public a j;
    public boolean k;
    public boolean l;
    public boolean m;
    public u n;
    public c o;
    public b p;

    public static class a extends d.b.m.a.c {

        /* renamed from: d  reason: collision with root package name */
        public boolean f2877d = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        @Override // d.b.m.a.c
        public void draw(Canvas canvas) {
            if (this.f2877d) {
                this.f2738c.draw(canvas);
            }
        }

        @Override // d.b.m.a.c
        public void setHotspot(float f2, float f3) {
            if (this.f2877d) {
                c.a.a.a.a.a(this.f2738c, f2, f3);
            }
        }

        @Override // d.b.m.a.c
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f2877d) {
                c.a.a.a.a.a(this.f2738c, i, i2, i3, i4);
            }
        }

        @Override // d.b.m.a.c
        public boolean setState(int[] iArr) {
            if (this.f2877d) {
                return this.f2738c.setState(iArr);
            }
            return false;
        }

        @Override // d.b.m.a.c
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f2877d) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            c0 c0Var = c0.this;
            c0Var.p = null;
            c0Var.drawableStateChanged();
        }
    }

    public c0(Context context, boolean z) {
        super(context, null, d.b.a.dropDownListViewStyle);
        this.l = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.f2877d = z;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i5 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i5;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x012b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r17, int r18) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.c0.a(android.view.MotionEvent, int):boolean");
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f2871c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f2871c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.p == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            a();
        }
    }

    public boolean hasFocus() {
        return this.l || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.l || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.l || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.l && this.k) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.p = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.p == null) {
            b bVar = new b();
            this.p = bVar;
            c0.this.post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                a();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f2876h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.p;
        if (bVar != null) {
            c0 c0Var = c0.this;
            c0Var.p = null;
            c0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.k = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.j = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f2872d = rect.left;
        this.f2873e = rect.top;
        this.f2874f = rect.right;
        this.f2875g = rect.bottom;
    }

    public final void a() {
        Drawable selector = getSelector();
        if (selector != null && this.m && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
