package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import c.a.a.a.a;
import d.g.l.o;

public class n extends MultiAutoCompleteTextView implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2954e = {16843126};

    /* renamed from: c  reason: collision with root package name */
    public final e f2955c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2956d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = d.b.a.autoCompleteTextViewStyle
            android.content.Context r4 = d.b.o.q0.a(r4)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            int[] r1 = d.b.o.n.f2954e
            r2 = 0
            d.b.o.t0 r4 = d.b.o.t0.a(r4, r5, r1, r0, r2)
            boolean r1 = r4.e(r2)
            if (r1 == 0) goto L_0x0021
            android.graphics.drawable.Drawable r1 = r4.b(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L_0x0021:
            android.content.res.TypedArray r4 = r4.b
            r4.recycle()
            d.b.o.e r4 = new d.b.o.e
            r4.<init>(r3)
            r3.f2955c = r4
            r4.a(r5, r0)
            d.b.o.w r4 = new d.b.o.w
            r4.<init>(r3)
            r3.f2956d = r4
            r4.a(r5, r0)
            d.b.o.w r4 = r3.f2956d
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.n.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2955c;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.f2956d;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2955c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2955c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2955c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f2955c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(d.b.l.a.a.c(getContext(), i));
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2955c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2955c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.f2956d;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }
}
