package a.a.a.a.v0.h;

import a.a.a.a.v0.h.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class t extends d {
    public static final int[] j;

    /* renamed from: d  reason: collision with root package name */
    public final int f1419d;

    /* renamed from: e  reason: collision with root package name */
    public final d f1420e;

    /* renamed from: f  reason: collision with root package name */
    public final d f1421f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1422g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1423h;
    public int i = 0;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Stack<d> f1424a = new Stack<>();

        public /* synthetic */ b(a aVar) {
        }

        public final void a(d dVar) {
            if (dVar.c()) {
                int binarySearch = Arrays.binarySearch(t.j, dVar.size());
                if (binarySearch < 0) {
                    binarySearch = (-(binarySearch + 1)) - 1;
                }
                int i = t.j[binarySearch + 1];
                if (this.f1424a.isEmpty() || this.f1424a.peek().size() >= i) {
                    this.f1424a.push(dVar);
                    return;
                }
                int i2 = t.j[binarySearch];
                d pop = this.f1424a.pop();
                while (!this.f1424a.isEmpty() && this.f1424a.peek().size() < i2) {
                    pop = new t(this.f1424a.pop(), pop);
                }
                t tVar = new t(pop, dVar);
                while (!this.f1424a.isEmpty()) {
                    int binarySearch2 = Arrays.binarySearch(t.j, tVar.f1419d);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (this.f1424a.peek().size() >= t.j[binarySearch2 + 1]) {
                        break;
                    }
                    tVar = new t(this.f1424a.pop(), tVar);
                }
                this.f1424a.push(tVar);
            } else if (dVar instanceof t) {
                t tVar2 = (t) dVar;
                a(tVar2.f1420e);
                a(tVar2.f1421f);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                throw new IllegalArgumentException(e.a.a.a.a.a(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
            }
        }
    }

    public static class c implements Iterator<p> {

        /* renamed from: c  reason: collision with root package name */
        public final Stack<t> f1425c = new Stack<>();

        /* renamed from: d  reason: collision with root package name */
        public p f1426d;

        public /* synthetic */ c(d dVar, a aVar) {
            while (dVar instanceof t) {
                t tVar = (t) dVar;
                this.f1425c.push(tVar);
                dVar = tVar.f1420e;
            }
            this.f1426d = (p) dVar;
        }

        public boolean hasNext() {
            return this.f1426d != null;
        }

        @Override // java.util.Iterator
        public p next() {
            p pVar;
            boolean z;
            p pVar2 = this.f1426d;
            if (pVar2 != null) {
                while (true) {
                    if (!this.f1425c.isEmpty()) {
                        d dVar = this.f1425c.pop().f1421f;
                        while (dVar instanceof t) {
                            t tVar = (t) dVar;
                            this.f1425c.push(tVar);
                            dVar = tVar.f1420e;
                        }
                        pVar = (p) dVar;
                        if (pVar.size() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        pVar = null;
                        break;
                    }
                }
                this.f1426d = pVar;
                return pVar2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class d implements d.a {

        /* renamed from: c  reason: collision with root package name */
        public final c f1427c;

        /* renamed from: d  reason: collision with root package name */
        public d.a f1428d;

        /* renamed from: e  reason: collision with root package name */
        public int f1429e;

        /* JADX WARN: Type inference failed for: r3v3, types: [a.a.a.a.v0.h.d$a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(a.a.a.a.v0.h.t r2, a.a.a.a.v0.h.t.a r3) {
            /*
                r1 = this;
                r1.<init>()
                a.a.a.a.v0.h.t$c r3 = new a.a.a.a.v0.h.t$c
                r0 = 0
                r3.<init>(r2, r0)
                r1.f1427c = r3
                a.a.a.a.v0.h.p r3 = r3.next()
                a.a.a.a.v0.h.d$a r3 = r3.iterator()
                r1.f1428d = r3
                int r2 = r2.f1419d
                r1.f1429e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.t.d.<init>(a.a.a.a.v0.h.t, a.a.a.a.v0.h.t$a):void");
        }

        public boolean hasNext() {
            return this.f1429e > 0;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [a.a.a.a.v0.h.d$a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // a.a.a.a.v0.h.d.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public byte nextByte() {
            /*
                r1 = this;
                a.a.a.a.v0.h.d$a r0 = r1.f1428d
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L_0x0014
                a.a.a.a.v0.h.t$c r0 = r1.f1427c
                a.a.a.a.v0.h.p r0 = r0.next()
                a.a.a.a.v0.h.d$a r0 = r0.iterator()
                r1.f1428d = r0
            L_0x0014:
                int r0 = r1.f1429e
                int r0 = r0 + -1
                r1.f1429e = r0
                a.a.a.a.v0.h.d$a r0 = r1.f1428d
                byte r0 = r0.nextByte()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.h.t.d.nextByte():byte");
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class e extends InputStream {

        /* renamed from: c  reason: collision with root package name */
        public c f1430c;

        /* renamed from: d  reason: collision with root package name */
        public p f1431d;

        /* renamed from: e  reason: collision with root package name */
        public int f1432e;

        /* renamed from: f  reason: collision with root package name */
        public int f1433f;

        /* renamed from: g  reason: collision with root package name */
        public int f1434g;

        /* renamed from: h  reason: collision with root package name */
        public int f1435h;

        public e() {
            k();
        }

        public final int a(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                a();
                if (this.f1431d != null) {
                    int min = Math.min(this.f1432e - this.f1433f, i4);
                    if (bArr != null) {
                        this.f1431d.a(bArr, this.f1433f, i2, min);
                        i2 += min;
                    }
                    this.f1433f += min;
                    i4 -= min;
                } else if (i4 == i3) {
                    return -1;
                }
            }
            return i3 - i4;
        }

        public final void a() {
            int i2;
            if (this.f1431d != null && this.f1433f == (i2 = this.f1432e)) {
                this.f1434g += i2;
                int i3 = 0;
                this.f1433f = 0;
                if (this.f1430c.hasNext()) {
                    p next = this.f1430c.next();
                    this.f1431d = next;
                    i3 = next.size();
                } else {
                    this.f1431d = null;
                }
                this.f1432e = i3;
            }
        }

        @Override // java.io.InputStream
        public int available() {
            return t.this.f1419d - (this.f1434g + this.f1433f);
        }

        public final void k() {
            c cVar = new c(t.this, null);
            this.f1430c = cVar;
            p next = cVar.next();
            this.f1431d = next;
            this.f1432e = next.size();
            this.f1433f = 0;
            this.f1434g = 0;
        }

        public void mark(int i2) {
            this.f1435h = this.f1434g + this.f1433f;
        }

        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            a();
            p pVar = this.f1431d;
            if (pVar == null) {
                return -1;
            }
            int i2 = this.f1433f;
            this.f1433f = i2 + 1;
            return pVar.b(i2) & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            if (bArr == null) {
                throw null;
            } else if (i2 >= 0 && i3 >= 0 && i3 <= bArr.length - i2) {
                return a(bArr, i2, i3);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            k();
            a(null, 0, this.f1435h);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return (long) a(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        j = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = j;
            if (i5 < iArr.length) {
                iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
                i5++;
            } else {
                return;
            }
        }
    }

    public t(d dVar, d dVar2) {
        this.f1420e = dVar;
        this.f1421f = dVar2;
        int size = dVar.size();
        this.f1422g = size;
        this.f1419d = dVar2.size() + size;
        this.f1423h = Math.max(dVar.a(), dVar2.a()) + 1;
    }

    public static d a(d dVar, d dVar2) {
        t tVar = dVar instanceof t ? (t) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar2.size() + dVar.size();
            if (size < 128) {
                return b(dVar, dVar2);
            }
            if (tVar != null) {
                if (dVar2.size() + tVar.f1421f.size() < 128) {
                    dVar2 = new t(tVar.f1420e, b(tVar.f1421f, dVar2));
                }
            }
            if (tVar == null || tVar.f1420e.a() <= tVar.f1421f.a() || tVar.f1423h <= dVar2.a()) {
                if (size >= j[Math.max(dVar.a(), dVar2.a()) + 1]) {
                    return new t(dVar, dVar2);
                }
                b bVar = new b(null);
                bVar.a(dVar);
                bVar.a(dVar2);
                d pop = bVar.f1424a.pop();
                while (!bVar.f1424a.isEmpty()) {
                    pop = new t(bVar.f1424a.pop(), pop);
                }
                return pop;
            }
            dVar2 = new t(tVar.f1420e, new t(tVar.f1421f, dVar2));
        }
        return dVar2;
    }

    public static p b(d dVar, d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[(size + size2)];
        dVar.a(bArr, 0, 0, size);
        dVar2.a(bArr, 0, size, size2);
        return new p(bArr);
    }

    @Override // a.a.a.a.v0.h.d
    public int a() {
        return this.f1423h;
    }

    @Override // a.a.a.a.v0.h.d
    public int a(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f1422g;
        if (i5 <= i6) {
            return this.f1420e.a(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f1421f.a(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f1421f.a(this.f1420e.a(i2, i3, i7), 0, i4 - i7);
    }

    @Override // a.a.a.a.v0.h.d
    public void a(OutputStream outputStream, int i2, int i3) {
        d dVar;
        int i4 = i2 + i3;
        int i5 = this.f1422g;
        if (i4 <= i5) {
            dVar = this.f1420e;
        } else if (i2 >= i5) {
            dVar = this.f1421f;
            i2 -= i5;
        } else {
            int i6 = i5 - i2;
            this.f1420e.a(outputStream, i2, i6);
            this.f1421f.a(outputStream, 0, i3 - i6);
            return;
        }
        dVar.a(outputStream, i2, i3);
    }

    @Override // a.a.a.a.v0.h.d
    public int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f1422g;
        if (i5 <= i6) {
            return this.f1420e.b(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f1421f.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f1421f.b(this.f1420e.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // a.a.a.a.v0.h.d
    public void b(byte[] bArr, int i2, int i3, int i4) {
        d dVar;
        int i5 = i2 + i4;
        int i6 = this.f1422g;
        if (i5 <= i6) {
            dVar = this.f1420e;
        } else if (i2 >= i6) {
            dVar = this.f1421f;
            i2 -= i6;
        } else {
            int i7 = i6 - i2;
            this.f1420e.b(bArr, i2, i3, i7);
            this.f1421f.b(bArr, 0, i3 + i7, i4 - i7);
            return;
        }
        dVar.b(bArr, i2, i3, i4);
    }

    @Override // a.a.a.a.v0.h.d
    public boolean c() {
        return this.f1419d >= j[this.f1423h];
    }

    @Override // a.a.a.a.v0.h.d
    public boolean d() {
        int b2 = this.f1420e.b(0, 0, this.f1422g);
        d dVar = this.f1421f;
        return dVar.b(b2, 0, dVar.size()) == 0;
    }

    @Override // a.a.a.a.v0.h.d
    public e e() {
        return new e(new e());
    }

    public boolean equals(Object obj) {
        int g2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1419d != dVar.size()) {
            return false;
        }
        if (this.f1419d == 0) {
            return true;
        }
        if (this.i != 0 && (g2 = dVar.g()) != 0 && this.i != g2) {
            return false;
        }
        c cVar = new c(this, null);
        p pVar = (p) cVar.next();
        c cVar2 = new c(dVar, null);
        p pVar2 = (p) cVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = pVar.size() - i2;
            int size2 = pVar2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? pVar.a(pVar2, i3, min) : pVar2.a(pVar, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f1419d;
            if (i4 < i5) {
                if (min == size) {
                    pVar = (p) cVar.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
                if (min == size2) {
                    pVar2 = (p) cVar2.next();
                    i3 = 0;
                } else {
                    i3 += min;
                }
            } else if (i4 == i5) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // a.a.a.a.v0.h.d
    public int g() {
        return this.i;
    }

    public int hashCode() {
        int i2 = this.i;
        if (i2 == 0) {
            int i3 = this.f1419d;
            i2 = a(i3, 0, i3);
            if (i2 == 0) {
                i2 = 1;
            }
            this.i = i2;
        }
        return i2;
    }

    /* Return type fixed from 'a.a.a.a.v0.h.d$a' to match base method */
    @Override // a.a.a.a.v0.h.d, a.a.a.a.v0.h.d, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new d(this, null);
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // a.a.a.a.v0.h.d, a.a.a.a.v0.h.d, java.lang.Iterable
    /* renamed from: iterator  reason: collision with other method in class */
    public Iterator<Byte> m74iterator() {
        return new d(this, null);
    }

    @Override // a.a.a.a.v0.h.d
    public int size() {
        return this.f1419d;
    }

    @Override // a.a.a.a.v0.h.d
    public String a(String str) {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = j.f1406a;
        } else {
            byte[] bArr2 = new byte[size];
            b(bArr2, 0, 0, size);
            bArr = bArr2;
        }
        return new String(bArr, str);
    }
}
