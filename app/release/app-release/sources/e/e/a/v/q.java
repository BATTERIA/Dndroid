package e.e.a.v;

import com.didi.hummer.module.Storage;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class q extends h<Storage> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Storage a(c cVar, Object[] objArr) {
        return new Storage();
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Storage";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Storage storage, String str, Object[] objArr) {
        char c2;
        switch (str.hashCode()) {
            case -934610812:
                if (str.equals("remove")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 102230:
                if (str.equals("get")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 113762:
                if (str.equals("set")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 96955127:
                if (str.equals("exist")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String str2 = null;
        if (c2 == 0) {
            Storage.set(this.f4585a, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]), (objArr.length <= 1 || objArr[1] == null) ? null : String.valueOf(objArr[1]));
            return null;
        } else if (c2 == 1) {
            if (objArr.length > 0 && objArr[0] != null) {
                str2 = String.valueOf(objArr[0]);
            }
            return Storage.get(this.f4585a, str2);
        } else if (c2 == 2) {
            Storage.remove(this.f4585a, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
            return null;
        } else if (c2 != 3) {
            return null;
        } else {
            if (objArr.length > 0 && objArr[0] != null) {
                str2 = String.valueOf(objArr[0]);
            }
            return Boolean.valueOf(Storage.exist(this.f4585a, str2));
        }
    }
}
