package e.d.a.q.g;

import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import e.d.a.q.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class j<T extends View, Z> extends a<Z> {
    public final T b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4259c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final View f4260a;
        public final List<h> b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public ViewTreeObserver$OnPreDrawListenerC0131a f4261c;

        /* renamed from: d  reason: collision with root package name */
        public Point f4262d;

        /* renamed from: e.d.a.q.g.j$a$a  reason: collision with other inner class name */
        public static class ViewTreeObserver$OnPreDrawListenerC0131a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: c  reason: collision with root package name */
            public final WeakReference<a> f4263c;

            public ViewTreeObserver$OnPreDrawListenerC0131a(a aVar) {
                this.f4263c = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called listener=" + this);
                }
                a aVar = this.f4263c.get();
                if (aVar == null || aVar.b.isEmpty()) {
                    return true;
                }
                int b = aVar.b();
                int a2 = aVar.a();
                if (!aVar.a(b) || !aVar.a(a2)) {
                    return true;
                }
                for (h hVar : aVar.b) {
                    hVar.a(b, a2);
                }
                aVar.b.clear();
                ViewTreeObserver viewTreeObserver = aVar.f4260a.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(aVar.f4261c);
                }
                aVar.f4261c = null;
                return true;
            }
        }

        public a(View view) {
            this.f4260a = view;
        }

        public final int a() {
            ViewGroup.LayoutParams layoutParams = this.f4260a.getLayoutParams();
            if (a(this.f4260a.getHeight())) {
                return this.f4260a.getHeight();
            }
            if (layoutParams != null) {
                return a(layoutParams.height, true);
            }
            return 0;
        }

        public final int a(int i, boolean z) {
            if (i != -2) {
                return i;
            }
            Point point = this.f4262d;
            if (point == null) {
                Display defaultDisplay = ((WindowManager) this.f4260a.getContext().getSystemService("window")).getDefaultDisplay();
                Point point2 = new Point();
                this.f4262d = point2;
                defaultDisplay.getSize(point2);
                point = this.f4262d;
            }
            return z ? point.y : point.x;
        }

        public final boolean a(int i) {
            return i > 0 || i == -2;
        }

        public final int b() {
            ViewGroup.LayoutParams layoutParams = this.f4260a.getLayoutParams();
            if (a(this.f4260a.getWidth())) {
                return this.f4260a.getWidth();
            }
            if (layoutParams != null) {
                return a(layoutParams.width, false);
            }
            return 0;
        }
    }

    public j(T t) {
        if (t != null) {
            this.b = t;
            this.f4259c = new a(t);
            return;
        }
        throw new NullPointerException("View must not be null!");
    }

    @Override // e.d.a.q.g.a
    public void a(h hVar) {
        a aVar = this.f4259c;
        int b2 = aVar.b();
        int a2 = aVar.a();
        if (!aVar.a(b2) || !aVar.a(a2)) {
            if (!aVar.b.contains(hVar)) {
                aVar.b.add(hVar);
            }
            if (aVar.f4261c == null) {
                ViewTreeObserver viewTreeObserver = aVar.f4260a.getViewTreeObserver();
                a.ViewTreeObserver$OnPreDrawListenerC0131a aVar2 = new a.ViewTreeObserver$OnPreDrawListenerC0131a(aVar);
                aVar.f4261c = aVar2;
                viewTreeObserver.addOnPreDrawListener(aVar2);
                return;
            }
            return;
        }
        hVar.a(b2, a2);
    }

    @Override // e.d.a.q.g.a
    public b c() {
        Object tag = this.b.getTag();
        if (tag == null) {
            return null;
        }
        if (tag instanceof b) {
            return (b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public String toString() {
        StringBuilder a2 = e.a.a.a.a.a("Target for: ");
        a2.append(this.b);
        return a2.toString();
    }

    @Override // e.d.a.q.g.a
    public void a(b bVar) {
        this.b.setTag(bVar);
    }
}
