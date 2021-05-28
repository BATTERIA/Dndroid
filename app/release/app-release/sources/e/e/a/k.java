package e.e.a;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.didi.hummer.core.engine.jsc.jni.HummerException;
import e.c.a.b.l;
import e.e.a.a0.d;
import e.e.a.g;
import e.e.a.n.d.d.b;
import e.e.a.q.d.b;
import e.e.a.w.a.a;
import java.util.HashMap;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static Context f4312a;
    public static volatile boolean b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, g> f4313c = new HashMap();

    public static g a(String str) {
        if (TextUtils.isEmpty(str) || !f4313c.containsKey(str)) {
            str = "_HUMMER_SDK_NAMESPACE_DEFAULT_";
        }
        if (!f4313c.containsKey("_HUMMER_SDK_NAMESPACE_DEFAULT_")) {
            Map<String, g> map = f4313c;
            g.b bVar = new g.b();
            bVar.f4301a = null;
            map.put("_HUMMER_SDK_NAMESPACE_DEFAULT_", bVar.a());
        }
        return f4313c.get(str);
    }

    public static a a() {
        return null;
    }

    public static int b() {
        return 2;
    }

    public static void a(Context context, g gVar) {
        String str;
        g gVar2;
        long currentTimeMillis = System.currentTimeMillis();
        if (gVar != null && ((gVar2 = f4313c.get((str = gVar.f4294a))) == null || TextUtils.isEmpty(gVar2.f4294a))) {
            f4313c.put(str, gVar);
        }
        String str2 = null;
        if (!f4313c.containsKey("_HUMMER_SDK_NAMESPACE_DEFAULT_")) {
            Map<String, g> map = f4313c;
            g.b bVar = new g.b();
            bVar.f4301a = null;
            map.put("_HUMMER_SDK_NAMESPACE_DEFAULT_", bVar.a());
        }
        if (!b) {
            Context applicationContext = context.getApplicationContext();
            f4312a = applicationContext;
            try {
                b.f4498a = (applicationContext.getApplicationInfo() == null || (applicationContext.getApplicationInfo().flags & 2) == 0) ? false : true;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            l.f.a((Application) f4312a);
            e.e.a.n.d.d.b bVar2 = b.C0133b.f4355a;
            Application application = (Application) f4312a;
            if (bVar2 != null) {
                application.registerActivityLifecycleCallbacks(bVar2);
                try {
                    e.f.a.l.a(f4312a, false);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
                e.f.a.g.a(f4312a, "hummer-qjs");
                HummerException.init();
                b = true;
            } else {
                throw null;
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isInited", Boolean.valueOf(b));
        if (gVar != null) {
            str2 = gVar.f4294a;
        }
        d.a(str2, "HummerSDK.init", hashMap, currentTimeMillis);
    }
}
