package e.d.a.m.j;

import android.util.Log;
import e.d.a.m.b;
import e.d.a.s.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class n implements b<InputStream> {
    @Override // e.d.a.m.b
    public String a() {
        return "";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.io.OutputStream] */
    @Override // e.d.a.m.b
    public boolean a(InputStream inputStream, OutputStream outputStream) {
        boolean z;
        InputStream inputStream2 = inputStream;
        byte[] a2 = a.b.a();
        while (true) {
            z = false;
            try {
                int read = inputStream2.read(a2);
                if (read == -1) {
                    break;
                }
                outputStream.write(a2, 0, read);
            } catch (IOException e2) {
                if (Log.isLoggable("StreamEncoder", 3)) {
                    Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e2);
                }
            } catch (Throwable th) {
                a.b.a(a2);
                throw th;
            }
        }
        z = true;
        a.b.a(a2);
        return z;
    }
}
