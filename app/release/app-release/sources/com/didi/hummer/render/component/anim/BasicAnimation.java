package com.didi.hummer.render.component.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import e.c.a.b.l;
import e.e.a.y.a.b.j;

@Component
public class BasicAnimation {
    public static final int AXIS_X = 1;
    public static final int AXIS_Y = 2;
    public static final int AXIS_Z = 3;
    public static final int DIRECTION_X = 11;
    public static final int DIRECTION_XY = 13;
    public static final int DIRECTION_Y = 12;
    public e.e.a.q.b.a animEndCallback;
    public e.e.a.q.b.a animStartCallback;
    public String animType;
    public Animator animator;
    public AnimatorListenerAdapter animatorListener = new a();
    @JsProperty
    public float delay;
    @JsProperty
    public float duration;
    @JsProperty
    public String easing;
    @JsProperty
    public Object from;
    @JsProperty
    public int repeatCount;
    @JsProperty
    public Object value;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.e.a.q.b.a aVar = BasicAnimation.this.animEndCallback;
            if (aVar != null) {
                aVar.a(new Object[0]);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            e.e.a.q.b.a aVar = BasicAnimation.this.animStartCallback;
            if (aVar != null) {
                aVar.a(new Object[0]);
            }
        }
    }

    public BasicAnimation(String str) {
        this.animType = str;
    }

    public static Object[] trans2Array(Object obj) {
        return l.f.a(obj);
    }

    public boolean isRunning() {
        Animator animator2 = this.animator;
        return animator2 != null && animator2.isRunning();
    }

    @JsMethod
    public void on(String str, e.e.a.q.b.a aVar) {
        if ("start".equalsIgnoreCase(str)) {
            this.animStartCallback = aVar;
        } else if ("end".equalsIgnoreCase(str)) {
            this.animEndCallback = aVar;
        }
    }

    public void start(j jVar) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(jVar.getAnimViewWrapper(), (PropertyValuesHolder[]) l.f.a(this.animType, this.value, this.from).toArray(new PropertyValuesHolder[0]));
        this.animator = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
        ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
        ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
        ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
        ofPropertyValuesHolder.addListener(this.animatorListener);
        ofPropertyValuesHolder.start();
    }

    public void stop() {
        if (isRunning()) {
            this.animator.cancel();
            this.animator = null;
        }
        e.e.a.q.b.a aVar = this.animStartCallback;
        if (aVar != null) {
            aVar.d();
        }
        e.e.a.q.b.a aVar2 = this.animEndCallback;
        if (aVar2 != null) {
            aVar2.d();
        }
    }
}
