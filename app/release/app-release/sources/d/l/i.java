package d.l;

import d.c.a.b.b;
import d.l.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

public class i extends e {

    /* renamed from: a  reason: collision with root package name */
    public d.c.a.b.a<g, a> f3558a = new d.c.a.b.a<>();
    public e.b b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<h> f3559c;

    /* renamed from: d  reason: collision with root package name */
    public int f3560d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3561e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3562f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<e.b> f3563g = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e.b f3564a;
        public f b;

        public a(g gVar, e.b bVar) {
            this.b = k.a(gVar);
            this.f3564a = bVar;
        }

        public void a(h hVar, e.a aVar) {
            e.b b2 = i.b(aVar);
            this.f3564a = i.a(this.f3564a, b2);
            this.b.a(hVar, aVar);
            this.f3564a = b2;
        }
    }

    public i(h hVar) {
        this.f3559c = new WeakReference<>(hVar);
        this.b = e.b.INITIALIZED;
    }

    public static e.b a(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public static e.a b(e.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return e.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return e.a.ON_START;
        }
        if (ordinal == 3) {
            return e.a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    public static e.b b(e.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return e.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return e.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return e.b.STARTED;
        }
        return e.b.CREATED;
    }

    public final void a() {
        ArrayList<e.b> arrayList = this.f3563g;
        arrayList.remove(arrayList.size() - 1);
    }

    public void a(e.a aVar) {
        a(b(aVar));
    }

    public final void a(e.b bVar) {
        if (this.b != bVar) {
            this.b = bVar;
            if (this.f3561e || this.f3560d != 0) {
                this.f3562f = true;
                return;
            }
            this.f3561e = true;
            b();
            this.f3561e = false;
        }
    }

    @Override // d.l.e
    public void a(g gVar) {
        h hVar;
        e.b bVar = this.b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        a aVar = new a(gVar, bVar2);
        if (this.f3558a.b(gVar, aVar) == null && (hVar = this.f3559c.get()) != null) {
            boolean z = this.f3560d != 0 || this.f3561e;
            e.b b2 = b(gVar);
            this.f3560d++;
            while (aVar.f3564a.compareTo((Enum) b2) < 0 && this.f3558a.f3047g.containsKey(gVar)) {
                this.f3563g.add(aVar.f3564a);
                aVar.a(hVar, b(aVar.f3564a));
                a();
                b2 = b(gVar);
            }
            if (!z) {
                b();
            }
            this.f3560d--;
        }
    }

    public final e.b b(g gVar) {
        d.c.a.b.a<g, a> aVar = this.f3558a;
        e.b bVar = null;
        b.c<K, V> cVar = aVar.f3047g.containsKey(gVar) ? aVar.f3047g.get(gVar).f3055f : null;
        e.b bVar2 = cVar != null ? ((a) cVar.getValue()).f3564a : null;
        if (!this.f3563g.isEmpty()) {
            ArrayList<e.b> arrayList = this.f3563g;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return a(a(this.b, bVar2), bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: d.c.a.b.a<d.l.g, d.l.i$a> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: d.c.a.b.a<d.l.g, d.l.i$a> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        e.a aVar;
        e.b bVar;
        h hVar = this.f3559c.get();
        if (hVar != null) {
            while (true) {
                d.c.a.b.a<g, a> aVar2 = this.f3558a;
                boolean z = aVar2.f3051f == 0 || (aVar2.f3048c.getValue().f3564a == (bVar = this.f3558a.f3049d.getValue().f3564a) && this.b == bVar);
                this.f3562f = false;
                if (!z) {
                    if (this.b.compareTo((Enum) this.f3558a.f3048c.getValue().f3564a) < 0) {
                        d.c.a.b.a<g, a> aVar3 = this.f3558a;
                        b.C0094b bVar2 = new b.C0094b(aVar3.f3049d, aVar3.f3048c);
                        aVar3.f3050e.put(bVar2, false);
                        while (bVar2.hasNext() && !this.f3562f) {
                            Map.Entry entry = (Map.Entry) bVar2.next();
                            a aVar4 = (a) entry.getValue();
                            while (aVar4.f3564a.compareTo((Enum) this.b) > 0 && !this.f3562f && this.f3558a.contains(entry.getKey())) {
                                e.b bVar3 = aVar4.f3564a;
                                int ordinal = bVar3.ordinal();
                                if (ordinal == 0) {
                                    throw new IllegalArgumentException();
                                } else if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        aVar = e.a.ON_DESTROY;
                                    } else if (ordinal == 3) {
                                        aVar = e.a.ON_STOP;
                                    } else if (ordinal == 4) {
                                        aVar = e.a.ON_PAUSE;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected state value " + bVar3);
                                    }
                                    this.f3563g.add(b(aVar));
                                    aVar4.a(hVar, aVar);
                                    a();
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar = this.f3558a.f3049d;
                    if (!this.f3562f && cVar != null && this.b.compareTo((Enum) cVar.getValue().f3564a) > 0) {
                        b<K, V>.d a2 = this.f3558a.a();
                        while (a2.hasNext() && !this.f3562f) {
                            Map.Entry entry2 = (Map.Entry) a2.next();
                            a aVar5 = (a) entry2.getValue();
                            while (aVar5.f3564a.compareTo((Enum) this.b) < 0 && !this.f3562f && this.f3558a.contains(entry2.getKey())) {
                                this.f3563g.add(aVar5.f3564a);
                                aVar5.a(hVar, b(aVar5.f3564a));
                                a();
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
