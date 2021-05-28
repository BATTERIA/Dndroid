package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import c.a.a.a.a;
import d.g.l.o;

public class j extends EditText implements o {

    /* renamed from: c  reason: collision with root package name */
    public final e f2930c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2931d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = d.b.a.editTextStyle
            android.content.Context r2 = d.b.o.q0.a(r2)
            r1.<init>(r2, r3, r0)
            d.b.o.e r2 = new d.b.o.e
            r2.<init>(r1)
            r1.f2930c = r2
            r2.a(r3, r0)
            d.b.o.w r2 = new d.b.o.w
            r2.<init>(r1)
            r1.f2931d = r2
            r2.a(r3, r0)
            d.b.o.w r2 = r1.f2931d
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.j.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2930c;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.f2931d;
        if (wVar != null) {
            wVar.a();
        }
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2930c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2930c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2930c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f2930c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.a((TextView) this, callback));
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2930c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2930c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.f2931d;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }
}
