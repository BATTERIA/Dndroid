package com.didi.hummer.render.style;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import e.e.a.y.a.b.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class HummerLayout extends YogaLayout {

    /* renamed from: c  reason: collision with root package name */
    public Map<String, j> f2641c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f2642d;

    /* renamed from: e  reason: collision with root package name */
    public Path f2643e;

    /* renamed from: f  reason: collision with root package name */
    public Callable<float[]> f2644f;

    /* renamed from: g  reason: collision with root package name */
    public j f2645g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2646h;
    public a i;

    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public HummerLayout(Context context) {
        this(context, null);
    }

    public HummerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HummerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f2641c = new HashMap();
        this.f2642d = new RectF();
        this.f2643e = new Path();
        setClipChildren(false);
    }

    public void a(j jVar) {
        if (jVar != null) {
            removeView(jVar.getView());
            this.f2641c.remove(jVar.getViewID());
        }
    }

    public void a(j jVar, int i2) {
        if (jVar != null) {
            addView(jVar.getView(), jVar.getYogaNode());
            if (jVar.getYogaNode().getData() == null) {
                jVar.getYogaNode().setData(jVar.getView());
            }
            int childCount = getYogaNode().getChildCount();
            if (i2 < 0) {
                i2 = childCount;
            }
            getYogaNode().addChildAt(jVar.getYogaNode(), i2);
            this.f2641c.put(jVar.getViewID(), jVar);
            if (i2 == childCount) {
                this.f2645g = jVar;
            }
        }
    }

    public void a(j jVar, j jVar2) {
        if (jVar != null && jVar2 != null) {
            a(jVar, getYogaNode().indexOf(jVar2.getYogaNode()));
        }
    }

    public final void applyLayoutRecursive(YogaNode yogaNode, float f2, float f3) {
        View view = (View) yogaNode.getData();
        if (!(view == null || view == this)) {
            if (view.getVisibility() != 8) {
                int round = Math.round(yogaNode.getLayoutX() + f2);
                int round2 = Math.round(yogaNode.getLayoutY() + f3);
                view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(yogaNode.getLayoutWidth()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(yogaNode.getLayoutHeight()), 1073741824));
                view.layout(round, round2, view.getMeasuredWidth() + round, view.getMeasuredHeight() + round2);
            } else {
                return;
            }
        }
        int childCount = yogaNode.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (equals(view) || !(view instanceof YogaLayout)) {
                applyLayoutRecursive(yogaNode.getChildAt(i2), f2, f3);
            }
        }
    }

    public void b(j jVar, j jVar2) {
        if (jVar != null && jVar2 != null) {
            int indexOf = getYogaNode().indexOf(jVar2.getYogaNode());
            a(jVar2);
            a(jVar, indexOf);
        }
    }

    public j getLastChild() {
        return this.f2645g;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2646h) {
            this.f2642d.set(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight());
            this.f2643e.reset();
            float[] fArr = null;
            try {
                if (this.f2644f != null) {
                    fArr = this.f2644f.call();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            if (fArr != null) {
                this.f2643e.addRoundRect(this.f2642d, fArr, Path.Direction.CW);
            } else {
                this.f2643e.addRect(this.f2642d, Path.Direction.CW);
            }
            canvas.clipPath(this.f2643e);
        }
    }

    @Override // com.facebook.yoga.android.YogaLayout
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (!(getParent() instanceof YogaLayout)) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4 - i2, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5 - i3, 0);
            int size = View.MeasureSpec.getSize(makeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(makeMeasureSpec2);
            int mode = View.MeasureSpec.getMode(makeMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(makeMeasureSpec2);
            if (mode2 == 1073741824) {
                getYogaNode().setHeight((float) size2);
            }
            if (mode == 1073741824) {
                getYogaNode().setWidth((float) size);
            }
            if (mode2 == Integer.MIN_VALUE) {
                getYogaNode().setMaxHeight((float) size2);
            }
            if (mode == Integer.MIN_VALUE) {
                getYogaNode().setMaxWidth((float) size);
            }
            getYogaNode().calculateLayout(Float.NaN, Float.NaN);
        }
        applyLayoutRecursive(getYogaNode(), 0.0f, 0.0f);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(i2, i3, i4, i5);
        }
    }

    @Override // com.facebook.yoga.android.YogaLayout
    public void removeAllViews() {
        super.removeAllViews();
        this.f2641c.clear();
    }

    public void setCornerRadiiGetter(Callable<float[]> callable) {
        this.f2644f = callable;
    }

    public void setNeedClipChildren(boolean z) {
        this.f2646h = z;
    }

    public void setOnSizeChangeListener(a aVar) {
        this.i = aVar;
    }
}
