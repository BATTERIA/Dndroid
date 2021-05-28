package a.a.a.a.v0.h;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public abstract class d implements Iterable<Byte> {

    /* renamed from: c  reason: collision with root package name */
    public static final d f1366c = new p(new byte[0]);

    public interface a extends Iterator<Byte> {
        byte nextByte();
    }

    public static final class b extends OutputStream {

        /* renamed from: h  reason: collision with root package name */
        public static final byte[] f1367h = new byte[0];

        /* renamed from: c  reason: collision with root package name */
        public final int f1368c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList<d> f1369d;

        /* renamed from: e  reason: collision with root package name */
        public int f1370e;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f1371f;

        /* renamed from: g  reason: collision with root package name */
        public int f1372g;

        public b(int i) {
            if (i >= 0) {
                this.f1368c = i;
                this.f1369d = new ArrayList<>();
                this.f1371f = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        public final void a() {
            int i = this.f1372g;
            byte[] bArr = this.f1371f;
            if (i >= bArr.length) {
                this.f1369d.add(new p(this.f1371f));
                this.f1371f = f1367h;
            } else if (i > 0) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
                this.f1369d.add(new p(bArr2));
            }
            this.f1370e += this.f1372g;
            this.f1372g = 0;
        }

        public final void a(int i) {
            this.f1369d.add(new p(this.f1371f));
            int length = this.f1370e + this.f1371f.length;
            this.f1370e = length;
            this.f1371f = new byte[Math.max(this.f1368c, Math.max(i, length >>> 1))];
            this.f1372g = 0;
        }

        public synchronized int k() {
            return this.f1370e + this.f1372g;
        }

        public synchronized d l() {
            ArrayList<d> arrayList;
            a();
            arrayList = this.f1369d;
            if (!(arrayList instanceof Collection)) {
                ArrayList<d> arrayList2 = new ArrayList<>();
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next());
                }
                arrayList = arrayList2;
            }
            return arrayList.isEmpty() ? d.f1366c : d.a(arrayList.iterator(), arrayList.size());
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(k()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.f1372g == this.f1371f.length) {
                a(1);
            }
            byte[] bArr = this.f1371f;
            int i2 = this.f1372g;
            this.f1372g = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            if (i2 <= this.f1371f.length - this.f1372g) {
                System.arraycopy(bArr, i, this.f1371f, this.f1372g, i2);
                this.f1372g += i2;
            } else {
                int length = this.f1371f.length - this.f1372g;
                System.arraycopy(bArr, i, this.f1371f, this.f1372g, length);
                int i3 = i2 - length;
                a(i3);
                System.arraycopy(bArr, i + length, this.f1371f, 0, i3);
                this.f1372g = i3;
            }
        }
    }

    public static d a(Iterator<d> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).b(a(it, i - i2));
    }

    public static d a(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return new p(bArr2);
    }

    public static d a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new p(bArr2);
    }

    public static d b(String str) {
        try {
            return new p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    public static b i() {
        return new b(128);
    }

    public abstract int a();

    public abstract int a(int i, int i2, int i3);

    public abstract String a(String str);

    public abstract void a(OutputStream outputStream, int i, int i2);

    public void a(byte[] bArr, int i, int i2, int i3) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 >= 0) {
            int i4 = i + i3;
            if (i4 <= size()) {
                int i5 = i2 + i3;
                if (i5 > bArr.length) {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i5);
                    throw new IndexOutOfBoundsException(sb3.toString());
                } else if (i3 > 0) {
                    b(bArr, i, i2, i3);
                }
            } else {
                StringBuilder sb4 = new StringBuilder(34);
                sb4.append("Source end offset < 0: ");
                sb4.append(i4);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder(23);
            sb5.append("Length < 0: ");
            sb5.append(i3);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
    }

    public abstract int b(int i, int i2, int i3);

    public d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (((long) size) + ((long) size2) < 2147483647L) {
            return t.a(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public abstract boolean c();

    public abstract boolean d();

    public abstract e e();

    public abstract int g();

    public String h() {
        try {
            return a("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* Return type fixed from 'a.a.a.a.v0.h.d$a' to match base method */
    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
