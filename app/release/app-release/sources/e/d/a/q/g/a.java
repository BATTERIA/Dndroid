package e.d.a.q.g;

import android.graphics.drawable.Drawable;
import e.d.a.n.g;
import e.d.a.q.b;
import e.d.a.q.f.c;

/* JADX WARN: Incorrect class signature, class is equals to this class: <Z:Ljava/lang/Object;>Ljava/lang/Object;Le/d/a/q/g/a<TZ;>; */
public abstract class a<Z> implements g {

    /* renamed from: a  reason: collision with root package name */
    public b f4251a;

    @Override // e.d.a.n.g
    public void a() {
    }

    public void a(Drawable drawable) {
    }

    public void a(b bVar) {
        this.f4251a = bVar;
    }

    public abstract void a(h hVar);

    public void a(Exception exc, Drawable drawable) {
    }

    public abstract void a(R r, c<? super R> cVar);

    @Override // e.d.a.n.g
    public void b() {
    }

    public void b(Drawable drawable) {
    }

    public b c() {
        return this.f4251a;
    }

    @Override // e.d.a.n.g
    public void onDestroy() {
    }
}
