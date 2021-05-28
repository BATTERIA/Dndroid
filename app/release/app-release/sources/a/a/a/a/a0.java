package a.a.a.a;

import a.a.a.a.c0;
import a.a.a.a.v0.b.f0;
import a.a.n;
import a.f;
import a.g;
import a.w.c.i;
import a.w.c.j;
import java.lang.reflect.Field;

@g(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00020\u0004:\u0001\u001fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cR4\u0010\u0010\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001 \u0013*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00120\u00120\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lkotlin/reflect/jvm/internal/KProperty1Impl;", "T", "R", "Lkotlin/reflect/KProperty1;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "boundReceiver", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "_getter", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "kotlin.jvm.PlatformType", "delegateField", "Lkotlin/Lazy;", "Ljava/lang/reflect/Field;", "getter", "getGetter", "()Lkotlin/reflect/jvm/internal/KProperty1Impl$Getter;", "get", "receiver", "(Ljava/lang/Object;)Ljava/lang/Object;", "getDelegate", "invoke", "Getter", "kotlin-reflection"}, mv = {1, 1, 16})
public class a0<T, R> extends c0<R> implements n<T, R> {
    public final l0<a<T, R>> k;

    public static final class a<T, R> extends c0.b<R> implements n.a<T, R> {

        /* renamed from: g  reason: collision with root package name */
        public final a0<T, R> f23g;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: a.a.a.a.a0<T, ? extends R> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(a0<T, ? extends R> a0Var) {
            if (a0Var != 0) {
                this.f23g = a0Var;
            } else {
                i.a("property");
                throw null;
            }
        }

        @Override // a.w.b.l
        public R a(T t) {
            return this.f23g.get(t);
        }

        @Override // a.a.a.a.c0.a
        public c0 h() {
            return this.f23g;
        }
    }

    public static final class b extends j implements a.w.b.a<a<T, ? extends R>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a0 f24c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a0 a0Var) {
            super(0);
            this.f24c = a0Var;
        }

        @Override // a.w.b.a
        public Object a() {
            return new a(this.f24c);
        }
    }

    public static final class c extends j implements a.w.b.a<Field> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a0 f25c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var) {
            super(0);
            this.f25c = a0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public Field a() {
            return this.f25c.h();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(n nVar, String str, String str2, Object obj) {
        super(nVar, str, str2, null, obj);
        if (nVar == null) {
            i.a("container");
            throw null;
        } else if (str == null) {
            i.a("name");
            throw null;
        } else if (str2 != null) {
            l0<a<T, R>> a2 = e.f.a.g.a((a.w.b.a) new b(this));
            i.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
            this.k = a2;
            e.f.a.g.a(f.PUBLICATION, (a.w.b.a) new c(this));
        } else {
            i.a("signature");
            throw null;
        }
    }

    @Override // a.w.b.l
    public R a(T t) {
        return get(t);
    }

    @Override // a.a.n
    public R get(T t) {
        return w().a(t);
    }

    @Override // a.a.n, a.a.a.a.c0
    public a<T, R> w() {
        a<T, R> a2 = this.k.a();
        i.a((Object) a2, "_getter()");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(n nVar, f0 f0Var) {
        super(nVar, f0Var);
        if (nVar == null) {
            i.a("container");
            throw null;
        } else if (f0Var != null) {
            l0<a<T, R>> a2 = e.f.a.g.a((a.w.b.a) new b(this));
            i.a((Object) a2, "ReflectProperties.lazy { Getter(this) }");
            this.k = a2;
            e.f.a.g.a(f.PUBLICATION, (a.w.b.a) new c(this));
        } else {
            i.a("descriptor");
            throw null;
        }
    }
}
