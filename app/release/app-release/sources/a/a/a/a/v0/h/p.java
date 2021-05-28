package a.a.a.a.v0.h;

import a.a.a.a.v0.h.d;
import e.f.a.g;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class p extends d {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f1414d;

    /* renamed from: e  reason: collision with root package name */
    public int f1415e = 0;

    public class b implements d.a {

        /* renamed from: c  reason: collision with root package name */
        public int f1416c = 0;

        /* renamed from: d  reason: collision with root package name */
        public final int f1417d;

        public /* synthetic */ b(a aVar) {
            this.f1417d = p.this.size();
        }

        public boolean hasNext() {
            return this.f1416c < this.f1417d;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // a.a.a.a.v0.h.d.a
        public byte nextByte() {
            try {
                byte[] bArr = p.this.f1414d;
                int i = this.f1416c;
                this.f1416c = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public p(byte[] bArr) {
        this.f1414d = bArr;
    }

    @Override // a.a.a.a.v0.h.d
    public int a() {
        return 0;
    }

    @Override // a.a.a.a.v0.h.d
    public int a(int i, int i2, int i3) {
        byte[] bArr = this.f1414d;
        int j = j() + i2;
        for (int i4 = j; i4 < j + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // a.a.a.a.v0.h.d
    public String a(String str) {
        return new String(this.f1414d, j(), size(), str);
    }

    @Override // a.a.a.a.v0.h.d
    public void a(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f1414d, j() + i, i2);
    }

    public boolean a(p pVar, int i, int i2) {
        if (i2 > pVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i + i2 <= pVar.size()) {
            byte[] bArr = this.f1414d;
            byte[] bArr2 = pVar.f1414d;
            int j = j() + i2;
            int j2 = j();
            int j3 = pVar.j() + i;
            while (j2 < j) {
                if (bArr[j2] != bArr2[j3]) {
                    return false;
                }
                j2++;
                j3++;
            }
            return true;
        } else {
            int size2 = pVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public byte b(int i) {
        return this.f1414d[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r9[r0] > -65) goto L_0x0024;
     */
    @Override // a.a.a.a.v0.h.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b(int r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.p.b(int, int, int):int");
    }

    @Override // a.a.a.a.v0.h.d
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f1414d, i, bArr, i2, i3);
    }

    @Override // a.a.a.a.v0.h.d
    public boolean c() {
        return true;
    }

    @Override // a.a.a.a.v0.h.d
    public boolean d() {
        int j = j();
        return g.b(this.f1414d, j, size() + j);
    }

    @Override // a.a.a.a.v0.h.d
    public e e() {
        e eVar = new e(this);
        try {
            eVar.c(size());
            return eVar;
        } catch (k e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof p) {
            return a((p) obj, 0, size());
        }
        if (obj instanceof t) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(e.a.a.a.a.a(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    @Override // a.a.a.a.v0.h.d
    public int g() {
        return this.f1415e;
    }

    public int hashCode() {
        int i = this.f1415e;
        if (i == 0) {
            int size = size();
            i = a(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f1415e = i;
        }
        return i;
    }

    /* Return type fixed from 'a.a.a.a.v0.h.d$a' to match base method */
    @Override // a.a.a.a.v0.h.d, a.a.a.a.v0.h.d, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new b(null);
    }

    public int j() {
        return 0;
    }

    @Override // a.a.a.a.v0.h.d
    public int size() {
        return this.f1414d.length;
    }
}
