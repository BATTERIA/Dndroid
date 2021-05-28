package e.h.a.f0;

import e.f.a.g;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f4691a = new Type[0];

    /* renamed from: e.h.a.f0.a$a  reason: collision with other inner class name */
    public static final class C0142a implements GenericArrayType, Serializable {

        /* renamed from: c  reason: collision with root package name */
        public final Type f4692c;

        public C0142a(Type type) {
            this.f4692c = a.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.a(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.f4692c;
        }

        public int hashCode() {
            return this.f4692c.hashCode();
        }

        public String toString() {
            return a.d(this.f4692c) + "[]";
        }
    }

    public static final class b implements ParameterizedType, Serializable {

        /* renamed from: c  reason: collision with root package name */
        public final Type f4693c;

        /* renamed from: d  reason: collision with root package name */
        public final Type f4694d;

        /* renamed from: e  reason: collision with root package name */
        public final Type[] f4695e;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                g.a(z);
            }
            this.f4693c = type == null ? null : a.a(type);
            this.f4694d = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f4695e = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                g.b(this.f4695e[i]);
                a.b(this.f4695e[i]);
                Type[] typeArr3 = this.f4695e;
                typeArr3[i] = a.a(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.a(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f4695e.clone();
        }

        public Type getOwnerType() {
            return this.f4693c;
        }

        public Type getRawType() {
            return this.f4694d;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f4695e) ^ this.f4694d.hashCode();
            Type type = this.f4693c;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            int length = this.f4695e.length;
            if (length == 0) {
                return a.d(this.f4694d);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.d(this.f4694d));
            sb.append("<");
            sb.append(a.d(this.f4695e[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(a.d(this.f4695e[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class c implements WildcardType, Serializable {

        /* renamed from: c  reason: collision with root package name */
        public final Type f4696c;

        /* renamed from: d  reason: collision with root package name */
        public final Type f4697d;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z = true;
            g.a(typeArr2.length <= 1);
            g.a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                g.b(typeArr2[0]);
                a.b(typeArr2[0]);
                g.a(typeArr[0] != Object.class ? false : z);
                this.f4697d = a.a(typeArr2[0]);
                this.f4696c = Object.class;
                return;
            }
            g.b(typeArr[0]);
            a.b(typeArr[0]);
            this.f4697d = null;
            this.f4696c = a.a(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.a(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f4697d;
            if (type == null) {
                return a.f4691a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.f4696c};
        }

        public int hashCode() {
            Type type = this.f4697d;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f4696c.hashCode() + 31);
        }

        public String toString() {
            Type type;
            StringBuilder sb;
            if (this.f4697d != null) {
                sb = e.a.a.a.a.a("? super ");
                type = this.f4697d;
            } else if (this.f4696c == Object.class) {
                return "?";
            } else {
                sb = e.a.a.a.a.a("? extends ");
                type = this.f4696c;
            }
            sb.append(a.d(type));
            return sb.toString();
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0142a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C0142a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return a(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (!(ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        g.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static void b(Type type) {
        g.a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    public static Class<?> c(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            g.a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return c(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:85:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x004b */
    public static Type a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type a2 = a(type, cls, (Class<?>) cls2);
                    if (a2 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) a2).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type a3 = a(type, cls, componentType, collection);
                        return componentType == a3 ? cls3 : new C0142a(a3);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type a4 = a(type, cls, genericComponentType, collection);
                    return genericComponentType == a4 ? genericArrayType : new C0142a(a4);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type a5 = a(type, cls, ownerType, collection);
                    boolean z = a5 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type a6 = a(type, cls, actualTypeArguments[i], collection);
                        if (a6 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = a6;
                        }
                        i++;
                    }
                    return z ? new b(a5, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type a7 = a(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (a7 != lowerBounds[0]) {
                                return new c(new Type[]{Object.class}, a7 instanceof WildcardType ? ((WildcardType) a7).getLowerBounds() : new Type[]{a7});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type a8 = a(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (a8 != upperBounds[0]) {
                                    return new c(a8 instanceof WildcardType ? ((WildcardType) a8).getUpperBounds() : new Type[]{a8}, f4691a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }
}
