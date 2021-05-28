package a.a.a.a.v0.m;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.j.w.n;
import a.a.a.a.v0.m.i1.f;
import a.s;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class b0 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet<d0> f1820a;
    public final int b;

    public static final class a extends j implements l<f, k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ b0 f1821c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b0 b0Var) {
            super(1);
            this.f1821c = b0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public k0 a(f fVar) {
            f fVar2 = fVar;
            if (fVar2 != null) {
                return this.f1821c.a(fVar2).f();
            }
            i.a("kotlinTypeRefiner");
            throw null;
        }
    }

    public b0(Collection<? extends d0> collection) {
        if (collection != null) {
            boolean z = !collection.isEmpty();
            if (!s.f2103a || z) {
                LinkedHashSet<d0> linkedHashSet = new LinkedHashSet<>(collection);
                this.f1820a = linkedHashSet;
                this.b = linkedHashSet.hashCode();
                return;
            }
            throw new AssertionError("Attempt to create an empty intersection");
        }
        i.a("typesToIntersect");
        throw null;
    }

    public b0 a(f fVar) {
        if (fVar != null) {
            LinkedHashSet<d0> linkedHashSet = this.f1820a;
            ArrayList arrayList = new ArrayList(g.a(linkedHashSet, 10));
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fVar));
            }
            return new b0(arrayList);
        }
        i.a("kotlinTypeRefiner");
        throw null;
    }

    @Override // a.a.a.a.v0.m.s0
    public boolean a() {
        return false;
    }

    @Override // a.a.a.a.v0.m.s0
    public Collection<d0> b() {
        return this.f1820a;
    }

    @Override // a.a.a.a.v0.m.s0
    public h c() {
        return null;
    }

    @Override // a.a.a.a.v0.m.s0
    public List<r0> d() {
        return a.t.l.f2119c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        return i.a(this.f1820a, ((b0) obj).f1820a);
    }

    public final k0 f() {
        if (a.a.a.a.v0.b.b1.h.b != null) {
            a.a.a.a.v0.b.b1.h hVar = h.a.f321a;
            a.t.l lVar = a.t.l.f2119c;
            return e0.a(hVar, (s0) this, (List<? extends v0>) lVar, false, n.a.a("member scope for intersection type " + this, this.f1820a), (l<? super f, ? extends k0>) new a(this));
        }
        throw null;
    }

    public int hashCode() {
        return this.b;
    }

    @Override // a.a.a.a.v0.m.s0
    public a.a.a.a.v0.a.g m() {
        a.a.a.a.v0.a.g m = this.f1820a.iterator().next().I0().m();
        i.a((Object) m, "intersectedTypes.iterato…xt().constructor.builtIns");
        return m;
    }

    public String toString() {
        List a2;
        LinkedHashSet<d0> linkedHashSet = this.f1820a;
        c0 c0Var = new c0();
        if (linkedHashSet != null) {
            if (linkedHashSet.size() <= 1) {
                a2 = a.t.f.g(linkedHashSet);
            } else {
                Object[] array = linkedHashSet.toArray(new Object[0]);
                if (array != null) {
                    a.t.f.a(array, c0Var);
                    a2 = a.t.f.a(array);
                } else {
                    throw new a.n("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            return a.t.f.a(a2, " & ", "{", "}", 0, (CharSequence) null, (l) null, 56);
        }
        i.a("$this$sortedWith");
        throw null;
    }
}
