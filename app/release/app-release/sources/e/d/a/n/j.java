package e.d.a.n;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import d.j.d.a;
import d.j.d.d;
import d.j.d.q;
import e.d.a.i;
import e.d.a.s.h;
import java.util.HashMap;
import java.util.Map;

public class j implements Handler.Callback {

    /* renamed from: e  reason: collision with root package name */
    public static final j f4216e = new j();

    /* renamed from: a  reason: collision with root package name */
    public volatile i f4217a;
    public final Map<FragmentManager, i> b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<q, m> f4218c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4219d = new Handler(Looper.getMainLooper(), this);

    public i a(Context context) {
        if (context != null) {
            if (h.c() && !(context instanceof Application)) {
                if (context instanceof d) {
                    d dVar = (d) context;
                    if (h.b()) {
                        return a(dVar.getApplicationContext());
                    }
                    if (!dVar.isDestroyed()) {
                        m a2 = a(dVar.f());
                        i iVar = a2.X;
                        if (iVar == null) {
                            iVar = new i(dVar, a2.Y, a2.Z);
                            a2.X = iVar;
                        }
                        return iVar;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (h.b()) {
                        return a(activity.getApplicationContext());
                    }
                    if (!activity.isDestroyed()) {
                        i a3 = a(activity.getFragmentManager());
                        i iVar2 = a3.f4213e;
                        if (iVar2 != null) {
                            return iVar2;
                        }
                        i iVar3 = new i(activity, a3.f4211c, a3.f4212d);
                        a3.f4213e = iVar3;
                        return iVar3;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    return a(((ContextWrapper) context).getBaseContext());
                }
            }
            return b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @TargetApi(17)
    public i a(FragmentManager fragmentManager) {
        i iVar = (i) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = this.b.get(fragmentManager);
        if (iVar2 != null) {
            return iVar2;
        }
        i iVar3 = new i();
        this.b.put(fragmentManager, iVar3);
        fragmentManager.beginTransaction().add(iVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.f4219d.obtainMessage(1, fragmentManager).sendToTarget();
        return iVar3;
    }

    public final i b(Context context) {
        if (this.f4217a == null) {
            synchronized (this) {
                if (this.f4217a == null) {
                    this.f4217a = new i(context.getApplicationContext(), new b(), new e());
                }
            }
        }
        return this.f4217a;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object obj3 = null;
        boolean z = true;
        if (i == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.b;
        } else if (i != 2) {
            z = false;
            obj = null;
            if (z && obj3 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj2 = (q) message.obj;
            map = this.f4218c;
        }
        obj3 = map.remove(obj2);
        obj = obj2;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    public m a(q qVar) {
        m mVar = (m) qVar.b("com.bumptech.glide.manager");
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = this.f4218c.get(qVar);
        if (mVar2 != null) {
            return mVar2;
        }
        m mVar3 = new m();
        this.f4218c.put(qVar, mVar3);
        a aVar = new a(qVar);
        aVar.a(0, mVar3, "com.bumptech.glide.manager", 1);
        aVar.a();
        this.f4219d.obtainMessage(2, qVar).sendToTarget();
        return mVar3;
    }
}
