package f.o0.f;

import f.h0;
import f.z;

public final class b implements z {

    /* renamed from: a  reason: collision with root package name */
    public final e f5094a;

    public b(e eVar) {
        this.f5094a = eVar;
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f.e0, f.h0] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x014c, code lost:
        if (r4 > 0) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0287 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02cc A[SYNTHETIC, Splitter:B:139:0x02cc] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // f.z
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f.h0 a(f.z.a r27) {
        /*
        // Method dump skipped, instructions count: 1109
        */
        throw new UnsupportedOperationException("Method not decompiled: f.o0.f.b.a(f.z$a):f.h0");
    }

    public static h0 a(h0 h0Var) {
        if (h0Var == null || h0Var.i == null) {
            return h0Var;
        }
        h0.a aVar = new h0.a(h0Var);
        aVar.f5029g = null;
        return aVar.a();
    }
}
