package e.e.a.y.c;

import android.text.TextUtils;
import android.view.View;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.android.YogaLayout;
import e.a.a.a.a;
import e.c.a.b.l;
import e.e.a.y.a.b.j;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public j f4609a;
    public String b;

    /* renamed from: c  reason: collision with root package name */
    public YogaNode f4610c;

    /* renamed from: d  reason: collision with root package name */
    public List<b> f4611d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, Object> f4612e = new HashMap();

    public b(j jVar, String str) {
        YogaNode yogaNode;
        this.f4609a = jVar;
        if (TextUtils.isEmpty(str)) {
            StringBuilder a2 = a.a("hm_node_");
            a2.append(System.currentTimeMillis());
            str = a2.toString();
        }
        this.b = str;
        View view = jVar.getView();
        if (view instanceof YogaLayout) {
            yogaNode = ((YogaLayout) view).getYogaNode();
        } else {
            YogaNode a3 = l.f.a();
            a3.setData(view);
            a3.setMeasureFunction(new YogaLayout.ViewMeasureFunction());
            yogaNode = a3;
        }
        this.f4610c = yogaNode;
    }
}
