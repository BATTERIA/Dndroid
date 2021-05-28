package f.o0.g;

import f.k0;
import java.util.LinkedHashSet;
import java.util.Set;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Set<k0> f5136a = new LinkedHashSet();

    public synchronized void a(k0 k0Var) {
        this.f5136a.remove(k0Var);
    }

    public synchronized void b(k0 k0Var) {
        this.f5136a.add(k0Var);
    }

    public synchronized boolean c(k0 k0Var) {
        return this.f5136a.contains(k0Var);
    }
}
