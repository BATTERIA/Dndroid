package e.d.a.s;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class c extends InputStream {

    /* renamed from: e  reason: collision with root package name */
    public static final Queue<c> f4270e = h.a(0);

    /* renamed from: c  reason: collision with root package name */
    public InputStream f4271c;

    /* renamed from: d  reason: collision with root package name */
    public IOException f4272d;

    public static c a(InputStream inputStream) {
        c poll;
        synchronized (f4270e) {
            poll = f4270e.poll();
        }
        if (poll == null) {
            poll = new c();
        }
        poll.f4271c = inputStream;
        return poll;
    }

    public void a() {
        this.f4272d = null;
        this.f4271c = null;
        synchronized (f4270e) {
            f4270e.offer(this);
        }
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f4271c.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f4271c.close();
    }

    public void mark(int i) {
        this.f4271c.mark(i);
    }

    public boolean markSupported() {
        return this.f4271c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f4271c.read();
        } catch (IOException e2) {
            this.f4272d = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f4271c.read(bArr);
        } catch (IOException e2) {
            this.f4272d = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f4271c.read(bArr, i, i2);
        } catch (IOException e2) {
            this.f4272d = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f4271c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f4271c.skip(j);
        } catch (IOException e2) {
            this.f4272d = e2;
            return 0;
        }
    }
}
