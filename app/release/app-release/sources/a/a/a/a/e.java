package a.a.a.a;

import a.a.a.a.v0.e.y0.g.e;
import a.g;
import a.t.f;
import a.w.b.l;
import a.w.c.i;
import a.w.c.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@g(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "kotlin-reflection"}, mv = {1, 1, 16})
public abstract class e {

    @g(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, mv = {1, 1, 16})
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final List<Method> f60a;
        public final Class<?> b;

        /* renamed from: a.a.a.a.e$a$a  reason: collision with other inner class name */
        public static final class C0004a<T> implements Comparator<T> {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                T t3 = t;
                i.a((Object) t3, "it");
                String name = t3.getName();
                T t4 = t2;
                i.a((Object) t4, "it");
                return e.f.a.g.a(name, t4.getName());
            }
        }

        public static final class b extends j implements l<Method, String> {

            /* renamed from: c  reason: collision with root package name */
            public static final b f61c = new b();

            public b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public String a(Method method) {
                Method method2 = method;
                i.a((Object) method2, "it");
                Class<?> returnType = method2.getReturnType();
                i.a((Object) returnType, "it.returnType");
                return a.a.a.a.v0.b.e1.b.b.c(returnType);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Class<?> cls) {
            super(null);
            if (cls != null) {
                this.b = cls;
                Object[] declaredMethods = cls.getDeclaredMethods();
                i.a((Object) declaredMethods, "jClass.declaredMethods");
                C0004a aVar = new C0004a();
                if (!(declaredMethods.length == 0)) {
                    declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
                    i.a((Object) declaredMethods, "java.util.Arrays.copyOf(this, size)");
                    f.a(declaredMethods, aVar);
                }
                this.f60a = f.a(declaredMethods);
                return;
            }
            i.a("jClass");
            throw null;
        }

        @Override // a.a.a.a.e
        public String a() {
            return f.a(this.f60a, "", "<init>(", ")V", 0, (CharSequence) null, b.f61c, 24);
        }
    }

    @g(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflection"}, mv = {1, 1, 16})
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Constructor<?> f62a;

        public static final class a extends j implements l<Class<?>, String> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f63c = new a();

            public a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public String a(Class<?> cls) {
                Class<?> cls2 = cls;
                i.a((Object) cls2, "it");
                return a.a.a.a.v0.b.e1.b.b.c(cls2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor<?> constructor) {
            super(null);
            if (constructor != null) {
                this.f62a = constructor;
                return;
            }
            i.a("constructor");
            throw null;
        }

        @Override // a.a.a.a.e
        public String a() {
            Class<?>[] parameterTypes = this.f62a.getParameterTypes();
            i.a((Object) parameterTypes, "constructor.parameterTypes");
            return e.f.a.g.a(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, a.f63c, 24);
        }
    }

    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Method f64a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            if (method != null) {
                this.f64a = method;
                return;
            }
            i.a("method");
            throw null;
        }

        @Override // a.a.a.a.e
        public String a() {
            return e.f.a.g.a(this.f64a);
        }
    }

    public static final class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final String f65a;
        public final e.b b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e.b bVar) {
            super(null);
            if (bVar != null) {
                this.b = bVar;
                this.f65a = bVar.a();
                return;
            }
            i.a("signature");
            throw null;
        }

        @Override // a.a.a.a.e
        public String a() {
            return this.f65a;
        }
    }

    /* renamed from: a.a.a.a.e$e  reason: collision with other inner class name */
    public static final class C0005e extends e {

        /* renamed from: a  reason: collision with root package name */
        public final String f66a;
        public final e.b b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0005e(e.b bVar) {
            super(null);
            if (bVar != null) {
                this.b = bVar;
                this.f66a = bVar.a();
                return;
            }
            i.a("signature");
            throw null;
        }

        @Override // a.a.a.a.e
        public String a() {
            return this.f66a;
        }
    }

    public /* synthetic */ e(a.w.c.f fVar) {
    }

    public abstract String a();
}
