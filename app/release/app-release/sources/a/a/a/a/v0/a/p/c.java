package a.a.a.a.v0.a.p;

import a.a.a.a.v0.a.g;
import a.a.a.a.v0.a.o.b;
import a.a.a.a.v0.b.e;
import a.a.a.a.v0.b.k;
import a.a.a.a.v0.f.d;
import a.a.a.a.v0.f.f;
import a.n;
import a.s;
import a.w.c.i;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f249a = (b.c.Function.f245c.toString() + "." + b.c.Function.f246d);
    public static final String b = (b.c.f243g.f245c.toString() + "." + b.c.f243g.f246d);

    /* renamed from: c  reason: collision with root package name */
    public static final String f250c = (b.c.SuspendFunction.f245c.toString() + "." + b.c.SuspendFunction.f246d);

    /* renamed from: d  reason: collision with root package name */
    public static final String f251d = (b.c.f244h.f245c.toString() + "." + b.c.f244h.f246d);

    /* renamed from: e  reason: collision with root package name */
    public static final a.a.a.a.v0.f.a f252e;

    /* renamed from: f  reason: collision with root package name */
    public static final a.a.a.a.v0.f.b f253f;

    /* renamed from: g  reason: collision with root package name */
    public static final a.a.a.a.v0.f.a f254g;

    /* renamed from: h  reason: collision with root package name */
    public static final HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.a> f255h = new HashMap<>();
    public static final HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.a> i = new HashMap<>();
    public static final HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> j = new HashMap<>();
    public static final HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> k = new HashMap<>();
    public static final List<a> l;
    public static final c m;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final a.a.a.a.v0.f.a f256a;
        public final a.a.a.a.v0.f.a b;

        /* renamed from: c  reason: collision with root package name */
        public final a.a.a.a.v0.f.a f257c;

        public a(a.a.a.a.v0.f.a aVar, a.a.a.a.v0.f.a aVar2, a.a.a.a.v0.f.a aVar3) {
            if (aVar == null) {
                i.a("javaClass");
                throw null;
            } else if (aVar2 == null) {
                i.a("kotlinReadOnly");
                throw null;
            } else if (aVar3 != null) {
                this.f256a = aVar;
                this.b = aVar2;
                this.f257c = aVar3;
            } else {
                i.a("kotlinMutable");
                throw null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.f256a, aVar.f256a) && i.a(this.b, aVar.b) && i.a(this.f257c, aVar.f257c);
        }

        public int hashCode() {
            a.a.a.a.v0.f.a aVar = this.f256a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            a.a.a.a.v0.f.a aVar2 = this.b;
            int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            a.a.a.a.v0.f.a aVar3 = this.f257c;
            if (aVar3 != null) {
                i = aVar3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("PlatformMutabilityMapping(javaClass=");
            a2.append(this.f256a);
            a2.append(", kotlinReadOnly=");
            a2.append(this.b);
            a2.append(", kotlinMutable=");
            a2.append(this.f257c);
            a2.append(")");
            return a2.toString();
        }
    }

    static {
        c cVar = new c();
        m = cVar;
        a.a.a.a.v0.f.a a2 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.jvm.functions.FunctionN"));
        i.a((Object) a2, "ClassId.topLevel(FqName(…vm.functions.FunctionN\"))");
        f252e = a2;
        a.a.a.a.v0.f.b a3 = a2.a();
        i.a((Object) a3, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        f253f = a3;
        a.a.a.a.v0.f.a a4 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b("kotlin.reflect.KFunction"));
        i.a((Object) a4, "ClassId.topLevel(FqName(…tlin.reflect.KFunction\"))");
        f254g = a4;
        a.a.a.a.v0.f.a a5 = a.a.a.a.v0.f.a.a(g.k.H);
        i.a((Object) a5, "ClassId.topLevel(FQ_NAMES.iterable)");
        a.a.a.a.v0.f.b bVar = g.k.P;
        i.a((Object) bVar, "FQ_NAMES.mutableIterable");
        a.a.a.a.v0.f.b d2 = a5.d();
        a.a.a.a.v0.f.b d3 = a5.d();
        i.a((Object) d3, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.b a6 = e.f.a.g.a(bVar, d3);
        a.a.a.a.v0.f.a aVar = new a.a.a.a.v0.f.a(d2, a6, false);
        a.a.a.a.v0.f.a a7 = a.a.a.a.v0.f.a.a(g.k.G);
        i.a((Object) a7, "ClassId.topLevel(FQ_NAMES.iterator)");
        a.a.a.a.v0.f.b bVar2 = g.k.O;
        i.a((Object) bVar2, "FQ_NAMES.mutableIterator");
        a.a.a.a.v0.f.b d4 = a7.d();
        a.a.a.a.v0.f.b d5 = a7.d();
        i.a((Object) d5, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.a aVar2 = new a.a.a.a.v0.f.a(d4, e.f.a.g.a(bVar2, d5), false);
        a.a.a.a.v0.f.a a8 = a.a.a.a.v0.f.a.a(g.k.I);
        i.a((Object) a8, "ClassId.topLevel(FQ_NAMES.collection)");
        a.a.a.a.v0.f.b bVar3 = g.k.Q;
        i.a((Object) bVar3, "FQ_NAMES.mutableCollection");
        a.a.a.a.v0.f.b d6 = a8.d();
        a.a.a.a.v0.f.b d7 = a8.d();
        i.a((Object) d7, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.a aVar3 = new a.a.a.a.v0.f.a(d6, e.f.a.g.a(bVar3, d7), false);
        a.a.a.a.v0.f.a a9 = a.a.a.a.v0.f.a.a(g.k.J);
        i.a((Object) a9, "ClassId.topLevel(FQ_NAMES.list)");
        a.a.a.a.v0.f.b bVar4 = g.k.R;
        i.a((Object) bVar4, "FQ_NAMES.mutableList");
        a.a.a.a.v0.f.b d8 = a9.d();
        a.a.a.a.v0.f.b d9 = a9.d();
        i.a((Object) d9, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.a aVar4 = new a.a.a.a.v0.f.a(d8, e.f.a.g.a(bVar4, d9), false);
        a.a.a.a.v0.f.a a10 = a.a.a.a.v0.f.a.a(g.k.L);
        i.a((Object) a10, "ClassId.topLevel(FQ_NAMES.set)");
        a.a.a.a.v0.f.b bVar5 = g.k.T;
        i.a((Object) bVar5, "FQ_NAMES.mutableSet");
        a.a.a.a.v0.f.b d10 = a10.d();
        a.a.a.a.v0.f.b d11 = a10.d();
        i.a((Object) d11, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.a aVar5 = new a.a.a.a.v0.f.a(d10, e.f.a.g.a(bVar5, d11), false);
        a.a.a.a.v0.f.a a11 = a.a.a.a.v0.f.a.a(g.k.K);
        i.a((Object) a11, "ClassId.topLevel(FQ_NAMES.listIterator)");
        a.a.a.a.v0.f.b bVar6 = g.k.S;
        i.a((Object) bVar6, "FQ_NAMES.mutableListIterator");
        a.a.a.a.v0.f.b d12 = a11.d();
        a.a.a.a.v0.f.b d13 = a11.d();
        i.a((Object) d13, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.a aVar6 = new a.a.a.a.v0.f.a(d12, e.f.a.g.a(bVar6, d13), false);
        a.a.a.a.v0.f.a a12 = a.a.a.a.v0.f.a.a(g.k.M);
        i.a((Object) a12, "ClassId.topLevel(FQ_NAMES.map)");
        a.a.a.a.v0.f.b bVar7 = g.k.U;
        i.a((Object) bVar7, "FQ_NAMES.mutableMap");
        a.a.a.a.v0.f.b d14 = a12.d();
        a.a.a.a.v0.f.b d15 = a12.d();
        i.a((Object) d15, "kotlinReadOnly.packageFqName");
        a.a.a.a.v0.f.a aVar7 = new a.a.a.a.v0.f.a(d14, e.f.a.g.a(bVar7, d15), false);
        a.a.a.a.v0.f.a a13 = a.a.a.a.v0.f.a.a(g.k.M).a(g.k.N.d());
        i.a((Object) a13, "ClassId.topLevel(FQ_NAME…MES.mapEntry.shortName())");
        a.a.a.a.v0.f.b bVar8 = g.k.V;
        i.a((Object) bVar8, "FQ_NAMES.mutableMapEntry");
        a.a.a.a.v0.f.b d16 = a13.d();
        a.a.a.a.v0.f.b d17 = a13.d();
        i.a((Object) d17, "kotlinReadOnly.packageFqName");
        l = e.f.a.g.g(new a(cVar.a(Iterable.class), a5, aVar), new a(cVar.a(Iterator.class), a7, aVar2), new a(cVar.a(Collection.class), a8, aVar3), new a(cVar.a(List.class), a9, aVar4), new a(cVar.a(Set.class), a10, aVar5), new a(cVar.a(ListIterator.class), a11, aVar6), new a(cVar.a(Map.class), a12, aVar7), new a(cVar.a(Map.Entry.class), a13, new a.a.a.a.v0.f.a(d16, e.f.a.g.a(bVar8, d17), false)));
        a.a.a.a.v0.f.c cVar2 = g.k.f198a;
        i.a((Object) cVar2, "FQ_NAMES.any");
        cVar.a(Object.class, cVar2);
        a.a.a.a.v0.f.c cVar3 = g.k.f202f;
        i.a((Object) cVar3, "FQ_NAMES.string");
        cVar.a(String.class, cVar3);
        a.a.a.a.v0.f.c cVar4 = g.k.f201e;
        i.a((Object) cVar4, "FQ_NAMES.charSequence");
        cVar.a(CharSequence.class, cVar4);
        a.a.a.a.v0.f.b bVar9 = g.k.r;
        i.a((Object) bVar9, "FQ_NAMES.throwable");
        cVar.a(Throwable.class, bVar9);
        a.a.a.a.v0.f.c cVar5 = g.k.f199c;
        i.a((Object) cVar5, "FQ_NAMES.cloneable");
        cVar.a(Cloneable.class, cVar5);
        a.a.a.a.v0.f.c cVar6 = g.k.p;
        i.a((Object) cVar6, "FQ_NAMES.number");
        cVar.a(Number.class, cVar6);
        a.a.a.a.v0.f.b bVar10 = g.k.s;
        i.a((Object) bVar10, "FQ_NAMES.comparable");
        cVar.a(Comparable.class, bVar10);
        a.a.a.a.v0.f.c cVar7 = g.k.q;
        i.a((Object) cVar7, "FQ_NAMES._enum");
        cVar.a(Enum.class, cVar7);
        a.a.a.a.v0.f.b bVar11 = g.k.y;
        i.a((Object) bVar11, "FQ_NAMES.annotation");
        cVar.a(Annotation.class, bVar11);
        for (a aVar8 : l) {
            a.a.a.a.v0.f.a aVar9 = aVar8.f256a;
            a.a.a.a.v0.f.a aVar10 = aVar8.b;
            a.a.a.a.v0.f.a aVar11 = aVar8.f257c;
            cVar.a(aVar9, aVar10);
            a.a.a.a.v0.f.b a14 = aVar11.a();
            i.a((Object) a14, "mutableClassId.asSingleFqName()");
            HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.a> hashMap = i;
            a.a.a.a.v0.f.c f2 = a14.f();
            i.a((Object) f2, "kotlinFqNameUnsafe.toUnsafe()");
            hashMap.put(f2, aVar9);
            a.a.a.a.v0.f.b a15 = aVar10.a();
            i.a((Object) a15, "readOnlyClassId.asSingleFqName()");
            a.a.a.a.v0.f.b a16 = aVar11.a();
            i.a((Object) a16, "mutableClassId.asSingleFqName()");
            HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> hashMap2 = j;
            a.a.a.a.v0.f.c f3 = aVar11.a().f();
            i.a((Object) f3, "mutableClassId.asSingleFqName().toUnsafe()");
            hashMap2.put(f3, a15);
            HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> hashMap3 = k;
            a.a.a.a.v0.f.c f4 = a15.f();
            i.a((Object) f4, "readOnlyFqName.toUnsafe()");
            hashMap3.put(f4, a16);
        }
        a.a.a.a.v0.j.v.c[] values = a.a.a.a.v0.j.v.c.values();
        for (a.a.a.a.v0.j.v.c cVar8 : values) {
            a.a.a.a.v0.f.a a17 = a.a.a.a.v0.f.a.a(cVar8.f());
            i.a((Object) a17, "ClassId.topLevel(jvmType.wrapperFqName)");
            a.a.a.a.v0.f.a a18 = a.a.a.a.v0.f.a.a(g.c(cVar8.b()));
            i.a((Object) a18, "ClassId.topLevel(KotlinB…e(jvmType.primitiveType))");
            cVar.a(a17, a18);
        }
        a.a.a.a.v0.a.c cVar9 = a.a.a.a.v0.a.c.b;
        Set<a.a.a.a.v0.f.a> unmodifiableSet = Collections.unmodifiableSet(a.a.a.a.v0.a.c.f187a);
        i.a((Object) unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        for (a.a.a.a.v0.f.a aVar12 : unmodifiableSet) {
            StringBuilder a19 = e.a.a.a.a.a("kotlin.jvm.internal.");
            a19.append(aVar12.f().a());
            a19.append("CompanionObject");
            a.a.a.a.v0.f.a a20 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b(a19.toString()));
            i.a((Object) a20, "ClassId.topLevel(FqName(…g() + \"CompanionObject\"))");
            a.a.a.a.v0.f.a a21 = aVar12.a(f.b);
            i.a((Object) a21, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            cVar.a(a20, a21);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            a.a.a.a.v0.f.a a22 = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b(e.a.a.a.a.a("kotlin.jvm.functions.Function", i2)));
            i.a((Object) a22, "ClassId.topLevel(FqName(…m.functions.Function$i\"))");
            a.a.a.a.v0.f.a aVar13 = new a.a.a.a.v0.f.a(g.f189f, d.b(g.c(i2)));
            i.a((Object) aVar13, "KotlinBuiltIns.getFunctionClassId(i)");
            cVar.a(a22, aVar13);
            cVar.a(new a.a.a.a.v0.f.b(b + i2), f254g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            b.c cVar10 = b.c.f244h;
            cVar.a(new a.a.a.a.v0.f.b(e.a.a.a.a.a(cVar10.f245c.toString() + "." + cVar10.f246d, i3)), f254g);
        }
        a.a.a.a.v0.f.b g2 = g.k.b.g();
        i.a((Object) g2, "FQ_NAMES.nothing.toSafe()");
        cVar.a(g2, cVar.a(Void.class));
    }

    public final e a(e eVar, Map<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> map, String str) {
        a.a.a.a.v0.f.b bVar = map.get(a.a.a.a.v0.j.g.e(eVar));
        if (bVar != null) {
            e a2 = a.a.a.a.v0.j.u.a.b((k) eVar).a(bVar);
            i.a((Object) a2, "descriptor.builtIns.getB…Name(oppositeClassFqName)");
            return a2;
        }
        throw new IllegalArgumentException("Given class " + eVar + " is not a " + str + " collection");
    }

    public final a.a.a.a.v0.f.a a(Class<?> cls) {
        a.a.a.a.v0.f.a aVar;
        String str;
        boolean z = !cls.isPrimitive() && !cls.isArray();
        if (!s.f2103a || z) {
            Class<?> declaringClass = cls.getDeclaringClass();
            if (declaringClass == null) {
                aVar = a.a.a.a.v0.f.a.a(new a.a.a.a.v0.f.b(cls.getCanonicalName()));
                str = "ClassId.topLevel(FqName(clazz.canonicalName))";
            } else {
                aVar = a(declaringClass).a(d.b(cls.getSimpleName()));
                str = "classId(outer).createNes…tifier(clazz.simpleName))";
            }
            i.a((Object) aVar, str);
            return aVar;
        }
        throw new AssertionError("Invalid class: " + cls);
    }

    public final void a(a.a.a.a.v0.f.a aVar, a.a.a.a.v0.f.a aVar2) {
        HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.a> hashMap = f255h;
        a.a.a.a.v0.f.c f2 = aVar.a().f();
        i.a((Object) f2, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(f2, aVar2);
        a.a.a.a.v0.f.b a2 = aVar2.a();
        i.a((Object) a2, "kotlinClassId.asSingleFqName()");
        HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.a> hashMap2 = i;
        a.a.a.a.v0.f.c f3 = a2.f();
        i.a((Object) f3, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap2.put(f3, aVar);
    }

    public final void a(a.a.a.a.v0.f.b bVar, a.a.a.a.v0.f.a aVar) {
        HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.a> hashMap = i;
        a.a.a.a.v0.f.c f2 = bVar.f();
        i.a((Object) f2, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(f2, aVar);
    }

    public final void a(Class<?> cls, a.a.a.a.v0.f.b bVar) {
        a.a.a.a.v0.f.a a2 = a(cls);
        a.a.a.a.v0.f.a a3 = a.a.a.a.v0.f.a.a(bVar);
        i.a((Object) a3, "ClassId.topLevel(kotlinFqName)");
        a(a2, a3);
    }

    public final void a(Class<?> cls, a.a.a.a.v0.f.c cVar) {
        a.a.a.a.v0.f.b g2 = cVar.g();
        i.a((Object) g2, "kotlinFqName.toSafe()");
        a(cls, g2);
    }

    public final boolean b(e eVar) {
        if (eVar != null) {
            a.a.a.a.v0.f.c e2 = a.a.a.a.v0.j.g.e(eVar);
            HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> hashMap = j;
            if (hashMap != null) {
                return hashMap.containsKey(e2);
            }
            throw new n("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        i.a("mutable");
        throw null;
    }

    public final boolean c(e eVar) {
        if (eVar != null) {
            a.a.a.a.v0.f.c e2 = a.a.a.a.v0.j.g.e(eVar);
            HashMap<a.a.a.a.v0.f.c, a.a.a.a.v0.f.b> hashMap = k;
            if (hashMap != null) {
                return hashMap.containsKey(e2);
            }
            throw new n("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
        i.a("readOnly");
        throw null;
    }

    public final e a(e eVar) {
        if (eVar != null) {
            return a(eVar, k, "read-only");
        }
        i.a("readOnly");
        throw null;
    }

    public final boolean a(a.a.a.a.v0.f.c cVar, String str) {
        String a2 = cVar.a();
        i.a((Object) a2, "kotlinFqName.asString()");
        String a3 = a.a0.i.a(a2, str, "");
        if (a3.length() > 0) {
            if (a3 != null) {
                if (!(a3.length() > 0 && a.a.a.a.v0.m.l1.a.a(a3.charAt(0), '0', false))) {
                    if (a3 != null) {
                        Integer a4 = a.a0.i.a(a3, 10);
                        if (a4 == null || a4.intValue() < 23) {
                            return false;
                        }
                        return true;
                    }
                    i.a("$this$toIntOrNull");
                    throw null;
                }
            } else {
                i.a("$this$startsWith");
                throw null;
            }
        }
        return false;
    }

    public final a.a.a.a.v0.f.a a(a.a.a.a.v0.f.b bVar) {
        if (bVar != null) {
            return f255h.get(bVar.f());
        }
        i.a("fqName");
        throw null;
    }

    public static /* synthetic */ e a(c cVar, a.a.a.a.v0.f.b bVar, g gVar, Integer num, int i2) {
        a.a.a.a.v0.f.a aVar;
        if ((i2 & 4) != 0) {
            num = null;
        }
        if (cVar == null) {
            throw null;
        } else if (bVar == null) {
            i.a("fqName");
            throw null;
        } else if (gVar != null) {
            if (num == null || !i.a(bVar, f253f)) {
                aVar = cVar.a(bVar);
            } else {
                aVar = new a.a.a.a.v0.f.a(g.f189f, d.b(g.c(num.intValue())));
            }
            if (aVar != null) {
                return gVar.a(aVar.a());
            }
            return null;
        } else {
            i.a("builtIns");
            throw null;
        }
    }

    public final a.a.a.a.v0.f.a a(a.a.a.a.v0.f.c cVar) {
        if (cVar == null) {
            i.a("kotlinFqName");
            throw null;
        } else if (!a(cVar, f249a) && !a(cVar, f250c)) {
            return (!a(cVar, b) && !a(cVar, f251d)) ? i.get(cVar) : f254g;
        } else {
            return f252e;
        }
    }
}
