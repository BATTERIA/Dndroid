package e.e.a.v;

import com.didi.hummer.module.HMLocation;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;

public class e extends h<HMLocation> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public HMLocation a(c cVar, Object[] objArr) {
        return new HMLocation(this.f4585a, cVar);
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Location";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(HMLocation hMLocation, String str, Object[] objArr) {
        char c2;
        HMLocation hMLocation2 = hMLocation;
        switch (str.hashCode()) {
            case -1349867671:
                if (str.equals("onError")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 727771607:
                if (str.equals("stopLocation")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1807102689:
                if (str.equals("getLastLocation")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2028160567:
                if (str.equals("startLocation")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0) {
            hMLocation2.getLastLocation((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
        } else if (c2 == 1) {
            a aVar = (objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0];
            long j = 0;
            long longValue = (objArr.length <= 1 || objArr[1] == null) ? 0 : ((Number) objArr[1]).longValue();
            if (objArr.length > 2 && objArr[2] != null) {
                j = ((Number) objArr[2]).longValue();
            }
            hMLocation2.startLocation(aVar, longValue, j);
        } else if (c2 == 2) {
            hMLocation2.stopLocation();
        } else if (c2 == 3) {
            hMLocation2.onError((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
        }
        return null;
    }
}
