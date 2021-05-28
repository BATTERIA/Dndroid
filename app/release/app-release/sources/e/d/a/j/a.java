package e.d.a.j;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final File f3872c;

    /* renamed from: d  reason: collision with root package name */
    public final File f3873d;

    /* renamed from: e  reason: collision with root package name */
    public final File f3874e;

    /* renamed from: f  reason: collision with root package name */
    public final File f3875f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3876g;

    /* renamed from: h  reason: collision with root package name */
    public long f3877h;
    public final int i;
    public long j = 0;
    public Writer k;
    public final LinkedHashMap<String, c> l = new LinkedHashMap<>(0, 0.75f, true);
    public int m;
    public long n = 0;
    public final ThreadPoolExecutor o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable<Void> p = new CallableC0118a();

    /* renamed from: e.d.a.j.a$a  reason: collision with other inner class name */
    public class CallableC0118a implements Callable<Void> {
        public CallableC0118a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (a.this) {
                if (a.this.k == null) {
                    return null;
                }
                a.this.o();
                if (a.this.k()) {
                    a.this.n();
                    a.this.m = 0;
                }
                return null;
            }
        }
    }

    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final c f3879a;
        public final boolean[] b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3880c;

        public /* synthetic */ b(c cVar, CallableC0118a aVar) {
            boolean[] zArr;
            this.f3879a = cVar;
            if (cVar.f3885e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.i];
            }
            this.b = zArr;
        }

        public void a() {
            a.this.a(this, false);
        }

        public File a(int i) {
            File file;
            synchronized (a.this) {
                if (this.f3879a.f3886f == this) {
                    if (!this.f3879a.f3885e) {
                        this.b[i] = true;
                    }
                    file = this.f3879a.f3884d[i];
                    if (!a.this.f3872c.exists()) {
                        a.this.f3872c.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f3882a;
        public final long[] b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f3883c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f3884d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3885e;

        /* renamed from: f  reason: collision with root package name */
        public b f3886f;

        /* renamed from: g  reason: collision with root package name */
        public long f3887g;

        public /* synthetic */ c(String str, CallableC0118a aVar) {
            this.f3882a = str;
            int i = a.this.i;
            this.b = new long[i];
            this.f3883c = new File[i];
            this.f3884d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < a.this.i; i2++) {
                sb.append(i2);
                this.f3883c[i2] = new File(a.this.f3872c, sb.toString());
                sb.append(".tmp");
                this.f3884d[i2] = new File(a.this.f3872c, sb.toString());
                sb.setLength(length);
            }
        }

        public final IOException a(String[] strArr) {
            StringBuilder a2 = e.a.a.a.a.a("unexpected journal line: ");
            a2.append(Arrays.toString(strArr));
            throw new IOException(a2.toString());
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            long[] jArr = this.b;
            for (long j : jArr) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f3889a;

        public /* synthetic */ d(a aVar, String str, long j, File[] fileArr, long[] jArr, CallableC0118a aVar2) {
            this.f3889a = fileArr;
        }
    }

    public a(File file, int i2, int i3, long j2) {
        this.f3872c = file;
        this.f3876g = i2;
        this.f3873d = new File(file, "journal");
        this.f3874e = new File(file, "journal.tmp");
        this.f3875f = new File(file, "journal.bkp");
        this.i = i3;
        this.f3877h = j2;
    }

    public static void a(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void a(File file, File file2, boolean z) {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void a() {
        if (this.k == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void a(b bVar, boolean z) {
        c cVar = bVar.f3879a;
        if (cVar.f3886f == bVar) {
            if (z && !cVar.f3885e) {
                for (int i2 = 0; i2 < this.i; i2++) {
                    if (!bVar.b[i2]) {
                        bVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    } else if (!cVar.f3884d[i2].exists()) {
                        bVar.a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < this.i; i3++) {
                File file = cVar.f3884d[i3];
                if (!z) {
                    a(file);
                } else if (file.exists()) {
                    File file2 = cVar.f3883c[i3];
                    file.renameTo(file2);
                    long j2 = cVar.b[i3];
                    long length = file2.length();
                    cVar.b[i3] = length;
                    this.j = (this.j - j2) + length;
                }
            }
            this.m++;
            cVar.f3886f = null;
            if (cVar.f3885e || z) {
                cVar.f3885e = true;
                this.k.append((CharSequence) "CLEAN");
                this.k.append(' ');
                this.k.append((CharSequence) cVar.f3882a);
                this.k.append((CharSequence) cVar.a());
                this.k.append('\n');
                if (z) {
                    long j3 = this.n;
                    this.n = 1 + j3;
                    cVar.f3887g = j3;
                }
            } else {
                this.l.remove(cVar.f3882a);
                this.k.append((CharSequence) "REMOVE");
                this.k.append(' ');
                this.k.append((CharSequence) cVar.f3882a);
                this.k.append('\n');
            }
            this.k.flush();
            if (this.j > this.f3877h || k()) {
                this.o.submit(this.p);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized d b(String str) {
        a();
        c cVar = this.l.get(str);
        if (cVar == null) {
            return null;
        }
        if (!cVar.f3885e) {
            return null;
        }
        for (File file : cVar.f3883c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.m++;
        this.k.append((CharSequence) "READ");
        this.k.append(' ');
        this.k.append((CharSequence) str);
        this.k.append('\n');
        if (k()) {
            this.o.submit(this.p);
        }
        return new d(this, str, cVar.f3887g, cVar.f3883c, cVar.b, null);
    }

    public final void c(String str) {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i2 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i2);
            if (indexOf2 == -1) {
                str2 = str.substring(i2);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.l.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i2, indexOf2);
            }
            c cVar = this.l.get(str2);
            if (cVar == null) {
                cVar = new c(str2, null);
                this.l.put(str2, cVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                cVar.f3885e = true;
                cVar.f3886f = null;
                if (split.length == a.this.i) {
                    for (int i3 = 0; i3 < split.length; i3++) {
                        try {
                            cVar.b[i3] = Long.parseLong(split[i3]);
                        } catch (NumberFormatException unused) {
                            cVar.a(split);
                            throw null;
                        }
                    }
                    return;
                }
                cVar.a(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                cVar.f3886f = new b(cVar, null);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(e.a.a.a.a.b("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(e.a.a.a.a.b("unexpected journal line: ", str));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.k != null) {
            Iterator it = new ArrayList(this.l.values()).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f3886f != null) {
                    cVar.f3886f.a();
                }
            }
            o();
            this.k.close();
            this.k = null;
        }
    }

    public synchronized boolean d(String str) {
        a();
        c cVar = this.l.get(str);
        if (cVar != null) {
            if (cVar.f3886f == null) {
                for (int i2 = 0; i2 < this.i; i2++) {
                    File file = cVar.f3883c[i2];
                    if (file.exists()) {
                        if (!file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                    }
                    this.j -= cVar.b[i2];
                    cVar.b[i2] = 0;
                }
                this.m++;
                this.k.append((CharSequence) "REMOVE");
                this.k.append(' ');
                this.k.append((CharSequence) str);
                this.k.append('\n');
                this.l.remove(str);
                if (k()) {
                    this.o.submit(this.p);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean k() {
        int i2 = this.m;
        return i2 >= 2000 && i2 >= this.l.size();
    }

    public final void l() {
        a(this.f3874e);
        Iterator<c> it = this.l.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            int i2 = 0;
            if (next.f3886f == null) {
                while (i2 < this.i) {
                    this.j += next.b[i2];
                    i2++;
                }
            } else {
                next.f3886f = null;
                while (i2 < this.i) {
                    a(next.f3883c[i2]);
                    a(next.f3884d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void m() {
        b bVar = new b(new FileInputStream(this.f3873d), c.f3896a);
        try {
            String k2 = bVar.k();
            String k3 = bVar.k();
            String k4 = bVar.k();
            String k5 = bVar.k();
            String k6 = bVar.k();
            if (!"libcore.io.DiskLruCache".equals(k2) || !"1".equals(k3) || !Integer.toString(this.f3876g).equals(k4) || !Integer.toString(this.i).equals(k5) || !"".equals(k6)) {
                throw new IOException("unexpected journal header: [" + k2 + ", " + k3 + ", " + k5 + ", " + k6 + "]");
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                try {
                    c(bVar.k());
                    i2++;
                } catch (EOFException unused) {
                    this.m = i2 - this.l.size();
                    if (bVar.f3894g == -1) {
                        z = true;
                    }
                    if (z) {
                        n();
                    } else {
                        this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3873d, true), c.f3896a));
                    }
                    try {
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } finally {
            try {
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
        }
    }

    public final synchronized void n() {
        if (this.k != null) {
            this.k.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3874e), c.f3896a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3876g));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.i));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (c cVar : this.l.values()) {
                bufferedWriter.write(cVar.f3886f != null ? "DIRTY " + cVar.f3882a + '\n' : "CLEAN " + cVar.f3882a + cVar.a() + '\n');
            }
            bufferedWriter.close();
            if (this.f3873d.exists()) {
                a(this.f3873d, this.f3875f, true);
            }
            a(this.f3874e, this.f3873d, false);
            this.f3875f.delete();
            this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3873d, true), c.f3896a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    public final void o() {
        while (this.j > this.f3877h) {
            d(this.l.entrySet().iterator().next().getKey());
        }
    }

    public final synchronized b a(String str, long j2) {
        a();
        c cVar = this.l.get(str);
        if (j2 != -1 && (cVar == null || cVar.f3887g != j2)) {
            return null;
        }
        if (cVar == null) {
            cVar = new c(str, null);
            this.l.put(str, cVar);
        } else if (cVar.f3886f != null) {
            return null;
        }
        b bVar = new b(cVar, null);
        cVar.f3886f = bVar;
        this.k.append((CharSequence) "DIRTY");
        this.k.append(' ');
        this.k.append((CharSequence) str);
        this.k.append('\n');
        this.k.flush();
        return bVar;
    }

    public static a a(File file, int i2, int i3, long j2) {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i3 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    a(file2, file3, false);
                }
            }
            a aVar = new a(file, i2, i3, j2);
            if (aVar.f3873d.exists()) {
                try {
                    aVar.m();
                    aVar.l();
                    return aVar;
                } catch (IOException e2) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f3872c);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, i2, i3, j2);
            aVar2.n();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }
}
