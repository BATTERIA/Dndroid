package e.d.a.s;

import e.a.a.a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class b extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public final long f4268c;

    /* renamed from: d  reason: collision with root package name */
    public int f4269d;

    public b(InputStream inputStream, long j) {
        super(inputStream);
        this.f4268c = j;
    }

    public final int a(int i) {
        if (i >= 0) {
            this.f4269d += i;
        } else if (this.f4268c - ((long) this.f4269d) > 0) {
            StringBuilder a2 = a.a("Failed to read all expected data, expected: ");
            a2.append(this.f4268c);
            a2.append(", but read: ");
            a2.append(this.f4269d);
            throw new IOException(a2.toString());
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f4268c - ((long) this.f4269d), (long) ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        a(read);
        return read;
    }
}
