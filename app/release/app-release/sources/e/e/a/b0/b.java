package e.e.a.b0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import e.c.a.b.l;

public class b implements LocationListener {
    public /* synthetic */ b(a aVar) {
    }

    public void onLocationChanged(Location location) {
        c cVar = l.f.b;
        if (cVar != null) {
            cVar.onLocationChanged(location);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
        c cVar = l.f.b;
        if (cVar != null) {
            cVar.onStatusChanged(str, i, bundle);
        }
        if (i == 0) {
            l.a("LocationUtils", "当前GPS状态为服务区外状态");
        } else if (i == 1) {
            l.a("LocationUtils", "当前GPS状态为暂停服务状态");
        } else if (i == 2) {
            l.a("LocationUtils", "当前GPS状态为可见状态");
        }
    }
}
