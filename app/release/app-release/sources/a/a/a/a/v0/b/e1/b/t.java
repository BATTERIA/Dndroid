package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.k;
import a.a.a.a.v0.d.a.c0.y;
import a.t.f;
import a.t.l;
import a.w.c.i;
import e.a.a.a.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public final class t extends y implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<?> f476a;

    public t(Constructor<?> constructor) {
        if (constructor != null) {
            this.f476a = constructor;
        } else {
            i.a("member");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.k
    public List<y> j() {
        Type[] genericParameterTypes = this.f476a.getGenericParameterTypes();
        i.a((Object) genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return l.f2119c;
        }
        Class<?> declaringClass = this.f476a.getDeclaringClass();
        i.a((Object) declaringClass, "klass");
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) f.a(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = this.f476a.getParameterAnnotations();
        if (parameterAnnotations.length >= genericParameterTypes.length) {
            if (parameterAnnotations.length > genericParameterTypes.length) {
                i.a((Object) parameterAnnotations, "annotations");
                parameterAnnotations = (Annotation[][]) f.a(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
            }
            i.a((Object) genericParameterTypes, "realTypes");
            i.a((Object) parameterAnnotations, "realAnnotations");
            return a(genericParameterTypes, parameterAnnotations, this.f476a.isVarArgs());
        }
        StringBuilder a2 = a.a("Illegal generic signature: ");
        a2.append(this.f476a);
        throw new IllegalStateException(a2.toString());
    }

    @Override // a.a.a.a.v0.d.a.c0.x
    public List<e0> k() {
        TypeVariable<Constructor<?>>[] typeParameters = this.f476a.getTypeParameters();
        i.a((Object) typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new e0(typeVariable));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.e1.b.y
    public Member l() {
        return this.f476a;
    }
}
