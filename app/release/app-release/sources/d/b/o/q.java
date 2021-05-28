package d.b.o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.RadioButton;
import d.b.l.a.a;
import d.g.m.e;

public class q extends RadioButton implements e {

    /* renamed from: c  reason: collision with root package name */
    public final h f2970c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2971d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = d.b.a.radioButtonStyle
            android.content.Context r2 = d.b.o.q0.a(r2)
            r1.<init>(r2, r3, r0)
            d.b.o.h r2 = new d.b.o.h
            r2.<init>(r1)
            r1.f2970c = r2
            r2.a(r3, r0)
            d.b.o.w r2 = new d.b.o.w
            r2.<init>(r1)
            r1.f2971d = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.q.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        h hVar = this.f2970c;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        h hVar = this.f2970c;
        if (hVar != null) {
            return hVar.b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        h hVar = this.f2970c;
        if (hVar != null) {
            return hVar.f2908c;
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.c(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        h hVar = this.f2970c;
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
        h hVar = this.f2970c;
        if (hVar != null) {
            hVar.b = colorStateList;
            hVar.f2909d = true;
            hVar.a();
        }
    }

    @Override // d.g.m.e
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        h hVar = this.f2970c;
        if (hVar != null) {
            hVar.f2908c = mode;
            hVar.f2910e = true;
            hVar.a();
        }
    }
}
