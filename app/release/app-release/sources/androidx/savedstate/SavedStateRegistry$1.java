package androidx.savedstate;

import d.l.d;
import d.l.e;
import d.l.h;
import d.p.a;

public class SavedStateRegistry$1 implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2550a;

    public SavedStateRegistry$1(a aVar) {
        this.f2550a = aVar;
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        a aVar2;
        boolean z;
        if (aVar == e.a.ON_START) {
            aVar2 = this.f2550a;
            z = true;
        } else if (aVar == e.a.ON_STOP) {
            aVar2 = this.f2550a;
            z = false;
        } else {
            return;
        }
        aVar2.f3676e = z;
    }
}
