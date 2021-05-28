package d.b.o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import c.a.a.a.a;
import d.g.l.o;
import d.g.m.b;

public class f extends Button implements o, b {

    /* renamed from: c  reason: collision with root package name */
    public final e f2895c;

    /* renamed from: d  reason: collision with root package name */
    public final w f2896d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = d.b.a.buttonStyle
            android.content.Context r2 = d.b.o.q0.a(r2)
            r1.<init>(r2, r3, r0)
            d.b.o.e r2 = new d.b.o.e
            r2.<init>(r1)
            r1.f2895c = r2
            r2.a(r3, r0)
            d.b.o.w r2 = new d.b.o.w
            r2.<init>(r1)
            r1.f2896d = r2
            r2.a(r3, r0)
            d.b.o.w r2 = r1.f2896d
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.b.o.f.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f2895c;
        if (eVar != null) {
            eVar.a();
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            wVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f3387a) {
            return super.getAutoSizeMaxTextSize();
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            return Math.round(wVar.f3008h.f3033e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f3387a) {
            return super.getAutoSizeMinTextSize();
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            return Math.round(wVar.f3008h.f3032d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f3387a) {
            return super.getAutoSizeStepGranularity();
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            return Math.round(wVar.f3008h.f3031c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f3387a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        w wVar = this.f2896d;
        return wVar != null ? wVar.f3008h.f3034f : new int[0];
    }

    public int getAutoSizeTextType() {
        if (b.f3387a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            return wVar.f3008h.f3030a;
        }
        return 0;
    }

    @Override // d.g.l.o
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f2895c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // d.g.l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f2895c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        w wVar = this.f2896d;
        if (wVar != null && !b.f3387a) {
            wVar.f3008h.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        w wVar = this.f2896d;
        if (wVar != null && !b.f3387a && wVar.b()) {
            this.f2896d.f3008h.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.f3387a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            wVar.a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.f3387a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            wVar.a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.f3387a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        w wVar = this.f2896d;
        if (wVar != null) {
            wVar.a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f2895c;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f2895c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        w wVar = this.f2896d;
        if (wVar != null) {
            wVar.f3002a.setAllCaps(z);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f2895c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // d.g.l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f2895c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        w wVar = this.f2896d;
        if (wVar != null) {
            wVar.a(context, i);
        }
    }

    public void setTextSize(int i, float f2) {
        boolean z = b.f3387a;
        if (z) {
            super.setTextSize(i, f2);
            return;
        }
        w wVar = this.f2896d;
        if (wVar != null && !z && !wVar.b()) {
            wVar.f3008h.a(i, f2);
        }
    }
}
