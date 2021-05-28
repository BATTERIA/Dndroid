package g;

public abstract class i implements w {

    /* renamed from: c  reason: collision with root package name */
    public final w f5440c;

    public i(w wVar) {
        if (wVar != null) {
            this.f5440c = wVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    @Override // g.w
    public y c() {
        return this.f5440c.c();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f5440c.toString() + ")";
    }
}
