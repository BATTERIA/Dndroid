package e.d.a.j;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class b implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final InputStream f3890c;

    /* renamed from: d  reason: collision with root package name */
    public final Charset f3891d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f3892e;

    /* renamed from: f  reason: collision with root package name */
    public int f3893f;

    /* renamed from: g  reason: collision with root package name */
    public int f3894g;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + -1] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, b.this.f3891d.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (charset.equals(c.f3896a)) {
            this.f3890c = inputStream;
            this.f3891d = charset;
            this.f3892e = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void a() {
        InputStream inputStream = this.f3890c;
        byte[] bArr = this.f3892e;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f3893f = 0;
            this.f3894g = read;
            return;
        }
        throw new EOFException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f3890c) {
            if (this.f3892e != null) {
                this.f3892e = null;
                this.f3890c.close();
            }
        }
    }

    public String k() {
        int i;
        int i2;
        synchronized (this.f3890c) {
            if (this.f3892e != null) {
                if (this.f3893f >= this.f3894g) {
                    a();
                }
                for (int i3 = this.f3893f; i3 != this.f3894g; i3++) {
                    if (this.f3892e[i3] == 10) {
                        if (i3 != this.f3893f) {
                            i2 = i3 - 1;
                            if (this.f3892e[i2] == 13) {
                                String str = new String(this.f3892e, this.f3893f, i2 - this.f3893f, this.f3891d.name());
                                this.f3893f = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f3892e, this.f3893f, i2 - this.f3893f, this.f3891d.name());
                        this.f3893f = i3 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f3894g - this.f3893f) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f3892e, this.f3893f, this.f3894g - this.f3893f);
                    this.f3894g = -1;
                    a();
                    i = this.f3893f;
                    while (true) {
                        if (i != this.f3894g) {
                            if (this.f3892e[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f3893f) {
                    aVar.write(this.f3892e, this.f3893f, i - this.f3893f);
                }
                this.f3893f = i + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
