package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import d.b.k.k;
import d.b.k.n;
import d.b.n.i.h;
import d.b.o.z;

public class ContentFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f2310c;

    /* renamed from: d  reason: collision with root package name */
    public TypedValue f2311d;

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f2312e;

    /* renamed from: f  reason: collision with root package name */
    public TypedValue f2313f;

    /* renamed from: g  reason: collision with root package name */
    public TypedValue f2314g;

    /* renamed from: h  reason: collision with root package name */
    public TypedValue f2315h;
    public final Rect i;
    public a j;

    public interface a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.i = new Rect();
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2314g == null) {
            this.f2314g = new TypedValue();
        }
        return this.f2314g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2315h == null) {
            this.f2315h = new TypedValue();
        }
        return this.f2315h;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2312e == null) {
            this.f2312e = new TypedValue();
        }
        return this.f2312e;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2313f == null) {
            this.f2313f = new TypedValue();
        }
        return this.f2313f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2310c == null) {
            this.f2310c = new TypedValue();
        }
        return this.f2310c;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2311d == null) {
            this.f2311d = new TypedValue();
        }
        return this.f2311d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.j;
        if (aVar != null && ((n) aVar) == null) {
            throw null;
        }
    }

    public void onDetachedFromWindow() {
        h hVar;
        super.onDetachedFromWindow();
        a aVar = this.j;
        if (aVar != null) {
            k kVar = ((n) aVar).f2686a;
            z zVar = kVar.k;
            if (zVar != null) {
                zVar.g();
            }
            if (kVar.p != null) {
                kVar.f2661d.getDecorView().removeCallbacks(kVar.q);
                if (kVar.p.isShowing()) {
                    try {
                        kVar.p.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                kVar.p = null;
            }
            kVar.d();
            k.h d2 = kVar.d(0);
            if (d2 != null && (hVar = d2.j) != null) {
                hVar.a(true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.j = aVar;
    }
}
