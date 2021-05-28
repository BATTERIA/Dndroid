package a.y;

import e.f.a.g;
import java.util.Iterator;

public class a implements Iterable<Integer>, a.w.c.w.a {

    /* renamed from: c  reason: collision with root package name */
    public final int f2152c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2153d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2154e;

    public a(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f2152c = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= g.c(g.c(i2, i3) - g.c(i, i3), i3);
                }
            } else if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            } else if (i > i2) {
                int i4 = -i3;
                i2 += g.c(g.c(i, i4) - g.c(i2, i4), i4);
            }
            this.f2153d = i2;
            this.f2154e = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f2152c == aVar.f2152c && this.f2153d == aVar.f2153d && this.f2154e == aVar.f2154e)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2152c * 31) + this.f2153d) * 31) + this.f2154e;
    }

    public boolean isEmpty() {
        if (this.f2154e > 0) {
            if (this.f2152c > this.f2153d) {
                return true;
            }
        } else if (this.f2152c < this.f2153d) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new b(this.f2152c, this.f2153d, this.f2154e);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f2154e > 0) {
            sb = new StringBuilder();
            sb.append(this.f2152c);
            sb.append("..");
            sb.append(this.f2153d);
            sb.append(" step ");
            i = this.f2154e;
        } else {
            sb = new StringBuilder();
            sb.append(this.f2152c);
            sb.append(" downTo ");
            sb.append(this.f2153d);
            sb.append(" step ");
            i = -this.f2154e;
        }
        sb.append(i);
        return sb.toString();
    }
}
