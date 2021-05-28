package d.e.a.h;

import d.e.a.b;
import d.e.a.e;
import d.e.a.g;
import d.e.a.h.d;
import java.util.ArrayList;

public class a extends h {
    public int m0 = 0;
    public ArrayList<j> n0 = new ArrayList<>(4);
    public boolean o0 = true;

    @Override // d.e.a.h.d
    public void a(e eVar) {
        Object[] objArr;
        boolean z;
        g gVar;
        c cVar;
        int i;
        int i2;
        c[] cVarArr = this.A;
        cVarArr[0] = this.s;
        cVarArr[2] = this.t;
        cVarArr[1] = this.u;
        cVarArr[3] = this.v;
        int i3 = 0;
        while (true) {
            objArr = this.A;
            if (i3 >= objArr.length) {
                break;
            }
            objArr[i3].i = eVar.a(objArr[i3]);
            i3++;
        }
        int i4 = this.m0;
        if (i4 >= 0 && i4 < 4) {
            c cVar2 = objArr[i4];
            int i5 = 0;
            while (true) {
                if (i5 >= this.l0) {
                    z = false;
                    break;
                }
                d dVar = this.k0[i5];
                if ((this.o0 || dVar.a()) && ((((i = this.m0) == 0 || i == 1) && dVar.e() == d.a.MATCH_CONSTRAINT) || (((i2 = this.m0) == 2 || i2 == 3) && dVar.i() == d.a.MATCH_CONSTRAINT))) {
                    z = true;
                } else {
                    i5++;
                }
            }
            int i6 = this.m0;
            if (i6 == 0 || i6 == 1 ? this.D.e() == d.a.WRAP_CONTENT : this.D.i() == d.a.WRAP_CONTENT) {
                z = false;
            }
            for (int i7 = 0; i7 < this.l0; i7++) {
                d dVar2 = this.k0[i7];
                if (this.o0 || dVar2.a()) {
                    g a2 = eVar.a(dVar2.A[this.m0]);
                    c[] cVarArr2 = dVar2.A;
                    int i8 = this.m0;
                    cVarArr2[i8].i = a2;
                    if (i8 == 0 || i8 == 2) {
                        g gVar2 = cVar2.i;
                        b b = eVar.b();
                        g c2 = eVar.c();
                        c2.f3130d = 0;
                        b.b(gVar2, a2, c2, 0);
                        if (z) {
                            b.f3116d.a(eVar.a(1, (String) null), (float) ((int) (b.f3116d.a(c2) * -1.0f)));
                        }
                        eVar.a(b);
                    } else {
                        g gVar3 = cVar2.i;
                        b b2 = eVar.b();
                        g c3 = eVar.c();
                        c3.f3130d = 0;
                        b2.a(gVar3, a2, c3, 0);
                        if (z) {
                            b2.f3116d.a(eVar.a(1, (String) null), (float) ((int) (b2.f3116d.a(c3) * -1.0f)));
                        }
                        eVar.a(b2);
                    }
                }
            }
            int i9 = this.m0;
            if (i9 == 0) {
                eVar.a(this.u.i, this.s.i, 0, 6);
                if (!z) {
                    gVar = this.s.i;
                    cVar = this.D.u;
                } else {
                    return;
                }
            } else if (i9 == 1) {
                eVar.a(this.s.i, this.u.i, 0, 6);
                if (!z) {
                    gVar = this.s.i;
                    cVar = this.D.s;
                } else {
                    return;
                }
            } else if (i9 == 2) {
                eVar.a(this.v.i, this.t.i, 0, 6);
                if (!z) {
                    gVar = this.t.i;
                    cVar = this.D.v;
                } else {
                    return;
                }
            } else if (i9 == 3) {
                eVar.a(this.t.i, this.v.i, 0, 6);
                if (!z) {
                    gVar = this.t.i;
                    cVar = this.D.t;
                } else {
                    return;
                }
            } else {
                return;
            }
            eVar.a(gVar, cVar.i, 0, 5);
        }
    }

    @Override // d.e.a.h.d
    public boolean a() {
        return true;
    }

    @Override // d.e.a.h.d
    public void m() {
        super.m();
        this.n0.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    @Override // d.e.a.h.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n() {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.a.n():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008d A[SYNTHETIC] */
    @Override // d.e.a.h.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r8) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.a.a(int):void");
    }
}
