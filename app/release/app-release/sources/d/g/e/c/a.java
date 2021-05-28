package d.g.e.c;

import android.content.res.ColorStateList;
import android.graphics.Shader;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f3246a;
    public final ColorStateList b;

    /* renamed from: c  reason: collision with root package name */
    public int f3247c;

    public a(Shader shader, ColorStateList colorStateList, int i) {
        this.f3246a = shader;
        this.b = colorStateList;
        this.f3247c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x014f, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d.g.e.c.a a(android.content.res.Resources r26, int r27, android.content.res.Resources.Theme r28) {
        /*
        // Method dump skipped, instructions count: 573
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.e.c.a.a(android.content.res.Resources, int, android.content.res.Resources$Theme):d.g.e.c.a");
    }

    public boolean a() {
        return this.f3246a != null;
    }

    public boolean a(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = this.b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f3247c) {
                this.f3247c = colorForState;
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        ColorStateList colorStateList;
        return this.f3246a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }
}
