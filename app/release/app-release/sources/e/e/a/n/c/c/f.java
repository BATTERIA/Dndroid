package e.e.a.n.c.c;

import android.location.Location;
import android.os.Bundle;
import e.c.a.b.l;
import e.e.a.b0.c;
import e.e.a.n.c.b;

public class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4346a;

    public f(i iVar, b bVar) {
        this.f4346a = bVar;
    }

    @Override // e.e.a.b0.c
    public void a(Location location) {
        l.f.c();
        b bVar = this.f4346a;
        if (bVar != null) {
            bVar.onLocationChanged(location);
        }
    }

    @Override // e.e.a.b0.c
    public void onLocationChanged(Location location) {
        l.f.c();
        b bVar = this.f4346a;
        if (bVar != null) {
            bVar.onLocationChanged(location);
        }
    }

    @Override // e.e.a.b0.c
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
