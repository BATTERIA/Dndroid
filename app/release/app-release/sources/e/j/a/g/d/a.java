package e.j.a.g.d;

import android.graphics.Paint;
import android.graphics.RectF;
import e.j.a.h.d;

public abstract class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public C0150a f4939a = new C0150a(this);
    public d b;

    /* renamed from: c  reason: collision with root package name */
    public float f4940c;

    /* renamed from: d  reason: collision with root package name */
    public float f4941d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f4942e;

    /* renamed from: f  reason: collision with root package name */
    public RectF f4943f = new RectF();

    /* renamed from: e.j.a.g.d.a$a  reason: collision with other inner class name */
    public class C0150a {

        /* renamed from: a  reason: collision with root package name */
        public int f4944a;
        public int b;

        public C0150a(a aVar) {
        }
    }

    public a(d dVar) {
        this.b = dVar;
        Paint paint = new Paint();
        this.f4942e = paint;
        paint.setAntiAlias(true);
    }

    public int a() {
        return (int) this.b.a();
    }

    @Override // e.j.a.g.d.e
    public C0150a a(int i, int i2) {
        d dVar = this.b;
        this.f4940c = Math.max(dVar.f4962h, dVar.i);
        d dVar2 = this.b;
        float min = Math.min(dVar2.f4962h, dVar2.i);
        this.f4941d = min;
        C0150a aVar = this.f4939a;
        d dVar3 = this.b;
        float f2 = (float) (dVar3.f4957c - 1);
        int a2 = a();
        aVar.f4944a = (int) ((f2 * min) + (dVar3.f4960f * f2) + this.f4940c);
        aVar.b = a2;
        return this.f4939a;
    }
}
