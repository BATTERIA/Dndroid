package d.o.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public final class r extends s {
    public r(RecyclerView.m mVar) {
        super(mVar, null);
    }

    @Override // d.o.c.s
    public int a() {
        return this.f3661a.r;
    }

    @Override // d.o.c.s
    public int a(View view) {
        return this.f3661a.c(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).bottomMargin;
    }

    @Override // d.o.c.s
    public void a(int i) {
        this.f3661a.e(i);
    }

    @Override // d.o.c.s
    public int b() {
        RecyclerView.m mVar = this.f3661a;
        return mVar.r - mVar.j();
    }

    @Override // d.o.c.s
    public int b(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3661a.e(view) + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
    }

    @Override // d.o.c.s
    public int c() {
        return this.f3661a.j();
    }

    @Override // d.o.c.s
    public int c(View view) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        return this.f3661a.f(view) + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
    }

    @Override // d.o.c.s
    public int d() {
        return this.f3661a.p;
    }

    @Override // d.o.c.s
    public int d(View view) {
        return this.f3661a.h(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.n) view.getLayoutParams())).topMargin;
    }

    @Override // d.o.c.s
    public int e() {
        return this.f3661a.o;
    }

    @Override // d.o.c.s
    public int e(View view) {
        this.f3661a.a(view, true, this.f3662c);
        return this.f3662c.bottom;
    }

    @Override // d.o.c.s
    public int f() {
        return this.f3661a.m();
    }

    @Override // d.o.c.s
    public int f(View view) {
        this.f3661a.a(view, true, this.f3662c);
        return this.f3662c.top;
    }

    @Override // d.o.c.s
    public int g() {
        RecyclerView.m mVar = this.f3661a;
        return (mVar.r - mVar.m()) - this.f3661a.j();
    }
}
