package androidx.lifecycle;

import d.l.e;
import d.l.f;
import d.l.h;
import d.l.i;
import d.l.q;
import d.l.u;
import d.l.v;
import d.p.a;
import d.p.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class SavedStateHandleController implements f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2421a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1  reason: invalid class name */
    public final class AnonymousClass1 implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f2422a;
        public final /* synthetic */ d.p.a b;

        @Override // d.l.f
        public void a(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                ((i) this.f2422a).f3558a.remove(this);
                this.b.a(a.class);
            }
        }
    }

    public static final class a implements a.AbstractC0114a {
        @Override // d.p.a.AbstractC0114a
        public void a(c cVar) {
            boolean z;
            if (cVar instanceof v) {
                u e2 = ((v) cVar).e();
                d.p.a c2 = cVar.c();
                if (e2 != null) {
                    Iterator it = new HashSet(e2.f3568a.keySet()).iterator();
                    while (it.hasNext()) {
                        HashMap<String, q> hashMap = e2.f3568a;
                        e a2 = cVar.a();
                        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) hashMap.get((String) it.next()).a("androidx.lifecycle.savedstate.vm.tag");
                        if (savedStateHandleController != null && !(z = savedStateHandleController.f2421a)) {
                            if (z) {
                                throw new IllegalStateException("Already attached to lifecycleOwner");
                            }
                            savedStateHandleController.f2421a = true;
                            a2.a(savedStateHandleController);
                            throw null;
                        }
                    }
                    if (!new HashSet(e2.f3568a.keySet()).isEmpty()) {
                        c2.a(a.class);
                        return;
                    }
                    return;
                }
                throw null;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    @Override // d.l.f
    public void a(h hVar, e.a aVar) {
        if (aVar == e.a.ON_DESTROY) {
            this.f2421a = false;
            ((i) hVar.a()).f3558a.remove(this);
        }
    }
}
