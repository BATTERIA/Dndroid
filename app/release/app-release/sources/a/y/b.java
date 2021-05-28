package a.y;

import a.t.r;
import java.util.NoSuchElementException;

public final class b extends r {

    /* renamed from: c  reason: collision with root package name */
    public final int f2155c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2156d;

    /* renamed from: e  reason: collision with root package name */
    public int f2157e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2158f;

    public b(int i, int i2, int i3) {
        this.f2158f = i3;
        this.f2155c = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f2156d = z;
        this.f2157e = !z ? this.f2155c : i;
    }

    @Override // a.t.r
    public int a() {
        int i = this.f2157e;
        if (i != this.f2155c) {
            this.f2157e = this.f2158f + i;
        } else if (this.f2156d) {
            this.f2156d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f2156d;
    }
}
