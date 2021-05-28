package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a;
import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e0;
import a.a.a.a.v0.b.g0;
import a.a.a.a.v0.b.h0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.p;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.l.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.y0;
import a.a.a.a.v0.o.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class f0 extends q0 implements a.a.a.a.v0.b.f0 {
    public p A;
    public p B;
    public final v j;
    public a1 k;
    public Collection<? extends a.a.a.a.v0.b.f0> l;
    public final a.a.a.a.v0.b.f0 m;
    public final b.a n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public i0 u;
    public i0 v;
    public List<r0> w;
    public g0 x;
    public h0 y;
    public boolean z;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public k f374a = f0.this.b();
        public v b = f0.this.o();

        /* renamed from: c  reason: collision with root package name */
        public a1 f375c = f0.this.g();

        /* renamed from: d  reason: collision with root package name */
        public a.a.a.a.v0.b.f0 f376d = null;

        /* renamed from: e  reason: collision with root package name */
        public boolean f377e = false;

        /* renamed from: f  reason: collision with root package name */
        public b.a f378f = f0.this.t();

        /* renamed from: g  reason: collision with root package name */
        public y0 f379g = y0.f1959a;

        /* renamed from: h  reason: collision with root package name */
        public boolean f380h = true;
        public i0 i;
        public List<r0> j;
        public d k;

        public a() {
            f0 f0Var = f0.this;
            this.i = f0Var.u;
            this.j = null;
            this.k = f0Var.d();
        }

        public static /* synthetic */ void a(int i2) {
            String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 17 || i2 == 11 || i2 == 12 || i2 == 14 || i2 == 15) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 17 || i2 == 11 || i2 == 12 || i2 == 14 || i2 == 15) ? 2 : 3)];
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "modality";
                    break;
                case 6:
                    objArr[0] = "visibility";
                    break;
                case 8:
                    objArr[0] = "kind";
                    break;
                case 10:
                    objArr[0] = "typeParameters";
                    break;
                case 13:
                    objArr[0] = "substitution";
                    break;
                case 16:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i2 == 1) {
                objArr[1] = "setOwner";
            } else if (i2 == 2) {
                objArr[1] = "setOriginal";
            } else if (i2 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i2 == 5) {
                objArr[1] = "setModality";
            } else if (i2 == 7) {
                objArr[1] = "setVisibility";
            } else if (i2 == 9) {
                objArr[1] = "setKind";
            } else if (i2 == 17) {
                objArr[1] = "setName";
            } else if (i2 == 11) {
                objArr[1] = "setTypeParameters";
            } else if (i2 == 12) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i2 == 14) {
                objArr[1] = "setSubstitution";
            } else if (i2 != 15) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    break;
                case 4:
                    objArr[2] = "setModality";
                    break;
                case 6:
                    objArr[2] = "setVisibility";
                    break;
                case 8:
                    objArr[2] = "setKind";
                    break;
                case 10:
                    objArr[2] = "setTypeParameters";
                    break;
                case 13:
                    objArr[2] = "setSubstitution";
                    break;
                case 16:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 9 || i2 == 17 || i2 == 11 || i2 == 12 || i2 == 14 || i2 == 15) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: a.a.a.a.v0.b.i0 */
        /* JADX WARN: Multi-variable type inference failed */
        public a.a.a.a.v0.b.f0 a() {
            m0 m0Var;
            i0 i0Var;
            i0 i0Var2;
            g0 g0Var;
            h0 h0Var;
            h<g<?>> hVar;
            a.a.a.a.v0.b.f0 f0Var;
            f0 f0Var2 = f0.this;
            r rVar = null;
            if (f0Var2 != null) {
                k kVar = this.f374a;
                v vVar = this.b;
                a1 a1Var = this.f375c;
                a.a.a.a.v0.b.f0 f0Var3 = this.f376d;
                b.a aVar = this.f378f;
                d dVar = this.k;
                if (this.f377e) {
                    if (f0Var3 != null) {
                        f0Var = f0Var3;
                    } else {
                        f0Var = f0Var2.a();
                    }
                    m0Var = f0Var.r();
                } else {
                    m0Var = m0.f491a;
                }
                if (m0Var != null) {
                    f0 a2 = f0Var2.a(kVar, vVar, a1Var, f0Var3, aVar, dVar, m0Var);
                    List<r0> list = this.j;
                    if (list == null) {
                        list = f0Var2.k();
                    }
                    ArrayList arrayList = new ArrayList(list.size());
                    a.a.a.a.v0.m.a1 a3 = e.f.a.g.a(list, this.f379g, a2, arrayList);
                    d0 b2 = a3.b(f0Var2.c(), g1.OUT_VARIANCE);
                    if (b2 == null) {
                        return null;
                    }
                    i0 i0Var3 = this.i;
                    if (i0Var3 != 0) {
                        i0Var = i0Var3.a(a3);
                        if (i0Var == null) {
                            return null;
                        }
                    } else {
                        i0Var = null;
                    }
                    i0 i0Var4 = f0Var2.v;
                    if (i0Var4 != null) {
                        d0 b3 = a3.b(i0Var4.c(), g1.IN_VARIANCE);
                        if (b3 == null) {
                            return null;
                        }
                        i0Var2 = new i0(a2, new a.a.a.a.v0.j.w.o.b(a2, b3, f0Var2.v.getValue()), f0Var2.v.y());
                    } else {
                        i0Var2 = null;
                    }
                    a2.a(b2, arrayList, i0Var, i0Var2);
                    g0 g0Var2 = f0Var2.x;
                    if (g0Var2 == null) {
                        g0Var = null;
                    } else {
                        a.a.a.a.v0.b.b1.h y = g0Var2.y();
                        v vVar2 = this.b;
                        a1 g2 = f0Var2.x.g();
                        if (this.f378f == b.a.FAKE_OVERRIDE && z0.a(g2.b())) {
                            g2 = z0.f518h;
                        }
                        g0 g0Var3 = f0Var2.x;
                        boolean z = g0Var3.f368g;
                        boolean z2 = g0Var3.f369h;
                        boolean z3 = g0Var3.k;
                        b.a aVar2 = this.f378f;
                        a.a.a.a.v0.b.f0 f0Var4 = this.f376d;
                        g0Var = new g0(a2, y, vVar2, g2, z, z2, z3, aVar2, f0Var4 == null ? null : f0Var4.w(), m0.f491a);
                    }
                    if (g0Var != null) {
                        g0 g0Var4 = f0Var2.x;
                        d0 d0Var = g0Var4.o;
                        g0Var.n = f0.a(a3, g0Var4);
                        g0Var.a(d0Var != null ? a3.b(d0Var, g1.OUT_VARIANCE) : null);
                    }
                    h0 h0Var2 = f0Var2.y;
                    if (h0Var2 == null) {
                        h0Var = null;
                    } else {
                        a.a.a.a.v0.b.b1.h y2 = h0Var2.y();
                        v vVar3 = this.b;
                        a1 g3 = f0Var2.y.g();
                        if (this.f378f == b.a.FAKE_OVERRIDE && z0.a(g3.b())) {
                            g3 = z0.f518h;
                        }
                        boolean e0 = f0Var2.y.e0();
                        boolean H = f0Var2.y.H();
                        boolean p = f0Var2.y.p();
                        b.a aVar3 = this.f378f;
                        a.a.a.a.v0.b.f0 f0Var5 = this.f376d;
                        h0Var = new h0(a2, y2, vVar3, g3, e0, H, p, aVar3, f0Var5 == null ? null : f0Var5.i(), m0.f491a);
                    }
                    if (h0Var != null) {
                        List<w0> a4 = s.a((s) h0Var, f0Var2.y.j(), a3, false, false, (boolean[]) null);
                        if (a4 == null) {
                            a2.z = true;
                            a4 = Collections.singletonList(h0.a(h0Var, a.a.a.a.v0.j.u.a.b(this.f374a).f(), f0Var2.y.j().get(0).y()));
                        }
                        if (a4.size() == 1) {
                            h0Var.n = f0.a(a3, f0Var2.y);
                            h0Var.a(a4.get(0));
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    p pVar = f0Var2.A;
                    r rVar2 = pVar == null ? null : new r(pVar.y(), a2);
                    p pVar2 = f0Var2.B;
                    if (pVar2 != null) {
                        rVar = new r(pVar2.y(), a2);
                    }
                    a2.a(g0Var, h0Var, rVar2, rVar);
                    if (this.f380h) {
                        m a5 = m.b.a();
                        for (a.a.a.a.v0.b.f0 f0Var6 : f0Var2.f()) {
                            a5.add(f0Var6.a(a3));
                        }
                        a2.a(a5);
                    }
                    if (f0Var2.R() && (hVar = f0Var2.i) != null) {
                        a2.a(hVar);
                    }
                    return a2;
                }
                f0.a(23);
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f0(k kVar, a.a.a.a.v0.b.f0 f0Var, a.a.a.a.v0.b.b1.h hVar, v vVar, a1 a1Var, boolean z2, d dVar, b.a aVar, m0 m0Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(kVar, hVar, dVar, null, z2, m0Var);
        if (kVar == null) {
            a(0);
            throw null;
        } else if (hVar == null) {
            a(1);
            throw null;
        } else if (vVar == null) {
            a(2);
            throw null;
        } else if (a1Var == null) {
            a(3);
            throw null;
        } else if (dVar == null) {
            a(4);
            throw null;
        } else if (aVar == null) {
            a(5);
            throw null;
        } else if (m0Var != null) {
            this.l = null;
            this.j = vVar;
            this.k = a1Var;
            this.m = f0Var == null ? this : f0Var;
            this.n = aVar;
            this.o = z3;
            this.p = z4;
            this.q = z5;
            this.r = z6;
            this.s = z7;
            this.t = z8;
        } else {
            a(6);
            throw null;
        }
    }

    public static s a(a.a.a.a.v0.m.a1 a1Var, e0 e0Var) {
        if (a1Var == null) {
            a(25);
            throw null;
        } else if (e0Var == null) {
            a(26);
            throw null;
        } else if (e0Var.G() != null) {
            return e0Var.G().a(a1Var);
        } else {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r11) {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.d1.f0.a(int):void");
    }

    @Override // a.a.a.a.v0.b.f0
    public List<e0> A() {
        ArrayList arrayList = new ArrayList(2);
        g0 g0Var = this.x;
        if (g0Var != null) {
            arrayList.add(g0Var);
        }
        h0 h0Var = this.y;
        if (h0Var != null) {
            arrayList.add(h0Var);
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.y0
    public boolean C0() {
        return this.o;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return this.q;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean H() {
        return this.s;
    }

    @Override // a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public i0 J() {
        return this.u;
    }

    @Override // a.a.a.a.v0.b.f0
    public boolean K() {
        return this.t;
    }

    @Override // a.a.a.a.v0.b.y0, a.a.a.a.v0.b.d1.p0
    public boolean R() {
        return this.p;
    }

    @Override // a.a.a.a.v0.b.b
    public b a(k kVar, v vVar, a1 a1Var, b.a aVar, boolean z2) {
        a aVar2 = new a();
        if (kVar != null) {
            aVar2.f374a = kVar;
            aVar2.f376d = null;
            if (vVar != null) {
                aVar2.b = vVar;
                if (a1Var != null) {
                    aVar2.f375c = a1Var;
                    if (aVar != null) {
                        aVar2.f378f = aVar;
                        aVar2.f380h = z2;
                        a.a.a.a.v0.b.f0 a2 = aVar2.a();
                        if (a2 != null) {
                            return a2;
                        }
                        a(37);
                        throw null;
                    }
                    a.a(8);
                    throw null;
                }
                a.a(6);
                throw null;
            }
            a.a(4);
            throw null;
        }
        a.a(0);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.d1.n, a.a.a.a.v0.b.a, a.a.a.a.v0.b.d1.m, a.a.a.a.v0.b.k, a.a.a.a.v0.b.f0
    public a.a.a.a.v0.b.f0 a() {
        a.a.a.a.v0.b.f0 f0Var = this.m;
        a.a.a.a.v0.b.f0 a2 = f0Var == this ? this : f0Var.a();
        if (a2 != null) {
            return a2;
        }
        a(33);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public <V> V a(a.AbstractC0014a<V> aVar) {
        return null;
    }

    @Override // a.a.a.a.v0.b.k
    public <R, D> R a(a.a.a.a.v0.b.m<R, D> mVar, D d2) {
        return mVar.a(this, d2);
    }

    public void a(g0 g0Var, h0 h0Var, p pVar, p pVar2) {
        this.x = g0Var;
        this.y = h0Var;
        this.A = pVar;
        this.B = pVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<? extends a.a.a.a.v0.b.b> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.a.a.a.v0.b.b
    public void a(Collection<? extends b> collection) {
        if (collection != 0) {
            this.l = collection;
        } else {
            a(35);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.b.b, a.a.a.a.v0.b.a, a.a.a.a.v0.b.f0
    public Collection<? extends a.a.a.a.v0.b.f0> f() {
        Collection<? extends a.a.a.a.v0.b.f0> collection = this.l;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        if (collection != null) {
            return collection;
        }
        a(36);
        throw null;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u
    public a1 g() {
        a1 a1Var = this.k;
        if (a1Var != null) {
            return a1Var;
        }
        a(20);
        throw null;
    }

    @Override // a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public i0 g0() {
        return this.v;
    }

    @Override // a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public d0 h() {
        d0 c2 = c();
        if (c2 != null) {
            return c2;
        }
        a(18);
        throw null;
    }

    @Override // a.a.a.a.v0.b.f0
    public h0 i() {
        return this.y;
    }

    @Override // a.a.a.a.v0.b.d1.p0, a.a.a.a.v0.b.a
    public List<r0> k() {
        List<r0> list = this.w;
        if (list != null) {
            return list;
        }
        a(17);
        throw null;
    }

    @Override // a.a.a.a.v0.b.f0
    public p l0() {
        return this.B;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return this.r;
    }

    @Override // a.a.a.a.v0.b.u
    public v o() {
        v vVar = this.j;
        if (vVar != null) {
            return vVar;
        }
        a(19);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b
    public b.a t() {
        b.a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        a(34);
        throw null;
    }

    @Override // a.a.a.a.v0.b.f0
    public p v0() {
        return this.A;
    }

    @Override // a.a.a.a.v0.b.f0
    public g0 w() {
        return this.x;
    }

    public f0 a(k kVar, v vVar, a1 a1Var, a.a.a.a.v0.b.f0 f0Var, b.a aVar, d dVar, m0 m0Var) {
        if (kVar == null) {
            a(27);
            throw null;
        } else if (vVar == null) {
            a(28);
            throw null;
        } else if (a1Var == null) {
            a(29);
            throw null;
        } else if (aVar == null) {
            a(30);
            throw null;
        } else if (dVar == null) {
            a(31);
            throw null;
        } else if (m0Var != null) {
            return new f0(kVar, f0Var, y(), vVar, a1Var, this.f412h, dVar, aVar, m0Var, this.o, R(), this.q, this.r, H(), this.t);
        } else {
            a(32);
            throw null;
        }
    }

    public void a(d0 d0Var, List<? extends r0> list, i0 i0Var, i0 i0Var2) {
        if (d0Var == null) {
            a(14);
            throw null;
        } else if (list != null) {
            this.f404g = d0Var;
            this.w = new ArrayList(list);
            this.v = i0Var2;
            this.u = i0Var;
        } else {
            a(15);
            throw null;
        }
    }

    /* Return type fixed from 'a.a.a.a.v0.b.f0' to match base method */
    @Override // a.a.a.a.v0.b.o0, a.a.a.a.v0.b.f0
    public a.a.a.a.v0.b.a a(a.a.a.a.v0.m.a1 a1Var) {
        if (a1Var == null) {
            a(22);
            throw null;
        } else if (a1Var.b()) {
            return this;
        } else {
            a aVar = new a();
            y0 a2 = a1Var.a();
            if (a2 != null) {
                aVar.f379g = a2;
                aVar.f376d = a();
                return aVar.a();
            }
            a.a(13);
            throw null;
        }
    }
}
