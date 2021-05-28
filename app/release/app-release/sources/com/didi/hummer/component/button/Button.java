package com.didi.hummer.component.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsProperty;
import e.c.a.b.l;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class Button extends j<android.widget.Button> {
    public Map<Integer, Drawable> bgDrawableMap = new HashMap();
    @JsProperty
    public Map<String, Object> disabled;
    public Drawable orgBackground;
    public ColorStateList orgTextColors;
    public float orgTextSize;
    public Typeface orgTypeface;
    @JsProperty
    public Map<String, Object> pressed;
    @JsProperty
    public String text;
    public Map<Integer, Integer> textColorMap = new HashMap();

    public Button(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
    }

    private void mergeDisabledStyle() {
        l.f.a(this.style, this.disabled);
        Drawable b = l.f.b(this.disabled);
        if (b != null) {
            this.bgDrawableMap.put(2, b);
        }
        this.textColorMap.put(2, Integer.valueOf(l.f.c(this.disabled)));
    }

    private void mergePressedStyle() {
        l.f.a(this.style, this.pressed);
        Drawable b = l.f.b(this.pressed);
        if (b != null) {
            this.bgDrawableMap.put(1, b);
        }
        this.textColorMap.put(1, Integer.valueOf(l.f.c(this.pressed)));
    }

    private void requestLayout() {
        getYogaNode().dirty();
        ((android.widget.Button) getView()).requestLayout();
    }

    private void updateBackground() {
        updateBackgroundDrawable();
        updateTextColor();
    }

    private void updateBackgroundDrawable() {
        if (this.bgDrawableMap.containsKey(1) || this.bgDrawableMap.containsKey(2)) {
            Map<Integer, Drawable> map = this.bgDrawableMap;
            StateListDrawable stateListDrawable = new StateListDrawable();
            for (Integer num : map.keySet()) {
                int intValue = num.intValue();
                if (intValue == 0) {
                    stateListDrawable.addState(new int[]{-16842919, 16842910}, map.get(0));
                } else if (intValue == 1) {
                    stateListDrawable.addState(new int[]{16842919}, map.get(1));
                } else if (intValue == 2) {
                    stateListDrawable.addState(new int[]{-16842910}, map.get(2));
                }
            }
            View view = this.backgroundHelper.b;
            if (view != null) {
                view.setBackground(stateListDrawable);
            }
        }
    }

    private void updateTextColor() {
        ColorStateList colorStateList;
        Integer num;
        if (this.textColorMap.containsKey(1) || this.textColorMap.containsKey(2)) {
            if (!this.textColorMap.containsKey(0)) {
                this.textColorMap.put(0, -16777216);
            }
            Map<Integer, Integer> map = this.textColorMap;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Integer num2 : map.keySet()) {
                int intValue = num2.intValue();
                if (intValue == 0) {
                    arrayList.add(new int[]{-16842919, 16842910});
                } else if (intValue == 1) {
                    arrayList.add(new int[]{16842919});
                } else if (intValue == 2) {
                    arrayList.add(new int[]{-16842910});
                }
                arrayList2.add(map.get(num2));
            }
            if (arrayList.size() <= 0) {
                colorStateList = null;
            } else {
                int[][] iArr = new int[arrayList.size()][];
                int[] iArr2 = new int[arrayList2.size()];
                for (int i = 0; i < arrayList2.size(); i++) {
                    iArr2[i] = ((Integer) arrayList2.get(i)).intValue();
                }
                colorStateList = new ColorStateList((int[][]) arrayList.toArray(iArr), iArr2);
            }
            if (colorStateList != null) {
                ((android.widget.Button) getView()).setTextColor(colorStateList);
            }
        } else if (this.textColorMap.containsKey(0) && (num = this.textColorMap.get(0)) != null) {
            ((android.widget.Button) getView()).setTextColor(num.intValue());
        }
    }

    @Override // e.e.a.y.a.b.j
    public android.widget.Button createViewInstance(Context context) {
        return new android.widget.Button(context);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        this.orgBackground = ((android.widget.Button) getView()).getBackground();
        this.orgTextColors = ((android.widget.Button) getView()).getTextColors();
        this.orgTextSize = ((android.widget.Button) getView()).getTextSize();
        this.orgTypeface = ((android.widget.Button) getView()).getTypeface();
        ((android.widget.Button) getView()).setAllCaps(false);
        ((android.widget.Button) getView()).setTypeface(null, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            ((android.widget.Button) getView()).setStateListAnimator(null);
        }
    }

    @Override // e.e.a.y.a.b.j
    public void onStyleUpdated(Map<String, Object> map) {
        if (map.containsKey("backgroundColor")) {
            Map<Integer, Drawable> map2 = this.bgDrawableMap;
            View view = this.backgroundHelper.b;
            map2.put(0, view == null ? null : view.getBackground());
        }
        if (map.containsKey("color")) {
            this.textColorMap.put(0, Integer.valueOf(l.f.c(map)));
        }
        mergePressedStyle();
        mergeDisabledStyle();
        updateBackground();
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        ((android.widget.Button) getView()).setBackground(this.orgBackground);
        ((android.widget.Button) getView()).setTextColor(this.orgTextColors);
        ((android.widget.Button) getView()).setTextSize(0, this.orgTextSize);
        ((android.widget.Button) getView()).setTypeface(this.orgTypeface);
        setTextAlign("center");
    }

    @Override // e.e.a.y.a.b.j
    public void setBackgroundColor(Object obj) {
        super.setBackgroundColor(obj);
        ((android.widget.Button) getView()).setPadding(0, 0, 0, 0);
    }

    @Override // e.e.a.y.a.b.j
    public void setBackgroundImage(String str) {
        super.setBackgroundImage(str);
        ((android.widget.Button) getView()).setPadding(0, 0, 0, 0);
    }

    @JsAttribute
    public void setColor(int i) {
        ((android.widget.Button) getView()).setTextColor(i);
    }

    public void setDisabled(Map<String, Object> map) {
        this.disabled = map;
        mergeDisabledStyle();
        updateBackground();
    }

    @JsAttribute
    public void setFontFamily(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            if (split.length != 0) {
                int style = ((android.widget.Button) getView()).getTypeface() != null ? ((android.widget.Button) getView()).getTypeface().getStyle() : 0;
                for (String str2 : split) {
                    Typeface a2 = e.e.a.o.n.b.a().a(str2.trim(), style, getContext().getAssets());
                    if (a2 != null) {
                        ((android.widget.Button) getView()).setTypeface(a2);
                        requestLayout();
                        return;
                    }
                }
            }
        }
    }

    @JsAttribute
    public void setFontSize(float f2) {
        ((android.widget.Button) getView()).setTextSize(0, f2);
        requestLayout();
    }

    public void setPressed(Map<String, Object> map) {
        this.pressed = map;
        mergePressedStyle();
        updateBackground();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -1224696685:
                if (str.equals("fontFamily")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 94842723:
                if (str.equals("color")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            setColor(((Integer) obj).intValue());
        } else if (c2 == 1) {
            setFontSize(((Float) obj).floatValue());
        } else if (c2 == 2) {
            setFontFamily(String.valueOf(obj));
        } else if (c2 != 3) {
            return false;
        } else {
            setTextAlign(String.valueOf(obj));
        }
        return true;
    }

    public void setText(String str) {
        ((android.widget.Button) getView()).setText(str);
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    @com.didi.hummer.annotation.JsAttribute
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextAlign(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r5 = r5.toLowerCase()
            int r0 = r5.hashCode()
            r1 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L_0x002e
            r1 = 3317767(0x32a007, float:4.649182E-39)
            if (r0 == r1) goto L_0x0024
            r1 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r0 == r1) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = 3
            goto L_0x0039
        L_0x0024:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = 2
            goto L_0x0039
        L_0x002e:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0038
            r5 = 0
            goto L_0x0039
        L_0x0038:
            r5 = -1
        L_0x0039:
            if (r5 == r3) goto L_0x0053
            if (r5 == r2) goto L_0x0049
            android.view.View r5 = r4.getView()
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 17
        L_0x0045:
            r5.setGravity(r0)
            goto L_0x005d
        L_0x0049:
            android.view.View r5 = r4.getView()
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 8388629(0x800015, float:1.1754973E-38)
            goto L_0x0045
        L_0x0053:
            android.view.View r5 = r4.getView()
            android.widget.Button r5 = (android.widget.Button) r5
            r0 = 8388627(0x800013, float:1.175497E-38)
            goto L_0x0045
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.component.button.Button.setTextAlign(java.lang.String):void");
    }
}
