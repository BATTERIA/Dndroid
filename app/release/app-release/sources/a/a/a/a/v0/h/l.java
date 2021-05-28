package a.a.a.a.v0.h;

import java.util.Iterator;
import java.util.Map;

public class l extends m {

    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: c  reason: collision with root package name */
        public Map.Entry<K, l> f1408c;

        public /* synthetic */ b(Map.Entry entry, a aVar) {
            this.f1408c = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1408c.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            l value = this.f1408c.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q) {
                l value = this.f1408c.getValue();
                q qVar = value.f1411c;
                value.f1411c = (q) obj;
                value.f1410a = null;
                value.b = true;
                return qVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: c  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f1409c;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f1409c = it;
        }

        public boolean hasNext() {
            return this.f1409c.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.f1409c.next();
            return next.getValue() instanceof l ? new b(next, null) : next;
        }

        public void remove() {
            this.f1409c.remove();
        }
    }

    public q a() {
        a(null);
        return this.f1411c;
    }

    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
