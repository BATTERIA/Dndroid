package d.b.o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class y {
    public static final RectF k = new RectF();
    public static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f3030a = 0;
    public boolean b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f3031c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f3032d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f3033e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f3034f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f3035g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f3036h;
    public final TextView i;
    public final Context j;

    public y(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    public final <T> T a(Object obj, String str, T t) {
        try {
            return (T) a(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t;
        }
    }

    public final Method a(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public void a() {
        if (d() && this.f3030a != 0) {
            if (this.b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    int measuredWidth = ((Boolean) a(this.i, "getHorizontallyScrolling", false)).booleanValue() ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        synchronized (k) {
                            k.setEmpty();
                            k.right = (float) measuredWidth;
                            k.bottom = (float) height;
                            float a2 = (float) a(k);
                            if (a2 != this.i.getTextSize()) {
                                a(0, a2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public final void a(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size " + "text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f3030a = 1;
            this.f3032d = f2;
            this.f3033e = f3;
            this.f3031c = f4;
            this.f3035g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }

    public final int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (!d() || this.f3030a != 1) {
            this.b = false;
        } else {
            if (!this.f3035g || this.f3034f.length == 0) {
                float round = (float) Math.round(this.f3032d);
                int i2 = 1;
                while (Math.round(this.f3031c + round) <= Math.round(this.f3033e)) {
                    i2++;
                    round += this.f3031c;
                }
                int[] iArr = new int[i2];
                float f2 = this.f3032d;
                for (int i3 = 0; i3 < i2; i3++) {
                    iArr[i3] = Math.round(f2);
                    f2 += this.f3031c;
                }
                this.f3034f = a(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    public final boolean c() {
        int length = this.f3034f.length;
        boolean z = length > 0;
        this.f3035g = z;
        if (z) {
            this.f3030a = 1;
            int[] iArr = this.f3034f;
            this.f3032d = (float) iArr[0];
            this.f3033e = (float) iArr[length - 1];
            this.f3031c = -1.0f;
        }
        return this.f3035g;
    }

    public final boolean d() {
        return !(this.i instanceof j);
    }

    public final int a(RectF rectF) {
        StaticLayout staticLayout;
        int i2;
        CharSequence transformation;
        int length = this.f3034f.length;
        if (length != 0) {
            int i3 = length - 1;
            int i4 = 0;
            int i5 = 1;
            int i6 = 0;
            while (i5 <= i3) {
                int i7 = (i5 + i3) / 2;
                int i8 = this.f3034f[i7];
                CharSequence text = this.i.getText();
                TransformationMethod transformationMethod = this.i.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.i)) == null)) {
                    text = transformation;
                }
                int maxLines = this.i.getMaxLines();
                TextPaint textPaint = this.f3036h;
                if (textPaint == null) {
                    this.f3036h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f3036h.set(this.i.getPaint());
                this.f3036h.setTextSize((float) i8);
                Layout.Alignment alignment = (Layout.Alignment) a(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout = StaticLayout.Builder.obtain(text, i4, text.length(), this.f3036h, Math.round(rectF.right)).setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines).setTextDirection((TextDirectionHeuristic) a(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR)).build();
                    i2 = -1;
                } else {
                    i2 = -1;
                    staticLayout = new StaticLayout(text, this.f3036h, Math.round(rectF.right), alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
                }
                if ((maxLines == i2 || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom) {
                    int i9 = i7 + 1;
                    i4 = 0;
                    i6 = i5;
                    i5 = i9;
                } else {
                    i6 = i7 - 1;
                    i3 = i6;
                    i4 = 0;
                }
            }
            return this.f3034f[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public void a(int i2, float f2) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.i.isInLayout();
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method a2 = a("nullLayouts");
                    if (a2 != null) {
                        a2.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }
}
