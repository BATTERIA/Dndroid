package e.f.a;

import android.content.Context;
import android.util.Log;
import e.f.a.e;
import e.f.a.o;
import java.io.File;
import java.util.zip.ZipEntry;

public class a extends e {

    /* renamed from: h  reason: collision with root package name */
    public final int f4617h;

    /* renamed from: e.f.a.a$a  reason: collision with other inner class name */
    public class C0139a extends e.c {

        /* renamed from: g  reason: collision with root package name */
        public File f4618g;

        /* renamed from: h  reason: collision with root package name */
        public final int f4619h;

        public C0139a(e eVar) {
            super(eVar);
            this.f4618g = new File(a.this.f4657c.getApplicationInfo().nativeLibraryDir);
            this.f4619h = a.this.f4617h;
        }

        @Override // e.f.a.e.c
        public boolean a(ZipEntry zipEntry, String str) {
            String str2;
            String name = zipEntry.getName();
            boolean z = false;
            if (str.equals(a.this.f4658d)) {
                a.this.f4658d = null;
                str2 = String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.f4619h & 1) == 0) {
                str2 = e.a.a.a.a.a("allowing consideration of ", name, ": self-extraction preferred");
            } else {
                File file = new File(this.f4618g, str);
                if (!file.isFile()) {
                    str2 = String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length != size) {
                        str2 = String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                    } else {
                        str2 = e.a.a.a.a.a("not allowing consideration of ", name, ": deferring to libdir");
                        Log.d("ApkSoSource", str2);
                        return z;
                    }
                }
            }
            z = true;
            Log.d("ApkSoSource", str2);
            return z;
        }
    }

    public a(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f4617h = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045  */
    @Override // e.f.a.o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a() {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.a.a.a():byte[]");
    }

    @Override // e.f.a.o
    public o.f b() {
        return new C0139a(this);
    }
}
