package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import d.b.a;
import d.g.l.o;

public class d extends AutoCompleteTextView implements o {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2879e = {16843126};

    /* renamed from: c  reason: collision with root package name */
    public final e f2880c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2881d;

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.autoCompleteTextViewStyle);
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(q0.a(context), attributeSet, i);
        t0 a2 = t0.a(getContext(), attributeSet, f2879e, i, 0);
        if (a2.e(0)) {
            setDropDownBackgroundDrawable(a2.b(0));
        }
        a2.b.recycle();
        e eVar = new e(this);
        this.f2880c = eVar;
        eVar.a(attributeSet, i);
        w wVar = new w(this);
        this.f2881d = wVar;
        wVar.a(attributeSet, i);
        this.f2881d.a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2880c;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.f2881d;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2880c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2880c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c.a.a.a.a.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2880c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f2880c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.a.a.a.a.a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(d.b.l.a.a.c(getContext(), i));
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2880c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2880c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.f2881d;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }
}
