package a.a.a.a.v0.b.e1.b;

import a.a.a.a.v0.d.a.c0.b;
import a.a.a.a.v0.d.a.c0.q;
import a.a.a.a.v0.d.a.c0.v;
import a.a.a.a.v0.d.a.c0.y;
import a.w.c.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

public final class z extends y implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Method f478a;

    public z(Method method) {
        if (method != null) {
            this.f478a = method;
        } else {
            i.a("member");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.a.c0.q
    public b I() {
        Object defaultValue = this.f478a.getDefaultValue();
        if (defaultValue != null) {
            return d.a(defaultValue, null);
        }
        return null;
    }

    @Override // a.a.a.a.v0.d.a.c0.q
    public v h() {
        Type genericReturnType = this.f478a.getGenericReturnType();
        i.a((Object) genericReturnType, "member.genericReturnType");
        return d0.a(genericReturnType);
    }

    @Override // a.a.a.a.v0.d.a.c0.q
    public List<y> j() {
        Type[] genericParameterTypes = this.f478a.getGenericParameterTypes();
        i.a((Object) genericParameterTypes, "member.genericParameterTypes");
        Annotation[][] parameterAnnotations = this.f478a.getParameterAnnotations();
        i.a((Object) parameterAnnotations, "member.parameterAnnotations");
        return a(genericParameterTypes, parameterAnnotations, this.f478a.isVarArgs());
    }

    @Override // a.a.a.a.v0.d.a.c0.x
    public List<e0> k() {
        TypeVariable<Method>[] typeParameters = this.f478a.getTypeParameters();
        i.a((Object) typeParameters, "member.typeParameters");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new e0(typeVariable));
        }
        return arrayList;
    }

    @Override // a.a.a.a.v0.b.e1.b.y
    public Member l() {
        return this.f478a;
    }

    @Override // a.a.a.a.v0.d.a.c0.q
    public boolean z() {
        return I() != null;
    }
}
