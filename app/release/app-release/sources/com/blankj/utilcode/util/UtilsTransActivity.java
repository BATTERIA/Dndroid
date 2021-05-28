package com.blankj.utilcode.util;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import d.b.k.h;
import e.c.a.b.l;
import e.c.a.b.m;
import e.c.a.b.n;
import e.c.a.b.o;
import e.c.a.b.t;
import e.c.a.b.w;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UtilsTransActivity extends h {
    public static final Map<UtilsTransActivity, a> s = new HashMap();
    public static a t;

    public static abstract class a {
    }

    public static void a(t<Intent> tVar, a aVar) {
        if (aVar != null) {
            Intent intent = new Intent(l.f.b(), UtilsTransActivity.class);
            if (tVar != null) {
                intent.putExtra("TYPE", ((n.c.a) tVar).f3814a);
            }
            intent.addFlags(268435456);
            l.f.b().startActivity(intent);
            t = aVar;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (s.get(this) == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        finish();
        return true;
    }

    @Override // d.j.d.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (s.get(this) != null) {
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(0, 0);
        a aVar = t;
        if (aVar == null) {
            super.onCreate(bundle);
            finish();
            return;
        }
        s.put(this, aVar);
        if (t != null) {
            super.onCreate(bundle);
            n.c cVar = (n.c) t;
            if (cVar != null) {
                getWindow().addFlags(262160);
                int intExtra = getIntent().getIntExtra("TYPE", -1);
                if (intExtra == 1) {
                    n nVar = n.k;
                    if (nVar == null) {
                        Log.e("PermissionUtils", "request permissions failed");
                        finish();
                    } else {
                        n.e eVar = nVar.f3809e;
                        if (eVar != null) {
                            eVar.a(this);
                        }
                        n nVar2 = n.k;
                        o oVar = new o(cVar, this);
                        if (nVar2.b != null) {
                            Iterator<String> it = nVar2.f3811g.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (shouldShowRequestPermissionRationale(it.next())) {
                                        nVar2.a(this);
                                        nVar2.b.a(this, new m(nVar2, oVar, this));
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            nVar2.b = null;
                        }
                        if (!z) {
                            cVar.a(this);
                        }
                    }
                } else if (intExtra == 2) {
                    n.c.f3813a = 2;
                    Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
                    StringBuilder a2 = e.a.a.a.a.a("package:");
                    a2.append(l.f.b().getPackageName());
                    intent.setData(Uri.parse(a2.toString()));
                    if (!w.a(intent)) {
                        n.b();
                    } else {
                        startActivityForResult(intent, 2);
                    }
                } else if (intExtra == 3) {
                    n.c.f3813a = 3;
                    Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                    StringBuilder a3 = e.a.a.a.a.a("package:");
                    a3.append(l.f.b().getPackageName());
                    intent2.setData(Uri.parse(a3.toString()));
                    if (!w.a(intent2)) {
                        n.b();
                    } else {
                        startActivityForResult(intent2, 3);
                    }
                } else {
                    finish();
                    Log.e("PermissionUtils", "type is wrong.");
                }
                t = null;
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // d.b.k.h, d.j.d.d
    public void onDestroy() {
        super.onDestroy();
        if (s.get(this) != null) {
            int i = n.c.f3813a;
            if (i != -1) {
                if (i == 2) {
                    if (n.l != null) {
                        if (Settings.System.canWrite(l.f.b())) {
                            ((e.e.a.n.c.c.h) n.l).b();
                        } else {
                            ((e.e.a.n.c.c.h) n.l).a();
                        }
                        n.l = null;
                    }
                } else if (i == 3 && n.m != null) {
                    if (Settings.canDrawOverlays(l.f.b())) {
                        ((e.e.a.n.c.c.h) n.m).b();
                    } else {
                        ((e.e.a.n.c.c.h) n.m).a();
                    }
                    n.m = null;
                }
                n.c.f3813a = -1;
            }
            s.remove(this);
        }
    }

    @Override // d.j.d.d
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
        s.get(this);
    }

    @Override // d.j.d.d
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (s.get(this) != null) {
            finish();
            n nVar = n.k;
            if (nVar != null && nVar.f3811g != null) {
                nVar.a(this);
                nVar.a();
            }
        }
    }

    @Override // d.j.d.d
    public void onResume() {
        super.onResume();
        s.get(this);
    }

    @Override // androidx.activity.ComponentActivity, d.b.k.h, d.g.d.b, d.j.d.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        s.get(this);
    }

    @Override // d.b.k.h, d.j.d.d
    public void onStart() {
        super.onStart();
        s.get(this);
    }

    @Override // d.b.k.h, d.j.d.d
    public void onStop() {
        super.onStop();
        s.get(this);
    }
}
