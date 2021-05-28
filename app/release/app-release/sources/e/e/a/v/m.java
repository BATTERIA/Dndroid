package e.e.a.v;

import com.didi.hummer.module.Navigator;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import e.e.a.y.a.b.h;

public class m extends h<Navigator> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Navigator a(c cVar, Object[] objArr) {
        return new Navigator();
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Navigator";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Navigator navigator, String str, Object[] objArr) {
        char c2;
        e.e.a.n.d.c cVar;
        e.e.a.n.d.c cVar2;
        e.e.a.n.d.c cVar3;
        e.e.a.n.d.c cVar4;
        e.e.a.n.d.c cVar5;
        int i = 0;
        switch (str.hashCode()) {
            case -1561981605:
                if (str.equals("popToPage")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -504772615:
                if (str.equals("openPage")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -395470120:
                if (str.equals("popBack")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -395052928:
                if (str.equals("popPage")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1058241373:
                if (str.equals("popToRootPage")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            if (objArr.length > 0) {
                cVar = (e.e.a.n.d.c) ((!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new h(this).b));
            } else {
                cVar = null;
            }
            Navigator.openPage(this.f4585a, cVar, (objArr.length <= 1 || objArr[1] == null) ? null : (a) objArr[1]);
        } else if (c2 == 1) {
            if (objArr.length > 0) {
                cVar2 = (e.e.a.n.d.c) ((!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new i(this).b));
            } else {
                cVar2 = null;
            }
            Navigator.popPage(this.f4585a, cVar2);
        } else if (c2 == 2) {
            if (objArr.length > 0) {
                cVar3 = (e.e.a.n.d.c) ((!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new j(this).b));
            } else {
                cVar3 = null;
            }
            Navigator.popToPage(this.f4585a, cVar3);
        } else if (c2 == 3) {
            if (objArr.length > 0) {
                cVar4 = (e.e.a.n.d.c) ((!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new k(this).b));
            } else {
                cVar4 = null;
            }
            Navigator.popToRootPage(this.f4585a, cVar4);
        } else if (c2 == 4) {
            if (objArr.length > 0 && objArr[0] != null) {
                i = ((Number) objArr[0]).intValue();
            }
            if (objArr.length > 1) {
                cVar5 = (e.e.a.n.d.c) ((!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new l(this).b));
            } else {
                cVar5 = null;
            }
            Navigator.popBack(this.f4585a, i, cVar5);
        }
        return null;
    }
}
