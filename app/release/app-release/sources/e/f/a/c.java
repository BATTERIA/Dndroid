package e.f.a;

import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import e.a.a.a.a;
import e.c.a.b.l;
import e.f.a.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class c extends m {

    /* renamed from: a  reason: collision with root package name */
    public final File f4622a;
    public final int b;

    public c(File file, int i) {
        this.f4622a = file;
        this.b = i;
    }

    @Override // e.f.a.m
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return a(str, i, this.f4622a, threadPolicy);
    }

    /* JADX INFO: finally extract failed */
    public int a(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            StringBuilder a2 = a.a(str, " not found on ");
            a2.append(file.getCanonicalPath());
            Log.d("SoLoader", a2.toString());
            return 0;
        }
        StringBuilder a3 = a.a(str, " found on ");
        a3.append(file.getCanonicalPath());
        Log.d("SoLoader", a3.toString());
        if ((i & 1) == 0 || (this.b & 2) == 0) {
            if ((this.b & 1) != 0) {
                if (l.f4646a) {
                    l.f.a("SoLoader.getElfDependencies[", file2.getName(), "]");
                }
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        String[] a4 = g.a(fileInputStream.getChannel());
                        fileInputStream.close();
                        StringBuilder a5 = a.a("Loading lib dependencies: ");
                        a5.append(Arrays.toString(a4));
                        Log.d("SoLoader", a5.toString());
                        for (String str2 : a4) {
                            if (!str2.startsWith("/")) {
                                l.a(str2, null, null, i | 1, threadPolicy);
                            }
                        }
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                } finally {
                    if (l.f4646a) {
                        Trace.endSection();
                    }
                }
            } else {
                Log.d("SoLoader", "Not resolving dependencies for " + str);
            }
            try {
                ((l.a) l.b).a(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e2) {
                if (e2.getMessage().contains("bad ELF magic")) {
                    Log.d("SoLoader", "Corrupted lib file detected");
                    return 3;
                }
                throw e2;
            }
        } else {
            Log.d("SoLoader", str + " loaded implicitly");
            return 2;
        }
    }

    @Override // e.f.a.m
    public String toString() {
        String str;
        try {
            str = String.valueOf(this.f4622a.getCanonicalPath());
        } catch (IOException unused) {
            str = this.f4622a.getName();
        }
        return getClass().getName() + "[root = " + str + " flags = " + this.b + ']';
    }
}
