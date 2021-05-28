package e.d.a.m.j;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class i implements d {
    public final Map<String, List<h>> b;

    /* renamed from: c  reason: collision with root package name */
    public volatile Map<String, String> f4065c;

    public static final class a {
        public static final String b = System.getProperty("http.agent");

        /* renamed from: c  reason: collision with root package name */
        public static final Map<String, List<h>> f4066c;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<h>> f4067a;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b)));
            }
            hashMap.put("Accept-Encoding", Collections.singletonList(new b("identity")));
            f4066c = Collections.unmodifiableMap(hashMap);
        }

        public a() {
            Map<String, List<h>> map = f4066c;
            this.f4067a = map;
            map.containsKey(b);
        }
    }

    public static final class b implements h {

        /* renamed from: a  reason: collision with root package name */
        public final String f4068a;

        public b(String str) {
            this.f4068a = str;
        }

        @Override // e.d.a.m.j.h
        public String a() {
            return this.f4068a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f4068a.equals(((b) obj).f4068a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4068a.hashCode();
        }

        public String toString() {
            StringBuilder a2 = e.a.a.a.a.a("StringHeaderFactory{value='");
            a2.append(this.f4068a);
            a2.append('\'');
            a2.append('}');
            return a2.toString();
        }
    }

    public i(Map<String, List<h>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    @Override // e.d.a.m.j.d
    public Map<String, String> a() {
        if (this.f4065c == null) {
            synchronized (this) {
                if (this.f4065c == null) {
                    this.f4065c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.f4065c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<h>> entry : this.b.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List<h> value = entry.getValue();
            for (int i = 0; i < value.size(); i++) {
                sb.append(value.get(i).a());
                if (i != value.size() - 1) {
                    sb.append(',');
                }
            }
            hashMap.put(entry.getKey(), sb.toString());
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.b.equals(((i) obj).b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("LazyHeaders{headers=");
        a2.append(this.b);
        a2.append('}');
        return a2.toString();
    }
}
