package e.e.a.o.f;

import com.didi.hummer.component.dialog.Dialog;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;
import e.e.a.y.a.b.j;

public class d extends h<Dialog> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Dialog a(c cVar, Object[] objArr) {
        return new Dialog(this.f4585a.getBaseContext());
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Dialog";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Dialog dialog, String str, Object[] objArr) {
        char c2;
        Dialog dialog2 = dialog;
        boolean z = false;
        switch (str.hashCode()) {
            case -1929577258:
                if (str.equals("setCancelable")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 92899676:
                if (str.equals("alert")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 336650556:
                if (str.equals("loading")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 951117504:
                if (str.equals("confirm")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            if (objArr.length > 0 && objArr[0] != null) {
                z = ((Boolean) objArr[0]).booleanValue();
            }
            dialog2.cancelable = z;
        } else if (c2 == 1) {
            dialog2.alert((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]), (objArr.length <= 1 || objArr[1] == null) ? null : String.valueOf(objArr[1]), (objArr.length <= 2 || objArr[2] == null) ? null : (a) objArr[2]);
        } else if (c2 == 2) {
            dialog2.confirm((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]), (objArr.length <= 1 || objArr[1] == null) ? null : String.valueOf(objArr[1]), (objArr.length <= 2 || objArr[2] == null) ? null : String.valueOf(objArr[2]), (objArr.length <= 3 || objArr[3] == null) ? null : String.valueOf(objArr[3]), (objArr.length <= 4 || objArr[4] == null) ? null : (a) objArr[4], (objArr.length <= 5 || objArr[5] == null) ? null : (a) objArr[5]);
        } else if (c2 == 3) {
            dialog2.loading((objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
        } else if (c2 == 4) {
            dialog2.custom((j) ((e.e.a.x.a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue()));
        } else if (c2 == 5) {
            dialog2.dismiss();
        }
        return null;
    }
}
