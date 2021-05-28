package a.a.a.a;

import a.a.a.a.v0.b.b1.a;
import a.a.a.a.v0.b.b1.c;
import a.a.a.a.v0.b.e1.a.j;
import a.a.a.a.v0.b.e1.b.u;
import a.a.a.a.v0.b.i0;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.e.l0;
import a.a.a.a.v0.e.r;
import a.a.a.a.v0.e.x0.e;
import a.a.a.a.v0.e.x0.g;
import a.a.a.a.v0.e.z;
import a.a.a.a.v0.f.b;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.j.s.u;
import a.a.a.a.v0.k.b.l;
import a.a.a.a.v0.k.b.v;
import a.n;
import a.t.f;
import a.w.b.p;
import a.w.c.h;
import a.w.c.i;
import a.w.c.q;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f120a = new b("kotlin.jvm.JvmStatic");

    public static final b a(Object obj) {
        b bVar = null;
        b bVar2 = (b) (!(obj instanceof b) ? null : obj);
        if (bVar2 != null) {
            return bVar2;
        }
        if (!(obj instanceof h)) {
            obj = null;
        }
        h hVar = (h) obj;
        a.a.b a2 = hVar != null ? hVar.a() : null;
        if (a2 instanceof b) {
            bVar = a2;
        }
        return bVar;
    }

    public static final List<Annotation> a(a aVar) {
        Annotation annotation;
        if (aVar != null) {
            a.a.a.a.v0.b.b1.h<c> y = aVar.y();
            ArrayList arrayList = new ArrayList();
            for (c cVar : y) {
                m0 r = cVar.r();
                if (r instanceof a.a.a.a.v0.b.e1.a.b) {
                    annotation = ((a.a.a.a.v0.b.e1.a.b) r).b;
                } else if (r instanceof j.a) {
                    u uVar = ((j.a) r).b;
                    if (!(uVar instanceof a.a.a.a.v0.b.e1.b.c)) {
                        uVar = null;
                    }
                    a.a.a.a.v0.b.e1.b.c cVar2 = (a.a.a.a.v0.b.e1.b.c) uVar;
                    annotation = cVar2 != null ? cVar2.f457a : null;
                } else {
                    annotation = a(cVar);
                }
                if (annotation != null) {
                    arrayList.add(annotation);
                }
            }
            return arrayList;
        }
        i.a("$this$computeAnnotations");
        throw null;
    }

    public static final c0<?> b(Object obj) {
        c0<?> c0Var = null;
        c0<?> c0Var2 = (c0) (!(obj instanceof c0) ? null : obj);
        if (c0Var2 != null) {
            return c0Var2;
        }
        if (!(obj instanceof q)) {
            obj = null;
        }
        q qVar = (q) obj;
        a.a.b a2 = qVar != null ? qVar.a() : null;
        if (a2 instanceof c0) {
            c0Var = a2;
        }
        return c0Var;
    }

    public static final <M extends a.a.a.a.v0.h.q, D extends a.a.a.a.v0.b.a> D a(Class<?> cls, M m, a.a.a.a.v0.e.x0.c cVar, e eVar, a.a.a.a.v0.e.x0.a aVar, p<? super v, ? super M, ? extends D> pVar) {
        List<l0> list;
        if (cls == null) {
            i.a("moduleAnchor");
            throw null;
        } else if (m == null) {
            i.a("proto");
            throw null;
        } else if (cVar == null) {
            i.a("nameResolver");
            throw null;
        } else if (eVar == null) {
            i.a("typeTable");
            throw null;
        } else if (aVar == null) {
            i.a("metadataVersion");
            throw null;
        } else if (pVar != null) {
            a.a.a.a.v0.b.e1.a.i a2 = j0.a(cls);
            if (m instanceof r) {
                list = ((r) m).k;
            } else if (m instanceof z) {
                list = ((z) m).k;
            } else {
                throw new IllegalStateException(("Unsupported message: " + m).toString());
            }
            a.a.a.a.v0.k.b.j jVar = a2.f448a;
            w wVar = jVar.f1732c;
            g.a aVar2 = g.f1257c;
            g gVar = g.b;
            i.a((Object) list, "typeParameters");
            return (D) ((a.a.a.a.v0.b.a) pVar.a(new v(new l(jVar, cVar, wVar, eVar, gVar, aVar, null, null, list)), m));
        } else {
            i.a("createDescriptor");
            throw null;
        }
    }

    public static final i0 a(a.a.a.a.v0.b.a aVar) {
        if (aVar == null) {
            i.a("$this$instanceReceiverParameter");
            throw null;
        } else if (aVar.J() == null) {
            return null;
        } else {
            k b = aVar.b();
            if (b != null) {
                return ((a.a.a.a.v0.b.e) b).G0();
            }
            throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
    }

    public static final Class<?> a(ClassLoader classLoader, a.a.a.a.v0.f.a aVar, int i) {
        String str;
        a.a.a.a.v0.a.p.c cVar = a.a.a.a.v0.a.p.c.m;
        a.a.a.a.v0.f.c f2 = aVar.a().f();
        i.a((Object) f2, "kotlinClassId.asSingleFqName().toUnsafe()");
        a.a.a.a.v0.f.a a2 = cVar.a(f2);
        if (a2 != null) {
            aVar = a2;
        }
        String a3 = aVar.d().a();
        i.a((Object) a3, "javaClassId.packageFqName.asString()");
        String a4 = aVar.e().a();
        i.a((Object) a4, "javaClassId.relativeClassName.asString()");
        if (i.a((Object) a3, (Object) "kotlin")) {
            switch (a4.hashCode()) {
                case -901856463:
                    if (a4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (a4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (a4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (a4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (a4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (a4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (a4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (a4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (a4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a3);
        sb.append('.');
        sb.append(a.a.a.a.v0.m.l1.a.a(a4, '.', '$', false, 4));
        String sb2 = sb.toString();
        if (i > 0) {
            StringBuilder sb3 = new StringBuilder();
            int i2 = 1;
            if (i >= 0) {
                if (i != 0) {
                    if (i != 1) {
                        int length = "[".length();
                        if (length != 0) {
                            if (length != 1) {
                                StringBuilder sb4 = new StringBuilder("[".length() * i);
                                if (1 <= i) {
                                    while (true) {
                                        sb4.append((CharSequence) "[");
                                        if (i2 != i) {
                                            i2++;
                                        }
                                    }
                                }
                                str = sb4.toString();
                                i.a((Object) str, "sb.toString()");
                            } else {
                                char charAt = "[".charAt(0);
                                char[] cArr = new char[i];
                                for (int i3 = 0; i3 < i; i3++) {
                                    cArr[i3] = charAt;
                                }
                                str = new String(cArr);
                            }
                        }
                    } else {
                        str = "[".toString();
                    }
                    sb3.append(str);
                    sb3.append('L');
                    sb3.append(sb2);
                    sb3.append(';');
                    sb2 = sb3.toString();
                }
                str = "";
                sb3.append(str);
                sb3.append('L');
                sb3.append(sb2);
                sb3.append(';');
                sb2 = sb3.toString();
            } else {
                throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
            }
        }
        return e.f.a.g.a(classLoader, sb2);
    }

    public static final Annotation a(c cVar) {
        a.a.a.a.v0.b.e b = a.a.a.a.v0.j.u.a.b(cVar);
        Class<?> a2 = b != null ? a(b) : null;
        if (!(a2 instanceof Class)) {
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        Set<Map.Entry<d, a.a.a.a.v0.j.s.g<?>>> entrySet = cVar.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (T t : entrySet) {
            d dVar = (d) t.getKey();
            ClassLoader classLoader = a2.getClassLoader();
            i.a((Object) classLoader, "annotationClass.classLoader");
            Object a3 = a((a.a.a.a.v0.j.s.g) t.getValue(), classLoader);
            a.j jVar = a3 != null ? new a.j(dVar.a(), a3) : null;
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        Map h2 = f.h(arrayList);
        Set<String> keySet = h2.keySet();
        ArrayList arrayList2 = new ArrayList(e.f.a.g.a(keySet, 10));
        for (String str : keySet) {
            arrayList2.add(a2.getDeclaredMethod(str, new Class[0]));
        }
        return (Annotation) e.f.a.g.a(a2, h2, arrayList2);
    }

    public static final Class<?> a(a.a.a.a.v0.b.e eVar) {
        if (eVar != null) {
            m0 r = eVar.r();
            i.a((Object) r, "source");
            if (r instanceof a.a.a.a.v0.d.b.n) {
                a.a.a.a.v0.d.b.l lVar = ((a.a.a.a.v0.d.b.n) r).b;
                if (lVar != null) {
                    return ((a.a.a.a.v0.b.e1.a.e) lVar).f445a;
                }
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            } else if (r instanceof j.a) {
                u uVar = ((j.a) r).b;
                if (uVar != null) {
                    return ((a.a.a.a.v0.b.e1.b.q) uVar).f474a;
                }
                throw new n("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            } else {
                a.a.a.a.v0.f.a a2 = a.a.a.a.v0.j.u.a.a((a.a.a.a.v0.b.h) eVar);
                if (a2 != null) {
                    return a(a.a.a.a.v0.b.e1.b.b.e(eVar.getClass()), a2, 0);
                }
                return null;
            }
        } else {
            i.a("$this$toJavaClass");
            throw null;
        }
    }

    public static final Object a(a.a.a.a.v0.j.s.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof a.a.a.a.v0.j.s.a) {
            return a((c) ((a.a.a.a.v0.j.s.a) gVar).f1578a);
        }
        if (gVar instanceof a.a.a.a.v0.j.s.b) {
            T<a.a.a.a.v0.j.s.g> t = ((a.a.a.a.v0.j.s.b) gVar).f1578a;
            ArrayList arrayList = new ArrayList(e.f.a.g.a((Iterable) t, 10));
            for (a.a.a.a.v0.j.s.g gVar2 : t) {
                arrayList.add(a(gVar2, classLoader));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            if (array != null) {
                return array;
            }
            throw new n("null cannot be cast to non-null type kotlin.Array<T>");
        } else if (gVar instanceof a.a.a.a.v0.j.s.k) {
            T t2 = ((a.a.a.a.v0.j.s.k) gVar).f1578a;
            B b = t2.f2089d;
            Class<?> a2 = a(classLoader, t2.f2088c, 0);
            if (a2 != null) {
                return Enum.valueOf(a2, b.a());
            }
            return null;
        } else if (gVar instanceof a.a.a.a.v0.j.s.u) {
            T t3 = ((a.a.a.a.v0.j.s.u) gVar).f1578a;
            if (t3 instanceof u.a.b) {
                a.a.a.a.v0.j.s.f fVar = t3.f1592a;
                return a(classLoader, fVar.f1577a, fVar.b);
            } else if (t3 instanceof u.a.C0061a) {
                a.a.a.a.v0.b.h c2 = t3.f1591a.I0().c();
                if (!(c2 instanceof a.a.a.a.v0.b.e)) {
                    c2 = null;
                }
                a.a.a.a.v0.b.e eVar = (a.a.a.a.v0.b.e) c2;
                if (eVar != null) {
                    return a(eVar);
                }
                return null;
            } else {
                throw new a.h();
            }
        } else if (!(gVar instanceof a.a.a.a.v0.j.s.l) && !(gVar instanceof a.a.a.a.v0.j.s.w)) {
            return gVar.a();
        } else {
            return null;
        }
    }
}
