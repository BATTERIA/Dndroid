package e.e.a.n.c.c;

import android.location.Location;
import android.os.Bundle;
import e.e.a.b0.c;
import e.e.a.n.c.b;

public class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4347a;

    public g(i iVar, b bVar) {
        this.f4347a = bVar;
    }

    @Override // e.e.a.b0.c
    public void a(Location location) {
        b bVar = this.f4347a;
        if (bVar != null) {
            bVar.onLocationChanged(location);
        }
    }

    @Override // e.e.a.b0.c
    public void onLocationChanged(Location location) {
        b bVar = this.f4347a;
        if (bVar != null) {
            bVar.onLocationChanged(location);
        }
    }

    @Override // e.e.a.b0.c
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
