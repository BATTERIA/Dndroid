package com.didi.hummer.component.viewpager;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.didi.hummer.annotation.Component;
import com.didi.hummer.annotation.JsAttribute;
import com.didi.hummer.annotation.JsMethod;
import com.didi.hummer.annotation.JsProperty;
import e.e.a.o.q.d;
import e.e.a.o.q.f;
import e.e.a.y.a.b.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class ViewPager extends j<e.j.a.a<Object, e.j.a.f.b>> implements e.e.a.u.a {
    public static final String STYLE_ALPHA_FACTOR = "alphaFactor";
    public static final String STYLE_AUTO_PLAY = "autoPlay";
    public static final String STYLE_CAN_LOOP = "canLoop";
    public static final String STYLE_EDGE_SPACING = "edgeSpacing";
    public static final String STYLE_ITEM_SPACING = "itemSpacing";
    public static final String STYLE_LOOP_INTERVAL = "loopInterval";
    public static final String STYLE_SCALE_FACTOR = "scaleFactor";
    public d adapter;
    public float alphaFactor = 0.5f;
    public boolean autoPlay;
    public boolean canLoop;
    public int cornerRadius;
    public float edgeSpacing;
    public float itemSpacing;
    public int loopInterval;
    @JsProperty
    public List<Object> mData = new ArrayList();
    public e.e.a.q.b.a mOnItemClickListener;
    public e.e.a.q.b.a mOnItemViewCallback;
    public e.e.a.q.b.a mOnPageChangeListener;
    public e.e.a.q.b.a mOnPageScrollListener;
    public e.e.a.q.b.a mOnPageScrollStateChangeListener;
    public float scaleFactor = 0.85f;

    public class a implements ViewPager.i {
        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
            if (ViewPager.this.mOnPageScrollStateChangeListener != null) {
                ViewPager.this.mOnPageScrollStateChangeListener.a(Integer.valueOf(i));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i, float f2, int i2) {
            if (ViewPager.this.mOnPageScrollListener != null) {
                if (((double) f2) >= 0.5d) {
                    i++;
                }
                ViewPager.this.mOnPageScrollListener.a(Integer.valueOf(i), Float.valueOf(f2));
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void b(int i) {
            if (ViewPager.this.mOnPageChangeListener != null) {
                ViewPager.this.mOnPageChangeListener.a(Integer.valueOf(i), Integer.valueOf(ViewPager.this.mData.size()));
            }
        }
    }

    public class b extends e.j.a.a<Object, e.j.a.f.b> {
        public int p;
        public int q;

        public b(Context context) {
            super(context);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
            if ((r0 - r7.p) <= 0) goto L_0x0061;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
            if ((r0 - r7.p) >= 0) goto L_0x009d;
         */
        @Override // e.j.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 177
            */
            throw new UnsupportedOperationException("Method not decompiled: com.didi.hummer.component.viewpager.ViewPager.b.dispatchTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public class c implements e.j.a.f.b<Object> {
        public c(ViewPager viewPager) {
        }
    }

    public ViewPager(e.e.a.p.b bVar, e.e.a.q.b.c cVar) {
        super(bVar, cVar, null);
        e.e.a.y.c.c.a(STYLE_LOOP_INTERVAL);
        e.e.a.y.c.c.a(STYLE_SCALE_FACTOR);
        e.e.a.y.c.c.a(STYLE_ALPHA_FACTOR);
        d dVar = new d(bVar, bVar.f4445f);
        this.adapter = dVar;
        dVar.f4435h = new e.e.a.o.q.c(this);
        e.j.a.a aVar = (e.j.a.a) getView();
        aVar.f4926h.a().j = 1000;
        aVar.b(false);
        aVar.f4926h.a().i = 8;
        aVar.i = new e.e.a.o.q.b(this);
        aVar.o = new a();
    }

    private void initPageStyle() {
        e.j.a.a aVar = (e.j.a.a) getView();
        boolean z = false;
        aVar.f4926h.a().f4955h = this.edgeSpacing > 0.0f ? 2 : 0;
        int i = (int) this.itemSpacing;
        aVar.f4926h.a().f4953f = i;
        aVar.f4925g.setPageMargin(i);
        aVar.f4926h.a().f4954g = (int) (this.edgeSpacing - this.itemSpacing);
        aVar.b(this.canLoop);
        if (this.autoPlay && this.loopInterval > 0) {
            z = true;
        }
        aVar.a(z);
        aVar.f4926h.a().f4949a = this.loopInterval;
        aVar.f4926h.a().k = this.cornerRadius;
        if (!this.autoPlay || this.loopInterval <= 0) {
            ((e.j.a.a) getView()).d();
        }
        this.adapter.f4434g = this.canLoop;
    }

    public /* synthetic */ e.j.a.f.b a() {
        return new c(this);
    }

    public /* synthetic */ void a(int i) {
        int a2 = this.adapter.a(((e.j.a.a) getView()).getViewPager().getCurrentItem());
        if (i == a2) {
            e.e.a.q.b.a aVar = this.mOnItemClickListener;
            if (aVar != null) {
                aVar.a(Integer.valueOf(i));
            }
        } else if (i == a2 - 1 || i == a2 + 1) {
            setCurrentItem(i);
        }
    }

    @Override // e.e.a.y.a.b.j
    public e.j.a.a<Object, e.j.a.f.b> createViewInstance(Context context) {
        return new b(context);
    }

    @JsMethod
    public void onItemClick(e.e.a.q.b.a aVar) {
        this.mOnItemClickListener = aVar;
    }

    @JsMethod
    public void onItemView(e.e.a.q.b.a aVar) {
        this.mOnItemViewCallback = aVar;
        this.adapter.i = aVar;
    }

    @JsMethod
    public void onPageChange(e.e.a.q.b.a aVar) {
        this.mOnPageChangeListener = aVar;
    }

    @JsMethod
    public void onPageScroll(e.e.a.q.b.a aVar) {
        this.mOnPageScrollListener = aVar;
    }

    @JsMethod
    public void onPageScrollStateChange(e.e.a.q.b.a aVar) {
        this.mOnPageScrollStateChangeListener = aVar;
    }

    @Override // e.e.a.u.a
    public void onPause() {
        ((e.j.a.a) getView()).d();
    }

    @Override // e.e.a.u.a
    public void onResume() {
        ((e.j.a.a) getView()).c();
    }

    public void onStart() {
    }

    public void onStop() {
    }

    @Override // e.e.a.y.a.b.j
    public void resetStyle() {
        super.resetStyle();
        e.j.a.a aVar = (e.j.a.a) getView();
        aVar.f4926h.a().f4955h = 0;
        aVar.f4926h.a().f4953f = 0;
        aVar.f4925g.setPageMargin(0);
        aVar.f4926h.a().f4954g = 0;
        aVar.b(false);
        aVar.a(false);
        aVar.f4926h.a().f4949a = 0;
        aVar.f4926h.a().k = 0;
        aVar.setPageTransformer(null);
        this.adapter.f4434g = false;
    }

    @JsAttribute
    public void setAlphaFactor(float f2) {
        this.alphaFactor = f2;
    }

    @JsAttribute
    public void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public void setBorderRadius(float f2) {
        this.cornerRadius = (int) f2;
    }

    @JsAttribute
    public void setCanLoop(boolean z) {
        this.canLoop = z;
    }

    @JsMethod
    public void setCurrentItem(int i) {
        if (i >= 0 && this.adapter.d() > 0) {
            ((e.j.a.a) getView()).setCurrentItem(Math.min(i, this.adapter.d() - 1));
        }
    }

    public void setData(List<Object> list) {
        if (list == null) {
            if (this.mData != null) {
                list = new ArrayList<>();
            } else {
                return;
            }
        }
        if (list.isEmpty() || (list.get(0) instanceof String) || this.mOnItemViewCallback != null) {
            this.mData = list;
            ((e.j.a.a) getView()).a(list);
            if (this.edgeSpacing > 0.0f) {
                if (this.scaleFactor > 0.0f || this.alphaFactor > 0.0f) {
                    ((e.j.a.a) getView()).setPageTransformer(new f(this.scaleFactor, this.alphaFactor));
                } else {
                    ((e.j.a.a) getView()).setPageTransformer(null);
                }
            }
            d dVar = this.adapter;
            if (dVar != null) {
                ArrayList arrayList = new ArrayList();
                dVar.f4433f = arrayList;
                arrayList.addAll(list);
                dVar.b();
                ((e.j.a.a) getView()).getViewPager().setAdapter(this.adapter);
                setCurrentItem(0);
                return;
            }
            throw null;
        }
        throw new RuntimeException("please set onItemView callback first");
    }

    @JsAttribute
    public void setEdgeSpacing(float f2) {
        this.edgeSpacing = f2;
    }

    @JsAttribute
    public void setItemSpacing(float f2) {
        this.itemSpacing = f2;
    }

    @JsAttribute
    public void setLoopInterval(int i) {
        this.loopInterval = i;
    }

    @JsAttribute
    public void setScaleFactor(float f2) {
        this.scaleFactor = f2;
    }

    @Override // e.e.a.y.a.b.j
    public void setStyle(Map map) {
        super.setStyle(map);
        initPageStyle();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // e.e.a.y.a.b.j
    public boolean setStyle(String str, Object obj) {
        char c2;
        switch (str.hashCode()) {
            case -1210167495:
                if (str.equals(STYLE_SCALE_FACTOR)) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1181511738:
                if (str.equals(STYLE_EDGE_SPACING)) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1111610487:
                if (str.equals(STYLE_LOOP_INTERVAL)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 323197005:
                if (str.equals(STYLE_ALPHA_FACTOR)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 549540500:
                if (str.equals(STYLE_CAN_LOOP)) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1438608771:
                if (str.equals(STYLE_AUTO_PLAY)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1748891056:
                if (str.equals(STYLE_ITEM_SPACING)) {
                    c2 = 0;
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
                setItemSpacing(((Float) obj).floatValue());
                break;
            case 1:
                setEdgeSpacing(((Float) obj).floatValue());
                break;
            case 2:
                setCanLoop(((Boolean) obj).booleanValue());
                break;
            case 3:
                setAutoPlay(((Boolean) obj).booleanValue());
                break;
            case 4:
                setLoopInterval((int) ((Float) obj).floatValue());
                break;
            case 5:
                setScaleFactor(((Float) obj).floatValue());
                break;
            case 6:
                setAlphaFactor(((Float) obj).floatValue());
                break;
            case 7:
                if (obj instanceof Float) {
                    setBorderRadius(((Float) obj).floatValue());
                    break;
                }
                break;
            default:
                return false;
        }
        return true;
    }
}
