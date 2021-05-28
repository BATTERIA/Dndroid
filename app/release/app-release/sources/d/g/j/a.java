package d.g.j;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.Objects;

public class a implements Spannable {

    /* renamed from: d.g.j.a$a  reason: collision with other inner class name */
    public static final class C0103a {

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f3322a;
        public final TextDirectionHeuristic b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3323c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3324d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f3325e = null;

        public C0103a(PrecomputedText.Params params) {
            this.f3322a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.f3323c = params.getBreakStrategy();
            this.f3324d = params.getHyphenationFrequency();
        }

        public C0103a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f3322a = textPaint;
            this.b = textDirectionHeuristic;
            this.f3323c = i;
            this.f3324d = i2;
        }

        public boolean a(C0103a aVar) {
            PrecomputedText.Params params = this.f3325e;
            if (params != null) {
                return params.equals(aVar.f3325e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f3323c != aVar.f3323c || this.f3324d != aVar.f3324d)) || this.f3322a.getTextSize() != aVar.f3322a.getTextSize() || this.f3322a.getTextScaleX() != aVar.f3322a.getTextScaleX() || this.f3322a.getTextSkewX() != aVar.f3322a.getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f3322a.getLetterSpacing() != aVar.f3322a.getLetterSpacing() || !TextUtils.equals(this.f3322a.getFontFeatureSettings(), aVar.f3322a.getFontFeatureSettings()))) || this.f3322a.getFlags() != aVar.f3322a.getFlags()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (!this.f3322a.getTextLocales().equals(aVar.f3322a.getTextLocales())) {
                    return false;
                }
            } else if (!this.f3322a.getTextLocale().equals(aVar.f3322a.getTextLocale())) {
                return false;
            }
            if (this.f3322a.getTypeface() == null) {
                if (aVar.f3322a.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3322a.getTypeface().equals(aVar.f3322a.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0103a)) {
                return false;
            }
            C0103a aVar = (C0103a) obj;
            return a(aVar) && this.b == aVar.b;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return Objects.hash(Float.valueOf(this.f3322a.getTextSize()), Float.valueOf(this.f3322a.getTextScaleX()), Float.valueOf(this.f3322a.getTextSkewX()), Float.valueOf(this.f3322a.getLetterSpacing()), Integer.valueOf(this.f3322a.getFlags()), this.f3322a.getTextLocales(), this.f3322a.getTypeface(), Boolean.valueOf(this.f3322a.isElegantTextHeight()), this.b, Integer.valueOf(this.f3323c), Integer.valueOf(this.f3324d));
            } else if (i >= 21) {
                return Objects.hash(Float.valueOf(this.f3322a.getTextSize()), Float.valueOf(this.f3322a.getTextScaleX()), Float.valueOf(this.f3322a.getTextSkewX()), Float.valueOf(this.f3322a.getLetterSpacing()), Integer.valueOf(this.f3322a.getFlags()), this.f3322a.getTextLocale(), this.f3322a.getTypeface(), Boolean.valueOf(this.f3322a.isElegantTextHeight()), this.b, Integer.valueOf(this.f3323c), Integer.valueOf(this.f3324d));
            } else {
                return Objects.hash(Float.valueOf(this.f3322a.getTextSize()), Float.valueOf(this.f3322a.getTextScaleX()), Float.valueOf(this.f3322a.getTextSkewX()), Integer.valueOf(this.f3322a.getFlags()), this.f3322a.getTextLocale(), this.f3322a.getTypeface(), this.b, Integer.valueOf(this.f3323c), Integer.valueOf(this.f3324d));
            }
        }

        public String toString() {
            Object obj;
            StringBuilder sb;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder a2 = e.a.a.a.a.a("textSize=");
            a2.append(this.f3322a.getTextSize());
            sb2.append(a2.toString());
            sb2.append(", textScaleX=" + this.f3322a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3322a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                StringBuilder a3 = e.a.a.a.a.a(", letterSpacing=");
                a3.append(this.f3322a.getLetterSpacing());
                sb2.append(a3.toString());
                sb2.append(", elegantTextHeight=" + this.f3322a.isElegantTextHeight());
            }
            if (Build.VERSION.SDK_INT >= 24) {
                sb = e.a.a.a.a.a(", textLocale=");
                obj = this.f3322a.getTextLocales();
            } else {
                sb = e.a.a.a.a.a(", textLocale=");
                obj = this.f3322a.getTextLocale();
            }
            sb.append(obj);
            sb2.append(sb.toString());
            StringBuilder a4 = e.a.a.a.a.a(", typeface=");
            a4.append(this.f3322a.getTypeface());
            sb2.append(a4.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder a5 = e.a.a.a.a.a(", variationSettings=");
                a5.append(this.f3322a.getFontVariationSettings());
                sb2.append(a5.toString());
            }
            StringBuilder a6 = e.a.a.a.a.a(", textDir=");
            a6.append(this.b);
            sb2.append(a6.toString());
            sb2.append(", breakStrategy=" + this.f3323c);
            sb2.append(", hyphenationFrequency=" + this.f3324d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public char charAt(int i) {
        throw null;
    }

    public int getSpanEnd(Object obj) {
        throw null;
    }

    public int getSpanFlags(Object obj) {
        throw null;
    }

    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        throw null;
    }

    public int length() {
        throw null;
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        throw null;
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        throw null;
    }

    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
