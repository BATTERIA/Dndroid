package d.b.k;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

public class t {

    /* renamed from: d  reason: collision with root package name */
    public static t f2697d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2698a;
    public final LocationManager b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2699c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2700a;
        public long b;
    }

    public t(Context context, LocationManager locationManager) {
        this.f2698a = context;
        this.b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    public boolean a() {
        long j;
        a aVar = this.f2699c;
        boolean z = true;
        if (aVar.b > System.currentTimeMillis()) {
            return aVar.f2700a;
        }
        Location location = null;
        Location a2 = c.a.a.a.a.a(this.f2698a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? a("network") : null;
        if (c.a.a.a.a.a(this.f2698a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = a("gps");
        }
        if (location == null || a2 == null ? location != null : location.getTime() > a2.getTime()) {
            a2 = location;
        }
        if (a2 != null) {
            a aVar2 = this.f2699c;
            long currentTimeMillis = System.currentTimeMillis();
            if (s.f2694d == null) {
                s.f2694d = new s();
            }
            s sVar = s.f2694d;
            sVar.a(currentTimeMillis - 86400000, a2.getLatitude(), a2.getLongitude());
            sVar.a(currentTimeMillis, a2.getLatitude(), a2.getLongitude());
            if (sVar.f2696c != 1) {
                z = false;
            }
            long j2 = sVar.b;
            long j3 = sVar.f2695a;
            sVar.a(currentTimeMillis + 86400000, a2.getLatitude(), a2.getLongitude());
            long j4 = sVar.b;
            if (j2 == -1 || j3 == -1) {
                j = currentTimeMillis + 43200000;
            } else {
                j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
            }
            aVar2.f2700a = z;
            aVar2.b = j;
            return aVar.f2700a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i < 6 || i >= 22) {
            return true;
        }
        return false;
    }
}
