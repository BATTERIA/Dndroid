package e.e.a.o.i;

import com.didi.hummer.component.list.List;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import e.e.a.x.a;
import e.e.a.y.a.b.h;
import e.e.a.y.a.b.j;

public class g extends h<List> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public List a(c cVar, Object[] objArr) {
        return new List(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "List";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(List list, String str, Object[] objArr) {
        char c2;
        List list2 = list;
        boolean z = false;
        r1 = 0;
        int i = 0;
        r1 = false;
        boolean z2 = false;
        r1 = 0;
        int i2 = 0;
        r1 = false;
        boolean z3 = false;
        z = false;
        switch (str.hashCode()) {
            case -1738844252:
                if (str.equals("setOnRegister")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1352024204:
                if (str.equals("stopPullRefresh")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1259530691:
                if (str.equals("setOnCreate")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1250991063:
                if (str.equals("setBounces")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -980170895:
                if (str.equals("scrollToPosition")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -746082806:
                if (str.equals("setOnUpdate")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -692803550:
                if (str.equals("setLoadMoreView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -333855302:
                if (str.equals("setOnRefresh")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 495720030:
                if (str.equals("setRefreshView")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 672127869:
                if (str.equals("stopLoadMore")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 796768860:
                if (str.equals("setOnLoadMore")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1085444827:
                if (str.equals("refresh")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1122173511:
                if (str.equals("setShowScrollBar")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        long j = 0;
        switch (c2) {
            case 0:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                list2.setRefreshView((j) ((a) this.b).a(j));
                break;
            case 1:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                list2.setLoadMoreView((j) ((a) this.b).a(j));
                break;
            case 2:
                list2.setOnRefresh((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                break;
            case 3:
                list2.setOnLoadMore((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                break;
            case 4:
                list2.setOnRegister((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                break;
            case 5:
                list2.setOnCreate((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                break;
            case 6:
                list2.setOnUpdate((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                break;
            case 7:
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                list2.setShowScrollBar(z);
                break;
            case '\b':
                if (objArr.length > 0 && objArr[0] != null) {
                    z3 = ((Boolean) objArr[0]).booleanValue();
                }
                list2.setBounces(z3);
                break;
            case '\t':
                if (objArr.length > 0 && objArr[0] != null) {
                    i2 = ((Number) objArr[0]).intValue();
                }
                list2.refresh(i2);
                break;
            case '\n':
                list2.stopPullRefresh();
                break;
            case 11:
                if (objArr.length > 0 && objArr[0] != null) {
                    z2 = ((Boolean) objArr[0]).booleanValue();
                }
                list2.stopLoadMore(z2);
                break;
            case '\f':
                list2.scrollTo(objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new c(this).b) : null, objArr.length > 1 ? (!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new d(this).b) : null);
                break;
            case '\r':
                list2.scrollBy(objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new e(this).b) : null, objArr.length > 1 ? (!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new f(this).b) : null);
                break;
            case 14:
                if (objArr.length > 0 && objArr[0] != null) {
                    i = ((Number) objArr[0]).intValue();
                }
                list2.scrollToPosition(i);
                break;
        }
        return null;
    }
}
