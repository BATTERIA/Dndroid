package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import d.b.a;
import d.b.o.h;
import d.b.o.q0;
import d.g.m.e;

public class AppCompatCheckBox extends CheckBox implements e {

    /* renamed from: c  reason: collision with root package name */
    public final h f2306c;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.checkboxStyle);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(q0.a(context), attributeSet, i);
        h hVar = new h(this);
        this.f2306c = hVar;
        hVar.a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f2306c;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f2306c;
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f2306c;
        if (hVar != null) {
            return hVar.f2908c;
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(d.b.l.a.a.c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f2306c;
        if (hVar == null) {
            return;
        }
        if (hVar.f2911f) {
            hVar.f2911f = false;
            return;
        }
        hVar.f2911f = true;
        hVar.a();
    }

    @Override // d.g.m.e
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        h hVar = this.f2306c;
        if (hVar != null) {
            hVar.b = colorStateList;
            hVar.f2909d = true;
            hVar.a();
        }
    }

    @Override // d.g.m.e
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f2306c;
        if (hVar != null) {
            hVar.f2908c = mode;
            hVar.f2910e = true;
            hVar.a();
        }
    }
}
