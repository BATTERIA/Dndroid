package d.b.o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import d.b.d;
import d.g.l.p;
import d.g.l.t;

public class x0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static x0 l;
    public static x0 m;

    /* renamed from: c  reason: collision with root package name */
    public final View f3022c;

    /* renamed from: d  reason: collision with root package name */
    public final CharSequence f3023d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3024e;

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f3025f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f3026g = new b();

    /* renamed from: h  reason: collision with root package name */
    public int f3027h;
    public int i;
    public y0 j;
    public boolean k;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            x0.this.a(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            x0.this.b();
        }
    }

    public x0(View view, CharSequence charSequence) {
        this.f3022c = view;
        this.f3023d = charSequence;
        this.f3024e = t.a(ViewConfiguration.get(view.getContext()));
        a();
        this.f3022c.setOnLongClickListener(this);
        this.f3022c.setOnHoverListener(this);
    }

    public static void a(x0 x0Var) {
        x0 x0Var2 = l;
        if (x0Var2 != null) {
            x0Var2.f3022c.removeCallbacks(x0Var2.f3025f);
        }
        l = x0Var;
        if (x0Var != null) {
            x0Var.f3022c.postDelayed(x0Var.f3025f, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f3027h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
    }

    public void b() {
        if (m == this) {
            m = null;
            y0 y0Var = this.j;
            if (y0Var != null) {
                y0Var.a();
                this.j = null;
                a();
                this.f3022c.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (l == this) {
            a((x0) null);
        }
        this.f3022c.removeCallbacks(this.f3026g);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.j != null && this.k) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f3022c.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f3022c.isEnabled() && this.j == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f3027h) > this.f3024e || Math.abs(y - this.i) > this.f3024e) {
                this.f3027h = x;
                this.i = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f3027h = view.getWidth() / 2;
        this.i = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }

    public void a(boolean z) {
        int i2;
        int i3;
        long j2;
        if (p.p(this.f3022c)) {
            a((x0) null);
            x0 x0Var = m;
            if (x0Var != null) {
                x0Var.b();
            }
            m = this;
            this.k = z;
            y0 y0Var = new y0(this.f3022c.getContext());
            this.j = y0Var;
            View view = this.f3022c;
            int i4 = this.f3027h;
            int i5 = this.i;
            boolean z2 = this.k;
            CharSequence charSequence = this.f3023d;
            if (y0Var.b.getParent() != null) {
                y0Var.a();
            }
            y0Var.f3038c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = y0Var.f3039d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = y0Var.f3037a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i4 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = y0Var.f3037a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
                i2 = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = y0Var.f3037a.getResources().getDimensionPixelOffset(z2 ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(y0Var.f3040e);
                Rect rect = y0Var.f3040e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = y0Var.f3037a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    y0Var.f3040e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(y0Var.f3042g);
                view.getLocationOnScreen(y0Var.f3041f);
                int[] iArr = y0Var.f3041f;
                int i6 = iArr[0];
                int[] iArr2 = y0Var.f3042g;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                y0Var.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = y0Var.b.getMeasuredHeight();
                int[] iArr3 = y0Var.f3041f;
                int i7 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i2 + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i8 > y0Var.f3040e.height() : i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) y0Var.f3037a.getSystemService("window")).addView(y0Var.b, y0Var.f3039d);
            this.f3022c.addOnAttachStateChangeListener(this);
            if (this.k) {
                j2 = 2500;
            } else {
                j2 = ((this.f3022c.getWindowSystemUiVisibility() & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f3022c.removeCallbacks(this.f3026g);
            this.f3022c.postDelayed(this.f3026g, j2);
        }
    }
}
