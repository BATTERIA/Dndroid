package e.e.a.v;

import com.didi.hummer.module.Request;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import e.e.a.y.a.b.h;
import java.util.Map;

public class p extends h<Request> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Request a(c cVar, Object[] objArr) {
        return new Request(this.f4585a, cVar);
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Request";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Request request, String str, Object[] objArr) {
        char c2;
        Request request2 = request;
        int i = 0;
        switch (str.hashCode()) {
            case -905798227:
                if (str.equals("setUrl")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3526536:
                if (str.equals("send")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 260127119:
                if (str.equals("setHeader")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 403843043:
                if (str.equals("setMethod")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1401149771:
                if (str.equals("setParam")) {
                    c2 = 4;
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
        if (c2 == 0) {
            request2.setUrl((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
        } else if (c2 == 1) {
            request2.setMethod((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
        } else if (c2 == 2) {
            if (objArr.length > 0 && objArr[0] != null) {
                i = ((Number) objArr[0]).intValue();
            }
            request2.timeout = i;
        } else if (c2 == 3) {
            request2.header = (objArr.length <= 0 || objArr[0] == null) ? null : (Map) d.a((String) objArr[0], new n(this).b);
        } else if (c2 == 4) {
            request2.param = (objArr.length <= 0 || objArr[0] == null) ? null : (Map) d.a((String) objArr[0], new o(this).b);
        } else if (c2 == 5) {
            request2.send((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
        }
        return null;
    }
}
