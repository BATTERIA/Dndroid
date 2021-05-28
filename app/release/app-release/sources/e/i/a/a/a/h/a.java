package e.i.a.a.a.h;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.viewpager.widget.ViewPager;
import d.g.l.f;
import d.g.l.j;
import e.f.a.g;
import e.i.a.a.a.a;
import e.i.a.a.a.b.b;
import e.i.a.a.a.b.e;
import java.util.LinkedList;

public class a implements b, e.i.a.a.a.e.a, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public View f4914a;
    public View b;

    /* renamed from: c  reason: collision with root package name */
    public View f4915c;

    /* renamed from: d  reason: collision with root package name */
    public View f4916d;

    /* renamed from: e  reason: collision with root package name */
    public View f4917e;

    /* renamed from: f  reason: collision with root package name */
    public int f4918f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4919g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4920h = true;
    public e.i.a.a.a.f.a i = new e.i.a.a.a.f.a();

    public a(View view) {
        this.f4915c = view;
        this.b = view;
        this.f4914a = view;
    }

    public ValueAnimator.AnimatorUpdateListener a(int i2) {
        View view = this.f4915c;
        if (view == null || i2 == 0) {
            return null;
        }
        if ((i2 >= 0 || !view.canScrollVertically(1)) && (i2 <= 0 || !this.f4915c.canScrollVertically(-1))) {
            return null;
        }
        this.f4918f = i2;
        return this;
    }

    public View a(View view, PointF pointF, View view2) {
        if ((view instanceof ViewGroup) && pointF != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (e.i.a.a.a.g.b.a(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    if (!(childAt instanceof ViewPager) && e.i.a.a.a.g.b.a(childAt)) {
                        return childAt;
                    } else {
                        pointF.offset(pointF2.x, pointF2.y);
                        View a2 = a(childAt, pointF, view2);
                        pointF.offset(-pointF2.x, -pointF2.y);
                        return a2;
                    }
                }
            }
        }
        return view2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r7 == r1) goto L_0x0021
            android.view.View r4 = r5.b
            android.view.View r7 = r4.findViewById(r7)
            if (r7 == 0) goto L_0x0021
            if (r6 <= 0) goto L_0x0016
            float r4 = (float) r6
            r7.setTranslationY(r4)
            r7 = 1
            goto L_0x0022
        L_0x0016:
            float r4 = r7.getTranslationY()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0021
            r7.setTranslationY(r3)
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r8 == r1) goto L_0x003e
            android.view.View r1 = r5.b
            android.view.View r8 = r1.findViewById(r8)
            if (r8 == 0) goto L_0x003e
            if (r6 >= 0) goto L_0x0033
            float r7 = (float) r6
            r8.setTranslationY(r7)
            goto L_0x003f
        L_0x0033:
            float r0 = r8.getTranslationY()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x003e
            r8.setTranslationY(r3)
        L_0x003e:
            r0 = r7
        L_0x003f:
            android.view.View r7 = r5.b
            if (r0 != 0) goto L_0x0048
            float r8 = (float) r6
            r7.setTranslationY(r8)
            goto L_0x004b
        L_0x0048:
            r7.setTranslationY(r3)
        L_0x004b:
            android.view.View r7 = r5.f4916d
            if (r7 == 0) goto L_0x0057
            int r8 = java.lang.Math.max(r2, r6)
            float r8 = (float) r8
            r7.setTranslationY(r8)
        L_0x0057:
            android.view.View r7 = r5.f4917e
            if (r7 == 0) goto L_0x0063
            int r6 = java.lang.Math.min(r2, r6)
            float r6 = (float) r6
            r7.setTranslationY(r6)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.a.a.a.h.a.a(int, int, int):void");
    }

    public void a(e eVar, View view, View view2) {
        View view3 = this.f4914a;
        boolean isInEditMode = view3.isInEditMode();
        View view4 = null;
        while (true) {
            if (view4 != null && (!(view4 instanceof j) || (view4 instanceof f))) {
                break;
            }
            boolean z = view4 == null;
            LinkedList linkedList = new LinkedList();
            linkedList.add(view3);
            View view5 = null;
            while (linkedList.size() > 0 && view5 == null) {
                View view6 = (View) linkedList.poll();
                if (view6 != null) {
                    if ((z || view6 != view3) && e.i.a.a.a.g.b.a(view6)) {
                        view5 = view6;
                    } else if (view6 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view6;
                        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                            linkedList.add(viewGroup.getChildAt(i2));
                        }
                    }
                }
            }
            if (view5 != null) {
                view3 = view5;
            }
            if (view3 == view4) {
                break;
            }
            if (!isInEditMode) {
                g.a(view3, eVar, this);
            }
            view4 = view3;
        }
        if (view4 != null) {
            this.f4915c = view4;
        }
        if (!(view == null && view2 == null)) {
            this.f4916d = view;
            this.f4917e = view2;
            FrameLayout frameLayout = new FrameLayout(this.f4914a.getContext());
            int indexOfChild = e.i.a.a.a.a.this.getLayout().indexOfChild(this.f4914a);
            a.k kVar = (a.k) eVar;
            e.i.a.a.a.a.this.getLayout().removeView(this.f4914a);
            frameLayout.addView(this.f4914a, 0, new ViewGroup.LayoutParams(-1, -1));
            e.i.a.a.a.a.this.getLayout().addView(frameLayout, indexOfChild, this.f4914a.getLayoutParams());
            this.f4914a = frameLayout;
            if (view != null) {
                view.setTag(e.i.a.a.a.d.a.srl_tag, "fixed-top");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                int indexOfChild2 = viewGroup2.indexOfChild(view);
                viewGroup2.removeView(view);
                layoutParams.height = e.i.a.a.a.g.b.c(view);
                viewGroup2.addView(new Space(this.f4914a.getContext()), indexOfChild2, layoutParams);
                frameLayout.addView(view, 1, layoutParams);
            }
            if (view2 != null) {
                view2.setTag(e.i.a.a.a.d.a.srl_tag, "fixed-bottom");
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup viewGroup3 = (ViewGroup) view2.getParent();
                int indexOfChild3 = viewGroup3.indexOfChild(view2);
                viewGroup3.removeView(view2);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2);
                layoutParams2.height = e.i.a.a.a.g.b.c(view2);
                viewGroup3.addView(new Space(this.f4914a.getContext()), indexOfChild3, layoutParams2);
                layoutParams3.gravity = 80;
                frameLayout.addView(view2, 1, layoutParams3);
            }
        }
    }

    public boolean a() {
        return this.f4920h && this.i.a(this.f4914a);
    }

    public boolean b() {
        return this.f4919g && this.i.b(this.f4914a);
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        try {
            float scaleY = ((float) (intValue - this.f4918f)) * this.f4915c.getScaleY();
            if (this.f4915c instanceof AbsListView) {
                e.i.a.a.a.g.b.a((AbsListView) this.f4915c, (int) scaleY);
            } else {
                this.f4915c.scrollBy(0, (int) scaleY);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        this.f4918f = intValue;
    }
}
