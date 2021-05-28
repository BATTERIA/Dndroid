package e.h.a.f0.z;

import e.h.a.c0;
import e.h.a.d0;
import e.h.a.f0.q;
import e.h.a.f0.t;
import e.h.a.h0.a;
import e.h.a.h0.b;
import e.h.a.h0.c;
import e.h.a.k;
import e.h.a.n;
import e.h.a.r;
import e.h.a.s;
import e.h.a.w;
import e.h.a.z;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public final class g implements d0 {

    /* renamed from: c  reason: collision with root package name */
    public final e.h.a.f0.g f4749c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4750d;

    public g(e.h.a.f0.g gVar, boolean z) {
        this.f4749c = gVar;
        this.f4750d = z;
    }

    @Override // e.h.a.d0
    public <T> c0<T> a(k kVar, e.h.a.g0.a<T> aVar) {
        Type[] typeArr;
        Type type = aVar.b;
        if (!Map.class.isAssignableFrom(aVar.f4806a)) {
            return null;
        }
        Class<?> c2 = e.h.a.f0.a.c(type);
        if (type == Properties.class) {
            typeArr = new Type[]{String.class, String.class};
        } else {
            Type b = e.h.a.f0.a.b(type, c2, Map.class);
            typeArr = b instanceof ParameterizedType ? ((ParameterizedType) b).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = typeArr[0];
        return new a(kVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? o.f4787f : kVar.a((e.h.a.g0.a) new e.h.a.g0.a<>(type2)), typeArr[1], kVar.a((e.h.a.g0.a) new e.h.a.g0.a<>(typeArr[1])), this.f4749c.a(aVar));
    }

    public final class a<K, V> extends c0<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final c0<K> f4751a;
        public final c0<V> b;

        /* renamed from: c  reason: collision with root package name */
        public final t<? extends Map<K, V>> f4752c;

        public a(k kVar, Type type, c0<K> c0Var, Type type2, c0<V> c0Var2, t<? extends Map<K, V>> tVar) {
            this.f4751a = new n(kVar, c0Var, type);
            this.b = new n(kVar, c0Var2, type2);
            this.f4752c = tVar;
        }

        @Override // e.h.a.c0
        public Object a(e.h.a.h0.a aVar) {
            int i;
            b A = aVar.A();
            if (A == b.NULL) {
                aVar.x();
                return null;
            }
            Map map = (Map) this.f4752c.a();
            if (A == b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.q()) {
                    aVar.a();
                    K a2 = this.f4751a.a(aVar);
                    if (map.put(a2, this.b.a(aVar)) == null) {
                        aVar.n();
                    } else {
                        throw new z("duplicate key: " + ((Object) a2));
                    }
                }
                aVar.n();
            } else {
                aVar.k();
                while (aVar.q()) {
                    if (((a.C0145a) q.f4720a) != null) {
                        if (aVar instanceof e) {
                            e eVar = (e) aVar;
                            eVar.a(b.NAME);
                            Map.Entry entry = (Map.Entry) ((Iterator) eVar.E()).next();
                            eVar.a(entry.getValue());
                            eVar.a(new w((String) entry.getKey()));
                        } else {
                            int i2 = aVar.j;
                            if (i2 == 0) {
                                i2 = aVar.m();
                            }
                            if (i2 == 13) {
                                i = 9;
                            } else if (i2 == 12) {
                                i = 8;
                            } else if (i2 == 14) {
                                i = 10;
                            } else {
                                StringBuilder a3 = e.a.a.a.a.a("Expected a name but was ");
                                a3.append(aVar.A());
                                a3.append(aVar.r());
                                throw new IllegalStateException(a3.toString());
                            }
                            aVar.j = i;
                        }
                        K a4 = this.f4751a.a(aVar);
                        if (map.put(a4, this.b.a(aVar)) != null) {
                            throw new z("duplicate key: " + ((Object) a4));
                        }
                    } else {
                        throw null;
                    }
                }
                aVar.o();
            }
            return map;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: e.h.a.c0<V> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: e.h.a.c0<V> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // e.h.a.c0
        public void a(c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.p();
                return;
            }
            if (!g.this.f4750d) {
                cVar.l();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.b(String.valueOf(entry.getKey()));
                    this.b.a(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    c0<K> c0Var = this.f4751a;
                    K key = entry2.getKey();
                    if (c0Var != null) {
                        try {
                            f fVar = new f();
                            c0Var.a(fVar, key);
                            if (fVar.n.isEmpty()) {
                                e.h.a.q qVar = fVar.p;
                                arrayList.add(qVar);
                                arrayList2.add(entry2.getValue());
                                if (qVar != null) {
                                    z |= (qVar instanceof n) || (qVar instanceof e.h.a.t);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw new IllegalStateException("Expected one JSON element but was " + fVar.n);
                            }
                        } catch (IOException e2) {
                            throw new r(e2);
                        }
                    } else {
                        throw null;
                    }
                }
                if (z) {
                    cVar.k();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.k();
                        o.X.a(cVar, (e.h.a.q) arrayList.get(i));
                        this.b.a(cVar, arrayList2.get(i));
                        cVar.m();
                        i++;
                    }
                    cVar.m();
                    return;
                }
                cVar.l();
                int size2 = arrayList.size();
                while (i < size2) {
                    e.h.a.q qVar2 = (e.h.a.q) arrayList.get(i);
                    if (qVar2 != null) {
                        if (qVar2 instanceof w) {
                            w a2 = qVar2.a();
                            Object obj2 = a2.f4846a;
                            if (obj2 instanceof Number) {
                                str = String.valueOf(a2.d());
                            } else if (obj2 instanceof Boolean) {
                                str = Boolean.toString(a2.c());
                            } else if (obj2 instanceof String) {
                                str = a2.e();
                            } else {
                                throw new AssertionError();
                            }
                        } else if (qVar2 instanceof s) {
                            str = "null";
                        } else {
                            throw new AssertionError();
                        }
                        cVar.b(str);
                        this.b.a(cVar, arrayList2.get(i));
                        i++;
                    } else {
                        throw null;
                    }
                }
            }
            cVar.n();
        }
    }
}
