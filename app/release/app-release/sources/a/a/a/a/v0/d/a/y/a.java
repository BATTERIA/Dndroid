package a.a.a.a.v0.d.a.y;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.j.j;
import a.a.a.a.v0.k.b.p;
import a.q;
import a.w.b.l;
import java.util.Collection;
import java.util.Set;

public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f829a;
    public final /* synthetic */ Set b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f830c;

    /* renamed from: a.a.a.a.v0.d.a.y.a$a  reason: collision with other inner class name */
    public class C0031a implements l<b, q> {
        public C0031a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // a.w.b.l
        public q a(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                a.this.f829a.a(bVar2);
                return q.f2100a;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
        }
    }

    public a(p pVar, Set set, boolean z) {
        this.f829a = pVar;
        this.b = set;
        this.f830c = z;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // a.a.a.a.v0.j.k
    public void a(b bVar) {
        if (bVar != null) {
            a.a.a.a.v0.j.l.a(bVar, new C0031a());
            this.b.add(bVar);
            return;
        }
        a(0);
        throw null;
    }

    @Override // a.a.a.a.v0.j.j
    public void a(b bVar, b bVar2) {
        if (bVar == null) {
            a(1);
            throw null;
        } else if (bVar2 == null) {
            a(2);
            throw null;
        }
    }

    @Override // a.a.a.a.v0.j.k
    public void a(b bVar, Collection<? extends b> collection) {
        if (bVar == null) {
            a(3);
            throw null;
        } else if (collection == null) {
            a(4);
            throw null;
        } else if (!this.f830c || bVar.t() == b.a.FAKE_OVERRIDE) {
            super.a(bVar, collection);
        }
    }
}
