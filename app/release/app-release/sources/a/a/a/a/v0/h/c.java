package a.a.a.a.v0.h;

import a.a.a.a.v0.h.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class c extends p {

    /* renamed from: f  reason: collision with root package name */
    public final int f1361f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1362g;

    public class b implements d.a {

        /* renamed from: c  reason: collision with root package name */
        public int f1363c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1364d;

        public /* synthetic */ b(a aVar) {
            int i = c.this.f1361f;
            this.f1363c = i;
            this.f1364d = i + c.this.f1362g;
        }

        public boolean hasNext() {
            return this.f1363c < this.f1364d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // a.a.a.a.v0.h.d.a
        public byte nextByte() {
            int i = this.f1363c;
            if (i < this.f1364d) {
                byte[] bArr = c.this.f1414d;
                this.f1363c = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (((long) i) + ((long) i2) <= ((long) bArr.length)) {
            this.f1361f = i;
            this.f1362g = i2;
        } else {
            StringBuilder sb3 = new StringBuilder(48);
            sb3.append("Offset+Length too large: ");
            sb3.append(i);
            sb3.append("+");
            sb3.append(i2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    @Override // a.a.a.a.v0.h.p
    public byte b(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(28);
            sb.append("Index too small: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        } else if (i < this.f1362g) {
            return this.f1414d[this.f1361f + i];
        } else {
            int i2 = this.f1362g;
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    /* Return type fixed from 'a.a.a.a.v0.h.d$a' to match base method */
    @Override // a.a.a.a.v0.h.p, a.a.a.a.v0.h.p, a.a.a.a.v0.h.d, a.a.a.a.v0.h.d, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new b(null);
    }

    @Override // a.a.a.a.v0.h.p
    public int j() {
        return this.f1361f;
    }

    @Override // a.a.a.a.v0.h.p, a.a.a.a.v0.h.d
    public int size() {
        return this.f1362g;
    }

    @Override // a.a.a.a.v0.h.p, a.a.a.a.v0.h.d
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f1414d, this.f1361f + i, bArr, i2, i3);
    }
}
