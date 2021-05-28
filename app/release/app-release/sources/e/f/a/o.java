package e.f.a;

import android.content.Context;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;

public abstract class o extends c {

    /* renamed from: c  reason: collision with root package name */
    public final Context f4657c;

    /* renamed from: d  reason: collision with root package name */
    public String f4658d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, Object> f4659e = new HashMap();

    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ File f4660c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ byte[] f4661d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f4662e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ File f4663f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f f4664g;

        public a(File file, byte[] bArr, c cVar, File file2, f fVar) {
            this.f4660c = file;
            this.f4661d = bArr;
            this.f4662e = cVar;
            this.f4663f = file2;
            this.f4664g = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            r5.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
            r2.addSuppressed(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
            throw r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009a, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
            r2.addSuppressed(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
            throw r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 204
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.a.o.a.run():void");
        }
    }

    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public final String f4666c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4667d;

        public b(String str, String str2) {
            this.f4666c = str;
            this.f4667d = str2;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f4668a;

        public c(b[] bVarArr) {
            this.f4668a = bVarArr;
        }

        public static final c a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    b[] bVarArr = new b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }
    }

    public static final class d implements Closeable {

        /* renamed from: c  reason: collision with root package name */
        public final b f4669c;

        /* renamed from: d  reason: collision with root package name */
        public final InputStream f4670d;

        public d(b bVar, InputStream inputStream) {
            this.f4669c = bVar;
            this.f4670d = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f4670d.close();
        }
    }

    public static abstract class e implements Closeable {
        public abstract boolean a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract d k();
    }

    public static abstract class f implements Closeable {
        public abstract c a();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        public abstract e k();
    }

    public o(Context context, String str) {
        super(new File(context.getApplicationInfo().dataDir + "/" + str), 1);
        this.f4657c = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r3.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r4 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r3, byte r4) {
        /*
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "rw"
            r0.<init>(r3, r1)
            r1 = 0
            r0.seek(r1)     // Catch:{ all -> 0x0021 }
            r0.write(r4)     // Catch:{ all -> 0x0021 }
            long r3 = r0.getFilePointer()     // Catch:{ all -> 0x0021 }
            r0.setLength(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ all -> 0x0021 }
            r3.sync()     // Catch:{ all -> 0x0021 }
            r0.close()
            return
        L_0x0021:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r4 = move-exception
            r0.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r3.addSuppressed(r0)
        L_0x002c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.o.a(java.io.File, byte):void");
    }

    @Override // e.f.a.m, e.f.a.c
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int a2;
        synchronized (a(str)) {
            a2 = a(str, i, this.f4622a, threadPolicy);
        }
        return a2;
    }

    public final Object a(String str) {
        Object obj;
        synchronized (this.f4659e) {
            obj = this.f4659e.get(str);
            if (obj == null) {
                obj = new Object();
                this.f4659e.put(str, obj);
            }
        }
        return obj;
    }

    public final void a(d dVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        StringBuilder a2 = e.a.a.a.a.a("extracting DSO ");
        a2.append(dVar.f4669c.f4666c);
        Log.i("fb-UnpackingSoSource", a2.toString());
        if (this.f4622a.setWritable(true, true)) {
            File file = new File(this.f4622a, dVar.f4669c.f4666c);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException e2) {
                Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e2);
                g.a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                int available = dVar.f4670d.available();
                if (available > 1) {
                    g.a(randomAccessFile.getFD(), (long) available);
                }
                InputStream inputStream = dVar.f4670d;
                int i = 0;
                while (i < Integer.MAX_VALUE) {
                    int read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i));
                    if (read == -1) {
                        break;
                    }
                    randomAccessFile.write(bArr, 0, read);
                    i += read;
                }
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    randomAccessFile.close();
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e3) {
                g.a(file);
                throw e3;
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        } else {
            StringBuilder a3 = e.a.a.a.a.a("cannot make directory writable for us: ");
            a3.append(this.f4622a);
            throw new IOException(a3.toString());
        }
    }

    public final void a(b[] bVarArr) {
        String[] list = this.f4622a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    boolean z = false;
                    int i = 0;
                    while (!z && i < bVarArr.length) {
                        if (bVarArr[i].f4666c.equals(str)) {
                            z = true;
                        }
                        i++;
                    }
                    if (!z) {
                        File file = new File(this.f4622a, str);
                        Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                        g.a(file);
                    }
                }
            }
            return;
        }
        StringBuilder a2 = e.a.a.a.a.a("unable to list directory ");
        a2.append(this.f4622a);
        throw new IOException(a2.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r0 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00db, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00de, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e1, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e7, code lost:
        r12.addSuppressed(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00eb, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(e.f.a.f r12, int r13, byte[] r14) {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.o.a(e.f.a.f, int, byte[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r0.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a() {
        /*
            r5 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            e.f.a.o$f r1 = r5.b()
            e.f.a.o$c r2 = r1.a()     // Catch:{ all -> 0x0036 }
            e.f.a.o$b[] r2 = r2.f4668a     // Catch:{ all -> 0x0036 }
            r3 = 1
            r0.writeByte(r3)     // Catch:{ all -> 0x0036 }
            int r3 = r2.length     // Catch:{ all -> 0x0036 }
            r0.writeInt(r3)     // Catch:{ all -> 0x0036 }
            r3 = 0
        L_0x0017:
            int r4 = r2.length     // Catch:{ all -> 0x0036 }
            if (r3 >= r4) goto L_0x002b
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f4666c     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            r4 = r2[r3]     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r4.f4667d     // Catch:{ all -> 0x0036 }
            r0.writeString(r4)     // Catch:{ all -> 0x0036 }
            int r3 = r3 + 1
            goto L_0x0017
        L_0x002b:
            r1.close()
            byte[] r1 = r0.marshall()
            r0.recycle()
            return r1
        L_0x0036:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r2 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0043:
            goto L_0x0045
        L_0x0044:
            throw r2
        L_0x0045:
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.o.a():byte[]");
    }

    public abstract f b();

    public synchronized void b(String str) {
        synchronized (a(str)) {
            this.f4658d = str;
            a(2);
        }
    }

    @Override // e.f.a.m
    public void a(int i) {
        File file = this.f4622a;
        if (file.mkdirs() || file.isDirectory()) {
            f fVar = new f(new File(this.f4622a, "dso_lock"));
            try {
                Log.v("fb-UnpackingSoSource", "locked dso store " + this.f4622a);
                if (a(fVar, i, a())) {
                    fVar = null;
                } else {
                    Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f4622a);
                }
                StringBuilder sb = new StringBuilder();
                if (fVar != null) {
                    sb.append("releasing dso store lock for ");
                    sb.append(this.f4622a);
                    Log.v("fb-UnpackingSoSource", sb.toString());
                    fVar.close();
                    return;
                }
                sb.append("not releasing dso store lock for ");
                sb.append(this.f4622a);
                sb.append(" (syncer thread started)");
                Log.v("fb-UnpackingSoSource", sb.toString());
            } catch (Throwable th) {
                StringBuilder a2 = e.a.a.a.a.a("releasing dso store lock for ");
                a2.append(this.f4622a);
                Log.v("fb-UnpackingSoSource", a2.toString());
                fVar.close();
                throw th;
            }
        } else {
            throw new IOException("cannot mkdir: " + file);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        r8.addSuppressed(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        throw r9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f A[Catch:{ all -> 0x00c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0056 A[Catch:{ all -> 0x00c7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte r8, e.f.a.o.c r9, e.f.a.o.e r10) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.o.a(byte, e.f.a.o$c, e.f.a.o$e):void");
    }
}
