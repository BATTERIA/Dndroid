package com.didi.hummer.component.scroller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import com.didi.hummer.render.style.HummerLayout;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaUnit;
import e.c.a.b.l;
import e.e.a.o.l.l;
import e.e.a.o.l.o;
import e.e.a.p.b;
import e.e.a.q.b.c;
import e.e.a.y.a.b.i;
import e.e.a.y.a.b.j;
import e.e.a.y.c.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class HorizontalScroller extends j<HScrollView> implements j.f {
    @JsProperty
    public boolean bounces;
    public List<j> children = new ArrayList();
    public Map<j, i> fixedNoneBoxMap = new HashMap();
    public b hummerContext;
    public HummerLayout layout;
    public e.e.a.q.b.a onScrollToBottomListener;
    public e.e.a.q.b.a onScrollToTopListener;
    public e.e.a.y.b.d.b scrollEvent = new e.e.a.y.b.d.b();
    @JsProperty
    public boolean showScrollBar;

    public HorizontalScroller(b bVar, c cVar, String str) {
        super(bVar, cVar, str);
        this.hummerContext = bVar;
    }

    private void adjustWidthAndHeight() {
        if (getYogaNode().getWidth().unit == YogaUnit.AUTO) {
            this.layout.getYogaNode().setWidthAuto();
        } else {
            this.layout.getYogaNode().setWidthPercent(100.0f);
        }
        if (getYogaNode().getHeight().unit == YogaUnit.AUTO) {
            this.layout.getYogaNode().setHeightAuto();
        } else {
            this.layout.getYogaNode().setHeightPercent(100.0f);
        }
    }

    private void initScrollView() {
        HummerLayout hummerLayout = new HummerLayout(getContext());
        this.layout = hummerLayout;
        hummerLayout.getYogaNode().setFlexDirection(YogaFlexDirection.ROW);
        ((HScrollView) getView()).addView(this.layout);
        getYogaNode().setOverflow(YogaOverflow.SCROLL);
        getYogaNode().setMeasureFunction(null);
        getYogaNode().addChildAt(this.layout.getYogaNode(), 0);
        ((HScrollView) getView()).setHorizontalScrollBarEnabled(false);
        ((HScrollView) getView()).setOnScrollListener(new a());
        ((HScrollView) getView()).setOnScrollToTopListener(new e.e.a.o.l.c(this));
        ((HScrollView) getView()).setOnScrollToBottomListener(new e.e.a.o.l.b(this));
    }

    public /* synthetic */ void a() {
        e.e.a.q.b.a aVar = this.onScrollToTopListener;
        if (aVar != null) {
            aVar.a(new Object[0]);
        }
    }

    @JsMethod
    public void appendChild(j jVar) {
        if (jVar != null) {
            jVar.getJSValue().l();
            jVar.setPositionChangedListener(this);
            this.children.add(jVar);
            if (jVar.getPosition() == a.b.FIXED) {
                this.hummerContext.f4443d.a(jVar, -1);
                i iVar = new i(this.hummerContext);
                this.fixedNoneBoxMap.put(jVar, iVar);
                jVar = iVar;
            }
            this.layout.a(jVar, -1);
            adjustWidthAndHeight();
        }
    }

    public /* synthetic */ void b() {
        e.e.a.q.b.a aVar = this.onScrollToBottomListener;
        if (aVar != null) {
            aVar.a(new Object[0]);
        }
    }

    @Override // e.e.a.y.a.b.j
    public HScrollView createViewInstance(Context context) {
        return (HScrollView) LayoutInflater.from(context).inflate(e.e.a.o.c.horizontal_scroll_view, (ViewGroup) null, false);
    }

    @Override // e.e.a.y.a.b.j.f
    public void dispatchChildPositionChanged(j jVar, a.b bVar, a.b bVar2) {
        if (bVar == a.b.FIXED && bVar2 == a.b.YOGA && this.fixedNoneBoxMap.containsKey(jVar)) {
            this.hummerContext.f4443d.a(jVar);
            this.layout.b(jVar, this.fixedNoneBoxMap.remove(jVar));
        }
        if (bVar == a.b.YOGA && bVar2 == a.b.FIXED) {
            i iVar = new i(this.hummerContext);
            this.fixedNoneBoxMap.put(jVar, iVar);
            this.layout.b(iVar, jVar);
            this.hummerContext.f4443d.a(jVar, -1);
        }
    }

    @JsMethod
    @Deprecated
    public j getSubview(String str) {
        j jVar = this.layout.f2641c.get(str);
        if (jVar == null) {
            Iterator<Map.Entry<j, i>> it = this.fixedNoneBoxMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                j key = it.next().getKey();
                if (key.getViewID().equals(str)) {
                    jVar = key;
                    break;
                }
            }
        }
        if (jVar != null) {
            jVar.getJSValue().l();
        }
        return jVar;
    }

    @JsMethod
    public void insertBefore(j jVar, j jVar2) {
        if (jVar != null && jVar2 != null) {
            jVar.getJSValue().l();
            jVar.setPositionChangedListener(this);
            this.children.add(jVar);
            if (jVar.getPosition() == a.b.FIXED) {
                this.hummerContext.f4443d.a(jVar, -1);
                i iVar = new i(this.hummerContext);
                this.fixedNoneBoxMap.put(jVar, iVar);
                jVar = iVar;
            }
            if (this.fixedNoneBoxMap.containsKey(jVar2)) {
                jVar2 = this.fixedNoneBoxMap.get(jVar2);
            }
            this.layout.a(jVar, jVar2);
            adjustWidthAndHeight();
        }
    }

    @JsMethod
    @Deprecated
    public void layout() {
        this.layout.requestLayout();
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        initScrollView();
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onDestroy() {
        super.onDestroy();
        o oVar = ((HScrollView) getView()).f2620c;
        if (oVar != null) {
            oVar.f4411f.removeCallbacksAndMessages(null);
        }
    }

    @JsMethod
    public void removeAll() {
        for (Map.Entry<j, i> entry : this.fixedNoneBoxMap.entrySet()) {
            this.hummerContext.f4443d.a(entry.getKey());
            this.layout.a(entry.getValue());
        }
        this.fixedNoneBoxMap.clear();
        for (j jVar : this.children) {
            jVar.getJSValue().k();
            jVar.setPositionChangedListener(null);
        }
        this.children.clear();
        this.layout.removeAllViews();
        adjustWidthAndHeight();
    }

    @JsMethod
    public void removeChild(j jVar) {
        if (jVar != null) {
            jVar.getJSValue().k();
            jVar.setPositionChangedListener(null);
            this.children.remove(jVar);
            if (this.fixedNoneBoxMap.containsKey(jVar)) {
                this.hummerContext.f4443d.a(jVar);
                this.layout.a(this.fixedNoneBoxMap.remove(jVar));
                return;
            }
            this.layout.a(jVar);
            adjustWidthAndHeight();
        }
    }

    @JsMethod
    public void replaceChild(j jVar, j jVar2) {
        if (jVar != null && jVar2 != null) {
            jVar.getJSValue().l();
            jVar.setPositionChangedListener(this);
            jVar2.getJSValue().k();
            jVar2.setPositionChangedListener(null);
            this.children.add(jVar);
            this.children.remove(jVar2);
            if (jVar.getPosition() == a.b.FIXED) {
                this.hummerContext.f4443d.a(jVar, -1);
                i iVar = new i(this.hummerContext);
                this.fixedNoneBoxMap.put(jVar, iVar);
                jVar = iVar;
            }
            if (this.fixedNoneBoxMap.containsKey(jVar2)) {
                this.hummerContext.f4443d.a(jVar2);
                jVar2 = this.fixedNoneBoxMap.get(jVar2);
            }
            this.layout.b(jVar, jVar2);
            adjustWidthAndHeight();
        }
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        setShowScrollBar(false);
    }

    @JsMethod
    public void scrollBy(Object obj, Object obj2) {
        ((HScrollView) getView()).smoothScrollBy((int) e.e.a.y.c.c.b(obj), (int) e.e.a.y.c.c.b(obj2));
    }

    @JsMethod
    public void scrollTo(Object obj, Object obj2) {
        ((HScrollView) getView()).smoothScrollTo((int) e.e.a.y.c.c.b(obj), (int) e.e.a.y.c.c.b(obj2));
    }

    @JsMethod
    public void scrollToBottom() {
        ((HScrollView) getView()).fullScroll(66);
    }

    @JsMethod
    public void scrollToTop() {
        ((HScrollView) getView()).fullScroll(17);
    }

    @JsMethod
    public void setOnScrollToBottomListener(e.e.a.q.b.a aVar) {
        this.onScrollToBottomListener = aVar;
    }

    @JsMethod
    public void setOnScrollToTopListener(e.e.a.q.b.a aVar) {
        this.onScrollToTopListener = aVar;
    }

    public void setShowScrollBar(boolean z) {
        ((HScrollView) getView()).setHorizontalScrollBarEnabled(z);
    }

    @JsMethod
    @Deprecated
    public void updateContentSize() {
    }

    public class a implements l {
        public a() {
        }

        @Override // e.e.a.o.l.l
        public void a(View view, int i, int i2, int i3, int i4) {
            if (HorizontalScroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (HorizontalScroller.this.scrollEvent != null) {
                    HorizontalScroller.this.scrollEvent.f4595c = 2;
                    e.e.a.y.b.d.b bVar = HorizontalScroller.this.scrollEvent;
                    l.f.c(HorizontalScroller.this.getContext(), (float) i);
                    if (bVar != null) {
                        e.e.a.y.b.d.b bVar2 = HorizontalScroller.this.scrollEvent;
                        l.f.c(HorizontalScroller.this.getContext(), (float) i2);
                        if (bVar2 != null) {
                            e.e.a.y.b.d.b bVar3 = HorizontalScroller.this.scrollEvent;
                            l.f.c(HorizontalScroller.this.getContext(), (float) i3);
                            if (bVar3 != null) {
                                e.e.a.y.b.d.b bVar4 = HorizontalScroller.this.scrollEvent;
                                l.f.c(HorizontalScroller.this.getContext(), (float) i4);
                                if (bVar4 != null) {
                                    e.e.a.y.b.d.b bVar5 = HorizontalScroller.this.scrollEvent;
                                    System.currentTimeMillis();
                                    if (bVar5 != null) {
                                        HorizontalScroller.this.mEventManager.a("scroll", HorizontalScroller.this.scrollEvent);
                                        return;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
        }

        @Override // e.e.a.o.l.l
        public void b() {
            if (HorizontalScroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (HorizontalScroller.this.scrollEvent != null) {
                    HorizontalScroller.this.scrollEvent.f4595c = 3;
                    e.e.a.y.b.d.b bVar = HorizontalScroller.this.scrollEvent;
                    System.currentTimeMillis();
                    if (bVar != null) {
                        HorizontalScroller.this.mEventManager.a("scroll", HorizontalScroller.this.scrollEvent);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        }

        @Override // e.e.a.o.l.l
        public void c() {
            if (HorizontalScroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (HorizontalScroller.this.scrollEvent != null) {
                    HorizontalScroller.this.scrollEvent.f4595c = 4;
                    e.e.a.y.b.d.b bVar = HorizontalScroller.this.scrollEvent;
                    System.currentTimeMillis();
                    if (bVar != null) {
                        HorizontalScroller.this.mEventManager.a("scroll", HorizontalScroller.this.scrollEvent);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        }

        @Override // e.e.a.o.l.l
        public void a() {
            if (HorizontalScroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (HorizontalScroller.this.scrollEvent != null) {
                    HorizontalScroller.this.scrollEvent.f4595c = 1;
                    if (HorizontalScroller.this.scrollEvent == null) {
                        throw null;
                    } else if (HorizontalScroller.this.scrollEvent == null) {
                        throw null;
                    } else if (HorizontalScroller.this.scrollEvent == null) {
                        throw null;
                    } else if (HorizontalScroller.this.scrollEvent != null) {
                        e.e.a.y.b.d.b bVar = HorizontalScroller.this.scrollEvent;
                        System.currentTimeMillis();
                        if (bVar != null) {
                            HorizontalScroller.this.mEventManager.a("scroll", HorizontalScroller.this.scrollEvent);
                            return;
                        }
                        throw null;
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
        }
    }
}
