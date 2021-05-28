package e.j.a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.zhpan.bannerview.view.CatchViewPager;
import e.j.a.f.b;
import e.j.a.h.c;
import e.j.a.h.d;
import java.util.ArrayList;
import java.util.List;

public class a<T, VH extends e.j.a.f.b> extends RelativeLayout implements ViewPager.i {

    /* renamed from: c  reason: collision with root package name */
    public int f4921c;

    /* renamed from: d  reason: collision with root package name */
    public b f4922d;

    /* renamed from: e  reason: collision with root package name */
    public e.j.a.g.b f4923e;

    /* renamed from: f  reason: collision with root package name */
    public RelativeLayout f4924f;

    /* renamed from: g  reason: collision with root package name */
    public CatchViewPager f4925g;

    /* renamed from: h  reason: collision with root package name */
    public e.j.a.h.b f4926h;
    public e.j.a.f.a<VH> i;
    public Handler j = new Handler();
    public Runnable k = new RunnableC0149a();
    public int l;
    public int m;
    public e.j.a.e.b<T, VH> n;
    public ViewPager.i o;

    /* renamed from: e.j.a.a$a  reason: collision with other inner class name */
    public class RunnableC0149a implements Runnable {
        public RunnableC0149a() {
        }

        public void run() {
            a.a(a.this);
        }
    }

    public interface b {
        void a(int i);
    }

    public a(Context context) {
        super(context, null, 0);
        e.j.a.h.b bVar = new e.j.a.h.b();
        this.f4926h = bVar;
        if (bVar.b != null) {
            RelativeLayout.inflate(getContext(), d.bvp_layout, this);
            this.f4925g = (CatchViewPager) findViewById(c.vp_main);
            this.f4924f = (RelativeLayout) findViewById(c.bvp_layout_indicator);
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(a aVar) {
        if (aVar.n.d() > 1) {
            int currentItem = aVar.f4925g.getCurrentItem() + 1;
            aVar.f4921c = currentItem;
            aVar.f4925g.setCurrentItem(currentItem);
            aVar.j.postDelayed(aVar.k, (long) aVar.getInterval());
        }
    }

    private int getInterval() {
        return this.f4926h.a().f4949a;
    }

    private void setIndicatorValues(List<T> list) {
        c a2 = this.f4926h.a();
        d dVar = a2.l;
        dVar.j = 0;
        dVar.k = 0.0f;
        a(new e.j.a.g.c(getContext()));
        this.f4923e.setIndicatorOptions(a2.l);
        a2.l.f4957c = list.size();
        this.f4923e.a();
    }

    private void setLooping(boolean z) {
        this.f4926h.a().b = z;
    }

    private void setupViewPager(List<T> list) {
        e.j.a.f.a<VH> aVar = this.i;
        if (aVar != null) {
            this.f4921c = 0;
            CatchViewPager catchViewPager = this.f4925g;
            e.j.a.e.b<T, VH> bVar = new e.j.a.e.b<>(list, aVar);
            this.n = bVar;
            bVar.f4933e = b();
            this.n.f4934f = new b(this);
            catchViewPager.setAdapter(this.n);
            if (list.size() > 1 && b()) {
                this.f4925g.setCurrentItem((250 - (250 % list.size())) + 1);
            }
            List<ViewPager.i> list2 = this.f4925g.T;
            if (list2 != null) {
                list2.remove(this);
            }
            CatchViewPager catchViewPager2 = this.f4925g;
            if (catchViewPager2.T == null) {
                catchViewPager2.T = new ArrayList();
            }
            catchViewPager2.T.add(this);
            this.f4925g.setScrollDuration(this.f4926h.a().j);
            CatchViewPager catchViewPager3 = this.f4925g;
            catchViewPager3.m0 = false;
            catchViewPager3.setFirstLayout(true);
            CatchViewPager catchViewPager4 = this.f4925g;
            if (this.f4926h.a() != null) {
                catchViewPager4.setOffscreenPageLimit(0);
                int i2 = this.f4926h.a().f4955h;
                if (i2 == 2) {
                    a(false, 0.999f);
                } else if (i2 == 4) {
                    a(true, 0.85f);
                } else if (i2 == 8) {
                    a(false, 0.85f);
                }
                c();
                return;
            }
            throw null;
        }
        throw new NullPointerException("You must set HolderCreator for BannerViewPager");
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i2) {
        e.j.a.g.b bVar = this.f4923e;
        if (bVar != null) {
            bVar.a(i2);
        }
        ViewPager.i iVar = this.o;
        if (iVar != null) {
            iVar.a(i2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void a(int i2, float f2, int i3) {
        int d2 = this.n.d();
        int a2 = e.j.a.k.a.a(b(), i2, d2);
        if (d2 > 0) {
            ViewPager.i iVar = this.o;
            if (iVar != null) {
                iVar.a(a2, f2, i3);
            }
            e.j.a.g.b bVar = this.f4923e;
            if (bVar != null) {
                bVar.a(a2, f2, i3);
            }
        }
    }

    public final boolean b() {
        return this.f4926h.a().f4950c;
    }

    public void c() {
        e.j.a.e.b<T, VH> bVar;
        if (!this.f4926h.a().b && this.f4926h.a().f4951d && (bVar = this.n) != null && bVar.d() > 1) {
            this.j.postDelayed(this.k, (long) getInterval());
            setLooping(true);
        }
    }

    public void d() {
        if (this.f4926h.a().b) {
            this.j.removeCallbacks(this.k);
            setLooping(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if ((r0 - r7.l) > 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if ((r0 - r7.l) < 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        if ((r5 * 2) < r4) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: e.j.a.a.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public int getCurrentItem() {
        return this.f4921c;
    }

    public List<T> getList() {
        return this.n.f4931c;
    }

    @Deprecated
    public ViewPager getViewPager() {
        return this.f4925g;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    public void onDetachedFromWindow() {
        d();
        super.onDetachedFromWindow();
    }

    public void setCurrentItem(int i2) {
        if (!b() || this.n.d() <= 1) {
            this.f4925g.setCurrentItem(i2);
        } else {
            this.f4925g.setCurrentItem((250 - (250 % this.n.d())) + 1 + i2);
        }
    }

    public void setPageTransformer(ViewPager.j jVar) {
        this.f4925g.a(true, jVar);
    }

    public void a(List<T> list) {
        if (list != null) {
            setIndicatorValues(list);
            setupViewPager(list);
            int i2 = this.f4926h.a().k;
            if (i2 > 0 && Build.VERSION.SDK_INT >= 21) {
                setClipToOutline(true);
                setOutlineProvider(new e.j.a.i.b((float) i2));
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void b(int i2) {
        int d2 = this.n.d();
        this.f4921c = e.j.a.k.a.a(b(), i2, d2);
        if ((d2 > 0 && b() && i2 == 0) || i2 == 499) {
            int i3 = this.f4921c;
            if (!b() || this.n.d() <= 1) {
                CatchViewPager catchViewPager = this.f4925g;
                catchViewPager.x = false;
                catchViewPager.a(i3, false, false);
            } else {
                this.f4925g.a((250 - (250 % this.n.d())) + 1 + i3, false);
            }
        }
        ViewPager.i iVar = this.o;
        if (iVar != null) {
            iVar.b(this.f4921c);
        }
        e.j.a.g.b bVar = this.f4923e;
        if (bVar != null) {
            bVar.b(this.f4921c);
        }
    }

    public a<T, VH> b(boolean z) {
        this.f4926h.a().f4950c = z;
        if (!z) {
            this.f4926h.a().f4951d = false;
        }
        return this;
    }

    public final void a(e.j.a.g.b bVar) {
        int i2;
        this.f4924f.setVisibility(this.f4926h.a().i);
        this.f4923e = bVar;
        if (((View) bVar).getParent() == null) {
            this.f4924f.removeAllViews();
            this.f4924f.addView((View) this.f4923e);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) this.f4923e).getLayoutParams();
            if (this.f4926h.a() != null) {
                int a2 = e.j.a.k.a.a(10.0f);
                marginLayoutParams.setMargins(a2, a2, a2, a2);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f4923e).getLayoutParams();
                int i3 = this.f4926h.a().f4952e;
                if (i3 == 0) {
                    i2 = 14;
                } else if (i3 == 2) {
                    i2 = 9;
                } else if (i3 == 4) {
                    i2 = 11;
                } else {
                    return;
                }
                layoutParams.addRule(i2);
                return;
            }
            throw null;
        }
    }

    public a<T, VH> a(boolean z) {
        this.f4926h.a().f4951d = z;
        if (this.f4926h.a().f4951d) {
            this.f4926h.a().f4950c = true;
        }
        return this;
    }

    public final void a(boolean z, float f2) {
        setClipChildren(false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4925g.getLayoutParams();
        c a2 = this.f4926h.a();
        int i2 = a2.f4953f + a2.f4954g;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.rightMargin = i2;
        this.f4925g.setOverlapStyle(z);
        this.f4925g.setPageMargin(z ? -a2.f4953f : a2.f4953f);
        this.f4925g.setOffscreenPageLimit(Math.max(0, 2));
        setPageTransformer(new e.j.a.j.a(f2));
    }
}
