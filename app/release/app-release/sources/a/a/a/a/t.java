package a.a.a.a;

import a.a.a.a.c0;
import a.a.a.a.v0.b.f0;
import a.a.i;
import a.g;
import a.q;
import a.w.c.j;

@g(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001cB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty1Impl;", "T", "R", "Lkotlin/reflect/jvm/internal/KProperty1Impl;", "Lkotlin/reflect/KMutableProperty1;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_setter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "kotlin.jvm.PlatformType", "setter", "getSetter", "()Lkotlin/reflect/jvm/internal/KMutableProperty1Impl$Setter;", "set", "", "receiver", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Setter", "kotlin-reflection"}, mv = {1, 1, 16})
public final class t<T, R> extends a0<T, R> implements i<T, R> {
    public final l0<a<T, R>> l;

    public static final class a<T, R> extends c0.c<R> implements i.a<T, R> {

        /* renamed from: g  reason: collision with root package name */
        public final t<T, R> f121g;

        public a(t<T, R> tVar) {
            if (tVar != null) {
                this.f121g = tVar;
            } else {
                a.w.c.i.a("property");
                throw null;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.p
        public q a(Object obj, Object obj2) {
            this.f121g.i().a(obj, obj2);
            return q.f2100a;
        }

        @Override // a.a.a.a.c0.a
        public c0 h() {
            return this.f121g;
        }
    }

    public static final class b extends j implements a.w.b.a<a<T, R>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ t f122c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(t tVar) {
            super(0);
            this.f122c = tVar;
        }

        @Override // a.w.b.a
        public Object a() {
            return new a(this.f122c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(n nVar, String str, String str2, Object obj) {
        super(nVar, str, str2, obj);
        if (nVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (str == null) {
            a.w.c.i.a("name");
            throw null;
        } else if (str2 != null) {
            l0<a<T, R>> a2 = e.f.a.g.a((a.w.b.a) new b(this));
            a.w.c.i.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
            this.l = a2;
        } else {
            a.w.c.i.a("signature");
            throw null;
        }
    }

    @Override // a.a.g, a.a.i
    public a<T, R> i() {
        a<T, R> a2 = this.l.a();
        a.w.c.i.a((Object) a2, "_setter()");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        if (nVar == null) {
            a.w.c.i.a("container");
            throw null;
        } else if (f0Var != null) {
            l0<a<T, R>> a2 = e.f.a.g.a((a.w.b.a) new b(this));
            a.w.c.i.a((Object) a2, "ReflectProperties.lazy { Setter(this) }");
            this.l = a2;
        } else {
            a.w.c.i.a("descriptor");
            throw null;
        }
    }
}
