package e.d.a.n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import e.d.a.i;
import e.d.a.n.c;
import e.d.a.q.b;
import e.d.a.s.h;
import java.util.ArrayList;
import java.util.Iterator;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4206a;
    public final c.a b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4207c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4208d;

    /* renamed from: e  reason: collision with root package name */
    public final BroadcastReceiver f4209e = new a();

    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            d dVar = d.this;
            boolean z = dVar.f4207c;
            dVar.f4207c = dVar.a(context);
            d dVar2 = d.this;
            boolean z2 = dVar2.f4207c;
            if (z != z2) {
                i.c cVar = (i.c) dVar2.b;
                if (cVar == null) {
                    throw null;
                } else if (z2) {
                    l lVar = cVar.f3871a;
                    Iterator it = ((ArrayList) h.a(lVar.f4220a)).iterator();
                    while (it.hasNext()) {
                        b bVar = (b) it.next();
                        if (!bVar.d() && !bVar.isCancelled()) {
                            bVar.b();
                            if (!lVar.f4221c) {
                                bVar.c();
                            } else {
                                lVar.b.add(bVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public d(Context context, c.a aVar) {
        this.f4206a = context.getApplicationContext();
        this.b = aVar;
    }

    @Override // e.d.a.n.g
    public void a() {
        if (!this.f4208d) {
            this.f4207c = a(this.f4206a);
            this.f4206a.registerReceiver(this.f4209e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f4208d = true;
        }
    }

    public final boolean a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // e.d.a.n.g
    public void b() {
        if (this.f4208d) {
            this.f4206a.unregisterReceiver(this.f4209e);
            this.f4208d = false;
        }
    }

    @Override // e.d.a.n.g
    public void onDestroy() {
    }
}
