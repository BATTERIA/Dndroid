package a.a.a;

import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.k.b.v;
import a.a.e;
import a.w.b.p;
import a.w.c.h;
import a.w.c.i;
import a.w.c.s;

public final /* synthetic */ class b extends h implements p<v, r, l0> {

    /* renamed from: f  reason: collision with root package name */
    public static final b f2046f = new b();

    public b() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // a.w.b.p
    public l0 a(v vVar, r rVar) {
        v vVar2 = vVar;
        r rVar2 = rVar;
        if (vVar2 == null) {
            i.a("p1");
            throw null;
        } else if (rVar2 != null) {
            return vVar2.a(rVar2);
        } else {
            i.a("p2");
            throw null;
        }
    }

    @Override // a.w.c.b
    public final e c() {
        return s.a(v.class);
    }

    @Override // a.a.b, a.w.c.b
    public final String d() {
        return "loadFunction";
    }

    @Override // a.w.c.b
    public final String f() {
        return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
    }
}
