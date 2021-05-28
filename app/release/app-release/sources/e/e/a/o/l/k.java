package e.e.a.o.l;

import com.didi.hummer.component.scroller.HorizontalScroller;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import e.e.a.x.a;
import e.e.a.y.a.b.h;
import e.e.a.y.a.b.j;

public class k extends h<HorizontalScroller> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public HorizontalScroller a(c cVar, Object[] objArr) {
        return new HorizontalScroller(this.f4585a, cVar, (objArr.length <= 0 || objArr[0] == null) ? null : String.valueOf(objArr[0]));
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "HorizontalScroller";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(HorizontalScroller horizontalScroller, String str, Object[] objArr) {
        char c2;
        HorizontalScroller horizontalScroller2 = horizontalScroller;
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
                    c2 = 15;
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
            case -1109722326:
                if (str.equals("layout")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1079012472:
                if (str.equals("setOnScrollToBottomListener")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -938100109:
                if (str.equals("scrollToBottom")) {
                    c2 = '\f';
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
            case -402165756:
                if (str.equals("scrollBy")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    c2 = '\t';
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
                    c2 = '\r';
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
                    c2 = 11;
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
                horizontalScroller2.appendChild((j) ((a) this.b).a(j));
                return null;
            case 1:
                if (objArr.length > 0 && objArr[0] != null) {
                    j = ((Number) objArr[0]).longValue();
                }
                horizontalScroller2.removeChild((j) ((a) this.b).a(j));
                return null;
            case 2:
                horizontalScroller2.removeAll();
                return null;
            case 3:
                j jVar = (j) ((a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue());
                if (objArr.length > 1 && objArr[1] != null) {
                    j = ((Number) objArr[1]).longValue();
                }
                horizontalScroller2.insertBefore(jVar, (j) ((a) this.b).a(j));
                return null;
            case 4:
                j jVar2 = (j) ((a) this.b).a((objArr.length <= 0 || objArr[0] == null) ? 0 : ((Number) objArr[0]).longValue());
                if (objArr.length > 1 && objArr[1] != null) {
                    j = ((Number) objArr[1]).longValue();
                }
                horizontalScroller2.replaceChild(jVar2, (j) ((a) this.b).a(j));
                return null;
            case 5:
                if (objArr.length > 0 && objArr[0] != null) {
                    str2 = String.valueOf(objArr[0]);
                }
                return horizontalScroller2.getSubview(str2).getJSValue();
            case 6:
                horizontalScroller2.layout();
                return null;
            case 7:
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                horizontalScroller2.setShowScrollBar(z);
                return null;
            case '\b':
                if (objArr.length > 0 && objArr[0] != null) {
                    z = ((Boolean) objArr[0]).booleanValue();
                }
                horizontalScroller2.bounces = z;
                return null;
            case '\t':
                horizontalScroller2.scrollTo(objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new g(this).b) : null, objArr.length > 1 ? (!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new h(this).b) : null);
                return null;
            case '\n':
                horizontalScroller2.scrollBy(objArr.length > 0 ? (!(objArr[0] instanceof String) || (!d.b((String) objArr[0]) && !d.a((String) objArr[0]))) ? objArr[0] : d.a((String) objArr[0], new i(this).b) : null, objArr.length > 1 ? (!(objArr[1] instanceof String) || (!d.b((String) objArr[1]) && !d.a((String) objArr[1]))) ? objArr[1] : d.a((String) objArr[1], new j(this).b) : null);
                return null;
            case 11:
                horizontalScroller2.scrollToTop();
                return null;
            case '\f':
                horizontalScroller2.scrollToBottom();
                return null;
            case '\r':
                horizontalScroller2.setOnScrollToTopListener((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                return null;
            case 14:
                horizontalScroller2.setOnScrollToBottomListener((objArr.length <= 0 || objArr[0] == null) ? null : (e.e.a.q.b.a) objArr[0]);
                return null;
            case 15:
                horizontalScroller2.updateContentSize();
                return null;
            default:
                return null;
        }
    }
}
