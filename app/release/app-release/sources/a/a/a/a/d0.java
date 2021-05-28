package a.a.a.a;

import a.a.a.a.f0;
import a.a.l;
import a.e;
import a.w.b.a;
import a.w.c.i;
import a.w.c.j;
import e.f.a.g;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public final class d0 extends j implements a<Type> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f56c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f0.a f57d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f58e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f59f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(int i, f0.a aVar, e eVar, l lVar) {
        super(0);
        this.f56c = i;
        this.f57d = aVar;
        this.f58e = eVar;
        this.f59f = lVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public Type a() {
        String str;
        Class cls;
        k0 k0Var = this.f57d.f79c.f77a;
        l lVar = f0.f76d[0];
        Type type = (Type) k0Var.a();
        if (type instanceof Class) {
            Class cls2 = (Class) type;
            cls = cls2.isArray() ? cls2.getComponentType() : Object.class;
            str = "if (javaType.isArray) ja…Type else Any::class.java";
        } else if (type instanceof GenericArrayType) {
            if (this.f56c == 0) {
                cls = ((GenericArrayType) type).getGenericComponentType();
                str = "javaType.genericComponentType";
            } else {
                StringBuilder a2 = e.a.a.a.a.a("Array type has been queried for a non-0th argument: ");
                a2.append(this.f57d.f79c);
                throw new i0(a2.toString());
            }
        } else if (type instanceof ParameterizedType) {
            cls = (Type) ((List) this.f58e.getValue()).get(this.f56c);
            if (cls instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) cls;
                Type[] lowerBounds = wildcardType.getLowerBounds();
                i.a((Object) lowerBounds, "argument.lowerBounds");
                Type type2 = (Type) g.c((Object[]) lowerBounds);
                if (type2 != null) {
                    cls = type2;
                } else {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    i.a((Object) upperBounds, "argument.upperBounds");
                    cls = (Type) g.b((Object[]) upperBounds);
                }
            }
            str = "if (argument !is Wildcar…ument.upperBounds.first()";
        } else {
            StringBuilder a3 = e.a.a.a.a.a("Non-generic type has been queried for arguments: ");
            a3.append(this.f57d.f79c);
            throw new i0(a3.toString());
        }
        i.a((Object) cls, str);
        return cls;
    }
}
