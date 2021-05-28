package com.didi.hummer.component.imageview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsProperty;
import e.c.a.b.l;
import e.e.a.o.g.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;

@Component
public class Image extends j<b> {
    @JsProperty
    public int gifRepeatCount;
    @JsProperty
    public String gifSrc;
    @JsProperty
    public String src;

    public Image(e.e.a.p.b bVar, c cVar, String str) {
        super(bVar, cVar, str);
    }

    @Override // e.e.a.y.a.b.j
    public b createViewInstance(Context context) {
        return new b(context);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        ((b) getView()).setScaleType(ImageView.ScaleType.CENTER);
        ((b) getView()).setFocusable(true);
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        setContentMode("origin");
        setBorderWidth(0.0f);
        setBorderColor(0);
        setBorderRadius(0);
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderBottomLeftRadius(Object obj) {
        super.setBorderBottomLeftRadius(obj);
        ((b) getView()).setCornerRadii(this.backgroundHelper.b());
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderBottomRightRadius(Object obj) {
        super.setBorderBottomRightRadius(obj);
        ((b) getView()).setCornerRadii(this.backgroundHelper.b());
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderColor(int i) {
        if (TextUtils.isEmpty(this.src)) {
            super.setBorderColor(i);
        }
        ((b) getView()).setBorderColor(i);
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderRadius(Object obj) {
        super.setBorderRadius(obj);
        if (e.e.a.y.c.c.d(obj)) {
            ((b) getView()).setBorderRadiusPercent(e.e.a.y.c.c.e(obj) / 100.0f);
        } else if (obj instanceof Float) {
            ((b) getView()).setBorderRadius(((Float) obj).floatValue());
        }
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderStyle(String str) {
        if (TextUtils.isEmpty(this.src)) {
            super.setBorderStyle(str);
        }
        ((b) getView()).setBorderStyle(str);
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderTopLeftRadius(Object obj) {
        super.setBorderTopLeftRadius(obj);
        ((b) getView()).setCornerRadii(this.backgroundHelper.b());
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderTopRightRadius(Object obj) {
        super.setBorderTopRightRadius(obj);
        ((b) getView()).setCornerRadii(this.backgroundHelper.b());
    }

    @Override // e.e.a.y.a.b.j
    public void setBorderWidth(float f2) {
        if (TextUtils.isEmpty(this.src)) {
            super.setBorderWidth(f2);
        }
        ((b) getView()).setBorderWidth(f2);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @JsAttribute
    public void setContentMode(String str) {
        char c2;
        b bVar;
        ImageView.ScaleType scaleType;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1008619738:
                if (str.equals("origin")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 94852023:
                if (str.equals("cover")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 951526612:
                if (str.equals("contain")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 2) {
            bVar = (b) getView();
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if (c2 == 3) {
            bVar = (b) getView();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (c2 != 4) {
            bVar = (b) getView();
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            bVar = (b) getView();
            scaleType = ImageView.ScaleType.FIT_XY;
        }
        bVar.setScaleType(scaleType);
    }

    public void setGifRepeatCount(int i) {
        this.gifRepeatCount = i;
    }

    public void setGifSrc(String str) {
        this.gifSrc = str;
        l.f.a((e.e.a.p.b) getContext(), (ImageView) getView(), str, true, this.gifRepeatCount);
    }

    public void setSrc(String str) {
        this.src = str;
        l.f.a((e.e.a.p.b) getContext(), (ImageView) getView(), str, false, 0);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -934437708:
                if (str.equals("resize")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            setContentMode(String.valueOf(obj));
        } else if (c2 == 1) {
            setBorderWidth(((Float) obj).floatValue());
        } else if (c2 == 2) {
            setBorderColor(((Integer) obj).intValue());
        } else if (c2 == 3) {
            setBorderStyle((String) obj);
        } else if (c2 != 4) {
            return false;
        } else {
            setBorderRadius(obj);
        }
        return true;
    }
}
