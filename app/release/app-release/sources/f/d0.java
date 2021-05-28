package f;

import f.o0.d;
import f.o0.g.l;
import f.o0.k.f;
import java.util.concurrent.atomic.AtomicInteger;

public final class d0 implements j {

    /* renamed from: c  reason: collision with root package name */
    public final b0 f4990c;

    /* renamed from: d  reason: collision with root package name */
    public l f4991d;

    /* renamed from: e  reason: collision with root package name */
    public final e0 f4992e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4993f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4994g;

    public final class a extends d {

        /* renamed from: d  reason: collision with root package name */
        public final k f4995d;

        /* renamed from: e  reason: collision with root package name */
        public volatile AtomicInteger f4996e = new AtomicInteger(0);

        public a(k kVar) {
            super("OkHttp %s", d0.this.f4992e.f5005a.f());
            this.f4995d = kVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x002f A[Catch:{ IOException -> 0x0052, all -> 0x0025, all -> 0x0050 }] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0055 A[Catch:{ IOException -> 0x0052, all -> 0x0025, all -> 0x0050 }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0073 A[Catch:{ IOException -> 0x0052, all -> 0x0025, all -> 0x0050 }] */
        @Override // f.o0.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a() {
            /*
            // Method dump skipped, instructions count: 141
            */
            throw new UnsupportedOperationException("Method not decompiled: f.d0.a.a():void");
        }

        public String b() {
            return d0.this.f4992e.f5005a.f5405d;
        }
    }

    public d0(b0 b0Var, e0 e0Var, boolean z) {
        this.f4990c = b0Var;
        this.f4992e = e0Var;
        this.f4993f = z;
    }

    public static d0 a(b0 b0Var, e0 e0Var, boolean z) {
        d0 d0Var = new d0(b0Var, e0Var, z);
        d0Var.f4991d = new l(b0Var, d0Var);
        return d0Var;
    }

    public void a(k kVar) {
        synchronized (this) {
            if (!this.f4994g) {
                this.f4994g = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        l lVar = this.f4991d;
        if (lVar != null) {
            lVar.f5151f = f.f5341a.a("response.body().close()");
            if (lVar.f5149d != null) {
                this.f4990c.f4970c.a(new a(kVar));
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.h0 b() {
        /*
        // Method dump skipped, instructions count: 152
        */
        throw new UnsupportedOperationException("Method not decompiled: f.d0.b():f.h0");
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4991d.d() ? "canceled " : "");
        sb.append(this.f4993f ? "web socket" : "call");
        sb.append(" to ");
        sb.append(this.f4992e.f5005a.f());
        return sb.toString();
    }

    @Override // java.lang.Object
    public Object clone() {
        return a(this.f4990c, this.f4992e, this.f4993f);
    }
}
