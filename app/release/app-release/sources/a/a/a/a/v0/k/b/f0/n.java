package a.a.a.a.v0.k.b.f0;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.d1.c;
import a.a.a.a.v0.e.l0;
import a.a.a.a.v0.k.b.l;
import a.a.a.a.v0.m.d0;
import a.t.f;
import a.w.c.i;
import a.w.c.j;
import java.util.List;

public final class n extends c {
    public final b m;
    public final l n;
    public final l0 o;

    public static final class a extends j implements a.w.b.a<List<? extends a.a.a.a.v0.b.b1.c>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n f1723c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(0);
            this.f1723c = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends a.a.a.a.v0.b.b1.c> a() {
            n nVar = this.f1723c;
            l lVar = nVar.n;
            return f.g(lVar.f1740c.f1735f.a(nVar.o, lVar.f1741d));
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n(a.a.a.a.v0.k.b.l r11, a.a.a.a.v0.e.l0 r12, int r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x005d
            if (r12 == 0) goto L_0x0057
            a.a.a.a.v0.k.b.j r0 = r11.f1740c
            a.a.a.a.v0.l.j r2 = r0.b
            a.a.a.a.v0.b.k r3 = r11.f1742e
            a.a.a.a.v0.e.x0.c r0 = r11.f1741d
            int r1 = r12.f1104g
            a.a.a.a.v0.f.d r4 = e.f.a.g.b(r0, r1)
            a.a.a.a.v0.e.l0$c r0 = r12.i
            java.lang.String r1 = "proto.variance"
            a.w.c.i.a(r0, r1)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0032
            r1 = 1
            if (r0 == r1) goto L_0x002f
            r1 = 2
            if (r0 != r1) goto L_0x0029
            a.a.a.a.v0.m.g1 r0 = a.a.a.a.v0.m.g1.INVARIANT
            goto L_0x0034
        L_0x0029:
            a.h r11 = new a.h
            r11.<init>()
            throw r11
        L_0x002f:
            a.a.a.a.v0.m.g1 r0 = a.a.a.a.v0.m.g1.OUT_VARIANCE
            goto L_0x0034
        L_0x0032:
            a.a.a.a.v0.m.g1 r0 = a.a.a.a.v0.m.g1.IN_VARIANCE
        L_0x0034:
            r5 = r0
            boolean r6 = r12.f1105h
            a.a.a.a.v0.b.m0 r8 = a.a.a.a.v0.b.m0.f491a
            a.a.a.a.v0.b.p0$a r9 = a.a.a.a.v0.b.p0.a.f493a
            r1 = r10
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r10.n = r11
            r10.o = r12
            a.a.a.a.v0.k.b.f0.b r11 = new a.a.a.a.v0.k.b.f0.b
            a.a.a.a.v0.k.b.l r12 = r10.n
            a.a.a.a.v0.k.b.j r12 = r12.f1740c
            a.a.a.a.v0.l.j r12 = r12.b
            a.a.a.a.v0.k.b.f0.n$a r13 = new a.a.a.a.v0.k.b.f0.n$a
            r13.<init>(r10)
            r11.<init>(r12, r13)
            r10.m = r11
            return
        L_0x0057:
            java.lang.String r11 = "proto"
            a.w.c.i.a(r11)
            throw r0
        L_0x005d:
            java.lang.String r11 = "c"
            a.w.c.i.a(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.f0.n.<init>(a.a.a.a.v0.k.b.l, a.a.a.a.v0.e.l0, int):void");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x004c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // a.a.a.a.v0.b.d1.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<a.a.a.a.v0.m.d0> U() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.k.b.f0.n.U():java.util.List");
    }

    @Override // a.a.a.a.v0.b.d1.g
    public void a(d0 d0Var) {
        if (d0Var != null) {
            throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
        }
        i.a("type");
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.a, a.a.a.a.v0.b.b1.b
    public h y() {
        return this.m;
    }
}
