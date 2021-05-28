package d.b.o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import c.a.a.a.a;

public class g extends CheckedTextView {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2904d = {16843016};

    /* renamed from: c  reason: collision with root package name */
    public final w f2905c;

    public g(Context context, AttributeSet attributeSet) {
        super(q0.a(context), attributeSet, 16843720);
        w wVar = new w(this);
        this.f2905c = wVar;
        wVar.a(attributeSet, 16843720);
        this.f2905c.a();
        t0 a2 = t0.a(getContext(), attributeSet, f2904d, 16843720, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        w wVar = this.f2905c;
        if (wVar != null) {
            wVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(d.b.l.a.a.c(getContext(), i));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.f2905c;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }
}
