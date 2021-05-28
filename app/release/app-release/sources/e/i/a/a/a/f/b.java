package e.i.a.a.a.f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import e.i.a.a.a.a;
import e.i.a.a.a.b.a;
import e.i.a.a.a.b.d;
import e.i.a.a.a.b.e;
import e.i.a.a.a.b.f;
import e.i.a.a.a.c.c;

public abstract class b extends RelativeLayout implements a {

    /* renamed from: c  reason: collision with root package name */
    public View f4907c;

    /* renamed from: d  reason: collision with root package name */
    public c f4908d;

    /* renamed from: e  reason: collision with root package name */
    public a f4909e;

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view.getContext(), null, 0);
        a aVar = view instanceof a ? (a) view : null;
        this.f4907c = view;
        this.f4909e = aVar;
        if (!(this instanceof e.i.a.a.a.b.c) || !(aVar instanceof d) || aVar.getSpinnerStyle() != c.f4902h) {
            if (this instanceof d) {
                a aVar2 = this.f4909e;
                if (!(aVar2 instanceof e.i.a.a.a.b.c) || aVar2.getSpinnerStyle() != c.f4902h) {
                    return;
                }
            } else {
                return;
            }
        }
        aVar.getView().setScaleY(-1.0f);
    }

    @Override // e.i.a.a.a.b.a
    public int a(f fVar, boolean z) {
        a aVar = this.f4909e;
        if (aVar == null || aVar == this) {
            return 0;
        }
        return aVar.a(fVar, z);
    }

    @Override // e.i.a.a.a.b.a
    public void a(float f2, int i, int i2) {
        a aVar = this.f4909e;
        if (aVar != null && aVar != this) {
            aVar.a(f2, i, i2);
        }
    }

    @Override // e.i.a.a.a.b.a
    public void a(e eVar, int i, int i2) {
        a aVar = this.f4909e;
        if (aVar == null || aVar == this) {
            View view = this.f4907c;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof a.j) {
                    int i3 = ((a.j) layoutParams).f4883a;
                    a.k kVar = (a.k) eVar;
                    e.i.a.a.a.a aVar2 = e.i.a.a.a.a.this;
                    if (aVar2.z0 == null && i3 != 0) {
                        aVar2.z0 = new Paint();
                    }
                    if (equals(e.i.a.a.a.a.this.w0)) {
                        e.i.a.a.a.a.this.F0 = i3;
                    } else if (equals(e.i.a.a.a.a.this.x0)) {
                        e.i.a.a.a.a.this.G0 = i3;
                    }
                }
            }
        } else {
            aVar.a(eVar, i, i2);
        }
    }

    @Override // e.i.a.a.a.b.a
    public void a(f fVar, int i, int i2) {
        e.i.a.a.a.b.a aVar = this.f4909e;
        if (aVar != null && aVar != this) {
            aVar.a(fVar, i, i2);
        }
    }

    @Override // e.i.a.a.a.e.g
    public void a(f fVar, e.i.a.a.a.c.b bVar, e.i.a.a.a.c.b bVar2) {
        e.i.a.a.a.b.a aVar = this.f4909e;
        if (aVar != null && aVar != this) {
            if ((this instanceof e.i.a.a.a.b.c) && (aVar instanceof d)) {
                if (bVar.f4893d) {
                    bVar = bVar.b();
                }
                if (bVar2.f4893d) {
                    bVar2 = bVar2.b();
                }
            } else if ((this instanceof d) && (this.f4909e instanceof e.i.a.a.a.b.c)) {
                if (bVar.f4892c) {
                    bVar = bVar.a();
                }
                if (bVar2.f4892c) {
                    bVar2 = bVar2.a();
                }
            }
            e.i.a.a.a.b.a aVar2 = this.f4909e;
            if (aVar2 != null) {
                aVar2.a(fVar, bVar, bVar2);
            }
        }
    }

    @Override // e.i.a.a.a.b.a
    public void a(boolean z, float f2, int i, int i2, int i3) {
        e.i.a.a.a.b.a aVar = this.f4909e;
        if (aVar != null && aVar != this) {
            aVar.a(z, f2, i, i2, i3);
        }
    }

    @Override // e.i.a.a.a.b.a
    public boolean a() {
        e.i.a.a.a.b.a aVar = this.f4909e;
        return (aVar == null || aVar == this || !aVar.a()) ? false : true;
    }

    @SuppressLint({"RestrictedApi"})
    public boolean a(boolean z) {
        e.i.a.a.a.b.a aVar = this.f4909e;
        return (aVar instanceof e.i.a.a.a.b.c) && ((e.i.a.a.a.b.c) aVar).a(z);
    }

    @Override // e.i.a.a.a.b.a
    public void b(f fVar, int i, int i2) {
        e.i.a.a.a.b.a aVar = this.f4909e;
        if (aVar != null && aVar != this) {
            aVar.b(fVar, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return (obj instanceof e.i.a.a.a.b.a) && getView() == ((e.i.a.a.a.b.a) obj).getView();
        }
        return true;
    }

    @Override // e.i.a.a.a.b.a
    public c getSpinnerStyle() {
        int i;
        c cVar = this.f4908d;
        if (cVar != null) {
            return cVar;
        }
        e.i.a.a.a.b.a aVar = this.f4909e;
        if (!(aVar == null || aVar == this)) {
            return aVar.getSpinnerStyle();
        }
        View view = this.f4907c;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof a.j) {
                c cVar2 = ((a.j) layoutParams).b;
                this.f4908d = cVar2;
                if (cVar2 != null) {
                    return cVar2;
                }
            }
            if (layoutParams != null && ((i = layoutParams.height) == 0 || i == -1)) {
                c[] cVarArr = c.i;
                for (c cVar3 : cVarArr) {
                    if (cVar3.f4904c) {
                        this.f4908d = cVar3;
                        return cVar3;
                    }
                }
            }
        }
        c cVar4 = c.f4898d;
        this.f4908d = cVar4;
        return cVar4;
    }

    @Override // e.i.a.a.a.b.a
    public View getView() {
        View view = this.f4907c;
        return view == null ? this : view;
    }

    @Override // e.i.a.a.a.b.a
    public void setPrimaryColors(int... iArr) {
        e.i.a.a.a.b.a aVar = this.f4909e;
        if (aVar != null && aVar != this) {
            aVar.setPrimaryColors(iArr);
        }
    }
}
