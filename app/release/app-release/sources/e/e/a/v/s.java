package e.e.a.v;

import com.didi.hummer.module.WebSocket;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class s extends h<WebSocket> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public WebSocket a(c cVar, Object[] objArr) {
        return new WebSocket();
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "WebSocket";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(WebSocket webSocket, String str, Object[] objArr) {
        char c2;
        int i = 0;
        switch (str.hashCode()) {
            case -2003762904:
                if (str.equals("onMessage")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1351896231:
                if (str.equals("onClose")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1349867671:
                if (str.equals("onError")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1013079863:
                if (str.equals("onOpen")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3526536:
                if (str.equals("send")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 94756344:
                if (str.equals("close")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 951351530:
                if (str.equals("connect")) {
                    c2 = 0;
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
                WebSocket.connect(this.f4585a, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
                break;
            case 1:
                if (objArr.length > 0 && objArr[0] != null) {
                    i = ((Number) objArr[0]).intValue();
                }
                WebSocket.close(this.f4585a, i, (objArr.length <= 1 || objArr[1] == null) ? null : String.valueOf(objArr[1]));
                break;
            case 2:
                WebSocket.send(this.f4585a, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
                break;
            case 3:
                WebSocket.onOpen((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 4:
                WebSocket.onClose((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 5:
                WebSocket.onError((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 6:
                WebSocket.onMessage((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
        }
        return null;
    }
}
