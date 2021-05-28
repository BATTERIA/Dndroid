package d.g.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import c.a.a.a.a;
import d.g.e.c.c;
import d.g.i.b;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, c> f3272a = new ConcurrentHashMap<>();

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = a.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!a.a(a2, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r16, d.g.e.c.c r17, android.content.res.Resources r18, int r19) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.f.h.a(android.content.Context, d.g.e.c.c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface a(Context context, InputStream inputStream) {
        File a2 = a.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (!a.a(a2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(a2.getPath());
            a2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024 A[SYNTHETIC, Splitter:B:17:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r3, android.os.CancellationSignal r4, d.g.i.b.f[] r5, int r6) {
        /*
            r2 = this;
            int r4 = r5.length
            r0 = 0
            r1 = 1
            if (r4 >= r1) goto L_0x0006
            return r0
        L_0x0006:
            d.g.i.b$f r4 = r2.a(r5, r6)
            android.content.ContentResolver r5 = r3.getContentResolver()     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.net.Uri r4 = r4.f3299a     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.graphics.Typeface r3 = r2.a(r3, r4)     // Catch:{ IOException -> 0x0029, all -> 0x001e }
            if (r4 == 0) goto L_0x001d
            r4.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r3
        L_0x001e:
            r3 = move-exception
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r3
        L_0x0028:
            r4 = r0
        L_0x0029:
            if (r4 == 0) goto L_0x002e
            r4.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.f.h.a(android.content.Context, android.os.CancellationSignal, d.g.i.b$f[], int):android.graphics.Typeface");
    }

    public b.f a(b.f[] fVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        b.f fVar = null;
        int i3 = Integer.MAX_VALUE;
        for (b.f fVar2 : fVarArr) {
            int abs = (Math.abs(fVar2.f3300c - i2) * 2) + (fVar2.f3301d == z ? 0 : 1);
            if (fVar == null || i3 > abs) {
                fVar = fVar2;
                i3 = abs;
            }
        }
        return fVar;
    }
}
