package e.e.a.y.a.a;

import com.didi.hummer.render.component.anim.BasicAnimation;
import e.e.a.q.b.a;
import e.e.a.q.d.d;
import e.e.a.y.a.b.h;

public class c extends h<BasicAnimation> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public BasicAnimation a(e.e.a.q.b.c cVar, Object[] objArr) {
        return new BasicAnimation((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "BasicAnimation";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(BasicAnimation basicAnimation, String str, Object[] objArr) {
        char c2;
        BasicAnimation basicAnimation2 = basicAnimation;
        int i = 0;
        switch (str.hashCode()) {
            case -840485262:
                if (str.equals("setRepeatCount")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -2692074:
                if (str.equals("setDuration")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3551:
                if (str.equals("on")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 171086893:
                if (str.equals("setEasing")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1390180929:
                if (str.equals("setDelay")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1406685743:
                if (str.equals("setValue")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1984579372:
                if (str.equals("setFrom")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        float f2 = 0.0f;
        switch (c2) {
            case 0:
                basicAnimation2.from = objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new a(this).b) : null;
                break;
            case 1:
                basicAnimation2.value = objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new b(this).b) : null;
                break;
            case 2:
                if (objArr.length > 0 && objArr[0] != null) {
                    f2 = ((Number) objArr[0]).floatValue();
                }
                basicAnimation2.duration = f2;
                break;
            case 3:
                if (objArr.length > 0 && objArr[0] != null) {
                    f2 = ((Number) objArr[0]).floatValue();
                }
                basicAnimation2.delay = f2;
                break;
            case 4:
                if (objArr.length > 0 && objArr[0] != null) {
                    i = ((Number) objArr[0]).intValue();
                }
                basicAnimation2.repeatCount = i;
                break;
            case 5:
                basicAnimation2.easing = (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]);
                break;
            case 6:
                basicAnimation2.on((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]), (objArr.length <= 1 || objArr[1] == null) ? null : (a) objArr[1]);
                break;
        }
        return null;
    }
}
