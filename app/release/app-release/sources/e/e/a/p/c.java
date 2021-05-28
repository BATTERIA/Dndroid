package e.e.a.p;

import android.util.Log;
import com.didi.hummer.render.style.HummerLayout;
import e.c.a.b.l;
import e.e.a.q.d.b;
import e.e.a.q.d.d;
import e.e.a.y.a.b.h;
import e.e.a.y.a.b.j;
import e.e.a.y.d.a;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class c extends h<j> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public j a(e.e.a.q.b.c cVar, Object[] objArr) {
        return null;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public Object a(j jVar, String str, Object... objArr) {
        char c2;
        switch (str.hashCode()) {
            case -1919095251:
                if (str.equals("console.log")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1717253380:
                if (str.equals("console.debug")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1715927375:
                if (str.equals("console.error")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -934592106:
                if (str.equals("render")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -655303622:
                if (str.equals("setBasicWidth")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 637499109:
                if (str.equals("console.info")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 637904061:
                if (str.equals("console.warn")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                a.f4616a = ((Number) objArr[0]).floatValue();
                return null;
            case 1:
                j jVar2 = (j) ((e.e.a.x.a) this.b).a(((Number) objArr[0]).longValue());
                b bVar = this.f4585a;
                if (bVar == null) {
                    throw null;
                } else if (jVar2 == null) {
                    return null;
                } else {
                    e.e.a.q.b.c jSValue = jVar2.getJSValue();
                    bVar.f4447h = jSValue;
                    jSValue.l();
                    bVar.j = true;
                    e.e.a.q.b.c cVar = bVar.f4447h;
                    if (cVar != null) {
                        cVar.a("onCreate", new Object[0]);
                    }
                    HummerLayout hummerLayout = bVar.f4444e;
                    if (hummerLayout != null) {
                        hummerLayout.removeAllViews();
                        bVar.f4444e.a(jVar2, -1);
                    }
                    bVar.b();
                    return null;
                }
            case 2:
                l.f.a(this.f4585a.f4442c, 1, String.valueOf(objArr[0]));
                return null;
            case 3:
                l.f.a(this.f4585a.f4442c, 2, String.valueOf(objArr[0]));
                return null;
            case 4:
                l.f.a(this.f4585a.f4442c, 3, String.valueOf(objArr[0]));
                return null;
            case 5:
                l.f.a(this.f4585a.f4442c, 4, String.valueOf(objArr[0]));
                return null;
            case 6:
                l.f.a(this.f4585a.f4442c, 5, String.valueOf(objArr[0]));
                return null;
            default:
                b bVar2 = this.f4585a;
                if (!bVar2.m.containsKey(str)) {
                    String format = String.format("callFromJS: didn't register this function! [%s]", str);
                    if (!b.f4498a) {
                        return null;
                    }
                    Log.w("HummerNative", format);
                    return null;
                }
                for (int i = 0; i < objArr.length; i++) {
                    if (objArr[i] instanceof String) {
                        String str2 = (String) objArr[i];
                        if (str2.startsWith("-_-_-_hummer-object_-_-_-")) {
                            objArr[i] = d.a(str2.replace("-_-_-_hummer-object_-_-_-", ""), Map.class);
                        } else if (str2.startsWith("-_-_-_hummer-array_-_-_-")) {
                            objArr[i] = d.a(str2.replace("-_-_-_hummer-array_-_-_-", ""), List.class);
                        }
                    }
                }
                l.f.a("HummerNative", String.format("onJsFunctionCall: <%s> %s", str, Arrays.toString(objArr)));
                return bVar2.m.get(str).a(objArr);
        }
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Hummer";
    }
}
