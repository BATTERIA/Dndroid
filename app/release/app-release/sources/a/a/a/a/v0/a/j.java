package a.a.a.a.v0.a;

import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.j.w.i;
import a.a.l;
import a.e;
import a.w.c.f;
import a.w.c.p;
import a.w.c.s;
import e.f.a.g;

public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ l[] f214d = {s.a(new p(s.a(j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), s.a(new p(s.a(j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};

    /* renamed from: e  reason: collision with root package name */
    public static final b f215e = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final e f216a;
    public final a b;

    /* renamed from: c  reason: collision with root package name */
    public final x f217c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f218a;

        public a(int i) {
            this.f218a = i;
        }
    }

    public static final class b {
        public /* synthetic */ b(f fVar) {
        }
    }

    public static final class c extends a.w.c.j implements a.w.b.a<i> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ w f219c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(w wVar) {
            super(0);
            this.f219c = wVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public i a() {
            return this.f219c.a(k.f220a).u();
        }
    }

    public j(w wVar, x xVar) {
        if (wVar == null) {
            a.w.c.i.a("module");
            throw null;
        } else if (xVar != null) {
            this.f217c = xVar;
            this.f216a = g.a(a.f.PUBLICATION, (a.w.b.a) new c(wVar));
            this.b = new a(1);
        } else {
            a.w.c.i.a("notFoundClasses");
            throw null;
        }
    }
}
