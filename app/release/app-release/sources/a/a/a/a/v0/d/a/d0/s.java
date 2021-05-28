package a.a.a.a.v0.d.a.d0;

import a.a.a.a.v0.j.v.c;
import a.j;
import a.q;
import a.t.f;
import a.t.h;
import a.t.o;
import a.t.p;
import a.w.b.l;
import a.w.c.i;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, j> f766a = new LinkedHashMap();

    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f767a;
        public final /* synthetic */ s b;

        public a(s sVar, String str) {
            if (str != null) {
                this.b = sVar;
                this.f767a = str;
                return;
            }
            i.a("className");
            throw null;
        }

        public final void a(String str, l<? super C0030a, q> lVar) {
            if (str == null) {
                i.a("name");
                throw null;
            } else if (lVar != null) {
                Map<String, j> map = this.b.f766a;
                C0030a aVar = new C0030a(this, str);
                lVar.a(aVar);
                String str2 = aVar.f770d.f767a;
                String str3 = aVar.f769c;
                List<j<String, w>> list = aVar.f768a;
                ArrayList arrayList = new ArrayList(g.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f2088c);
                }
                A a2 = aVar.b.f2088c;
                if (str3 == null) {
                    i.a("name");
                    throw null;
                } else if (a2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append('(');
                    sb.append(f.a(arrayList, "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, a.a.a.a.v0.d.b.q.f920c, 30));
                    sb.append(')');
                    if (a2.length() > 1) {
                        a2 = 'L' + ((String) a2) + ';';
                    }
                    sb.append(a2);
                    String sb2 = sb.toString();
                    if (str2 == null) {
                        i.a("internalName");
                        throw null;
                    } else if (sb2 != null) {
                        String str4 = str2 + '.' + sb2;
                        B b2 = aVar.b.f2089d;
                        List<j<String, w>> list2 = aVar.f768a;
                        ArrayList arrayList2 = new ArrayList(g.a((Iterable) list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(it2.next().f2089d);
                        }
                        map.put(str4, new j(b2, arrayList2));
                    } else {
                        i.a("jvmDescriptor");
                        throw null;
                    }
                } else {
                    i.a("ret");
                    throw null;
                }
            } else {
                i.a("block");
                throw null;
            }
        }

        /* renamed from: a.a.a.a.v0.d.a.d0.s$a$a  reason: collision with other inner class name */
        public final class C0030a {

            /* renamed from: a  reason: collision with root package name */
            public final List<j<String, w>> f768a;
            public j<String, w> b;

            /* renamed from: c  reason: collision with root package name */
            public final String f769c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f770d;

            public C0030a(a aVar, String str) {
                if (str != null) {
                    this.f770d = aVar;
                    this.f769c = str;
                    this.f768a = new ArrayList();
                    this.b = new j<>("V", null);
                    return;
                }
                i.a("functionName");
                throw null;
            }

            public final void a(String str, d... dVarArr) {
                w wVar = null;
                if (str == null) {
                    i.a("type");
                    throw null;
                } else if (dVarArr != null) {
                    List<j<String, w>> list = this.f768a;
                    if (!(dVarArr.length == 0)) {
                        p pVar = new p(new h(dVarArr));
                        int e2 = g.e(g.a(pVar, 10));
                        if (e2 < 16) {
                            e2 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
                        Iterator it = pVar.iterator();
                        while (true) {
                            a.t.q qVar = (a.t.q) it;
                            if (!qVar.hasNext()) {
                                break;
                            }
                            o oVar = (o) qVar.next();
                            linkedHashMap.put(Integer.valueOf(oVar.f2122a), oVar.b);
                        }
                        wVar = new w(linkedHashMap);
                    }
                    list.add(new j<>(str, wVar));
                } else {
                    i.a("qualifiers");
                    throw null;
                }
            }

            public final void b(String str, d... dVarArr) {
                if (str == null) {
                    i.a("type");
                    throw null;
                } else if (dVarArr != null) {
                    p pVar = new p(new h(dVarArr));
                    int e2 = g.e(g.a(pVar, 10));
                    if (e2 < 16) {
                        e2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
                    Iterator it = pVar.iterator();
                    while (true) {
                        a.t.q qVar = (a.t.q) it;
                        if (qVar.hasNext()) {
                            o oVar = (o) qVar.next();
                            linkedHashMap.put(Integer.valueOf(oVar.f2122a), oVar.b);
                        } else {
                            this.b = new j<>(str, new w(linkedHashMap));
                            return;
                        }
                    }
                } else {
                    i.a("qualifiers");
                    throw null;
                }
            }

            public final void a(c cVar) {
                if (cVar != null) {
                    this.b = new j<>(cVar.a(), null);
                } else {
                    i.a("type");
                    throw null;
                }
            }
        }
    }
}
