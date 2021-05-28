package androidx.lifecycle;

import d.l.c;
import d.l.e;
import d.l.f;
import d.l.h;
import d.l.l;

public class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f2406a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f2406a = cVarArr;
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        l lVar = new l();
        for (c cVar : this.f2406a) {
            cVar.a(hVar, aVar, false, lVar);
        }
        for (c cVar2 : this.f2406a) {
            cVar2.a(hVar, aVar, true, lVar);
        }
    }
}
