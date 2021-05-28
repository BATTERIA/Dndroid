package androidx.lifecycle;

import d.l.b;
import d.l.e;
import d.l.f;
import d.l.h;

public class FullLifecycleObserverAdapter implements f {

    /* renamed from: a  reason: collision with root package name */
    public final b f2407a;
    public final f b;

    public FullLifecycleObserverAdapter(b bVar, f fVar) {
        this.f2407a = bVar;
        this.b = fVar;
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                this.f2407a.c(hVar);
                break;
            case 1:
                this.f2407a.f(hVar);
                break;
            case 2:
                this.f2407a.a(hVar);
                break;
            case 3:
                this.f2407a.d(hVar);
                break;
            case 4:
                this.f2407a.e(hVar);
                break;
            case 5:
                this.f2407a.b(hVar);
                break;
            case 6:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.b;
        if (fVar != null) {
            fVar.a(hVar, aVar);
        }
    }
}
