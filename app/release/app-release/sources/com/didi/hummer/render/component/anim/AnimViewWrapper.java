package com.didi.hummer.render.component.anim;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import e.e.a.y.a.b.f;
import e.e.a.y.a.b.j;

public class AnimViewWrapper {
    public j mTarget;

    public AnimViewWrapper(j jVar) {
        this.mTarget = jVar;
    }

    public float getAlpha() {
        return this.mTarget.getView().getAlpha();
    }

    public int getBackgroundColor() {
        return this.mTarget.getBackgroundHelper().a().f4564c;
    }

    public int getHeight() {
        return this.mTarget.getView().getHeight();
    }

    public float getRotation() {
        return this.mTarget.getView().getRotation();
    }

    public float getRotationX() {
        return this.mTarget.getView().getRotationX();
    }

    public float getRotationY() {
        return this.mTarget.getView().getRotationY();
    }

    public float getScaleX() {
        return this.mTarget.getView().getScaleX();
    }

    public float getScaleY() {
        return this.mTarget.getView().getScaleY();
    }

    public float getSkewX() {
        if (Build.VERSION.SDK_INT < 29) {
            return 0.0f;
        }
        Matrix animationMatrix = this.mTarget.getView().getAnimationMatrix();
        if (animationMatrix == null) {
            animationMatrix = this.mTarget.getView().getMatrix();
        }
        float[] fArr = new float[9];
        animationMatrix.getValues(fArr);
        return fArr[1];
    }

    public float getSkewY() {
        if (Build.VERSION.SDK_INT < 29) {
            return 0.0f;
        }
        Matrix animationMatrix = this.mTarget.getView().getAnimationMatrix();
        if (animationMatrix == null) {
            animationMatrix = this.mTarget.getView().getMatrix();
        }
        float[] fArr = new float[9];
        animationMatrix.getValues(fArr);
        return fArr[3];
    }

    public float getTranslationX() {
        return this.mTarget.getView().getTranslationX();
    }

    public float getTranslationY() {
        return this.mTarget.getView().getTranslationY();
    }

    public int getWidth() {
        return this.mTarget.getView().getWidth();
    }

    public void setAlpha(float f2) {
        this.mTarget.getView().setAlpha(f2);
    }

    public void setBackgroundColor(int i) {
        f a2 = this.mTarget.getBackgroundHelper().a();
        a2.f4564c = i;
        a2.b = null;
        a2.f4563a = null;
        a2.invalidateSelf();
    }

    public void setHeight(int i) {
        this.mTarget.getYogaNode().setHeight((float) i);
        this.mTarget.getView().requestLayout();
    }

    public void setRotation(float f2) {
        this.mTarget.getView().setRotation(f2);
    }

    public void setRotationX(float f2) {
        this.mTarget.getView().setRotationX(f2);
    }

    public void setRotationY(float f2) {
        this.mTarget.getView().setRotationY(f2);
    }

    public void setScaleX(float f2) {
        this.mTarget.getView().setScaleX(f2);
    }

    public void setScaleY(float f2) {
        this.mTarget.getView().setScaleY(f2);
    }

    public void setSkewX(float f2) {
        if (Build.VERSION.SDK_INT >= 29) {
            View view = this.mTarget.getView();
            Matrix animationMatrix = view.getAnimationMatrix();
            if (animationMatrix == null) {
                animationMatrix = new Matrix();
            }
            float[] fArr = new float[9];
            animationMatrix.getValues(fArr);
            animationMatrix.setSkew(f2, fArr[3]);
            view.setAnimationMatrix(animationMatrix);
        }
    }

    public void setSkewY(float f2) {
        if (Build.VERSION.SDK_INT >= 29) {
            View view = this.mTarget.getView();
            Matrix animationMatrix = view.getAnimationMatrix();
            if (animationMatrix == null) {
                animationMatrix = new Matrix();
            }
            float[] fArr = new float[9];
            animationMatrix.getValues(fArr);
            animationMatrix.setSkew(fArr[1], f2);
            view.setAnimationMatrix(animationMatrix);
        }
    }

    public void setTranslationX(float f2) {
        this.mTarget.getView().setTranslationX(f2);
    }

    public void setTranslationY(float f2) {
        this.mTarget.getView().setTranslationY(f2);
    }

    public void setWidth(int i) {
        this.mTarget.getYogaNode().setWidth((float) i);
        this.mTarget.getView().requestLayout();
    }
}
