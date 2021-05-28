package e.e.a.n.d.d;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import d.j.d.n;
import d.j.d.q;
import e.e.a.n.d.a;
import e.e.a.n.d.b;
import e.e.a.n.d.c;
import e.e.a.n.d.d.b;
import java.util.HashMap;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public c f4356a;

    public d() {
        this.f4356a = null;
        this.f4356a = new c();
    }

    public /* synthetic */ void a(b bVar, int i, Intent intent) {
        HashMap hashMap;
        if (intent == null || intent.getExtras() == null) {
            hashMap = null;
        } else {
            Bundle extras = intent.getExtras();
            hashMap = new HashMap();
            for (String str : extras.keySet()) {
                Object obj = extras.get(str);
                if (obj != null) {
                    hashMap.put(str, obj);
                }
            }
        }
        if (!(bVar == null || hashMap == null)) {
            bVar.a(hashMap);
        }
    }

    public void a(Context context, c cVar, b bVar) {
        if (this.f4356a != null) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.didi.hummer.HummerActivity");
            intent.putExtra("PAGE_ID", cVar.f4349c);
            intent.putExtra("PAGE_MODEL", cVar);
            a(context, intent, cVar, bVar);
            return;
        }
        throw null;
    }

    public void a(Context context, Intent intent, c cVar, b bVar) {
        e.e.a.n.d.d.e.c cVar2;
        e.e.a.n.d.d.e.b bVar2;
        int nextInt;
        int nextInt2;
        if (intent != null) {
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            if (cVar.f4352f) {
                context.startActivity(intent);
            } else {
                if (context instanceof d.j.d.d) {
                    d.j.d.d dVar = (d.j.d.d) context;
                    cVar2 = (e.e.a.n.d.d.e.c) dVar.f().b("ActivityLauncher");
                    if (cVar2 == null) {
                        cVar2 = new e.e.a.n.d.d.e.c();
                        q f2 = dVar.f();
                        if (f2 != null) {
                            d.j.d.a aVar = new d.j.d.a(f2);
                            aVar.a(0, cVar2, "ActivityLauncher", 1);
                            aVar.a();
                            f2.d(true);
                            f2.g();
                        } else {
                            throw null;
                        }
                    }
                    bVar2 = null;
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    e.e.a.n.d.d.e.b bVar3 = (e.e.a.n.d.d.e.b) activity.getFragmentManager().findFragmentByTag("ActivityLauncher");
                    if (bVar3 == null) {
                        bVar3 = new e.e.a.n.d.d.e.b();
                        FragmentManager fragmentManager = activity.getFragmentManager();
                        fragmentManager.beginTransaction().add(bVar3, "ActivityLauncher").commitAllowingStateLoss();
                        fragmentManager.executePendingTransactions();
                    }
                    bVar2 = bVar3;
                    cVar2 = null;
                } else {
                    bVar2 = null;
                    cVar2 = null;
                }
                a aVar2 = new a(this, bVar);
                if (cVar2 != null) {
                    int i = 0;
                    do {
                        nextInt2 = cVar2.Y.nextInt(65535);
                        i++;
                        if (cVar2.X.indexOfKey(nextInt2) < 0) {
                            break;
                        }
                    } while (i < 10);
                    cVar2.X.put(nextInt2, aVar2);
                    n<?> nVar = cVar2.u;
                    if (nVar != null) {
                        d.j.d.d dVar2 = d.j.d.d.this;
                        dVar2.m = true;
                        if (nextInt2 == -1) {
                            try {
                                d.g.d.a.a(dVar2, intent, -1, null);
                            } catch (Throwable th) {
                                dVar2.m = false;
                                throw th;
                            }
                        } else {
                            d.j.d.d.a(nextInt2);
                            d.g.d.a.a(dVar2, intent, ((dVar2.a(cVar2) + 1) << 16) + (nextInt2 & 65535), null);
                        }
                        dVar2.m = false;
                    } else {
                        throw new IllegalStateException("Fragment " + cVar2 + " not attached to Activity");
                    }
                } else if (bVar2 != null) {
                    int i2 = 0;
                    do {
                        nextInt = bVar2.f4358d.nextInt(65535);
                        i2++;
                        if (bVar2.f4357c.indexOfKey(nextInt) < 0) {
                            break;
                        }
                    } while (i2 < 10);
                    bVar2.f4357c.put(nextInt, aVar2);
                    bVar2.startActivityForResult(intent, nextInt);
                } else if (context != null) {
                    context.startActivity(intent);
                } else {
                    throw new RuntimeException("please do init first!");
                }
            }
            if (!cVar.f4351e && (context instanceof Activity)) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
            if (cVar.f4352f && (context instanceof Activity)) {
                ((Activity) context).finish();
            }
        }
    }

    public void a(Context context, c cVar) {
        Activity activity = null;
        if (cVar != null && !TextUtils.isEmpty(cVar.f4349c)) {
            b bVar = b.C0133b.f4355a;
            String str = cVar.f4349c;
            if (bVar == null) {
                throw null;
            } else if (!TextUtils.isEmpty(str)) {
                int size = bVar.f4354a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Activity activity2 = bVar.f4354a.get(size);
                    if (str.equals(bVar.a(activity2))) {
                        activity = activity2;
                        break;
                    }
                }
            }
        } else if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            activity.finish();
            if (cVar != null && !cVar.f4351e) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }
}
