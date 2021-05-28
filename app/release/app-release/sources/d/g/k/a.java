package d.g.k;

import android.util.Log;
import java.io.Writer;

public class a extends Writer {

    /* renamed from: c  reason: collision with root package name */
    public final String f3326c;

    /* renamed from: d  reason: collision with root package name */
    public StringBuilder f3327d = new StringBuilder(128);

    public a(String str) {
        this.f3326c = str;
    }

    public final void a() {
        if (this.f3327d.length() > 0) {
            Log.d(this.f3326c, this.f3327d.toString());
            StringBuilder sb = this.f3327d;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f3327d.append(c2);
            }
        }
    }
}
