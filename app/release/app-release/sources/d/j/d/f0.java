package d.j.d;

import android.graphics.Rect;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import d.d.a;
import d.j.d.g0;
import java.util.ArrayList;

public final class f0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p0 f3437c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a f3438d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3439e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g0.b f3440f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3441g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ View f3442h;
    public final /* synthetic */ Fragment i;
    public final /* synthetic */ Fragment j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ ArrayList l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Rect n;

    public f0(p0 p0Var, a aVar, Object obj, g0.b bVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f3437c = p0Var;
        this.f3438d = aVar;
        this.f3439e = obj;
        this.f3440f = bVar;
        this.f3441g = arrayList;
        this.f3442h = view;
        this.i = fragment;
        this.j = fragment2;
        this.k = z;
        this.l = arrayList2;
        this.m = obj2;
        this.n = rect;
    }

    public void run() {
        a<String, View> a2 = g0.a(this.f3437c, this.f3438d, this.f3439e, this.f3440f);
        if (a2 != null) {
            this.f3441g.addAll(a2.values());
            this.f3441g.add(this.f3442h);
        }
        g0.a(this.i, this.j, this.k, a2, false);
        Object obj = this.f3439e;
        if (obj != null) {
            p0 p0Var = this.f3437c;
            ArrayList<View> arrayList = this.l;
            ArrayList<View> arrayList2 = this.f3441g;
            j0 j0Var = (j0) p0Var;
            if (j0Var != null) {
                TransitionSet transitionSet = (TransitionSet) obj;
                transitionSet.getTargets().clear();
                transitionSet.getTargets().addAll(arrayList2);
                j0Var.a(transitionSet, arrayList, arrayList2);
                View a3 = g0.a(a2, this.f3440f, this.m, this.k);
                if (a3 != null) {
                    this.f3437c.a(a3, this.n);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
