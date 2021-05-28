package e.j.a.g.d;

import android.graphics.Canvas;
import e.j.a.g.d.a;

public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public e f4946a;

    public d(e.j.a.h.d dVar) {
        a(dVar);
    }

    @Override // e.j.a.g.d.e
    public a.C0150a a(int i, int i2) {
        return this.f4946a.a(i, i2);
    }

    @Override // e.j.a.g.d.e
    public void a(Canvas canvas) {
        this.f4946a.a(canvas);
    }

    public final void a(e.j.a.h.d dVar) {
        int i = dVar.f4956a;
        this.f4946a = i == 2 ? new c(dVar) : i == 4 ? new g(dVar) : new b(dVar);
    }
}
