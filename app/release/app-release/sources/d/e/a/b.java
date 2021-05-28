package d.e.a;

import d.e.a.e;

public class b implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public g f3114a = null;
    public float b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3115c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3116d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3117e = false;

    public b(c cVar) {
        this.f3116d = new a(this, cVar);
    }

    public b a(e eVar, int i) {
        this.f3116d.a(eVar.a(i, "ep"), 1.0f);
        this.f3116d.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.f3116d.a(gVar, -1.0f);
            this.f3116d.a(gVar2, 1.0f);
            this.f3116d.a(gVar3, 1.0f);
        } else {
            this.f3116d.a(gVar, 1.0f);
            this.f3116d.a(gVar2, -1.0f);
            this.f3116d.a(gVar3, -1.0f);
        }
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, g gVar4, float f2) {
        this.f3116d.a(gVar, -1.0f);
        this.f3116d.a(gVar2, 1.0f);
        this.f3116d.a(gVar3, f2);
        this.f3116d.a(gVar4, -f2);
        return this;
    }

    @Override // d.e.a.e.a
    public void a(g gVar) {
        int i = gVar.f3130d;
        float f2 = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f3116d.a(gVar, f2);
    }

    public b b(g gVar, g gVar2, g gVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.f3116d.a(gVar, -1.0f);
            this.f3116d.a(gVar2, 1.0f);
            this.f3116d.a(gVar3, -1.0f);
        } else {
            this.f3116d.a(gVar, 1.0f);
            this.f3116d.a(gVar2, -1.0f);
            this.f3116d.a(gVar3, 1.0f);
        }
        return this;
    }

    public b b(g gVar, g gVar2, g gVar3, g gVar4, float f2) {
        this.f3116d.a(gVar3, 0.5f);
        this.f3116d.a(gVar4, 0.5f);
        this.f3116d.a(gVar, -0.5f);
        this.f3116d.a(gVar2, -0.5f);
        this.b = -f2;
        return this;
    }

    public void b(g gVar) {
        g gVar2 = this.f3114a;
        if (gVar2 != null) {
            this.f3116d.a(gVar2, -1.0f);
            this.f3114a = null;
        }
        float a2 = this.f3116d.a(gVar, true) * -1.0f;
        this.f3114a = gVar;
        if (a2 != 1.0f) {
            this.b /= a2;
            a aVar = this.f3116d;
            int i = aVar.i;
            int i2 = 0;
            while (i != -1 && i2 < aVar.f3107a) {
                float[] fArr = aVar.f3113h;
                fArr[i] = fArr[i] / a2;
                i = aVar.f3112g[i];
                i2++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.b.toString():java.lang.String");
    }
}
