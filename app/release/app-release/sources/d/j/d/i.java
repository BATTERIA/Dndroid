package d.j.d;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import d.g.l.m;

public class i extends AnimationSet implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f3456c;

    /* renamed from: d  reason: collision with root package name */
    public final View f3457d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3458e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3459f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3460g = true;

    public i(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f3456c = viewGroup;
        this.f3457d = view;
        addAnimation(animation);
        this.f3456c.post(this);
    }

    public boolean getTransformation(long j, Transformation transformation) {
        this.f3460g = true;
        if (this.f3458e) {
            return !this.f3459f;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f3458e = true;
            m.a(this.f3456c, this);
        }
        return true;
    }

    public boolean getTransformation(long j, Transformation transformation, float f2) {
        this.f3460g = true;
        if (this.f3458e) {
            return !this.f3459f;
        }
        if (!super.getTransformation(j, transformation, f2)) {
            this.f3458e = true;
            m.a(this.f3456c, this);
        }
        return true;
    }

    public void run() {
        if (this.f3458e || !this.f3460g) {
            this.f3456c.endViewTransition(this.f3457d);
            this.f3459f = true;
            return;
        }
        this.f3460g = false;
        this.f3456c.post(this);
    }
}
