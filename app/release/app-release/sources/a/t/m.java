package a.t;

import a.w.c.i;
import a.w.c.w.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class m implements Map, Serializable, a {

    /* renamed from: c  reason: collision with root package name */
    public static final m f2120c = new m();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void) || ((Void) obj) != null) {
            return false;
        }
        i.a("value");
        throw null;
    }

    @Override // java.util.Map
    public final Set<Map.Entry> entrySet() {
        return n.f2121c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final Set<Object> keySet() {
        return n.f2121c;
    }

    @Override // java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Collection values() {
        return l.f2119c;
    }
}
