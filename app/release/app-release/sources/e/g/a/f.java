package e.g.a;

import android.content.Context;
import e.f.a.g;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f4672a = new HashSet();
    public final d b;

    /* renamed from: c  reason: collision with root package name */
    public final c f4673c;

    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f4674c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f4675d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f4676e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f4677f;

        public a(Context context, String str, String str2, e eVar) {
            this.f4674c = context;
            this.f4675d = str;
            this.f4676e = str2;
            this.f4677f = eVar;
        }

        public void run() {
            try {
                f.this.b(this.f4674c, this.f4675d, this.f4676e);
                this.f4677f.a();
            } catch (b | UnsatisfiedLinkError e2) {
                this.f4677f.a(e2);
            }
        }
    }

    public f() {
        h hVar = new h();
        a aVar = new a();
        this.b = hVar;
        this.f4673c = aVar;
    }

    public File a(Context context) {
        return context.getDir("lib", 0);
    }

    public File a(Context context, String str, String str2) {
        String a2 = ((h) this.b).a(str);
        return g.a(str2) ? new File(a(context), a2) : new File(a(context), e.a.a.a.a.a(a2, ".", str2));
    }

    public void a(Context context, String str, String str2, e eVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!g.a((CharSequence) str)) {
            String.format(Locale.US, "Beginning load of %s...", str);
            if (eVar == null) {
                b(context, str, str2);
            } else {
                new Thread(new a(context, str, str2, eVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:64|65|66|67|68|70|71) */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x018f, code lost:
        if (r11.f4671a != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ab, code lost:
        if (r9.length > 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013d, code lost:
        if (r11.f4671a != null) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013f, code lost:
        r11.f4671a.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x012f */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x017f A[SYNTHETIC, Splitter:B:108:0x017f] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01d5 A[SYNTHETIC, Splitter:B:134:0x01d5] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0187 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0187 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0161 A[SYNTHETIC, Splitter:B:85:0x0161] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0168 A[SYNTHETIC, Splitter:B:89:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0170 A[SYNTHETIC, Splitter:B:98:0x0170] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a.f.b(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
