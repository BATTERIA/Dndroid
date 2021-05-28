package a.a.a.a;

import a.a.a.a.c0;
import a.a.a.a.v0.b.f0;
import a.a.m;
import a.f;
import a.g;
import a.w.c.i;

@g(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB\u0017\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\r\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\n\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0019R(\u0010\u000f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0012*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0014X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty0Impl;", "R", "Lkotlin/reflect/KProperty0;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "kotlin.jvm.PlatformType", "delegateFieldValue", "Lkotlin/Lazy;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty0Impl$Getter;", "get", "()Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, mv = {1, 1, 16})
public class x<R> extends c0<R> implements m<R> {
    public final l0<a<R>> k;

    public static final class a<R> extends c0.b<R> implements m.a<R> {

        /* renamed from: g  reason: collision with root package name */
        public final x<R> f2043g;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.x<? extends R> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(x<? extends R> xVar) {
            if (xVar != 0) {
                this.f2043g = xVar;
            } else {
                i.a("property");
                throw null;
            }
        }

        @Override // a.w.b.a
        public R a() {
            return this.f2043g.get();
        }

        @Override // a.a.a.a.c0.a
        public c0 h() {
            return this.f2043g;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        if (nVar == null) {
            i.a("container");
            throw null;
        } else if (f0Var != null) {
            l0<a<R>> a2 = e.f.a.g.a((a.w.b.a) new y(this));
            i.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
            this.k = a2;
            e.f.a.g.a(f.PUBLICATION, (a.w.b.a) new z(this));
        } else {
            i.a("descriptor");
            throw null;
        }
    }

    @Override // a.w.b.a
    public R a() {
        return get();
    }

    @Override // a.a.m
    public R get() {
        a<R> a2 = this.k.a();
        i.a((Object) a2, "_getter()");
        return a2.a(new Object[0]);
    }

    @Override // a.a.a.a.c0
    public c0.b w() {
        a<R> a2 = this.k.a();
        i.a((Object) a2, "_getter()");
        return a2;
    }
}
