package a.a.a.a.u0;

import a.n;
import a.q;
import a.w.c.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

@a.g(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u001e*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\b\u001b\u001c\u001d\u001e\u001f !\"B3\b\u0002\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0002\u0010\u000bJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0004R\u0017\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0001\u0007#$%&'()¨\u0006*"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "M", "Ljava/lang/reflect/Member;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "member", "returnType", "Ljava/lang/reflect/Type;", "instanceClass", "Ljava/lang/Class;", "valueParameterTypes", "", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "getInstanceClass", "()Ljava/lang/Class;", "getMember", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Member;", "parameterTypes", "", "getParameterTypes", "()Ljava/util/List;", "getReturnType", "()Ljava/lang/reflect/Type;", "checkObjectInstance", "", "obj", "", "AccessorForHiddenBoundConstructor", "AccessorForHiddenConstructor", "BoundConstructor", "Companion", "Constructor", "FieldGetter", "FieldSetter", "Method", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Constructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$BoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$AccessorForHiddenBoundConstructor;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "kotlin-reflection"}, mv = {1, 1, 16})
public abstract class i<M extends Member> implements h<M> {

    /* renamed from: a  reason: collision with root package name */
    public final List<Type> f151a;
    public final M b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f152c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f153d;

    public static final class a extends i<Constructor<?>> implements g {

        /* renamed from: e  reason: collision with root package name */
        public final Object f154e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.reflect.Constructor<?> r7, java.lang.Object r8) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x003a
                java.lang.Class r2 = r7.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                a.w.c.i.a(r2, r0)
                r3 = 0
                java.lang.reflect.Type[] r0 = r7.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                a.w.c.i.a(r0, r1)
                int r1 = r0.length
                r4 = 2
                if (r1 > r4) goto L_0x001d
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001d:
                int r1 = r0.length
                r4 = 1
                int r1 = r1 - r4
                java.lang.Object[] r0 = a.t.f.a(r0, r4, r1)
                if (r0 == 0) goto L_0x0032
            L_0x0026:
                r4 = r0
                java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f154e = r8
                return
            L_0x0032:
                a.n r7 = new a.n
                java.lang.String r8 = "null cannot be cast to non-null type kotlin.Array<T>"
                r7.<init>(r8)
                throw r7
            L_0x003a:
                java.lang.String r7 = "constructor"
                a.w.c.i.a(r7)
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            if (objArr != null) {
                b(objArr);
                u uVar = new u(3);
                uVar.f2150a.add(this.f154e);
                uVar.a(objArr);
                uVar.f2150a.add(null);
                return ((Constructor) this.b).newInstance(uVar.f2150a.toArray(new Object[uVar.a()]));
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    public static final class b extends i<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.reflect.Constructor<?> r7) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0037
                java.lang.Class r2 = r7.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                a.w.c.i.a(r2, r0)
                r3 = 0
                java.lang.reflect.Type[] r0 = r7.getGenericParameterTypes()
                java.lang.String r1 = "constructor.genericParameterTypes"
                a.w.c.i.a(r0, r1)
                int r1 = r0.length
                r4 = 0
                r5 = 1
                if (r1 > r5) goto L_0x001d
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r4]
                goto L_0x0025
            L_0x001d:
                int r1 = r0.length
                int r1 = r1 - r5
                java.lang.Object[] r0 = a.t.f.a(r0, r4, r1)
                if (r0 == 0) goto L_0x002f
            L_0x0025:
                r4 = r0
                java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            L_0x002f:
                a.n r7 = new a.n
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                r7.<init>(r0)
                throw r7
            L_0x0037:
                java.lang.String r7 = "constructor"
                a.w.c.i.a(r7)
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.b.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            if (objArr != null) {
                b(objArr);
                u uVar = new u(2);
                uVar.a(objArr);
                uVar.f2150a.add(null);
                return ((Constructor) this.b).newInstance(uVar.f2150a.toArray(new Object[uVar.a()]));
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    public static final class c extends i<Constructor<?>> implements g {

        /* renamed from: e  reason: collision with root package name */
        public final Object f155e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.reflect.Constructor<?> r7, java.lang.Object r8) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x001e
                java.lang.Class r2 = r7.getDeclaringClass()
                java.lang.String r0 = "constructor.declaringClass"
                a.w.c.i.a(r2, r0)
                r3 = 0
                java.lang.reflect.Type[] r4 = r7.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                a.w.c.i.a(r4, r0)
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f155e = r8
                return
            L_0x001e:
                java.lang.String r7 = "constructor"
                a.w.c.i.a(r7)
                r7 = 0
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            if (objArr != null) {
                b(objArr);
                u uVar = new u(2);
                uVar.f2150a.add(this.f155e);
                uVar.a(objArr);
                return ((Constructor) this.b).newInstance(uVar.f2150a.toArray(new Object[uVar.a()]));
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    public static final class d extends i<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                r0 = 0
                if (r8 == 0) goto L_0x0038
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r1 = "constructor.declaringClass"
                a.w.c.i.a(r3, r1)
                java.lang.Class r1 = r8.getDeclaringClass()
                java.lang.String r2 = "klass"
                a.w.c.i.a(r1, r2)
                java.lang.Class r2 = r1.getDeclaringClass()
                if (r2 == 0) goto L_0x0027
                int r1 = r1.getModifiers()
                boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
                if (r1 != 0) goto L_0x0027
                r4 = r2
                goto L_0x0028
            L_0x0027:
                r4 = r0
            L_0x0028:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "constructor.genericParameterTypes"
                a.w.c.i.a(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            L_0x0038:
                java.lang.String r8 = "constructor"
                a.w.c.i.a(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.d.<init>(java.lang.reflect.Constructor):void");
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            if (objArr != null) {
                b(objArr);
                return ((Constructor) this.b).newInstance(Arrays.copyOf(objArr, objArr.length));
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    @a.g(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¢\u0006\u0002\u0010\u000b\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "requiresInstance", "", "(Ljava/lang/reflect/Field;Z)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldGetter$BoundJvmStaticInObject;", "kotlin-reflection"}, mv = {1, 1, 16})
    public static abstract class e extends i<Field> {

        public static final class a extends e implements g {

            /* renamed from: e  reason: collision with root package name */
            public final Object f156e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, null);
                if (field != null) {
                    this.f156e = obj;
                    return;
                }
                a.w.c.i.a("field");
                throw null;
            }

            @Override // a.a.a.a.u0.i.e, a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    return ((Field) this.b).get(this.f156e);
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class b extends e implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }
        }

        public static final class c extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }
        }

        public static final class d extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.i
            public void b(Object[] objArr) {
                if (objArr != null) {
                    i.super.b(objArr);
                    a(e.f.a.g.c(objArr));
                    return;
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        /* renamed from: a.a.a.a.u0.i$e$e  reason: collision with other inner class name */
        public static final class C0008e extends e {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0008e(Field field) {
                super(field, false, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ e(java.lang.reflect.Field r7, boolean r8, a.w.c.f r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r9 = "field.genericType"
                a.w.c.i.a(r2, r9)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.e.<init>(java.lang.reflect.Field, boolean, a.w.c.f):void");
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            Object obj = null;
            if (objArr != null) {
                b(objArr);
                Field field = (Field) this.b;
                if (this.f153d != null) {
                    obj = e.f.a.g.b(objArr);
                }
                return field.get(obj);
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    @a.g(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0010\u0011\u0012\u0013\u0014B\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0001\u0005\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Field;", "field", "notNull", "", "requiresInstance", "(Ljava/lang/reflect/Field;ZZ)V", "call", "", "args", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "checkArguments", "", "([Ljava/lang/Object;)V", "BoundInstance", "BoundJvmStaticInObject", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$FieldSetter$BoundJvmStaticInObject;", "kotlin-reflection"}, mv = {1, 1, 16})
    public static abstract class f extends i<Field> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f157e;

        public static final class a extends f implements g {

            /* renamed from: f  reason: collision with root package name */
            public final Object f158f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z, Object obj) {
                super(field, z, false, null);
                if (field != null) {
                    this.f158f = obj;
                    return;
                }
                a.w.c.i.a("field");
                throw null;
            }

            @Override // a.a.a.a.u0.i.f, a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    ((Field) this.b).set(this.f158f, e.f.a.g.b(objArr));
                    return q.f2100a;
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class b extends f implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z) {
                super(field, z, false, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.i.f, a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    ((Field) this.b).set(null, e.f.a.g.f(objArr));
                    return q.f2100a;
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class c extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z) {
                super(field, z, true, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }
        }

        public static final class d extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z) {
                super(field, z, true, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.i.f, a.a.a.a.u0.i
            public void b(Object[] objArr) {
                if (objArr != null) {
                    super.b(objArr);
                    a(e.f.a.g.c(objArr));
                    return;
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class e extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z) {
                super(field, z, false, null);
                if (field != null) {
                } else {
                    a.w.c.i.a("field");
                    throw null;
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ f(java.lang.reflect.Field r7, boolean r8, boolean r9, a.w.c.f r10) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r10 = "Void.TYPE"
                a.w.c.i.a(r2, r10)
                if (r9 == 0) goto L_0x000e
                java.lang.Class r9 = r7.getDeclaringClass()
                goto L_0x000f
            L_0x000e:
                r9 = 0
            L_0x000f:
                r3 = r9
                r9 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r9]
                r9 = 0
                java.lang.reflect.Type r10 = r7.getGenericType()
                java.lang.String r0 = "field.genericType"
                a.w.c.i.a(r10, r0)
                r4[r9] = r10
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f157e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.f.<init>(java.lang.reflect.Field, boolean, boolean, a.w.c.f):void");
        }

        @Override // a.a.a.a.u0.h
        public Object a(Object[] objArr) {
            Object obj = null;
            if (objArr != null) {
                b(objArr);
                Field field = (Field) this.b;
                if (this.f153d != null) {
                    obj = e.f.a.g.b(objArr);
                }
                field.set(obj, e.f.a.g.f(objArr));
                return q.f2100a;
            }
            a.w.c.i.a("args");
            throw null;
        }

        @Override // a.a.a.a.u0.i
        public void b(Object[] objArr) {
            if (objArr != null) {
                i.super.b(objArr);
                if (this.f157e && e.f.a.g.f(objArr) == null) {
                    throw new IllegalArgumentException("null is not allowed as a value for this property.");
                }
                return;
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    @a.g(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0010\u0011\u0012\u0013\u0014\u0015B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ%\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0004¢\u0006\u0002\u0010\u000fR\u000e\u0010\n\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0001\u0006\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Method;", "method", "requiresInstance", "", "parameterTypes", "", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "isVoidMethod", "callMethod", "", "instance", "args", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "BoundInstance", "BoundJvmStaticInObject", "BoundStatic", "Instance", "JvmStaticInObject", "Static", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Static;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$Instance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$JvmStaticInObject;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundStatic;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundInstance;", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method$BoundJvmStaticInObject;", "kotlin-reflection"}, mv = {1, 1, 16})
    public static abstract class g extends i<Method> {

        /* renamed from: e  reason: collision with root package name */
        public final boolean f159e;

        public static final class a extends g implements g {

            /* renamed from: f  reason: collision with root package name */
            public final Object f160f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, null, 4);
                if (method != null) {
                    this.f160f = obj;
                    return;
                }
                a.w.c.i.a("method");
                throw null;
            }

            @Override // a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    return a(this.f160f, objArr);
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class b extends g implements g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, null, 4);
                if (method != null) {
                } else {
                    a.w.c.i.a("method");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    return a(null, objArr);
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class c extends g implements g {

            /* renamed from: f  reason: collision with root package name */
            public final Object f161f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public c(java.lang.reflect.Method r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    if (r5 == 0) goto L_0x002a
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "method.genericParameterTypes"
                    a.w.c.i.a(r0, r1)
                    int r1 = r0.length
                    r2 = 1
                    r3 = 0
                    if (r1 > r2) goto L_0x0013
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r3]
                    goto L_0x001a
                L_0x0013:
                    int r1 = r0.length
                    java.lang.Object[] r0 = a.t.f.a(r0, r2, r1)
                    if (r0 == 0) goto L_0x0022
                L_0x001a:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r4.<init>(r5, r3, r0)
                    r4.f161f = r6
                    return
                L_0x0022:
                    a.n r5 = new a.n
                    java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T>"
                    r5.<init>(r6)
                    throw r5
                L_0x002a:
                    java.lang.String r5 = "method"
                    a.w.c.i.a(r5)
                    r5 = 0
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.g.c.<init>(java.lang.reflect.Method, java.lang.Object):void");
            }

            @Override // a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    u uVar = new u(2);
                    uVar.f2150a.add(this.f161f);
                    uVar.a(objArr);
                    return a(null, uVar.f2150a.toArray(new Object[uVar.a()]));
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class d extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Method method) {
                super(method, false, null, 6);
                if (method != null) {
                } else {
                    a.w.c.i.a("method");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                Object[] objArr2;
                if (objArr != null) {
                    b(objArr);
                    Object obj = objArr[0];
                    if (objArr.length <= 1) {
                        objArr2 = new Object[0];
                    } else {
                        objArr2 = a.t.f.a(objArr, 1, objArr.length);
                        if (objArr2 == null) {
                            throw new n("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    return a(obj, objArr2);
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class e extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, true, null, 4);
                if (method != null) {
                } else {
                    a.w.c.i.a("method");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                Object[] objArr2;
                if (objArr != null) {
                    b(objArr);
                    a(e.f.a.g.c(objArr));
                    if (objArr.length <= 1) {
                        objArr2 = new Object[0];
                    } else {
                        objArr2 = a.t.f.a(objArr, 1, objArr.length);
                        if (objArr2 == null) {
                            throw new n("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    return a(null, objArr2);
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        public static final class f extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, false, null, 6);
                if (method != null) {
                } else {
                    a.w.c.i.a("method");
                    throw null;
                }
            }

            @Override // a.a.a.a.u0.h
            public Object a(Object[] objArr) {
                if (objArr != null) {
                    b(objArr);
                    return a(null, objArr);
                }
                a.w.c.i.a("args");
                throw null;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public g(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "method.genericReturnType"
                a.w.c.i.a(r2, r0)
                if (r8 == 0) goto L_0x0010
                java.lang.Class r8 = r7.getDeclaringClass()
                goto L_0x0011
            L_0x0010:
                r8 = 0
            L_0x0011:
                r3 = r8
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.f152c
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = a.w.c.i.a(r7, r8)
                r6.f159e = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ g(java.lang.reflect.Method r2, boolean r3, java.lang.reflect.Type[] r4, int r5) {
            /*
                r1 = this;
                r0 = r5 & 2
                if (r0 == 0) goto L_0x000e
                int r3 = r2.getModifiers()
                boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
                r3 = r3 ^ 1
            L_0x000e:
                r5 = r5 & 4
                if (r5 == 0) goto L_0x001b
                java.lang.reflect.Type[] r4 = r2.getGenericParameterTypes()
                java.lang.String r5 = "method.genericParameterTypes"
                a.w.c.i.a(r4, r5)
            L_0x001b:
                r1.<init>(r2, r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.g.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[], int):void");
        }

        public final Object a(Object obj, Object[] objArr) {
            if (objArr != null) {
                return this.f159e ? q.f2100a : ((Method) this.b).invoke(obj, Arrays.copyOf(objArr, objArr.length));
            }
            a.w.c.i.a("args");
            throw null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r1 != null) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ i(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4, a.w.c.f r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f152c = r2
            r0.f153d = r3
            if (r3 == 0) goto L_0x002e
            a.w.c.u r1 = new a.w.c.u
            r2 = 2
            r1.<init>(r2)
            java.util.ArrayList<java.lang.Object> r2 = r1.f2150a
            r2.add(r3)
            r1.a(r4)
            int r2 = r1.a()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.util.ArrayList<java.lang.Object> r1 = r1.f2150a
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            java.util.List r1 = e.f.a.g.g(r1)
            if (r1 == 0) goto L_0x002e
            goto L_0x0032
        L_0x002e:
            java.util.List r1 = e.f.a.g.k(r4)
        L_0x0032:
            r0.f151a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.u0.i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[], a.w.c.f):void");
    }

    public final void a(Object obj) {
        if (obj == null || !this.b.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public void b(Object[] objArr) {
        if (objArr != null) {
            e.f.a.g.a(this, objArr);
        } else {
            a.w.c.i.a("args");
            throw null;
        }
    }

    @Override // a.a.a.a.u0.h
    public final Type h() {
        return this.f152c;
    }

    @Override // a.a.a.a.u0.h
    public List<Type> i() {
        return this.f151a;
    }

    @Override // a.a.a.a.u0.h
    public final M j() {
        return this.b;
    }
}
