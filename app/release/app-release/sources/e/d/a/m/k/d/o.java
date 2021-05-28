package e.d.a.m.k.d;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class o extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public volatile byte[] f4117c;

    /* renamed from: d  reason: collision with root package name */
    public int f4118d;

    /* renamed from: e  reason: collision with root package name */
    public int f4119e;

    /* renamed from: f  reason: collision with root package name */
    public int f4120f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f4121g;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public o(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f4117c = bArr;
    }

    public static IOException k() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f4120f;
        if (i2 == -1 || this.f4121g - i2 >= (i = this.f4119e)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f4120f = -1;
                this.f4121g = 0;
                this.f4118d = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f4118d == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            if (Log.isLoggable("BufferedIs", 3)) {
                Log.d("BufferedIs", "allocate buffer of length: " + i);
            }
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f4117c = bArr2;
            bArr = bArr2;
        } else {
            int i3 = this.f4120f;
            if (i3 > 0) {
                System.arraycopy(bArr, i3, bArr, 0, bArr.length - i3);
            }
        }
        int i4 = this.f4121g - this.f4120f;
        this.f4121g = i4;
        this.f4120f = 0;
        this.f4118d = 0;
        int read2 = inputStream.read(bArr, i4, bArr.length - i4);
        int i5 = this.f4121g;
        if (read2 > 0) {
            i5 += read2;
        }
        this.f4118d = i5;
        return read2;
    }

    public synchronized void a() {
        this.f4119e = this.f4117c.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f4117c == null || inputStream == null) {
            k();
            throw null;
        }
        return (this.f4118d - this.f4121g) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f4117c = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f4119e = Math.max(this.f4119e, i);
        this.f4120f = this.f4121g;
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f4117c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            k();
            throw null;
        } else if (this.f4121g >= this.f4118d && a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr != this.f4117c && (bArr = this.f4117c) == null) {
                k();
                throw null;
            } else if (this.f4118d - this.f4121g <= 0) {
                return -1;
            } else {
                int i = this.f4121g;
                this.f4121g = i + 1;
                return bArr[i] & 255;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f4117c;
        if (bArr2 == null) {
            k();
            throw null;
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                if (this.f4121g < this.f4118d) {
                    int i5 = this.f4118d - this.f4121g >= i2 ? i2 : this.f4118d - this.f4121g;
                    System.arraycopy(bArr2, this.f4121g, bArr, i, i5);
                    this.f4121g += i5;
                    if (i5 == i2 || inputStream.available() == 0) {
                        return i5;
                    }
                    i += i5;
                    i3 = i2 - i5;
                } else {
                    i3 = i2;
                }
                while (true) {
                    int i6 = -1;
                    if (this.f4120f == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i6 = i2 - i3;
                            }
                            return i6;
                        }
                    } else if (a(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i6 = i2 - i3;
                        }
                        return i6;
                    } else if (bArr2 == this.f4117c || (bArr2 = this.f4117c) != null) {
                        i4 = this.f4118d - this.f4121g >= i3 ? i3 : this.f4118d - this.f4121g;
                        System.arraycopy(bArr2, this.f4121g, bArr, i, i4);
                        this.f4121g += i4;
                    } else {
                        k();
                        throw null;
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                k();
                throw null;
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f4117c == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f4120f) {
            this.f4121g = this.f4120f;
        } else {
            throw new a("Mark has been invalidated");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        byte[] bArr = this.f4117c;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null) {
            k();
            throw null;
        } else if (j < 1) {
            return 0;
        } else {
            if (inputStream == null) {
                k();
                throw null;
            } else if (((long) (this.f4118d - this.f4121g)) >= j) {
                this.f4121g = (int) (((long) this.f4121g) + j);
                return j;
            } else {
                long j2 = (long) (this.f4118d - this.f4121g);
                this.f4121g = this.f4118d;
                if (this.f4120f == -1 || j > ((long) this.f4119e)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    long j3 = j - j2;
                    if (((long) (this.f4118d - this.f4121g)) >= j3) {
                        this.f4121g = (int) (((long) this.f4121g) + j3);
                        return j;
                    }
                    long j4 = (j2 + ((long) this.f4118d)) - ((long) this.f4121g);
                    this.f4121g = this.f4118d;
                    return j4;
                }
            }
        }
    }
}
