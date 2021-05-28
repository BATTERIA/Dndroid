package a.a.a.a.v0.b.d1;

import a.a.a.a.v0.b.a1;
import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.j.w.j;
import a.a.a.a.v0.l.g;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.n;
import a.a.a.a.v0.m.s0;
import a.w.b.l;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class q extends j {
    public final s0 j;
    public final i k;
    public final g<Set<d>> l;
    public final h m;

    public class a extends j {
        public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.d, Collection<? extends l0>> b;

        /* renamed from: c  reason: collision with root package name */
        public final a.a.a.a.v0.l.d<a.a.a.a.v0.f.d, Collection<? extends f0>> f405c;

        /* renamed from: d  reason: collision with root package name */
        public final g<Collection<k>> f406d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ q f407e;

        /* renamed from: a.a.a.a.v0.b.d1.q$a$a  reason: collision with other inner class name */
        public class C0019a implements l<a.a.a.a.v0.f.d, Collection<? extends l0>> {
            public C0019a(q qVar) {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public Collection<? extends l0> a(a.a.a.a.v0.f.d dVar) {
                a.a.a.a.v0.f.d dVar2 = dVar;
                a aVar = a.this;
                if (aVar == null) {
                    throw null;
                } else if (dVar2 != null) {
                    return aVar.a(dVar2, aVar.c().a(dVar2, a.a.a.a.v0.c.a.d.i));
                } else {
                    a.a(8);
                    throw null;
                }
            }
        }

        public class b implements l<a.a.a.a.v0.f.d, Collection<? extends f0>> {
            public b(q qVar) {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // a.w.b.l
            public Collection<? extends f0> a(a.a.a.a.v0.f.d dVar) {
                a.a.a.a.v0.f.d dVar2 = dVar;
                a aVar = a.this;
                if (aVar == null) {
                    throw null;
                } else if (dVar2 != null) {
                    return aVar.a(dVar2, aVar.c().c(dVar2, a.a.a.a.v0.c.a.d.i));
                } else {
                    a.a(4);
                    throw null;
                }
            }
        }

        public class c implements a.w.b.a<Collection<k>> {
            public c(q qVar) {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // a.w.b.a
            public Collection<k> a() {
                a aVar = a.this;
                if (aVar != null) {
                    HashSet hashSet = new HashSet();
                    for (a.a.a.a.v0.f.d dVar : (Set) aVar.f407e.l.a()) {
                        hashSet.addAll(aVar.a(dVar, a.a.a.a.v0.c.a.d.i));
                        hashSet.addAll(aVar.c(dVar, a.a.a.a.v0.c.a.d.i));
                    }
                    return hashSet;
                }
                throw null;
            }
        }

        public class d extends a.a.a.a.v0.j.j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Set f411a;

            public d(a aVar, Set set) {
                this.f411a = set;
            }

            public static /* synthetic */ void a(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // a.a.a.a.v0.j.k
            public void a(a.a.a.a.v0.b.b bVar) {
                if (bVar != null) {
                    a.a.a.a.v0.j.l.a(bVar, (l<a.a.a.a.v0.b.b, a.q>) null);
                    this.f411a.add(bVar);
                    return;
                }
                a(0);
                throw null;
            }

            @Override // a.a.a.a.v0.j.j
            public void a(a.a.a.a.v0.b.b bVar, a.a.a.a.v0.b.b bVar2) {
                if (bVar == null) {
                    a(1);
                    throw null;
                } else if (bVar2 == null) {
                    a(2);
                    throw null;
                }
            }
        }

        public a(q qVar, a.a.a.a.v0.l.j jVar) {
            if (jVar != null) {
                this.f407e = qVar;
                this.b = jVar.a(new C0019a(qVar));
                this.f405c = jVar.a(new b(qVar));
                this.f406d = jVar.a(new c(qVar));
                return;
            }
            a(0);
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0095  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00a0  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00be  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void a(int r13) {
            /*
            // Method dump skipped, instructions count: 346
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.b.d1.q.a.a(int):void");
        }

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
        public Collection<? extends l0> a(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(5);
                throw null;
            } else if (bVar != null) {
                Collection<? extends l0> a2 = this.b.a(dVar);
                if (a2 != null) {
                    return a2;
                }
                a(7);
                throw null;
            } else {
                a(6);
                throw null;
            }
        }

        public final <D extends a.a.a.a.v0.b.b> Collection<? extends D> a(a.a.a.a.v0.f.d dVar, Collection<? extends D> collection) {
            if (dVar == null) {
                a(10);
                throw null;
            } else if (collection != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                a.a.a.a.v0.j.l.f1556d.a(dVar, collection, Collections.emptySet(), this.f407e, new d(this, linkedHashSet));
                return linkedHashSet;
            } else {
                a(11);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.k
        public Collection<k> a(a.a.a.a.v0.j.w.d dVar, l<? super a.a.a.a.v0.f.d, Boolean> lVar) {
            if (dVar == null) {
                a(13);
                throw null;
            } else if (lVar != null) {
                Collection<k> collection = (Collection) this.f406d.a();
                if (collection != null) {
                    return collection;
                }
                a(15);
                throw null;
            } else {
                a(14);
                throw null;
            }
        }

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
        public Set<a.a.a.a.v0.f.d> a() {
            Set<a.a.a.a.v0.f.d> set = (Set) this.f407e.l.a();
            if (set != null) {
                return set;
            }
            a(17);
            throw null;
        }

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
        public Set<a.a.a.a.v0.f.d> b() {
            Set<a.a.a.a.v0.f.d> set = (Set) this.f407e.l.a();
            if (set != null) {
                return set;
            }
            a(19);
            throw null;
        }

        public final i c() {
            i u = this.f407e.n().b().iterator().next().u();
            if (u != null) {
                return u;
            }
            a(9);
            throw null;
        }

        @Override // a.a.a.a.v0.j.w.j, a.a.a.a.v0.j.w.i
        public Collection<? extends f0> c(a.a.a.a.v0.f.d dVar, a.a.a.a.v0.c.a.b bVar) {
            if (dVar == null) {
                a(1);
                throw null;
            } else if (bVar != null) {
                Collection<? extends f0> a2 = this.f405c.a(dVar);
                if (a2 != null) {
                    return a2;
                }
                a(3);
                throw null;
            } else {
                a(2);
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(a.a.a.a.v0.l.j jVar, e eVar, d0 d0Var, d dVar, g<Set<d>> gVar, h hVar, m0 m0Var) {
        super(jVar, eVar, dVar, m0Var, false);
        if (jVar == null) {
            a(6);
            throw null;
        } else if (eVar == null) {
            a(7);
            throw null;
        } else if (d0Var == null) {
            a(8);
            throw null;
        } else if (dVar == null) {
            a(9);
            throw null;
        } else if (gVar == null) {
            a(10);
            throw null;
        } else if (hVar == null) {
            a(11);
            throw null;
        } else if (m0Var != null) {
            this.m = hVar;
            this.j = new n(this, Collections.emptyList(), Collections.singleton(d0Var), jVar);
            this.k = new a(this, jVar);
            this.l = gVar;
        } else {
            a(12);
            throw null;
        }
    }

    public static q a(a.a.a.a.v0.l.j jVar, e eVar, d dVar, g<Set<d>> gVar, h hVar, m0 m0Var) {
        if (jVar == null) {
            a(0);
            throw null;
        } else if (eVar == null) {
            a(1);
            throw null;
        } else if (dVar == null) {
            a(2);
            throw null;
        } else if (gVar == null) {
            a(3);
            throw null;
        } else if (hVar == null) {
            a(4);
            throw null;
        } else if (m0Var != null) {
            return new q(jVar, eVar, eVar.v(), dVar, gVar, hVar, m0Var);
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // a.a.a.a.v0.b.e
    public Collection<e> A0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(23);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean D() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean D0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.i
    public boolean E() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean P() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.b.d Y() {
        return null;
    }

    @Override // a.a.a.a.v0.b.e
    public i Z() {
        return i.b.b;
    }

    @Override // a.a.a.a.v0.b.d1.w
    public i a(f fVar) {
        if (fVar != null) {
            i iVar = this.k;
            if (iVar != null) {
                return iVar;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public e d0() {
        return null;
    }

    @Override // a.a.a.a.v0.b.o, a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public a1 g() {
        a1 a1Var = z0.f515e;
        if (a1Var != null) {
            return a1Var;
        }
        a(20);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u
    public boolean m0() {
        return false;
    }

    @Override // a.a.a.a.v0.b.h
    public s0 n() {
        s0 s0Var = this.j;
        if (s0Var != null) {
            return s0Var;
        }
        a(17);
        throw null;
    }

    @Override // a.a.a.a.v0.b.u, a.a.a.a.v0.b.e
    public v o() {
        v vVar = v.FINAL;
        if (vVar != null) {
            return vVar;
        }
        a(19);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public boolean p() {
        return false;
    }

    @Override // a.a.a.a.v0.b.e
    public Collection<a.a.a.a.v0.b.d> q() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(16);
        throw null;
    }

    @Override // a.a.a.a.v0.b.e
    public a.a.a.a.v0.b.f t() {
        a.a.a.a.v0.b.f fVar = a.a.a.a.v0.b.f.ENUM_ENTRY;
        if (fVar != null) {
            return fVar;
        }
        a(18);
        throw null;
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("enum entry ");
        a2.append(d());
        return a2.toString();
    }

    @Override // a.a.a.a.v0.b.e, a.a.a.a.v0.b.i
    public List<r0> x() {
        List<r0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        a(22);
        throw null;
    }

    @Override // a.a.a.a.v0.b.b1.a
    public h y() {
        h hVar = this.m;
        if (hVar != null) {
            return hVar;
        }
        a(21);
        throw null;
    }
}
