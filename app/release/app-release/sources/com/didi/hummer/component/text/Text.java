package com.didi.hummer.component.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.widget.TextView;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsProperty;
import e.c.a.b.l;
import e.e.a.o.n.a;
import e.e.a.o.n.e;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class Text extends j<TextView> {
    public String fontStyle;
    public String fontWeight;
    @JsProperty
    public String formattedText;
    public ColorStateList orgTextColors;
    public float orgTextSize;
    public Typeface orgTypeface;
    @JsProperty
    public Object richText;
    @JsProperty
    public String text;

    public Text(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
    }

    private Spanned fromHtml(String str) {
        return Build.VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 0) : Html.fromHtml(str);
    }

    private void processTextTypeface(String str, String str2) {
        Typeface typeface;
        TextView textView;
        int i;
        if ("bold".equals(str) && "italic".equals(str2)) {
            textView = (TextView) getView();
            typeface = ((TextView) getView()).getTypeface();
            i = 3;
        } else if ("bold".equals(str)) {
            textView = (TextView) getView();
            typeface = ((TextView) getView()).getTypeface();
            i = 1;
        } else if ("italic".equals(str2)) {
            textView = (TextView) getView();
            typeface = ((TextView) getView()).getTypeface();
            i = 2;
        } else {
            textView = (TextView) getView();
            typeface = null;
            i = 0;
        }
        textView.setTypeface(typeface, i);
    }

    private void requestLayout() {
        getYogaNode().dirty();
        ((TextView) getView()).requestLayout();
    }

    /* access modifiers changed from: private */
    public void setRowText(CharSequence charSequence) {
        ((TextView) getView()).setText(charSequence);
        requestLayout();
    }

    @Override // e.e.a.y.a.b.j
    public TextView createViewInstance(Context context) {
        return new TextView(context);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        this.orgTextColors = ((TextView) getView()).getTextColors();
        this.orgTextSize = ((TextView) getView()).getTextSize();
        this.orgTypeface = ((TextView) getView()).getTypeface();
        ((TextView) getView()).setGravity(8388627);
        ((TextView) getView()).setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        ((TextView) getView()).setTextColor(this.orgTextColors);
        ((TextView) getView()).setTextSize(0, this.orgTextSize);
        ((TextView) getView()).setTypeface(this.orgTypeface);
        setTextAlign("left");
        setTextDecoration("none");
        setTextOverflow("ellipsis");
        setTextLineClamp(Integer.MAX_VALUE);
        setLetterSpacing(0.0f);
        setLetterSpacing(1.0f);
    }

    @JsAttribute
    public void setColor(int i) {
        ((TextView) getView()).setTextColor(i);
    }

    @JsAttribute
    public void setFontFamily(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            if (split.length != 0) {
                int style = ((TextView) getView()).getTypeface() != null ? ((TextView) getView()).getTypeface().getStyle() : 0;
                for (String str2 : split) {
                    Typeface a2 = e.e.a.o.n.b.a().a(str2.trim(), style, getContext().getAssets());
                    if (a2 != null) {
                        ((TextView) getView()).setTypeface(a2);
                        requestLayout();
                        return;
                    }
                }
            }
        }
    }

    @JsAttribute
    public void setFontSize(float f2) {
        ((TextView) getView()).setTextSize(0, f2);
        requestLayout();
    }

    @JsAttribute
    public void setFontStyle(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.fontStyle = lowerCase;
            processTextTypeface(this.fontWeight, lowerCase);
            requestLayout();
        }
    }

    @JsAttribute
    public void setFontWeight(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            this.fontWeight = lowerCase;
            processTextTypeface(lowerCase, this.fontStyle);
            requestLayout();
        }
    }

    public void setFormattedText(String str) {
        setRowText(fromHtml(str));
    }

    @JsAttribute
    public void setLetterSpacing(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            ((TextView) getView()).setLetterSpacing(f2);
            requestLayout();
        }
    }

    @JsAttribute
    public void setLineSpacingMulti(float f2) {
        ((TextView) getView()).setLineSpacing(0.0f, f2);
        requestLayout();
    }

    public void setRichText(Object obj) {
        if (!(obj instanceof String)) {
            a aVar = new a(this);
            if (obj instanceof Map) {
                e a2 = l.f.a((Map) obj);
                if (!TextUtils.isEmpty(a2.i) && TextUtils.isEmpty(a2.f4419a)) {
                    a2.f4419a = " ";
                }
                SpannableString spannableString = new SpannableString(a2.f4419a);
                l.f.a(this, spannableString, a2, 0, spannableString.length());
                if (!TextUtils.isEmpty(a2.i)) {
                    l.f.a(this, spannableString, a2, 0, spannableString.length(), aVar);
                    return;
                }
                l.f.a(spannableString, a2, 0, spannableString.length());
                if (aVar != null) {
                    aVar.a(spannableString);
                }
            } else if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (obj2 instanceof String) {
                        arrayList.add(new e((String) obj2));
                    } else if (obj2 instanceof Map) {
                        arrayList.add(l.f.a((Map) obj2));
                    }
                }
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e eVar = (e) it.next();
                        if (!TextUtils.isEmpty(eVar.i) && TextUtils.isEmpty(eVar.f4419a)) {
                            eVar.f4419a = " ";
                        }
                        sb.append(eVar.f4419a);
                    }
                    SpannableString spannableString2 = new SpannableString(sb);
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        e eVar2 = (e) it2.next();
                        int length = eVar2.f4419a.length() + i;
                        l.f.a(this, spannableString2, eVar2, i, length);
                        if (!TextUtils.isEmpty(eVar2.i)) {
                            l.f.a(this, spannableString2, eVar2, i, length, aVar);
                        } else {
                            l.f.a(spannableString2, eVar2, i, length);
                        }
                        i = length;
                    }
                    if (aVar != null) {
                        aVar.a(spannableString2);
                    }
                } else if (aVar != null) {
                    aVar.a("");
                }
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -1550943582:
                if (str.equals("fontStyle")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1547288966:
                if (str.equals("textLineClamp")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1224696685:
                if (str.equals("fontFamily")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1091049270:
                if (str.equals("lineSpacingMulti")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1065511464:
                if (str.equals("textAlign")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -879295043:
                if (str.equals("textDecoration")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -734428249:
                if (str.equals("fontWeight")) {
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
            case 261414991:
                if (str.equals("textOverflow")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 365601008:
                if (str.equals("fontSize")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2111078717:
                if (str.equals("letterSpacing")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                setColor(((Integer) obj).intValue());
                break;
            case 1:
                setFontFamily(String.valueOf(obj));
                break;
            case 2:
                setFontSize(((Float) obj).floatValue());
                break;
            case 3:
                setFontWeight(String.valueOf(obj));
                break;
            case 4:
                setFontStyle(String.valueOf(obj));
                break;
            case 5:
                setTextAlign(String.valueOf(obj));
                break;
            case 6:
                setTextDecoration(String.valueOf(obj));
                break;
            case 7:
                setTextOverflow(String.valueOf(obj));
                break;
            case '\b':
                setTextLineClamp((int) ((Float) obj).floatValue());
                break;
            case '\t':
                setLetterSpacing(((Float) obj).floatValue());
                break;
            case '\n':
                setLineSpacingMulti(((Float) obj).floatValue());
                break;
            default:
                return false;
        }
        return true;
    }

    public void setText(String str) {
        setRowText(str);
    }

    @JsAttribute
    public void setTextAlign(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            char c2 = 65535;
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 3317767) {
                    if (hashCode == 108511772 && lowerCase.equals("right")) {
                        c2 = 3;
                    }
                } else if (lowerCase.equals("left")) {
                    c2 = 1;
                }
            } else if (lowerCase.equals("center")) {
                c2 = 0;
            }
            ((TextView) getView()).setGravity(c2 != 0 ? c2 != 3 ? 8388627 : 8388629 : 17);
        }
    }

    @JsAttribute
    public void setTextDecoration(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            char c2 = 65535;
            int hashCode = lowerCase.hashCode();
            if (hashCode != -1171789332) {
                if (hashCode == -1026963764 && lowerCase.equals("underline")) {
                    c2 = 0;
                }
            } else if (lowerCase.equals("line-through")) {
                c2 = 1;
            }
            TextPaint paint = ((TextView) getView()).getPaint();
            if (c2 == 0) {
                i = 8;
            } else if (c2 != 1) {
                paint.setFlags(0);
                return;
            } else {
                i = 16;
            }
            paint.setFlags(i);
        }
    }

    @JsAttribute
    public void setTextLineClamp(int i) {
        TextView textView = (TextView) getView();
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        textView.setSingleLine(z);
        TextView textView2 = (TextView) getView();
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        textView2.setMaxLines(i);
        requestLayout();
    }

    @JsAttribute
    public void setTextOverflow(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase();
            char c2 = 65535;
            int hashCode = lowerCase.hashCode();
            if (hashCode != 3056464) {
                if (hashCode == 188702929 && lowerCase.equals("ellipsis")) {
                    c2 = 1;
                }
            } else if (lowerCase.equals("clip")) {
                c2 = 0;
            }
            ((TextView) getView()).setEllipsize(c2 != 0 ? TextUtils.TruncateAt.END : null);
        }
    }
}
