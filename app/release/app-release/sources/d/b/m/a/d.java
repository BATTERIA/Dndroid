package d.b.m.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import d.b.m.a.b;

public class d extends b {
    public a o;
    public boolean p;

    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f2736g.length][];
            }
        }

        public int a(int[] iArr) {
            int[][] iArr2 = this.J;
            int i = this.f2737h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // d.b.m.a.b.c
        public void d() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public Drawable newDrawable() {
            return new d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar) {
        if (aVar != null) {
            a(aVar);
        }
    }

    public d(a aVar, Resources resources) {
        a(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // d.b.m.a.b
    public a a() {
        return new a(this.o, this, null);
    }

    @Override // d.b.m.a.b
    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof a) {
            this.o = (a) cVar;
        }
    }

    public void applyTheme(Resources.Theme theme) {
        b.c cVar = this.f2723c;
        if (cVar != null) {
            if (theme != null) {
                cVar.c();
                int i = cVar.f2737h;
                Drawable[] drawableArr = cVar.f2736g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        cVar.f2734e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                cVar.a(theme.getResources());
            }
            onStateChange(getState());
            return;
        }
        throw null;
    }

    public boolean isStateful() {
        return true;
    }

    @Override // d.b.m.a.b
    public Drawable mutate() {
        if (!this.p) {
            super.mutate();
            if (this == this) {
                this.o.d();
                this.p = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2726f;
        boolean state = (drawable == null && (drawable = this.f2725e) == null) ? false : drawable.setState(iArr);
        int a2 = this.o.a(iArr);
        if (a2 < 0) {
            a2 = this.o.a(StateSet.WILD_CARD);
        }
        if (a(a2) || state) {
            return true;
        }
        return false;
    }
}
