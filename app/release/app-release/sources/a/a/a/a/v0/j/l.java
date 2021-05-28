package a.a.a.a.v0.j;

import a.a.a.a.v0.b.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.f0;
import a.a.a.a.v0.b.h0;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.o;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.b.s;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.z0;
import a.a.a.a.v0.j.h;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.i1.d;
import a.a.a.a.v0.m.i1.f;
import a.a.a.a.v0.m.i1.g;
import a.a.a.a.v0.m.i1.n;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.o.m;
import a.q;
import a.t.f;
import a.w.c.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;

public class l {

    /* renamed from: c */
    public static final List<h> f1555c = f.g(ServiceLoader.load(h.class, h.class.getClassLoader()));

    /* renamed from: d */
    public static final l f1556d;

    /* renamed from: e */
    public static final d.a f1557e;

    /* renamed from: a */
    public final a.a.a.a.v0.m.i1.f f1558a;
    public final d.a b;

    public static class a implements d.a {
        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.m.i1.d.a
        public boolean a(s0 s0Var, s0 s0Var2) {
            if (s0Var == null) {
                a(0);
                throw null;
            } else if (s0Var2 != null) {
                return s0Var.equals(s0Var2);
            } else {
                a(1);
                throw null;
            }
        }
    }

    public class b implements d.a {

        /* renamed from: a */
        public final /* synthetic */ Map f1559a;

        public b(Map map) {
            l.this = r1;
            this.f1559a = map;
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$3";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // a.a.a.a.v0.m.i1.d.a
        public boolean a(s0 s0Var, s0 s0Var2) {
            if (s0Var == null) {
                a(0);
                throw null;
            } else if (s0Var2 == null) {
                a(1);
                throw null;
            } else if (l.this.b.a(s0Var, s0Var2)) {
                return true;
            } else {
                s0 s0Var3 = (s0) this.f1559a.get(s0Var);
                s0 s0Var4 = (s0) this.f1559a.get(s0Var2);
                if ((s0Var3 == null || !s0Var3.equals(s0Var2)) && (s0Var4 == null || !s0Var4.equals(s0Var))) {
                    return false;
                }
                return true;
            }
        }
    }

    public static class c implements a.w.b.l<a.a.a.a.v0.b.b, a.a.a.a.v0.b.a> {
        @Override // a.w.b.l
        public a.a.a.a.v0.b.a a(a.a.a.a.v0.b.b bVar) {
            return bVar;
        }
    }

    public static class d {
        public static final d b = new d(a.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        public final a f1560a;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public d(a aVar, String str) {
            if (aVar == null) {
                a(3);
                throw null;
            } else if (str != null) {
                this.f1560a = aVar;
            } else {
                a(4);
                throw null;
            }
        }

        public static d a(String str) {
            if (str != null) {
                return new d(a.CONFLICT, str);
            }
            a(2);
            throw null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void a(int r10) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.l.d.a(int):void");
        }

        public static d b(String str) {
            if (str != null) {
                return new d(a.INCOMPATIBLE, str);
            }
            a(1);
            throw null;
        }

        public a a() {
            a aVar = this.f1560a;
            if (aVar != null) {
                return aVar;
            }
            a(5);
            throw null;
        }
    }

    static {
        a aVar = new a();
        f1557e = aVar;
        f1556d = new l(aVar, f.a.f1873a);
    }

    public l(d.a aVar, a.a.a.a.v0.m.i1.f fVar) {
        if (aVar == null) {
            a(2);
            throw null;
        } else if (fVar != null) {
            this.b = aVar;
            this.f1558a = fVar;
        } else {
            a(3);
            throw null;
        }
    }

    public static <H> Collection<H> a(H h2, Collection<H> collection, a.w.b.l<H, a.a.a.a.v0.b.a> lVar, a.w.b.l<H, q> lVar2) {
        if (h2 == null) {
            a(94);
            throw null;
        } else if (collection == null) {
            a(95);
            throw null;
        } else if (lVar == null) {
            a(96);
            throw null;
        } else if (lVar2 != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h2);
            a.a.a.a.v0.b.a a2 = lVar.a(h2);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                a.a.a.a.v0.b.a a3 = lVar.a(next);
                if (h2 != next) {
                    d.a b2 = b(a2, a3);
                    if (b2 == d.a.OVERRIDABLE) {
                        arrayList.add(next);
                    } else if (b2 == d.a.CONFLICT) {
                        lVar2.a(next);
                    }
                }
                it.remove();
            }
            return arrayList;
        } else {
            a(97);
            throw null;
        }
    }

    public static List<d0> a(a.a.a.a.v0.b.a aVar) {
        i0 g0 = aVar.g0();
        ArrayList arrayList = new ArrayList();
        if (g0 != null) {
            arrayList.add(g0.c());
        }
        for (w0 w0Var : aVar.j()) {
            arrayList.add(w0Var.c());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0057 A[FALL_THROUGH] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0162 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(int r24) {
        /*
        // Method dump skipped, instructions count: 1282
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.l.a(int):void");
    }

    public static void a(a.a.a.a.v0.b.b bVar, Set<a.a.a.a.v0.b.b> set) {
        if (bVar == null) {
            a(13);
            throw null;
        } else if (set == null) {
            a(14);
            throw null;
        } else if (bVar.t().a()) {
            set.add(bVar);
        } else if (!bVar.f().isEmpty()) {
            for (a.a.a.a.v0.b.b bVar2 : bVar.f()) {
                a(bVar2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
    }

    public static void a(Collection<a.a.a.a.v0.b.b> collection, e eVar, k kVar) {
        v vVar;
        v o;
        if (collection == null) {
            a(80);
            throw null;
        } else if (eVar == null) {
            a(81);
            throw null;
        } else if (kVar == null) {
            a(82);
            throw null;
        } else if (eVar == null) {
            a(91);
            throw null;
        } else if (collection != null) {
            List a2 = a.t.f.a((Iterable) collection, (a.w.b.l) new m(eVar));
            boolean isEmpty = a2.isEmpty();
            List list = isEmpty ? collection : a2;
            Iterator<? extends a.a.a.a.v0.b.b> it = list.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (true) {
                if (it.hasNext()) {
                    a.a.a.a.v0.b.b next = it.next();
                    int ordinal = next.o().ordinal();
                    if (ordinal == 0) {
                        o = v.FINAL;
                        if (o == null) {
                            a(85);
                            throw null;
                        }
                    } else if (ordinal == 1) {
                        throw new IllegalStateException("Member cannot have SEALED modality: " + next);
                    } else if (ordinal == 2) {
                        z2 = true;
                    } else if (ordinal == 3) {
                        z3 = true;
                    }
                } else {
                    boolean z4 = (!eVar.D() || eVar.o() == v.ABSTRACT || eVar.o() == v.SEALED) ? false : true;
                    if (z2 && !z3) {
                        o = v.OPEN;
                        if (o == null) {
                            a(86);
                            throw null;
                        }
                    } else if (z2 || !z3) {
                        HashSet<a.a.a.a.v0.b.b> hashSet = new HashSet();
                        for (a.a.a.a.v0.b.b bVar : list) {
                            if (bVar != null) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                a(bVar, linkedHashSet);
                                hashSet.addAll(linkedHashSet);
                            } else {
                                a(11);
                                throw null;
                            }
                        }
                        if (!hashSet.isEmpty()) {
                            w e2 = a.a.a.a.v0.j.u.a.e((k) hashSet.iterator().next());
                            if (e2 != null) {
                                n nVar = (n) e2.a(g.f1874a);
                                if ((nVar != null ? nVar.f1892a : null) != null) {
                                    z = true;
                                }
                            } else {
                                i.a("$this$isTypeRefinementEnabled");
                                throw null;
                            }
                        }
                        if (hashSet.size() > 1) {
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                Object next2 = it2.next();
                                Iterator it3 = linkedHashSet2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        linkedHashSet2.add(next2);
                                        break;
                                    }
                                    a.a.a.a.v0.b.a aVar = (a.a.a.a.v0.b.a) next2;
                                    a.a.a.a.v0.b.a aVar2 = (a.a.a.a.v0.b.a) it3.next();
                                    if (b(aVar, aVar2, z)) {
                                        it3.remove();
                                    } else if (b(aVar2, aVar, z)) {
                                        break;
                                    }
                                }
                            }
                            hashSet = linkedHashSet2;
                        }
                        v o2 = eVar.o();
                        if (o2 != null) {
                            v vVar2 = v.ABSTRACT;
                            for (a.a.a.a.v0.b.b bVar2 : hashSet) {
                                v o3 = (!z4 || bVar2.o() != v.ABSTRACT) ? bVar2.o() : o2;
                                if (o3.compareTo((Enum) vVar2) < 0) {
                                    vVar2 = o3;
                                }
                            }
                            if (vVar2 != null) {
                                vVar = vVar2;
                            } else {
                                a(90);
                                throw null;
                            }
                        } else {
                            a(89);
                            throw null;
                        }
                    } else {
                        o = z4 ? eVar.o() : v.ABSTRACT;
                        if (o == null) {
                            a(87);
                            throw null;
                        }
                    }
                }
            }
            vVar = o;
            a.a.a.a.v0.b.b a3 = ((a.a.a.a.v0.b.b) a(list, new c())).a(eVar, vVar, isEmpty ? z0.f518h : z0.f517g, b.a.FAKE_OVERRIDE, false);
            kVar.a(a3, list);
            kVar.a(a3);
        } else {
            a(92);
            throw null;
        }
    }

    public static boolean a(a.a.a.a.v0.b.a aVar, d0 d0Var, a.a.a.a.v0.b.a aVar2, d0 d0Var2) {
        if (aVar == null) {
            a(69);
            throw null;
        } else if (d0Var == null) {
            a(70);
            throw null;
        } else if (aVar2 == null) {
            a(71);
            throw null;
        } else if (d0Var2 != null) {
            return f1556d.a(aVar.k(), aVar2.k()).b(d0Var, d0Var2);
        } else {
            a(72);
            throw null;
        }
    }

    public static boolean a(o oVar, o oVar2) {
        if (oVar == null) {
            a(65);
            throw null;
        } else if (oVar2 != null) {
            Integer a2 = z0.a(oVar.g(), oVar2.g());
            return a2 == null || a2.intValue() >= 0;
        } else {
            a(66);
            throw null;
        }
    }

    public static d.a b(a.a.a.a.v0.b.a aVar, a.a.a.a.v0.b.a aVar2) {
        d.a a2 = f1556d.a(aVar2, aVar, (e) null).a();
        d.a a3 = f1556d.a(aVar, aVar2, (e) null).a();
        d.a aVar3 = d.a.OVERRIDABLE;
        if (a2 == aVar3 && a3 == aVar3) {
            return aVar3;
        }
        d.a aVar4 = d.a.CONFLICT;
        return (a2 == aVar4 || a3 == aVar4) ? d.a.CONFLICT : d.a.INCOMPATIBLE;
    }

    public static <D extends a.a.a.a.v0.b.a> boolean b(D d2, D d3, boolean z) {
        if (d2 == null) {
            a(9);
            throw null;
        } else if (d3 == null) {
            a(10);
            throw null;
        } else if (!d2.equals(d3) && e.f1538a.a(d2.a(), d3.a(), z)) {
            return true;
        } else {
            a.a.a.a.v0.b.a a2 = d3.a();
            Iterator it = ((HashSet) g.a((a.a.a.a.v0.b.a) d2)).iterator();
            while (it.hasNext()) {
                if (e.f1538a.a(a2, (a.a.a.a.v0.b.a) it.next(), z)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean c(a.a.a.a.v0.b.a aVar, a.a.a.a.v0.b.a aVar2) {
        if (aVar == null) {
            a(63);
            throw null;
        } else if (aVar2 != null) {
            d0 h2 = aVar.h();
            d0 h3 = aVar2.h();
            if (!a((o) aVar, (o) aVar2)) {
                return false;
            }
            if (aVar instanceof s) {
                return a(aVar, h2, aVar2, h3);
            }
            if (aVar instanceof f0) {
                f0 f0Var = (f0) aVar;
                f0 f0Var2 = (f0) aVar2;
                h0 i = f0Var.i();
                h0 i2 = f0Var2.i();
                if (!((i == null || i2 == null) ? true : a((o) i, (o) i2))) {
                    return false;
                }
                if (f0Var.V() && f0Var2.V()) {
                    return f1556d.a(aVar.k(), aVar2.k()).a(h2, h3);
                }
                if ((f0Var.V() || !f0Var2.V()) && a(aVar, h2, aVar2, h3)) {
                    return true;
                }
                return false;
            }
            StringBuilder a2 = e.a.a.a.a.a("Unexpected callable: ");
            a2.append(aVar.getClass());
            throw new IllegalArgumentException(a2.toString());
        } else {
            a(64);
            throw null;
        }
    }

    public d a(a.a.a.a.v0.b.a aVar, a.a.a.a.v0.b.a aVar2, e eVar) {
        if (aVar == null) {
            a(15);
            throw null;
        } else if (aVar2 != null) {
            d a2 = a(aVar, aVar2, eVar, false);
            if (a2 != null) {
                return a2;
            }
            a(17);
            throw null;
        } else {
            a(16);
            throw null;
        }
    }

    public final a.a.a.a.v0.m.i1.d a(List<r0> list, List<r0> list2) {
        if (list == null) {
            a(38);
            throw null;
        } else if (list2 == null) {
            a(39);
            throw null;
        } else if (list.isEmpty()) {
            return a.a.a.a.v0.m.i1.e.a(this.b);
        } else {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(list.get(i).n(), list2.get(i).n());
            }
            return a.a.a.a.v0.m.i1.e.a(new b(hashMap));
        }
    }

    public final boolean a(d0 d0Var, d0 d0Var2, a.a.a.a.v0.m.i1.d dVar) {
        if (d0Var == null) {
            a(42);
            throw null;
        } else if (d0Var2 == null) {
            a(43);
            throw null;
        } else if (dVar != null) {
            if (e.f.a.g.f(d0Var) && e.f.a.g.f(d0Var2)) {
                return true;
            }
            this.f1558a.a(d0Var);
            this.f1558a.a(d0Var2);
            return dVar.a(d0Var, d0Var2);
        } else {
            a(44);
            throw null;
        }
    }

    public void a(a.a.a.a.v0.f.d dVar, Collection<? extends a.a.a.a.v0.b.b> collection, Collection<? extends a.a.a.a.v0.b.b> collection2, e eVar, k kVar) {
        Integer a2;
        if (dVar == null) {
            a(48);
            throw null;
        } else if (collection == null) {
            a(49);
            throw null;
        } else if (collection2 == null) {
            a(50);
            throw null;
        } else if (eVar == null) {
            a(51);
            throw null;
        } else if (kVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
            Iterator<? extends a.a.a.a.v0.b.b> it = collection2.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    a.a.a.a.v0.b.b bVar = (a.a.a.a.v0.b.b) it.next();
                    if (bVar != null) {
                        ArrayList arrayList = new ArrayList(collection.size());
                        m a3 = m.b.a();
                        for (a.a.a.a.v0.b.b bVar2 : collection) {
                            d.a a4 = a(bVar2, bVar, eVar).a();
                            boolean z2 = !z0.a(bVar2.g()) && z0.a(bVar2, bVar);
                            int ordinal = a4.ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 2) {
                                    if (z2) {
                                        ((j) kVar).a(bVar2, bVar);
                                    }
                                }
                            } else if (z2) {
                                a3.add(bVar2);
                            }
                            arrayList.add(bVar2);
                        }
                        kVar.a(bVar, a3);
                        linkedHashSet.removeAll(arrayList);
                    } else {
                        a(55);
                        throw null;
                    }
                } else {
                    if (linkedHashSet.size() >= 2) {
                        k b2 = ((a.a.a.a.v0.b.b) linkedHashSet.iterator().next()).b();
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (!Boolean.valueOf(((a.a.a.a.v0.b.b) it2.next()).b() == b2).booleanValue()) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            a(Collections.singleton((a.a.a.a.v0.b.b) it3.next()), eVar, kVar);
                        }
                        return;
                    }
                    LinkedList linkedList = new LinkedList(linkedHashSet);
                    while (!linkedList.isEmpty()) {
                        boolean z3 = !linkedList.isEmpty();
                        if (!a.s.f2103a || z3) {
                            Iterator it4 = linkedList.iterator();
                            a.a.a.a.v0.b.b bVar3 = null;
                            while (it4.hasNext()) {
                                a.a.a.a.v0.b.b bVar4 = (a.a.a.a.v0.b.b) it4.next();
                                if (bVar3 == null || ((a2 = z0.a(bVar3.g(), bVar4.g())) != null && a2.intValue() < 0)) {
                                    bVar3 = bVar4;
                                }
                            }
                            if (bVar3 != null) {
                                a(a(bVar3, linkedList, new n(), new o(kVar, bVar3)), eVar, kVar);
                            } else {
                                i.a();
                                throw null;
                            }
                        } else {
                            throw new AssertionError("Assertion failed");
                        }
                    }
                    return;
                }
            }
        } else {
            a(52);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static a.a.a.a.v0.j.l.d a(a.a.a.a.v0.b.a r5, a.a.a.a.v0.b.a r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.l.a(a.a.a.a.v0.b.a, a.a.a.a.v0.b.a):a.a.a.a.v0.j.l$d");
    }

    public d a(a.a.a.a.v0.b.a aVar, a.a.a.a.v0.b.a aVar2, e eVar, boolean z) {
        if (aVar == null) {
            a(18);
            throw null;
        } else if (aVar2 != null) {
            d a2 = a(aVar, aVar2, z);
            boolean z2 = a2.a() == d.a.OVERRIDABLE;
            for (h hVar : f1555c) {
                if (hVar.a() != h.a.CONFLICTS_ONLY && (!z2 || hVar.a() != h.a.SUCCESS_ONLY)) {
                    int ordinal = hVar.a(aVar, aVar2, eVar).ordinal();
                    if (ordinal == 0) {
                        z2 = true;
                    } else if (ordinal == 1) {
                        return d.a("External condition failed");
                    } else {
                        if (ordinal == 2) {
                            return d.b("External condition");
                        }
                    }
                }
            }
            if (!z2) {
                return a2;
            }
            for (h hVar2 : f1555c) {
                if (hVar2.a() == h.a.CONFLICTS_ONLY) {
                    int ordinal2 = hVar2.a(aVar, aVar2, eVar).ordinal();
                    if (ordinal2 == 0) {
                        StringBuilder a3 = e.a.a.a.a.a("Contract violation in ");
                        a3.append(hVar2.getClass().getName());
                        a3.append(" condition. It's not supposed to end with success");
                        throw new IllegalStateException(a3.toString());
                    } else if (ordinal2 == 1) {
                        return d.a("External condition failed");
                    } else {
                        if (ordinal2 == 2) {
                            return d.b("External condition");
                        }
                    }
                }
            }
            d dVar = d.b;
            if (dVar != null) {
                return dVar;
            }
            d.a(0);
            throw null;
        } else {
            a(19);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9 A[LOOP:1: B:18:0x0061->B:40:0x00c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a.a.a.a.v0.j.l.d a(a.a.a.a.v0.b.a r18, a.a.a.a.v0.b.a r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.l.a(a.a.a.a.v0.b.a, a.a.a.a.v0.b.a, boolean):a.a.a.a.v0.j.l$d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(a.a.a.a.v0.b.b r6, a.w.b.l<a.a.a.a.v0.b.b, a.q> r7) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.j.l.a(a.a.a.a.v0.b.b, a.w.b.l):void");
    }

    public static <H> H a(Collection<H> collection, a.w.b.l<H, a.a.a.a.v0.b.a> lVar) {
        H h2;
        boolean z;
        if (collection == null) {
            a(73);
            throw null;
        } else if (lVar == null) {
            a(74);
            throw null;
        } else if (collection.size() == 1) {
            H h3 = (H) a.t.f.b(collection);
            if (h3 != null) {
                return h3;
            }
            a(75);
            throw null;
        } else {
            ArrayList arrayList = new ArrayList(2);
            if (lVar != null) {
                ArrayList arrayList2 = new ArrayList(e.f.a.g.a(collection, 10));
                for (H h4 : collection) {
                    arrayList2.add(lVar.a(h4));
                }
                H h5 = (H) a.t.f.b(collection);
                a.a.a.a.v0.b.a a2 = lVar.a(h5);
                for (H h6 : collection) {
                    a.a.a.a.v0.b.a a3 = lVar.a(h6);
                    if (a3 != null) {
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!c(a3, (a.a.a.a.v0.b.a) it.next())) {
                                    z = false;
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            arrayList.add(h6);
                        }
                        if (c(a3, a2) && !c(a2, a3)) {
                            h5 = h6;
                        }
                    } else {
                        a(67);
                        throw null;
                    }
                }
                if (arrayList.isEmpty()) {
                    if (h5 != null) {
                        return h5;
                    }
                    a(76);
                    throw null;
                } else if (arrayList.size() == 1) {
                    H h7 = (H) a.t.f.b((Iterable) arrayList);
                    if (h7 != null) {
                        return h7;
                    }
                    a(77);
                    throw null;
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            h2 = null;
                            break;
                        }
                        h2 = (H) it2.next();
                        if (!e.f.a.g.g(lVar.a(h2).h())) {
                            break;
                        }
                    }
                    if (h2 != null) {
                        return h2;
                    }
                    H h8 = (H) a.t.f.b((Iterable) arrayList);
                    if (h8 != null) {
                        return h8;
                    }
                    a(79);
                    throw null;
                }
            } else {
                i.a("transform");
                throw null;
            }
        }
    }
}
