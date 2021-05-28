package okhttp3.internal.publicsuffix;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f5480e = {42};

    /* renamed from: f  reason: collision with root package name */
    public static final String[] f5481f = new String[0];

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f5482g = {"*"};

    /* renamed from: h  reason: collision with root package name */
    public static final PublicSuffixDatabase f5483h = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f5484a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f5485c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f5486d;

    public static String a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr2.length - 1) {
                        break;
                    } else {
                        i10++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, StandardCharsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0095 A[LOOP:4: B:50:0x0095->B:55:0x00a3, LOOP_START, PHI: r1 
      PHI: (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:49:0x0093, B:55:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] a(java.lang.String[] r9) {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            g.l r1 = new g.l
            g.x r0 = g.o.a(r0)
            r1.<init>(r0)
            g.s r0 = new g.s
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x003d }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003d }
            r0.readFully(r1)     // Catch:{ all -> 0x003d }
            int r2 = r0.readInt()     // Catch:{ all -> 0x003d }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003d }
            r0.readFully(r2)     // Catch:{ all -> 0x003d }
            r0.close()
            monitor-enter(r3)
            r3.f5485c = r1     // Catch:{ all -> 0x003a }
            r3.f5486d = r2     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            java.util.concurrent.CountDownLatch r0 = r3.b
            r0.countDown()
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0048:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a():void");
    }
}
