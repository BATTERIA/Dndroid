package e.d.a.q.f;

import android.graphics.drawable.Drawable;
import e.d.a.q.f.f;

public class a<T extends Drawable> implements d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final g<T> f4243a = new g<>(new C0130a(300));
    public final int b = 300;

    /* renamed from: c  reason: collision with root package name */
    public b<T> f4244c;

    /* renamed from: d  reason: collision with root package name */
    public b<T> f4245d;

    /* renamed from: e.d.a.q.f.a$a  reason: collision with other inner class name */
    public static class C0130a implements f.a {

        /* renamed from: a  reason: collision with root package name */
        public final int f4246a;

        public C0130a(int i) {
            this.f4246a = i;
        }
    }

    @Override // e.d.a.q.f.d
    public c<T> a(boolean z, boolean z2) {
        if (z) {
            return e.f4248a;
        }
        if (z2) {
            if (this.f4244c == null) {
                this.f4244c = new b<>(this.f4243a.a(false, true), this.b);
            }
            return this.f4244c;
        }
        if (this.f4245d == null) {
            this.f4245d = new b<>(this.f4243a.a(false, false), this.b);
        }
        return this.f4245d;
    }
}
