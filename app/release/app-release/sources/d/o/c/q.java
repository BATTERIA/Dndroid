package d.o.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class q extends s {
    public q(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // d.o.c.s
    public int a() {
        return this.f3661a.q;
    }

    @Override // d.o.c.s
    public int a(View view) {
        return this.f3661a.g(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).rightMargin;
    }

    @Override // d.o.c.s
    public void a(int i) {
        this.f3661a.d(i);
    }

    @Override // d.o.c.s
    public int b() {
        RecyclerView.m mVar = this.f3661a;
        return mVar.q - mVar.l();
    }

    @Override // d.o.c.s
    public int b(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3661a.f(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // d.o.c.s
    public int c() {
        return this.f3661a.l();
    }

    @Override // d.o.c.s
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3661a.e(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // d.o.c.s
    public int d() {
        return this.f3661a.o;
    }

    @Override // d.o.c.s
    public int d(View view) {
        return this.f3661a.d(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).leftMargin;
    }

    @Override // d.o.c.s
    public int e() {
        return this.f3661a.p;
    }

    @Override // d.o.c.s
    public int e(View view) {
        this.f3661a.a(view, true, this.f3662c);
        return this.f3662c.right;
    }

    @Override // d.o.c.s
    public int f() {
        return this.f3661a.k();
    }

    @Override // d.o.c.s
    public int f(View view) {
        this.f3661a.a(view, true, this.f3662c);
        return this.f3662c.left;
    }

    @Override // d.o.c.s
    public int g() {
        RecyclerView.m mVar = this.f3661a;
        return (mVar.q - mVar.k()) - this.f3661a.l();
    }
}
