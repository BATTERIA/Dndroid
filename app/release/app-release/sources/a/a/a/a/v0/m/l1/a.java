package a.a.a.a.v0.m.l1;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.r0;
import a.a.a.a.v0.j.r.a.b;
import a.a.a.a.v0.m.a1;
import a.a.a.a.v0.m.c1;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.e0;
import a.a.a.a.v0.m.f1;
import a.a.a.a.v0.m.g1;
import a.a.a.a.v0.m.i1.d;
import a.a.a.a.v0.m.k0;
import a.a.a.a.v0.m.m1.e;
import a.a.a.a.v0.m.p0;
import a.a.a.a.v0.m.s0;
import a.a.a.a.v0.m.v0;
import a.a.a.a.v0.m.x;
import a.a.a.a.v0.m.x0;
import a.a.a.a.v0.o.c;
import a.a0.m;
import a.j;
import a.s;
import a.w.b.l;
import a.w.c.i;
import a.z.f;
import a.z.h;
import a.z.n;
import a.z.o;
import a.z.q;
import f.y;
import g.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class a {
    public static <N> Boolean a(Collection<N> collection, c<N> cVar, l<N, Boolean> lVar) {
        if (collection == null) {
            a(7);
            throw null;
        } else if (cVar == null) {
            a(8);
            throw null;
        } else if (lVar != null) {
            return (Boolean) a(collection, cVar, new a.a.a.a.v0.o.a(lVar, new boolean[1]));
        } else {
            a(9);
            throw null;
        }
    }

    public static String a(y yVar) {
        String b = yVar.b();
        String d2 = yVar.d();
        if (d2 == null) {
            return b;
        }
        return b + '?' + d2;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final <T> void a(Collection<T> collection, T t) {
        if (collection == null) {
            i.a("$this$addIfNotNull");
            throw null;
        } else if (t != null) {
            collection.add(t);
        }
    }

    public static final boolean a(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    public static final boolean a(String str, int i, boolean z) {
        char charAt = str.charAt(i);
        return z ? 'A' <= charAt && 'Z' >= charAt : Character.isUpperCase(charAt);
    }

    public static final int b(int i) {
        if (i < 3) {
            return 3;
        }
        return (i / 3) + i + 1;
    }

    public static final v0 b(d0 d0Var) {
        if (d0Var != null) {
            return new x0(d0Var);
        }
        i.a("$this$asTypeProjection");
        throw null;
    }

    public static final int c(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder a2 = e.a.a.a.a.a("radix ", i, " was not in valid range ");
        a2.append(new a.y.c(2, 36));
        throw new IllegalArgumentException(a2.toString());
    }

    public static final <T, R> h<R> c(h<? extends T> hVar, l<? super T, ? extends h<? extends R>> lVar) {
        if (hVar == null) {
            i.a("$this$flatMap");
            throw null;
        } else if (lVar != null) {
            return new f(hVar, lVar, o.f2187c);
        } else {
            i.a("transform");
            throw null;
        }
    }

    public static boolean c(String str) {
        return !str.equals("GET") && !str.equals("HEAD");
    }

    public static String d(int i) {
        StringBuilder sb;
        if (i < 1000 || i >= 5000) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Code must be in range [1000,5000): ");
            sb2.append(i);
            sb = sb2;
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            sb = e.a.a.a.a.a("Code ", i, " is reserved and may not be used.");
        }
        return sb.toString();
    }

    public static final boolean d(d0 d0Var) {
        if (d0Var != null) {
            return c1.d(d0Var);
        }
        i.a("$this$isTypeParameter");
        throw null;
    }

    public static final <T, R> h<R> e(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        if (hVar == null) {
            i.a("$this$mapNotNull");
            throw null;
        } else if (lVar != null) {
            return b(new q(hVar, lVar), n.f2186c);
        } else {
            i.a("transform");
            throw null;
        }
    }

    public static final <K, V> HashMap<K, V> e(int i) {
        return new HashMap<>(b(i));
    }

    public static final <T> void a(Appendable appendable, T t, l<? super T, ? extends CharSequence> lVar) {
        T valueOf;
        if (appendable != null) {
            if (lVar != null) {
                t = (T) lVar.a(t);
            } else {
                if (!(t != null ? t instanceof CharSequence : true)) {
                    if (t instanceof Character) {
                        appendable.append(t.charValue());
                        return;
                    }
                    valueOf = String.valueOf(t);
                    appendable.append(valueOf);
                    return;
                }
            }
            valueOf = t;
            appendable.append(valueOf);
            return;
        }
        i.a("$this$appendElement");
        throw null;
    }

    public static final String b(String str) {
        char charAt;
        if (str != null) {
            if ((str.length() == 0) || 'a' > (charAt = str.charAt(0)) || 'z' < charAt) {
                return str;
            }
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            i.a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return String.valueOf(upperCase) + substring;
        }
        i.a("$this$capitalizeAsciiOnly");
        throw null;
    }

    public static final g c(d0 d0Var) {
        if (d0Var != null) {
            g m = d0Var.I0().m();
            i.a((Object) m, "constructor.builtIns");
            return m;
        }
        i.a("$this$builtIns");
        throw null;
    }

    public static final <T, R> h<R> d(h<? extends T> hVar, l<? super T, ? extends R> lVar) {
        if (hVar == null) {
            i.a("$this$map");
            throw null;
        } else if (lVar != null) {
            return new q(hVar, lVar);
        } else {
            i.a("transform");
            throw null;
        }
    }

    public static final a.a.a.a.v0.m.m1.a<d0> a(d0 d0Var) {
        Object obj;
        e eVar;
        if (d0Var == null) {
            i.a("type");
            throw null;
        } else if (e.f.a.g.g(d0Var)) {
            a.a.a.a.v0.m.m1.a<d0> a2 = a(e.f.a.g.i(d0Var));
            a.a.a.a.v0.m.m1.a<d0> a3 = a(e.f.a.g.m(d0Var));
            return new a.a.a.a.v0.m.m1.a<>(e.f.a.g.a(e0.a(e.f.a.g.i(a2.f1927a), e.f.a.g.m(a3.f1927a)), d0Var), e.f.a.g.a(e0.a(e.f.a.g.i(a2.b), e.f.a.g.m(a3.b)), d0Var));
        } else {
            s0 I0 = d0Var.I0();
            boolean z = true;
            if (e.f.a.g.d(d0Var)) {
                if (I0 != null) {
                    v0 e2 = ((b) I0).e();
                    d0 c2 = e2.c();
                    i.a((Object) c2, "typeProjection.type");
                    d0 b = c1.b(c2, d0Var.J0());
                    i.a((Object) b, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
                    int ordinal = e2.a().ordinal();
                    if (ordinal == 1) {
                        k0 g2 = c(d0Var).g();
                        i.a((Object) g2, "type.builtIns.nullableAnyType");
                        return new a.a.a.a.v0.m.m1.a<>(b, g2);
                    } else if (ordinal == 2) {
                        k0 f2 = c(d0Var).f();
                        i.a((Object) f2, "type.builtIns.nothingType");
                        d0 b2 = c1.b(f2, d0Var.J0());
                        i.a((Object) b2, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
                        return new a.a.a.a.v0.m.m1.a<>(b2, b);
                    } else {
                        throw new AssertionError("Only nontrivial projections should have been captured, not: " + e2);
                    }
                } else {
                    throw new a.n("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
                }
            } else if (d0Var.H0().isEmpty() || d0Var.H0().size() != I0.d().size()) {
                return new a.a.a.a.v0.m.m1.a<>(d0Var, d0Var);
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<v0> H0 = d0Var.H0();
                List<r0> d2 = I0.d();
                i.a((Object) d2, "typeConstructor.parameters");
                Iterator it = ((ArrayList) a.t.f.a((Iterable) H0, (Iterable) d2)).iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    A a4 = jVar.f2088c;
                    B b3 = jVar.f2089d;
                    i.a((Object) b3, "typeParameter");
                    int ordinal2 = a1.a(b3.F(), (v0) a4).ordinal();
                    if (ordinal2 == 0) {
                        d0 c3 = a4.c();
                        i.a((Object) c3, "type");
                        d0 c4 = a4.c();
                        i.a((Object) c4, "type");
                        eVar = new e(b3, c3, c4);
                    } else if (ordinal2 == 1) {
                        d0 c5 = a4.c();
                        i.a((Object) c5, "type");
                        k0 g3 = a.a.a.a.v0.j.u.a.b((k) b3).g();
                        i.a((Object) g3, "typeParameter.builtIns.nullableAnyType");
                        eVar = new e(b3, c5, g3);
                    } else if (ordinal2 == 2) {
                        k0 f3 = a.a.a.a.v0.j.u.a.b((k) b3).f();
                        i.a((Object) f3, "typeParameter.builtIns.nothingType");
                        d0 c6 = a4.c();
                        i.a((Object) c6, "type");
                        eVar = new e(b3, f3, c6);
                    } else {
                        throw new a.h();
                    }
                    if (a4.b()) {
                        arrayList.add(eVar);
                        arrayList2.add(eVar);
                    } else {
                        a.a.a.a.v0.m.m1.a<d0> a5 = a(eVar.b);
                        a.a.a.a.v0.m.m1.a<d0> a6 = a(eVar.f1931c);
                        e eVar2 = new e(eVar.f1930a, a5.b, a6.f1927a);
                        e eVar3 = new e(eVar.f1930a, a5.f1927a, a6.b);
                        arrayList.add(eVar2);
                        arrayList2.add(eVar3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        e eVar4 = (e) it2.next();
                        if (eVar4 != null) {
                            if (!d.f1870a.b(eVar4.b, eVar4.f1931c)) {
                                break;
                            }
                        } else {
                            throw null;
                        }
                    }
                }
                z = false;
                if (z) {
                    obj = c(d0Var).f();
                    i.a(obj, "type.builtIns.nothingType");
                } else {
                    obj = a(d0Var, arrayList);
                }
                return new a.a.a.a.v0.m.m1.a<>(obj, a(d0Var, arrayList2));
            }
        }
    }

    public static final <T> h<T> b(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        if (hVar == null) {
            i.a("$this$filterNot");
            throw null;
        } else if (lVar != null) {
            return new a.z.e(hVar, false, lVar);
        } else {
            i.a("predicate");
            throw null;
        }
    }

    public static final <T> List<T> c(h<? extends T> hVar) {
        if (hVar != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends T> it = hVar.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList;
        }
        i.a("$this$toMutableList");
        throw null;
    }

    public static final d0 e(d0 d0Var) {
        f1 f1Var;
        if (d0Var != null) {
            f1 K0 = d0Var.K0();
            if (K0 instanceof x) {
                x xVar = (x) K0;
                k0 k0Var = xVar.f1956d;
                if (!k0Var.I0().d().isEmpty() && k0Var.I0().c() != null) {
                    List<r0> d2 = k0Var.I0().d();
                    i.a((Object) d2, "constructor.parameters");
                    ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) d2, 10));
                    Iterator<T> it = d2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new p0(it.next()));
                    }
                    k0Var = e.f.a.g.a(k0Var, arrayList, (a.a.a.a.v0.b.b1.h) null, 2);
                }
                k0 k0Var2 = xVar.f1957e;
                if (!k0Var2.I0().d().isEmpty() && k0Var2.I0().c() != null) {
                    List<r0> d3 = k0Var2.I0().d();
                    i.a((Object) d3, "constructor.parameters");
                    ArrayList arrayList2 = new ArrayList(e.f.a.g.a((Iterable) d3, 10));
                    Iterator<T> it2 = d3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new p0(it2.next()));
                    }
                    k0Var2 = e.f.a.g.a(k0Var2, arrayList2, (a.a.a.a.v0.b.b1.h) null, 2);
                }
                f1Var = e0.a(k0Var, k0Var2);
            } else if (K0 instanceof k0) {
                k0 k0Var3 = (k0) K0;
                if (k0Var3.I0().d().isEmpty() || k0Var3.I0().c() == null) {
                    f1Var = k0Var3;
                } else {
                    List<r0> d4 = k0Var3.I0().d();
                    i.a((Object) d4, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(e.f.a.g.a((Iterable) d4, 10));
                    Iterator<T> it3 = d4.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new p0(it3.next()));
                    }
                    f1Var = e.f.a.g.a(k0Var3, arrayList3, (a.a.a.a.v0.b.b1.h) null, 2);
                }
            } else {
                throw new a.h();
            }
            return e.f.a.g.a(f1Var, K0);
        }
        i.a("$this$replaceArgumentsWithStarProjections");
        throw null;
    }

    public static final <T> List<T> b(h<? extends T> hVar) {
        if (hVar != null) {
            return e.f.a.g.c(c(hVar));
        }
        i.a("$this$toList");
        throw null;
    }

    public static final String a(String str) {
        if (str != null) {
            if (!(str.length() > 0) || !Character.isLowerCase(str.charAt(0))) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, 1);
            i.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String upperCase = substring.toUpperCase();
            i.a((Object) upperCase, "(this as java.lang.String).toUpperCase()");
            sb.append(upperCase);
            String substring2 = str.substring(1);
            i.a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring2);
            return sb.toString();
        }
        i.a("$this$capitalize");
        throw null;
    }

    public static final <T> List<T> a(ArrayList<T> arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            if (size == 0) {
                return a.t.l.f2119c;
            }
            if (size == 1) {
                return e.f.a.g.c(a.t.f.a((List) arrayList));
            }
            arrayList.trimToSize();
            return arrayList;
        }
        i.a("$this$compact");
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        if (collection2 == 0) {
            i.a("collection");
            throw null;
        } else if (collection2.isEmpty()) {
            return collection;
        } else {
            if (collection == 0) {
                return collection2;
            }
            if (collection instanceof LinkedHashSet) {
                ((LinkedHashSet) collection).addAll(collection2);
                return collection;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
            linkedHashSet.addAll(collection2);
            return linkedHashSet;
        }
    }

    public static final boolean a(d0 d0Var, l<? super f1, Boolean> lVar) {
        if (d0Var == null) {
            i.a("$this$contains");
            throw null;
        } else if (lVar != null) {
            return c1.a(d0Var, (l<f1, Boolean>) lVar);
        } else {
            i.a("predicate");
            throw null;
        }
    }

    public static final v0 a(d0 d0Var, g1 g1Var, r0 r0Var) {
        g1 g1Var2 = null;
        if (d0Var == null) {
            i.a("type");
            throw null;
        } else if (g1Var != null) {
            if (r0Var != null) {
                g1Var2 = r0Var.F();
            }
            if (g1Var2 == g1Var) {
                g1Var = g1.INVARIANT;
            }
            return new x0(g1Var, d0Var);
        } else {
            i.a("projectionKind");
            throw null;
        }
    }

    public static <N, R> R a(Collection<N> collection, c<N> cVar, a.a.a.a.v0.o.d<N, R> dVar) {
        if (collection == null) {
            a(4);
            throw null;
        } else if (cVar == null) {
            a(5);
            throw null;
        } else if (dVar != null) {
            a.a.a.a.v0.o.f fVar = new a.a.a.a.v0.o.f();
            if (collection == null) {
                a(0);
                throw null;
            } else if (cVar == null) {
                a(1);
                throw null;
            } else if (dVar != null) {
                for (N n : collection) {
                    a(n, cVar, fVar, dVar);
                }
                return dVar.a();
            } else {
                a(3);
                throw null;
            }
        } else {
            a(6);
            throw null;
        }
    }

    public static <N> void a(N n, c<N> cVar, a.a.a.a.v0.o.e<N> eVar, a.a.a.a.v0.o.d<N, ?> dVar) {
        if (n == null) {
            a(22);
            throw null;
        } else if (cVar == null) {
            a(23);
            throw null;
        } else if (eVar == null) {
            a(24);
            throw null;
        } else if (dVar == null) {
            a(25);
            throw null;
        } else if (((a.a.a.a.v0.o.f) eVar).f1995a.add(n) && dVar.b(n)) {
            Iterator<? extends N> it = cVar.a(n).iterator();
            while (it.hasNext()) {
                a(it.next(), cVar, eVar, dVar);
            }
            dVar.a(n);
        }
    }

    public static final <T> h<T> a(h<? extends T> hVar, l<? super T, Boolean> lVar) {
        if (hVar == null) {
            i.a("$this$filter");
            throw null;
        } else if (lVar != null) {
            return new a.z.e(hVar, true, lVar);
        } else {
            i.a("predicate");
            throw null;
        }
    }

    public static final <T> h<T> a(h<? extends h<? extends T>> hVar) {
        if (hVar != null) {
            a.z.i iVar = a.z.i.f2181c;
            if (!(hVar instanceof q)) {
                return new f(hVar, a.z.j.f2182c, iVar);
            }
            q qVar = (q) hVar;
            return new f(qVar.f2193a, qVar.b, iVar);
        }
        i.a("$this$flatten");
        throw null;
    }

    public static final <T> h<T> a(T t, l<? super T, ? extends T> lVar) {
        if (lVar != null) {
            return t == null ? a.z.d.f2165a : new a.z.g(new a.z.l(t), lVar);
        }
        i.a("nextFunction");
        throw null;
    }

    public static final <T> h<T> a(a.w.b.a<? extends T> aVar) {
        if (aVar != null) {
            a.z.g gVar = new a.z.g(aVar, new a.z.k(aVar));
            return gVar instanceof a.z.a ? gVar : new a.z.a(gVar);
        }
        i.a("nextFunction");
        throw null;
    }

    public static final d0 a(r0 r0Var) {
        T t = null;
        if (r0Var != null) {
            List<d0> upperBounds = r0Var.getUpperBounds();
            i.a((Object) upperBounds, "upperBounds");
            boolean z = !upperBounds.isEmpty();
            if (!s.f2103a || z) {
                List<d0> upperBounds2 = r0Var.getUpperBounds();
                i.a((Object) upperBounds2, "upperBounds");
                Iterator<T> it = upperBounds2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    a.a.a.a.v0.b.h c2 = next.I0().c();
                    if (!(c2 instanceof a.a.a.a.v0.b.e)) {
                        c2 = null;
                    }
                    a.a.a.a.v0.b.e eVar = (a.a.a.a.v0.b.e) c2;
                    boolean z2 = false;
                    if (!(eVar == null || eVar.t() == a.a.a.a.v0.b.f.INTERFACE || eVar.t() == a.a.a.a.v0.b.f.ANNOTATION_CLASS)) {
                        z2 = true;
                        continue;
                    }
                    if (z2) {
                        t = next;
                        break;
                    }
                }
                T t2 = t;
                if (t2 != null) {
                    return t2;
                }
                List<d0> upperBounds3 = r0Var.getUpperBounds();
                i.a((Object) upperBounds3, "upperBounds");
                Object a2 = a.t.f.a((List) upperBounds3);
                i.a(a2, "upperBounds.first()");
                return (d0) a2;
            }
            throw new AssertionError("Upper bounds should not be empty: " + r0Var);
        }
        i.a("$this$representativeUpperBound");
        throw null;
    }

    public static final boolean a(Throwable th) {
        if (th != null) {
            Class<?> cls = th.getClass();
            while (!i.a((Object) cls.getCanonicalName(), (Object) "com.intellij.openapi.progress.ProcessCanceledException")) {
                cls = cls.getSuperclass();
                if (cls == null) {
                    return false;
                }
            }
            return true;
        }
        i.a("$this$isProcessCanceledException");
        throw null;
    }

    public static final boolean a(d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            i.a("$this$isSubtypeOf");
            throw null;
        } else if (d0Var2 != null) {
            return d.f1870a.b(d0Var, d0Var2);
        } else {
            i.a("superType");
            throw null;
        }
    }

    public static /* synthetic */ String a(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        if (hVar == null) {
            i.a("$this$joinToString");
            throw null;
        } else if (charSequence == null) {
            i.a("separator");
            throw null;
        } else if (charSequence2 == null) {
            i.a("prefix");
            throw null;
        } else if (charSequence3 == null) {
            i.a("postfix");
            throw null;
        } else if (charSequence4 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence2);
            int i3 = 0;
            for (Object obj : hVar) {
                i3++;
                if (i3 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i3 > i) {
                    break;
                }
                a(sb, obj, lVar);
            }
            if (i >= 0 && i3 > i) {
                sb.append(charSequence4);
            }
            sb.append(charSequence3);
            String sb2 = sb.toString();
            i.a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb2;
        } else {
            i.a("truncated");
            throw null;
        }
    }

    public static final <T> h<T> a(h<? extends T> hVar, T t) {
        if (hVar != null) {
            return a(a(hVar, a(t)));
        }
        i.a("$this$plus");
        throw null;
    }

    public static final boolean a(String str, int i, String str2, int i2, int i3, boolean z) {
        if (str == null) {
            i.a("$this$regionMatches");
            throw null;
        } else if (str2 != null) {
            return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
        } else {
            i.a("other");
            throw null;
        }
    }

    public static /* synthetic */ String a(String str, char c2, char c3, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if (str == null) {
            i.a("$this$replace");
            throw null;
        } else if (!z) {
            String replace = str.replace(c2, c3);
            i.a((Object) replace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return replace;
        } else {
            return a(d(new a.a0.a(str, 0, 0, new a.a0.j(new char[]{c2}, z)), new m(str)), String.valueOf(c3), null, null, 0, null, null, 62);
        }
    }

    public static /* synthetic */ String a(String str, String str2, String str3, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if (str == null) {
            i.a("$this$replace");
            throw null;
        } else if (str2 == null) {
            i.a("oldValue");
            throw null;
        } else if (str3 != null) {
            return a(d(new a.a0.a(str, 0, 0, new a.a0.k(a.t.f.a(new String[]{str2}), z)), new a.a0.l(str)), str3, null, null, 0, null, null, 62);
        } else {
            i.a("newValue");
            throw null;
        }
    }

    public static final d0 a(d0 d0Var, a.a.a.a.v0.b.b1.h hVar) {
        if (d0Var == null) {
            i.a("$this$replaceAnnotations");
            throw null;
        } else if (hVar != null) {
            return (!d0Var.y().isEmpty() || !hVar.isEmpty()) ? d0Var.K0().a(hVar) : d0Var;
        } else {
            i.a("newAnnotations");
            throw null;
        }
    }

    public static final d0 a(d0 d0Var, List<e> list) {
        x0 x0Var;
        x0 x0Var2;
        boolean z = d0Var.H0().size() == list.size();
        if (!s.f2103a || z) {
            ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) list, 10));
            for (T t : list) {
                if (t != null) {
                    boolean b = d.f1870a.b(t.b, t.f1931c);
                    if (!s.f2103a || b) {
                        if (i.a(t.b, t.f1931c)) {
                            x0Var = new x0(t.b);
                        } else {
                            if (g.d(t.b) && t.f1930a.F() != g1.IN_VARIANCE) {
                                g1 g1Var = g1.OUT_VARIANCE;
                                if (g1Var != null) {
                                    if (g1Var == t.f1930a.F()) {
                                        g1Var = g1.INVARIANT;
                                    }
                                    x0Var2 = new x0(g1Var, t.f1931c);
                                } else {
                                    i.a("variance");
                                    throw null;
                                }
                            } else if (g.e(t.f1931c)) {
                                g1 g1Var2 = g1.IN_VARIANCE;
                                if (g1Var2 != null) {
                                    if (g1Var2 == t.f1930a.F()) {
                                        g1Var2 = g1.INVARIANT;
                                    }
                                    x0Var2 = new x0(g1Var2, t.b);
                                } else {
                                    i.a("variance");
                                    throw null;
                                }
                            } else {
                                g1 g1Var3 = g1.OUT_VARIANCE;
                                if (g1Var3 != null) {
                                    if (g1Var3 == t.f1930a.F()) {
                                        g1Var3 = g1.INVARIANT;
                                    }
                                    x0Var2 = new x0(g1Var3, t.f1931c);
                                } else {
                                    i.a("variance");
                                    throw null;
                                }
                            }
                            x0Var = x0Var2;
                        }
                        arrayList.add(x0Var);
                    } else {
                        a.a.a.a.v0.i.c a2 = a.a.a.a.v0.i.c.f1477c.a(a.a.a.a.v0.m.m1.d.f1929c);
                        throw new AssertionError("Only consistent enhanced type projection can be converted to type projection, but " + '[' + a2.a(t.f1930a) + ": <" + a2.a(t.b) + ", " + a2.a(t.f1931c) + ">]" + " was found");
                    }
                } else {
                    throw null;
                }
            }
            return e.f.a.g.a(d0Var, arrayList, d0Var.y());
        }
        throw new AssertionError("Incorrect type arguments " + list);
    }

    public static final <T> h<T> a(T... tArr) {
        if (tArr != null) {
            if (tArr.length == 0) {
                return a.z.d.f2165a;
            }
            return e.f.a.g.a((Object[]) tArr);
        }
        i.a("elements");
        throw null;
    }

    public static /* synthetic */ boolean a(String str, String str2, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        if (str == null) {
            i.a("$this$startsWith");
            throw null;
        } else if (str2 != null) {
            return !z2 ? str.startsWith(str2) : a(str, 0, str2, 0, str2.length(), z2);
        } else {
            i.a("prefix");
            throw null;
        }
    }

    public static final String a(String str, boolean z) {
        if (z) {
            if (str != null) {
                StringBuilder sb = new StringBuilder(str.length());
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if ('A' <= charAt && 'Z' >= charAt) {
                        charAt = Character.toLowerCase(charAt);
                    }
                    sb.append(charAt);
                }
                String sb2 = sb.toString();
                i.a((Object) sb2, "builder.toString()");
                return sb2;
            }
            i.a("$this$toLowerCaseAsciiOnly");
            throw null;
        } else if (str != null) {
            String lowerCase = str.toLowerCase();
            i.a((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } else {
            throw new a.n("null cannot be cast to non-null type java.lang.String");
        }
    }

    public static void a(e.a aVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = aVar.f5433g;
            int i2 = aVar.f5434h;
            int i3 = aVar.i;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            j = aVar.f5432f;
            if (j == aVar.f5429c.f5428d) {
                throw new IllegalStateException();
            }
        } while (aVar.f(j == -1 ? 0 : j + ((long) (aVar.i - aVar.f5434h))) != -1);
    }
}
