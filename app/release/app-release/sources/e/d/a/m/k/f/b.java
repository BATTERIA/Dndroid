package e.d.a.m.k.f;

import e.d.a.m.i.k;
import java.io.File;

/* JADX WARN: Incorrect class signature, class is equals to this class: Le/d/a/m/k/f/b<Ljava/io/File;>; */
public class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final T f4132a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.io.File */
    /* JADX WARN: Multi-variable type inference failed */
    public b(File file) {
        if (file != 0) {
            this.f4132a = file;
            return;
        }
        throw new NullPointerException("Data must not be null");
    }

    @Override // e.d.a.m.i.k
    public void a() {
    }

    @Override // e.d.a.m.i.k
    public final int b() {
        return 1;
    }

    @Override // e.d.a.m.i.k
    public final Object get() {
        return this.f4132a;
    }
}
