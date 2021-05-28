package e.e.a.y.a.b;

import android.content.Context;
import com.didi.hummer.render.style.HummerLayout;
import com.facebook.yoga.YogaFlexDirection;
import e.e.a.p.b;
import java.util.ArrayList;
import java.util.List;

public class l extends j<HummerLayout> {

    /* renamed from: a  reason: collision with root package name */
    public List<j> f4593a = new ArrayList();

    public l(b bVar) {
        super(bVar, null, null);
        onCreate();
    }

    public boolean a() {
        return this.f4593a.size() == 0;
    }

    public void b(j jVar) {
        ((HummerLayout) getView()).a(jVar, -1);
        ((HummerLayout) getView()).setClipChildren(true);
        this.f4593a.add(jVar);
    }

    public void c(j jVar) {
        ((HummerLayout) getView()).a(jVar);
        this.f4593a.remove(jVar);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // e.e.a.y.a.b.j
    public HummerLayout createViewInstance(Context context) {
        return new HummerLayout(context);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        ((HummerLayout) getView()).setClipChildren(false);
        getYogaNode().setFlexDirection(YogaFlexDirection.ROW);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onDestroy() {
        super.onDestroy();
        if (getView() != null) {
            ((HummerLayout) getView()).removeAllViews();
        }
    }
}
