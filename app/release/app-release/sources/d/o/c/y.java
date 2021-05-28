package d.o.c;

import androidx.recyclerview.widget.RecyclerView;
import d.o.c.k;

public abstract class y extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public boolean f3670g = true;

    public abstract boolean a(RecyclerView.a0 a0Var, int i, int i2, int i3, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public boolean a(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2467a;
        int i4 = cVar.b;
        if (a0Var2.n()) {
            int i5 = cVar.f2467a;
            i = cVar.b;
            i2 = i5;
        } else {
            i2 = cVar2.f2467a;
            i = cVar2.b;
        }
        k kVar = (k) this;
        if (a0Var == a0Var2) {
            return kVar.a(a0Var, i3, i4, i2, i);
        }
        float translationX = a0Var.f2452a.getTranslationX();
        float translationY = a0Var.f2452a.getTranslationY();
        float alpha = a0Var.f2452a.getAlpha();
        kVar.e(a0Var);
        a0Var.f2452a.setTranslationX(translationX);
        a0Var.f2452a.setTranslationY(translationY);
        a0Var.f2452a.setAlpha(alpha);
        kVar.e(a0Var2);
        a0Var2.f2452a.setTranslationX((float) (-((int) (((float) (i2 - i3)) - translationX))));
        a0Var2.f2452a.setTranslationY((float) (-((int) (((float) (i - i4)) - translationY))));
        a0Var2.f2452a.setAlpha(0.0f);
        kVar.k.add(new k.a(a0Var, a0Var2, i3, i4, i2, i));
        return true;
    }
}
