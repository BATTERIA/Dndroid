package e.d.a.s;

import android.util.Log;
import java.util.Queue;

public final class a {
    public static final a b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Queue<byte[]> f4267a = h.a(0);

    public boolean a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.f4267a) {
            if (this.f4267a.size() < 32) {
                z = true;
                this.f4267a.offer(bArr);
            }
        }
        return z;
    }

    public byte[] a() {
        byte[] poll;
        synchronized (this.f4267a) {
            poll = this.f4267a.poll();
        }
        if (poll == null) {
            poll = new byte[65536];
            if (Log.isLoggable("ByteArrayPool", 3)) {
                Log.d("ByteArrayPool", "Created temp bytes");
            }
        }
        return poll;
    }
}
