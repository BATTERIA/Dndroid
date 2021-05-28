package a.a.a.a;

import a.a.a.a.c0;
import a.a.a.a.v0.b.f0;
import a.a.g;
import a.a.h;
import a.g;
import a.q;
import a.w.c.i;

@g(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "R", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "set", "", "value", "(Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, mv = {1, 1, 16})
public final class r<R> extends x<R> implements h<R> {
    public final l0<a<R>> l;

    public static final class a<R> extends c0.c<R> implements h.a<R> {

        /* renamed from: g  reason: collision with root package name */
        public final r<R> f117g;

        public a(r<R> rVar) {
            if (rVar != null) {
                this.f117g = rVar;
            } else {
                i.a("property");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.l
        public q a(Object obj) {
            a<R> a2 = this.f117g.l.a();
            i.a((Object) a2, "_setter()");
            a2.a(obj);
            return q.f2100a;
        }

        @Override // a.a.a.a.c0.a
        public c0 h() {
            return this.f117g;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        if (nVar == null) {
            i.a("container");
            throw null;
        } else if (f0Var != null) {
            l0<a<R>> a2 = e.f.a.g.a((a.w.b.a) new s(this));
            i.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
            this.l = a2;
        } else {
            i.a("descriptor");
            throw null;
        }
    }

    @Override // a.a.g
    public g.a i() {
        a<R> a2 = this.l.a();
        i.a((Object) a2, "_setter()");
        return a2;
    }
}
