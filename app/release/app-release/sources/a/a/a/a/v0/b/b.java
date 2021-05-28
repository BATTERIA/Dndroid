package a.a.a.a.v0.b;

import java.util.Collection;

public interface b extends a, u {

    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // a.a.a.a.v0.b.a, a.a.a.a.v0.b.k
    b a();

    b a(k kVar, v vVar, a1 a1Var, a aVar, boolean z);

    void a(Collection<? extends b> collection);

    @Override // a.a.a.a.v0.b.a
    Collection<? extends b> f();

    a t();
}
