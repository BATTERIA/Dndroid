package d.j.d;

import android.transition.Transition;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

public final class d0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3420c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ p0 f3421d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f3422e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f3423f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3424g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3425h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ Object j;

    public d0(Object obj, p0 p0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f3420c = obj;
        this.f3421d = p0Var;
        this.f3422e = view;
        this.f3423f = fragment;
        this.f3424g = arrayList;
        this.f3425h = arrayList2;
        this.i = arrayList3;
        this.j = obj2;
    }

    public void run() {
        Object obj = this.f3420c;
        if (obj != null) {
            p0 p0Var = this.f3421d;
            View view = this.f3422e;
            if (((j0) p0Var) != null) {
                if (obj != null) {
                    ((Transition) obj).removeTarget(view);
                }
                this.f3425h.addAll(g0.a(this.f3421d, this.f3420c, this.f3423f, this.f3424g, this.f3422e));
            } else {
                throw null;
            }
        }
        if (this.i != null) {
            if (this.j != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f3422e);
                this.f3421d.a(this.j, this.i, arrayList);
            }
            this.i.clear();
            this.i.add(this.f3422e);
        }
    }
}
