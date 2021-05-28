package e.j.a.g.d;

import android.graphics.Canvas;
import android.graphics.RectF;
import e.j.a.h.d;
import e.j.a.k.a;

public class b extends a {

    /* renamed from: g  reason: collision with root package name */
    public RectF f4945g = new RectF();

    public b(d dVar) {
        super(dVar);
    }

    @Override // e.j.a.g.d.a
    public int a() {
        return (int) this.f4940c;
    }

    @Override // e.j.a.g.d.e
    public void a(Canvas canvas) {
        d dVar;
        d dVar2 = this.b;
        if (dVar2.f4957c > 1) {
            float f2 = dVar2.f4962h;
            this.f4942e.setColor(dVar2.f4958d);
            int i = 0;
            while (true) {
                dVar = this.b;
                if (i >= dVar.f4957c) {
                    break;
                }
                canvas.drawCircle(a.a(dVar, this.f4940c, i), this.f4940c / 2.0f, f2 / 2.0f, this.f4942e);
                i++;
            }
            this.f4942e.setColor(dVar.f4959e);
            d dVar3 = this.b;
            int i2 = dVar3.b;
            if (i2 == 0 || i2 == 2) {
                d dVar4 = this.b;
                int i3 = dVar4.j;
                float a2 = a.a(dVar4, this.f4940c, i3);
                d dVar5 = this.b;
                d dVar6 = this.b;
                canvas.drawCircle(((a.a(dVar5, this.f4940c, (i3 + 1) % dVar5.f4957c) - a2) * dVar6.k) + a2, this.f4940c / 2.0f, dVar6.i / 2.0f, this.f4942e);
            } else if (i2 == 3) {
                float f3 = dVar3.f4962h;
                float f4 = dVar3.k;
                int i4 = dVar3.j;
                float f5 = dVar3.f4960f + f3;
                float a3 = a.a(dVar3, this.f4940c, i4);
                float min = (this.b.f4962h / 2.0f) + Math.min(f4 * f5 * 2.0f, f5) + a3;
                this.f4945g.set((Math.max(((f4 - 0.5f) * f5) * 2.0f, 0.0f) + a3) - (this.b.f4962h / 2.0f), 0.0f, min, f3);
                canvas.drawRoundRect(this.f4945g, f3, f3, this.f4942e);
            }
        }
    }
}
