package com.didi.hummer.module;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import e.c.a.b.l;
import e.e.a.k;
import e.e.a.n.d.c;
import e.e.a.n.d.d.b;
import e.e.a.n.d.d.d;
import e.e.a.p.b;
import e.e.a.q.b.a;
import java.util.Map;

@Component
public class Navigator {
    public static /* synthetic */ void a(a aVar, Map map) {
        if (aVar != null) {
            aVar.a(map);
            aVar.d();
        }
    }

    @JsMethod
    public static void openPage(b bVar, c cVar, a aVar) {
        if (cVar != null) {
            cVar.f4350d = l.f.b(cVar.f4350d, bVar.i);
        }
        e.e.a.n.d.a e2 = l.f.e(bVar.f4442c);
        Context baseContext = bVar.getBaseContext();
        e.e.a.v.a aVar2 = new e.e.a.v.a(aVar);
        d dVar = (d) e2;
        if (dVar != null) {
            if (baseContext == null) {
                baseContext = k.f4312a;
            }
            if (baseContext != null && cVar != null && !TextUtils.isEmpty(cVar.f4350d)) {
                String scheme = TextUtils.isEmpty(cVar.f4350d) ? null : Uri.parse(cVar.f4350d).getScheme();
                if (!TextUtils.isEmpty(scheme)) {
                    String lowerCase = scheme.toLowerCase();
                    char c2 = 65535;
                    int hashCode = lowerCase.hashCode();
                    if (hashCode != -1206128422) {
                        if (hashCode != 3213448) {
                            if (hashCode == 99617003 && lowerCase.equals("https")) {
                                c2 = 2;
                            }
                        } else if (lowerCase.equals("http")) {
                            c2 = 1;
                        }
                    } else if (lowerCase.equals("hummer")) {
                        c2 = 0;
                    }
                    if (c2 != 0) {
                        if (c2 == 1 || c2 == 2) {
                            if (!cVar.a()) {
                                if (dVar.f4356a != null) {
                                    dVar.a(baseContext, null, cVar, aVar2);
                                    return;
                                }
                                throw null;
                            }
                        } else if (!cVar.a()) {
                            if (dVar.f4356a != null) {
                                dVar.a(baseContext, null, cVar, aVar2);
                                return;
                            }
                            throw null;
                        }
                    }
                } else if (!cVar.a()) {
                    return;
                }
                dVar.a(baseContext, cVar, aVar2);
                return;
            }
            return;
        }
        throw null;
    }

    @JsMethod
    public static void popBack(b bVar, int i, c cVar) {
        e.e.a.n.d.a e2 = l.f.e(bVar.f4442c);
        Context baseContext = bVar.getBaseContext();
        d dVar = (d) e2;
        if (dVar == null) {
            throw null;
        } else if (i == 1) {
            dVar.a(baseContext, cVar);
        } else {
            boolean z = cVar == null || cVar.f4351e;
            e.e.a.n.d.d.b bVar2 = b.C0133b.f4355a;
            if (i < 1) {
                i = 1;
            }
            if (i > bVar2.f4354a.size()) {
                i = bVar2.f4354a.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                Activity pop = bVar2.f4354a.pop();
                if (pop != null) {
                    pop.finish();
                }
                if (!z && pop != null) {
                    pop.overridePendingTransition(0, 0);
                }
            }
        }
    }

    @JsMethod
    public static void popPage(e.e.a.p.b bVar, c cVar) {
        ((d) l.f.e(bVar.f4442c)).a(bVar.getBaseContext(), cVar);
    }

    @JsMethod
    public static void popToPage(e.e.a.p.b bVar, c cVar) {
        e.e.a.n.d.a e2 = l.f.e(bVar.f4442c);
        bVar.getBaseContext();
        if (((d) e2) == null) {
            throw null;
        } else if (cVar != null) {
            e.e.a.n.d.d.b bVar2 = b.C0133b.f4355a;
            String str = cVar.f4349c;
            boolean z = cVar.f4351e;
            if (bVar2 == null) {
                throw null;
            } else if (!TextUtils.isEmpty(str)) {
                boolean z2 = true;
                int size = bVar2.f4354a.size() - 1;
                int i = 0;
                while (true) {
                    if (size < 0) {
                        z2 = false;
                        break;
                    } else if (str.equals(bVar2.a(bVar2.f4354a.get(size)))) {
                        break;
                    } else {
                        i++;
                        size--;
                    }
                }
                if (z2) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!bVar2.f4354a.isEmpty()) {
                            Activity pop = bVar2.f4354a.pop();
                            if (pop != null) {
                                pop.finish();
                            }
                            if (!z && pop != null) {
                                pop.overridePendingTransition(0, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @JsMethod
    public static void popToRootPage(e.e.a.p.b bVar, c cVar) {
        e.e.a.n.d.a e2 = l.f.e(bVar.f4442c);
        bVar.getBaseContext();
        if (((d) e2) != null) {
            boolean z = cVar == null || cVar.f4351e;
            e.e.a.n.d.d.b bVar2 = b.C0133b.f4355a;
            while (bVar2.f4354a.size() > 1) {
                Activity pop = bVar2.f4354a.pop();
                if (pop != null) {
                    pop.finish();
                }
                if (!z && pop != null) {
                    pop.overridePendingTransition(0, 0);
                }
            }
            return;
        }
        throw null;
    }
}
