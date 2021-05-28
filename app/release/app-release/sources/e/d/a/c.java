package e.d.a;

import android.content.Context;
import e.d.a.m.g;
import e.d.a.n.f;
import e.d.a.n.l;
import e.d.a.q.a;
import e.d.a.q.f.d;
import e.d.a.q.f.e;
import e.d.a.r.b;
import e.d.a.s.h;

public class c<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public final Context f3836c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3837d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<TranscodeType> f3838e;

    /* renamed from: f  reason: collision with root package name */
    public final l f3839f;

    /* renamed from: g  reason: collision with root package name */
    public final f f3840g;

    /* renamed from: h  reason: collision with root package name */
    public e.d.a.p.a<ModelType, DataType, ResourceType, TranscodeType> f3841h;
    public ModelType i;
    public e.d.a.m.c j = b.f4265a;
    public boolean k;
    public Float l = Float.valueOf(1.0f);
    public g m;
    public boolean n;
    public d<TranscodeType> o;
    public int p;
    public int q;
    public e.d.a.m.i.b r;
    public g<ResourceType> s;
    public boolean t;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3842a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                e.d.a.c.a.f3842a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = e.d.a.c.a.f3842a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = e.d.a.c.a.f3842a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = e.d.a.c.a.f3842a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.a.c.a.<clinit>():void");
        }
    }

    public c(Context context, Class<ModelType> cls, e.d.a.p.f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls2, e eVar, l lVar, f fVar2) {
        e.d.a.p.a<ModelType, DataType, ResourceType, TranscodeType> aVar = null;
        this.m = null;
        this.n = true;
        this.o = (d<TranscodeType>) e.b;
        this.p = -1;
        this.q = -1;
        this.r = e.d.a.m.i.b.RESULT;
        this.s = (e.d.a.m.k.c) e.d.a.m.k.c.f4082a;
        this.f3836c = context;
        this.f3838e = cls2;
        this.f3837d = eVar;
        this.f3839f = lVar;
        this.f3840g = fVar2;
        this.f3841h = fVar != null ? new e.d.a.p.a<>(fVar) : aVar;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls != null && fVar == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    public c<ModelType, DataType, ResourceType, TranscodeType> a(int i2, int i3) {
        if (h.a(i2, i3)) {
            this.q = i2;
            this.p = i3;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    public c<ModelType, DataType, ResourceType, TranscodeType> a(e.d.a.m.c cVar) {
        if (cVar != null) {
            this.j = cVar;
            return this;
        }
        throw new NullPointerException("Signature must not be null");
    }

    public c<ModelType, DataType, ResourceType, TranscodeType> a(g<ResourceType>... gVarArr) {
        this.t = true;
        if (gVarArr.length == 1) {
            this.s = gVarArr[0];
        } else {
            this.s = new e.d.a.m.d(gVarArr);
        }
        return this;
    }

    public <Y extends e.d.a.q.g.a<TranscodeType>> Y a(Y y) {
        h.a();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        } else if (this.k) {
            e.d.a.q.b c2 = y.c();
            if (c2 != null) {
                c2.clear();
                l lVar = this.f3839f;
                lVar.f4220a.remove(c2);
                lVar.b.remove(c2);
                c2.a();
            }
            if (this.m == null) {
                this.m = g.NORMAL;
            }
            e.d.a.q.b a2 = a(y, this.l.floatValue(), this.m, null);
            y.a(a2);
            this.f3840g.a(y);
            l lVar2 = this.f3839f;
            lVar2.f4220a.add(a2);
            if (!lVar2.f4221c) {
                a2.c();
            } else {
                lVar2.b.add(a2);
            }
            return y;
        } else {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
    }

    public void b() {
    }

    public void c() {
    }

    @Override // java.lang.Object
    public c<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            c<ModelType, DataType, ResourceType, TranscodeType> cVar = (c) super.clone();
            cVar.f3841h = this.f3841h != null ? this.f3841h.clone() : null;
            return cVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r16v0, resolved type: e.d.a.q.g.a<TranscodeType> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r6v0. Raw type applied. Possible types: e.d.a.m.g<ResourceType>, e.d.a.m.g<Z>, java.lang.Object */
    /* JADX DEBUG: Type inference failed for r7v0. Raw type applied. Possible types: java.lang.Class<TranscodeType>, java.lang.Class<R> */
    /* JADX DEBUG: Type inference failed for r9v0. Raw type applied. Possible types: e.d.a.q.f.d<TranscodeType>, e.d.a.q.f.d<R> */
    /* JADX WARN: Type inference failed for: r2v0, types: [A, ModelType] */
    public final e.d.a.q.b a(e.d.a.q.g.a<TranscodeType> aVar, float f2, g gVar, e.d.a.q.e eVar) {
        String str;
        String str2;
        Object obj;
        e.d.a.p.a<ModelType, DataType, ResourceType, TranscodeType> aVar2 = this.f3841h;
        ModelType modeltype = this.i;
        e.d.a.m.c cVar = this.j;
        Context context = this.f3836c;
        e.d.a.m.i.c cVar2 = this.f3837d.b;
        g gVar2 = (g<ResourceType>) this.s;
        Class cls = (Class<TranscodeType>) this.f3838e;
        boolean z = this.n;
        d dVar = (d<TranscodeType>) this.o;
        int i2 = this.q;
        int i3 = this.p;
        e.d.a.m.i.b bVar = this.r;
        e.d.a.q.a<?, ?, ?, ?> poll = e.d.a.q.a.D.poll();
        if (poll == null) {
            poll = new e.d.a.q.a<>();
        }
        poll.i = aVar2;
        poll.k = modeltype;
        poll.b = cVar;
        poll.f4231c = null;
        poll.f4232d = 0;
        poll.f4235g = context.getApplicationContext();
        poll.n = gVar;
        poll.o = aVar;
        poll.q = f2;
        poll.w = null;
        poll.f4233e = 0;
        poll.x = null;
        poll.f4234f = 0;
        poll.p = null;
        poll.j = eVar;
        poll.r = cVar2;
        poll.f4236h = gVar2;
        poll.l = cls;
        poll.m = z;
        poll.s = dVar;
        poll.t = i2;
        poll.u = i3;
        poll.v = bVar;
        poll.C = a.EnumC0129a.PENDING;
        if (modeltype != 0) {
            e.d.a.q.a.a("ModelLoader", aVar2.c(), "try .using(ModelLoader)");
            e.d.a.q.a.a("Transcoder", aVar2.f(), "try .as*(Class).transcode(ResourceTranscoder)");
            e.d.a.q.a.a("Transformation", gVar2, "try .transform(UnitTransformation.get())");
            if (bVar.f3964c) {
                obj = aVar2.e();
                str2 = "SourceEncoder";
                str = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                obj = aVar2.g();
                str2 = "SourceDecoder";
                str = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            e.d.a.q.a.a(str2, obj, str);
            if (bVar.f3964c || bVar.f3965d) {
                e.d.a.q.a.a("CacheDecoder", aVar2.b(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (bVar.f3965d) {
                e.d.a.q.a.a("Encoder", aVar2.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
        return poll;
    }
}
