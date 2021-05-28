package com.didi.hummer.component.scroller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import com.didi.hummer.render.style.HummerLayout;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaUnit;
import e.c.a.b.l;
import e.e.a.o.k.a;
import e.e.a.o.k.b;
import e.e.a.o.l.d;
import e.e.a.o.l.e;
import e.e.a.o.l.o;
import e.e.a.y.a.b.i;
import e.e.a.y.a.b.j;
import e.e.a.y.c.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Component
public class Scroller extends j<e.i.a.a.a.a> implements j.f {
    @JsProperty
    public boolean bounces;
    public List<j> children = new ArrayList();
    public Map<j, i> fixedNoneBoxMap = new HashMap();
    public e.e.a.p.b hummerContext;
    public e.e.a.o.k.a hummerFooter;
    public e.e.a.o.k.b hummerHeader;
    public HummerLayout layout;
    @JsProperty
    public e.e.a.q.b.a loadMoreCallback;
    @JsProperty
    public j loadMoreView;
    public e.e.a.q.b.a onScrollToBottomListener;
    public e.e.a.q.b.a onScrollToTopListener;
    @JsProperty
    public e.e.a.q.b.a refreshCallback;
    public e.i.a.a.a.a refreshLayout;
    @JsProperty
    public j refreshView;
    public e.e.a.y.b.d.b scrollEvent = new e.e.a.y.b.d.b();
    public VScrollView scrollView;
    @JsProperty
    public boolean showScrollBar;

    public class a implements b.a {
        public a() {
        }

        @Override // e.e.a.o.k.b.a
        public void a() {
            if (Scroller.this.refreshCallback != null) {
                Scroller.this.refreshCallback.a(2);
            }
        }

        @Override // e.e.a.o.k.b.a
        public void b() {
            if (Scroller.this.refreshCallback != null) {
                Scroller.this.refreshCallback.a(0);
            }
        }

        @Override // e.e.a.o.k.b.a
        public void c() {
            if (Scroller.this.refreshCallback != null) {
                Scroller.this.refreshCallback.a(1);
            }
        }
    }

    public class b implements a.AbstractC0135a {
        public b() {
        }

        @Override // e.e.a.o.k.a.AbstractC0135a
        public void a() {
            if (Scroller.this.loadMoreCallback != null) {
                Scroller.this.loadMoreCallback.a(1);
            }
        }

        @Override // e.e.a.o.k.a.AbstractC0135a
        public void b() {
        }

        @Override // e.e.a.o.k.a.AbstractC0135a
        public void c() {
        }
    }

    public Scroller(e.e.a.p.b bVar, e.e.a.q.b.c cVar, String str) {
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
        this.scrollView.addView(hummerLayout);
        YogaNode a2 = l.f.a();
        a2.setData(this.scrollView);
        a2.addChildAt(this.layout.getYogaNode(), 0);
        a2.setOverflow(YogaOverflow.SCROLL);
        getYogaNode().setMeasureFunction(null);
        getYogaNode().setFlexShrink(1.0f);
        getYogaNode().addChildAt(a2, 0);
        this.scrollView.setVerticalScrollBarEnabled(false);
        this.scrollView.setOnScrollListener(new c());
        this.scrollView.setOnScrollToTopListener(new e(this));
        this.scrollView.setOnScrollToBottomListener(new d(this));
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
    public e.i.a.a.a.a createViewInstance(Context context) {
        VScrollView vScrollView = (VScrollView) LayoutInflater.from(context).inflate(e.e.a.o.c.scroll_view, (ViewGroup) null, false);
        this.scrollView = vScrollView;
        vScrollView.setClipChildren(false);
        e.i.a.a.a.a aVar = new e.i.a.a.a.a(context);
        this.refreshLayout = aVar;
        aVar.D = false;
        aVar.c(false);
        e.i.a.a.a.a aVar2 = this.refreshLayout;
        aVar2.M = true;
        aVar2.a(this.scrollView);
        this.hummerHeader = new e.e.a.o.k.b(context);
        this.hummerFooter = new e.e.a.o.k.a(context);
        this.refreshLayout.a((e.i.a.a.a.b.d) this.hummerHeader);
        this.refreshLayout.a((e.i.a.a.a.b.c) this.hummerFooter);
        this.hummerHeader.setOnRefreshListener(new a());
        this.hummerFooter.setOnLoadListener(new b());
        return this.refreshLayout;
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
        o oVar = this.scrollView.f2629c;
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
        this.scrollView.smoothScrollBy((int) e.e.a.y.c.c.b(obj), (int) e.e.a.y.c.c.b(obj2));
    }

    @JsMethod
    public void scrollTo(Object obj, Object obj2) {
        this.scrollView.smoothScrollTo((int) e.e.a.y.c.c.b(obj), (int) e.e.a.y.c.c.b(obj2));
    }

    @JsMethod
    public void scrollToBottom() {
        this.scrollView.fullScroll(130);
    }

    @JsMethod
    public void scrollToTop() {
        this.scrollView.fullScroll(33);
    }

    public void setBounces(boolean z) {
        this.refreshLayout.M = z;
    }

    public void setLoadMoreView(j jVar) {
        this.refreshLayout.c(true);
        this.hummerFooter.a(jVar);
    }

    public void setOnLoadMore(e.e.a.q.b.a aVar) {
        this.loadMoreCallback = aVar;
    }

    public void setOnRefresh(e.e.a.q.b.a aVar) {
        this.refreshCallback = aVar;
    }

    @JsMethod
    public void setOnScrollToBottomListener(e.e.a.q.b.a aVar) {
        this.onScrollToBottomListener = aVar;
    }

    @JsMethod
    public void setOnScrollToTopListener(e.e.a.q.b.a aVar) {
        this.onScrollToTopListener = aVar;
    }

    public void setRefreshView(j jVar) {
        this.refreshLayout.D = true;
        this.hummerHeader.a(jVar);
    }

    public void setShowScrollBar(boolean z) {
        this.scrollView.setVerticalScrollBarEnabled(z);
    }

    @JsMethod
    public void stopLoadMore(boolean z) {
        e.i.a.a.a.a aVar = this.refreshLayout;
        if (z) {
            aVar.a();
        } else {
            aVar.b();
        }
        e.e.a.q.b.a aVar2 = this.loadMoreCallback;
        if (aVar2 != null) {
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(z ? 0 : 2);
            aVar2.a(objArr);
        }
    }

    @JsMethod
    public void stopPullRefresh() {
        this.refreshLayout.a(30);
    }

    @JsMethod
    @Deprecated
    public void updateContentSize() {
    }

    public class c implements e.e.a.o.l.l {
        public c() {
        }

        @Override // e.e.a.o.l.l
        public void a(View view, int i, int i2, int i3, int i4) {
            if (Scroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (Scroller.this.scrollEvent != null) {
                    Scroller.this.scrollEvent.f4595c = 2;
                    e.e.a.y.b.d.b bVar = Scroller.this.scrollEvent;
                    l.f.c(Scroller.this.getContext(), (float) i);
                    if (bVar != null) {
                        e.e.a.y.b.d.b bVar2 = Scroller.this.scrollEvent;
                        l.f.c(Scroller.this.getContext(), (float) i2);
                        if (bVar2 != null) {
                            e.e.a.y.b.d.b bVar3 = Scroller.this.scrollEvent;
                            l.f.c(Scroller.this.getContext(), (float) i3);
                            if (bVar3 != null) {
                                e.e.a.y.b.d.b bVar4 = Scroller.this.scrollEvent;
                                l.f.c(Scroller.this.getContext(), (float) i4);
                                if (bVar4 != null) {
                                    e.e.a.y.b.d.b bVar5 = Scroller.this.scrollEvent;
                                    System.currentTimeMillis();
                                    if (bVar5 != null) {
                                        Scroller.this.mEventManager.a("scroll", Scroller.this.scrollEvent);
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
            if (Scroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (Scroller.this.scrollEvent != null) {
                    Scroller.this.scrollEvent.f4595c = 3;
                    e.e.a.y.b.d.b bVar = Scroller.this.scrollEvent;
                    System.currentTimeMillis();
                    if (bVar != null) {
                        Scroller.this.mEventManager.a("scroll", Scroller.this.scrollEvent);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        }

        @Override // e.e.a.o.l.l
        public void c() {
            if (Scroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (Scroller.this.scrollEvent != null) {
                    Scroller.this.scrollEvent.f4595c = 4;
                    e.e.a.y.b.d.b bVar = Scroller.this.scrollEvent;
                    System.currentTimeMillis();
                    if (bVar != null) {
                        Scroller.this.mEventManager.a("scroll", Scroller.this.scrollEvent);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
        }

        @Override // e.e.a.o.l.l
        public void a() {
            if (Scroller.this.mEventManager.f4594a.containsKey("scroll")) {
                if (Scroller.this.scrollEvent != null) {
                    Scroller.this.scrollEvent.f4595c = 1;
                    if (Scroller.this.scrollEvent == null) {
                        throw null;
                    } else if (Scroller.this.scrollEvent == null) {
                        throw null;
                    } else if (Scroller.this.scrollEvent == null) {
                        throw null;
                    } else if (Scroller.this.scrollEvent != null) {
                        e.e.a.y.b.d.b bVar = Scroller.this.scrollEvent;
                        System.currentTimeMillis();
                        if (bVar != null) {
                            Scroller.this.mEventManager.a("scroll", Scroller.this.scrollEvent);
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
