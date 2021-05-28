package e.e.a.v.t;

import com.didi.hummer.annotation.JsMethod;
import d.d.e;
import e.e.a.q.b.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static e<Map<String, List<a>>> f4552a = new e<>();

    @JsMethod
    public static synchronized void a(String str, a aVar) {
        synchronized (b.class) {
            if (aVar != null) {
                long j = -1;
                if (aVar instanceof a) {
                    j = ((a) aVar).b();
                } else if (aVar.a() != null) {
                    j = ((e.e.a.q.b.e.b) aVar.a()).f4488a;
                }
                if (j >= 0) {
                    Map<String, List<a>> a2 = f4552a.a(j);
                    if (a2 == null) {
                        a2 = new HashMap<>();
                        f4552a.c(j, a2);
                    }
                    List<a> list = a2.get(str);
                    if (list == null) {
                        list = new ArrayList<>();
                        a2.put(str, list);
                    }
                    if (!list.contains(aVar)) {
                        list.add(aVar);
                    }
                }
            }
        }
    }

    @JsMethod
    public static synchronized void a(String str, Object obj) {
        List<a> list;
        synchronized (b.class) {
            for (int i = 0; i < f4552a.d(); i++) {
                Map<String, List<a>> a2 = f4552a.a(i);
                if (!(a2 == null || (list = a2.get(str)) == null)) {
                    for (a aVar : list) {
                        aVar.a(obj);
                    }
                }
            }
        }
    }

    public static synchronized void a(long j) {
        synchronized (b.class) {
            Map<String, List<a>> b = f4552a.b(j, null);
            if (b != null) {
                for (String str : b.keySet()) {
                    List<a> list = b.get(str);
                    if (list != null && !list.isEmpty()) {
                        for (a aVar : list) {
                            if (aVar != null) {
                                aVar.d();
                            }
                        }
                        list.clear();
                    }
                }
                b.clear();
            }
            f4552a.b(j);
        }
    }

    public static synchronized void a(e.e.a.q.b.b bVar) {
        synchronized (b.class) {
            a(((e.e.a.q.b.e.b) bVar).f4488a);
        }
    }

    public static synchronized void a(long j, String str, a aVar) {
        List<a> list;
        synchronized (b.class) {
            a aVar2 = null;
            Map<String, List<a>> b = f4552a.b(j, null);
            if (!(b == null || (list = b.get(str)) == null || list.isEmpty())) {
                if (aVar == null) {
                    for (a aVar3 : list) {
                        if (aVar3 != null) {
                            aVar3.d();
                        }
                    }
                    list.clear();
                } else {
                    Iterator<a> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        a next = it.next();
                        if (next != null && next.equals(aVar)) {
                            aVar2 = next;
                            break;
                        }
                    }
                    if (aVar2 != null) {
                        aVar2.d();
                        list.remove(aVar2);
                    }
                }
            }
        }
    }

    @JsMethod
    public static synchronized void a(e.e.a.p.b bVar, String str, a aVar) {
        e.e.a.q.b.e.b bVar2;
        synchronized (b.class) {
            if (aVar != null) {
                try {
                    bVar2 = (e.e.a.q.b.e.b) aVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                bVar2 = (e.e.a.q.b.e.b) bVar.f4446g;
            }
            a(bVar2.f4488a, str, aVar);
        }
    }
}
