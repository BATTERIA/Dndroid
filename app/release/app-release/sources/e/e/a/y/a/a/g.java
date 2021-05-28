package e.e.a.y.a.a;

import com.didi.hummer.render.component.anim.KeyframeAnimation;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import e.e.a.y.a.b.h;
import java.util.List;

public class g extends h<KeyframeAnimation> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public KeyframeAnimation a(c cVar, Object[] objArr) {
        return new KeyframeAnimation((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "KeyframeAnimation";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(KeyframeAnimation keyframeAnimation, String str, Object[] objArr) {
        char c2;
        KeyframeAnimation keyframeAnimation2 = keyframeAnimation;
        int i = 0;
        switch (str.hashCode()) {
            case -840485262:
                if (str.equals("setRepeatCount")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -2692074:
                if (str.equals("setDuration")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3551:
                if (str.equals("on")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 92721539:
                if (str.equals("setKeyframes")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 171086893:
                if (str.equals("setEasing")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1390180929:
                if (str.equals("setDelay")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1406685743:
                if (str.equals("setValue")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1984579372:
                if (str.equals("setFrom")) {
                    c2 = 1;
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
                keyframeAnimation2.setKeyframes((objArr.length <= 0 || objArr[0] == null) ? null : (List) d.a((String) objArr[0], new d(this).b));
                break;
            case 1:
                keyframeAnimation2.from = objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new e(this).b) : null;
                break;
            case 2:
                keyframeAnimation2.value = objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new f(this).b) : null;
                break;
            case 3:
                if (objArr.length > 0 && objArr[0] != null) {
                    f2 = ((Number) objArr[0]).floatValue();
                }
                keyframeAnimation2.duration = f2;
                break;
            case 4:
                if (objArr.length > 0 && objArr[0] != null) {
                    f2 = ((Number) objArr[0]).floatValue();
                }
                keyframeAnimation2.delay = f2;
                break;
            case 5:
                if (objArr.length > 0 && objArr[0] != null) {
                    i = ((Number) objArr[0]).intValue();
                }
                keyframeAnimation2.repeatCount = i;
                break;
            case 6:
                keyframeAnimation2.easing = (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]);
                break;
            case 7:
                keyframeAnimation2.on((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]), (objArr.length <= 1 || objArr[1] == null) ? null : (a) objArr[1]);
                break;
        }
        return null;
    }
}
