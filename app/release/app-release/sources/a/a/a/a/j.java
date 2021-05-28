package a.a.a.a;

import a.a.a.a.g;
import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.s;
import a.t.f;
import a.w.b.a;
import a.w.c.i;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;

public final class j extends a.w.c.j implements a<Type> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.c f92c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(g.c cVar) {
        super(0);
        this.f92c = cVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public Type a() {
        Type[] lowerBounds;
        g gVar = this.f92c.f84c;
        b e2 = gVar.e();
        Type type = null;
        if (!(e2 instanceof s)) {
            e2 = null;
        }
        s sVar = (s) e2;
        if (sVar != null && sVar.M()) {
            Object d2 = f.d((List) gVar.b().i());
            if (!(d2 instanceof ParameterizedType)) {
                d2 = null;
            }
            ParameterizedType parameterizedType = (ParameterizedType) d2;
            if (i.a(parameterizedType != null ? parameterizedType.getRawType() : null, a.u.a.class)) {
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                i.a((Object) actualTypeArguments, "continuationType.actualTypeArguments");
                Object j = e.f.a.g.j(actualTypeArguments);
                if (!(j instanceof WildcardType)) {
                    j = null;
                }
                WildcardType wildcardType = (WildcardType) j;
                if (!(wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null)) {
                    type = (Type) e.f.a.g.b((Object[]) lowerBounds);
                }
            }
        }
        return type != null ? type : this.f92c.f84c.b().h();
    }
}
