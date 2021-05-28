package e.e.a.x;

import e.e.a.u.b;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a implements b, e.e.a.u.a {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, Object> f4553a = new ConcurrentHashMap<>();

    public <T> T a(long j) {
        return (T) this.f4553a.get(Long.valueOf(j));
    }

    @Override // e.e.a.u.b
    public void onCreate() {
    }

    @Override // e.e.a.u.b
    public void onDestroy() {
        Iterator<Map.Entry<Long, Object>> it = this.f4553a.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            it.remove();
            if (value instanceof b) {
                ((b) value).onDestroy();
            }
        }
    }

    @Override // e.e.a.u.a
    public void onPause() {
        for (Map.Entry<Long, Object> entry : this.f4553a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof e.e.a.u.a) {
                ((e.e.a.u.a) value).onPause();
            }
        }
    }

    @Override // e.e.a.u.a
    public void onResume() {
        for (Map.Entry<Long, Object> entry : this.f4553a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof e.e.a.u.a) {
                ((e.e.a.u.a) value).onResume();
            }
        }
    }
}
