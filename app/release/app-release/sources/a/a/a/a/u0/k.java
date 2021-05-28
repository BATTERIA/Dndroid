package a.a.a.a.u0;

import a.g;
import a.n;
import a.t.f;
import a.t.l;
import a.w.c.i;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@g(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0016\u0017B\u001d\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J%\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0004¢\u0006\u0002\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0002X\u0004¢\u0006\u0002\n\u0000\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "unboxMethod", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Ljava/util/List;)V", "member", "getMember", "()Ljava/lang/reflect/Method;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "callMethod", "", "instance", "args", "", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "Bound", "Unbound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "kotlin-reflection"}, mv = {1, 1, 16})
public abstract class k implements h<Method> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f166a;
    public final Method b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Type> f167c;

    public static final class a extends k implements g {

        /* renamed from: d  reason: collision with root package name */
        public final Object f168d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Method method, Object obj) {
            super(method, l.f2119c, null);
            if (method != null) {
                this.f168d = obj;
                return;
            }
            i.a("unboxMethod");
            throw null;
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            if (objArr != null) {
                e.f.a.g.a(this, objArr);
                return a(this.f168d, objArr);
            }
            i.a("args");
            throw null;
        }
    }

    public static final class b extends k {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method) {
            super(method, e.f.a.g.c(method.getDeclaringClass()), null);
            if (method != null) {
            } else {
                i.a("unboxMethod");
                throw null;
            }
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            Object[] objArr2;
            if (objArr != null) {
                e.f.a.g.a(this, objArr);
                Object obj = objArr[0];
                if (objArr.length <= 1) {
                    objArr2 = new Object[0];
                } else {
                    objArr2 = f.a(objArr, 1, objArr.length);
                    if (objArr2 == null) {
                        throw new n("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return a(obj, objArr2);
            }
            i.a("args");
            throw null;
        }
    }

    public /* synthetic */ k(Method method, List list, a.w.c.f fVar) {
        this.b = method;
        this.f167c = list;
        Class<?> returnType = method.getReturnType();
        i.a((Object) returnType, "unboxMethod.returnType");
        this.f166a = returnType;
    }

    public final Object a(Object obj, Object[] objArr) {
        if (objArr != null) {
            return this.b.invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }
        i.a("args");
        throw null;
    }

    @Override // a.a.a.a.u0.h
    public final Type h() {
        return this.f166a;
    }

    @Override // a.a.a.a.u0.h
    public final List<Type> i() {
        return this.f167c;
    }

    /* Return type fixed from 'java.lang.reflect.Member' to match base method */
    @Override // a.a.a.a.u0.h
    public Method j() {
        return null;
    }
}
