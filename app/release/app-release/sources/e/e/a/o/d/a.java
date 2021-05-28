package e.e.a.o.d;

import com.didi.hummer.component.anchor.Anchor;
import e.e.a.q.b.c;
import e.e.a.y.a.b.h;
import e.e.a.y.a.b.j;

public class a extends h<Anchor> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Anchor a(c cVar, Object[] objArr) {
        return new Anchor(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Anchor";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Anchor anchor, String str, Object[] objArr) {
        char c2;
        Anchor anchor2 = anchor;
        switch (str.hashCode()) {
            case -1912367582:
                if (str.equals("appendChild")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1109722326:
                if (str.equals("layout")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -319766792:
                if (str.equals("removeChild")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 33118136:
                if (str.equals("getElementById")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 96634189:
                if (str.equals("empty")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 253181848:
                if (str.equals("insertBefore")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 434889416:
                if (str.equals("replaceChild")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1282345597:
                if (str.equals("removeAll")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        String str2 = null;
        long j = 0;
        switch (c2) {
            case 0:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                anchor2.appendChild((j) ((e.e.a.x.a) this.b).a(j));
                return null;
            case 1:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                anchor2.removeChild((j) ((e.e.a.x.a) this.b).a(j));
                return null;
            case 2:
                anchor2.removeAll();
                return null;
            case 3:
                j jVar = (j) ((e.e.a.x.a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue());
                if (objArr.length > 1 && objArr[1] != null) {
                    j = ((Number) objArr[1]).longValue();
                }
                anchor2.insertBefore(jVar, (j) ((e.e.a.x.a) this.b).a(j));
                return null;
            case 4:
                j jVar2 = (j) ((e.e.a.x.a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue());
                if (objArr.length > 1 && objArr[1] != null) {
                    j = ((Number) objArr[1]).longValue();
                }
                anchor2.replaceChild(jVar2, (j) ((e.e.a.x.a) this.b).a(j));
                return null;
            case 5:
                if (objArr.length > 0 && objArr[0] != null) {
                    str2 = String.valueOf(objArr[0]);
                }
                return anchor2.getElementById(str2).getJSValue();
            case 6:
                anchor2.layout();
                return null;
            case 7:
                anchor2.empty();
                return null;
            default:
                return null;
        }
    }
}
