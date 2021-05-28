package e.e.a.a0;

import e.e.a.c;
import e.e.a.g;
import e.e.a.k;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ExecutorService f4288a = Executors.newSingleThreadExecutor();

    public interface a {
        void a(String str, Map<String, Object> map);
    }

    public static /* synthetic */ void a(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void a(String str, Map map) {
        g a2 = k.a(str);
        if (a2.f4295c == null) {
            a2.f4295c = c.f4291a;
        }
        a aVar = a2.f4295c;
        if (aVar != null) {
            aVar.a("hummer_sdk_trace_event", map);
        }
    }

    public static void b(String str, Map<String, Object> map) {
        f4288a.submit(new c(new b(str, map)));
    }

    public static /* synthetic */ void a(String str, Map map, String str2, long j) {
        HashMap hashMap;
        g a2 = k.a(str);
        if (a2.f4295c == null) {
            a2.f4295c = c.f4291a;
        }
        a aVar = a2.f4295c;
        if (aVar != null) {
            if (map == null) {
                hashMap = new HashMap();
            }
            hashMap.put("event_name", str2);
            hashMap.put("time_cost", Long.valueOf(System.currentTimeMillis() - j));
            aVar.a("hummer_sdk_trace_performance", hashMap);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, long j) {
        f4288a.submit(new c(new a(str, map, str2, j)));
    }
}
