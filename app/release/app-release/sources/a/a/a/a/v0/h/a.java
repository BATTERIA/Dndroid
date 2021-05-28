package a.a.a.a.v0.h;

import a.a.a.a.v0.h.q;
import java.io.FilterInputStream;
import java.io.InputStream;

public abstract class a implements q {

    /* renamed from: a.a.a.a.v0.h.a$a  reason: collision with other inner class name */
    public static abstract class AbstractC0055a<BuilderType extends AbstractC0055a> implements q.a {

        /* renamed from: a.a.a.a.v0.h.a$a$a  reason: collision with other inner class name */
        public static final class C0056a extends FilterInputStream {

            /* renamed from: c  reason: collision with root package name */
            public int f1360c;

            public C0056a(InputStream inputStream, int i) {
                super(inputStream);
                this.f1360c = i;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int available() {
                return Math.min(super.available(), this.f1360c);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read() {
                if (this.f1360c <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f1360c--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                int i3 = this.f1360c;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f1360c -= read;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public long skip(long j) {
                long skip = super.skip(Math.min(j, (long) this.f1360c));
                if (skip >= 0) {
                    this.f1360c = (int) (((long) this.f1360c) - skip);
                }
                return skip;
            }
        }

        @Override // a.a.a.a.v0.h.q.a
        public abstract BuilderType a(e eVar, g gVar);
    }
}
