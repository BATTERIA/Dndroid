package d.e.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import d.e.a.h.d;
import d.e.a.h.h;
import java.util.Arrays;

public abstract class b extends View {

    /* renamed from: c  reason: collision with root package name */
    public int[] f3204c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    public int f3205d;

    /* renamed from: e  reason: collision with root package name */
    public Context f3206e;

    /* renamed from: f  reason: collision with root package name */
    public h f3207f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3208g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f3209h;

    public b(Context context) {
        super(context);
        this.f3206e = context;
        a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void a() {
        if (this.f3207f != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).k0 = this.f3207f;
            }
        }
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == h.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3209h = string;
                    setIds(string);
                }
            }
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f3209h);
        }
        h hVar = this.f3207f;
        if (hVar != null) {
            hVar.l0 = 0;
            for (int i = 0; i < this.f3205d; i++) {
                View view = constraintLayout.f2358c.get(this.f3204c[i]);
                if (view != null) {
                    h hVar2 = this.f3207f;
                    d a2 = constraintLayout.a(view);
                    int i2 = hVar2.l0 + 1;
                    d[] dVarArr = hVar2.k0;
                    if (i2 > dVarArr.length) {
                        hVar2.k0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    }
                    d[] dVarArr2 = hVar2.k0;
                    int i3 = hVar2.l0;
                    dVarArr2[i3] = a2;
                    hVar2.l0 = i3 + 1;
                }
            }
        }
    }

    public final void a(String str) {
        int i;
        Object a2;
        if (str != null && this.f3206e != null) {
            String trim = str.trim();
            try {
                i = g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = this.f3206e.getResources().getIdentifier(trim, "id", this.f3206e.getPackageName());
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) getParent()).a(0, trim)) != null && (a2 instanceof Integer)) {
                i = ((Integer) a2).intValue();
            }
            if (i != 0) {
                setTag(i, null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3204c, this.f3205d);
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.f3208g) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3205d = 0;
        for (int i : iArr) {
            setTag(i, null);
        }
    }

    public void setTag(int i, Object obj) {
        int i2 = this.f3205d + 1;
        int[] iArr = this.f3204c;
        if (i2 > iArr.length) {
            this.f3204c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3204c;
        int i3 = this.f3205d;
        iArr2[i3] = i;
        this.f3205d = i3 + 1;
    }
}
