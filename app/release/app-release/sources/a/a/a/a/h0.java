package a.a.a.a;

import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.m.d0;
import a.a.l;
import a.a.q;
import a.g;
import a.w.c.i;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import java.util.ArrayList;
import java.util.List;

@g(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", "", "()Z", "name", "", "getName", "()Ljava/lang/String;", "upperBounds", "", "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", "", "hashCode", "", "toString", "kotlin-reflection"}, mv = {1, 1, 16})
public final class h0 implements q {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ l[] f87c = {s.a(new p(s.a(h0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    public final k0 f88a;
    public final r0 b;

    public static final class a extends j implements a.w.b.a<List<? extends f0>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ h0 f89c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h0 h0Var) {
            super(0);
            this.f89c = h0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public List<? extends f0> a() {
            List<d0> upperBounds = this.f89c.b.getUpperBounds();
            i.a((Object) upperBounds, "descriptor.upperBounds");
            ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) upperBounds, 10));
            for (T t : upperBounds) {
                i.a((Object) t, "kotlinType");
                arrayList.add(new f0(t, new g0(this)));
            }
            return arrayList;
        }
    }

    public h0(r0 r0Var) {
        if (r0Var != null) {
            this.b = r0Var;
            this.f88a = e.f.a.g.b((a.w.b.a) new a(this));
            return;
        }
        i.a("descriptor");
        throw null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h0) && i.a(this.b, ((h0) obj).b);
    }

    @Override // a.a.q
    public List<a.a.p> getUpperBounds() {
        k0 k0Var = this.f88a;
        l lVar = f87c[0];
        return (List) k0Var.a();
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        String str;
        o0 o0Var = o0.b;
        r0 r0Var = this.b;
        if (r0Var != null) {
            StringBuilder sb = new StringBuilder();
            int ordinal = r0Var.F().ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    str = "out ";
                }
                sb.append(r0Var.d());
                String sb2 = sb.toString();
                i.a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            str = "in ";
            sb.append(str);
            sb.append(r0Var.d());
            String sb22 = sb.toString();
            i.a((Object) sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
        i.a("typeParameter");
        throw null;
    }
}
