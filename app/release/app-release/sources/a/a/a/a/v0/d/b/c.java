package a.a.a.a.v0.d.b;

import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.d.b.l;
import a.a.a.a.v0.e.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.f;
import a.a.a.a.v0.j.s.g;
import a.a.a.a.v0.j.s.h;
import a.a.a.a.v0.j.s.k;
import a.a.a.a.v0.j.s.l;
import a.a.a.a.v0.j.s.u;
import a.a.a.a.v0.k.b.e;
import a.a.a.a.v0.l.j;
import a.a.a.a.v0.m.d0;
import a.w.c.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c extends a<a.a.a.a.v0.b.b1.c, g<?>> {

    /* renamed from: d  reason: collision with root package name */
    public final e f888d;

    /* renamed from: e  reason: collision with root package name */
    public final w f889e;

    /* renamed from: f  reason: collision with root package name */
    public final x f890f;

    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap<d, g<?>> f891a = new HashMap<>();
        public final /* synthetic */ c b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.b.e f892c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ List f893d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ m0 f894e;

        /* renamed from: a.a.a.a.v0.d.b.c$a$a  reason: collision with other inner class name */
        public static final class C0034a implements l.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ l.a f895a;
            public final /* synthetic */ a b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ l.a f896c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ d f897d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ ArrayList f898e;

            public C0034a(a aVar, l.a aVar2, d dVar, ArrayList arrayList) {
                this.b = aVar;
                this.f896c = aVar2;
                this.f897d = dVar;
                this.f898e = arrayList;
                this.f895a = aVar2;
            }

            @Override // a.a.a.a.v0.d.b.l.a
            public l.a a(d dVar, a.a.a.a.v0.f.a aVar) {
                if (dVar == null) {
                    i.a("name");
                    throw null;
                } else if (aVar != null) {
                    return this.f895a.a(dVar, aVar);
                } else {
                    i.a("classId");
                    throw null;
                }
            }

            @Override // a.a.a.a.v0.d.b.l.a
            public void a(d dVar, Object obj) {
                this.f895a.a(dVar, obj);
            }

            @Override // a.a.a.a.v0.d.b.l.a
            public l.b a(d dVar) {
                if (dVar != null) {
                    return this.f895a.a(dVar);
                }
                i.a("name");
                throw null;
            }

            @Override // a.a.a.a.v0.d.b.l.a
            public void a(d dVar, f fVar) {
                if (dVar == null) {
                    i.a("name");
                    throw null;
                } else if (fVar != null) {
                    this.f895a.a(dVar, fVar);
                } else {
                    i.a("value");
                    throw null;
                }
            }

            @Override // a.a.a.a.v0.d.b.l.a
            public void a() {
                this.f896c.a();
                this.b.f891a.put(this.f897d, new a.a.a.a.v0.j.s.a((a.a.a.a.v0.b.b1.c) a.t.f.e((List) this.f898e)));
            }

            @Override // a.a.a.a.v0.d.b.l.a
            public void a(d dVar, a.a.a.a.v0.f.a aVar, d dVar2) {
                if (dVar == null) {
                    i.a("name");
                    throw null;
                } else if (aVar == null) {
                    i.a("enumClassId");
                    throw null;
                } else if (dVar2 != null) {
                    this.f895a.a(dVar, aVar, dVar2);
                } else {
                    i.a("enumEntryName");
                    throw null;
                }
            }
        }

        public a(c cVar, a.a.a.a.v0.b.e eVar, List list, m0 m0Var) {
            this.b = cVar;
            this.f892c = eVar;
            this.f893d = list;
            this.f894e = m0Var;
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public l.a a(d dVar, a.a.a.a.v0.f.a aVar) {
            if (dVar == null) {
                i.a("name");
                throw null;
            } else if (aVar != null) {
                ArrayList arrayList = new ArrayList();
                c cVar = this.b;
                m0 m0Var = m0.f491a;
                i.a((Object) m0Var, "SourceElement.NO_SOURCE");
                return new C0034a(this, cVar.a(aVar, m0Var, arrayList), dVar, arrayList);
            } else {
                i.a("classId");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a() {
            this.f893d.add(new a.a.a.a.v0.b.b1.d(this.f892c.v(), this.f891a, this.f894e));
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(d dVar, Object obj) {
            if (dVar != null) {
                this.f891a.put(dVar, b(dVar, obj));
            }
        }

        public final g<?> b(d dVar, Object obj) {
            g<?> a2 = a.a.a.a.v0.j.s.i.a(obj);
            if (a2 != null) {
                return a2;
            }
            String str = "Unsupported annotation argument: " + dVar;
            if (str != null) {
                return new l.a(str);
            }
            i.a("message");
            throw null;
        }

        public static final class b implements l.b {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<g<?>> f899a = new ArrayList<>();
            public final /* synthetic */ a b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ d f900c;

            public b(a aVar, d dVar) {
                this.b = aVar;
                this.f900c = dVar;
            }

            @Override // a.a.a.a.v0.d.b.l.b
            public void a(Object obj) {
                this.f899a.add(this.b.b(this.f900c, obj));
            }

            @Override // a.a.a.a.v0.d.b.l.b
            public void a(f fVar) {
                if (fVar != null) {
                    this.f899a.add(new u(fVar));
                } else {
                    i.a("value");
                    throw null;
                }
            }

            @Override // a.a.a.a.v0.d.b.l.b
            public void a() {
                w0 a2 = e.f.a.g.a(this.f900c, this.b.f892c);
                if (a2 != null) {
                    HashMap<d, g<?>> hashMap = this.b.f891a;
                    d dVar = this.f900c;
                    List a3 = a.a.a.a.v0.m.l1.a.a(this.f899a);
                    d0 c2 = a2.c();
                    i.a((Object) c2, "parameter.type");
                    if (a3 != null) {
                        hashMap.put(dVar, new a.a.a.a.v0.j.s.b(a3, new h(c2)));
                    } else {
                        i.a("value");
                        throw null;
                    }
                }
            }

            @Override // a.a.a.a.v0.d.b.l.b
            public void a(a.a.a.a.v0.f.a aVar, d dVar) {
                if (aVar == null) {
                    i.a("enumClassId");
                    throw null;
                } else if (dVar != null) {
                    this.f899a.add(new k(aVar, dVar));
                } else {
                    i.a("enumEntryName");
                    throw null;
                }
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public l.b a(d dVar) {
            if (dVar != null) {
                return new b(this, dVar);
            }
            i.a("name");
            throw null;
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(d dVar, f fVar) {
            if (dVar == null) {
                i.a("name");
                throw null;
            } else if (fVar != null) {
                this.f891a.put(dVar, new u(fVar));
            } else {
                i.a("value");
                throw null;
            }
        }

        @Override // a.a.a.a.v0.d.b.l.a
        public void a(d dVar, a.a.a.a.v0.f.a aVar, d dVar2) {
            if (dVar == null) {
                i.a("name");
                throw null;
            } else if (aVar == null) {
                i.a("enumClassId");
                throw null;
            } else if (dVar2 != null) {
                this.f891a.put(dVar, new k(aVar, dVar2));
            } else {
                i.a("enumEntryName");
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(w wVar, x xVar, j jVar, k kVar) {
        super(jVar, kVar);
        if (wVar == null) {
            i.a("module");
            throw null;
        } else if (xVar == null) {
            i.a("notFoundClasses");
            throw null;
        } else if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (kVar != null) {
            this.f889e = wVar;
            this.f890f = xVar;
            this.f888d = new e(wVar, xVar);
        } else {
            i.a("kotlinClassFinder");
            throw null;
        }
    }

    @Override // a.a.a.a.v0.d.b.a
    public l.a a(a.a.a.a.v0.f.a aVar, m0 m0Var, List<a.a.a.a.v0.b.b1.c> list) {
        if (aVar == null) {
            i.a("annotationClassId");
            throw null;
        } else if (m0Var == null) {
            i.a("source");
            throw null;
        } else if (list != null) {
            return new a(this, e.f.a.g.a(this.f889e, aVar, this.f890f), list, m0Var);
        } else {
            i.a("result");
            throw null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // a.a.a.a.v0.d.b.a
    public a.a.a.a.v0.b.b1.c a(b bVar, a.a.a.a.v0.e.x0.c cVar) {
        if (bVar == null) {
            i.a("proto");
            throw null;
        } else if (cVar != null) {
            return this.f888d.a(bVar, cVar);
        } else {
            i.a("nameResolver");
            throw null;
        }
    }
}
