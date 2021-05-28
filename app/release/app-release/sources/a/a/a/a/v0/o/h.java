package a.a.a.a.v0.o;

import a.n;
import a.w.b.a;
import a.w.c.j;
import java.util.ArrayList;
import java.util.Map;

public final class h extends j implements a<String[]> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f1999c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(i iVar) {
        super(0);
        this.f1999c = iVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.w.b.a
    public String[] a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f1999c.f2001a.f2009c);
        k kVar = this.f1999c.b;
        if (kVar != null) {
            StringBuilder a2 = e.a.a.a.a.a("under-migration:");
            a2.append(kVar.f2009c);
            arrayList.add(a2.toString());
        }
        for (Map.Entry<String, k> entry : this.f1999c.f2002c.entrySet()) {
            arrayList.add('@' + entry.getKey() + ':' + entry.getValue().f2009c);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new n("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
