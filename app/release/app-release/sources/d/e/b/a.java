package d.e.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class a extends b {
    public int i;
    public int j;
    public d.e.a.h.a k;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // d.e.b.b
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.k = new d.e.a.h.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == h.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.k.o0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f3207f = this.k;
        a();
    }

    public int getType() {
        return this.i;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.k.o0 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r5 == 6) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r5 == 6) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r5) {
        /*
            r4 = this;
            r4.i = r5
            r4.j = r5
            android.content.res.Resources r5 = r4.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.getLayoutDirection()
            r0 = 0
            r1 = 1
            if (r1 != r5) goto L_0x0016
            r5 = 1
            goto L_0x0017
        L_0x0016:
            r5 = 0
        L_0x0017:
            r2 = 6
            r3 = 5
            if (r5 == 0) goto L_0x0025
            int r5 = r4.i
            if (r5 != r3) goto L_0x0022
        L_0x001f:
            r4.j = r1
            goto L_0x002f
        L_0x0022:
            if (r5 != r2) goto L_0x002f
            goto L_0x0029
        L_0x0025:
            int r5 = r4.i
            if (r5 != r3) goto L_0x002c
        L_0x0029:
            r4.j = r0
            goto L_0x002f
        L_0x002c:
            if (r5 != r2) goto L_0x002f
            goto L_0x001f
        L_0x002f:
            d.e.a.h.a r5 = r4.k
            int r0 = r4.j
            r5.m0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.b.a.setType(int):void");
    }
}
