package androidx.lifecycle;

import d.c.a.b.b;
import d.l.e;
import d.l.f;
import d.l.h;
import d.l.i;
import d.l.n;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2408a = new Object();
    public b<n<? super T>, LiveData<T>.a> b = new b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f2409c = 0;

    /* renamed from: d  reason: collision with root package name */
    public volatile Object f2410d = i;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2411e = i;

    /* renamed from: f  reason: collision with root package name */
    public int f2412f = -1;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2413g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2414h;

    public class LifecycleBoundObserver extends LiveData<T>.a implements f {

        /* renamed from: e  reason: collision with root package name */
        public final h f2415e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LiveData f2416f;

        @Override // d.l.f
        public void a(h hVar, e.a aVar) {
            if (((i) this.f2415e.a()).b == e.b.DESTROYED) {
                this.f2416f.a(this.f2417a);
            } else {
                a(((i) this.f2415e.a()).b.a(e.b.STARTED));
            }
        }
    }

    public abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final n<? super T> f2417a;
        public boolean b;

        /* renamed from: c  reason: collision with root package name */
        public int f2418c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ LiveData f2419d;

        public void a(boolean z) {
            if (z != this.b) {
                this.b = z;
                int i = 1;
                boolean z2 = this.f2419d.f2409c == 0;
                LiveData liveData = this.f2419d;
                int i2 = liveData.f2409c;
                if (!this.b) {
                    i = -1;
                }
                liveData.f2409c = i2 + i;
                if (z2 && this.b) {
                    this.f2419d.a();
                }
                LiveData liveData2 = this.f2419d;
                if (liveData2.f2409c == 0 && !this.b) {
                    liveData2.b();
                }
                if (this.b) {
                    this.f2419d.b(this);
                }
            }
        }
    }

    public static void a(String str) {
        if (!d.c.a.a.a.b().f3044a.a()) {
            throw new IllegalStateException(e.a.a.a.a.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public void a() {
    }

    public void b() {
    }

    public void b(LiveData<T>.a aVar) {
        if (this.f2413g) {
            this.f2414h = true;
            return;
        }
        this.f2413g = true;
        do {
            this.f2414h = false;
            if (aVar == null) {
                b<K, V>.d a2 = this.b.a();
                while (a2.hasNext()) {
                    a((a) ((Map.Entry) a2.next()).getValue());
                    if (this.f2414h) {
                        break;
                    }
                }
            } else {
                a(aVar);
                aVar = null;
            }
        } while (this.f2414h);
        this.f2413g = false;
    }

    public final void a(LiveData<T>.a aVar) {
        if (aVar.b) {
            if (!((i) ((LifecycleBoundObserver) aVar).f2415e.a()).b.a(e.b.STARTED)) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.f2418c;
            int i3 = this.f2412f;
            if (i2 < i3) {
                aVar.f2418c = i3;
                aVar.f2417a.a((Object) this.f2410d);
            }
        }
    }

    public void a(n<? super T> nVar) {
        a("removeObserver");
        LiveData<T>.a remove = this.b.remove(nVar);
        if (remove != null) {
            LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver) remove;
            ((i) lifecycleBoundObserver.f2415e.a()).f3558a.remove(lifecycleBoundObserver);
            remove.a(false);
        }
    }
}
