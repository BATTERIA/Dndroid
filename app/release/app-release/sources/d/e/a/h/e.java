package d.e.a.h;

import c.a.a.a.a;
import d.e.a.h.c;
import d.e.a.h.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e extends n {
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 7;
    public boolean D0 = false;
    public boolean E0 = false;
    public boolean F0 = false;
    public boolean l0 = false;
    public d.e.a.e m0 = new d.e.a.e();
    public m n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0 = 0;
    public int t0 = 0;
    public b[] u0 = new b[4];
    public b[] v0 = new b[4];
    public List<f> w0 = new ArrayList();
    public boolean x0 = false;
    public boolean y0 = false;
    public boolean z0 = false;

    @Override // d.e.a.h.d
    public void a(int i) {
        super.a(i);
        int size = this.k0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k0.get(i2).a(i);
        }
    }

    public void a(d dVar, int i) {
        if (i == 0) {
            int i2 = this.s0 + 1;
            b[] bVarArr = this.v0;
            if (i2 >= bVarArr.length) {
                this.v0 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
            }
            this.v0[this.s0] = new b(dVar, 0, this.l0);
            this.s0++;
        } else if (i == 1) {
            int i3 = this.t0 + 1;
            b[] bVarArr2 = this.u0;
            if (i3 >= bVarArr2.length) {
                this.u0 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length * 2);
            }
            this.u0[this.t0] = new b(dVar, 1, this.l0);
            this.t0++;
        }
    }

    public boolean d(d.e.a.e eVar) {
        a(eVar);
        int size = this.k0.size();
        for (int i = 0; i < size; i++) {
            d dVar = this.k0.get(i);
            if (dVar instanceof e) {
                d.a[] aVarArr = dVar.C;
                d.a aVar = aVarArr[0];
                d.a aVar2 = aVarArr[1];
                if (aVar == d.a.WRAP_CONTENT) {
                    dVar.a(d.a.FIXED);
                }
                if (aVar2 == d.a.WRAP_CONTENT) {
                    dVar.b(d.a.FIXED);
                }
                dVar.a(eVar);
                if (aVar == d.a.WRAP_CONTENT) {
                    dVar.a(aVar);
                }
                if (aVar2 == d.a.WRAP_CONTENT) {
                    dVar.b(aVar2);
                }
            } else {
                if (this.C[0] != d.a.WRAP_CONTENT && dVar.C[0] == d.a.MATCH_PARENT) {
                    int i2 = dVar.s.f3151e;
                    int j = j() - dVar.u.f3151e;
                    c cVar = dVar.s;
                    cVar.i = eVar.a(cVar);
                    c cVar2 = dVar.u;
                    cVar2.i = eVar.a(cVar2);
                    eVar.a(dVar.s.i, i2);
                    eVar.a(dVar.u.i, j);
                    dVar.f3168a = 2;
                    dVar.a(i2, j);
                }
                if (this.C[1] != d.a.WRAP_CONTENT && dVar.C[1] == d.a.MATCH_PARENT) {
                    int i3 = dVar.t.f3151e;
                    int d2 = d() - dVar.v.f3151e;
                    c cVar3 = dVar.t;
                    cVar3.i = eVar.a(cVar3);
                    c cVar4 = dVar.v;
                    cVar4.i = eVar.a(cVar4);
                    eVar.a(dVar.t.i, i3);
                    eVar.a(dVar.v.i, d2);
                    if (dVar.Q > 0 || dVar.Y == 8) {
                        c cVar5 = dVar.w;
                        cVar5.i = eVar.a(cVar5);
                        eVar.a(dVar.w.i, dVar.Q + i3);
                    }
                    dVar.b = 2;
                    dVar.c(i3, d2);
                }
                dVar.a(eVar);
            }
        }
        if (this.s0 > 0) {
            a.a(this, eVar, 0);
        }
        if (this.t0 > 0) {
            a.a(this, eVar, 1);
        }
        return true;
    }

    public boolean g(int i) {
        return (this.C0 & i) == i;
    }

    @Override // d.e.a.h.n, d.e.a.h.d
    public void l() {
        this.m0.f();
        this.o0 = 0;
        this.q0 = 0;
        this.p0 = 0;
        this.r0 = 0;
        this.w0.clear();
        this.D0 = false;
        super.l();
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03a6  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // d.e.a.h.n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p() {
        /*
        // Method dump skipped, instructions count: 1231
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.e.p():void");
    }

    public void q() {
        int size = this.k0.size();
        m();
        for (int i = 0; i < size; i++) {
            this.k0.get(i).m();
        }
    }

    public final void r() {
        this.s0 = 0;
        this.t0 = 0;
    }

    public void s() {
        j jVar = a(c.EnumC0096c.LEFT).f3148a;
        j jVar2 = a(c.EnumC0096c.TOP).f3148a;
        jVar.a((j) null, 0.0f);
        jVar2.a((j) null, 0.0f);
    }
}
