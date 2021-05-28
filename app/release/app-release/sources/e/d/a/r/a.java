package e.d.a.r;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import e.d.a.m.c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, c> f4264a = new ConcurrentHashMap<>();

    public static c a(Context context) {
        PackageInfo packageInfo;
        String packageName = context.getPackageName();
        c cVar = f4264a.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            packageInfo = null;
        }
        c cVar2 = new c(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
        c putIfAbsent = f4264a.putIfAbsent(packageName, cVar2);
        return putIfAbsent == null ? cVar2 : putIfAbsent;
    }
}
