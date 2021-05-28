package com.didi.hummer.component.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import com.didi.hummer.component.viewpager.ViewPager;
import com.facebook.yoga.YogaNode;
import e.c.a.b.l;
import e.e.a.o.k.a;
import e.e.a.o.k.b;
import e.e.a.y.a.b.j;
import e.i.a.a.a.b.d;
import java.util.Map;

@Component
public class List extends j<e.i.a.a.a.a> {
    public static final int DIRECTION_HORIZONTAL = 2;
    public static final int DIRECTION_VERTICAL = 1;
    public static final int MODE_GRID = 2;
    public static final int MODE_LIST = 1;
    public static final int MODE_WATERFALL = 3;
    public e.e.a.o.i.b adapter;
    public int bottomSpacing;
    @JsProperty
    public boolean bounces;
    public int column = 2;
    public int direction = 1;
    public e.e.a.o.k.a hummerFooter;
    public e.e.a.o.k.b hummerHeader;
    public e.e.a.x.b instanceManager;
    public boolean isLoadingMore;
    public boolean isScrollStarted = false;
    public int itemSpacing;
    public RecyclerView.m layoutManager;
    public int leftSpacing;
    public int lineSpacing;
    @JsProperty
    public e.e.a.q.b.a loadMoreCallback;
    @JsProperty
    public j loadMoreView;
    public RecyclerView.q mOnScrollListener = new a();
    public int mode = 1;
    @JsProperty
    public e.e.a.q.b.a onCreate;
    @JsProperty
    public e.e.a.q.b.a onRegister;
    @JsProperty
    public e.e.a.q.b.a onUpdate;
    public RecyclerView recyclerView;
    @JsProperty
    public e.e.a.q.b.a refreshCallback;
    public e.i.a.a.a.a refreshLayout;
    @JsProperty
    public j refreshView;
    public int rightSpacing;
    public e.e.a.y.b.d.b scrollEvent = new e.e.a.y.b.d.b();
    @JsProperty
    public boolean showScrollBar;
    public int topSpacing;

    public class b implements b.a {
        public b() {
        }

        @Override // e.e.a.o.k.b.a
        public void a() {
            if (List.this.refreshCallback != null) {
                List.this.refreshCallback.a(2);
            }
        }

        @Override // e.e.a.o.k.b.a
        public void b() {
            if (List.this.refreshCallback != null) {
                List.this.refreshCallback.a(0);
            }
        }

        @Override // e.e.a.o.k.b.a
        public void c() {
            if (List.this.refreshCallback != null) {
                List.this.refreshCallback.a(1);
            }
        }
    }

    public class c implements a.AbstractC0135a {
        public c() {
        }

        @Override // e.e.a.o.k.a.AbstractC0135a
        public void a() {
            List.this.isLoadingMore = true;
            if (List.this.loadMoreCallback != null) {
                List.this.loadMoreCallback.a(1);
            }
        }

        @Override // e.e.a.o.k.a.AbstractC0135a
        public void b() {
            List.this.isLoadingMore = false;
        }

        @Override // e.e.a.o.k.a.AbstractC0135a
        public void c() {
        }
    }

    public List(e.e.a.p.b bVar, e.e.a.q.b.c cVar, String str) {
        super(bVar, cVar, str);
        this.instanceManager = bVar.f4445f;
    }

    private void bindRecyclerViewIfNeed() {
        if (this.layoutManager == null) {
            initRecyclerLayoutManager();
            if (this.leftSpacing > 0 || this.rightSpacing > 0 || this.topSpacing > 0 || this.bottomSpacing > 0) {
                this.recyclerView.setPadding(this.leftSpacing, this.topSpacing, this.rightSpacing, this.bottomSpacing);
                this.recyclerView.setClipToPadding(false);
            }
            int i = this.direction;
            if (i == 1) {
                this.recyclerView.setVerticalScrollBarEnabled(this.showScrollBar);
            } else if (i == 2) {
                this.recyclerView.setHorizontalScrollBarEnabled(this.showScrollBar);
            }
            this.recyclerView.setAdapter(this.adapter);
        }
    }

    private void initRecyclerLayoutManager() {
        RecyclerView.l lVar;
        RecyclerView recyclerView2;
        LinearLayoutManager linearLayoutManager;
        int i = this.mode;
        if (i != 2) {
            if (i != 3) {
                if (this.direction == 2) {
                    getContext();
                    linearLayoutManager = new LinearLayoutManager(0, false);
                } else {
                    getContext();
                    linearLayoutManager = new LinearLayoutManager(1, false);
                }
                this.layoutManager = linearLayoutManager;
                int i2 = this.lineSpacing;
                if (i2 > 0) {
                    this.recyclerView.a(new e.e.a.o.i.h.b(i2, false));
                }
            } else {
                this.layoutManager = this.direction == 2 ? new StaggeredGridLayoutManager(this.column, 0) : new StaggeredGridLayoutManager(this.column, 1);
                if (this.lineSpacing > 0 || this.itemSpacing > 0) {
                    recyclerView2 = this.recyclerView;
                    lVar = new e.e.a.o.i.h.c(this.column, this.lineSpacing, this.itemSpacing, false);
                }
            }
            this.recyclerView.setLayoutManager(this.layoutManager);
        }
        this.layoutManager = this.direction == 2 ? new GridLayoutManager(getContext(), this.column, 0, false) : new GridLayoutManager(getContext(), this.column, 1, false);
        if (this.lineSpacing > 0 || this.itemSpacing > 0) {
            recyclerView2 = this.recyclerView;
            lVar = new e.e.a.o.i.h.a(this.column, this.lineSpacing, this.itemSpacing, false);
        }
        this.recyclerView.setLayoutManager(this.layoutManager);
        recyclerView2.a(lVar);
        this.recyclerView.setLayoutManager(this.layoutManager);
    }

    @Override // e.e.a.y.a.b.j
    public e.i.a.a.a.a createViewInstance(Context context) {
        RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(e.e.a.o.c.recycler_view, (ViewGroup) null, false);
        this.recyclerView = recyclerView2;
        recyclerView2.setOverScrollMode(2);
        this.recyclerView.setClipChildren(false);
        this.recyclerView.setOnTouchListener(new e.e.a.o.i.a(context));
        e.i.a.a.a.a aVar = new e.i.a.a.a.a(context);
        this.refreshLayout = aVar;
        aVar.D = false;
        aVar.c(false);
        e.i.a.a.a.a aVar2 = this.refreshLayout;
        aVar2.M = true;
        aVar2.a(this.recyclerView);
        this.hummerHeader = new e.e.a.o.k.b(context);
        this.hummerFooter = new e.e.a.o.k.a(context);
        this.refreshLayout.a((d) this.hummerHeader);
        this.refreshLayout.a((e.i.a.a.a.b.c) this.hummerFooter);
        this.hummerHeader.setOnRefreshListener(new b());
        this.hummerFooter.setOnLoadListener(new c());
        return this.refreshLayout;
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        this.recyclerView.a(this.mOnScrollListener);
        this.adapter = new e.e.a.o.i.b(getContext(), this.instanceManager);
        YogaNode a2 = l.f.a();
        a2.setData(this.recyclerView);
        a2.setFlexGrow(1.0f);
        getYogaNode().setMeasureFunction(null);
        getYogaNode().addChildAt(a2, 0);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onDestroy() {
        super.onDestroy();
        e.e.a.o.i.b bVar = this.adapter;
        if (bVar != null) {
            e.e.a.q.b.a aVar = bVar.f4388e;
            if (aVar != null) {
                aVar.d();
            }
            e.e.a.q.b.a aVar2 = bVar.f4389f;
            if (aVar2 != null) {
                aVar2.d();
            }
            e.e.a.q.b.a aVar3 = bVar.f4390g;
            if (aVar3 != null) {
                aVar3.d();
            }
        }
    }

    @JsMethod
    public void refresh(int i) {
        this.refreshLayout.d(false);
        e.e.a.o.i.b bVar = this.adapter;
        if (bVar != null) {
            boolean z = this.isLoadingMore;
            int i2 = bVar.f4387d;
            bVar.f4387d = i;
            if (!z || i <= i2) {
                bVar.f2461a.a();
            } else {
                bVar.f2461a.a(i2, i - i2);
            }
        }
        this.isLoadingMore = false;
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        setMode("list");
        setScrollDirection("vertical");
        setColumn(2);
        setShowScrollBar(false);
    }

    @JsMethod
    public void scrollBy(Object obj, Object obj2) {
        this.recyclerView.scrollBy((int) e.e.a.y.c.c.b(obj), (int) e.e.a.y.c.c.b(obj2));
    }

    @JsMethod
    public void scrollTo(Object obj, Object obj2) {
        this.recyclerView.scrollTo((int) e.e.a.y.c.c.b(obj), (int) e.e.a.y.c.c.b(obj2));
    }

    @JsMethod
    public void scrollToPosition(int i) {
        this.recyclerView.d(i);
    }

    @JsAttribute
    public void setBottomSpacing(int i) {
        this.bottomSpacing = i;
    }

    public void setBounces(boolean z) {
        this.refreshLayout.M = z;
    }

    @JsAttribute
    public void setColumn(int i) {
        this.column = i;
    }

    @JsAttribute
    public void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    @JsAttribute
    public void setLeftSpacing(int i) {
        this.leftSpacing = i;
    }

    @JsAttribute
    public void setLineSpacing(int i) {
        this.lineSpacing = i;
    }

    public void setLoadMoreView(j jVar) {
        this.refreshLayout.c(true);
        this.hummerFooter.a(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    @com.didi.hummer.annotation.JsAttribute
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setMode(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -213632750(0xfffffffff3443912, float:-1.5546382E31)
            r2 = 3
            r3 = 2
            if (r0 == r1) goto L_0x002a
            r1 = 3181382(0x308b46, float:4.458066E-39)
            if (r0 == r1) goto L_0x0020
            r1 = 3322014(0x32b09e, float:4.655133E-39)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "list"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 0
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "grid"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "waterfall"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0034
            r5 = 3
            goto L_0x0035
        L_0x0034:
            r5 = -1
        L_0x0035:
            if (r5 == r3) goto L_0x005e
            if (r5 == r2) goto L_0x003d
            r5 = 1
            r4.mode = r5
            goto L_0x0060
        L_0x003d:
            r4.mode = r2
            int r5 = r4.lineSpacing
            r0 = 1090519040(0x41000000, float:8.0)
            if (r5 > 0) goto L_0x004f
            android.content.Context r5 = r4.getContext()
            int r5 = e.c.a.b.l.f.a(r5, r0)
            r4.lineSpacing = r5
        L_0x004f:
            int r5 = r4.itemSpacing
            if (r5 > 0) goto L_0x0060
            android.content.Context r5 = r4.getContext()
            int r5 = e.c.a.b.l.f.a(r5, r0)
            r4.itemSpacing = r5
            goto L_0x0060
        L_0x005e:
            r4.mode = r3
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.component.list.List.setMode(java.lang.String):void");
    }

    public void setOnCreate(e.e.a.q.b.a aVar) {
        this.adapter.f4389f = aVar;
    }

    public void setOnLoadMore(e.e.a.q.b.a aVar) {
        this.loadMoreCallback = aVar;
    }

    public void setOnRefresh(e.e.a.q.b.a aVar) {
        this.refreshCallback = aVar;
    }

    public void setOnRegister(e.e.a.q.b.a aVar) {
        this.adapter.f4388e = aVar;
    }

    public void setOnUpdate(e.e.a.q.b.a aVar) {
        this.adapter.f4390g = aVar;
    }

    public void setRefreshView(j jVar) {
        this.refreshLayout.D = true;
        this.hummerHeader.a(jVar);
    }

    @JsAttribute
    public void setRightSpacing(int i) {
        this.rightSpacing = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    @com.didi.hummer.annotation.JsAttribute
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrollDirection(java.lang.String r4) {
        /*
            r3 = this;
            int r0 = r4.hashCode()
            r1 = -1984141450(0xffffffff89bc6776, float:-4.5356648E-33)
            r2 = 2
            if (r0 == r1) goto L_0x001a
            r1 = 1387629604(0x52b58c24, float:3.89870125E11)
            if (r0 == r1) goto L_0x0010
            goto L_0x0024
        L_0x0010:
            java.lang.String r0 = "horizontal"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 2
            goto L_0x0025
        L_0x001a:
            java.lang.String r0 = "vertical"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 0
            goto L_0x0025
        L_0x0024:
            r4 = -1
        L_0x0025:
            if (r4 == r2) goto L_0x002b
            r4 = 1
            r3.direction = r4
            goto L_0x002d
        L_0x002b:
            r3.direction = r2
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.component.list.List.setScrollDirection(java.lang.String):void");
    }

    public void setShowScrollBar(boolean z) {
        this.showScrollBar = z;
        int i = this.direction;
        if (i == 1) {
            this.recyclerView.setVerticalScrollBarEnabled(z);
        } else if (i == 2) {
            this.recyclerView.setHorizontalScrollBarEnabled(z);
        }
    }

    @Override // e.e.a.y.a.b.j
    public void setStyle(Map map) {
        super.setStyle(map);
        bindRecyclerViewIfNeed();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -1625116241:
                if (str.equals("lineSpacing")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3357091:
                if (str.equals("mode")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 26501767:
                if (str.equals("rightSpacing")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1022176152:
                if (str.equals("bottomSpacing")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1108022844:
                if (str.equals("leftSpacing")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1489010990:
                if (str.equals("topSpacing")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1614714674:
                if (str.equals("scrollDirection")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1748891056:
                if (str.equals(ViewPager.STYLE_ITEM_SPACING)) {
                    c2 = 4;
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
                setMode(String.valueOf(obj));
                break;
            case 1:
                setScrollDirection(String.valueOf(obj));
                break;
            case 2:
                setColumn((int) ((Float) obj).floatValue());
                break;
            case 3:
                setLineSpacing((int) ((Float) obj).floatValue());
                break;
            case 4:
                setItemSpacing((int) ((Float) obj).floatValue());
                break;
            case 5:
                setLeftSpacing((int) ((Float) obj).floatValue());
                break;
            case 6:
                setRightSpacing((int) ((Float) obj).floatValue());
                break;
            case 7:
                setTopSpacing((int) ((Float) obj).floatValue());
                break;
            case '\b':
                setBottomSpacing((int) ((Float) obj).floatValue());
                break;
            default:
                return false;
        }
        return true;
    }

    @JsAttribute
    public void setTopSpacing(int i) {
        this.topSpacing = i;
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
        this.isLoadingMore = false;
    }

    @JsMethod
    public void stopPullRefresh() {
        this.refreshLayout.a(30);
    }

    public class a extends RecyclerView.q {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            e.e.a.y.b.a aVar;
            if (List.this.mEventManager.f4594a.containsKey("scroll")) {
                if (i == 0) {
                    List.this.isScrollStarted = false;
                    if (List.this.scrollEvent != null) {
                        List.this.scrollEvent.f4595c = 3;
                        if (List.this.scrollEvent == null) {
                            throw null;
                        } else if (List.this.scrollEvent == null) {
                            throw null;
                        } else if (List.this.scrollEvent == null) {
                            throw null;
                        } else if (List.this.scrollEvent != null) {
                            e.e.a.y.b.d.b bVar = List.this.scrollEvent;
                            System.currentTimeMillis();
                            if (bVar != null) {
                                aVar = List.this.mEventManager;
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else if (i == 1) {
                    List.this.isScrollStarted = true;
                    if (List.this.scrollEvent != null) {
                        List.this.scrollEvent.f4595c = 1;
                        if (List.this.scrollEvent == null) {
                            throw null;
                        } else if (List.this.scrollEvent == null) {
                            throw null;
                        } else if (List.this.scrollEvent == null) {
                            throw null;
                        } else if (List.this.scrollEvent != null) {
                            e.e.a.y.b.d.b bVar2 = List.this.scrollEvent;
                            System.currentTimeMillis();
                            if (bVar2 != null) {
                                aVar = List.this.mEventManager;
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else if (i == 2) {
                    if (List.this.scrollEvent != null) {
                        List.this.scrollEvent.f4595c = 4;
                        e.e.a.y.b.d.b bVar3 = List.this.scrollEvent;
                        System.currentTimeMillis();
                        if (bVar3 != null) {
                            aVar = List.this.mEventManager;
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } else {
                    return;
                }
                aVar.a("scroll", List.this.scrollEvent);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i, int i2) {
            if (List.this.mEventManager.f4594a.containsKey("scroll") && List.this.isScrollStarted) {
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                if (List.this.scrollEvent != null) {
                    List.this.scrollEvent.f4595c = 2;
                    e.e.a.y.b.d.b bVar = List.this.scrollEvent;
                    l.f.c(List.this.getContext(), (float) computeHorizontalScrollOffset);
                    if (bVar != null) {
                        e.e.a.y.b.d.b bVar2 = List.this.scrollEvent;
                        l.f.c(List.this.getContext(), (float) computeVerticalScrollOffset);
                        if (bVar2 != null) {
                            e.e.a.y.b.d.b bVar3 = List.this.scrollEvent;
                            l.f.c(List.this.getContext(), (float) i);
                            if (bVar3 != null) {
                                e.e.a.y.b.d.b bVar4 = List.this.scrollEvent;
                                l.f.c(List.this.getContext(), (float) i2);
                                if (bVar4 != null) {
                                    e.e.a.y.b.d.b bVar5 = List.this.scrollEvent;
                                    System.currentTimeMillis();
                                    if (bVar5 != null) {
                                        List.this.mEventManager.a("scroll", List.this.scrollEvent);
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
    }
}
