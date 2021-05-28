package e.e.a.o.n;

import android.text.TextPaint;
import android.text.style.URLSpan;

public class h extends URLSpan {

    /* renamed from: c  reason: collision with root package name */
    public int f4426c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4427d = true;

    public h(String str, int i) {
        super(str);
        this.f4426c = i;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.f4426c == 0) {
            this.f4426c = textPaint.linkColor;
        }
        textPaint.setColor(this.f4426c);
        textPaint.setUnderlineText(this.f4427d);
    }
}
