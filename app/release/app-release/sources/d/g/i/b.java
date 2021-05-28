package d.g.i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import d.d.h;
import d.g.i.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d.d.f<String, Typeface> f3289a = new d.d.f<>(16);
    public static final c b = new c("fonts", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3290c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, ArrayList<c.AbstractC0102c<g>>> f3291d = new h<>();

    /* renamed from: e  reason: collision with root package name */
    public static final Comparator<byte[]> f3292e = new d();

    public static class a implements Callable<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f3293a;
        public final /* synthetic */ a b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f3294c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f3295d;

        public a(Context context, a aVar, int i, String str) {
            this.f3293a = context;
            this.b = aVar;
            this.f3294c = i;
            this.f3295d = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public g call() {
            g a2 = b.a(this.f3293a, this.b, this.f3294c);
            Typeface typeface = a2.f3303a;
            if (typeface != null) {
                b.f3289a.a(this.f3295d, typeface);
            }
            return a2;
        }
    }

    /* renamed from: d.g.i.b$b  reason: collision with other inner class name */
    public static class C0101b implements c.AbstractC0102c<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d.g.e.c.g f3296a;
        public final /* synthetic */ Handler b;

        public C0101b(d.g.e.c.g gVar, Handler handler) {
            this.f3296a = gVar;
            this.b = handler;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // d.g.i.c.AbstractC0102c
        public void a(g gVar) {
            d.g.e.c.g gVar2;
            int i;
            g gVar3 = gVar;
            if (gVar3 == null) {
                gVar2 = this.f3296a;
                i = 1;
            } else {
                i = gVar3.b;
                if (i == 0) {
                    this.f3296a.a(gVar3.f3303a, this.b);
                    return;
                }
                gVar2 = this.f3296a;
            }
            gVar2.a(i, this.b);
        }
    }

    public static class c implements c.AbstractC0102c<g> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3297a;

        public c(String str) {
            this.f3297a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r1.get(r0).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(d.g.i.b.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = d.g.i.b.f3290c
                monitor-enter(r0)
                d.d.h<java.lang.String, java.util.ArrayList<d.g.i.c$c<d.g.i.b$g>>> r1 = d.g.i.b.f3291d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.f3297a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                d.d.h<java.lang.String, java.util.ArrayList<d.g.i.c$c<d.g.i.b$g>>> r2 = d.g.i.b.f3291d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.f3297a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                d.g.i.c$c r2 = (d.g.i.c.AbstractC0102c) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)
                goto L_0x0031
            L_0x0030:
                throw r5
            L_0x0031:
                goto L_0x0030
            */
            throw new UnsupportedOperationException("Method not decompiled: d.g.i.b.c.a(d.g.i.b$g):void");
        }
    }

    public static class d implements Comparator<byte[]> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                i2 = bArr3.length;
                i = bArr4.length;
            } else {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        i2 = bArr3[i3];
                        i = bArr4[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f3298a;
        public final f[] b;

        public e(int i, f[] fVarArr) {
            this.f3298a = i;
            this.b = fVarArr;
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f3299a;
        public final int b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3300c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f3301d;

        /* renamed from: e  reason: collision with root package name */
        public final int f3302e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri != null) {
                this.f3299a = uri;
                this.b = i;
                this.f3300c = i2;
                this.f3301d = z;
                this.f3302e = i3;
                return;
            }
            throw null;
        }
    }

    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f3303a;
        public final int b;

        public g(Typeface typeface, int i) {
            this.f3303a = typeface;
            this.b = i;
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [d.g.i.b$f[], android.database.Cursor] */
    public static e a(Context context, CancellationSignal cancellationSignal, a aVar) {
        Cursor cursor;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = aVar.f3284a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(e.a.a.a.a.b("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(aVar.b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, f3292e);
            List<List<byte[]>> list = aVar.f3286d;
            if (list == null) {
                list = c.a.a.a.a.a(resources, aVar.f3287e);
            }
            int i = 0;
            while (true) {
                cursor = 0;
                if (i >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i));
                Collections.sort(arrayList2, f3292e);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i++;
            }
            if (resolveContentProvider == null) {
                return new e(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f3285c}, null, cancellationSignal);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        arrayList3.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                    }
                }
                return new e(0, (f[]) arrayList3.toArray(new f[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aVar.b);
        }
    }

    public static g a(Context context, a aVar, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = a2.f3298a;
            int i3 = -3;
            if (i2 == 0) {
                Typeface a3 = d.g.f.c.f3262a.a(context, (CancellationSignal) null, a2.b, i);
                if (a3 != null) {
                    i3 = 0;
                }
                return new g(a3, i3);
            }
            if (i2 == 1) {
                i3 = -2;
            }
            return new g(null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r3 = d.g.i.b.b;
        r4 = new d.g.i.b.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r3 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r3.b(new d.g.i.d(r3, r1, new android.os.Handler(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r2, d.g.i.a r3, d.g.e.c.g r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 156
        */
        throw new UnsupportedOperationException("Method not decompiled: d.g.i.b.a(android.content.Context, d.g.i.a, d.g.e.c.g, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.f3302e == 0) {
                Uri uri = fVar.f3299a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, c.a.a.a.a.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
