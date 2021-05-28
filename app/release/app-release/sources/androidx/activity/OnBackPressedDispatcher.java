package androidx.activity;

import d.a.b;
import d.j.d.q;
import d.l.e;
import d.l.f;
import d.l.h;
import d.l.i;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f2240a;
    public final ArrayDeque<b> b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements f, d.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final e f2241a;
        public final b b;

        /* renamed from: c  reason: collision with root package name */
        public d.a.a f2242c;

        public LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            this.f2241a = eVar;
            this.b = bVar;
            eVar.a(this);
        }

        @Override // d.l.f
        public void a(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.b;
                onBackPressedDispatcher.b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.b.add(aVar2);
                this.f2242c = aVar2;
            } else if (aVar == e.a.ON_STOP) {
                d.a.a aVar3 = this.f2242c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == e.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // d.a.a
        public void cancel() {
            ((i) this.f2241a).f3558a.remove(this);
            this.b.b.remove(this);
            d.a.a aVar = this.f2242c;
            if (aVar != null) {
                aVar.cancel();
                this.f2242c = null;
            }
        }
    }

    public class a implements d.a.a {

        /* renamed from: a  reason: collision with root package name */
        public final b f2244a;

        public a(b bVar) {
            this.f2244a = bVar;
        }

        @Override // d.a.a
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.f2244a);
            this.f2244a.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f2240a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f2647a) {
                q qVar = q.this;
                qVar.d(true);
                if (qVar.f3497h.f2647a) {
                    qVar.k();
                    return;
                } else {
                    qVar.f3496g.a();
                    return;
                }
            }
        }
        Runnable runnable = this.f2240a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
