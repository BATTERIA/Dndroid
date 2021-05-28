package a.a.a.a.v0.d.b.v;

import a.a.a.a.v0.e.y0.g.c;
import a.a.a.a.v0.e.y0.g.f;
import a.w.c.i;
import e.f.a.g;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final EnumC0036a f930a;
    public final f b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f931c;

    /* renamed from: d  reason: collision with root package name */
    public final String[] f932d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f933e;

    /* renamed from: f  reason: collision with root package name */
    public final String f934f;

    /* renamed from: g  reason: collision with root package name */
    public final int f935g;

    /* renamed from: a.a.a.a.v0.d.b.v.a$a  reason: collision with other inner class name */
    public enum EnumC0036a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final Map<Integer, EnumC0036a> k;
        public static final C0037a l = new C0037a(null);

        /* renamed from: c  reason: collision with root package name */
        public final int f941c;

        /* renamed from: a.a.a.a.v0.d.b.v.a$a$a  reason: collision with other inner class name */
        public static final class C0037a {
            public /* synthetic */ C0037a(a.w.c.f fVar) {
            }
        }

        /* access modifiers changed from: public */
        static {
            EnumC0036a[] values = values();
            int e2 = g.e(values.length);
            if (e2 < 16) {
                e2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
            for (EnumC0036a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f941c), aVar);
            }
            k = linkedHashMap;
        }

        /* access modifiers changed from: public */
        EnumC0036a(int i) {
            this.f941c = i;
        }
    }

    public a(EnumC0036a aVar, f fVar, c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        if (aVar == null) {
            i.a("kind");
            throw null;
        } else if (fVar == null) {
            i.a("metadataVersion");
            throw null;
        } else if (cVar != null) {
            this.f930a = aVar;
            this.b = fVar;
            this.f931c = strArr;
            this.f932d = strArr2;
            this.f933e = strArr3;
            this.f934f = str;
            this.f935g = i;
        } else {
            i.a("bytecodeVersion");
            throw null;
        }
    }

    public final String a() {
        String str = this.f934f;
        if (this.f930a == EnumC0036a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    public String toString() {
        return this.f930a + " version=" + this.b;
    }
}
