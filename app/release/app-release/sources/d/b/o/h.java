package d.b.o;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import c.a.a.a.a;
import d.b.j;
import d.g.m.e;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f2907a;
    public ColorStateList b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f2908c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2909d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2910e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2911f;

    public h(CompoundButton compoundButton) {
        this.f2907a = compoundButton;
    }

    public void a() {
        Drawable a2 = a.a(this.f2907a);
        if (a2 == null) {
            return;
        }
        if (this.f2909d || this.f2910e) {
            Drawable mutate = a.a(a2).mutate();
            if (this.f2909d) {
                a.a(mutate, this.b);
            }
            if (this.f2910e) {
                a.a(mutate, this.f2908c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f2907a.getDrawableState());
            }
            this.f2907a.setButtonDrawable(mutate);
        }
    }

    public void a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f2907a.getContext().obtainStyledAttributes(attributeSet, j.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(j.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(j.CompoundButton_android_button, 0)) != 0) {
                this.f2907a.setButtonDrawable(d.b.l.a.a.c(this.f2907a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(j.CompoundButton_buttonTint)) {
                CompoundButton compoundButton = this.f2907a;
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(j.CompoundButton_buttonTint);
                if (Build.VERSION.SDK_INT >= 21) {
                    compoundButton.setButtonTintList(colorStateList);
                } else if (compoundButton instanceof e) {
                    ((e) compoundButton).setSupportButtonTintList(colorStateList);
                }
            }
            if (obtainStyledAttributes.hasValue(j.CompoundButton_buttonTintMode)) {
                CompoundButton compoundButton2 = this.f2907a;
                PorterDuff.Mode a2 = b0.a(obtainStyledAttributes.getInt(j.CompoundButton_buttonTintMode, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    compoundButton2.setButtonTintMode(a2);
                } else if (compoundButton2 instanceof e) {
                    ((e) compoundButton2).setSupportButtonTintMode(a2);
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
