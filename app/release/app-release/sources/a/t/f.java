package a.t;

import a.a.a.a.v0.m.l1.a;
import a.j;
import a.w.b.l;
import a.w.c.i;
import a.z.h;
import e.f.a.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

public class f extends d {
    public static /* synthetic */ Appendable a(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l lVar, int i2) {
        a(iterable, appendable, (i2 & 2) != 0 ? ", " : charSequence, (i2 & 4) != 0 ? "" : charSequence2, (i2 & 8) != 0 ? "" : charSequence3, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static /* synthetic */ String a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) != 0 ? "" : charSequence3;
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return a(iterable, charSequence, str, str2, i3, charSequence4, lVar);
    }

    public static final <T> List<T> a(T[] tArr) {
        if (tArr != null) {
            List<T> asList = Arrays.asList(tArr);
            i.a((Object) asList, "ArraysUtilJVM.asList(this)");
            return asList;
        }
        i.a("$this$asList");
        throw null;
    }

    public static final <T> T b(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$first");
            throw null;
        } else if (iterable instanceof List) {
            return (T) a((List) iterable);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            if (it.hasNext()) {
                return (T) it.next();
            }
            throw new NoSuchElementException("Collection is empty.");
        }
    }

    public static final <T> T c(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$firstOrNull");
            throw null;
        } else if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            if (!it.hasNext()) {
                return null;
            }
            return (T) it.next();
        }
    }

    public static final <T> T d(Iterable<? extends T> iterable) {
        T t;
        if (iterable == null) {
            i.a("$this$last");
            throw null;
        } else if (iterable instanceof List) {
            return (T) c((List) iterable);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            if (it.hasNext()) {
                do {
                    t = (T) it.next();
                } while (it.hasNext());
                return t;
            }
            throw new NoSuchElementException("Collection is empty.");
        }
    }

    public static final <T> T e(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$single");
            throw null;
        } else if (iterable instanceof List) {
            return (T) e((List) iterable);
        } else {
            Iterator<? extends T> it = iterable.iterator();
            if (it.hasNext()) {
                T t = (T) it.next();
                if (!it.hasNext()) {
                    return t;
                }
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            throw new NoSuchElementException("Collection is empty.");
        }
    }

    public static final <T> T f(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$singleOrNull");
            throw null;
        } else if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        } else {
            Iterator<? extends T> it = iterable.iterator();
            if (!it.hasNext()) {
                return null;
            }
            T t = (T) it.next();
            if (it.hasNext()) {
                return null;
            }
            return t;
        }
    }

    public static final <T> List<T> g(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$toList");
            throw null;
        } else if (!(iterable instanceof Collection)) {
            return g.c(i(iterable));
        } else {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return l.f2119c;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return g.c(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
    }

    public static final <K, V> Map<K, V> h(Iterable<? extends j<? extends K, ? extends V>> iterable) {
        if (iterable == null) {
            i.a("$this$toMap");
            throw null;
        } else if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return m.f2120c;
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(collection.size()));
                a((Iterable) iterable, (Map) linkedHashMap);
                return linkedHashMap;
            }
            return g.a((j) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            a((Iterable) iterable, (Map) linkedHashMap2);
            int size2 = linkedHashMap2.size();
            if (size2 == 0) {
                return m.f2120c;
            }
            if (size2 != 1) {
                return linkedHashMap2;
            }
            Map.Entry<K, V> next = linkedHashMap2.entrySet().iterator().next();
            Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
            i.a((Object) singletonMap, "java.util.Collections.singletonMap(key, value)");
            i.a((Object) singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
            return singletonMap;
        }
    }

    public static final <T> List<T> i(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$toMutableList");
            throw null;
        } else if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        } else {
            ArrayList arrayList = new ArrayList();
            a((Iterable) iterable, (Collection) arrayList);
            return arrayList;
        }
    }

    public static final <T> Set<T> j(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$toMutableSet");
            throw null;
        } else if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            a((Iterable) iterable, (Collection) linkedHashSet);
            return linkedHashSet;
        }
    }

    public static final <T> Set<T> k(Iterable<? extends T> iterable) {
        if (iterable == null) {
            i.a("$this$toSet");
            throw null;
        } else if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return n.f2121c;
            }
            if (size != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(g.e(collection.size()));
                a((Iterable) iterable, (Collection) linkedHashSet);
                return linkedHashSet;
            }
            return g.e(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            a((Iterable) iterable, (Collection) linkedHashSet2);
            LinkedHashSet linkedHashSet3 = linkedHashSet2;
            int size2 = linkedHashSet3.size();
            if (size2 == 0) {
                return n.f2121c;
            }
            if (size2 != 1) {
                return linkedHashSet3;
            }
            return g.e(linkedHashSet3.iterator().next());
        }
    }

    public static final <T> Iterable<o<T>> l(Iterable<? extends T> iterable) {
        if (iterable != null) {
            return new p(new j(iterable));
        }
        i.a("$this$withIndex");
        throw null;
    }

    public static final <T> T b(List<? extends T> list) {
        if (list == null) {
            i.a("$this$firstOrNull");
            throw null;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return (T) list.get(0);
        }
    }

    public static final <T> T c(List<? extends T> list) {
        if (list == null) {
            i.a("$this$last");
            throw null;
        } else if (!list.isEmpty()) {
            return (T) list.get(g.a((List) list));
        } else {
            throw new NoSuchElementException("List is empty.");
        }
    }

    public static final <T> T d(List<? extends T> list) {
        if (list == null) {
            i.a("$this$lastOrNull");
            throw null;
        } else if (list.isEmpty()) {
            return null;
        } else {
            return (T) list.get(list.size() - 1);
        }
    }

    public static final <T> T e(List<? extends T> list) {
        if (list != null) {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            } else if (size == 1) {
                return (T) list.get(0);
            } else {
                throw new IllegalArgumentException("List has more than one element.");
            }
        } else {
            i.a("$this$single");
            throw null;
        }
    }

    public static final <T> T f(List<? extends T> list) {
        if (list == null) {
            i.a("$this$singleOrNull");
            throw null;
        } else if (list.size() == 1) {
            return (T) list.get(0);
        } else {
            return null;
        }
    }

    public static final <T> T b(List<? extends T> list, int i) {
        if (list == null) {
            i.a("$this$getOrNull");
            throw null;
        } else if (i < 0 || i > g.a((List) list)) {
            return null;
        } else {
            return (T) list.get(i);
        }
    }

    public static final <T> h<T> a(Iterable<? extends T> iterable) {
        if (iterable != null) {
            return new i(iterable);
        }
        i.a("$this$asSequence");
        throw null;
    }

    public static final <T> List<T> b(Iterable<? extends T> iterable, T t) {
        if (iterable == null) {
            i.a("$this$plus");
            throw null;
        } else if (iterable instanceof Collection) {
            return a((Collection) iterable, (Object) t);
        } else {
            ArrayList arrayList = new ArrayList();
            g.a(arrayList, iterable);
            arrayList.add(t);
            return arrayList;
        }
    }

    public static final <T> boolean a(Iterable<? extends T> iterable, T t) {
        int i;
        if (iterable == null) {
            i.a("$this$contains");
            throw null;
        } else if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        } else {
            if (!(iterable instanceof List)) {
                Iterator<? extends T> it = iterable.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i2 < 0) {
                        g.d();
                        throw null;
                    } else if (i.a(t, next)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                i = ((List) iterable).indexOf(t);
            }
            return i >= 0;
        }
    }

    public static final <T> T[] a(T[] tArr, int i, int i2) {
        if (tArr != null) {
            int length = tArr.length;
            if (i2 <= length) {
                T[] tArr2 = (T[]) Arrays.copyOfRange(tArr, i, i2);
                i.a((Object) tArr2, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
                return tArr2;
            }
            throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
        }
        i.a("$this$copyOfRangeImpl");
        throw null;
    }

    public static final <T> List<T> a(Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        if (iterable != null) {
            int i2 = 0;
            if (!(i >= 0)) {
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            } else if (i == 0) {
                return g(iterable);
            } else {
                if (iterable instanceof Collection) {
                    Collection collection = (Collection) iterable;
                    int size = collection.size() - i;
                    if (size <= 0) {
                        return l.f2119c;
                    }
                    if (size == 1) {
                        return g.c(d(iterable));
                    }
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                } else {
                    arrayList = new ArrayList();
                }
                for (Object obj : iterable) {
                    if (i2 >= i) {
                        arrayList.add(obj);
                    } else {
                        i2++;
                    }
                }
                return g.c((List) arrayList);
            }
        } else {
            i.a("$this$drop");
            throw null;
        }
    }

    public static final <T> List<T> a(List<? extends T> list, int i) {
        if (list != null) {
            int i2 = 0;
            if (i >= 0) {
                int size = list.size() - i;
                if (size < 0) {
                    size = 0;
                }
                if (!(size >= 0)) {
                    throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
                } else if (size == 0) {
                    return l.f2119c;
                } else {
                    if (size >= list.size()) {
                        return g(list);
                    }
                    if (size == 1) {
                        return g.c(b((Iterable) list));
                    }
                    ArrayList arrayList = new ArrayList(size);
                    for (T t : list) {
                        arrayList.add(t);
                        i2++;
                        if (i2 == size) {
                            break;
                        }
                    }
                    return g.c((List) arrayList);
                }
            } else {
                throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
        } else {
            i.a("$this$dropLast");
            throw null;
        }
    }

    public static final <T> List<T> a(Iterable<? extends T> iterable, l<? super T, Boolean> lVar) {
        if (iterable == null) {
            i.a("$this$filter");
            throw null;
        } else if (lVar != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                Object obj = (Object) it.next();
                if (lVar.a(obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } else {
            i.a("predicate");
            throw null;
        }
    }

    public static final <T> T a(List<? extends T> list) {
        if (list == null) {
            i.a("$this$first");
            throw null;
        } else if (!list.isEmpty()) {
            return (T) list.get(0);
        } else {
            throw new NoSuchElementException("List is empty.");
        }
    }

    public static final <T, A extends Appendable> A a(Iterable<? extends T> iterable, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        if (iterable == null) {
            i.a("$this$joinTo");
            throw null;
        } else if (a2 == null) {
            i.a("buffer");
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
            a2.append(charSequence2);
            int i2 = 0;
            for (Object obj : iterable) {
                i2++;
                if (i2 > 1) {
                    a2.append(charSequence);
                }
                if (i >= 0 && i2 > i) {
                    break;
                }
                a.a(a2, obj, lVar);
            }
            if (i >= 0 && i2 > i) {
                a2.append(charSequence4);
            }
            a2.append(charSequence3);
            return a2;
        } else {
            i.a("truncated");
            throw null;
        }
    }

    public static final <T> String a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        if (iterable == null) {
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
            a(iterable, sb, charSequence, charSequence2, charSequence3, i, charSequence4, lVar);
            String sb2 = sb.toString();
            i.a((Object) sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb2;
        } else {
            i.a("truncated");
            throw null;
        }
    }

    public static final <K, V> Map<K, V> a(j<? extends K, ? extends V>... jVarArr) {
        if (jVarArr == null) {
            i.a("pairs");
            throw null;
        } else if (jVarArr.length <= 0) {
            return m.f2120c;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.e(jVarArr.length));
            for (j<? extends K, ? extends V> jVar : jVarArr) {
                linkedHashMap.put(jVar.f2088c, jVar.f2089d);
            }
            return linkedHashMap;
        }
    }

    public static final <T> List<T> a(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        if (collection == null) {
            i.a("$this$plus");
            throw null;
        } else if (iterable == null) {
            i.a("elements");
            throw null;
        } else if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        } else {
            ArrayList arrayList2 = new ArrayList(collection);
            g.a(arrayList2, iterable);
            return arrayList2;
        }
    }

    public static final <T> List<T> a(Collection<? extends T> collection, T t) {
        if (collection != null) {
            ArrayList arrayList = new ArrayList(collection.size() + 1);
            arrayList.addAll(collection);
            arrayList.add(t);
            return arrayList;
        }
        i.a("$this$plus");
        throw null;
    }

    public static final <T> void a(T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null) {
            i.a("$this$sortWith");
            throw null;
        } else if (comparator == null) {
            i.a("comparator");
            throw null;
        } else if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final <T, C extends Collection<? super T>> C a(Iterable<? extends T> iterable, C c2) {
        if (iterable == null) {
            i.a("$this$toCollection");
            throw null;
        } else if (c2 != null) {
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                c2.add(it.next());
            }
            return c2;
        } else {
            i.a("destination");
            throw null;
        }
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M a(Iterable<? extends j<? extends K, ? extends V>> iterable, M m) {
        if (iterable == null) {
            i.a("$this$toMap");
            throw null;
        } else if (m != null) {
            Iterator<? extends j<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                m.put(jVar.f2088c, jVar.f2089d);
            }
            return m;
        } else {
            i.a("destination");
            throw null;
        }
    }

    public static final <T, R> List<j<T, R>> a(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        if (iterable == null) {
            i.a("$this$zip");
            throw null;
        } else if (iterable2 != null) {
            Iterator<? extends T> it = iterable.iterator();
            Iterator<? extends R> it2 = iterable2.iterator();
            ArrayList arrayList = new ArrayList(Math.min(g.a(iterable, 10), g.a(iterable2, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList.add(new j(it.next(), it2.next()));
            }
            return arrayList;
        } else {
            i.a("other");
            throw null;
        }
    }
}
