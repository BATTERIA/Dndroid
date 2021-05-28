package e.i.a.a.a.g;

import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import d.g.l.f;
import d.g.l.j;
import d.g.l.n;
import e.i.a.a.a.d.a;

public class b implements Interpolator {
    public static int b;

    /* renamed from: c  reason: collision with root package name */
    public static float f4910c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: d  reason: collision with root package name */
    public static final float f4911d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f4912e;

    /* renamed from: a  reason: collision with root package name */
    public int f4913a;

    static {
        float b2 = 1.0f / b(1.0f);
        f4911d = b2;
        f4912e = 1.0f - (b(1.0f) * b2);
    }

    public b(int i) {
        this.f4913a = i;
    }

    public static int a(float f2) {
        return (int) ((f2 * f4910c) + 0.5f);
    }

    public static void a(View view, int i) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i);
        } else if (view instanceof AbsListView) {
            if (Build.VERSION.SDK_INT >= 21) {
                ((AbsListView) view).fling(i);
            }
        } else if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).c(i);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).d(0, i);
        }
    }

    public static void a(AbsListView absListView, int i) {
        absListView.scrollListBy(i);
    }

    public static boolean a(View view) {
        return b(view) || (view instanceof ViewPager) || (view instanceof j);
    }

    public static boolean a(View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(a.srl_tag);
                if ("fixed".equals(tag) || "fixed-bottom".equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean a2 = a(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return a2;
            }
        }
        return true;
    }

    public static boolean a(View view, PointF pointF, boolean z) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !b(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(a.srl_tag);
                    if ("fixed".equals(tag) || "fixed-top".equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean a2 = a(childAt, pointF, z);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a2;
                }
            }
        }
        return z || view.canScrollVertically(-1);
    }

    public static boolean a(View view, View view2, float f2, float f3, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f2, f3};
        fArr[0] = fArr[0] + ((float) (view.getScrollX() - view2.getLeft()));
        fArr[1] = fArr[1] + ((float) (view.getScrollY() - view2.getTop()));
        boolean z = fArr[0] >= 0.0f && fArr[1] >= 0.0f && fArr[0] < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z && pointF != null) {
            pointF.set(fArr[0] - f2, fArr[1] - f3);
        }
        return z;
    }

    public static float b(float f2) {
        float f3 = f2 * 8.0f;
        return f3 < 1.0f ? f3 - (1.0f - ((float) Math.exp((double) (-f3)))) : ((1.0f - ((float) Math.exp((double) (1.0f - f3)))) * 0.63212055f) + 0.36787945f;
    }

    public static boolean b(View view) {
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof n) || (view instanceof WebView) || (view instanceof f);
    }

    public static int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public float getInterpolation(float f2) {
        if (this.f4913a == 1) {
            float f3 = 1.0f - f2;
            return 1.0f - (f3 * f3);
        }
        float b2 = b(f2) * f4911d;
        return b2 > 0.0f ? b2 + f4912e : b2;
    }
}
