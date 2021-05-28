package e.e.a.o.q;

import com.didi.hummer.component.viewpager.ViewPager;
import e.e.a.q.b.a;
import e.e.a.q.b.c;
import e.e.a.q.d.d;
import java.util.List;

public class h extends e.e.a.y.a.b.h<ViewPager> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // e.e.a.y.a.b.h
    public ViewPager a(c cVar, Object[] objArr) {
        return new ViewPager(this.f4585a, cVar);
    }

    @Override // e.e.a.y.a.b.m
    public String d() {
        return "ViewPager";
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Object[]] */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.h
    public Object a(ViewPager viewPager, String str, Object[] objArr) {
        char c2;
        ViewPager viewPager2 = viewPager;
        int i = 0;
        switch (str.hashCode()) {
            case -1811086742:
                if (str.equals("setCurrentItem")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1136975066:
                if (str.equals("onPageScrollStateChange")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -347436201:
                if (str.equals("onItemView")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -136881570:
                if (str.equals("onPageChange")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 317074811:
                if (str.equals("onPageScroll")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1984503596:
                if (str.equals("setData")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 2096925462:
                if (str.equals("onItemClick")) {
                    c2 = 5;
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
                viewPager2.setData((objArr.length <= 0 || objArr[0] == null) ? null : (List) d.a((String) objArr[0], new g(this).b));
                break;
            case 1:
                if (objArr.length > 0 && objArr[0] != null) {
                    i = ((Number) objArr[0]).intValue();
                }
                viewPager2.setCurrentItem(i);
                break;
            case 2:
                viewPager2.onPageChange((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 3:
                viewPager2.onPageScroll((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 4:
                viewPager2.onPageScrollStateChange((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 5:
                viewPager2.onItemClick((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
            case 6:
                viewPager2.onItemView((objArr.length <= 0 || objArr[0] == null) ? null : (a) objArr[0]);
                break;
        }
        return null;
    }
}
