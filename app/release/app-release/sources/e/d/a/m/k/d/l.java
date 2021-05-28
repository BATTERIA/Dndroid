package e.d.a.m.k.d;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class l {
    public static final byte[] b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4103c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a  reason: collision with root package name */
    public final b f4104a;

    public enum a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        

        /* renamed from: c  reason: collision with root package name */
        public final boolean f4110c;

        /* access modifiers changed from: public */
        a(boolean z) {
            this.f4110c = z;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f4111a;

        public b(InputStream inputStream) {
            this.f4111a = inputStream;
        }

        public int a() {
            return ((this.f4111a.read() << 8) & 65280) | (this.f4111a.read() & 255);
        }

        public long a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f4111a.skip(j2);
                if (skip <= 0) {
                    if (this.f4111a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        b = bArr;
    }

    public l(InputStream inputStream) {
        this.f4104a = new b(inputStream);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        r0 = r10.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d8, code lost:
        android.util.Log.d("ImageHeaderParser", r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a() {
        /*
        // Method dump skipped, instructions count: 543
        */
        throw new UnsupportedOperationException("Method not decompiled: e.d.a.m.k.d.l.a():int");
    }

    public a b() {
        int a2 = this.f4104a.a();
        if (a2 == 65496) {
            return a.JPEG;
        }
        int a3 = ((a2 << 16) & -65536) | (this.f4104a.a() & 65535);
        if (a3 != -1991225785) {
            return (a3 >> 8) == 4671814 ? a.GIF : a.UNKNOWN;
        }
        this.f4104a.a(21);
        return this.f4104a.f4111a.read() >= 3 ? a.PNG_A : a.PNG;
    }
}
