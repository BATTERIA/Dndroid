package e.f.a;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.system.Os;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f4646a = true;
    public static k b;

    /* renamed from: c  reason: collision with root package name */
    public static final ReentrantReadWriteLock f4647c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    public static m[] f4648d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile int f4649e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static o[] f4650f;

    /* renamed from: g  reason: collision with root package name */
    public static b f4651g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashSet<String> f4652h = new HashSet<>();
    public static final Map<String, Object> i = new HashMap();
    public static final Set<String> j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static n k = null;
    public static int l;
    public static boolean m;

    public static class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4653a;
        public final /* synthetic */ String b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f4654c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Runtime f4655d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Method f4656e;

        public a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f4653a = z;
            this.b = str;
            this.f4654c = str2;
            this.f4655d = runtime;
            this.f4656e = method;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
            r7.addSuppressed(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(java.lang.String r7) {
            /*
                r6 = this;
                java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0.<init>(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.lang.String r7 = "MD5"
                java.security.MessageDigest r7 = java.security.MessageDigest.getInstance(r7)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r1.<init>(r0)     // Catch:{ IOException -> 0x004f, SecurityException -> 0x0049, NoSuchAlgorithmException -> 0x0043 }
                r0 = 4096(0x1000, float:5.74E-42)
                byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0037 }
            L_0x0014:
                int r2 = r1.read(r0)     // Catch:{ all -> 0x0037 }
                r3 = 0
                if (r2 <= 0) goto L_0x001f
                r7.update(r0, r3, r2)     // Catch:{ all -> 0x0037 }
                goto L_0x0014
            L_0x001f:
                java.lang.String r0 = "%32x"
                r2 = 1
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x0037 }
                java.math.BigInteger r5 = new java.math.BigInteger     // Catch:{ all -> 0x0037 }
                byte[] r7 = r7.digest()     // Catch:{ all -> 0x0037 }
                r5.<init>(r2, r7)     // Catch:{ all -> 0x0037 }
                r4[r3] = r5     // Catch:{ all -> 0x0037 }
                java.lang.String r7 = java.lang.String.format(r0, r4)     // Catch:{ all -> 0x0037 }
                r1.close()
                goto L_0x0054
            L_0x0037:
                r7 = move-exception
                throw r7     // Catch:{ all -> 0x0039 }
            L_0x0039:
                r0 = move-exception
                r1.close()     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r1 = move-exception
                r7.addSuppressed(r1)
            L_0x0042:
                throw r0
            L_0x0043:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x0049:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
                goto L_0x0054
            L_0x004f:
                r7 = move-exception
                java.lang.String r7 = r7.toString()
            L_0x0054:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.a.a(java.lang.String):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + a(r9) + " search path is " + r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.String r9, int r10) {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.a.a(java.lang.String, int):void");
        }
    }

    public static final class b extends UnsatisfiedLinkError {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.Throwable r3, java.lang.String r4) {
            /*
                r2 = this;
                java.lang.String r0 = "APK was built for a different platform. Supported ABIs: "
                java.lang.StringBuilder r0 = e.a.a.a.a.a(r0)
                java.lang.String[] r1 = e.f.a.g.b()
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = " error: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4)
                r2.initCause(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.b.<init>(java.lang.Throwable, java.lang.String):void");
        }
    }

    public static void a() {
        f4647c.readLock().lock();
        try {
            if (!(f4648d != null)) {
                throw new RuntimeException("SoLoader.init() not yet called");
            }
        } finally {
            f4647c.readLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r12, int r13, android.os.StrictMode.ThreadPolicy r14) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.a(java.lang.String, int, android.os.StrictMode$ThreadPolicy):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[Catch:{ all -> 0x003b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0006
            r5 = 1
            goto L_0x0007
        L_0x0006:
            r5 = 0
        L_0x0007:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ IOException -> 0x0039 }
            r3 = r5 & 32
            if (r3 == 0) goto L_0x0010
            goto L_0x001d
        L_0x0010:
            if (r4 == 0) goto L_0x001d
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()     // Catch:{ all -> 0x003b }
            int r3 = r3.flags     // Catch:{ all -> 0x003b }
            r3 = r3 & 129(0x81, float:1.81E-43)
            if (r3 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            e.f.a.l.m = r0     // Catch:{ all -> 0x003b }
            r0 = 0
            a(r0)     // Catch:{ all -> 0x003b }
            a(r4, r5)     // Catch:{ all -> 0x003b }
            boolean r4 = e.f.a.g.c()     // Catch:{ all -> 0x003b }
            if (r4 != 0) goto L_0x0035
            e.f.a.j r4 = new e.f.a.j     // Catch:{ all -> 0x003b }
            r4.<init>()     // Catch:{ all -> 0x003b }
            e.f.a.g.a(r4)     // Catch:{ all -> 0x003b }
        L_0x0035:
            android.os.StrictMode.setThreadPolicy(r2)
            return
        L_0x0039:
            r4 = move-exception
            goto L_0x0040
        L_0x003b:
            r4 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r4
        L_0x0040:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.a(android.content.Context, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(e.f.a.k r11) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.a(e.f.a.k):void");
    }

    /* JADX INFO: finally extract failed */
    public static void a(Context context, int i2) {
        int i3;
        boolean z;
        f4647c.writeLock().lock();
        try {
            if (f4648d == null) {
                Log.d("SoLoader", "init start");
                l = i2;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                int i4 = 0;
                if (str == null) {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 23) {
                        z = Process.is64Bit();
                    } else {
                        if (i5 >= 21) {
                            try {
                                z = Os.readlink("/proc/self/exe").contains("64");
                            } catch (Exception e2) {
                                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Err msg: %s", e2.getMessage()));
                            }
                        }
                        z = false;
                    }
                    str = z ? "/vendor/lib64:/system/lib64" : "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (String str2 : split) {
                    Log.d("SoLoader", "adding system library source: " + str2);
                    arrayList.add(new c(new File(str2), 2));
                }
                if (context != null) {
                    if ((i2 & 1) != 0) {
                        f4650f = null;
                        Log.d("SoLoader", "adding exo package source: lib-main");
                        arrayList.add(0, new d(context, "lib-main"));
                    } else {
                        if (m) {
                            i3 = 0;
                        } else {
                            f4651g = new b(context, 0);
                            Log.d("SoLoader", "adding application source: " + f4651g.toString());
                            arrayList.add(0, f4651g);
                            i3 = 1;
                        }
                        if ((l & 8) != 0) {
                            f4650f = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            a aVar = new a(context, file, "lib-main", i3);
                            arrayList2.add(aVar);
                            Log.d("SoLoader", "adding backup source from : " + aVar.toString());
                            if (Build.VERSION.SDK_INT >= 21 && context.getApplicationInfo().splitSourceDirs != null) {
                                Log.d("SoLoader", "adding backup sources from split apks");
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < length) {
                                    File file2 = new File(strArr[i6]);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("lib-");
                                    sb.append(i7);
                                    a aVar2 = new a(context, file2, sb.toString(), i3);
                                    Log.d("SoLoader", "adding backup source: " + aVar2.toString());
                                    arrayList2.add(aVar2);
                                    i6++;
                                    i7++;
                                }
                            }
                            f4650f = (o[]) arrayList2.toArray(new o[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                m[] mVarArr = (m[]) arrayList.toArray(new m[arrayList.size()]);
                f4647c.writeLock().lock();
                try {
                    if ((l & 2) != 0) {
                        i4 = 1;
                    }
                    f4647c.writeLock().unlock();
                    int length2 = mVarArr.length;
                    while (true) {
                        int i8 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        Log.d("SoLoader", "Preparing SO source: " + mVarArr[i8]);
                        mVarArr[i8].a(i4);
                        length2 = i8;
                    }
                    f4648d = mVarArr;
                    f4649e++;
                    Log.d("SoLoader", "init finish: " + f4648d.length + " SO sources prepared");
                } catch (Throwable th) {
                    f4647c.writeLock().unlock();
                    throw th;
                }
            }
        } finally {
            Log.d("SoLoader", "init exiting");
            f4647c.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean a(String str, int i2) {
        boolean z;
        n nVar;
        boolean z2;
        f4647c.readLock().lock();
        try {
            if (f4648d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    a();
                } else {
                    synchronized (l.class) {
                        z2 = !f4652h.contains(str);
                        if (z2) {
                            if (k != null) {
                                k.a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    f4647c.readLock().unlock();
                    return z2;
                }
            }
            f4647c.readLock().unlock();
            if (!m || (nVar = k) == null) {
                String mapLibraryName = System.mapLibraryName(str);
                boolean z3 = false;
                do {
                    try {
                        z3 = a(mapLibraryName, str, null, i2, null);
                        z = false;
                        continue;
                    } catch (UnsatisfiedLinkError e2) {
                        int i3 = f4649e;
                        f4647c.writeLock().lock();
                        try {
                            if (f4651g == null || !f4651g.a()) {
                                z = false;
                            } else {
                                Log.w("SoLoader", "sApplicationSoSource updated during load: " + mapLibraryName + ", attempting load again.");
                                f4649e = f4649e + 1;
                                z = true;
                            }
                            f4647c.writeLock().unlock();
                            if (f4649e == i3) {
                                throw e2;
                            }
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        } catch (Throwable th) {
                            f4647c.writeLock().unlock();
                            throw th;
                        }
                    }
                } while (z);
                return z3;
            }
            nVar.a(str);
            return true;
        } catch (Throwable th2) {
            f4647c.readLock().unlock();
            throw th2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r1 != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        monitor-enter(e.f.a.l.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (e.f.a.l.f4652h.contains(r8) == false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r10 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004b, code lost:
        monitor-exit(e.f.a.l.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        monitor-exit(e.f.a.l.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        if (r1 != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        android.util.Log.d("SoLoader", "About to load: " + r8);
        a(r8, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        monitor-enter(e.f.a.l.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        android.util.Log.d("SoLoader", "Loaded: " + r8);
        e.f.a.l.f4652h.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        monitor-exit(e.f.a.l.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008c, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        r9 = r8.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        if (r9 == null) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00aa, code lost:
        throw new e.f.a.l.b(r8, r9.substring(r9.lastIndexOf("unexpected e_machine:")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ab, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b1, code lost:
        if ((r11 & 16) != 0) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b7, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bf, code lost:
        if (e.f.a.l.j.contains(r9) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c1, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c2, code lost:
        if (r10 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c4, code lost:
        if (r2 != false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c8, code lost:
        if (e.f.a.l.f4646a == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00ca, code lost:
        e.c.a.b.l.f.a("MergedSoMapping.invokeJniOnload[", r9, "]");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        android.util.Log.d("SoLoader", "About to merge: " + r9 + " / " + r8);
        e.f.a.g.a(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f2, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00f4, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f6, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011a, code lost:
        throw new java.lang.RuntimeException("Failed to call JNI_OnLoad from '" + r9 + "', which has been merged into '" + r8 + "'.  See comment for details.", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x011d, code lost:
        if (e.f.a.l.f4646a != false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x011f, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0122, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0123, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0126, code lost:
        return !r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, android.os.StrictMode.ThreadPolicy r12) {
        /*
        // Method dump skipped, instructions count: 301
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.l.a(java.lang.String, java.lang.String, java.lang.String, int, android.os.StrictMode$ThreadPolicy):boolean");
    }
}
