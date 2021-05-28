package d.b.o;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import d.b.j;
import d.b.n.i.r;
import d.g.l.p;
import java.lang.reflect.Method;

public class h0 implements r {
    public static Method E;
    public static Method F;
    public static Method G;
    public final Rect A = new Rect();
    public Rect B;
    public boolean C;
    public PopupWindow D;

    /* renamed from: c  reason: collision with root package name */
    public Context f2912c;

    /* renamed from: d  reason: collision with root package name */
    public ListAdapter f2913d;

    /* renamed from: e  reason: collision with root package name */
    public c0 f2914e;

    /* renamed from: f  reason: collision with root package name */
    public int f2915f = -2;

    /* renamed from: g  reason: collision with root package name */
    public int f2916g = -2;

    /* renamed from: h  reason: collision with root package name */
    public int f2917h;
    public int i;
    public int j = 1002;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n = 0;
    public boolean o = false;
    public boolean p = false;
    public int q = Integer.MAX_VALUE;
    public int r = 0;
    public DataSetObserver s;
    public View t;
    public AdapterView.OnItemClickListener u;
    public final e v = new e();
    public final d w = new d();
    public final c x = new c();
    public final a y = new a();
    public final Handler z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c0 c0Var = h0.this.f2914e;
            if (c0Var != null) {
                c0Var.setListSelectionHidden(true);
                c0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (h0.this.c()) {
                h0.this.a();
            }
        }

        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (h0.this.D.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && h0.this.D.getContentView() != null) {
                    h0 h0Var = h0.this;
                    h0Var.z.removeCallbacks(h0Var.v);
                    h0.this.v.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.D) != null && popupWindow.isShowing() && x >= 0 && x < h0.this.D.getWidth() && y >= 0 && y < h0.this.D.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.z.postDelayed(h0Var.v, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                h0 h0Var2 = h0.this;
                h0Var2.z.removeCallbacks(h0Var2.v);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            c0 c0Var = h0.this.f2914e;
            if (c0Var != null && p.p(c0Var) && h0.this.f2914e.getCount() > h0.this.f2914e.getChildCount()) {
                int childCount = h0.this.f2914e.getChildCount();
                h0 h0Var = h0.this;
                if (childCount <= h0Var.q) {
                    h0Var.D.setInputMethodMode(2);
                    h0.this.a();
                }
            }
        }
    }

    static {
        try {
            E = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException unused) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            F = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException unused2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            G = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
        } catch (NoSuchMethodException unused3) {
            Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public h0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f2912c = context;
        this.z = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ListPopupWindow, i2, i3);
        this.f2917h = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.i = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.k = true;
        }
        obtainStyledAttributes.recycle();
        o oVar = new o(context, attributeSet, i2, i3);
        this.D = oVar;
        oVar.setInputMethodMode(1);
    }

    public c0 a(Context context, boolean z2) {
        return new c0(context, z2);
    }

    public void a(int i2) {
        Drawable background = this.D.getBackground();
        if (background != null) {
            background.getPadding(this.A);
            Rect rect = this.A;
            this.f2916g = rect.left + rect.right + i2;
            return;
        }
        this.f2916g = i2;
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.s;
        if (dataSetObserver == null) {
            this.s = new b();
        } else {
            ListAdapter listAdapter2 = this.f2913d;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2913d = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.s);
        }
        c0 c0Var = this.f2914e;
        if (c0Var != null) {
            c0Var.setAdapter(this.f2913d);
        }
    }

    public void a(boolean z2) {
        this.C = z2;
        this.D.setFocusable(z2);
    }

    public Drawable b() {
        return this.D.getBackground();
    }

    public void b(int i2) {
        this.i = i2;
        this.k = true;
    }

    @Override // d.b.n.i.r
    public boolean c() {
        return this.D.isShowing();
    }

    @Override // d.b.n.i.r
    public ListView d() {
        return this.f2914e;
    }

    @Override // d.b.n.i.r
    public void dismiss() {
        this.D.dismiss();
        this.D.setContentView(null);
        this.f2914e = null;
        this.z.removeCallbacks(this.v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0192  */
    @Override // d.b.n.i.r
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        // Method dump skipped, instructions count: 567
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.h0.a():void");
    }
}
