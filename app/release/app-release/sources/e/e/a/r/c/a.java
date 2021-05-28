package e.e.a.r.c;

import e.e.a.p.c;
import e.e.a.r.d.a;
import e.e.a.y.a.b.j;

public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public e.e.a.r.d.a f4503c;

    public a(e.e.a.r.d.a aVar) {
        this.f4503c = aVar;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.p.c
    public Object a(j jVar, String str, Object... objArr) {
        char c2;
        int i = 4;
        switch (str.hashCode()) {
            case -1919095251:
                if (str.equals("console.log")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1717253380:
                if (str.equals("console.debug")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1715927375:
                if (str.equals("console.error")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 637499109:
                if (str.equals("console.info")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 637904061:
                if (str.equals("console.warn")) {
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
            i = 1;
        } else if (c2 == 1) {
            i = 2;
        } else if (c2 == 2) {
            i = 3;
        } else if (c2 != 3) {
            i = c2 != 4 ? 0 : 5;
        }
        if (i > 0) {
            e.e.a.r.d.a aVar = this.f4503c;
            String valueOf = String.valueOf(objArr[0]);
            if (aVar != null) {
                e.e.a.r.b.a aVar2 = new e.e.a.r.b.a(i, valueOf);
                aVar.f4504a.add(aVar2);
                a.AbstractC0137a aVar3 = aVar.b;
                if (aVar3 != null) {
                    aVar3.a(aVar2);
                }
            } else {
                throw null;
            }
        }
        return super.a(jVar, str, objArr);
    }
}
