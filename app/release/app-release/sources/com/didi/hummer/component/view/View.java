package com.didi.hummer.component.view;

import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.component.imageview.Image;
import com.didi.hummer.component.list.List;
import com.didi.hummer.component.scroller.HorizontalScroller;
import com.didi.hummer.component.scroller.Scroller;
import com.didi.hummer.component.viewpager.ViewPager;
import com.didi.hummer.render.style.HummerLayout;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.j;
import e.e.a.y.a.b.k;

@Component
public class View extends k {
    public static final String OVERFLOW_HIDDEN = "hidden";
    public static final String OVERFLOW_VISIBLE = "visible";

    public View(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
    }

    @Override // e.e.a.y.a.b.k
    @JsMethod
    public void appendChild(j jVar) {
        super.appendChild(jVar);
        if (jVar != null) {
            e.e.a.y.c.b bVar = this.hummerNode;
            bVar.f4611d.add(jVar.getNode());
            if ((jVar instanceof Image) || (jVar instanceof Scroller) || (jVar instanceof HorizontalScroller) || (jVar instanceof List) || (jVar instanceof ViewPager)) {
                ((HummerLayout) getView()).setClipChildren(true);
            }
        }
    }

    @JsMethod
    public void empty() {
    }

    @Override // e.e.a.y.a.b.k
    @JsMethod
    @Deprecated
    public j getElementById(String str) {
        return super.getElementById(str);
    }

    @Override // e.e.a.y.a.b.k
    @JsMethod
    public void insertBefore(j jVar, j jVar2) {
        super.insertBefore(jVar, jVar2);
        if (jVar != null && jVar2 != null) {
            e.e.a.y.c.b bVar = this.hummerNode;
            e.e.a.y.c.b node = jVar.getNode();
            int lastIndexOf = bVar.f4611d.lastIndexOf(jVar2.getNode());
            if (lastIndexOf > 0) {
                bVar.f4611d.add(lastIndexOf, node);
            }
        }
    }

    @JsMethod
    @Deprecated
    public void layout() {
        ((HummerLayout) getView()).requestLayout();
    }

    @Override // e.e.a.y.a.b.k
    @JsMethod
    public void removeAll() {
        super.removeAll();
        this.hummerNode.f4611d.clear();
    }

    @Override // e.e.a.y.a.b.k
    @JsMethod
    public void removeChild(j jVar) {
        super.removeChild(jVar);
        if (jVar != null) {
            e.e.a.y.c.b bVar = this.hummerNode;
            bVar.f4611d.remove(jVar.getNode());
        }
    }

    @Override // e.e.a.y.a.b.k
    @JsMethod
    public void replaceChild(j jVar, j jVar2) {
        super.replaceChild(jVar, jVar2);
        if (jVar != null && jVar2 != null) {
            e.e.a.y.c.b bVar = this.hummerNode;
            e.e.a.y.c.b node = jVar.getNode();
            e.e.a.y.c.b node2 = jVar2.getNode();
            int lastIndexOf = bVar.f4611d.lastIndexOf(node2);
            if (lastIndexOf > 0) {
                bVar.f4611d.remove(node2);
                bVar.f4611d.add(lastIndexOf, node);
            }
        }
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        setOverflow("visible");
    }

    @JsAttribute
    public void setOverflow(String str) {
        ((HummerLayout) getView()).setNeedClipChildren("hidden".equals(str));
    }

    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        if (((str.hashCode() == 529642498 && str.equals("overflow")) ? (char) 0 : 65535) != 0) {
            return false;
        }
        setOverflow((String) obj);
        return true;
    }
}
