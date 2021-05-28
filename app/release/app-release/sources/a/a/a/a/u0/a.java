package a.a.a.a.u0;

import a.g;
import a.w.c.i;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@g(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002 !B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "jClass", "Ljava/lang/Class;", "parameterNames", "", "", "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", "", "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflection"}, mv = {1, 1, 16})
public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public final List<Type> f126a;
    public final List<Class<?>> b;

    /* renamed from: c  reason: collision with root package name */
    public final List<Object> f127c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f128d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f129e;

    /* renamed from: f  reason: collision with root package name */
    public final EnumC0007a f130f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Method> f131g;

    /* renamed from: a.a.a.a.u0.a$a  reason: collision with other inner class name */
    public enum EnumC0007a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    public enum b {
        JAVA,
        KOTLIN
    }

    public a(Class<?> cls, List<String> list, EnumC0007a aVar, b bVar, List<Method> list2) {
        if (cls == null) {
            i.a("jClass");
            throw null;
        } else if (list == null) {
            i.a("parameterNames");
            throw null;
        } else if (aVar == null) {
            i.a("callMode");
            throw null;
        } else if (bVar == null) {
            i.a("origin");
            throw null;
        } else if (list2 != null) {
            this.f128d = cls;
            this.f129e = list;
            this.f130f = aVar;
            this.f131g = list2;
            ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getGenericReturnType());
            }
            this.f126a = arrayList;
            List<Method> list3 = this.f131g;
            ArrayList arrayList2 = new ArrayList(e.f.a.g.a((Iterable) list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                Class<?> returnType = it2.next().getReturnType();
                i.a((Object) returnType, "it");
                Class<?> f2 = a.a.a.a.v0.b.e1.b.b.f(returnType);
                if (f2 != null) {
                    returnType = f2;
                }
                arrayList2.add(returnType);
            }
            this.b = arrayList2;
            List<Method> list4 = this.f131g;
            ArrayList arrayList3 = new ArrayList(e.f.a.g.a((Iterable) list4, 10));
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().getDefaultValue());
            }
            this.f127c = arrayList3;
            if (this.f130f == EnumC0007a.POSITIONAL_CALL && bVar == b.JAVA) {
                List<String> list5 = this.f129e;
                if (list5 != null) {
                    ArrayList arrayList4 = new ArrayList(e.f.a.g.a((Iterable) list5, 10));
                    Iterator<T> it4 = list5.iterator();
                    boolean z = false;
                    while (true) {
                        boolean z2 = true;
                        if (!it4.hasNext()) {
                            break;
                        }
                        T next = it4.next();
                        if (!z && i.a((Object) next, (Object) "value")) {
                            z = true;
                            z2 = false;
                        }
                        if (z2) {
                            arrayList4.add(next);
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
                    }
                    return;
                }
                i.a("$this$minus");
                throw null;
            }
        } else {
            i.a("methods");
            throw null;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ a(java.lang.Class r8, java.util.List r9, a.a.a.a.u0.a.EnumC0007a r10, a.a.a.a.u0.a.b r11, java.util.List r12, int r13) {
        /*
            r7 = this;
            r13 = r13 & 16
            if (r13 == 0) goto L_0x002a
            java.util.ArrayList r12 = new java.util.ArrayList
            r13 = 10
            int r13 = e.f.a.g.a(r9, r13)
            r12.<init>(r13)
            java.util.Iterator r13 = r9.iterator()
        L_0x0013:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r0, r1)
            r12.add(r0)
            goto L_0x0013
        L_0x002a:
            r6 = r12
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.a.<init>(java.lang.Class, java.util.List, a.a.a.a.u0.a$a, a.a.a.a.u0.a$b, java.util.List, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r8.isInstance(r6) != false) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113  */
    @Override // a.a.a.a.u0.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.Object[] r14) {
        /*
        // Method dump skipped, instructions count: 345
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.a.a(java.lang.Object[]):java.lang.Object");
    }

    @Override // a.a.a.a.u0.h
    public Type h() {
        return this.f128d;
    }

    @Override // a.a.a.a.u0.h
    public List<Type> i() {
        return this.f126a;
    }

    @Override // a.a.a.a.u0.h
    public Member j() {
        return null;
    }
}
