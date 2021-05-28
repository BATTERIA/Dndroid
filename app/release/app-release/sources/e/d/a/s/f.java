package e.d.a.s;

import java.io.FilterInputStream;
import java.io.InputStream;

public class f extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public int f4276c = Integer.MIN_VALUE;

    public f(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.f4276c;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long f(long j) {
        int i = this.f4276c;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    public final void g(long j) {
        int i = this.f4276c;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f4276c = (int) (((long) i) - j);
        }
    }

    public void mark(int i) {
        super.mark(i);
        this.f4276c = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (f(1) == -1) {
            return -1;
        }
        int read = super.read();
        g(1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int f2 = (int) f((long) i2);
        if (f2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, f2);
        g((long) read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        this.f4276c = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long f2 = f(j);
        if (f2 == -1) {
            return -1;
        }
        long skip = super.skip(f2);
        g(skip);
        return skip;
    }
}
