package e.e.a.v;

import com.didi.hummer.module.Timer;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class r extends h<Timer> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Timer a(c cVar, Object[] objArr) {
        return new Timer(cVar);
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Timer";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Timer timer, String str, Object[] objArr) {
        char c2;
        Timer timer2 = timer;
        switch (str.hashCode()) {
            case -1735228601:
                if (str.equals("setInterval")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1337725356:
                if (str.equals("clearTimeout")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -167812558:
                if (str.equals("clearInterval")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1659754143:
                if (str.equals("setTimeout")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        long j = 0;
        if (c2 == 0) {
            a aVar = (objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0];
            if (objArr.length > 1 && objArr[1] != null) {
                j = ((Number) objArr[1]).longValue();
            }
            timer2.setInterval(aVar, j);
        } else if (c2 == 1) {
            timer2.clearInterval();
        } else if (c2 == 2) {
            a aVar2 = (objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0];
            if (objArr.length > 1 && objArr[1] != null) {
                j = ((Number) objArr[1]).longValue();
            }
            timer2.setTimeout(aVar2, j);
        } else if (c2 == 3) {
            timer2.clearTimeout();
        }
        return null;
    }
}
