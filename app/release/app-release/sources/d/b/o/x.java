package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d.g.j.a;
import d.g.l.o;
import d.g.m.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class x extends TextView implements o, b {

    /* renamed from: c  reason: collision with root package name */
    public final e f3019c;

    /* renamed from: d  reason: collision with root package name */
    public final w f3020d;

    /* renamed from: e  reason: collision with root package name */
    public Future<a> f3021e;

    public x(Context context) {
        this(context, null);
    }

    public x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public x(Context context, AttributeSet attributeSet, int i) {
        super(q0.a(context), attributeSet, i);
        e eVar = new e(this);
        this.f3019c = eVar;
        eVar.a(attributeSet, i);
        w wVar = new w(this);
        this.f3020d = wVar;
        wVar.a(attributeSet, i);
        this.f3020d.a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f3019c;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            wVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f3387a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            return Math.round(wVar.f3008h.f3033e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f3387a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            return Math.round(wVar.f3008h.f3032d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f3387a) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            return Math.round(wVar.f3008h.f3031c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f3387a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f3020d;
        return wVar != null ? wVar.f3008h.f3034f : new int[0];
    }

    public int getAutoSizeTextType() {
        if (b.f3387a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            return wVar.f3008h.f3030a;
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f3019c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f3019c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public CharSequence getText() {
        Future<a> future = this.f3021e;
        if (future != null) {
            try {
                this.f3021e = null;
                c.a.a.a.a.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public a.C0103a getTextMetricsParamsCompat() {
        return c.a.a.a.a.a((TextView) this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        c.a.a.a.a.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w wVar = this.f3020d;
        if (wVar != null && !b.f3387a) {
            wVar.f3008h.a();
        }
    }

    public void onMeasure(int i, int i2) {
        Future<a> future = this.f3021e;
        if (future != null) {
            try {
                this.f3021e = null;
                c.a.a.a.a.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        w wVar = this.f3020d;
        if (wVar != null && !b.f3387a && wVar.b()) {
            this.f3020d.f3008h.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f3387a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            wVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f3387a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            wVar.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f3387a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        w wVar = this.f3020d;
        if (wVar != null) {
            wVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f3019c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f3019c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.a.a.a.a.a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            c.a.a.a.a.a(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            c.a.a.a.a.b(this, i);
        }
    }

    public void setLineHeight(int i) {
        c.a.a.a.a.c(this, i);
    }

    public void setPrecomputedText(a aVar) {
        c.a.a.a.a.a((TextView) this, aVar);
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f3019c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f3019c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.f3020d;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }

    public void setTextFuture(Future<a> future) {
        this.f3021e = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(a.C0103a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = aVar.f3322a.getTextScaleX();
            getPaint().set(aVar.f3322a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f3322a);
        setBreakStrategy(aVar.f3323c);
        setHyphenationFrequency(aVar.f3324d);
    }

    public void setTextSize(int i, float f2) {
        boolean z = b.f3387a;
        if (z) {
            super.setTextSize(i, f2);
            return;
        }
        w wVar = this.f3020d;
        if (wVar != null && !z && !wVar.b()) {
            wVar.f3008h.a(i, f2);
        }
    }
}
