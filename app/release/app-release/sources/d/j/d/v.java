package d.j.d;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bilibili.bililive.batteria.recycler.RecyclerActivity;
import d.j.d.z;
import d.l.e;
import d.s.a.a;

public abstract class v extends a {

    /* renamed from: c  reason: collision with root package name */
    public final q f3517c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3518d;

    /* renamed from: e  reason: collision with root package name */
    public z f3519e = null;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f3520f = null;

    @Deprecated
    public v(q qVar) {
        this.f3517c = qVar;
        this.f3518d = 0;
    }

    public static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // d.s.a.a
    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // d.s.a.a
    public void a(ViewGroup viewGroup) {
        z zVar = this.f3519e;
        if (zVar != null) {
            try {
                zVar.b();
            } catch (IllegalStateException unused) {
                this.f3519e.a();
            }
            this.f3519e = null;
        }
    }

    @Override // d.s.a.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3519e == null) {
            q qVar = this.f3517c;
            if (qVar != null) {
                this.f3519e = new a(qVar);
            } else {
                throw null;
            }
        }
        a aVar = (a) this.f3519e;
        if (aVar != null) {
            q qVar2 = fragment.t;
            if (qVar2 == null || qVar2 == aVar.q) {
                aVar.a(new z.a(6, fragment));
                if (fragment.equals(this.f3520f)) {
                    this.f3520f = null;
                    return;
                }
                return;
            }
            StringBuilder a2 = e.a.a.a.a.a("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            a2.append(fragment.toString());
            a2.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(a2.toString());
        }
        throw null;
    }

    @Override // d.s.a.a
    public void b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    @Override // d.s.a.a
    public void b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3520f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.b(false);
                if (this.f3518d == 1) {
                    if (this.f3519e == null) {
                        q qVar = this.f3517c;
                        if (qVar != null) {
                            this.f3519e = new a(qVar);
                        } else {
                            throw null;
                        }
                    }
                    this.f3519e.a(this.f3520f, e.b.STARTED);
                } else {
                    this.f3520f.c(false);
                }
            }
            fragment.b(true);
            if (this.f3518d == 1) {
                if (this.f3519e == null) {
                    q qVar2 = this.f3517c;
                    if (qVar2 != null) {
                        this.f3519e = new a(qVar2);
                    } else {
                        throw null;
                    }
                }
                this.f3519e.a(fragment, e.b.RESUMED);
            } else {
                fragment.c(true);
            }
            this.f3520f = fragment;
        }
    }

    @Override // d.s.a.a
    public Parcelable c() {
        return null;
    }

    @Override // d.s.a.a
    public Object a(ViewGroup viewGroup, int i) {
        if (this.f3519e == null) {
            q qVar = this.f3517c;
            if (qVar != null) {
                this.f3519e = new a(qVar);
            } else {
                throw null;
            }
        }
        long j = (long) i;
        Fragment b = this.f3517c.b(a(viewGroup.getId(), j));
        if (b != null) {
            z zVar = this.f3519e;
            if (zVar != null) {
                zVar.a(new z.a(7, b));
            } else {
                throw null;
            }
        } else {
            b = ((RecyclerActivity.a) this).f2602g.get(i);
            this.f3519e.a(viewGroup.getId(), b, a(viewGroup.getId(), j), 1);
        }
        if (b != this.f3520f) {
            b.b(false);
            if (this.f3518d == 1) {
                this.f3519e.a(b, e.b.STARTED);
            } else {
                b.c(false);
            }
        }
        return b;
    }

    @Override // d.s.a.a
    public boolean a(View view, Object obj) {
        return ((Fragment) obj).I == view;
    }
}
