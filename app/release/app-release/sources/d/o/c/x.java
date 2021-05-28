package d.o.c;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import d.g.l.z.b;

public class x extends d.g.l.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f3667d;

    /* renamed from: e  reason: collision with root package name */
    public final d.g.l.a f3668e = new a(this);

    public x(RecyclerView recyclerView) {
        this.f3667d = recyclerView;
    }

    @Override // d.g.l.a
    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3331a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(RecyclerView.class.getName());
        if ((view instanceof RecyclerView) && !a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    public boolean a() {
        return this.f3667d.l();
    }

    @Override // d.g.l.a
    public void a(View view, b bVar) {
        this.f3331a.onInitializeAccessibilityNodeInfo(view, bVar.f3365a);
        bVar.f3365a.setClassName(RecyclerView.class.getName());
        if (!a() && this.f3667d.getLayoutManager() != null) {
            RecyclerView.m layoutManager = this.f3667d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.b;
            RecyclerView.s sVar = recyclerView.f2446d;
            RecyclerView.x xVar = recyclerView.i0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.b.canScrollHorizontally(-1)) {
                bVar.f3365a.addAction(8192);
                bVar.f3365a.setScrollable(true);
            }
            if (layoutManager.b.canScrollVertically(1) || layoutManager.b.canScrollHorizontally(1)) {
                bVar.f3365a.addAction(4096);
                bVar.f3365a.setScrollable(true);
            }
            int b = layoutManager.b(sVar, xVar);
            int a2 = layoutManager.a(sVar, xVar);
            bVar.f3365a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) (Build.VERSION.SDK_INT >= 21 ? new b.C0105b(AccessibilityNodeInfo.CollectionInfo.obtain(b, a2, false, 0)) : new b.C0105b(AccessibilityNodeInfo.CollectionInfo.obtain(b, a2, false))).f3369a);
        }
    }

    public static class a extends d.g.l.a {

        /* renamed from: d  reason: collision with root package name */
        public final x f3669d;

        public a(x xVar) {
            this.f3669d = xVar;
        }

        @Override // d.g.l.a
        public void a(View view, b bVar) {
            this.f3331a.onInitializeAccessibilityNodeInfo(view, bVar.f3365a);
            if (!this.f3669d.a() && this.f3669d.f3667d.getLayoutManager() != null) {
                this.f3669d.f3667d.getLayoutManager().a(view, bVar);
            }
        }

        @Override // d.g.l.a
        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (!this.f3669d.a() && this.f3669d.f3667d.getLayoutManager() != null) {
                RecyclerView.s sVar = this.f3669d.f3667d.getLayoutManager().b.f2446d;
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[ADDED_TO_REGION] */
    @Override // d.g.l.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 144
        */
        throw new UnsupportedOperationException("Method not decompiled: d.o.c.x.a(android.view.View, int, android.os.Bundle):boolean");
    }
}
