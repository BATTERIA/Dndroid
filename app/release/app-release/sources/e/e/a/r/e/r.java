package e.e.a.r.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import e.c.a.b.l;

public class r extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public int f4535c;

    /* renamed from: d  reason: collision with root package name */
    public int f4536d;

    /* renamed from: e  reason: collision with root package name */
    public int f4537e;

    /* renamed from: f  reason: collision with root package name */
    public int f4538f;

    /* renamed from: g  reason: collision with root package name */
    public int f4539g;

    /* renamed from: h  reason: collision with root package name */
    public float f4540h;
    public float i;
    public long j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context, null, 0);
        int i2;
        int i3 = 0;
        Resources resources = getContext().getResources();
        this.f4535c = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        this.f4536d = l.f.b(context);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            i2 = -1;
        } else {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            i2 = point.y;
        }
        int i4 = i2 - this.f4535c;
        Resources resources2 = context.getResources();
        int identifier = resources2.getIdentifier("navigation_bar_height", "dimen", "android");
        this.f4537e = i4 - (identifier != 0 ? resources2.getDimensionPixelSize(identifier) : i3);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            float f2 = 0.0f;
            if (action == 1) {
                ((((float) this.f4538f) / 2.0f) + getX() > ((float) this.f4536d) / 2.0f ? animate().setInterpolator(new DecelerateInterpolator()).setDuration(200).xBy(((float) (this.f4536d - this.f4538f)) - getX()) : animate().setInterpolator(new DecelerateInterpolator()).setDuration(200).x(0.0f)).start();
                if (System.currentTimeMillis() - this.j < 200) {
                    performClick();
                }
            } else if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f4540h;
                float rawY = (motionEvent.getRawY() - this.i) - ((float) this.f4535c);
                if (rawX < 0.0f) {
                    rawX = 0.0f;
                } else {
                    int i2 = this.f4538f;
                    int i3 = this.f4536d;
                    if (((float) i2) + rawX > ((float) i3)) {
                        rawX = (float) (i3 - i2);
                    }
                }
                if (rawY >= 0.0f) {
                    int i4 = this.f4539g;
                    int i5 = this.f4537e;
                    f2 = ((float) i4) + rawY > ((float) i5) ? (float) (i5 - i4) : rawY;
                }
                setY(f2);
                setX(rawX);
            }
        } else {
            clearAnimation();
            this.f4540h = motionEvent.getX();
            this.i = motionEvent.getY();
            this.f4538f = getWidth();
            this.f4539g = getHeight();
            this.j = System.currentTimeMillis();
        }
        return true;
    }
}
