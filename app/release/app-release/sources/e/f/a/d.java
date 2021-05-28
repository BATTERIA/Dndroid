package e.f.a;

import android.content.Context;
import e.f.a.o;
import java.io.File;
import java.io.FileInputStream;

public final class d extends o {

    public final class b extends o.f {

        /* renamed from: c  reason: collision with root package name */
        public final c[] f4623c;

        public final class a extends o.e {

            /* renamed from: c  reason: collision with root package name */
            public int f4624c;

            public /* synthetic */ a(a aVar) {
            }

            @Override // e.f.a.o.e
            public boolean a() {
                return this.f4624c < b.this.f4623c.length;
            }

            @Override // e.f.a.o.e
            public o.d k() {
                c[] cVarArr = b.this.f4623c;
                int i = this.f4624c;
                this.f4624c = i + 1;
                c cVar = cVarArr[i];
                FileInputStream fileInputStream = new FileInputStream(cVar.f4626e);
                try {
                    return new o.d(cVar, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r7.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ed, code lost:
            r0.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f1, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f5, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
            r0.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0100, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(e.f.a.d r17, e.f.a.o r18) {
            /*
            // Method dump skipped, instructions count: 294
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.a.d.b.<init>(e.f.a.d, e.f.a.o):void");
        }

        @Override // e.f.a.o.f
        public o.c a() {
            return new o.c(this.f4623c);
        }

        @Override // e.f.a.o.f
        public o.e k() {
            return new a(null);
        }
    }

    public static final class c extends o.b {

        /* renamed from: e  reason: collision with root package name */
        public final File f4626e;

        public c(String str, String str2, File file) {
            super(str, str2);
            this.f4626e = file;
        }
    }

    public d(Context context, String str) {
        super(context, str);
    }

    @Override // e.f.a.o
    public o.f b() {
        return new b(this, this);
    }
}
