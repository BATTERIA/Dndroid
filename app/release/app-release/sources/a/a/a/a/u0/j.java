package a.a.a.a.u0;

import a.g;
import a.w.c.i;
import a.y.c;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@g(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0001 \u0001*\u0004\u0018\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001cB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "caller", "isDefault", "", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "data", "Lkotlin/reflect/jvm/internal/calls/InlineClassAwareCaller$BoxUnboxData;", "member", "getMember", "()Ljava/lang/reflect/Member;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoxUnboxData", "kotlin-reflection"}, mv = {1, 1, 16})
public final class j<M extends Member> implements h<M> {

    /* renamed from: a  reason: collision with root package name */
    public final a f162a;
    public final h<M> b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f163c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c f164a;
        public final Method[] b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f165c;

        public a(c cVar, Method[] methodArr, Method method) {
            if (cVar == null) {
                i.a("argumentRange");
                throw null;
            } else if (methodArr != null) {
                this.f164a = cVar;
                this.b = methodArr;
                this.f165c = method;
            } else {
                i.a("unbox");
                throw null;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: a.a.a.a.u0.h<? extends M extends java.lang.reflect.Member> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if ((r9 instanceof a.a.a.a.u0.g) != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(a.a.a.a.v0.b.b r8, a.a.a.a.u0.h<? extends M> r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 459
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.j.<init>(a.a.a.a.v0.b.b, a.a.a.a.u0.h, boolean):void");
    }

    @Override // a.a.a.a.u0.h
    public Object a(Object[] objArr) {
        Object invoke;
        if (objArr != null) {
            a aVar = this.f162a;
            c cVar = aVar.f164a;
            Method[] methodArr = aVar.b;
            Method method = aVar.f165c;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            i.a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
            int i = cVar.f2152c;
            int i2 = cVar.f2153d;
            if (i <= i2) {
                while (true) {
                    Method method2 = methodArr[i];
                    Object obj = objArr[i];
                    if (!(method2 == null || obj == null)) {
                        obj = method2.invoke(obj, new Object[0]);
                    }
                    copyOf[i] = obj;
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            Object a2 = this.b.a(copyOf);
            return (method == null || (invoke = method.invoke(null, new Object[]{a2})) == null) ? a2 : invoke;
        }
        i.a("args");
        throw null;
    }

    @Override // a.a.a.a.u0.h
    public Type h() {
        return this.b.h();
    }

    @Override // a.a.a.a.u0.h
    public List<Type> i() {
        return this.b.i();
    }

    @Override // a.a.a.a.u0.h
    public M j() {
        return this.b.j();
    }
}
