package d.e.a.h;

import d.e.a.e;
import d.e.a.h.c;
import java.util.ArrayList;

public class d {
    public static float j0 = 0.5f;
    public c[] A;
    public ArrayList<c> B;
    public a[] C;
    public d D;
    public int E;
    public int F;
    public float G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public Object X;
    public int Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public int f3168a = -1;
    public String a0;
    public int b = -1;
    public boolean b0;

    /* renamed from: c  reason: collision with root package name */
    public k f3169c;
    public boolean c0;

    /* renamed from: d  reason: collision with root package name */
    public k f3170d;
    public boolean d0;

    /* renamed from: e  reason: collision with root package name */
    public int f3171e = 0;
    public int e0;

    /* renamed from: f  reason: collision with root package name */
    public int f3172f = 0;
    public int f0;

    /* renamed from: g  reason: collision with root package name */
    public int[] f3173g = new int[2];
    public float[] g0;

    /* renamed from: h  reason: collision with root package name */
    public int f3174h = 0;
    public d[] h0;
    public int i = 0;
    public d[] i0;
    public float j = 1.0f;
    public int k = 0;
    public int l = 0;
    public float m = 1.0f;
    public int n = -1;
    public float o = 1.0f;
    public f p = null;
    public int[] q = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float r = 0.0f;
    public c s = new c(this, c.EnumC0096c.LEFT);
    public c t = new c(this, c.EnumC0096c.TOP);
    public c u = new c(this, c.EnumC0096c.RIGHT);
    public c v = new c(this, c.EnumC0096c.BOTTOM);
    public c w = new c(this, c.EnumC0096c.BASELINE);
    public c x = new c(this, c.EnumC0096c.CENTER_X);
    public c y = new c(this, c.EnumC0096c.CENTER_Y);
    public c z;

    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public d() {
        c cVar = new c(this, c.EnumC0096c.CENTER);
        this.z = cVar;
        this.A = new c[]{this.s, this.u, this.t, this.v, this.w, cVar};
        ArrayList<c> arrayList = new ArrayList<>();
        this.B = arrayList;
        a aVar = a.FIXED;
        this.C = new a[]{aVar, aVar};
        this.D = null;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        float f2 = j0;
        this.V = f2;
        this.W = f2;
        this.Y = 0;
        this.Z = null;
        this.a0 = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.g0 = new float[]{-1.0f, -1.0f};
        this.h0 = new d[]{null, null};
        this.i0 = new d[]{null, null};
        arrayList.add(this.s);
        this.B.add(this.t);
        this.B.add(this.u);
        this.B.add(this.v);
        this.B.add(this.x);
        this.B.add(this.y);
        this.B.add(this.z);
        this.B.add(this.w);
    }

    public c a(c.EnumC0096c cVar) {
        switch (cVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.s;
            case 2:
                return this.t;
            case 3:
                return this.u;
            case 4:
                return this.v;
            case 5:
                return this.w;
            case 6:
                return this.z;
            case 7:
                return this.x;
            case 8:
                return this.y;
            default:
                throw new AssertionError(cVar.name());
        }
    }

    public void a(int i2, int i3) {
        this.I = i2;
        int i4 = i3 - i2;
        this.E = i4;
        int i5 = this.R;
        if (i4 < i5) {
            this.E = i5;
        }
    }

    public void a(d.e.a.c cVar) {
        this.s.d();
        this.t.d();
        this.u.d();
        this.v.d();
        this.w.d();
        this.z.d();
        this.x.d();
        this.y.d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0202  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0348 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03a5  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(d.e.a.e r39) {
        /*
        // Method dump skipped, instructions count: 1213
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.d.a(d.e.a.e):void");
    }

    public void a(c.EnumC0096c cVar, d dVar, c.EnumC0096c cVar2, int i2, int i3) {
        a(cVar).a(dVar.a(cVar2), i2, i3, c.b.STRONG, 0, true);
    }

    public void a(a aVar) {
        this.C[0] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            f(this.T);
        }
    }

    public boolean a() {
        return this.Y != 8;
    }

    public a b(int i2) {
        if (i2 == 0) {
            return e();
        }
        if (i2 == 1) {
            return i();
        }
        return null;
    }

    public ArrayList<c> b() {
        return this.B;
    }

    public void b(int i2, int i3) {
        this.O = i2;
        this.P = i3;
    }

    public void b(e eVar) {
        eVar.a(this.s);
        eVar.a(this.t);
        eVar.a(this.u);
        eVar.a(this.v);
        if (this.Q > 0) {
            eVar.a(this.w);
        }
    }

    public void b(a aVar) {
        this.C[1] = aVar;
        if (aVar == a.WRAP_CONTENT) {
            e(this.U);
        }
    }

    public int c() {
        return this.J + this.F;
    }

    public int c(int i2) {
        if (i2 == 0) {
            return j();
        }
        if (i2 == 1) {
            return d();
        }
        return 0;
    }

    public void c(int i2, int i3) {
        this.J = i2;
        int i4 = i3 - i2;
        this.F = i4;
        int i5 = this.S;
        if (i4 < i5) {
            this.F = i5;
        }
    }

    public int d() {
        if (this.Y == 8) {
            return 0;
        }
        return this.F;
    }

    public final boolean d(int i2) {
        int i3 = i2 * 2;
        c[] cVarArr = this.A;
        if (!(cVarArr[i3].f3150d == null || cVarArr[i3].f3150d.f3150d == cVarArr[i3])) {
            int i4 = i3 + 1;
            return cVarArr[i4].f3150d != null && cVarArr[i4].f3150d.f3150d == cVarArr[i4];
        }
    }

    public a e() {
        return this.C[0];
    }

    public void e(int i2) {
        this.F = i2;
        int i3 = this.S;
        if (i2 < i3) {
            this.F = i3;
        }
    }

    public k f() {
        if (this.f3170d == null) {
            this.f3170d = new k();
        }
        return this.f3170d;
    }

    public void f(int i2) {
        this.E = i2;
        int i3 = this.R;
        if (i2 < i3) {
            this.E = i3;
        }
    }

    public k g() {
        if (this.f3169c == null) {
            this.f3169c = new k();
        }
        return this.f3169c;
    }

    public int h() {
        return this.I + this.E;
    }

    public a i() {
        return this.C[1];
    }

    public int j() {
        if (this.Y == 8) {
            return 0;
        }
        return this.E;
    }

    public boolean k() {
        if (this.s.f3148a.b == 1 && this.u.f3148a.b == 1 && this.t.f3148a.b == 1 && this.v.f3148a.b == 1) {
            return true;
        }
        return false;
    }

    public void l() {
        this.s.c();
        this.t.c();
        this.u.c();
        this.v.c();
        this.w.c();
        this.x.c();
        this.y.c();
        this.z.c();
        this.D = null;
        this.r = 0.0f;
        this.E = 0;
        this.F = 0;
        this.G = 0.0f;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        float f2 = j0;
        this.V = f2;
        this.W = f2;
        a[] aVarArr = this.C;
        a aVar = a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.X = null;
        this.Y = 0;
        this.a0 = null;
        this.e0 = 0;
        this.f0 = 0;
        float[] fArr = this.g0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3168a = -1;
        this.b = -1;
        int[] iArr = this.q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f3171e = 0;
        this.f3172f = 0;
        this.j = 1.0f;
        this.m = 1.0f;
        this.i = Integer.MAX_VALUE;
        this.l = Integer.MAX_VALUE;
        this.f3174h = 0;
        this.k = 0;
        this.n = -1;
        this.o = 1.0f;
        k kVar = this.f3169c;
        if (kVar != null) {
            kVar.b = 0;
            kVar.f3195a.clear();
            kVar.f3194c = 0.0f;
        }
        k kVar2 = this.f3170d;
        if (kVar2 != null) {
            kVar2.b = 0;
            kVar2.f3195a.clear();
            kVar2.f3194c = 0.0f;
        }
        this.p = null;
        this.b0 = false;
        this.c0 = false;
        this.d0 = false;
    }

    public void m() {
        for (int i2 = 0; i2 < 6; i2++) {
            this.A[i2].f3148a.e();
        }
    }

    public void n() {
    }

    public void o() {
        int i2 = this.I;
        int i3 = this.J;
        this.M = i2;
        this.N = i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(this.a0 != null ? e.a.a.a.a.a(e.a.a.a.a.a("type: "), this.a0, " ") : str);
        if (this.Z != null) {
            str = e.a.a.a.a.a(e.a.a.a.a.a("id: "), this.Z, " ");
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.I);
        sb.append(", ");
        sb.append(this.J);
        sb.append(") - (");
        sb.append(this.E);
        sb.append(" x ");
        sb.append(this.F);
        sb.append(") wrap: (");
        sb.append(this.T);
        sb.append(" x ");
        sb.append(this.U);
        sb.append(")");
        return sb.toString();
    }

    public void c(e eVar) {
        int i2;
        int i3;
        int b2 = eVar.b(this.s);
        int b3 = eVar.b(this.t);
        int b4 = eVar.b(this.u);
        int b5 = eVar.b(this.v);
        int i4 = b5 - b3;
        if (b4 - b2 < 0 || i4 < 0 || b2 == Integer.MIN_VALUE || b2 == Integer.MAX_VALUE || b3 == Integer.MIN_VALUE || b3 == Integer.MAX_VALUE || b4 == Integer.MIN_VALUE || b4 == Integer.MAX_VALUE || b5 == Integer.MIN_VALUE || b5 == Integer.MAX_VALUE) {
            b5 = 0;
            b2 = 0;
            b3 = 0;
            b4 = 0;
        }
        int i5 = b4 - b2;
        int i6 = b5 - b3;
        this.I = b2;
        this.J = b3;
        if (this.Y == 8) {
            this.E = 0;
            this.F = 0;
            return;
        }
        if (this.C[0] == a.FIXED && i5 < (i3 = this.E)) {
            i5 = i3;
        }
        if (this.C[1] == a.FIXED && i6 < (i2 = this.F)) {
            i6 = i2;
        }
        this.E = i5;
        this.F = i6;
        int i7 = this.S;
        if (i6 < i7) {
            this.F = i7;
        }
        int i8 = this.E;
        int i9 = this.R;
        if (i8 < i9) {
            this.E = i9;
        }
        this.c0 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e7, code lost:
        if (r8 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01f6, code lost:
        if (r8 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0201, code lost:
        r6.f3189d = r3;
        r6.f3190e = (float) r1;
        r3.f3195a.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        if (r8 != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0104, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0117, code lost:
        if (r8 != false) goto L_0x0119;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r17) {
        /*
        // Method dump skipped, instructions count: 849
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.d.a(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d3, code lost:
        if (r30 != false) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02c0  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x02f8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ba A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(d.e.a.e r29, boolean r30, d.e.a.g r31, d.e.a.g r32, d.e.a.h.d.a r33, boolean r34, d.e.a.h.c r35, d.e.a.h.c r36, int r37, int r38, int r39, int r40, float r41, boolean r42, boolean r43, int r44, int r45, int r46, float r47, boolean r48) {
        /*
        // Method dump skipped, instructions count: 769
        */
        throw new UnsupportedOperationException("Method not decompiled: d.e.a.h.d.a(d.e.a.e, boolean, d.e.a.g, d.e.a.g, d.e.a.h.d$a, boolean, d.e.a.h.c, d.e.a.h.c, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    public void a(int i2, int i3, int i4) {
        if (i4 == 0) {
            this.I = i2;
            int i5 = i3 - i2;
            this.E = i5;
            int i6 = this.R;
            if (i5 < i6) {
                this.E = i6;
            }
        } else if (i4 == 1) {
            this.J = i2;
            int i7 = i3 - i2;
            this.F = i7;
            int i8 = this.S;
            if (i7 < i8) {
                this.F = i8;
            }
        }
        this.c0 = true;
    }
}
