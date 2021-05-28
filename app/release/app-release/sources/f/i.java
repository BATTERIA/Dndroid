package f;

import java.util.concurrent.TimeUnit;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5031a;
    public final boolean b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5032c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5033d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5034e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5035f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5036g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5037h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5038a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public int f5039c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f5040d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f5041e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5042f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5043g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5044h;
    }

    static {
        a aVar = new a();
        aVar.f5038a = true;
        new i(aVar);
        a aVar2 = new a();
        aVar2.f5042f = true;
        int i2 = Integer.MAX_VALUE;
        long seconds = TimeUnit.SECONDS.toSeconds((long) Integer.MAX_VALUE);
        if (seconds <= 2147483647L) {
            i2 = (int) seconds;
        }
        aVar2.f5040d = i2;
        new i(aVar2);
    }

    public i(a aVar) {
        this.f5031a = aVar.f5038a;
        this.b = aVar.b;
        this.f5032c = aVar.f5039c;
        this.f5033d = -1;
        this.f5034e = false;
        this.f5035f = false;
        this.f5036g = false;
        this.f5037h = aVar.f5040d;
        this.i = aVar.f5041e;
        this.j = aVar.f5042f;
        this.k = aVar.f5043g;
        this.l = aVar.f5044h;
    }

    public i(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, String str) {
        this.f5031a = z;
        this.b = z2;
        this.f5032c = i2;
        this.f5033d = i3;
        this.f5034e = z3;
        this.f5035f = z4;
        this.f5036g = z5;
        this.f5037h = i4;
        this.i = i5;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 191
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public static f.i a(f.x r22) {
        /*
        // Method dump skipped, instructions count: 350
        */
        throw new UnsupportedOperationException("Method not decompiled: f.i.a(f.x):f.i");
    }

    public String toString() {
        String str = this.m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f5031a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.f5032c != -1) {
                sb.append("max-age=");
                sb.append(this.f5032c);
                sb.append(", ");
            }
            if (this.f5033d != -1) {
                sb.append("s-maxage=");
                sb.append(this.f5033d);
                sb.append(", ");
            }
            if (this.f5034e) {
                sb.append("private, ");
            }
            if (this.f5035f) {
                sb.append("public, ");
            }
            if (this.f5036g) {
                sb.append("must-revalidate, ");
            }
            if (this.f5037h != -1) {
                sb.append("max-stale=");
                sb.append(this.f5037h);
                sb.append(", ");
            }
            if (this.i != -1) {
                sb.append("min-fresh=");
                sb.append(this.i);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.k) {
                sb.append("no-transform, ");
            }
            if (this.l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.m = str;
        }
        return str;
    }
}
