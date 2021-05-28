package d.b.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d.b.k.k;

public class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.f f2690a;

    public q(k.f fVar) {
        this.f2690a = fVar;
    }

    public void onReceive(Context context, Intent intent) {
        k.f fVar = this.f2690a;
        boolean a2 = fVar.f2672a.a();
        if (a2 != fVar.b) {
            fVar.b = a2;
            k.this.a();
        }
    }
}
