package e.e.a.y.a.b;

import android.content.Context;
import android.view.View;
import e.e.a.p.b;

public class i extends j<View> {
    public i(b bVar) {
        super(bVar, null, null);
        super.onCreate();
        getYogaNode().setWidth(0.0f);
        getYogaNode().setHeight(0.0f);
    }

    @Override // e.e.a.y.a.b.j
    public View createViewInstance(Context context) {
        return new View(context);
    }

    @Override // e.e.a.y.a.b.j, e.e.a.u.b
    public void onCreate() {
        super.onCreate();
        getYogaNode().setWidth(0.0f);
        getYogaNode().setHeight(0.0f);
    }
}
