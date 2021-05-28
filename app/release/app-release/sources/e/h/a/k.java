package e.h.a;

import e.h.a.f0.g;
import e.h.a.f0.o;
import e.h.a.f0.z.b;
import e.h.a.f0.z.d;
import e.h.a.f0.z.h;
import e.h.a.f0.z.j;
import e.h.a.f0.z.l;
import e.h.a.f0.z.o;
import e.h.a.f0.z.p;
import e.h.a.h0.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class k {
    public static final e.h.a.g0.a<?> l = new e.h.a.g0.a<>(Object.class);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<e.h.a.g0.a<?>, a<?>>> f4828a;
    public final Map<e.h.a.g0.a<?>, c0<?>> b;

    /* renamed from: c  reason: collision with root package name */
    public final g f4829c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4830d;

    /* renamed from: e  reason: collision with root package name */
    public final List<d0> f4831e;

    /* renamed from: f  reason: collision with root package name */
    public final o f4832f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f4833g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4834h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public static class a<T> extends c0<T> {

        /* renamed from: a  reason: collision with root package name */
        public c0<T> f4835a;

        @Override // e.h.a.c0
        public T a(e.h.a.h0.a aVar) {
            c0<T> c0Var = this.f4835a;
            if (c0Var != null) {
                return c0Var.a(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // e.h.a.c0
        public void a(c cVar, T t) {
            c0<T> c0Var = this.f4835a;
            if (c0Var != null) {
                c0Var.a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public k() {
        this(o.f4708h, d.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, a0.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public k(o oVar, e eVar, Map<Type, m<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a0 a0Var, String str, int i2, int i3, List<d0> list, List<d0> list2, List<d0> list3) {
        this.f4828a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f4832f = oVar;
        this.f4829c = new g(map);
        this.f4833g = z;
        this.f4834h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(e.h.a.f0.z.o.Y);
        arrayList.add(h.b);
        arrayList.add(oVar);
        arrayList.addAll(list3);
        arrayList.add(e.h.a.f0.z.o.D);
        arrayList.add(e.h.a.f0.z.o.m);
        arrayList.add(e.h.a.f0.z.o.f4788g);
        arrayList.add(e.h.a.f0.z.o.i);
        arrayList.add(e.h.a.f0.z.o.k);
        c0 hVar = a0Var == a0.DEFAULT ? e.h.a.f0.z.o.t : new h();
        arrayList.add(new p(Long.TYPE, Long.class, hVar));
        arrayList.add(new p(Double.TYPE, Double.class, z7 ? e.h.a.f0.z.o.v : new f(this)));
        arrayList.add(new p(Float.TYPE, Float.class, z7 ? e.h.a.f0.z.o.u : new g(this)));
        arrayList.add(e.h.a.f0.z.o.x);
        arrayList.add(e.h.a.f0.z.o.o);
        arrayList.add(e.h.a.f0.z.o.q);
        arrayList.add(new o.y(AtomicLong.class, new b0(new i(hVar))));
        arrayList.add(new o.y(AtomicLongArray.class, new b0(new j(hVar))));
        arrayList.add(e.h.a.f0.z.o.s);
        arrayList.add(e.h.a.f0.z.o.z);
        arrayList.add(e.h.a.f0.z.o.F);
        arrayList.add(e.h.a.f0.z.o.H);
        arrayList.add(new o.y(BigDecimal.class, e.h.a.f0.z.o.B));
        arrayList.add(new o.y(BigInteger.class, e.h.a.f0.z.o.C));
        arrayList.add(e.h.a.f0.z.o.J);
        arrayList.add(e.h.a.f0.z.o.L);
        arrayList.add(e.h.a.f0.z.o.P);
        arrayList.add(e.h.a.f0.z.o.R);
        arrayList.add(e.h.a.f0.z.o.W);
        arrayList.add(e.h.a.f0.z.o.N);
        arrayList.add(e.h.a.f0.z.o.f4785d);
        arrayList.add(e.h.a.f0.z.c.b);
        arrayList.add(e.h.a.f0.z.o.U);
        arrayList.add(l.b);
        arrayList.add(e.h.a.f0.z.k.b);
        arrayList.add(e.h.a.f0.z.o.S);
        arrayList.add(e.h.a.f0.z.a.f4743c);
        arrayList.add(e.h.a.f0.z.o.b);
        arrayList.add(new b(this.f4829c));
        arrayList.add(new e.h.a.f0.z.g(this.f4829c, z2));
        d dVar = new d(this.f4829c);
        this.f4830d = dVar;
        arrayList.add(dVar);
        arrayList.add(e.h.a.f0.z.o.Z);
        arrayList.add(new j(this.f4829c, eVar, oVar, this.f4830d));
        this.f4831e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> c0<T> a(d0 d0Var, e.h.a.g0.a<T> aVar) {
        if (!this.f4831e.contains(d0Var)) {
            d0Var = this.f4830d;
        }
        boolean z = false;
        for (d0 d0Var2 : this.f4831e) {
            if (z) {
                c0<T> a2 = d0Var2.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (d0Var2 == d0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public <T> T a(String str, Class<T> cls) {
        Object a2 = a(str, (Type) cls);
        if (cls == Integer.TYPE) {
            cls = (Class<T>) Integer.class;
        } else if (cls == Float.TYPE) {
            cls = (Class<T>) Float.class;
        } else if (cls == Byte.TYPE) {
            cls = (Class<T>) Byte.class;
        } else if (cls == Double.TYPE) {
            cls = (Class<T>) Double.class;
        } else if (cls == Long.TYPE) {
            cls = (Class<T>) Long.class;
        } else if (cls == Character.TYPE) {
            cls = (Class<T>) Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = (Class<T>) Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = (Class<T>) Short.class;
        } else if (cls == Void.TYPE) {
            cls = (Class<T>) Void.class;
        }
        return cls.cast(a2);
    }

    public String toString() {
        return "{serializeNulls:" + this.f4833g + ",factories:" + this.f4831e + ",instanceCreators:" + this.f4829c + "}";
    }

    public <T> T a(String str, Type type) {
        T t = null;
        if (str == null) {
            return null;
        }
        e.h.a.h0.a aVar = new e.h.a.h0.a(new StringReader(str));
        boolean z = this.k;
        aVar.f4809d = z;
        boolean z2 = true;
        aVar.f4809d = true;
        try {
            aVar.A();
            z2 = false;
            t = a((e.h.a.g0.a) new e.h.a.g0.a<>(type)).a(aVar);
        } catch (EOFException e2) {
            if (!z2) {
                throw new z(e2);
            }
        } catch (IllegalStateException e3) {
            throw new z(e3);
        } catch (IOException e4) {
            throw new z(e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            aVar.f4809d = z;
            throw th;
        }
        aVar.f4809d = z;
        if (t != null) {
            try {
                if (aVar.A() != e.h.a.h0.b.END_DOCUMENT) {
                    throw new r("JSON document was not fully consumed.");
                }
            } catch (e.h.a.h0.d e6) {
                throw new z(e6);
            } catch (IOException e7) {
                throw new r(e7);
            }
        }
        return t;
    }

    public <T> c0<T> a(e.h.a.g0.a<T> aVar) {
        c0<T> c0Var = (c0<T>) this.b.get(aVar == null ? l : aVar);
        if (c0Var != null) {
            return c0Var;
        }
        Map<e.h.a.g0.a<?>, a<?>> map = this.f4828a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.f4828a.set(map);
            z = true;
        }
        a<?> aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a<?> aVar3 = new a<>();
            map.put(aVar, aVar3);
            for (d0 d0Var : this.f4831e) {
                c0<T> a2 = d0Var.a(this, aVar);
                if (a2 != null) {
                    if (aVar3.f4835a == null) {
                        aVar3.f4835a = a2;
                        this.b.put(aVar, a2);
                        return a2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f4828a.remove();
            }
        }
    }

    public <T> c0<T> a(Class<T> cls) {
        return a((e.h.a.g0.a) new e.h.a.g0.a<>(cls));
    }

    public c a(Writer writer) {
        if (this.f4834h) {
            writer.write(")]}'\n");
        }
        c cVar = new c(writer);
        if (this.j) {
            cVar.f4823f = "  ";
            cVar.f4824g = ": ";
        }
        cVar.k = this.f4833g;
        return cVar;
    }

    public String a(Object obj) {
        if (obj == null) {
            q qVar = s.f4844a;
            StringWriter stringWriter = new StringWriter();
            try {
                a(qVar, a((Writer) stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new r(e2);
            }
        } else {
            Type type = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                a(obj, type, a((Writer) stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e3) {
                throw new r(e3);
            }
        }
    }

    public void a(q qVar, c cVar) {
        boolean z = cVar.f4825h;
        cVar.f4825h = true;
        boolean z2 = cVar.i;
        cVar.i = this.i;
        boolean z3 = cVar.k;
        cVar.k = this.f4833g;
        try {
            e.h.a.f0.z.o.X.a(cVar, qVar);
            cVar.f4825h = z;
            cVar.i = z2;
            cVar.k = z3;
        } catch (IOException e2) {
            throw new r(e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f4825h = z;
            cVar.i = z2;
            cVar.k = z3;
            throw th;
        }
    }

    public void a(Object obj, Type type, c cVar) {
        c0 a2 = a(new e.h.a.g0.a(type));
        boolean z = cVar.f4825h;
        cVar.f4825h = true;
        boolean z2 = cVar.i;
        cVar.i = this.i;
        boolean z3 = cVar.k;
        cVar.k = this.f4833g;
        try {
            a2.a(cVar, obj);
            cVar.f4825h = z;
            cVar.i = z2;
            cVar.k = z3;
        } catch (IOException e2) {
            throw new r(e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f4825h = z;
            cVar.i = z2;
            cVar.k = z3;
            throw th;
        }
    }
}
