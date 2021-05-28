package d.o.c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import d.g.l.p;
import java.util.ArrayList;
import java.util.List;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0113b f3589a;
    public final a b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f3590c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f3591a = 0;
        public a b;

        public final void a() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public void a(int i) {
            if (i >= 64) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.f3591a &= (1 << i) ^ -1;
        }

        public void a(int i, boolean z) {
            if (i >= 64) {
                a();
                this.b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.f3591a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f3591a;
            this.f3591a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                a();
                this.b.a(0, z2);
            }
        }

        public int b(int i) {
            long j;
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f3591a;
                }
                j = this.f3591a & ((1 << i) - 1);
            } else {
                if (i >= 64) {
                    return Long.bitCount(this.f3591a) + aVar.b(i - 64);
                }
                j = this.f3591a & ((1 << i) - 1);
            }
            return Long.bitCount(j);
        }

        public void b() {
            this.f3591a = 0;
            a aVar = this.b;
            if (aVar != null) {
                aVar.b();
            }
        }

        public boolean c(int i) {
            if (i < 64) {
                return (this.f3591a & (1 << i)) != 0;
            }
            a();
            return this.b.c(i - 64);
        }

        public boolean d(int i) {
            if (i >= 64) {
                a();
                return this.b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f3591a & j) != 0;
            long j2 = this.f3591a & (j ^ -1);
            this.f3591a = j2;
            long j3 = j - 1;
            this.f3591a = (j2 & j3) | Long.rotateRight((j3 ^ -1) & j2, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.b.d(0);
            }
            return z;
        }

        public void e(int i) {
            if (i >= 64) {
                a();
                this.b.e(i - 64);
                return;
            }
            this.f3591a |= 1 << i;
        }

        public String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.f3591a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.f3591a);
        }
    }

    /* renamed from: d.o.c.b$b  reason: collision with other inner class name */
    public interface AbstractC0113b {
    }

    public b(AbstractC0113b bVar) {
        this.f3589a = bVar;
    }

    public int a() {
        return ((v) this.f3589a).a() - this.f3590c.size();
    }

    public void a(View view, int i, boolean z) {
        int a2 = i < 0 ? ((v) this.f3589a).a() : c(i);
        this.b.a(a2, z);
        if (z) {
            a(view);
        }
        v vVar = (v) this.f3589a;
        vVar.f3665a.addView(view, a2);
        if (vVar.f3665a != null) {
            RecyclerView.g(view);
            return;
        }
        throw null;
    }

    public int b() {
        return ((v) this.f3589a).a();
    }

    public int b(View view) {
        int indexOfChild = ((v) this.f3589a).f3665a.indexOfChild(view);
        if (indexOfChild != -1 && !this.b.c(indexOfChild)) {
            return indexOfChild - this.b.b(indexOfChild);
        }
        return -1;
    }

    public View b(int i) {
        return ((v) this.f3589a).a(c(i));
    }

    public final int c(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = ((v) this.f3589a).a();
        int i2 = i;
        while (i2 < a2) {
            int b2 = i - (i2 - this.b.b(i2));
            if (b2 == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public boolean c(View view) {
        return this.f3590c.contains(view);
    }

    public View d(int i) {
        return ((v) this.f3589a).f3665a.getChildAt(i);
    }

    public String toString() {
        return this.b.toString() + ", hidden list:" + this.f3590c.size();
    }

    public final boolean d(View view) {
        if (!this.f3590c.remove(view)) {
            return false;
        }
        v vVar = (v) this.f3589a;
        if (vVar != null) {
            RecyclerView.a0 g2 = RecyclerView.g(view);
            if (g2 == null) {
                return true;
            }
            vVar.f3665a.a(g2, g2.p);
            g2.p = 0;
            return true;
        }
        throw null;
    }

    public void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i < 0 ? ((v) this.f3589a).a() : c(i);
        this.b.a(a2, z);
        if (z) {
            a(view);
        }
        v vVar = (v) this.f3589a;
        if (vVar != null) {
            RecyclerView.a0 g2 = RecyclerView.g(view);
            if (g2 != null) {
                if (g2.k() || g2.n()) {
                    g2.j &= -257;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(g2);
                    throw new IllegalArgumentException(e.a.a.a.a.a(vVar.f3665a, sb));
                }
            }
            vVar.f3665a.attachViewToParent(view, a2, layoutParams);
            return;
        }
        throw null;
    }

    public void a(int i) {
        RecyclerView.a0 g2;
        int c2 = c(i);
        this.b.d(c2);
        v vVar = (v) this.f3589a;
        View childAt = vVar.f3665a.getChildAt(c2);
        if (!(childAt == null || (g2 = RecyclerView.g(childAt)) == null)) {
            if (!g2.k() || g2.n()) {
                g2.a(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(g2);
                throw new IllegalArgumentException(e.a.a.a.a.a(vVar.f3665a, sb));
            }
        }
        vVar.f3665a.detachViewFromParent((RecyclerView) c2);
    }

    public final void a(View view) {
        this.f3590c.add(view);
        v vVar = (v) this.f3589a;
        if (vVar != null) {
            RecyclerView.a0 g2 = RecyclerView.g(view);
            if (g2 != null) {
                RecyclerView recyclerView = vVar.f3665a;
                int i = g2.q;
                if (i == -1) {
                    i = p.f(g2.f2452a);
                }
                g2.p = i;
                recyclerView.a(g2, 4);
                return;
            }
            return;
        }
        throw null;
    }
}
