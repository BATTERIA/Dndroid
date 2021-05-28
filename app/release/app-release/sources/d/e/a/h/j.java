package d.e.a.h;

import d.e.a.e;
import d.e.a.g;
import d.e.a.h.c;
import e.a.a.a.a;

public class j extends l {

    /* renamed from: c  reason: collision with root package name */
    public c f3188c;

    /* renamed from: d  reason: collision with root package name */
    public j f3189d;

    /* renamed from: e  reason: collision with root package name */
    public float f3190e;

    /* renamed from: f  reason: collision with root package name */
    public j f3191f;

    /* renamed from: g  reason: collision with root package name */
    public float f3192g;

    /* renamed from: h  reason: collision with root package name */
    public int f3193h = 0;
    public j i;
    public k j = null;
    public int k = 1;
    public k l = null;
    public int m = 1;

    public j(c cVar) {
        this.f3188c = cVar;
    }

    public String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(e eVar) {
        g gVar = this.f3188c.i;
        j jVar = this.f3191f;
        if (jVar == null) {
            eVar.a(gVar, (int) (this.f3192g + 0.5f));
        } else {
            eVar.a(gVar, eVar.a(jVar.f3188c), (int) (this.f3192g + 0.5f), 6);
        }
    }

    public void a(j jVar, float f2) {
        if (this.b == 0 || !(this.f3191f == jVar || this.f3192g == f2)) {
            this.f3191f = jVar;
            this.f3192g = f2;
            if (this.b == 1) {
                b();
            }
            a();
        }
    }

    @Override // d.e.a.h.l
    public void d() {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j jVar5;
        j jVar6;
        j jVar7;
        float f2;
        float f3;
        float f4;
        j jVar8;
        float f5;
        boolean z = true;
        if (this.b != 1 && this.f3193h != 4) {
            k kVar = this.j;
            if (kVar != null) {
                if (kVar.b == 1) {
                    this.f3190e = ((float) this.k) * kVar.f3194c;
                } else {
                    return;
                }
            }
            k kVar2 = this.l;
            if (kVar2 != null) {
                if (kVar2.b == 1) {
                    float f6 = kVar2.f3194c;
                } else {
                    return;
                }
            }
            if (this.f3193h == 1 && ((jVar8 = this.f3189d) == null || jVar8.b == 1)) {
                j jVar9 = this.f3189d;
                if (jVar9 == null) {
                    this.f3191f = this;
                    f5 = this.f3190e;
                } else {
                    this.f3191f = jVar9.f3191f;
                    f5 = jVar9.f3192g + this.f3190e;
                }
                this.f3192g = f5;
                a();
                return;
            }
            if (this.f3193h == 2 && (jVar4 = this.f3189d) != null && jVar4.b == 1 && (jVar5 = this.i) != null && (jVar6 = jVar5.f3189d) != null && jVar6.b == 1) {
                this.f3191f = jVar4.f3191f;
                jVar5.f3191f = jVar6.f3191f;
                c.EnumC0096c cVar = this.f3188c.f3149c;
                int i2 = 0;
                if (!(cVar == c.EnumC0096c.RIGHT || cVar == c.EnumC0096c.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f2 = this.f3189d.f3192g;
                    jVar7 = this.i.f3189d;
                } else {
                    f2 = this.i.f3189d.f3192g;
                    jVar7 = this.f3189d;
                }
                float f7 = f2 - jVar7.f3192g;
                c cVar2 = this.f3188c;
                c.EnumC0096c cVar3 = cVar2.f3149c;
                if (cVar3 == c.EnumC0096c.LEFT || cVar3 == c.EnumC0096c.RIGHT) {
                    f4 = f7 - ((float) this.f3188c.b.j());
                    f3 = this.f3188c.b.V;
                } else {
                    f4 = f7 - ((float) cVar2.b.d());
                    f3 = this.f3188c.b.W;
                }
                int a2 = this.f3188c.a();
                int a3 = this.i.f3188c.a();
                if (this.f3188c.f3150d == this.i.f3188c.f3150d) {
                    f3 = 0.5f;
                    a3 = 0;
                } else {
                    i2 = a2;
                }
                float f8 = (float) i2;
                float f9 = (float) a3;
                float f10 = (f4 - f8) - f9;
                if (z) {
                    j jVar10 = this.i;
                    jVar10.f3192g = (f10 * f3) + jVar10.f3189d.f3192g + f9;
                    this.f3192g = (this.f3189d.f3192g - f8) - ((1.0f - f3) * f10);
                } else {
                    this.f3192g = (f10 * f3) + this.f3189d.f3192g + f8;
                    j jVar11 = this.i;
                    jVar11.f3192g = (jVar11.f3189d.f3192g - f9) - ((1.0f - f3) * f10);
                }
            } else if (this.f3193h == 3 && (jVar = this.f3189d) != null && jVar.b == 1 && (jVar2 = this.i) != null && (jVar3 = jVar2.f3189d) != null && jVar3.b == 1) {
                this.f3191f = jVar.f3191f;
                jVar2.f3191f = jVar3.f3191f;
                this.f3192g = jVar.f3192g + this.f3190e;
                jVar2.f3192g = jVar3.f3192g + jVar2.f3190e;
            } else if (this.f3193h == 5) {
                this.f3188c.b.n();
                return;
            } else {
                return;
            }
            a();
            this.i.a();
        }
    }

    public void e() {
        this.b = 0;
        this.f3195a.clear();
        this.f3189d = null;
        this.f3190e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f3191f = null;
        this.f3192g = 0.0f;
        this.i = null;
        this.f3193h = 0;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        if (this.b != 1) {
            sb = a.a("{ ");
            sb.append(this.f3188c);
            str = " UNRESOLVED} type: ";
        } else if (this.f3191f == this) {
            sb = a.a("[");
            sb.append(this.f3188c);
            sb.append(", RESOLVED: ");
            sb.append(this.f3192g);
            str = "]  type: ";
        } else {
            sb = a.a("[");
            sb.append(this.f3188c);
            sb.append(", RESOLVED: ");
            sb.append(this.f3191f);
            sb.append(":");
            sb.append(this.f3192g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(a(this.f3193h));
        return sb.toString();
    }

    public void a(int i2, j jVar, int i3) {
        this.f3193h = i2;
        this.f3189d = jVar;
        this.f3190e = (float) i3;
        jVar.f3195a.add(this);
    }

    public void a(j jVar, int i2) {
        this.f3189d = jVar;
        this.f3190e = (float) i2;
        jVar.f3195a.add(this);
    }

    public void a(j jVar, int i2, k kVar) {
        this.f3189d = jVar;
        jVar.f3195a.add(this);
        this.j = kVar;
        this.k = i2;
        kVar.f3195a.add(this);
    }
}
