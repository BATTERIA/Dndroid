package com.didi.hummer.component.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsProperty;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;

@Component
public class Switch extends j<android.widget.Switch> implements CompoundButton.OnCheckedChangeListener {
    @JsProperty
    public boolean checked;
    public Integer mOffTrackColor;
    public Integer mOnTrackColor;

    public Switch(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
    }

    private void setColor(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    private void setTrackColor(Integer num) {
        setColor(((android.widget.Switch) getView()).getTrackDrawable(), num);
    }

    private void setTrackColor(boolean z) {
        setTrackColor(z ? this.mOnTrackColor : this.mOffTrackColor);
    }

    @Override // e.e.a.y.a.b.j
    public android.widget.Switch createViewInstance(Context context) {
        return new android.widget.Switch(context);
    }

    public void doChecked(boolean z) {
        if (((android.widget.Switch) getView()).isChecked() != z) {
            ((android.widget.Switch) getView()).setChecked(z);
            setTrackColor(z);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.checked = z;
        setTrackColor(z);
        e.e.a.y.b.d.c cVar = new e.e.a.y.b.d.c();
        System.currentTimeMillis();
        this.mEventManager.a("switch", cVar);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        ((android.widget.Switch) getView()).setOnCheckedChangeListener(this);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onDestroy() {
        super.onDestroy();
        ((android.widget.Switch) getView()).setOnCheckedChangeListener(null);
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        this.mOnTrackColor = null;
        this.mOffTrackColor = null;
        ((android.widget.Switch) getView()).getTrackDrawable().clearColorFilter();
        ((android.widget.Switch) getView()).getThumbDrawable().clearColorFilter();
    }

    public void setChecked(boolean z) {
        doChecked(z);
    }

    @JsAttribute
    public void setOffColor(int i) {
        this.mOffTrackColor = Integer.valueOf(i);
        if (!((android.widget.Switch) getView()).isChecked()) {
            setTrackColor(Integer.valueOf(i));
        }
    }

    @JsAttribute
    public void setOnColor(int i) {
        this.mOnTrackColor = Integer.valueOf(i);
        if (((android.widget.Switch) getView()).isChecked()) {
            setTrackColor(Integer.valueOf(i));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051  */
    @Override // e.e.a.y.a.b.j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean setStyle(java.lang.String r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = -1742453971(0xffffffff9824432d, float:-2.1230418E-24)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = -1351809852(0xffffffffaf6d04c4, float:-2.1556718E-10)
            if (r0 == r1) goto L_0x0021
            r1 = -800022732(0xffffffffd0509f34, float:-1.40003779E10)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "offColor"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0035
            r6 = 1
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "onColor"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0035
            r6 = 0
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "thumbColor"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0035
            r6 = 2
            goto L_0x0036
        L_0x0035:
            r6 = -1
        L_0x0036:
            if (r6 == 0) goto L_0x0051
            if (r6 == r4) goto L_0x0047
            if (r6 == r3) goto L_0x003d
            return r2
        L_0x003d:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.setThumbColor(r6)
            goto L_0x005a
        L_0x0047:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.setOffColor(r6)
            goto L_0x005a
        L_0x0051:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.setOnColor(r6)
        L_0x005a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.component.switchview.Switch.setStyle(java.lang.String, java.lang.Object):boolean");
    }

    @JsAttribute
    public void setThumbColor(int i) {
        setColor(((android.widget.Switch) getView()).getThumbDrawable(), Integer.valueOf(i));
    }
}
