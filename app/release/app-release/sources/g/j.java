package g;

public abstract class j implements x {

    /* renamed from: c  reason: collision with root package name */
    public final x f5441c;

    public j(x xVar) {
        if (xVar != null) {
            this.f5441c = xVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // g.x
    public y c() {
        return this.f5441c.c();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f5441c.toString() + ")";
    }
}
