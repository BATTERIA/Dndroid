package d.b.o;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import c.a.a.a.a;
import d.b.j;

public class o extends PopupWindow {
    public static final boolean b = (Build.VERSION.SDK_INT < 21);

    /* renamed from: a  reason: collision with root package name */
    public boolean f2961a;

    public o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.PopupWindow, i, i2);
        if (obtainStyledAttributes.hasValue(j.PopupWindow_overlapAnchor)) {
            boolean z = obtainStyledAttributes.getBoolean(j.PopupWindow_overlapAnchor, false);
            if (b) {
                this.f2961a = z;
            } else {
                a.a(this, z);
            }
        }
        int i3 = j.PopupWindow_android_popupBackground;
        setBackgroundDrawable((!obtainStyledAttributes.hasValue(i3) || (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) == 0) ? obtainStyledAttributes.getDrawable(i3) : d.b.l.a.a.c(context, resourceId));
        obtainStyledAttributes.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (b && this.f2961a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (b && this.f2961a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (b && this.f2961a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }
}
