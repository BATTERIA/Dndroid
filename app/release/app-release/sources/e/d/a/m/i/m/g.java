package e.d.a.m.i.m;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import e.d.a.s.h;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(19)
public class g implements e {

    /* renamed from: d  reason: collision with root package name */
    public static final Bitmap.Config[] f4020d = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f4021e = {Bitmap.Config.RGB_565};

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f4022f = {Bitmap.Config.ARGB_4444};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f4023g = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f4024a = new c();
    public final c<b, Bitmap> b = new c<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f4025c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4026a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                e.d.a.m.i.m.g.a.f4026a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = e.d.a.m.i.m.g.a.f4026a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = e.d.a.m.i.m.g.a.f4026a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = e.d.a.m.i.m.g.a.f4026a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.i.m.g.a.<clinit>():void");
        }
    }

    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public final c f4027a;
        public int b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f4028c;

        public b(c cVar) {
            this.f4027a = cVar;
        }

        @Override // e.d.a.m.i.m.f
        public void a() {
            this.f4027a.a(this);
        }

        /* JADX WARNING: Removed duplicated region for block: B:9:0x001c A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof e.d.a.m.i.m.g.b
                r1 = 0
                if (r0 == 0) goto L_0x001d
                e.d.a.m.i.m.g$b r4 = (e.d.a.m.i.m.g.b) r4
                int r0 = r3.b
                int r2 = r4.b
                if (r0 != r2) goto L_0x001d
                android.graphics.Bitmap$Config r0 = r3.f4028c
                android.graphics.Bitmap$Config r4 = r4.f4028c
                if (r0 != 0) goto L_0x0016
                if (r4 != 0) goto L_0x001d
                goto L_0x001c
            L_0x0016:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x001d
            L_0x001c:
                r1 = 1
            L_0x001d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.i.m.g.b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.f4028c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return g.a(this.b, this.f4028c);
        }
    }

    public static class c extends a<b> {
        public b a(int i, Bitmap.Config config) {
            b poll = this.f4008a.poll();
            if (poll == null) {
                poll = new b(this);
            }
            b bVar = (b) poll;
            bVar.b = i;
            bVar.f4028c = config;
            return bVar;
        }
    }

    public static String a(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    @Override // e.d.a.m.i.m.e
    public Bitmap a() {
        Bitmap a2 = this.b.a();
        if (a2 != null) {
            a(Integer.valueOf(h.a(a2)), a2.getConfig());
        }
        return a2;
    }

    @Override // e.d.a.m.i.m.e
    public Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int a2 = h.a(i, i2, config);
        b a3 = this.f4024a.a(a2, config);
        int i3 = a.f4026a[config.ordinal()];
        int i4 = 0;
        if (i3 == 1) {
            configArr = f4020d;
        } else if (i3 == 2) {
            configArr = f4021e;
        } else if (i3 != 3) {
            configArr = i3 != 4 ? new Bitmap.Config[]{config} : f4023g;
        } else {
            configArr = f4022f;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = a(config2).ceilingKey(Integer.valueOf(a2));
            if (ceilingKey == null || ceilingKey.intValue() > a2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != a2 || config2 == null || !config2.equals(config)) {
                this.f4024a.a(a3);
                a3 = this.f4024a.a(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a4 = this.b.a(a3);
        if (a4 != null) {
            a(Integer.valueOf(h.a(a4)), a4.getConfig());
            a4.reconfigure(i, i2, a4.getConfig() != null ? a4.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a4;
    }

    public final NavigableMap<Integer, Integer> a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f4025c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4025c.put(config, treeMap);
        return treeMap;
    }

    public final void a(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> a2 = a(config);
        Integer num2 = (Integer) a2.get(num);
        if (num2.intValue() == 1) {
            a2.remove(num);
        } else {
            a2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // e.d.a.m.i.m.e
    public int b(Bitmap bitmap) {
        return h.a(bitmap);
    }

    @Override // e.d.a.m.i.m.e
    public String b(int i, int i2, Bitmap.Config config) {
        return a(h.a(i, i2, config), config);
    }

    @Override // e.d.a.m.i.m.e
    public String c(Bitmap bitmap) {
        return a(h.a(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("SizeConfigStrategy{groupedMap=");
        a2.append(this.b);
        a2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f4025c.entrySet()) {
            a2.append(entry.getKey());
            a2.append('[');
            a2.append(entry.getValue());
            a2.append("], ");
        }
        if (!this.f4025c.isEmpty()) {
            a2.replace(a2.length() - 2, a2.length(), "");
        }
        a2.append(")}");
        return a2.toString();
    }

    @Override // e.d.a.m.i.m.e
    public void a(Bitmap bitmap) {
        b a2 = this.f4024a.a(h.a(bitmap), bitmap.getConfig());
        this.b.a(a2, bitmap);
        NavigableMap<Integer, Integer> a3 = a(bitmap.getConfig());
        Integer num = (Integer) a3.get(Integer.valueOf(a2.b));
        Integer valueOf = Integer.valueOf(a2.b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        a3.put(valueOf, Integer.valueOf(i));
    }
}
