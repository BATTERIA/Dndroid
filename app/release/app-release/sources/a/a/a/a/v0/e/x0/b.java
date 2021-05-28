package a.a.a.a.v0.e.x0;

import a.a.a.a.v0.e.f;
import a.a.a.a.v0.e.t;
import a.a.a.a.v0.e.u;
import a.a.a.a.v0.e.v0;
import a.a.a.a.v0.h.j;

public class b {
    public static final C0045b A;
    public static final C0045b B;
    public static final C0045b C;
    public static final C0045b D;
    public static final C0045b E;
    public static final C0045b F;
    public static final C0045b G;
    public static final C0045b H;
    public static final C0045b I;
    public static final C0045b J = d.a();

    /* renamed from: a */
    public static final C0045b f1238a = d.a();
    public static final C0045b b;

    /* renamed from: c */
    public static final d<v0> f1239c;

    /* renamed from: d */
    public static final d<u> f1240d;

    /* renamed from: e */
    public static final d<f.c> f1241e;

    /* renamed from: f */
    public static final C0045b f1242f;

    /* renamed from: g */
    public static final C0045b f1243g;

    /* renamed from: h */
    public static final C0045b f1244h;
    public static final C0045b i;
    public static final C0045b j;
    public static final C0045b k = d.a((d<?>) f1239c);
    public static final d<t> l;
    public static final C0045b m;
    public static final C0045b n;
    public static final C0045b o;
    public static final C0045b p;
    public static final C0045b q;
    public static final C0045b r;
    public static final C0045b s;
    public static final C0045b t;
    public static final C0045b u;
    public static final C0045b v;
    public static final C0045b w;
    public static final C0045b x;
    public static final C0045b y;
    public static final C0045b z;

    /* renamed from: a.a.a.a.v0.e.x0.b$b */
    public static class C0045b extends d<Boolean> {
        public C0045b(int i) {
            super(i, 1, null);
        }

        public int a(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f1246a;
            }
            return 0;
        }

        @Override // a.a.a.a.v0.e.x0.b.d
        public Boolean a(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.f1246a)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }
    }

    public static class c<E extends j.a> extends d<E> {

        /* renamed from: c */
        public final E[] f1245c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(int r5, E[] r6) {
            /*
                r4 = this;
                r0 = 1
                if (r6 == 0) goto L_0x0033
                int r1 = r6.length
                int r1 = r1 - r0
                if (r1 != 0) goto L_0x0008
                goto L_0x0012
            L_0x0008:
                r2 = 31
            L_0x000a:
                if (r2 < 0) goto L_0x001c
                int r3 = r0 << r2
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                int r0 = r0 + r2
            L_0x0012:
                r1 = 0
                r4.<init>(r5, r0, r1)
                r4.f1245c = r6
                return
            L_0x0019:
                int r2 = r2 + -1
                goto L_0x000a
            L_0x001c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Empty enum: "
                java.lang.StringBuilder r0 = e.a.a.a.a.a(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L_0x0033:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r1 = "enumEntries"
                r5[r6] = r1
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                r5[r0] = r6
                r6 = 2
                java.lang.String r0 = "bitWidth"
                r5[r6] = r0
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                goto L_0x0051
            L_0x0050:
                throw r6
            L_0x0051:
                goto L_0x0050
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.e.x0.b.c.<init>(int, a.a.a.a.v0.h.j$a[]):void");
        }

        @Override // a.a.a.a.v0.e.x0.b.d
        public Object a(int i) {
            int i2 = this.f1246a;
            int i3 = (i & (((1 << this.b) - 1) << i2)) >> i2;
            E[] eArr = this.f1245c;
            for (E e2 : eArr) {
                if (e2.getNumber() == i3) {
                    return e2;
                }
            }
            return null;
        }

        @Override // a.a.a.a.v0.e.x0.b.d
        public int a(Object obj) {
            return ((j.a) obj).getNumber() << this.f1246a;
        }
    }

    public static abstract class d<E> {

        /* renamed from: a */
        public final int f1246a;
        public final int b;

        public /* synthetic */ d(int i, int i2, a aVar) {
            this.f1246a = i;
            this.b = i2;
        }

        public static C0045b a() {
            return new C0045b(0);
        }

        public static C0045b a(d<?> dVar) {
            return new C0045b(dVar.f1246a + dVar.b);
        }

        public static <E extends j.a> d<E> a(d<?> dVar, E[] eArr) {
            return new c(dVar.f1246a + dVar.b, eArr);
        }

        public abstract int a(E e2);

        public abstract E a(int i);
    }

    static {
        C0045b a2 = d.a();
        b = a2;
        d<v0> a3 = d.a(a2, v0.values());
        f1239c = a3;
        d<u> a4 = d.a(a3, u.values());
        f1240d = a4;
        d<f.c> a5 = d.a(a4, f.c.values());
        f1241e = a5;
        C0045b a6 = d.a((d<?>) a5);
        f1242f = a6;
        C0045b a7 = d.a((d<?>) a6);
        f1243g = a7;
        C0045b a8 = d.a((d<?>) a7);
        f1244h = a8;
        C0045b a9 = d.a((d<?>) a8);
        i = a9;
        j = d.a((d<?>) a9);
        d<t> a10 = d.a(f1240d, t.values());
        l = a10;
        C0045b a11 = d.a((d<?>) a10);
        m = a11;
        C0045b a12 = d.a((d<?>) a11);
        n = a12;
        C0045b a13 = d.a((d<?>) a12);
        o = a13;
        C0045b a14 = d.a((d<?>) a13);
        p = a14;
        C0045b a15 = d.a((d<?>) a14);
        q = a15;
        C0045b a16 = d.a((d<?>) a15);
        r = a16;
        s = d.a((d<?>) a16);
        C0045b a17 = d.a((d<?>) l);
        t = a17;
        C0045b a18 = d.a((d<?>) a17);
        u = a18;
        C0045b a19 = d.a((d<?>) a18);
        v = a19;
        C0045b a20 = d.a((d<?>) a19);
        w = a20;
        C0045b a21 = d.a((d<?>) a20);
        x = a21;
        C0045b a22 = d.a((d<?>) a21);
        y = a22;
        C0045b a23 = d.a((d<?>) a22);
        z = a23;
        C0045b a24 = d.a((d<?>) a23);
        A = a24;
        B = d.a((d<?>) a24);
        C0045b a25 = d.a((d<?>) b);
        C = a25;
        C0045b a26 = d.a((d<?>) a25);
        D = a26;
        E = d.a((d<?>) a26);
        C0045b a27 = d.a((d<?>) f1240d);
        F = a27;
        C0045b a28 = d.a((d<?>) a27);
        G = a28;
        H = d.a((d<?>) a28);
        C0045b a29 = d.a();
        I = a29;
        d.a((d<?>) a29);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.e.x0.b.a(int):void");
    }
}
