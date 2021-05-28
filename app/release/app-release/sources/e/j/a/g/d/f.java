package e.j.a.g.d;

import android.graphics.Canvas;
import e.j.a.h.d;
import e.j.a.k.a;

public class f extends a {
    public f(d dVar) {
        super(dVar);
    }

    @Override // e.j.a.g.d.e
    public void a(Canvas canvas) {
        d dVar = this.b;
        int i = dVar.f4957c;
        boolean z = true;
        if (i > 1) {
            int i2 = 0;
            if (dVar.f4962h != dVar.i) {
                z = false;
            }
            if (!z || this.b.b == 0) {
                while (i2 < i) {
                    d dVar2 = this.b;
                    int i3 = dVar2.f4958d;
                    float f2 = dVar2.f4960f;
                    float a2 = dVar2.a();
                    d dVar3 = this.b;
                    int i4 = dVar3.j;
                    if (i2 < i4) {
                        this.f4942e.setColor(i3);
                        float f3 = (float) i2;
                        float f4 = this.f4941d;
                        float f5 = (f3 * f2) + (f3 * f4);
                        this.f4943f.set(f5, 0.0f, f4 + f5, a2);
                    } else if (i2 == i4) {
                        this.f4942e.setColor(dVar3.f4959e);
                        float f6 = (float) i2;
                        float f7 = this.f4941d;
                        float f8 = (f6 * f2) + (f6 * f7);
                        this.f4943f.set(f8, 0.0f, (this.f4940c - f7) + f8 + f7, a2);
                    } else {
                        this.f4942e.setColor(i3);
                        float f9 = (float) i2;
                        float f10 = this.f4941d;
                        float f11 = this.f4940c - f10;
                        float f12 = f11 + (f9 * f2) + (f9 * f10);
                        this.f4943f.set(f12, 0.0f, f10 + f12, a2);
                    }
                    a(canvas, a2, a2);
                    i2++;
                }
                return;
            }
            while (i2 < i) {
                this.f4942e.setColor(this.b.f4958d);
                float a3 = this.b.a();
                float f13 = (float) i2;
                float f14 = this.f4940c;
                float f15 = (f13 * this.b.f4960f) + (f13 * f14);
                float f16 = this.f4941d;
                float f17 = (f14 - f16) + f15;
                this.f4943f.set(f17, 0.0f, f16 + f17, a3);
                a(canvas, a3, a3);
                i2++;
            }
            this.f4942e.setColor(this.b.f4959e);
            d dVar4 = this.b;
            int i5 = dVar4.b;
            if (i5 == 2) {
                int i6 = dVar4.j;
                float f18 = dVar4.f4960f;
                float a4 = dVar4.a();
                float f19 = (float) i6;
                float f20 = this.f4940c;
                float f21 = ((f18 + f20) * this.b.k) + (f19 * f18) + (f19 * f20);
                this.f4943f.set(f21, 0.0f, f20 + f21, a4);
                a(canvas, a4, a4);
            } else if (i5 == 3) {
                float a5 = dVar4.a();
                d dVar5 = this.b;
                float f22 = dVar5.k;
                int i7 = dVar5.j;
                float f23 = dVar5.f4960f + dVar5.f4962h;
                float a6 = a.a(dVar5, this.f4940c, i7);
                float min = (this.b.f4962h / 2.0f) + Math.min(f22 * f23 * 2.0f, f23) + a6;
                this.f4943f.set((Math.max(((f22 - 0.5f) * f23) * 2.0f, 0.0f) + a6) - (this.b.f4962h / 2.0f), 0.0f, min, a5);
                a(canvas, a5, a5);
            }
        }
    }

    public void a(Canvas canvas, float f2, float f3) {
        b(canvas);
    }

    public void b(Canvas canvas) {
    }
}
