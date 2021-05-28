package a.a.a.a.v0.k.b;

import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.d;
import a.a.a.a.v0.b.h;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.w0;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.e.b;
import a.a.a.a.v0.j.s.a0;
import a.a.a.a.v0.j.s.b0;
import a.a.a.a.v0.j.s.c0;
import a.a.a.a.v0.j.s.k;
import a.a.a.a.v0.j.s.l;
import a.a.a.a.v0.j.s.n;
import a.a.a.a.v0.j.s.u;
import a.a.a.a.v0.j.s.v;
import a.a.a.a.v0.j.s.y;
import a.a.a.a.v0.j.s.z;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.k0;
import a.j;
import a.t.f;
import a.t.m;
import a.t.r;
import a.w.c.i;
import e.a.a.a.a;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final w f1674a;
    public final x b;

    public e(w wVar, x xVar) {
        if (wVar == null) {
            i.a("module");
            throw null;
        } else if (xVar != null) {
            this.f1674a = wVar;
            this.b = xVar;
        } else {
            i.a("notFoundClasses");
            throw null;
        }
    }

    public final c a(b bVar, a.a.a.a.v0.e.x0.c cVar) {
        j jVar;
        if (bVar == null) {
            i.a("proto");
            throw null;
        } else if (cVar != null) {
            a.a.a.a.v0.b.e a2 = g.a(this.f1674a, g.a(cVar, bVar.f954e), this.b);
            Map map = m.f2120c;
            if (bVar.f955f.size() != 0 && !a.a.a.a.v0.m.w.a(a2) && a.a.a.a.v0.j.g.h(a2)) {
                Collection<d> q = a2.q();
                i.a((Object) q, "annotationClass.constructors");
                d dVar = (d) f.f(q);
                if (dVar != null) {
                    List<w0> j = dVar.j();
                    i.a((Object) j, "constructor.valueParameters");
                    int e2 = g.e(g.a((Iterable) j, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
                    for (T t : j) {
                        T t2 = t;
                        i.a((Object) t2, "it");
                        linkedHashMap.put(t2.d(), t);
                    }
                    List<b.C0039b> list = bVar.f955f;
                    i.a((Object) list, "proto.argumentList");
                    ArrayList arrayList = new ArrayList();
                    for (T t3 : list) {
                        i.a((Object) t3, "it");
                        w0 w0Var = (w0) linkedHashMap.get(g.b(cVar, t3.f960e));
                        if (w0Var != null) {
                            a.a.a.a.v0.f.d b2 = g.b(cVar, t3.f960e);
                            d0 c2 = w0Var.c();
                            i.a((Object) c2, "parameter.type");
                            b.C0039b.c cVar2 = t3.f961f;
                            i.a((Object) cVar2, "proto.value");
                            a.a.a.a.v0.j.s.g<?> a3 = a(c2, cVar2, cVar);
                            if (!a(a3, c2, cVar2)) {
                                a3 = null;
                            }
                            if (a3 == null) {
                                StringBuilder a4 = a.a("Unexpected argument value: actual type ");
                                a4.append(cVar2.f969e);
                                a4.append(" != expected type ");
                                a4.append(c2);
                                String sb = a4.toString();
                                if (sb != null) {
                                    a3 = new l.a(sb);
                                } else {
                                    i.a("message");
                                    throw null;
                                }
                            }
                            jVar = new j(b2, a3);
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            arrayList.add(jVar);
                        }
                    }
                    map = f.h(arrayList);
                }
            }
            return new a.a.a.a.v0.b.b1.d(a2.v(), map, m0.f491a);
        } else {
            i.a("nameResolver");
            throw null;
        }
    }

    public final boolean a(a.a.a.a.v0.j.s.g<?> gVar, d0 d0Var, b.C0039b.c cVar) {
        b.C0039b.c.EnumC0042c cVar2 = cVar.f969e;
        if (cVar2 != null) {
            int ordinal = cVar2.ordinal();
            if (ordinal == 9) {
                h c2 = d0Var.I0().c();
                if (!(c2 instanceof a.a.a.a.v0.b.e)) {
                    c2 = null;
                }
                a.a.a.a.v0.b.e eVar = (a.a.a.a.v0.b.e) c2;
                if (eVar == null || a.a.a.a.v0.a.g.a(eVar, a.a.a.a.v0.a.g.k.W)) {
                    return true;
                }
            } else if (ordinal == 12) {
                if ((gVar instanceof a.a.a.a.v0.j.s.b) && ((a.a.a.a.v0.j.s.b) gVar).f1578a.size() == cVar.m.size()) {
                    d0 a2 = this.f1674a.m().a(d0Var);
                    i.a((Object) a2, "builtIns.getArrayElementType(expectedType)");
                    a.a.a.a.v0.j.s.b bVar = (a.a.a.a.v0.j.s.b) gVar;
                    a.y.c a3 = g.a((Collection<?>) bVar.f1578a);
                    if ((a3 instanceof Collection) && ((Collection) a3).isEmpty()) {
                        return true;
                    }
                    Iterator<Integer> it = a3.iterator();
                    while (((a.y.b) it).f2156d) {
                        int a4 = ((r) it).a();
                        b.C0039b.c cVar3 = cVar.m.get(a4);
                        i.a((Object) cVar3, "value.getArrayElement(i)");
                        if (!a((a.a.a.a.v0.j.s.g) bVar.f1578a.get(a4), a2, cVar3)) {
                        }
                    }
                    return true;
                }
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            return false;
        }
        return i.a(gVar.a(this.f1674a), d0Var);
    }

    public final a.a.a.a.v0.j.s.g<?> a(d0 d0Var, b.C0039b.c cVar, a.a.a.a.v0.e.x0.c cVar2) {
        a.a.a.a.v0.j.s.g<?> gVar;
        if (d0Var == null) {
            i.a("expectedType");
            throw null;
        } else if (cVar == null) {
            i.a("value");
            throw null;
        } else if (cVar2 != null) {
            boolean a2 = a.a(a.a.a.a.v0.e.x0.b.J, cVar.o, "Flags.IS_UNSIGNED.get(value.flags)");
            b.C0039b.c.EnumC0042c cVar3 = cVar.f969e;
            if (cVar3 != null) {
                switch (cVar3.ordinal()) {
                    case 0:
                        byte b2 = (byte) ((int) cVar.f970f);
                        return a2 ? new z(b2) : new a.a.a.a.v0.j.s.d(b2);
                    case 1:
                        gVar = new a.a.a.a.v0.j.s.e((char) ((int) cVar.f970f));
                        return gVar;
                    case 2:
                        short s = (short) ((int) cVar.f970f);
                        return a2 ? new c0(s) : new a.a.a.a.v0.j.s.x(s);
                    case 3:
                        int i = (int) cVar.f970f;
                        gVar = a2 ? new a0(i) : new n(i);
                        return gVar;
                    case 4:
                        long j = cVar.f970f;
                        return a2 ? new b0(j) : new v(j);
                    case 5:
                        gVar = new a.a.a.a.v0.j.s.m(cVar.f971g);
                        return gVar;
                    case 6:
                        gVar = new a.a.a.a.v0.j.s.j(cVar.f972h);
                        return gVar;
                    case 7:
                        gVar = new a.a.a.a.v0.j.s.c(cVar.f970f != 0);
                        return gVar;
                    case 8:
                        gVar = new y(cVar2.a(cVar.i));
                        return gVar;
                    case 9:
                        gVar = new u(g.a(cVar2, cVar.j), cVar.n);
                        return gVar;
                    case 10:
                        gVar = new k(g.a(cVar2, cVar.j), g.b(cVar2, cVar.k));
                        return gVar;
                    case 11:
                        b bVar = cVar.l;
                        i.a((Object) bVar, "value.annotation");
                        gVar = new a.a.a.a.v0.j.s.a(a(bVar, cVar2));
                        return gVar;
                    case 12:
                        List<b.C0039b.c> list = cVar.m;
                        i.a((Object) list, "value.arrayElementList");
                        ArrayList arrayList = new ArrayList(g.a((Iterable) list, 10));
                        for (T t : list) {
                            k0 b3 = this.f1674a.m().b();
                            i.a((Object) b3, "builtIns.anyType");
                            i.a((Object) t, "it");
                            arrayList.add(a(b3, t, cVar2));
                        }
                        return new a.a.a.a.v0.j.s.b(arrayList, new a.a.a.a.v0.j.s.h(d0Var));
                }
            }
            StringBuilder a3 = a.a("Unsupported annotation argument type: ");
            a3.append(cVar.f969e);
            a3.append(" (expected ");
            a3.append(d0Var);
            a3.append(')');
            throw new IllegalStateException(a3.toString().toString());
        } else {
            i.a("nameResolver");
            throw null;
        }
    }
}
