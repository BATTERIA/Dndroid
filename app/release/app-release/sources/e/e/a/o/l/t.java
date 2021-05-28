package e.e.a.o.l;

import com.didi.hummer.component.scroller.Scroller;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import e.e.a.x.a;
import e.e.a.y.a.b.h;
import e.e.a.y.a.b.j;

public class t extends h<Scroller> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public Scroller a(c cVar, Object[] objArr) {
        return new Scroller(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "Scroller";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(Scroller scroller, String str, Object[] objArr) {
        char c2;
        Scroller scroller2 = scroller;
        boolean z = false;
        switch (str.hashCode()) {
            case -1912367582:
                if (str.equals("appendChild")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1528894575:
                if (str.equals("updateContentSize")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case -1352024204:
                if (str.equals("stopPullRefresh")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -1250991063:
                if (str.equals("setBounces")) {
                    c2 = 14;
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
            case -1079012472:
                if (str.equals("setOnScrollToBottomListener")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -938100109:
                if (str.equals("scrollToBottom")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case -830663505:
                if (str.equals("getSubview")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -692803550:
                if (str.equals("setLoadMoreView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -402165756:
                if (str.equals("scrollBy")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -333855302:
                if (str.equals("setOnRefresh")) {
                    c2 = '\n';
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
            case 171470400:
                if (str.equals("setOnScrollToTopListener")) {
                    c2 = 19;
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
            case 495720030:
                if (str.equals("setRefreshView")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 672127869:
                if (str.equals("stopLoadMore")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case 796768860:
                if (str.equals("setOnLoadMore")) {
                    c2 = 11;
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
            case 1282345597:
                if (str.equals("removeAll")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2055128589:
                if (str.equals("scrollToTop")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        long j = 0;
        String str2 = null;
        switch (c2) {
            case 0:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                scroller2.appendChild((j) ((a) this.b).a(j));
                return null;
            case 1:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                scroller2.removeChild((j) ((a) this.b).a(j));
                return null;
            case 2:
                scroller2.removeAll();
                return null;
            case 3:
                j jVar = (j) ((a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue());
                if (objArr.length > 1 && objArr[1] != null) {
                    j = ((Number) objArr[1]).longValue();
                }
                scroller2.insertBefore(jVar, (j) ((a) this.b).a(j));
                return null;
            case 4:
                j jVar2 = (j) ((a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue());
                if (objArr.length > 1 && objArr[1] != null) {
                    j = ((Number) objArr[1]).longValue();
                }
                scroller2.replaceChild(jVar2, (j) ((a) this.b).a(j));
                return null;
            case 5:
                if (objArr.length > 0 && objArr[0] != null) {
                    str2 = String.valueOf(objArr[0]);
                }
                return scroller2.getSubview(str2).getJSValue();
            case 6:
                scroller2.layout();
                return null;
            case 7:
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                scroller2.setShowScrollBar(z);
                return null;
            case '\b':
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                scroller2.setRefreshView((j) ((a) this.b).a(j));
                return null;
            case '\t':
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                scroller2.setLoadMoreView((j) ((a) this.b).a(j));
                return null;
            case '\n':
                scroller2.setOnRefresh((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                return null;
            case 11:
                scroller2.setOnLoadMore((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                return null;
            case '\f':
                scroller2.stopPullRefresh();
                return null;
            case '\r':
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                scroller2.stopLoadMore(z);
                return null;
            case 14:
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                scroller2.setBounces(z);
                return null;
            case 15:
                scroller2.scrollTo(objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new p(this).b) : null, objArr.length > 1 ? (!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new q(this).b) : null);
                return null;
            case 16:
                scroller2.scrollBy(objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new r(this).b) : null, objArr.length > 1 ? (!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new s(this).b) : null);
                return null;
            case 17:
                scroller2.scrollToTop();
                return null;
            case 18:
                scroller2.scrollToBottom();
                return null;
            case 19:
                scroller2.setOnScrollToTopListener((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                return null;
            case 20:
                scroller2.setOnScrollToBottomListener((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                return null;
            case 21:
                scroller2.updateContentSize();
                return null;
            default:
                return null;
        }
    }
}
