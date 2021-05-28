package a.a.a.a.v0.a.p;

import a.a.a.a.v0.b.b1.h;
import a.a.a.a.v0.b.l0;
import a.a.a.a.v0.b.m0;
import a.a.a.a.v0.b.v;
import a.a.a.a.v0.b.w;
import a.a.a.a.v0.b.x;
import a.a.a.a.v0.d.b.r;
import a.a.a.a.v0.j.w.i;
import a.a.a.a.v0.m.d0;
import a.a.a.a.v0.m.g0;
import a.a.a.a.v0.m.k0;
import a.a.l;
import a.e;
import a.t.n;
import a.w.c.f;
import a.w.c.i;
import a.w.c.j;
import a.w.c.p;
import a.w.c.s;
import e.f.a.g;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class k implements a.a.a.a.v0.b.c1.a, a.a.a.a.v0.b.c1.c {
    public static final /* synthetic */ l[] i = {s.a(new p(s.a(k.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), s.a(new p(s.a(k.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    public static final Set<String> j = g.a(r.f921a.c("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
    public static final Set<String> k;
    public static final Set<String> l;
    public static final Set<String> m;
    public static final Set<String> n;
    public static final Set<String> o;
    public static final a p = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final c f276a;
    public final e b;

    /* renamed from: c  reason: collision with root package name */
    public final e f277c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f278d;

    /* renamed from: e  reason: collision with root package name */
    public final a.a.a.a.v0.l.g f279e;

    /* renamed from: f  reason: collision with root package name */
    public final a.a.a.a.v0.l.a<a.a.a.a.v0.f.b, a.a.a.a.v0.b.e> f280f;

    /* renamed from: g  reason: collision with root package name */
    public final a.a.a.a.v0.l.g f281g;

    /* renamed from: h  reason: collision with root package name */
    public final w f282h;

    public static final class a {
        public /* synthetic */ a(f fVar) {
        }

        public final boolean a(a.a.a.a.v0.f.c cVar) {
            if (!i.a(cVar, a.a.a.a.v0.a.g.k.f203g)) {
                if (cVar != null) {
                    return a.a.a.a.v0.a.g.k.k0.get(cVar) != null;
                }
                a.a.a.a.v0.a.g.b(75);
                throw null;
            }
        }
    }

    public enum b {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    public static final class c extends j implements a.w.b.a<k0> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f288c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ a.a.a.a.v0.l.j f289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k kVar, a.a.a.a.v0.l.j jVar) {
            super(0);
            this.f288c = kVar;
            this.f289d = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public k0 a() {
            w wVar = (w) this.f288c.b.getValue();
            if (e.f263h != null) {
                return g.a(wVar, e.f262g, new x(this.f289d, (w) this.f288c.b.getValue())).v();
            }
            throw null;
        }
    }

    public static final class d extends j implements a.w.b.a<h> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ k f290c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(k kVar) {
            super(0);
            this.f290c = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // a.w.b.a
        public h a() {
            return h.b.a(g.c(a.a.a.a.v0.b.b1.g.a(this.f290c.f282h.m(), "This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version", null, null, 6)));
        }
    }

    static {
        r rVar = r.f921a;
        if (p != null) {
            List<a.a.a.a.v0.j.v.c> g2 = g.g(a.a.a.a.v0.j.v.c.BOOLEAN, a.a.a.a.v0.j.v.c.CHAR);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (a.a.a.a.v0.j.v.c cVar : g2) {
                String a2 = cVar.f().d().a();
                i.a((Object) a2, "it.wrapperFqName.shortName().asString()");
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                String str = cVar.f1606d;
                if (str != null) {
                    sb.append(str);
                    sb.append("Value()");
                    sb.append(cVar.a());
                    strArr[0] = sb.toString();
                    g.a((Collection) linkedHashSet, (Iterable) rVar.b(a2, strArr));
                } else {
                    a.a.a.a.v0.j.v.c.a(11);
                    throw null;
                }
            }
            k = g.a(g.a(g.a(g.a(g.a((Set) linkedHashSet, (Iterable) rVar.c("List", "sort(Ljava/util/Comparator;)V")), (Iterable) rVar.b("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), (Iterable) rVar.b("Double", "isInfinite()Z", "isNaN()Z")), (Iterable) rVar.b("Float", "isInfinite()Z", "isNaN()Z")), (Iterable) rVar.b("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
            r rVar2 = r.f921a;
            l = g.a(g.a(g.a(g.a(g.a(g.a((Set) rVar2.b("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable) rVar2.c("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable) rVar2.b("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), (Iterable) rVar2.b("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), (Iterable) rVar2.c("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), (Iterable) rVar2.c("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), (Iterable) rVar2.c("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
            r rVar3 = r.f921a;
            m = g.a(g.a((Set) rVar3.c("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), (Iterable) rVar3.c("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), (Iterable) rVar3.c("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
            r rVar4 = r.f921a;
            if (p != null) {
                List<a.a.a.a.v0.j.v.c> g3 = g.g(a.a.a.a.v0.j.v.c.BOOLEAN, a.a.a.a.v0.j.v.c.BYTE, a.a.a.a.v0.j.v.c.DOUBLE, a.a.a.a.v0.j.v.c.FLOAT, a.a.a.a.v0.j.v.c.BYTE, a.a.a.a.v0.j.v.c.INT, a.a.a.a.v0.j.v.c.LONG, a.a.a.a.v0.j.v.c.SHORT);
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (a.a.a.a.v0.j.v.c cVar2 : g3) {
                    String a3 = cVar2.f().d().a();
                    i.a((Object) a3, "it.wrapperFqName.shortName().asString()");
                    String[] a4 = rVar4.a("Ljava/lang/String;");
                    g.a((Collection) linkedHashSet2, (Iterable) rVar4.b(a3, (String[]) Arrays.copyOf(a4, a4.length)));
                }
                String[] a5 = rVar4.a("D");
                Set a6 = g.a((Set) linkedHashSet2, (Iterable) rVar4.b("Float", (String[]) Arrays.copyOf(a5, a5.length)));
                String[] a7 = rVar4.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
                n = g.a(a6, (Iterable) rVar4.b("String", (String[]) Arrays.copyOf(a7, a7.length)));
                r rVar5 = r.f921a;
                String[] a8 = rVar5.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
                o = rVar5.b("Throwable", (String[]) Arrays.copyOf(a8, a8.length));
                return;
            }
            throw null;
        }
        throw null;
    }

    public k(w wVar, a.a.a.a.v0.l.j jVar, a.w.b.a<? extends w> aVar, a.w.b.a<Boolean> aVar2) {
        if (wVar == null) {
            i.a("moduleDescriptor");
            throw null;
        } else if (jVar == null) {
            i.a("storageManager");
            throw null;
        } else if (aVar == null) {
            i.a("deferredOwnerModuleDescriptor");
            throw null;
        } else if (aVar2 != null) {
            this.f282h = wVar;
            this.f276a = c.m;
            this.b = g.m92a((a.w.b.a) aVar);
            this.f277c = g.m92a((a.w.b.a) aVar2);
            a.a.a.a.v0.b.d1.k kVar = new a.a.a.a.v0.b.d1.k(new l(this, this.f282h, new a.a.a.a.v0.f.b("java.io")), a.a.a.a.v0.f.d.b("Serializable"), v.ABSTRACT, a.a.a.a.v0.b.f.INTERFACE, g.c((Object) new g0(jVar, new m(this))), m0.f491a, false, jVar);
            kVar.a(i.b.b, n.f2121c, null);
            k0 v = kVar.v();
            a.w.c.i.a((Object) v, "mockSerializableClass.defaultType");
            this.f278d = v;
            this.f279e = jVar.a(new c(this, jVar));
            this.f280f = jVar.a();
            this.f281g = jVar.a(new d(this));
        } else {
            a.w.c.i.a("isAdditionalBuiltInsFeatureSupported");
            throw null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:151:0x026c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [a.t.l] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e0, code lost:
        if (r6 != 3) goto L_0x0309;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x024d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0318 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0275 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x024a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // a.a.a.a.v0.b.c1.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<a.a.a.a.v0.b.l0> a(a.a.a.a.v0.f.d r17, a.a.a.a.v0.b.e r18) {
        /*
        // Method dump skipped, instructions count: 831
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.a.p.k.a(a.a.a.a.v0.f.d, a.a.a.a.v0.b.e):java.util.Collection");
    }

    public final boolean a() {
        return ((Boolean) this.f277c.getValue()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f4, code lost:
        if (a.a.a.a.v0.a.p.k.n.contains(a.a.a.a.v0.d.b.r.f921a.a(r1, e.f.a.g.a((a.a.a.a.v0.b.s) r11, false, false, 3))) == false) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    @Override // a.a.a.a.v0.b.c1.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<a.a.a.a.v0.b.d> b(a.a.a.a.v0.b.e r15) {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.a.a.v0.a.p.k.b(a.a.a.a.v0.b.e):java.util.Collection");
    }

    @Override // a.a.a.a.v0.b.c1.a
    public Collection<d0> c(a.a.a.a.v0.b.e eVar) {
        if (eVar != null) {
            a.a.a.a.v0.f.c d2 = a.a.a.a.v0.j.u.a.d(eVar);
            boolean z = true;
            if (p.a(d2)) {
                k0 k0Var = (k0) g.a(this.f279e, i[0]);
                a.w.c.i.a((Object) k0Var, "cloneableType");
                return g.g(k0Var, this.f278d);
            }
            a aVar = p;
            if (d2 != null) {
                if (!aVar.a(d2)) {
                    a.a.a.a.v0.f.a a2 = c.m.a(d2);
                    if (a2 != null) {
                        try {
                            z = Serializable.class.isAssignableFrom(Class.forName(a2.a().a()));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    z = false;
                }
                if (z) {
                    return g.c((Object) this.f278d);
                }
                return a.t.l.f2119c;
            }
            a.w.c.i.a("fqName");
            throw null;
        }
        a.w.c.i.a("classDescriptor");
        throw null;
    }

    public final a.a.a.a.v0.d.a.a0.n.e d(a.a.a.a.v0.b.e eVar) {
        a.a.a.a.v0.f.a a2;
        a.a.a.a.v0.f.b a3;
        a.a.a.a.v0.d.a.a0.n.e eVar2 = null;
        if (eVar == null) {
            a.a.a.a.v0.a.g.b((int) d.b.j.AppCompatTheme_textColorAlertDialogListItem);
            throw null;
        } else if (a.a.a.a.v0.a.g.a(eVar, a.a.a.a.v0.a.g.k.f198a) || !a.a.a.a.v0.a.g.e(eVar)) {
            return null;
        } else {
            a.a.a.a.v0.f.c d2 = a.a.a.a.v0.j.u.a.d(eVar);
            if (!d2.d() || (a2 = this.f276a.a(d2)) == null || (a3 = a2.a()) == null) {
                return null;
            }
            a.w.c.i.a((Object) a3, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
            a.a.a.a.v0.b.e a4 = g.a((w) this.b.getValue(), a3, a.a.a.a.v0.c.a.d.f521d);
            if (a4 instanceof a.a.a.a.v0.d.a.a0.n.e) {
                eVar2 = a4;
            }
            return eVar2;
        }
    }

    @Override // a.a.a.a.v0.b.c1.a
    public Collection a(a.a.a.a.v0.b.e eVar) {
        a.a.a.a.v0.d.a.a0.n.e d2;
        a.a.a.a.v0.d.a.a0.n.g i0;
        Set<a.a.a.a.v0.f.d> a2;
        if (eVar != null) {
            return (!a() || (d2 = d(eVar)) == null || (i0 = d2.i0()) == null || (a2 = i0.a()) == null) ? n.f2121c : a2;
        }
        a.w.c.i.a("classDescriptor");
        throw null;
    }

    @Override // a.a.a.a.v0.b.c1.c
    public boolean a(a.a.a.a.v0.b.e eVar, l0 l0Var) {
        if (eVar == null) {
            a.w.c.i.a("classDescriptor");
            throw null;
        } else if (l0Var != null) {
            a.a.a.a.v0.d.a.a0.n.e d2 = d(eVar);
            if (d2 == null || !l0Var.y().b(a.a.a.a.v0.b.c1.d.f349a)) {
                return true;
            }
            if (!a()) {
                return false;
            }
            String a2 = g.a((a.a.a.a.v0.b.s) l0Var, false, false, 3);
            a.a.a.a.v0.d.a.a0.n.g i0 = d2.i0();
            a.a.a.a.v0.f.d d3 = l0Var.d();
            a.w.c.i.a((Object) d3, "functionDescriptor.name");
            Collection<l0> a3 = i0.a(d3, a.a.a.a.v0.c.a.d.f521d);
            if (!(a3 instanceof Collection) || !a3.isEmpty()) {
                Iterator<T> it = a3.iterator();
                while (it.hasNext()) {
                    if (a.w.c.i.a((Object) g.a((a.a.a.a.v0.b.s) it.next(), false, false, 3), (Object) a2)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            a.w.c.i.a("functionDescriptor");
            throw null;
        }
    }
}
