package com.didi.hummer.render.component.anim;

import android.animation.ArgbEvaluator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsProperty;
import e.c.a.b.l;
import e.e.a.y.a.b.j;
import e.e.a.y.c.c;
import java.io.Serializable;
import java.util.List;

@Component
public class KeyframeAnimation extends BasicAnimation {
    @JsProperty
    public List<a> keyframes;

    public class a implements Serializable {

        /* renamed from: c  reason: collision with root package name */
        public float f2639c;

        /* renamed from: d  reason: collision with root package name */
        public Object f2640d;
    }

    public KeyframeAnimation(String str) {
        super(str);
    }

    public void animAlpha(View view) {
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            for (int i = 0; i < this.keyframes.size(); i++) {
                a aVar = this.keyframes.get(i);
                keyframeArr[i] = Keyframe.ofFloat(aVar.f2639c, c.a(aVar.f2640d, false));
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("alpha", keyframeArr));
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void animBackgroundColor(j jVar) {
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            for (int i = 0; i < this.keyframes.size(); i++) {
                a aVar = this.keyframes.get(i);
                keyframeArr[i] = Keyframe.ofInt(aVar.f2639c, l.f.h(String.valueOf(aVar.f2640d)));
            }
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("backgroundColor", keyframeArr);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(jVar.getBackgroundHelper(), ofKeyframe);
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setEvaluator(new ArgbEvaluator());
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void animHeight(j jVar) {
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            for (int i = 0; i < this.keyframes.size(); i++) {
                a aVar = this.keyframes.get(i);
                keyframeArr[i] = Keyframe.ofInt(aVar.f2639c, (int) c.b(aVar.f2640d));
            }
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("height", keyframeArr);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new AnimViewWrapper(jVar), ofKeyframe);
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void animRotation(View view, int i) {
        if (this.keyframes != null) {
            String str = i != 1 ? i != 2 ? "rotation" : "rotationY" : "rotationX";
            Keyframe[] keyframeArr = new Keyframe[this.keyframes.size()];
            for (int i2 = 0; i2 < this.keyframes.size(); i2++) {
                a aVar = this.keyframes.get(i2);
                keyframeArr[i2] = Keyframe.ofFloat(aVar.f2639c, c.a(aVar.f2640d, false));
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(str, keyframeArr));
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void animScale(View view, int i) {
        ObjectAnimator objectAnimator;
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            for (int i2 = 0; i2 < this.keyframes.size(); i2++) {
                a aVar = this.keyframes.get(i2);
                keyframeArr[i2] = Keyframe.ofFloat(aVar.f2639c, c.a(aVar.f2640d, false));
            }
            if (i == 11) {
                objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", keyframeArr));
            } else if (i != 12) {
                objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleX", keyframeArr), PropertyValuesHolder.ofKeyframe("scaleY", keyframeArr));
            } else {
                objectAnimator = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("scaleY", keyframeArr));
            }
            this.animator = objectAnimator;
            objectAnimator.setDuration(l.f.b(this.duration));
            objectAnimator.setRepeatCount(this.repeatCount);
            objectAnimator.setStartDelay((long) l.f.a(this.delay));
            objectAnimator.setInterpolator(l.f.c(this.easing));
            objectAnimator.addListener(this.animatorListener);
            objectAnimator.start();
        }
    }

    public void animSkew(j jVar) {
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            Keyframe[] keyframeArr2 = new Keyframe[this.keyframes.size()];
            for (int i = 0; i < this.keyframes.size(); i++) {
                a aVar = this.keyframes.get(i);
                Object[] trans2Array = BasicAnimation.trans2Array(aVar.f2640d);
                Keyframe ofFloat = Keyframe.ofFloat(aVar.f2639c, (float) Math.tan(Math.toRadians((double) c.a(trans2Array[0], false))));
                Keyframe ofFloat2 = Keyframe.ofFloat(aVar.f2639c, (float) Math.tan(Math.toRadians((double) c.a(trans2Array[1], false))));
                keyframeArr[i] = ofFloat;
                keyframeArr2[i] = ofFloat2;
            }
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("skewX", keyframeArr);
            PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe("skewY", keyframeArr2);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new AnimViewWrapper(jVar), ofKeyframe, ofKeyframe2);
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void animTranslation(View view) {
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            Keyframe[] keyframeArr2 = new Keyframe[this.keyframes.size()];
            for (int i = 0; i < this.keyframes.size(); i++) {
                a aVar = this.keyframes.get(i);
                Object[] trans2Array = BasicAnimation.trans2Array(aVar.f2640d);
                Keyframe ofFloat = Keyframe.ofFloat(aVar.f2639c, c.b(trans2Array[0]));
                Keyframe ofFloat2 = Keyframe.ofFloat(aVar.f2639c, c.b(trans2Array[1]));
                keyframeArr[i] = ofFloat;
                keyframeArr2[i] = ofFloat2;
            }
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe("translationX", keyframeArr), PropertyValuesHolder.ofKeyframe("translationY", keyframeArr2));
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void animWidth(j jVar) {
        List<a> list = this.keyframes;
        if (list != null) {
            Keyframe[] keyframeArr = new Keyframe[list.size()];
            for (int i = 0; i < this.keyframes.size(); i++) {
                a aVar = this.keyframes.get(i);
                keyframeArr[i] = Keyframe.ofInt(aVar.f2639c, (int) c.b(aVar.f2640d));
            }
            PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe("width", keyframeArr);
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(new AnimViewWrapper(jVar), ofKeyframe);
            this.animator = ofPropertyValuesHolder;
            ofPropertyValuesHolder.setDuration(l.f.b(this.duration));
            ofPropertyValuesHolder.setRepeatCount(this.repeatCount);
            ofPropertyValuesHolder.setStartDelay((long) l.f.a(this.delay));
            ofPropertyValuesHolder.setInterpolator(l.f.c(this.easing));
            ofPropertyValuesHolder.addListener(this.animatorListener);
            ofPropertyValuesHolder.start();
        }
    }

    public void setKeyframes(List<a> list) {
        this.keyframes = list;
    }

    @Override // com.didi.hummer.render.component.anim.BasicAnimation
    public void start(j jVar) {
        int i;
        int i2;
        View view = jVar.getView();
        if ("position".equalsIgnoreCase(this.animType)) {
            animTranslation(view);
        } else if ("opacity".equalsIgnoreCase(this.animType)) {
            animAlpha(view);
        } else {
            if ("scale".equalsIgnoreCase(this.animType)) {
                i2 = 13;
            } else if ("scaleX".equalsIgnoreCase(this.animType)) {
                i2 = 11;
            } else if ("scaleY".equalsIgnoreCase(this.animType)) {
                i2 = 12;
            } else {
                if ("rotationX".equalsIgnoreCase(this.animType)) {
                    i = 1;
                } else if ("rotationY".equalsIgnoreCase(this.animType)) {
                    i = 2;
                } else if ("rotationZ".equalsIgnoreCase(this.animType)) {
                    i = 3;
                } else if ("backgroundColor".equalsIgnoreCase(this.animType)) {
                    animBackgroundColor(jVar);
                    return;
                } else if ("width".equalsIgnoreCase(this.animType)) {
                    animWidth(jVar);
                    return;
                } else if ("height".equalsIgnoreCase(this.animType)) {
                    animHeight(jVar);
                    return;
                } else if ("skew".equalsIgnoreCase(this.animType)) {
                    animSkew(jVar);
                    return;
                } else {
                    return;
                }
                animRotation(view, i);
                return;
            }
            animScale(view, i2);
        }
    }
}
